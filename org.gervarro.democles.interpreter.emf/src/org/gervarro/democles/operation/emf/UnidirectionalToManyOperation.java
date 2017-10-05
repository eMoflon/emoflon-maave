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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.runtime.InternalDataFrameProvider;
import org.gervarro.democles.runtime.IteratorBasedSingleFreeVariableHandler;
import org.gervarro.democles.runtime.RemappedDataFrame;

public class UnidirectionalToManyOperation extends UnidirectionalStructuralFeature {

	public UnidirectionalToManyOperation(EMFConstraintModule module, EStructuralFeature eStructuralFeature) {
		super(module, eStructuralFeature);
	}
	
	@SuppressWarnings("unchecked")
	public final InternalDataFrameProvider getDataFrame(RemappedDataFrame frame, Adornment adornment) {
		if (adornment.get(0) == Adornment.BOUND && adornment.get(1) == Adornment.BOUND) {
			org.eclipse.emf.ecore.EObject src = (org.eclipse.emf.ecore.EObject) frame.getValue(0);
			Object trg = frame.getValue(1);
			if (((InternalEList<Object>) src.eGet(eModelElement)).contains(trg)) {
				return frame;
			}
		} else if (adornment.get(0) == Adornment.BOUND && adornment.get(1) == Adornment.FREE) {
			org.eclipse.emf.ecore.EObject src = (org.eclipse.emf.ecore.EObject) frame.getValue(0);
			InternalEList<Object> list = (InternalEList<Object>) src.eGet(eModelElement);
			if (list != null && !list.isEmpty()) {
				return new IteratorBasedSingleFreeVariableHandler<Object>(frame, list.iterator(), 1);
			}
		} else {
			throw new RuntimeException("Adornment " + adornment.toString() + " is unknown.");
		}
		return null;
	}
}