/*
 * Copyright (C) 2012  Gergely Varro
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
package org.gervarro.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class TraversalIterator<E> implements Iterator<E> {
	public static final boolean DEPTH_FIRST_SEARCH = true;
	public static final boolean BREADTH_FIRST_SEARCH = false;
	protected static final Iterator<?> EMPTY_ITERATOR = new Iterator<Object>() {
		public boolean hasNext() {
			return false;
		}

		public Object next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	};
	private final boolean dfs;
	private E nextResult;
	private LinkedList<Iterator<E>> iterators = new LinkedList<Iterator<E>>();

	@SuppressWarnings("unchecked")
	protected static final <E> Iterator<E> emptyIterator() {
		return (Iterator<E>) EMPTY_ITERATOR;
	}

	@SuppressWarnings("unchecked")
	public TraversalIterator(Iterable<E> iterable, final boolean dfs) {
		this(iterable != null ? iterable.iterator() : (Iterator<E>) emptyIterator(), dfs);
	}

	public TraversalIterator(final Iterator<E> iterator, final boolean dfs) {
		this.dfs = dfs;
		if (iterator != null && iterator.hasNext()) {
			this.nextResult = iterator.next();
			if (iterator.hasNext()) {
				if (dfs) {
					iterators.addFirst(iterator);
				} else {
					iterators.addLast(iterator);
				}
			}
		} else {
			this.nextResult = null;
		}
	}

	public TraversalIterator(final E root, final boolean dfs, final boolean includeRoot) {
		this.dfs = dfs;
		this.nextResult = root;
		Iterator<E> iterator = getIterator(nextResult);
		if (iterator.hasNext()) {
			if (dfs) {
				iterators.addFirst(iterator);
			} else {
				iterators.addLast(iterator);
			}
		}
		if (!includeRoot && hasNext()) {
			next();
		}
	}

	public boolean hasNext() {
		return nextResult != null;
	}

	public E next() {
		if (hasNext()) {
			E result = nextResult;
			while (!iterators.isEmpty()) {
				Iterator<E> currentIterator = iterators.getFirst();
				if (currentIterator.hasNext()) {
					nextResult = currentIterator.next();
					Iterator<E> nextIterator = getIterator(nextResult);
					if (nextIterator.hasNext()) {
						if (dfs) {
							iterators.addFirst(nextIterator);
						} else {
							iterators.addLast(nextIterator);
						}
					}
					return result;
				} else {
					iterators.removeFirst();
				}
			}
			nextResult = null;
			return result;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	protected Iterator<E> getIterator(E element) {
		return (Iterator<E>) EMPTY_ITERATOR;
	}
}
