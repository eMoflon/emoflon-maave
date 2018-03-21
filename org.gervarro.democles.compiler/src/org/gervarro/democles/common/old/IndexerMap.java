/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.gervarro.democles.common.old;

import java.util.Arrays;

public class IndexerMap<K, V> {
	transient int elementCount;
	transient Entry<K, V>[] elementData;
	private static final int DEFAULT_SIZE = 16;
	final float loadFactor;
	int threshold;

	static class Entry<K, V> extends MapEntry<K, V> {
		final int origKeyHash;

		Entry<K, V> next;

		Entry(K theKey, int hash) {
			super(theKey, null);
			this.origKeyHash = hash;
		}

		Entry(K theKey, V theValue) {
			super(theKey, theValue);
			origKeyHash = (theKey == null ? 0 : computeHashCode(theKey));
		}
	}

	/**
	 * Create a new element array
	 *
	 * @param s
	 * @return Reference to the element array
	 */
	@SuppressWarnings("unchecked")
	private static <K, V> Entry<K, V>[] newElementArray(int s) {
		return new Entry[s];
	}

	/**
	 * Constructs a new empty {@code HashMap} instance.
	 */
	public IndexerMap() {
		this(DEFAULT_SIZE);
	}

	/**
	 * Constructs a new {@code HashMap} instance with the specified capacity.
	 *
	 * @param capacity
	 *            the initial capacity of this hash map.
	 * @throws IllegalArgumentException
	 *             when the capacity is less than zero.
	 */
	public IndexerMap(int capacity) {
		this(capacity, 0.75f); // default load factor of 0.75
	}

	/**
	 * Calculates the capacity of storage required for storing given number of
	 * elements
	 * 
	 * @param x
	 *            number of elements
	 * @return storage size
	 */
	private static final int calculateCapacity(int x) {
		if (x >= 1 << 30) {
			return 1 << 30;
		}
		if (x == 0) {
			return 16;
		}
		x = x - 1;
		x |= x >> 1;
		x |= x >> 2;
		x |= x >> 4;
		x |= x >> 8;
		x |= x >> 16;
		return x + 1;
	}

