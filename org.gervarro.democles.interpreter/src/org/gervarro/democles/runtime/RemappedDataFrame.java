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

public class RemappedDataFrame extends DataFrame implements InternalDataFrameProvider {
	private PatternBodyDataFrame frame;
	private RemappingOperation operation;

	public RemappedDataFrame(RemappingOperation operation, PatternBodyDataFrame frame) {
		this.operation = operation;
		this.frame = frame;
	}

	public PatternBodyDataFrame getDataFrame() {
		return frame;
	}

	public RemappingOperation getOperation() {
		return operation;
	}

	public final Object internalGet(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("No such variable: " + index);
		}
		return frame.internalGet(operation.getParameters().get(index).getIndex());
	}

	public final void internalSet(int index, Object value) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("No such variable: " + index);
		}
		frame.internalSet(operation.getParameters().get(index).getIndex(), value);
	}

	public final int internalSize() {
		return frame.internalSize();
	}

	public final int size() {
		return operation.getParameters().size();
	}
}
