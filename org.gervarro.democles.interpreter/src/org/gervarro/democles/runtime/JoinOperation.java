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
import org.gervarro.democles.event.MatchEvent;

public final class JoinOperation extends Operation {
	private Scheduler scheduler;
	private int depth;
	private final Operation leftOperation;
	private final Operation rightOperation;

	public JoinOperation(Operation left, Operation right) {
		this.leftOperation = left;
		this.rightOperation = right;
	}
	
	public Operation getLeftOperation() {
		return leftOperation;
	}

	public Operation getRightOperation() {
		return rightOperation;
	}
	
	final Scheduler getScheduler() {
		if (scheduler == null) {
			scheduler = factory.getHeader().getEngine().getScheduler();
		}
		return scheduler;
	}
	
	public final int getDepth() {
		return depth;
	}
	
	public final void setDepth(int depth) {
		this.depth = depth;
	}
	
	public void handleEvent(MatchEvent event) {
		EventHandlingTask task = new EventHandlingTask(event, this);
		getScheduler().schedule(task);
	}
	
	InternalDataFrameProvider getDataFrameProvider(DataFrame data) {
		return null;
	}
	
	public final void execute(DataFrame frame, Operation source, String eventType) {
		InternalDataFrameProvider provider = null;
		if (getLeftOperation() == source) {
			provider = getRightOperation().getDataFrameProvider(frame);
		} else if (getRightOperation() == source) {
			provider = getLeftOperation().getDataFrameProvider(frame);
		}
		if (provider instanceof IteratorBasedHandler<?,?>) {
			MultipleMatchExtensionTask task =
				new MultipleMatchExtensionTask(this, (IteratorBasedHandler<?,?>) provider);
			scheduler.schedule(task);
		} else if (provider != null) {
			sendEvent(provider.getDataFrame(), eventType);
		}
	}
	
//	private final boolean join(DataFrame deltaSideFrame, DataFrame fullSideFrame) {
//		if (deltaSideFrame == fullSideFrame) {
//			return true;
//		}
//		for (int i = 0; i < fullSideFrame.internalSize(); i++) {
//			if (deltaSideFrame.internalGet(i) != null) {
//				if (fullSideFrame.internalGet(i) == null) {
//					fullSideFrame.internalSet(i, deltaSideFrame.internalGet(i));
//				} else if (fullSideFrame.internalGet(i) != deltaSideFrame.internalGet(i)) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}

	final void internalSendEvent(final DataFrame data, final String eventType) {
		sendEvent(data, eventType);
	}
}
