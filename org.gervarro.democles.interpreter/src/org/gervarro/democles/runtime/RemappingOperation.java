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

import java.util.List;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.DataFrame;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.event.MatchEvent;

public class RemappingOperation extends Operation implements OperationRuntime {
	private AdornedOperation input;
	private List<VariableRuntime> parameters;
	private Object origin;
	
	public final void setInput(AdornedOperation input) {
		this.input = input;
	}

	public Adornment getPrecondition() {
		return input.getPrecondition();
	}

	public Adornment getPostcondition() {
		return input.getPostcondition();
	}
	
	public void execute(DataFrame oldFrame, Operation dataSource, String eventType) {
		// TODO Delete operation
		sendEvent(oldFrame, eventType);
	}
	
	public Object getOrigin() {
		return origin;
	}

	public void setOrigin(Object origin) {
		this.origin = origin;
	}
	
	public String toString() {
		final Adornment precondition = getPrecondition();
		StringBuilder result = new StringBuilder();
		result.append(origin != null ? origin.toString() : "");
		result.append("^");
		result.append(precondition != null ? precondition.toString() : "");
		return result.toString();
	}

	public List<VariableRuntime> getParameters() {
		return parameters;
	}
	
	public void setParameters(List<VariableRuntime> parameters) {
		this.parameters = parameters;
	}
	
	InternalDataFrameProvider getDataFrameProvider(DataFrame data) {
		if (data instanceof PatternBodyDataFrame) {
			RemappedDataFrame newFrame = new RemappedDataFrame(this, (PatternBodyDataFrame) data);
			return input.getDataFrame(newFrame);
		} else {
			return null;
		}
	}
	
	public void handleEvent(MatchEvent event) {
		DataFrame frame = event.getMatching();
		int size = getParameters().size();
		if (frame.size() != size) {
			throw new RuntimeException();
		}
		try {
			// Re-map the data frame and pass it forward
			PatternBodyDataFrame newFrame = factory.createDataFrame(null);
			for (int i = 0; i < size; i++) {
				newFrame.internalSet(i, frame.getValue(i));
				// TODO newFrame.internalSet(getParameters().get(i).getIndex(), frame.getValue(i));
			}
			sendEvent(newFrame, event.getEventType());
		} catch (ClassCastException cce) {
			
		} catch (IndexOutOfBoundsException ioobe) {
			
		}
	}

}
