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

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.event.MatchEvent;
import org.gervarro.democles.event.MatchEventListener;
import org.gervarro.democles.interpreter.InterpretableOperation;

public class DelegatingAdornedOperation extends AdornedOperation implements MatchEventListener {
	private final InterpretableOperation delegate;

	public DelegatingAdornedOperation(InterpretableOperation delegate, Adornment precondition,
			Adornment postcondition) {
		super(precondition, postcondition);
		this.delegate = delegate;
	}

	@Override
	public InternalDataFrameProvider getDataFrame(RemappedDataFrame frame, Adornment adornment) {
		return delegate.getDataFrame(frame, adornment);
	}

	@Override
	public void handleEvent(MatchEvent event) {
		sendEvent(event.getMatching(), event.getEventType());
	}
}