	/**
	 * Constructs a new {@code HashMap} instance with the specified capacity and
	 * load factor.
	 *
	 * @param capacity
	 *            the initial capacity of this hash map.
	 * @param loadFactor
	 *            the initial load factor.
	 * @throws IllegalArgumentException
	 *             when the capacity is less than zero or the load factor is less or
	 *             equal to zero.
	 */
	public IndexerMap(int capacity, float loadFactor) {
		if (capacity >= 0 && loadFactor > 0) {
			capacity = calculateCapacity(capacity);
			elementCount = 0;
			elementData = newElementArray(capacity);
			this.loadFactor = loadFactor;
			computeThreshold();
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Removes all mappings from this hash map, leaving it empty.
	 *
	 * @see #isEmpty
	 * @see #size
	 */
	public void clear() {
		if (elementCount > 0) {
			elementCount = 0;
			Arrays.fill(elementData, null);
		}
	}

	/**
	 * Computes the threshold for rehashing
	 */
	private void computeThreshold() {
		threshold = (int) (elementData.length * loadFactor);
	}

	/**
	 * Returns whether this map contains the specified key.
	 *
	 * @param key
	 *            the key to search for.
	 * @return {@code true} if this map contains the specified key, {@code false}
	 *         otherwise.
	 */
	public boolean containsKey(Object key) {
		Entry<K, V> m = getEntry(key);
		return m != null;
	}

	/**
	 * Returns whether this map contains the specified value.
	 *
	 * @param value
	 *            the value to search for.
	 * @return {@code true} if this map contains the specified value, {@code false}
	 *         otherwise.
	 */
	public synchronized boolean containsValue(Object value) {
		if (value != null) {
			for (int i = 0; i < elementData.length; i++) {
				Entry<K, V> entry = elementData[i];
				while (entry != null) {
					if (areEqualValues(value, entry.value)) {
						return true;
					}
					entry = entry.next;
				}
			}
		} else {
			for (int i = 0; i < elementData.length; i++) {
				Entry<K, V> entry = elementData[i];
				while (entry != null) {
					if (entry.value == null) {
						return true;
					}
					entry = entry.next;
				}
			}
		}
		return false;
	}

	/**
	 * Returns the value of the mapping with the specified key.
	 *
	 * @param key
	 *            the key.
	 * @return the value of the mapping with the specified key, or {@code null} if
	 *         no mapping for the specified key is found.
	 */
	public V get(Object key) {
		Entry<K, V> m = getEntry(key);
		if (m != null) {
			return m.value;
		}
		return null;
	}

	private final Entry<K, V> getEntry(Object key) {
		if (key == null) {
			return findNullKeyEntry();
		} else {
			int hash = computeHashCode(key);
			int index = hash & (elementData.length - 1);
			return findNonNullKeyEntry(key, index, hash);
		}
	}

	private synchronized final Entry<K, V> findNonNullKeyEntry(Object key, int index, int keyHash) {
		Entry<K, V> m = elementData[index];
		while (m != null && (m.origKeyHash != keyHash || !areEqualKeys(key, m.key))) {
			m = m.next;
		}
		return m;
	}

	private synchronized final Entry<K, V> findNullKeyEntry() {
		Entry<K, V> m = elementData[0];
		while (m != null && m.key != null)
			m = m.next;
		return m;
	}

	public boolean isEmpty() {
		return elementCount == 0;
	}

	public synchronized V put(K key, V value) {
		Entry<K, V> entry;
		if (key == null) {
			entry = findNullKeyEntry();
			if (entry == null) {
				entry = createHashedEntry(null, 0, 0);
				if (++elementCount > threshold) {
					rehash();
				}
			}
		} else {
			int hash = computeHashCode(key);
			int index = hash & (elementData.length - 1);
			entry = findNonNullKeyEntry(key, index, hash);
			if (entry == null) {
				entry = createHashedEntry(key, index, hash);
				if (++elementCount > threshold) {
					rehash();
				}
			}
		}

		V result = entry.value;
		entry.value = value;
		return result;
	}

	/*
	 * private final Entry<K, V> createEntry(K key, int index, V value) { Entry<K,
	 * V> entry = new Entry<K, V>(key, value); entry.next = elementData[index];
	 * elementData[index] = entry; return entry; }
	 */

	private final Entry<K, V> createHashedEntry(K key, int index, int hash) {
		Entry<K, V> entry = new Entry<K, V>(key, hash);
		entry.next = elementData[index];
		elementData[index] = entry;
		return entry;
	}

	void rehash(int capacity) {
		int length = calculateCapacity((capacity == 0 ? 1 : capacity << 1));

		Entry<K, V>[] newData = newElementArray(length);
		for (int i = 0; i < elementData.length; i++) {
			Entry<K, V> entry = elementData[i];
			elementData[i] = null;
			while (entry != null) {
				int index = entry.origKeyHash & (length - 1);
				Entry<K, V> next = entry.next;
				entry.next = newData[index];
				newData[index] = entry;
				entry = next;
			}
		}
		elementData = newData;
		computeThreshold();
	}

	void rehash() {
		rehash(elementData.length);
	}

	public V remove(Object key) {
		Entry<K, V> entry = removeEntry(key);
		if (entry != null) {
			return entry.value;
		}
		return null;
	}

	/*
	 * private final void removeEntry(Entry<K, V> entry) { int index =
	 * entry.origKeyHash & (elementData.length - 1); Entry<K, V> m =
	 * elementData[index]; if (m == entry) { elementData[index] = entry.next; } else
	 * { while (m.next != entry) { m = m.next; } m.next = entry.next;
	 * 
	 * } elementCount--; }
	 */

	private synchronized final Entry<K, V> removeEntry(Object key) {
		int index = 0;
		Entry<K, V> entry;
		Entry<K, V> last = null;
		if (key != null) {
			int hash = computeHashCode(key);
			index = hash & (elementData.length - 1);
			entry = elementData[index];
			while (entry != null && !(entry.origKeyHash == hash && areEqualKeys(key, entry.key))) {
				last = entry;
				entry = entry.next;
			}
		} else {
			entry = elementData[0];
			while (entry != null && entry.key != null) {
				last = entry;
				entry = entry.next;
			}
		}
		if (entry == null) {
			return null;
		}
		if (last == null) {
			elementData[index] = entry.next;
		} else {
			last.next = entry.next;
		}
		elementCount--;
		return entry;
	}

	public int size() {
		return elementCount;
	}

	static int computeHashCode(Object key) {
		return key.hashCode();
	}

	static boolean areEqualKeys(Object key1, Object key2) {
		return (key1 == key2) || key1.equals(key2);
	}

	static boolean areEqualValues(Object value1, Object value2) {
		return (value1 == value2) || value1.equals(value2);
	}

}
