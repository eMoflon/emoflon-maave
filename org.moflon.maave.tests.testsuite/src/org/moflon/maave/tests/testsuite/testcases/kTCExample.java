package org.moflon.maave.tests.testsuite.testcases;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;
import org.moflon.maave.tests.testsuite.helper.ModelHelper;
import org.moflon.maave.tool.analysis.confluence.ConfluenceAnalysisReport;
import org.moflon.maave.tool.analysis.confluence.ConfluenceFactory;
import org.moflon.maave.tool.analysis.confluence.SubcommutativityModuloNFEQAnalyser;
import org.moflon.maave.tool.graphtransformation.GlobalConstraint;
import org.moflon.maave.tool.graphtransformation.GraphTransformationSystem;
import org.moflon.maave.tool.graphtransformation.GraphtransformationFactory;
import org.moflon.maave.tool.graphtransformation.SymbGTRule;
import org.moflon.maave.tool.sdm.stptransformation.MetaModelConstraintBuilder;
import org.moflon.maave.tool.sdm.stptransformation.StptransformationFactory;
import org.moflon.maave.tool.symbolicgraphs.secondorder.matching.MatchingUtils.ConfigurableMorphismClassFactory;
import org.moflon.maave.tool.symbolicgraphs.secondorder.matching.MatchingUtils.MatchingUtilsFactory;

import de.tudarmstadt.maki.modeling.jvlc.JvlcPackage;

/**
 * Setup instructions * Confirmed to work with eMoflon 2.31.0 * VM Arguments
 * (for Z3) *
 * -Djava.library.path=${workspace_loc}/org.moflon.maave.tool.smt.z3/lib/z3-4.3.2-x64-win/bin
 * *
 * PATH=${workspace_loc}/org.moflon.maave.tool.smt.z3/lib/z3-4.3.2-x64-win/bin;${env_var:PATH}
 * *
 * java.library.path=${workspace_loc}/org.moflon.maave.tool.smt.z3/lib/z3-4.3.2-x64-win/bin
 * * CurrentWSLoc=${workspace_loc}
 * 
 * @author Frederik Deckwerth
 * @author Roland Kluge - Initial implementation
 *
 */
public class kTCExample {
	@Test
	public void testBatchKTC() {
		System.out.println("Started at " + new Date());
		System.out.println("");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Starting kTCExample/testBatchKTC");

		JvlcPackage.eINSTANCE.getClass();
		EPackage pack = TestRunner.loadTestMM("de.tudarmstadt.maki.modeling.jvlc", "Jvlc");
		EClass clsSemester = (EClass) pack.getEClassifier("DistanceKTC");
		SymbGTRule rule1 = ModelHelper.getPattern(clsSemester, "runOnNode", "FindTriangle");
		// SymbGTRule rule2 = ModelHelper.getPattern(clsSemester, "runOnNode",
		// "FindTriangle2");
		ConfigurableMorphismClassFactory morClassFac = MatchingUtilsFactory.eINSTANCE
				.createConfigurableMorphismClassFactory();

		GraphTransformationSystem gts = GraphtransformationFactory.eINSTANCE.createGraphTransformationSystem();
		gts.getRules().add(rule1);
		// gts.getRules().add(rule2);

		gts.setMatchMorphismClass(morClassFac.createMorphismClass("I", "I", "I", "I", "=>"));
		gts.setDirectDerivationBuilder(GraphtransformationFactory.eINSTANCE.createProjectiveDirectDerivationBuilder());

		// Add ArityConstraints
		MetaModelConstraintBuilder constraintBuilder = StptransformationFactory.eINSTANCE
				.createMetaModelConstraintBuilder();
		GlobalConstraint mmC = constraintBuilder.buildConstraints(pack);
		gts.getGlobalConstraints().add(mmC);
		// Add user defined constraints
		/*
		 * Instructions - Create a class 'UserDefinedConstraints' - Operations starting
		 * with '_NC_' - In each operation: SDM with single pattern that specifies
		 * **valid** metamodel instances
		 */
		gts.getGlobalConstraints().add(ModelHelper.getUserDefConstraints(pack));

		SubcommutativityModuloNFEQAnalyser directConfluenceAnalyser = ConfluenceFactory.eINSTANCE
				.createSubcommutativityModuloNFEQAnalyser();
		ConfluenceAnalysisReport report = directConfluenceAnalyser.checkConfluence(gts);
		System.out.println(report);

		// System.out.println(ConfluenceAnalysisResultPrinter.printConfluenceReport(report,
		// true, false, true, true));

		System.out.println("Finished at " + new Date());

	}

}