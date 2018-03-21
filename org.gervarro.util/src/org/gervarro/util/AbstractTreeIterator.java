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
import java.util.NoSuchElementException;
import java.util.Stack;

public abstract class AbstractTreeIterator<E> implements Iterator<E> {
	public static final boolean PREORDER = false;
	public static final boolean POSTORDER = true;

	private boolean isPostorder;
	protected final Stack<E> objectStack = new Stack<E>();
	protected final Stack<Iterator<E>> iteratorStack = new Stack<Iterator<E>>();

	public AbstractTreeIterator(E root) {
		this(root, POSTORDER);
	}

	public AbstractTreeIterator(E root, boolean order) {
		this.isPostorder = order;
		objectStack.push(root);
		if (isPostorder) {
			iteratorStack.push(getChildren(root));
			step();
		}
	}

	protected abstract Iterator<E> getChildren(E object);

	public boolean hasNext() {
		return !objectStack.empty() && objectStack.peek() != null;
	}

	public E next() {
		if (hasNext()) {
			E result = objectStack.pop();
			if (!isPostorder) {
				iteratorStack.push(getChildren(result));
			}
			step();
			return result;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	private void step() {
		if (isPostorder) {
			// Tasks for postorder traversal
			Iterator<E> i = iteratorStack.empty() ? null : iteratorStack.pop();
			while (i != null && i.hasNext()) {
				E next = i.next();
				iteratorStack.push(i);
				objectStack.push(next);
				i = getChildren(next);
			}
		} else {
			// Tasks for preorder traversal
			while (!iteratorStack.empty()) {
				Iterator<E> i = iteratorStack.peek();
				if (i != null && i.hasNext()) {
					objectStack.push(i.next());
					return;
				} else {
					iteratorStack.pop();
				}
			}
		}
	}
}
