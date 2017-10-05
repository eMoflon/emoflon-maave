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
package org.gervarro.democles.emf;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.Operation;
import org.gervarro.democles.constraint.emf.Reference;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.plan.WeightedOperationBuilder;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;

public class EMFWeightedOperationBuilder<T extends OperationRuntime> extends WeightedOperationBuilder<T> {
	
	public int getWeight(T operation) {
		Adornment adornment = operation.getPrecondition();
		Object object = operation.getOrigin();
		if (object instanceof Constraint) {
			Constraint constraint = (Constraint) object;
			ConstraintType cType = constraint.getType();

			if (adornment.numberOfFrees() == 0) {
				if (cType instanceof PatternInvocationConstraintType && !((PatternInvocationConstraintType) cType).isPositive()) {
					return 5;
				}
				if (cType instanceof EMFConstraint<?>) {
					return -5;
				}
				return -10;
			}
			
			if (cType instanceof Reference && ((Reference) cType).isBidirectional()) {
				Reference emfType = (Reference) cType;
				if (adornment.get(0) == Adornment.BOUND && adornment.get(1) == Adornment.FREE) {
					int upperBound = emfType.getLinkedElement().getUpperBound();
					return upperBound > 1 || upperBound == EStructuralFeature.UNBOUNDED_MULTIPLICITY ? 10 : 1;
				} else if (adornment.get(0) == Adornment.FREE && adornment.get(1) == Adornment.BOUND) {
					EReference opposite = emfType.getLinkedElement().getEOpposite();
					int upperBound = opposite.getUpperBound();
					return upperBound > 1 || upperBound == EStructuralFeature.UNBOUNDED_MULTIPLICITY ? 10 : 1;
				}
			} else if (cType instanceof StructuralFeature<?>) {
				StructuralFeature<?> emfType = (StructuralFeature<?>) cType;
				if (adornment.get(0) == Adornment.BOUND && adornment.get(1) == Adornment.FREE) {
					int upperBound = emfType.getLinkedElement().getUpperBound();
					return upperBound > 1 || upperBound == EStructuralFeature.UNBOUNDED_MULTIPLICITY ? 10 : 1;
				}
			} else if (cType instanceof Operation) {
				return -5;
			} else if (cType == CoreConstraintModule.EQUAL) {
				return -5;
			} else if (cType instanceof PatternInvocationConstraintType && ((PatternInvocationConstraintType) cType).isPositive()) {
				return 10;
			}
		} else if (object instanceof Variable) {
			return -5;
		}
		throw new RuntimeException("Invalid combination of constraint type and adornment");
	}
}
