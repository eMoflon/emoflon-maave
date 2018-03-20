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
package org.gervarro.democles.emf.codegen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public class GenClassAdapter extends GenModelElementAdapter<EClass, GenClass> {
	
	GenClassAdapter() {
		super();
	}
	
	public GenPackageAdapter getParent() {
		EPackage ePackage = getEModelElement().getEPackage();
		return (GenPackageAdapter) factory.adapt(ePackage, null);
	}

	public String getTypeName() {
		boolean includeTemplateArguments = false;
		EClass eClass = getEModelElement();
	    return eClass.getInstanceClassName() != null ?
	      includeTemplateArguments ? eClass.getInstanceTypeName() : eClass.getInstanceClassName() :
	      getParent().getGenElement().getInterfacePackageName() + "." + genElement.getInterfaceName();
	}
	
	public final String getPackageName() {
		return getParent().getPackageName();
	}
	
	public final String getClassName() {
		return getGenElement().getName() + "Operation";
	}
	
	public final String[] getTypes() {
		return new String[] { getTypeName() };
	}
}
