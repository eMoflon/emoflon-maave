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
 */
package org.gervarro.democles.runtime;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ChainIterator<E extends Chain<V>, V> implements Iterator<V> {
	private E head;
	private E last = null;
	
	ChainIterator(final E head) {
		this.head = head;
	}

	@Override
	public boolean hasNext() {
		return head.next != null;
	}

	@Override
	public V next() {
		if (hasNext()) {
			last = head;
			head = head.getNext();
			return last.value;
		} else {
			throw new NoSuchElementException();
		}
	}
	
	@Override
	public void remove() {
		if (last != null) {
			last.next = head.next;
			head = last;
			last = null;
		} else {
			throw new IllegalStateException();
		}
	}
}
