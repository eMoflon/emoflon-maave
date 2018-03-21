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
import java.util.List;
import java.util.Map;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.event.MatchEvent;
import org.gervarro.democles.event.MatchEventListener;
import org.gervarro.democles.runtime.InterpretedDataFrame;
import org.gervarro.democles.runtime.MagicSet;
import org.gervarro.democles.runtime.RemappingOperation;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.Variable;

public class Pattern extends org.gervarro.democles.common.PatternMatcher<InterpretedDataFrame>
		implements MatchEventListener, org.gervarro.democles.specification.Pattern {
	private PatternMatcherModule engine;
	private List<PatternBody> bodies;
	private final List<Variable> symbolicParameters;
	private List<VariableRuntime> internalSymbolicParameters;
	private List<RemappingOperation> symbolicParameterOperations;
	private Map<Adornment, MagicSet> magicSets = new HashMap<Adornment, MagicSet>();

	Pattern(PatternMatcherModule module, String name, List<? extends Variable> symbolicParameters) {
		super(name);
		this.engine = module;
		this.symbolicParameters = new ArrayList<Variable>(symbolicParameters);
	}

	public final List<PatternBody> getBodies() {
		if (bodies != null) {
			return bodies;
		} else {
			final List<PatternBody> emptyList = Collections.emptyList();
			return emptyList;
		}
	}

	final void setBodies(List<PatternBody> bodies) {
		if (this.bodies == null) {
			this.bodies = bodies;
			for (PatternBody body : this.bodies) {
				body.setParent(this);
			}
		}
	}

	public final List<Variable> getSymbolicParameters() {
		return symbolicParameters;
	}

	final List<VariableRuntime> getRuntimeSymbolicParameters() {
		if (internalSymbolicParameters == null) {
			internalSymbolicParameters = engine.createVariableRuntimes(getSymbolicParameters(), 0);
		}
		return internalSymbolicParameters;
	}

	final Map<ConstraintVariable, VariableRuntime> getVariableMap() {
		final Map<ConstraintVariable, VariableRuntime> variableMap = new HashMap<ConstraintVariable, VariableRuntime>();
		for (int i = 0; i < getSymbolicParameters().size(); i++) {
			variableMap.put(getSymbolicParameters().get(i), getRuntimeSymbolicParameters().get(i));
		}
		return variableMap;
	}

	final List<RemappingOperation> getSymbolicParameterOperations() {
		if (symbolicParameterOperations == null) {
			symbolicParameterOperations = new ArrayList<RemappingOperation>(getSymbolicParameters().size());
			for (int i = 0; i < getSymbolicParameters().size(); i++) {
				final RemappingOperation newOperation = engine.buildVariableOperation(getSymbolicParameters().get(i),
						getRuntimeSymbolicParameters().get(i));
				symbolicParameterOperations.add(newOperation);
			}
		}
		return symbolicParameterOperations;
	}

	public final PatternMatcherModule getEngine() {
		return engine;
	}

	MagicSet createMagicSet(Adornment adornment) {
		MagicSet ms = new MagicSet(this, adornment);
		magicSets.put(adornment, ms);
		return ms;
	}

	MagicSet getMagicSet(Adornment adornment) {
		return magicSets.get(adornment);
	}

	protected final Iterable<InterpretedDataFrame> matchAll(InterpretedDataFrame input, Adornment adornment) {
		return new MultipleMatchSession(this).match(input, adornment);
	}

	protected final InterpretedDataFrame matchSingle(InterpretedDataFrame input, Adornment adornment) {
		return new SingleMatchSession(this).match(input, adornment);
	}

	public final InterpretedDataFrame createDataFrame() {
		return new InterpretedDataFrame(symbolicParameters.size());
	}

	public void handleEvent(MatchEvent event) {
		sendEvent(event.getMatching(), event.getEventType());
	}
}
