/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010-2012  Gergely Varro
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

import org.gervarro.democles.common.DataFrame;

abstract public class IteratorBasedHandler<E, I extends Iterator<E>>
		implements Iterator<DataFrame>, InternalDataFrameProvider {
	protected final RemappedDataFrame frame;
	protected final I iterator;

	public IteratorBasedHandler(RemappedDataFrame frame, I iterator) {
		this.frame = frame;
		this.iterator = iterator;
	}

	public final boolean hasNext() {
		return iterator.hasNext();
	}

	public final DataFrame next() {
		if (hasNext()) {
			return getNextFrame();
		} else {
			throw new NoSuchElementException();
		}
	}

	public final void remove() {
		throw new UnsupportedOperationException();
	}

	public final PatternBodyDataFrame getDataFrame() {
		return frame.getDataFrame();
	}

	protected final RemappedDataFrame createDataFrame() {
		RemappingOperation ro = frame.getOperation();
		PatternBodyDataFrame oldDataFrame = frame.getDataFrame();
		PatternBodyDataFrame newDataFrame = ro.factory.createDataFrame(oldDataFrame);
		return oldDataFrame == newDataFrame ? frame : new RemappedDataFrame(ro, newDataFrame);
	}

	abstract protected DataFrame getNextFrame();
}
