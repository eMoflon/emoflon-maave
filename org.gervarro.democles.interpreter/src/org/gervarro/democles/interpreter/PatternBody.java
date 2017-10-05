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
package org.gervarro.democles.interpreter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.SearchPlanAlgorithm;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.event.MatchEvent;
import org.gervarro.democles.event.MatchEventListener;
import org.gervarro.democles.event.MatchEventSource;
import org.gervarro.democles.plan.combiner.InterpreterCombiner;
import org.gervarro.democles.plan.combiner.MagicSetCombiner;
import org.gervarro.democles.runtime.JoinOperation;
import org.gervarro.democles.runtime.MagicSet;
import org.gervarro.democles.runtime.Operation;
import org.gervarro.democles.runtime.PatternBodyDataFrame;
import org.gervarro.democles.runtime.RemappingOperation;
import org.gervarro.democles.specification.impl.Constant;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.Variable;

public class PatternBody extends MatchEventSource implements org.gervarro.democles.specification.PatternBody, MatchEventListener {
	private final Map<Adornment, Operation> roots =
		new HashMap<Adornment, Operation>();
	private Pattern parent = null;
	private final List<Variable> localVariables;
	private final List<Constraint> constraints;
	private List<VariableRuntime> localVariableRuntimes;
	private List<RemappingOperation> localVariableOperations;
	private List<RemappingOperation> operations;

	PatternBody(List<Variable> localVariables, List<Constraint> constraints) {
		this.localVariables = localVariables;
		this.constraints = constraints;
	}
	
	public Pattern getHeader() {
		return parent;
	}
	
	void setParent(Pattern parent) {
		if (this.parent != null) {
			removeEventListener(this.parent);
		}
		this.parent = parent;
		if (this.parent != null) {
			addEventListener(this.parent);
		}
	}
	
	public final List<Variable> getLocalVariables() {
		return localVariables;
	}

	public final List<Constraint> getConstraints() {
		return constraints; 
	}

	public List<Constant> getConstants() {
		return Collections.emptyList();
	}
	
	final List<VariableRuntime> getRuntimeLocalVariables() {
		if (localVariableRuntimes == null) {
			localVariableRuntimes = parent.getEngine().createVariableRuntimes(getLocalVariables(), parent.getSymbolicParameters().size());
		}
		return localVariableRuntimes;
	}
	
	final List<RemappingOperation> getLocalVariableOperations() {
		if (localVariableOperations == null) {
			localVariableOperations =
				new ArrayList<RemappingOperation>(getLocalVariables().size());
			for (int i = 0; i < getLocalVariables().size(); i++) {
				final RemappingOperation newOperation =
					parent.getEngine().buildVariableOperation(getLocalVariables().get(i), getRuntimeLocalVariables().get(i));
				localVariableOperations.add(newOperation);
			}
		}
		return localVariableOperations;
	}

	final List<RemappingOperation> getConstraintOperations() {
		if (operations == null) {
			PatternMatcherModule module = getHeader().getEngine();
			final Map<ConstraintVariable, VariableRuntime> variableMap = getHeader().getVariableMap();
			int offset = getHeader().getSymbolicParameters().size();

			for (int i = 0; i < localVariables.size(); i++) {
				variableMap.put(localVariables.get(i), getRuntimeLocalVariables().get(i));
			}
			offset += localVariables.size();
			if (getConstants().size() > 0) {
				throw new RuntimeException("Constants are not yet supported");
			}
			//			List<Constant> constants = body.getConstants();
			//			Constant[] newConstants = new Constant[constants.size()];
			//			constants.toArray(newConstants);
			//			for (int i = 0; i < constants.size(); i++) {
			//				// Object value = constants.get(i).getValue();
			//				slotMap.put(constants.get(i), createConstant((Constant) constants.get(i), i));
			//			}

			this.operations = new LinkedList<RemappingOperation>();
			for (int i = 0; i < constraints.size(); i++) {
				Constraint constraint = constraints.get(i);
				operations.addAll(module.buildConstraintOperations(constraint, variableMap));
			}
		}
		return operations;
	}
	
