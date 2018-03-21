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

import org.gervarro.democles.common.DataFrame;

public class InterpretedDataFrame extends DataFrame {
	private final Object[] tuple;

	public InterpretedDataFrame(int size) {
		this.tuple = new Object[size];
	}

	public InterpretedDataFrame(InterpretedDataFrame original) {
		this(original.tuple.length);
		System.arraycopy(original.tuple, 0, this.tuple, 0, original.tuple.length);
	}

	public final int size() {
		return getPublicSize();
	}

	public final int internalSize() {
		return tuple.length;
	}

	public final Object internalGet(int index) {
		int diff = index - internalSize();
		return diff < 0 ? tuple[index] : handleFrameExternalGet(diff);
	}

	public final void internalSet(int index, Object value) {
		tuple[index] = value;
	}

	int getPublicSize() {
		return tuple.length;
	}

	Object handleFrameExternalGet(int index) {
		throw new IndexOutOfBoundsException("No such variable: " + index);
	}
}
