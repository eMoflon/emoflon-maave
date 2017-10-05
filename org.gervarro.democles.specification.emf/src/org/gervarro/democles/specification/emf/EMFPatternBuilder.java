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
package org.gervarro.democles.specification.emf;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.Switch;
import org.gervarro.democles.common.PatternMatcherPlugin;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.impl.DefaultPatternBody;
import org.gervarro.democles.specification.impl.PatternBuilder;
import org.gervarro.democles.specification.impl.PatternFactory;

public class EMFPatternBuilder<P extends org.gervarro.democles.specification.impl.Pattern,PB> extends PatternBuilder<P, PB> {
	private final List<Switch<VariableType>> variableTypeSwitches =
			new LinkedList<Switch<VariableType>>();
	private final List<Switch<ConstraintType>> constraintTypeSwitches =
			new LinkedList<Switch<ConstraintType>>();

	public EMFPatternBuilder(final PatternFactory<P, PB> factory) {
		super(factory);
	}
	
	public final void addVariableTypeSwitch(Switch<VariableType> variableTypeSwitch) {
		variableTypeSwitches.add(variableTypeSwitch);
	}
	
	public final void addConstraintTypeSwitch(Switch<ConstraintType> constraintTypeSwitch) {
		constraintTypeSwitches.add(constraintTypeSwitch);
	}
	
	public final P build(Pattern pattern) {
		Map<Variable, org.gervarro.democles.specification.impl.Variable> variableMap =
			new HashMap<Variable, org.gervarro.democles.specification.impl.Variable>();
		List<? extends Variable> symbolicParameters = pattern.getSymbolicParameters();
		final org.gervarro.democles.specification.impl.Variable[] newSymbolicParameters =
				new org.gervarro.democles.specification.impl.Variable[symbolicParameters.size()];
		for (int i = 0; i < symbolicParameters.size(); i++) {
			Variable variableSpec = symbolicParameters.get(i);
			newSymbolicParameters[i] = createVariable(variableSpec);
			variableMap.put(variableSpec, newSymbolicParameters[i]);
		}
		
		List<? extends PatternBody> bodies = pattern.getBodies();
		@SuppressWarnings("unchecked")
		final PB[] newBodies = (PB[]) new DefaultPatternBody[bodies.size()];
		for (int i = 0; i < bodies.size(); i++) {
			newBodies[i] = buildPatternBody(bodies.get(i), variableMap);
		}

		return createPattern(pattern.getName(), newBodies, newSymbolicParameters);
	}
	
	public final Collection<P> build(Iterable<Pattern> patterns) {
		Map<Pattern, P> patternMap = new HashMap<Pattern, P>();
		// Create patterns and symbolic parameters
		for (Pattern pattern : patterns) {
			List<? extends Variable> symbolicParameters = pattern.getSymbolicParameters();
			final org.gervarro.democles.specification.impl.Variable[] newSymbolicParameters =
					new org.gervarro.democles.specification.impl.Variable[symbolicParameters.size()];
			for (int i = 0; i < symbolicParameters.size(); i++) {
				Variable variableSpec = symbolicParameters.get(i);
				newSymbolicParameters[i] = createVariable(variableSpec);
			}
			P newPattern = factory.createPattern(pattern.getName(), newSymbolicParameters);
			patternMap.put(pattern, newPattern);
		}
		
		// Create pattern bodies
		for (Pattern pattern : patterns) {
			P newPattern = patternMap.get(pattern);
			Map<Variable, org.gervarro.democles.specification.impl.Variable> variableMap =
					new HashMap<Variable, org.gervarro.democles.specification.impl.Variable>();
			List<? extends Variable> symbolicParameters = pattern.getSymbolicParameters();
			for (int i = 0; i < symbolicParameters.size(); i++) {
				Variable variableSpec = symbolicParameters.get(i);
				variableMap.put(variableSpec, newPattern.getSymbolicParameters().get(i));
			}

			List<? extends PatternBody> bodies = pattern.getBodies();
			@SuppressWarnings("unchecked")
			final PB[] newBodies = (PB[]) new DefaultPatternBody[bodies.size()];
			for (int i = 0; i < bodies.size(); i++) {
				newBodies[i] = buildPatternBody(bodies.get(i), variableMap);
			}
			factory.setBodies(newPattern, newBodies);
		}
		for (P newPattern : patternMap.values()) {
			patternRegistry.put(PatternMatcherPlugin.getIdentifier(newPattern.getName(), newPattern.getSymbolicParameters().size()), newPattern);
		}
		return patternMap.values();
	}
	
