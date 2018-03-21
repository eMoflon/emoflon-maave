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
package org.gervarro.democles.specification.impl;

import java.util.HashMap;
import java.util.Map;

import org.gervarro.democles.common.PatternMatcherPlugin;

abstract public class PatternBuilder<P extends Pattern, PB> {
	protected final PatternFactory<P, PB> factory;
	protected final Map<String, P> patternRegistry;

	public PatternBuilder(PatternFactory<P, PB> factory) {
		this.factory = factory;
		this.patternRegistry = new HashMap<String, P>();
	}

	public final P createPattern(String name, PB[] bodies, Variable[] symbolicParameters) {
		P pattern = factory.createPattern(name, symbolicParameters);
		factory.setBodies(pattern, bodies);
		patternRegistry.put(PatternMatcherPlugin.getIdentifier(name, symbolicParameters.length), pattern);
		return pattern;
	}

	public final PB createPatternBody(Variable[] localVariables, Constraint[] constraints, Constant[] constants) {
		return factory.createPatternBody(localVariables, constraints, constants);
	}
}
