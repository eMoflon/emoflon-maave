/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage;

import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage;

import org.moflon.maave.tests.lang.abc.AbcPackage;

import org.moflon.maave.tests.lang.enumlang.EnumlangPackage;

import org.moflon.maave.tests.lang.mnoq.MnoqPackage;

import org.moflon.maave.tests.testgen.diachase.CPATest;
import org.moflon.maave.tests.testgen.diachase.CPAwithNACTest;
import org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen;
import org.moflon.maave.tests.testgen.diachase.DiachaseFactory;
import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases;
import org.moflon.maave.tests.testgen.diachase.EnumTestPattern;
import org.moflon.maave.tests.testgen.diachase.InitialPushoutTest;
import org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns;
import org.moflon.maave.tests.testgen.diachase.NacPatternGenerator;
import org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns;
import org.moflon.maave.tests.testgen.diachase.PaperExampleTest;
import org.moflon.maave.tests.testgen.diachase.PatternGenerator;
import org.moflon.maave.tests.testgen.diachase.PullbackTest;
import org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiachasePackageImpl extends EPackageImpl implements DiachasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTestPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paperExampleTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diaChaseTestGenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nacPatternGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpaTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialPushoutTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpAwithNACTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolicPushoutComplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pullbackTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directDerivationTestCasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalFormEquivalenceTestPatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass morphismClassTestPatternsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.moflon.maave.tests.testgen.diachase.DiachasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiachasePackageImpl() {
		super(eNS_URI, DiachaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiachasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiachasePackage init() {
		if (isInited)
			return (DiachasePackage) EPackage.Registry.INSTANCE.getEPackage(DiachasePackage.eNS_URI);

		// Obtain or create and register package
		DiachasePackageImpl theDiachasePackage = (DiachasePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DiachasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new DiachasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFTypePackage.eINSTANCE.eClass();
		RelationalConstraintPackage.eINSTANCE.eClass();
		EnumlangPackage.eINSTANCE.eClass();
		MnoqPackage.eINSTANCE.eClass();
		AbcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDiachasePackage.createPackageContents();

		// Initialize created meta-data
		theDiachasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiachasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiachasePackage.eNS_URI, theDiachasePackage);
		return theDiachasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumTestPattern() {
		return enumTestPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumTestPattern__TestPattern1__E() {
		return enumTestPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaperExampleTest() {
		return paperExampleTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaperExampleTest__RuleAddOne__N() {
		return paperExampleTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaperExampleTest__RuleAddTwo__N() {
		return paperExampleTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaperExampleTest__RuleLarger4__N() {
		return paperExampleTestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaperExampleTest__RuleSmaller4__N() {
		return paperExampleTestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaperExampleTest__RuleTimes__N() {
		return paperExampleTestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaperExampleTest__RuleLarger4AddTwo__N() {
		return paperExampleTestEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiaChaseTestGen() {
		return diaChaseTestGenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPattern__N() {
		return diaChaseTestGenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternA__M_N() {
		return diaChaseTestGenEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternA2__M_N() {
		return diaChaseTestGenEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternB__Q_M_N() {
		return diaChaseTestGenEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternB2__Q_M_N() {
		return diaChaseTestGenEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternC__M_O_N() {
		return diaChaseTestGenEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternC2__M_O_N() {
		return diaChaseTestGenEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestModel__N() {
		return diaChaseTestGenEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternAdd__N() {
		return diaChaseTestGenEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternLarger4__N() {
		return diaChaseTestGenEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternSmaller5__N() {
		return diaChaseTestGenEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestPatternTempVar__N() {
		return diaChaseTestGenEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiaChaseTestGen__TestRule__N() {
		return diaChaseTestGenEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternGenerator() {
		return patternGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern1__A() {
		return patternGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern2__A() {
		return patternGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern3__A() {
		return patternGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern4__A() {
		return patternGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern5__A() {
		return patternGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern6__A() {
		return patternGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern7__A() {
		return patternGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternGenerator__TestPattern8__A() {
		return patternGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNacPatternGenerator() {
		return nacPatternGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern1Valid__A() {
		return nacPatternGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern1Invalid__A() {
		return nacPatternGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern2InvalidA__A() {
		return nacPatternGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern2InvalidB__A() {
		return nacPatternGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern2InvalidC__A() {
		return nacPatternGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern2valid__C_A() {
		return nacPatternGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern4Invalid__A() {
		return nacPatternGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__InstanceTestPattern4valid__A() {
		return nacPatternGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__NacTestPattern1__A() {
		return nacPatternGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__NacTestPattern2__C_A() {
		return nacPatternGeneratorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__NacTestPattern3__A() {
		return nacPatternGeneratorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNacPatternGenerator__NacTestPattern4__A() {
		return nacPatternGeneratorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPATest() {
		return cpaTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPATest__NoAttrRule2__N() {
		return cpaTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPATest__NoAttrRule1__N() {
		return cpaTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPATest__NoAttrRule3__N() {
		return cpaTestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialPushoutTest() {
		return initialPushoutTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestPattern1__N() {
		return initialPushoutTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestModel1__N() {
		return initialPushoutTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestPattern2__N() {
		return initialPushoutTestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestModel2__N() {
		return initialPushoutTestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestRule1__N() {
		return initialPushoutTestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestModel3__N() {
		return initialPushoutTestEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestModel4__N() {
		return initialPushoutTestEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialPushoutTest__TestRule4__N() {
		return initialPushoutTestEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPAwithNACTest() {
		return cpAwithNACTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPAwithNACTest__Rule1__N() {
		return cpAwithNACTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPAwithNACTest__Rule2__N() {
		return cpAwithNACTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolicPushoutComplement() {
		return symbolicPushoutComplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymbolicPushoutComplement__Rule1__N() {
		return symbolicPushoutComplementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPullbackTest() {
		return pullbackTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPullbackTest__TestPatternD__N() {
		return pullbackTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPullbackTest__TestPatternC__N() {
		return pullbackTestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPullbackTest__TestPatternB__N() {
		return pullbackTestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectDerivationTestCases() {
		return directDerivationTestCasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectDerivationTestCases__EmptyRule() {
		return directDerivationTestCasesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectDerivationTestCases__TestRule1__M() {
		return directDerivationTestCasesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectDerivationTestCases__TestModel1__M() {
		return directDerivationTestCasesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectDerivationTestCases__TestModel2__M() {
		return directDerivationTestCasesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectDerivationTestCases__TestModel3__M() {
		return directDerivationTestCasesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalFormEquivalenceTestPatterns() {
		return normalFormEquivalenceTestPatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalFormEquivalenceTestPatterns__TestPattern1__N_N() {
		return normalFormEquivalenceTestPatternsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalFormEquivalenceTestPatterns__TestPattern2__N_N() {
		return normalFormEquivalenceTestPatternsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalFormEquivalenceTestPatterns__TestPattern3__N_N() {
		return normalFormEquivalenceTestPatternsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNormalFormEquivalenceTestPatterns__TestPattern4__N_N() {
		return normalFormEquivalenceTestPatternsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMorphismClassTestPatterns() {
		return morphismClassTestPatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMorphismClassTestPatterns__TestPattern1__N() {
		return morphismClassTestPatternsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMorphismClassTestPatterns__TestPattern2__N() {
		return morphismClassTestPatternsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMorphismClassTestPatterns__TestPattern3__N() {
		return morphismClassTestPatternsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiachaseFactory getDiachaseFactory() {
		return (DiachaseFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		enumTestPatternEClass = createEClass(ENUM_TEST_PATTERN);
		createEOperation(enumTestPatternEClass, ENUM_TEST_PATTERN___TEST_PATTERN1__E);

		paperExampleTestEClass = createEClass(PAPER_EXAMPLE_TEST);
		createEOperation(paperExampleTestEClass, PAPER_EXAMPLE_TEST___RULE_ADD_ONE__N);
		createEOperation(paperExampleTestEClass, PAPER_EXAMPLE_TEST___RULE_ADD_TWO__N);
		createEOperation(paperExampleTestEClass, PAPER_EXAMPLE_TEST___RULE_LARGER4__N);
		createEOperation(paperExampleTestEClass, PAPER_EXAMPLE_TEST___RULE_SMALLER4__N);
		createEOperation(paperExampleTestEClass, PAPER_EXAMPLE_TEST___RULE_TIMES__N);
		createEOperation(paperExampleTestEClass, PAPER_EXAMPLE_TEST___RULE_LARGER4_ADD_TWO__N);

		diaChaseTestGenEClass = createEClass(DIA_CHASE_TEST_GEN);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN__N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_A__M_N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_A2__M_N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_B__Q_M_N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_B2__Q_M_N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_C__M_O_N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_C2__M_O_N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_MODEL__N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_ADD__N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_LARGER4__N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_SMALLER5__N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_PATTERN_TEMP_VAR__N);
		createEOperation(diaChaseTestGenEClass, DIA_CHASE_TEST_GEN___TEST_RULE__N);

		patternGeneratorEClass = createEClass(PATTERN_GENERATOR);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN1__A);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN2__A);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN3__A);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN4__A);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN5__A);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN6__A);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN7__A);
		createEOperation(patternGeneratorEClass, PATTERN_GENERATOR___TEST_PATTERN8__A);

		nacPatternGeneratorEClass = createEClass(NAC_PATTERN_GENERATOR);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_VALID__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_INVALID__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_A__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_B__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_C__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2VALID__C_A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4_INVALID__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4VALID__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN1__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN2__C_A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN3__A);
		createEOperation(nacPatternGeneratorEClass, NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN4__A);

		cpaTestEClass = createEClass(CPA_TEST);
		createEOperation(cpaTestEClass, CPA_TEST___NO_ATTR_RULE2__N);
		createEOperation(cpaTestEClass, CPA_TEST___NO_ATTR_RULE1__N);
		createEOperation(cpaTestEClass, CPA_TEST___NO_ATTR_RULE3__N);

		initialPushoutTestEClass = createEClass(INITIAL_PUSHOUT_TEST);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_PATTERN1__N);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_MODEL1__N);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_PATTERN2__N);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_MODEL2__N);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_RULE1__N);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_MODEL3__N);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_MODEL4__N);
		createEOperation(initialPushoutTestEClass, INITIAL_PUSHOUT_TEST___TEST_RULE4__N);

		cpAwithNACTestEClass = createEClass(CP_AWITH_NAC_TEST);
		createEOperation(cpAwithNACTestEClass, CP_AWITH_NAC_TEST___RULE1__N);
		createEOperation(cpAwithNACTestEClass, CP_AWITH_NAC_TEST___RULE2__N);

		symbolicPushoutComplementEClass = createEClass(SYMBOLIC_PUSHOUT_COMPLEMENT);
		createEOperation(symbolicPushoutComplementEClass, SYMBOLIC_PUSHOUT_COMPLEMENT___RULE1__N);

		pullbackTestEClass = createEClass(PULLBACK_TEST);
		createEOperation(pullbackTestEClass, PULLBACK_TEST___TEST_PATTERN_D__N);
		createEOperation(pullbackTestEClass, PULLBACK_TEST___TEST_PATTERN_C__N);
		createEOperation(pullbackTestEClass, PULLBACK_TEST___TEST_PATTERN_B__N);

		directDerivationTestCasesEClass = createEClass(DIRECT_DERIVATION_TEST_CASES);
		createEOperation(directDerivationTestCasesEClass, DIRECT_DERIVATION_TEST_CASES___EMPTY_RULE);
		createEOperation(directDerivationTestCasesEClass, DIRECT_DERIVATION_TEST_CASES___TEST_RULE1__M);
		createEOperation(directDerivationTestCasesEClass, DIRECT_DERIVATION_TEST_CASES___TEST_MODEL1__M);
		createEOperation(directDerivationTestCasesEClass, DIRECT_DERIVATION_TEST_CASES___TEST_MODEL2__M);
		createEOperation(directDerivationTestCasesEClass, DIRECT_DERIVATION_TEST_CASES___TEST_MODEL3__M);

		normalFormEquivalenceTestPatternsEClass = createEClass(NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS);
		createEOperation(normalFormEquivalenceTestPatternsEClass,
				NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN1__N_N);
		createEOperation(normalFormEquivalenceTestPatternsEClass,
				NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN2__N_N);
		createEOperation(normalFormEquivalenceTestPatternsEClass,
				NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN3__N_N);
		createEOperation(normalFormEquivalenceTestPatternsEClass,
				NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN4__N_N);

		morphismClassTestPatternsEClass = createEClass(MORPHISM_CLASS_TEST_PATTERNS);
		createEOperation(morphismClassTestPatternsEClass, MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN1__N);
		createEOperation(morphismClassTestPatternsEClass, MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN2__N);
		createEOperation(morphismClassTestPatternsEClass, MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN3__N);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnumlangPackage theEnumlangPackage = (EnumlangPackage) EPackage.Registry.INSTANCE
				.getEPackage(EnumlangPackage.eNS_URI);
		MnoqPackage theMnoqPackage = (MnoqPackage) EPackage.Registry.INSTANCE.getEPackage(MnoqPackage.eNS_URI);
		AbcPackage theAbcPackage = (AbcPackage) EPackage.Registry.INSTANCE.getEPackage(AbcPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(enumTestPatternEClass, EnumTestPattern.class, "EnumTestPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEnumTestPattern__TestPattern1__E(), null, "testPattern1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theEnumlangPackage.getE(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paperExampleTestEClass, PaperExampleTest.class, "PaperExampleTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPaperExampleTest__RuleAddOne__N(), null, "ruleAddOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPaperExampleTest__RuleAddTwo__N(), null, "ruleAddTwo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPaperExampleTest__RuleLarger4__N(), null, "ruleLarger4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "k", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPaperExampleTest__RuleSmaller4__N(), null, "ruleSmaller4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPaperExampleTest__RuleTimes__N(), null, "ruleTimes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPaperExampleTest__RuleLarger4AddTwo__N(), null, "ruleLarger4AddTwo", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "k", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diaChaseTestGenEClass, DiaChaseTestGen.class, "DiaChaseTestGen", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDiaChaseTestGen__TestPattern__N(), null, "testPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternA__M_N(), null, "testPatternA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "mA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nA", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternA2__M_N(), null, "testPatternA2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "mA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nA", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternB__Q_M_N(), null, "testPatternB", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getQ(), "qB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "mB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nB", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternB2__Q_M_N(), null, "testPatternB2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getQ(), "qB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "mB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nB", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternC__M_O_N(), null, "testPatternC", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "mC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getO(), "oC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nC", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternC2__M_O_N(), null, "testPatternC2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "mC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getO(), "oC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nC", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestModel__N(), null, "testModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternAdd__N(), null, "testPatternAdd", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternLarger4__N(), null, "testPatternLarger4", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternSmaller5__N(), null, "testPatternSmaller5", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestPatternTempVar__N(), null, "testPatternTempVar", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiaChaseTestGen__TestRule__N(), null, "testRule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nRule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(patternGeneratorEClass, PatternGenerator.class, "PatternGenerator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPatternGenerator__TestPattern1__A(), null, "testPattern1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternGenerator__TestPattern2__A(), null, "testPattern2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternGenerator__TestPattern3__A(), null, "testPattern3", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternGenerator__TestPattern4__A(), null, "testPattern4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternGenerator__TestPattern5__A(), null, "testPattern5", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternGenerator__TestPattern6__A(), null, "testPattern6", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternGenerator__TestPattern7__A(), null, "testPattern7", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternGenerator__TestPattern8__A(), null, "testPattern8", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nacPatternGeneratorEClass, NacPatternGenerator.class, "NacPatternGenerator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern1Valid__A(), null, "instanceTestPattern1Valid",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern1Invalid__A(), null,
				"instanceTestPattern1Invalid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern2InvalidA__A(), null,
				"instanceTestPattern2InvalidA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern2InvalidB__A(), null,
				"instanceTestPattern2InvalidB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern2InvalidC__A(), null,
				"instanceTestPattern2InvalidC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern2valid__C_A(), null, "instanceTestPattern2valid",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getC(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern4Invalid__A(), null,
				"instanceTestPattern4Invalid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__InstanceTestPattern4valid__A(), null, "instanceTestPattern4valid",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__NacTestPattern1__A(), null, "nacTestPattern1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__NacTestPattern2__C_A(), null, "nacTestPattern2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theAbcPackage.getC(), "c1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__NacTestPattern3__A(), null, "nacTestPattern3", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNacPatternGenerator__NacTestPattern4__A(), null, "nacTestPattern4", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theAbcPackage.getA(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cpaTestEClass, CPATest.class, "CPATest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCPATest__NoAttrRule2__N(), null, "noAttrRule2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCPATest__NoAttrRule1__N(), null, "noAttrRule1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCPATest__NoAttrRule3__N(), null, "noAttrRule3", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n3", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(initialPushoutTestEClass, InitialPushoutTest.class, "InitialPushoutTest", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getInitialPushoutTest__TestPattern1__N(), null, "testPattern1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nP1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialPushoutTest__TestModel1__N(), null, "testModel1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nM1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialPushoutTest__TestPattern2__N(), null, "testPattern2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nP1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialPushoutTest__TestModel2__N(), null, "testModel2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nM1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialPushoutTest__TestRule1__N(), null, "testRule1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nP1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialPushoutTest__TestModel3__N(), null, "testModel3", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nM1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialPushoutTest__TestModel4__N(), null, "testModel4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nM1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialPushoutTest__TestRule4__N(), null, "testRule4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "nM1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cpAwithNACTestEClass, CPAwithNACTest.class, "CPAwithNACTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCPAwithNACTest__Rule1__N(), null, "rule1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCPAwithNACTest__Rule2__N(), null, "rule2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(symbolicPushoutComplementEClass, SymbolicPushoutComplement.class, "SymbolicPushoutComplement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSymbolicPushoutComplement__Rule1__N(), null, "rule1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pullbackTestEClass, PullbackTest.class, "PullbackTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPullbackTest__TestPatternD__N(), null, "testPatternD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPullbackTest__TestPatternC__N(), null, "testPatternC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPullbackTest__TestPatternB__N(), null, "testPatternB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(directDerivationTestCasesEClass, DirectDerivationTestCases.class, "DirectDerivationTestCases",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDirectDerivationTestCases__EmptyRule(), null, "emptyRule", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectDerivationTestCases__TestRule1__M(), null, "testRule1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectDerivationTestCases__TestModel1__M(), null, "testModel1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectDerivationTestCases__TestModel2__M(), null, "testModel2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectDerivationTestCases__TestModel3__M(), null, "testModel3", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getM(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(normalFormEquivalenceTestPatternsEClass, NormalFormEquivalenceTestPatterns.class,
				"NormalFormEquivalenceTestPatterns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNormalFormEquivalenceTestPatterns__TestPattern1__N_N(), null, "testPattern1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNormalFormEquivalenceTestPatterns__TestPattern2__N_N(), null, "testPattern2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNormalFormEquivalenceTestPatterns__TestPattern3__N_N(), null, "testPattern3", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNormalFormEquivalenceTestPatterns__TestPattern4__N_N(), null, "testPattern4", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(morphismClassTestPatternsEClass, MorphismClassTestPatterns.class, "MorphismClassTestPatterns",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMorphismClassTestPatterns__TestPattern1__N(), null, "testPattern1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMorphismClassTestPatterns__TestPattern2__N(), null, "testPattern2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMorphismClassTestPatterns__TestPattern3__N(), null, "testPattern3", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMnoqPackage.getN(), "n1", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DiachasePackageImpl
