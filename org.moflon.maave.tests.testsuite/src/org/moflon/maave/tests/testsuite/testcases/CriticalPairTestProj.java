package org.moflon.maave.tests.testsuite.testcases;

import static org.junit.Assert.assertTrue;

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Assert;
import org.junit.Test;
import org.moflon.maave.tests.lang.mnoq.MnoqPackage;
import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tool.analysis.AnalysisFactory;
import org.moflon.maave.tool.analysis.JointlyEpiSetBuilder;
import org.moflon.maave.tool.analysis.confluence.ConfluenceFactory;
import org.moflon.maave.tool.analysis.confluence.ICriticalPairBuilder;
import org.moflon.maave.tool.graphtransformation.DirectDerivationPairSet;
import org.moflon.maave.tool.graphtransformation.GraphTransformationSystem;
import org.moflon.maave.tool.graphtransformation.GraphtransformationFactory;
import org.moflon.maave.tool.graphtransformation.SymbGTRule;
import org.moflon.maave.tool.sdm.stptransformation.StptransformationFactory;
import org.moflon.maave.tool.sdm.stptransformation.Transformer;
import org.moflon.maave.tool.symbolicgraphs.secondorder.matching.MatchingUtils.ConfigurableMorphismClassFactory;
import org.moflon.maave.tool.symbolicgraphs.secondorder.matching.MatchingUtils.MatchingUtilsFactory;

import SDMLanguage.activities.MoflonEOperation;
import SDMLanguage.activities.StoryNode;

public class CriticalPairTestProj {