	private final void initialize(JoinOperation root) {
		List<Operation> queue = new LinkedList<Operation>();
		root.setDepth(0);
		queue.add(root);
		while (!queue.isEmpty()) {
			Operation operation = queue.remove(0);
			operation.setPatternBody(this);
			if (operation instanceof JoinOperation) {
				JoinOperation joinOperation = (JoinOperation) operation;
				int depth = joinOperation.getDepth();
				Operation leftChild = joinOperation.getLeftOperation();
				Operation rightChild = joinOperation.getRightOperation();
				leftChild.addEventListener(joinOperation);
				rightChild.addEventListener(joinOperation);
				if (leftChild instanceof JoinOperation) {
					JoinOperation join = (JoinOperation) leftChild;
					join.setDepth(depth + 1);
				}
				queue.add(leftChild);
				if (rightChild instanceof JoinOperation) {
					JoinOperation join = (JoinOperation) rightChild;
					join.setDepth(depth + 1);
				}
				queue.add(rightChild);
			}
		}
	}
	
	private final List<RemappingOperation> getOperations() {
		final List<RemappingOperation> result =
			new LinkedList<RemappingOperation>();
		result.addAll(getHeader().getSymbolicParameterOperations());
		result.addAll(getLocalVariableOperations());
		result.addAll(getConstraintOperations());
		return result;
	}

	Operation getSearchPlan(Adornment patternAdornment) {
		Operation root = roots.get(patternAdornment);
		if (root == null) {
			List<VariableRuntime> runtimeVariables =
				new ArrayList<VariableRuntime>(getHeader().getRuntimeSymbolicParameters().size());
			for (RemappingOperation op: getHeader().getSymbolicParameterOperations()) {
				runtimeVariables.add(op.getParameters().get(0));
			}
			Adornment bodyAdornment = calculateAdornment(patternAdornment);
			MagicSet magicSet = getHeader().getMagicSet(patternAdornment);
			RemappingOperation magicSetOperation =
				new RemappingOperation();
			magicSetOperation.setInput(magicSet);
			magicSetOperation.setPatternBody(this);
			magicSetOperation.setParameters(runtimeVariables);
			MagicSetCombiner msc = new MagicSetCombiner(magicSetOperation, bodyAdornment);
			SearchPlanAlgorithm<InterpreterCombiner, RemappingOperation> searchPlanAlgorithm =
				getHeader().getEngine().getAlgorithm();
			root = searchPlanAlgorithm.generateSearchPlan(msc, getOperations(), bodyAdornment).getRoot();
			if (root instanceof JoinOperation) {
				initialize((JoinOperation) root);
			}
			magicSet.addEventListener(magicSetOperation);
			root.addEventListener(this);
			roots.put(patternAdornment, root);
		}
		return root;
	}

	public final int frameSize() {
		return getHeader().getSymbolicParameters().size() + getLocalVariables().size();
	}
	
	public Adornment calculateAdornment(Adornment input) {
		int numberOfSymbolicParameters = getHeader().getSymbolicParameters().size();
		int numberOfVariables = numberOfSymbolicParameters + getLocalVariables().size();
		Adornment adornment = new Adornment(numberOfVariables + getConstants().size());
		// Symbolic parameters depend on the input
		for (int i = 0; i < numberOfSymbolicParameters; i++) {
			adornment.set(i, input.get(i));
		}
		// Local variables are free
		for (int i = numberOfSymbolicParameters; i < numberOfVariables; i++) {
			adornment.set(i, Adornment.FREE);
		}
		// Constants are bound (nothing to do as values of adornments are bound by default)
		return adornment;
	}
	
	public PatternBodyDataFrame createDataFrame(PatternBodyDataFrame original) {
		if (original == null) {
			int numberOfSymbolicParameters = getHeader().getSymbolicParameters().size();
			int numberOfVariables = numberOfSymbolicParameters + getLocalVariables().size();
			return new PatternBodyDataFrame(this, numberOfVariables);
		} else if (getHeader().getEngine().getScheduler().getSchedulingStrategy().requiresNewDataFrame()) {
			return new PatternBodyDataFrame(original);
		} else {
			return original;
		}
	}

	public Object getConstant(int index) {
		return getConstants().get(index).getValue();
	}

	public Variable getVariable(int index) {
		final List<Variable> symbolicParameters = getHeader().getSymbolicParameters();
		final int diff = index - symbolicParameters.size();
		return diff < 0 ? symbolicParameters.get(index) : localVariables.get(diff);
	}

	public void handleEvent(MatchEvent event) {
		sendEvent(event.getMatching(), event.getEventType());
	}
}