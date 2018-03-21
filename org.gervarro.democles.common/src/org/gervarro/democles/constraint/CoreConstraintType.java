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
package org.gervarro.democles.constraint;

import org.gervarro.democles.common.TypeModule;
import org.gervarro.democles.specification.ConstraintType;

public final class CoreConstraintType implements ConstraintType {
	private final String id;

	CoreConstraintType(String id) {
		this.id = id;
	}

	public final String getID() {
		return id;
	}

	public final TypeModule getModule() {
		return CoreConstraintModule.INSTANCE;
	}

	public final String toString() {
		return id;
	}
}
