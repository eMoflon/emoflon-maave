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

import java.util.List;

import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.common.runtime.PatternMatcherBuilder;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.plan.combiner.InterpreterCombiner;
import org.gervarro.democles.runtime.RemappingOperation;
import org.gervarro.democles.runtime.Scheduler;
import org.gervarro.democles.specification.impl.Constant;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.Variable;

public class PatternMatcherModule extends
		PatternMatcherBuilder<Pattern, PatternBody, RemappingOperation, VariableRuntime, OperationBuilder<RemappingOperation, VariableRuntime>, InterpreterCombiner> {
	private Scheduler scheduler;

	public PatternMatcherModule() {
		addOperationBuilder(this);
	}

	public final Scheduler getScheduler() {
		return scheduler;
	}

	public final void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	protected final Pattern createPattern(String name, List<? extends Variable> symbolicParameters) {
		return new Pattern(this, name, symbolicParameters);
	}

	protected final void setBodies(Pattern pattern, List<PatternBody> bodies) {
		pattern.setBodies(bodies);
	}

	protected final PatternBody createPatternBody(List<Variable> localVariables, List<Constant> constants,
			List<Constraint> constraints) {
		if (constants.size() > 0) {
			// TODO Add constant support
			throw new RuntimeException("Constants are not yet supported in the interpreter");
		}
		return new PatternBody(localVariables, constraints);
	}

	protected final VariableRuntime createVariableRuntime(ConstraintVariable variable, int index) {
		return new VariableRuntime(index);
	}

	@Override
	public List<RemappingOperation> getConstraintOperations(Constraint constraint, List<VariableRuntime> parameters) {
		// TODO Auto-generated method stub
		return null;
	}
}
