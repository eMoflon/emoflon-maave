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
package org.gervarro.democles.constraint.emf;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.common.TypeModule;

public class EMFConstraintModule implements TypeModule {
	private final EPackage.Registry registry;
	private final Map<EModelElement, EMFConstraint<?>> constraintTypeMapping =
		new HashMap<EModelElement, EMFConstraint<?>>();
	private final Map<EClassifier, EMFVariable> variableTypeMapping =
		new HashMap<EClassifier, EMFVariable>();
	
	public EMFConstraintModule(Registry registry) {
		this.registry = registry;
	}
	
	public EMFConstraintModule(ResourceSet resourceSet) {
		this(resourceSet.getPackageRegistry());
	}
	
	public boolean isAdapterForType(Object type) {
		return type instanceof Class<?> && getClass().isAssignableFrom((Class<?>) type);
	}
	
	public final String getName() {
		return "emf";
	}
	
	public final EMFConstraint<?> getConstraintType(EModelElement eModelElement) {
		EMFConstraint<?> constraintType = constraintTypeMapping.get(eModelElement);
		if (constraintType == null) {
			if (EcorePackage.eINSTANCE.getEAttribute().isInstance(eModelElement)) {
				EAttribute eAttribute = (EAttribute) eModelElement;
				constraintType = new Attribute(this, eAttribute);
			} else if (EcorePackage.eINSTANCE.getEReference().isInstance(eModelElement)) {
				EReference eReference = (EReference) eModelElement;
				constraintType = new Reference(this, eReference);
			} else if (EcorePackage.eINSTANCE.getEOperation().isInstance(eModelElement)) {
				EOperation eReference = (EOperation) eModelElement;
				constraintType = new Operation(this, eReference);
			} else {
				return null;
			}
			constraintTypeMapping.put(eModelElement, constraintType);
		}
		return constraintType;
	}

	public final EMFVariable getVariableType(EClassifier eClassifier) {
		EMFVariable variableType = variableTypeMapping.get(eClassifier);
		if (variableType == null) {
			variableType = new EMFVariable(this, eClassifier);
			variableTypeMapping.put(eClassifier, variableType);
		}
		return variableType;
	}
	
	public final Registry getRegistry() {
		return registry;
	}
}