	@Test
	public void test1() {
		System.out.println("Starting CriticalPairTestProj/Test1");
		DiachasePackage.eINSTANCE.getClass();
		MnoqPackage.eINSTANCE.getClass();

		EPackage pack = TestRunner.loadTestMM("org.moflon.maave.tests.testgen.diachase", "Diachase");
		EClass cls = (EClass) pack.getEClassifier("PaperExampleTest");
		MoflonEOperation op1 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("ruleAddOne")).findFirst().get();
		MoflonEOperation op2 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("ruleLarger4")).findFirst().get();
		Assert.assertTrue("FailedAssert: 0", op1 != null && op2 != null);
		StoryNode stn1 = (StoryNode) op1.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);
		StoryNode stn2 = (StoryNode) op2.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);

		Transformer transformer = StptransformationFactory.eINSTANCE.createTransformer();
		SymbGTRule rule1 = transformer.transformStpToProjGTRule(stn1.getStoryPattern());
		SymbGTRule rule2 = transformer.transformStpToProjGTRule(stn2.getStoryPattern());

		ConfigurableMorphismClassFactory morClassFac = MatchingUtilsFactory.eINSTANCE
				.createConfigurableMorphismClassFactory();

		GraphTransformationSystem gts = GraphtransformationFactory.eINSTANCE.createGraphTransformationSystem();
		gts.getRules().add(rule1);
		gts.getRules().add(rule2);
		gts.setMatchMorphismClass(morClassFac.createMorphismClass("I", "I", "I", "I", "=>"));
		gts.setDirectDerivationBuilder(GraphtransformationFactory.eINSTANCE.createProjectiveDirectDerivationBuilder());

		ICriticalPairBuilder cpBuilder = ConfluenceFactory.eINSTANCE.createBasicSymbolicCriticalPairBuilder();
		JointlyEpiSetBuilder jointlyEpiSetBuilder = AnalysisFactory.eINSTANCE.createStandartJointlyEpiSetBuilder();

		DirectDerivationPairSet criticalPairs = cpBuilder.getAllCriticalPairs(rule1, rule2, gts, jointlyEpiSetBuilder)
				.getDirectDerivationPairSet();
		assertTrue(criticalPairs.getPairsOfDirectDerivations().size() == 1);

	}

	@Test
	public void test2() {
		System.out.println("Starting CriticalPairTestProj/Test2");

		EPackage pack = TestRunner.loadTestMM("org.moflon.maave.tests.testgen.diachase", "Diachase");
		EClass cls = (EClass) pack.getEClassifier("CPATest");
		MoflonEOperation op1 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("noAttrRule1")).findFirst().get();
		MoflonEOperation op2 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("noAttrRule2")).findFirst().get();
		MoflonEOperation op3 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("noAttrRule3")).findFirst().get();
		StoryNode stn1 = (StoryNode) op1.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);
		StoryNode stn2 = (StoryNode) op2.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);
		StoryNode stn3 = (StoryNode) op3.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);

		Transformer transformer = StptransformationFactory.eINSTANCE.createTransformer();
		SymbGTRule rule1 = transformer.transformStpToProjGTRule(stn1.getStoryPattern());
		SymbGTRule rule2 = transformer.transformStpToProjGTRule(stn2.getStoryPattern());
		SymbGTRule rule3 = transformer.transformStpToProjGTRule(stn3.getStoryPattern());

		ConfigurableMorphismClassFactory morClassFac = MatchingUtilsFactory.eINSTANCE
				.createConfigurableMorphismClassFactory();

		GraphTransformationSystem gts = GraphtransformationFactory.eINSTANCE.createGraphTransformationSystem();
		gts.getRules().add(rule1);
		gts.getRules().add(rule2);
		gts.getRules().add(rule3);
		gts.setMatchMorphismClass(morClassFac.createMorphismClass("I", "I", "I", "I", "=>"));
		gts.setDirectDerivationBuilder(GraphtransformationFactory.eINSTANCE.createProjectiveDirectDerivationBuilder());

		ICriticalPairBuilder cpBuilder = ConfluenceFactory.eINSTANCE.createBasicSymbolicCriticalPairBuilder();
		JointlyEpiSetBuilder jointlyEpiSetBuilder = AnalysisFactory.eINSTANCE.createStandartJointlyEpiSetBuilder();
		DirectDerivationPairSet setNotEmpty = cpBuilder.getAllCriticalPairs(rule1, rule2, gts, jointlyEpiSetBuilder)
				.getDirectDerivationPairSet();
		DirectDerivationPairSet setEmpty = cpBuilder.getAllCriticalPairs(rule1, rule3, gts, jointlyEpiSetBuilder)
				.getDirectDerivationPairSet();

		Assert.assertTrue(setNotEmpty.getPairsOfDirectDerivations().size() > 0);
		Assert.assertTrue(setEmpty.getPairsOfDirectDerivations().size() == 0);

	}

	@Test
	public void test3() {
		System.out.println("Starting CriticalPairTestProj/Test3");

		EPackage pack = TestRunner.loadTestMM("org.moflon.maave.tests.testgen.diachase", "Diachase");
		EClass cls = (EClass) pack.getEClassifier("PaperExampleTest");
		MoflonEOperation op1 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("ruleAddOne")).findFirst().get();
		MoflonEOperation op2 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("ruleAddTwo")).findFirst().get();
		Assert.assertTrue("FailedAssert: 0", op1 != null && op2 != null);
		StoryNode stn1 = (StoryNode) op1.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);
		StoryNode stn2 = (StoryNode) op2.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);

		Transformer transformer = StptransformationFactory.eINSTANCE.createTransformer();
		SymbGTRule rule1 = transformer.transformStpToProjGTRule(stn1.getStoryPattern());
		SymbGTRule rule2 = transformer.transformStpToProjGTRule(stn2.getStoryPattern());

		ConfigurableMorphismClassFactory morClassFac = MatchingUtilsFactory.eINSTANCE
				.createConfigurableMorphismClassFactory();

		GraphTransformationSystem gts = GraphtransformationFactory.eINSTANCE.createGraphTransformationSystem();
		gts.getRules().add(rule1);
		gts.getRules().add(rule2);
		gts.setMatchMorphismClass(morClassFac.createMorphismClass("I", "I", "I", "I", "=>"));
		gts.setDirectDerivationBuilder(GraphtransformationFactory.eINSTANCE.createProjectiveDirectDerivationBuilder());

		ICriticalPairBuilder cpBuilder = ConfluenceFactory.eINSTANCE.createBasicSymbolicCriticalPairBuilder();

		JointlyEpiSetBuilder jointlyEpiSetBuilder = AnalysisFactory.eINSTANCE.createStandartJointlyEpiSetBuilder();
		DirectDerivationPairSet setNotEmpty = cpBuilder.getAllCriticalPairs(rule1, rule2, gts, jointlyEpiSetBuilder)
				.getDirectDerivationPairSet();
		Assert.assertTrue(setNotEmpty.getPairsOfDirectDerivations().size() > 0);
	}

	@Test
	public void test4() {
		System.out.println("Starting CriticalPairTestProj/Test4");

		EPackage pack = TestRunner.loadTestMM("org.moflon.maave.tests.testgen.diachase", "Diachase");
		EClass cls = (EClass) pack.getEClassifier("PaperExampleTest");
		MoflonEOperation op1 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("ruleTimes")).findFirst().get();
		MoflonEOperation op2 = (MoflonEOperation) cls.getEOperations().stream()
				.filter(x -> x.getName().equals("ruleAddTwo")).findFirst().get();
		Assert.assertTrue("FailedAssert: 0", op1 != null && op2 != null);
		StoryNode stn1 = (StoryNode) op1.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);
		StoryNode stn2 = (StoryNode) op2.getActivity().getOwnedActivityNode().stream()
				.filter(x -> x instanceof StoryNode).collect(Collectors.toList()).get(0);

		Transformer transformer = StptransformationFactory.eINSTANCE.createTransformer();
		SymbGTRule rule1 = transformer.transformStpToProjGTRule(stn1.getStoryPattern());
		SymbGTRule rule2 = transformer.transformStpToProjGTRule(stn2.getStoryPattern());

		ConfigurableMorphismClassFactory morClassFac = MatchingUtilsFactory.eINSTANCE
				.createConfigurableMorphismClassFactory();

		GraphTransformationSystem gts = GraphtransformationFactory.eINSTANCE.createGraphTransformationSystem();
		gts.getRules().add(rule1);
		gts.getRules().add(rule2);
		gts.setMatchMorphismClass(morClassFac.createMorphismClass("I", "I", "I", "I", "=>"));
		gts.setDirectDerivationBuilder(GraphtransformationFactory.eINSTANCE.createProjectiveDirectDerivationBuilder());
		ICriticalPairBuilder cpBuilder = ConfluenceFactory.eINSTANCE.createBasicSymbolicCriticalPairBuilder();

		JointlyEpiSetBuilder jointlyEpiSetBuilder = AnalysisFactory.eINSTANCE.createStandartJointlyEpiSetBuilder();
		DirectDerivationPairSet setNotEmpty = cpBuilder.getAllCriticalPairs(rule1, rule2, gts, jointlyEpiSetBuilder)
				.getDirectDerivationPairSet();
		Assert.assertTrue(setNotEmpty.getPairsOfDirectDerivations().size() > 0);
	}

}
