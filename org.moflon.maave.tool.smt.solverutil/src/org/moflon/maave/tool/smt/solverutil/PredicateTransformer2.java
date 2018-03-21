package org.moflon.maave.tool.smt.solverutil;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EDataType;
import org.moflon.maave.tool.smt.smtlib.SmtLibHelper;
import org.moflon.maave.tool.symbolicgraphs.Datastructures.Mapping;
import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.Constant;
import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.Disjunction;
import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.LabelNode;
import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.Parameter;
import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.Predicate;
import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.Quantifier;
import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.SymbolicGraph;

public class PredicateTransformer2 implements IPredicateTransformer {

	private HashSet<EDataType> toBeDeclaredTypes = new HashSet<EDataType>();
	private HashSet<String> toBeDeclaredPredicates = new HashSet<String>();
	private HashMap<LabelNode, String> toBeDeclaredVariables = new HashMap<LabelNode, String>();

	public PredicateTransformer2() {
		super();

	}

	@Override
	public String transformPredicate(Predicate predicate, Mapping<LabelNode> labelNodeSubstMap) {
		// PredicateSpec predSpec=smtLib.lookupPredicateSpec(predicate);
		// if(predSpec==null){
		// throw new RuntimeException("Missing predicate specification for predicate
		// with symbol \""+predicate.getSymbol()+
		// "\" and
		// parameters"+predicate.getParameters().stream().map(x->x.getType().getName()).reduce("
		// ",(a,b)->a+", "+b));
		//
		// }

		List<String> variableSymbols = new LinkedList<String>();
		for (int i = 0; i < predicate.getParameters().size(); i++) {

			toBeDeclaredTypes.add(predicate.getParameters().get(i).getType());

			Parameter param = predicate.getParameters().get(i);
			String variableSymbol;
			if (param instanceof LabelNode) {
				LabelNode labelNode = (LabelNode) param;
				if (labelNode.eContainer() instanceof SymbolicGraph) {
					LabelNode imageOfLabelNode = labelNodeSubstMap.imageOf(labelNode);
					variableSymbol = imageOfLabelNode.getLabel();
					variableSymbol = variableSymbol + IFormulaTransformer.VAR_SUFFIX;
					variableSymbol = variableSymbol
							+ ((SymbolicGraph) imageOfLabelNode.eContainer()).getLabelNodes().indexOf(imageOfLabelNode);
					toBeDeclaredVariables.putIfAbsent(imageOfLabelNode, variableSymbol);

				} else // i.e. container is Quantifier
				{
					variableSymbol = labelNode.getLabel();
					variableSymbol = variableSymbol + IFormulaTransformer.QANT_VAR_SUFFIX;
					variableSymbol = variableSymbol
							+ ((Quantifier) labelNode.eContainer()).getLabelNodes().indexOf(labelNode);

				}
			} else {
				Constant constant = (Constant) param;

				variableSymbol = SmtLibHelper.getInstance().getSMTLib()
						.getSmtLibConstantValue(constant.getInterpretation(), constant.getType());
			}
			variableSymbols.add(variableSymbol);

		}
		toBeDeclaredPredicates.add(SmtLibHelper.getInstance().getSMTLib().getSmtLibPredicateDeclaration(predicate));
		return SmtLibHelper.getInstance().getSMTLib().getSmtLibPredicateInvocation(predicate, variableSymbols);

	}

	@Override
	public Collection<String> getFunctionDefinitions() {
		return toBeDeclaredPredicates;
	}

	@Override
	public Collection<String> getVariableDeclarations() {

		List<String> varDeclarations = new LinkedList<String>();
		for (LabelNode variable : toBeDeclaredVariables.keySet()) {
			varDeclarations.add(SmtLibHelper.getInstance().getSMTLib()
					.getSmtLibVariableDeclarations(toBeDeclaredVariables.get(variable), variable.getType()));
		}

		return varDeclarations;
	}

	@Override
	public Collection<String> getSortDeclarations() {
		return toBeDeclaredTypes.stream().map(x -> SmtLibHelper.getInstance().getSMTLib().getSortDeclaration(x))
				.filter(x -> x != null).collect(Collectors.toList());
	}

	public List<String> getQuantifiedVarDef(Disjunction disjunction) {

		List<String> exVarDefs = new LinkedList<String>();
		for (LabelNode variable : disjunction.getQuantifier().getLabelNodes()) {
			toBeDeclaredTypes.add(variable.getType());

			StringBuilder varSymbolBuilder = new StringBuilder();
			varSymbolBuilder.append(variable.getLabel());
			varSymbolBuilder.append(IFormulaTransformer.QANT_VAR_SUFFIX);
			varSymbolBuilder.append(((Quantifier) variable.eContainer()).getLabelNodes().indexOf(variable));
			exVarDefs.add(SmtLibHelper.getInstance().getSMTLib().getSmtLibQuantifiedVarDeclaration(variable.getType(),
					varSymbolBuilder.toString()));

		}
		return exVarDefs;
	}

}
