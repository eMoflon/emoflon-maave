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
package org.gervarro.democles.operation.emf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.Operation;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.runtime.AdornedOperation;
import org.gervarro.democles.runtime.DelegatingAdornedOperation;
import org.gervarro.democles.runtime.RemappingOperation;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;

public class ReflectiveInterpreterOperationBuilder implements OperationBuilder<RemappingOperation,VariableRuntime> {
	private final EMFConstraintModule emfBuilder;
	private final Map<EModelElement, ReflectiveEMFOperation<?>> constraintTypeMapping =
			new HashMap<EModelElement, ReflectiveEMFOperation<?>>();
	private final Map<EClassifier, ReflectiveEMFOperation<?>> variableTypeMapping =
			new HashMap<EClassifier, ReflectiveEMFOperation<?>>();
	private final Map<EModelElement, List<AdornedOperation>> constraintTypeToAdornedOperation =
			new HashMap<EModelElement, List<AdornedOperation>>();
	private final Map<EClassifier, DelegatingAdornedOperation> variableTypeToAdornedOperation =
			new HashMap<EClassifier, DelegatingAdornedOperation>();
	
	public ReflectiveInterpreterOperationBuilder(EMFConstraintModule emfBuilder) {
		this.emfBuilder = emfBuilder;
	}

	// OperationBuilder methods
	public RemappingOperation getVariableOperation(Variable variable,
			VariableRuntime runtimeVariable) {
		if (variable.getType() instanceof EMFVariable) {
			EMFVariable vType = (EMFVariable) variable.getType();
			EClassifier eClassifier = vType.getLinkedElement();
			DelegatingAdornedOperation adornedOperation =
					getAdornedOperationForVariable(eClassifier);
			
			RemappingOperation operation = new RemappingOperation();
			operation.setOrigin(variable);
			operation.setInput(adornedOperation);
			List<VariableRuntime> parameters = new LinkedList<VariableRuntime>();
			parameters.add(0, runtimeVariable);
			operation.setParameters(parameters);
			return operation;
		}
		return null;
	}
	
	public List<RemappingOperation> getConstraintOperations(Constraint constraint, List<VariableRuntime> parameters) {
		if (constraint.getType() instanceof EMFConstraint<?>) {
			List<RemappingOperation> result = new LinkedList<RemappingOperation>();
			EMFConstraint<?> cType = (EMFConstraint<?>) constraint.getType();
			if (cType instanceof StructuralFeature<?>) {
				EStructuralFeature eStructuralFeature = ((StructuralFeature<?>) cType).getLinkedElement();
				for (AdornedOperation adornedOperation : getAdornedOperationsForConstraints(eStructuralFeature)) {
					RemappingOperation operation = new RemappingOperation();
					operation.setInput(adornedOperation);
					operation.setOrigin(constraint);
					operation.setParameters(parameters);
					adornedOperation.addEventListener(operation);
					result.add(operation);
				}
			} else if (cType instanceof Operation) {
				// TODO
//				EOperation eOperation = ((Operation) cType).getLinkedElement();
//				ReflectiveEMFOperation<?> nOperation = getConstraintType(eOperation);
//				RemappingOperation operation0 = new RemappingOperation();
//				operation0.setOrigin(constraint);
//				operation0.setPrecondition(Adornment.create(Adornment.BOUND, Adornment.BOUND));
//				operation0.setPostcondition(Adornment.create(Adornment.BOUND, Adornment.BOUND));
//				operation0.setInput(nOperation);
//				operation0.setParameters(parameters);
//				nOperation.addEventListener(operation0);
//				result.add(operation0);
//				RemappingOperation operation1 = new RemappingOperation();
//				operation1.setOrigin(constraint);
//				operation1.setPrecondition(Adornment.create(Adornment.BOUND, Adornment.FREE));
//				operation1.setPostcondition(Adornment.create(Adornment.BOUND, Adornment.NOT_TYPECHECKED));
//				operation1.setInput(nOperation);
//				operation1.setParameters(parameters);
//				nOperation.addEventListener(operation1);
//				result.add(operation1);
			}
			return result;
		}
		return null;
	}
	
