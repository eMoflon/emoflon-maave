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

import java.util.LinkedList;

import org.gervarro.democles.interpreter.PatternMatchingSession;

public class Scheduler {
	private SchedulingStrategy strategy =
		new DepthFirstTraversalStrategy();
	private final LinkedList<PatternMatchingSession> activeSessions =
		new LinkedList<PatternMatchingSession>();

	public void addSession(PatternMatchingSession session) {
		activeSessions.addFirst(session);
	}
	
	public void removeSession(PatternMatchingSession session) {
		int index = activeSessions.indexOf(session);
		activeSessions.remove(index);
	}
	
	public void schedule(Task task) {
		if (!activeSessions.isEmpty()) {
			activeSessions.getFirst().insertTask(task, strategy);
		}
	}
	
	public void run() {
		if (!activeSessions.isEmpty()) {
			PatternMatchingSession session = activeSessions.getFirst();
			while (session.hasNext()) {
				session.next().perform();
			}
		}
	}
	
	public final SchedulingStrategy getSchedulingStrategy() {
		return strategy;
	}
}