	private PB buildPatternBody(PatternBody body,
			Map<Variable, org.gervarro.democles.specification.impl.Variable> symbolicParameterMap) {
		Map<Variable, org.gervarro.democles.specification.impl.Variable> variableMap =
			new HashMap<Variable, org.gervarro.democles.specification.impl.Variable>(symbolicParameterMap);
		Map<ConstraintVariable, org.gervarro.democles.specification.impl.ConstraintVariable> slotMap =
			new HashMap<ConstraintVariable, org.gervarro.democles.specification.impl.ConstraintVariable>(symbolicParameterMap);
		List<? extends Variable> localVariables = body.getLocalVariables();
		org.gervarro.democles.specification.impl.Variable[] newLocalVariables =
				new org.gervarro.democles.specification.impl.Variable[localVariables.size()];
		for (int i = 0; i < localVariables.size(); i++) {
			newLocalVariables[i] = createVariable(localVariables.get(i));
			variableMap.put(localVariables.get(i), newLocalVariables[i]);
			slotMap.put(localVariables.get(i), newLocalVariables[i]);
		}
		List<? extends Constant> constants = body.getConstants();
		org.gervarro.democles.specification.impl.Constant[] newConstants =
				new org.gervarro.democles.specification.impl.Constant[constants.size()];
		for (int i = 0; i < constants.size(); i++) {
			newConstants[i] = new org.gervarro.democles.specification.impl.Constant(constants.get(i).getValue());
			slotMap.put(constants.get(i), newConstants[i]);
		}
		
		List<? extends Constraint> constraints = body.getConstraints();
		org.gervarro.democles.specification.impl.Constraint[] newConstraints =
				new org.gervarro.democles.specification.impl.Constraint[constraints.size()];
		for (int i = 0; i < constraints.size(); i++) {
			Constraint constraint = constraints.get(i);
			newConstraints[i] = buildConstraint(constraint, slotMap);
		}
		
		return createPatternBody(newLocalVariables, newConstraints, newConstants);
	}
	
	private final org.gervarro.democles.specification.impl.Constraint buildConstraint(Constraint constraint, 
			Map<ConstraintVariable, org.gervarro.democles.specification.impl.ConstraintVariable> slotMap) {
		List<? extends ConstraintParameter> parameters = constraint.getParameters();
		org.gervarro.democles.specification.impl.ConstraintVariable[] newParameters =
				new org.gervarro.democles.specification.impl.ConstraintVariable[parameters.size()];
		for (int j = 0; j < parameters.size(); j++) {
			ConstraintVariable parameter = parameters.get(j).getReference();
			if (parameter instanceof Variable) {
				newParameters[j] = lookupVariable((Variable) parameter, slotMap);
			} else if (parameter instanceof Constant) {
				newParameters[j] = lookupConstant((Constant) parameter, slotMap);
			}
		}
		return new org.gervarro.democles.specification.impl.Constraint(newParameters, lookupConstraintType(constraint));
	}
	
	private final ConstraintType lookupConstraintType(Constraint constraint) {
		for (Switch<ConstraintType> constraintTypeSwitch : constraintTypeSwitches) {
			ConstraintType result = constraintTypeSwitch.doSwitch(constraint);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
	
	private final org.gervarro.democles.specification.impl.Variable createVariable(Variable variable) {
		return new org.gervarro.democles.specification.impl.Variable(variable.getName(), lookupVariableType(variable));
	}
	
	private final org.gervarro.democles.specification.impl.Variable lookupVariable(Variable variable,
			Map<? extends ConstraintVariable, ? extends org.gervarro.democles.specification.impl.ConstraintVariable> map) {
		org.gervarro.democles.specification.impl.ConstraintVariable result = map.get(variable);
		if (result == null) {
			throw new RuntimeException("Variable " + variable.getName() + " not found");
		}
		return (org.gervarro.democles.specification.impl.Variable) result;
	}
	
	private final VariableType lookupVariableType(Variable variable) {
		for (Switch<VariableType> variableTypeSwitch : variableTypeSwitches) {
			VariableType result = variableTypeSwitch.doSwitch(variable);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
	
	private org.gervarro.democles.specification.impl.Constant lookupConstant(Constant constant,
			Map<? extends ConstraintVariable, ? extends org.gervarro.democles.specification.impl.ConstraintVariable> map) {
		org.gervarro.democles.specification.impl.ConstraintVariable result = map.get(constant);
		if (result == null) {
			throw new RuntimeException("Constant " + constant.getValue().toString() + " not found");
		}
		return (org.gervarro.democles.specification.impl.Constant) result;
	}
}