	private final List<AdornedOperation> getAdornedOperationsForConstraints(
			final EStructuralFeature eStructuralFeature) {
		List<AdornedOperation> adornedOperations =
				constraintTypeToAdornedOperation.get(eStructuralFeature);
		if (adornedOperations == null) {
			adornedOperations = new LinkedList<AdornedOperation>();
		
			ReflectiveEMFOperation<?> nativeOperation = getConstraintType(eStructuralFeature);
			if (nativeOperation instanceof BidirectionalReference) {
				// Bidirectional
				DelegatingAdornedOperation checkOperation =
						new DelegatingAdornedOperation(nativeOperation,
								Adornment.create(Adornment.BOUND, Adornment.BOUND),
								Adornment.create(Adornment.BOUND, Adornment.BOUND));
				adornedOperations.add(checkOperation);
				nativeOperation.addEventListener(checkOperation);
				DelegatingAdornedOperation extendForwardOperation =
						new DelegatingAdornedOperation(nativeOperation,
								Adornment.create(Adornment.BOUND, Adornment.FREE),
								Adornment.create(Adornment.BOUND, Adornment.NOT_TYPECHECKED));
				adornedOperations.add(extendForwardOperation);
				nativeOperation.addEventListener(extendForwardOperation);
				DelegatingAdornedOperation extendBackwardOperation =
						new DelegatingAdornedOperation(nativeOperation,
								Adornment.create(Adornment.FREE, Adornment.BOUND),
								Adornment.create(Adornment.NOT_TYPECHECKED, Adornment.BOUND));
				adornedOperations.add(extendBackwardOperation);
				nativeOperation.addEventListener(extendBackwardOperation);
			} else {
				// Unidirectional
				DelegatingAdornedOperation checkOperation =
						new DelegatingAdornedOperation(nativeOperation,
								Adornment.create(Adornment.BOUND, Adornment.BOUND),
								Adornment.create(Adornment.BOUND, Adornment.BOUND));
				adornedOperations.add(checkOperation);
				nativeOperation.addEventListener(checkOperation);
				DelegatingAdornedOperation extendForwardOperation =
						new DelegatingAdornedOperation(nativeOperation,
								Adornment.create(Adornment.BOUND, Adornment.FREE),
								Adornment.create(Adornment.BOUND, Adornment.NOT_TYPECHECKED));
				adornedOperations.add(extendForwardOperation);
				nativeOperation.addEventListener(extendForwardOperation);
			}
			constraintTypeToAdornedOperation.put(eStructuralFeature, adornedOperations);
		}
		return adornedOperations;
	}
	
	private final ReflectiveEMFOperation<? extends EModelElement> getConstraintType(EModelElement eModelElement) {
		ReflectiveEMFOperation<? extends EModelElement> constraintType = constraintTypeMapping.get(eModelElement);
		if (constraintType == null) {
			int classifierID = eModelElement.eClass().getClassifierID();
			switch (classifierID) {
			case EcorePackage.EATTRIBUTE: {
				EAttribute eAttribute = (EAttribute) eModelElement;
				if (eAttribute.isMany()) {
					// Unidirectional to-many operation
					constraintType = new UnidirectionalToManyOperation(emfBuilder, eAttribute);
				} else {
					// Unidirectional to-one operation
					constraintType = new UnidirectionalToOneOperation(emfBuilder, eAttribute);
				}
			}
			break;
			case EcorePackage.EREFERENCE: {
				EReference eReference = (EReference) eModelElement;
				if (eReference.getEOpposite() != null) {
					if (eReference.getEOpposite().isMany()) {
						if (eReference.isMany()) {
							// Bidirectional many-to-many operation
							constraintType = new BidirectionalManyToManyOperation(emfBuilder, eReference);
						} else {
							// Bidirectional many-to-one operation
							constraintType = new BidirectionalManyToOneOperation(emfBuilder, eReference);
						}
					} else {
						if (eReference.isMany()) {
							// Bidirectional one-to-many operation
							constraintType = new BidirectionalOneToManyOperation(emfBuilder, eReference);
						} else {
							// Bidirectional one-to-one operation
							constraintType = new BidirectionalOneToOneOperation(emfBuilder, eReference);
						}
					}
				} else {
					// Unidirectional
					if (eReference.isMany()) {
						// Unidirectional to-many operation
						constraintType = new UnidirectionalToManyOperation(emfBuilder, eReference);
					} else {
						// Unidirectional to-one operation
						constraintType = new UnidirectionalToOneOperation(emfBuilder, eReference);
					}
				}
			}
			break;
			default:
				return null;
			}
			constraintTypeMapping.put(eModelElement, constraintType);
		}
		return constraintType;
	}

	private final DelegatingAdornedOperation getAdornedOperationForVariable(
			final EClassifier eClassifier) {
		DelegatingAdornedOperation adornedOperation =
				variableTypeToAdornedOperation.get(eClassifier);
		if (adornedOperation == null) {
			ReflectiveEMFOperation<?> nativeOperation = getVariableType(eClassifier);
			adornedOperation = new DelegatingAdornedOperation(nativeOperation,
					Adornment.create(Adornment.NOT_TYPECHECKED),
					Adornment.create(Adornment.BOUND));
			nativeOperation.addEventListener(adornedOperation);
			variableTypeToAdornedOperation.put(eClassifier, adornedOperation);
		}
		return adornedOperation;
	}
	
	private final ReflectiveEMFOperation<? extends EModelElement> getVariableType(EClassifier eClassifier) {
		ReflectiveEMFOperation<? extends EModelElement> variableType = variableTypeMapping.get(eClassifier);
		if (variableType == null) {
			variableType = new TypeCheckOperation(emfBuilder, eClassifier);
			variableTypeMapping.put(eClassifier, variableType);
		}
		return variableType;
	}
}