package org.moflon.maave.tool.symbolicgraphs.secondorder.matching.operations;

import org.eclipse.emf.ecore.EModelElement;
import org.gervarro.democles.specification.VariableType;
import org.moflon.maave.tool.symbolicgraphs.secondorder.matching.emf.constraint.SymbolicGraphConstraintModule;

public class GraphElementVariableType implements VariableType {

	private final EModelElement typeGraphElement;

	@SuppressWarnings("unused")
	private final SymbolicGraphConstraintModule module;

	public GraphElementVariableType(EModelElement typeGraphElement, SymbolicGraphConstraintModule module) {
		this.typeGraphElement = typeGraphElement;
		this.module = module;
	}

	public EModelElement getTypeGraphElement() {
		return typeGraphElement;
	}

}
