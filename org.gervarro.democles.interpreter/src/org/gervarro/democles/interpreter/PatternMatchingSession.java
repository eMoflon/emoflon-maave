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
package org.gervarro.democles.interpreter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.event.MatchEventListener;
import org.gervarro.democles.runtime.InterpretedDataFrame;
import org.gervarro.democles.runtime.MagicSet;
import org.gervarro.democles.runtime.Scheduler;
import org.gervarro.democles.runtime.Task;

public abstract class PatternMatchingSession implements MatchEventListener, Iterator<Task> {
	protected Pattern pattern;
	protected final ArrayList<Task> tasks = new ArrayList<Task>();

	protected MagicSet init(Adornment adornment) {
		MagicSet ms = pattern.getMagicSet(adornment);
		if (ms == null) {
			ms = pattern.createMagicSet(adornment);
			for (PatternBody body : pattern.getBodies()) {
				body.getSearchPlan(adornment);
			}
		}
		return ms;
	}

	public final void insertTask(Task task, Comparator<Task> comparator) {
		int index = Collections.binarySearch(tasks, task, comparator);
		if (index < 0) {
			tasks.add(-index - 1, task);
		} else {
			throw new RuntimeException("Unable to add task.");
		}
	}

	protected final void performPatternMatching(InterpretedDataFrame input, Adornment adornment) {
		assert pattern.getSymbolicParameters().size() == input.size();
		// Initialization
		MagicSet ms = init(adornment);
		Scheduler scheduler = pattern.getEngine().getScheduler();
		scheduler.addSession(this);
		pattern.addEventListener(this);

		// Perform pattern matching
		ms.submitDataFrame(input);
		scheduler.run();

		// Cleanup
		pattern.removeEventListener(this);
		scheduler.removeSession(this);
	}

	public boolean hasNext() {
		return !tasks.isEmpty();
	}

	public Task next() {
		if (hasNext()) {
			return tasks.remove(0);
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
