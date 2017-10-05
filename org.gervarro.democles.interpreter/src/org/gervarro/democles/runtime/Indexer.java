/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 * 		Frederik Deckwerth <frederik.deckwerth@es.tu-darmstadt.de>
 */
package org.gervarro.democles.runtime;

import java.util.Arrays;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.DataFrame;
import org.gervarro.democles.common.MurmurHash;
import org.gervarro.democles.event.MatchEvent;
import org.gervarro.democles.event.MatchEventListener;
import org.gervarro.democles.event.MatchEventSource;
import org.gervarro.democles.interpreter.InterpretableOperation;

public class Indexer extends MatchEventSource implements MatchEventListener,InterpretableOperation {
	//private Adornment adornment;
	private final int[] indexedColumns;
	private Operation operation;
    private transient int elementCount;
    private transient Entry[] elementData;
    private static final int DEFAULT_SIZE = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private final float loadFactor;
    private int threshold;
    private IdentifierProvider identifierProvider;

    private class Entry extends Chain<Chain<DataFrame>> {
    	final int origKeyHash;

    	private Entry(final int hash) {
    		super(null);
    		this.origKeyHash = hash;
    	}
    }
    
    private static Entry[] newElementArray(int size) {
        return new Entry[size];
    }

    public Indexer(Adornment adornment,IdentifierProvider identifierProvider) {
    	this(DEFAULT_SIZE,adornment,identifierProvider);
    }

    public Indexer(int capacity,Adornment adornment,IdentifierProvider identifierProvider) {
    	this(capacity, DEFAULT_LOAD_FACTOR,adornment,identifierProvider);
    }
    
    public Indexer(int[] indexedColumns, IdentifierProvider identifierProvider) {
    	this.identifierProvider=identifierProvider;
    	elementCount = 0;
    	elementData = newElementArray(DEFAULT_SIZE);
    	this.loadFactor = DEFAULT_LOAD_FACTOR;
    	computeThreshold();
    	this.indexedColumns = new int[indexedColumns.length];
    	System.arraycopy(indexedColumns, 0, this.indexedColumns, 0, indexedColumns.length);
    }
    
