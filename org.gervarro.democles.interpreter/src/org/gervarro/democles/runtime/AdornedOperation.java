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
import org.gervarro.democles.event.MatchEventSource;
import org.gervarro.democles.interpreter.InterpretableOperation;

abstract public class AdornedOperation extends MatchEventSource implements InterpretableOperation {
	protected static final Adornment BOUND_BOUND = new Adornment(new int[] { Adornment.BOUND, Adornment.BOUND });

	private final Adornment precondition;
	private final Adornment postcondition;

	protected AdornedOperation(final Adornment precondition, final Adornment postcondition) {
		this.precondition = precondition;
		this.postcondition = postcondition;
	}

	public final Adornment getPrecondition() {
		return precondition;
	}

	public final Adornment getPostcondition() {
		return postcondition;
	}

	public InternalDataFrameProvider getDataFrame(RemappedDataFrame frame) {
		return getDataFrame(frame, precondition);
	}
}
