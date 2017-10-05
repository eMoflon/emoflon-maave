/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.maave.tests.testgen.diachase.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiachaseFactoryImpl extends EFactoryImpl implements DiachaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiachaseFactory init() {
		try {
			DiachaseFactory theDiachaseFactory = (DiachaseFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiachasePackage.eNS_URI);
			if (theDiachaseFactory != null) {
				return theDiachaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiachaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiachaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DiachasePackage.ENUM_TEST_PATTERN:
			return createEnumTestPattern();
		case DiachasePackage.PAPER_EXAMPLE_TEST:
			return createPaperExampleTest();
		case DiachasePackage.DIA_CHASE_TEST_GEN:
			return createDiaChaseTestGen();
		case DiachasePackage.PATTERN_GENERATOR:
			return createPatternGenerator();
		case DiachasePackage.NAC_PATTERN_GENERATOR:
			return createNacPatternGenerator();
		case DiachasePackage.CPA_TEST:
			return createCPATest();
		case DiachasePackage.INITIAL_PUSHOUT_TEST:
			return createInitialPushoutTest();
		case DiachasePackage.CP_AWITH_NAC_TEST:
			return createCPAwithNACTest();
		case DiachasePackage.SYMBOLIC_PUSHOUT_COMPLEMENT:
			return createSymbolicPushoutComplement();
		case DiachasePackage.PULLBACK_TEST:
			return createPullbackTest();
		case DiachasePackage.DIRECT_DERIVATION_TEST_CASES:
			return createDirectDerivationTestCases();
		case DiachasePackage.NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS:
			return createNormalFormEquivalenceTestPatterns();
		case DiachasePackage.MORPHISM_CLASS_TEST_PATTERNS:
			return createMorphismClassTestPatterns();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTestPattern createEnumTestPattern() {
		EnumTestPatternImpl enumTestPattern = new EnumTestPatternImpl();
		return enumTestPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaperExampleTest createPaperExampleTest() {
		PaperExampleTestImpl paperExampleTest = new PaperExampleTestImpl();
		return paperExampleTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiaChaseTestGen createDiaChaseTestGen() {
		DiaChaseTestGenImpl diaChaseTestGen = new DiaChaseTestGenImpl();
		return diaChaseTestGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGenerator createPatternGenerator() {
		PatternGeneratorImpl patternGenerator = new PatternGeneratorImpl();
		return patternGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacPatternGenerator createNacPatternGenerator() {
		NacPatternGeneratorImpl nacPatternGenerator = new NacPatternGeneratorImpl();
		return nacPatternGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPATest createCPATest() {
		CPATestImpl cpaTest = new CPATestImpl();
		return cpaTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialPushoutTest createInitialPushoutTest() {
		InitialPushoutTestImpl initialPushoutTest = new InitialPushoutTestImpl();
		return initialPushoutTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPAwithNACTest createCPAwithNACTest() {
		CPAwithNACTestImpl cpAwithNACTest = new CPAwithNACTestImpl();
		return cpAwithNACTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicPushoutComplement createSymbolicPushoutComplement() {
		SymbolicPushoutComplementImpl symbolicPushoutComplement = new SymbolicPushoutComplementImpl();
		return symbolicPushoutComplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PullbackTest createPullbackTest() {
		PullbackTestImpl pullbackTest = new PullbackTestImpl();
		return pullbackTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectDerivationTestCases createDirectDerivationTestCases() {
		DirectDerivationTestCasesImpl directDerivationTestCases = new DirectDerivationTestCasesImpl();
		return directDerivationTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalFormEquivalenceTestPatterns createNormalFormEquivalenceTestPatterns() {
		NormalFormEquivalenceTestPatternsImpl normalFormEquivalenceTestPatterns = new NormalFormEquivalenceTestPatternsImpl();
		return normalFormEquivalenceTestPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MorphismClassTestPatterns createMorphismClassTestPatterns() {
		MorphismClassTestPatternsImpl morphismClassTestPatterns = new MorphismClassTestPatternsImpl();
		return morphismClassTestPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiachasePackage getDiachasePackage() {
		return (DiachasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiachasePackage getPackage() {
		return DiachasePackage.eINSTANCE;
	}

} //DiachaseFactoryImpl