    public Indexer(int capacity, float loadFactor,Adornment adornment,IdentifierProvider identifierProvider) {
    	this.identifierProvider=identifierProvider;
        if (capacity >= 0 && loadFactor > 0) {
            capacity = calculateCapacity(capacity);
            elementCount = 0;
            elementData = newElementArray(capacity);
            this.loadFactor = loadFactor;
            computeThreshold();

            indexedColumns = new int[adornment.cardinality()];
            
            
            for (int i = 0, j = 0; i < adornment.size(); i++) {
            	if (adornment.get(i) == Adornment.BOUND) {
            		indexedColumns[j++] = i;
            	}
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static final int calculateCapacity(int x) {
        if(x >= 1 << 30){
            return 1 << 30;
        }
        if(x == 0){
            return 16;
        }
        x = x -1;
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x |= x >> 8;
        x |= x >> 16;
        return x + 1;
    }

    public void clear() {
        if (elementCount > 0) {
            elementCount = 0;
            Arrays.fill(elementData, null);
        }
    }
    
    public final int[] getIndices() {
    	return indexedColumns;
    }
    
    public final String toString() {
    	return Arrays.toString(indexedColumns);
    }

    private void computeThreshold() {
        threshold = (int) (elementData.length * loadFactor);
    }

    public final Chain<DataFrame> get(DataFrame frame) {
        Entry m = getEntry(frame);
        return m != null ? m.value : null;
    }

    private final Entry getEntry(DataFrame frame) {
        int hash = computeHashCode(frame);
        int index = hash & (elementData.length - 1);
        return findKeyEntry(frame, index, hash);
    }

    private final Entry findKeyEntry(DataFrame frame, int index, int keyHash) {
        Entry m = elementData[index];
        while (m != null && (m.origKeyHash != keyHash || !areEqualKeys(frame, m.value.value))) { // only if keyhashs are equal the real keys have to be considered
            m = (Entry) m.next;
        }
        return m;
    }

    public final boolean isEmpty() {
        return elementCount == 0;
    }

    public final boolean add(DataFrame frame) {
    	// First chain
        int hash = computeHashCode(frame);
        int index = hash & (elementData.length - 1);
        Entry entry = findKeyEntry(frame, index, hash);
        if (entry == null) {
        	if (++elementCount > threshold) {
        		rehash();
        		index = hash & (elementData.length - 1);
        	}
            entry = new Entry(hash);
            entry.value = new Chain<DataFrame>(frame);
            entry.next = elementData[index];
            elementData[index] = entry;
            return true;
        }

        // Second chain
        Chain<DataFrame> chain = entry.value;
//        while (chain != null && !areEqualKeys(frame, chain.value)) {
//        	chain = chain.next;
//        }
//        if (chain == null) {
        	Chain<DataFrame> newChain = 
        		new Chain<DataFrame>(frame);
        	newChain.next = entry.value;
        	entry.value = newChain;
        	return true;
//        }
//		return false;
    }

    private void rehash(int capacity) {
        int length = calculateCapacity((capacity == 0 ? 1 : capacity << 1));

        Entry[] newData = newElementArray(length);
        for (int i = 0; i < elementData.length; i++) {
            Entry entry = elementData[i];
           // elementData[i] = null;
            while (entry != null) {
                int index = entry.origKeyHash & (length - 1);
                Entry next = (Entry) entry.next;
                entry.next = newData[index];
                newData[index] = entry;
                entry = next;
            }
        }
        elementData = newData;
        computeThreshold();
    }

    private void rehash() {
        rehash(elementData.length);
    }

	public final boolean remove(DataFrame frame) {
    	// First chain
    	int hash = computeHashCode(frame);
    	int index = hash & (elementData.length - 1);
    	Entry entry = elementData[index];
    	Entry last = null;
    	while (entry != null && !(entry.origKeyHash == hash && areEqualKeys(frame, entry.value.value))) {
    		last = entry;
    		entry = (Entry) entry.next;
    	}
    	if (entry == null) {
    		return false;
    	}
    	// Second chain
    	Chain<DataFrame> chainEntry = entry.value;
    	Chain<DataFrame> lastChainEntry = null;
    	while (chainEntry != null && !areEqualValues(frame, chainEntry.value)) {
    		lastChainEntry = chainEntry;
    		chainEntry = chainEntry.next;
    	}
    	if (chainEntry == null) {
    		return false;
    	}
    	if (lastChainEntry == null) {
    		entry.value = chainEntry.next;
    	} else {
    		lastChainEntry.next = chainEntry.next;
    	}

    	// First chain again
    	if (entry.value == null) {
    		if (last == null) {
    			elementData[index] = (Entry) entry.next;
    		} else {
    			last.next = entry.next;
    		}
    		elementCount--;
    	}
    	return true;
    }
	
    public int size() {
        return elementCount;
    }

    
    private String computeStringID(DataFrame frame){
    	StringBuffer id = new StringBuffer();
    	for (int i = 0; i < indexedColumns.length; i++) {
    		int index = indexedColumns[i];
    		String s=identifierProvider.getID(frame.getValue(index));
    		id.append(identifierProvider.getID(frame.getValue(index)));
    	}
    	return id.toString();
    }
    
    
    private int computeHashCode(DataFrame frame) {
		return MurmurHash.hash32(computeStringID(frame));
    }

    private boolean areEqualKeys(DataFrame frame1, DataFrame frame2) {
    	if (frame1 == frame2) {
    		return true;
    	}
    	for (int i = 0; i < indexedColumns.length; i++) {
    		String id1 = computeStringID(frame1);
    		String id2 = computeStringID(frame2);
    		if (id1 == null || !id1.equals(id2)) {
    			return false;
    		}
    	}
    	return true;
    }
    
    private boolean areEqualValues(DataFrame frame1, DataFrame frame2) {
        return (frame1 == frame2) || (frame1 != null && frame1.equals(frame2));
    }

	public void handleEvent(MatchEvent event) {
		if (MatchEvent.INSERT.equals(event.getEventType())) {
			add(event.getMatching());
		} else if (MatchEvent.DELETE.equals(event.getEventType())) {
			remove(event.getMatching());
		}
		sendEvent(event.getMatching(), event.getEventType());
	}

	@Override
	public InternalDataFrameProvider getDataFrame(RemappedDataFrame frame,
			Adornment adornment) {
		// TODO Auto-generated method stub
		return null;
	}
}
