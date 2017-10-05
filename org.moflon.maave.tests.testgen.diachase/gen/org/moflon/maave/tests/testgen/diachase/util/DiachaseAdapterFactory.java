/**
 */
package org.moflon.maave.tests.testgen.diachase.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.maave.tests.testgen.diachase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.testgen.diachase.DiachasePackage
 * @generated
 */
public class DiachaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiachasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiachaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiachasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiachaseSwitch<Adapter> modelSwitch = new DiachaseSwitch<Adapter>() {
		@Override
		public Adapter caseEnumTestPattern(EnumTestPattern object) {
			return createEnumTestPatternAdapter();
		}

		@Override
		public Adapter casePaperExampleTest(PaperExampleTest object) {
			return createPaperExampleTestAdapter();
		}

		@Override
		public Adapter caseDiaChaseTestGen(DiaChaseTestGen object) {
			return createDiaChaseTestGenAdapter();
		}

		@Override
		public Adapter casePatternGenerator(PatternGenerator object) {
			return createPatternGeneratorAdapter();
		}

		@Override
		public Adapter caseNacPatternGenerator(NacPatternGenerator object) {
			return createNacPatternGeneratorAdapter();
		}

		@Override
		public Adapter caseCPATest(CPATest object) {
			return createCPATestAdapter();
		}

		@Override
		public Adapter caseInitialPushoutTest(InitialPushoutTest object) {
			return createInitialPushoutTestAdapter();
		}

		@Override
		public Adapter caseCPAwithNACTest(CPAwithNACTest object) {
			return createCPAwithNACTestAdapter();
		}

		@Override
		public Adapter caseSymbolicPushoutComplement(SymbolicPushoutComplement object) {
			return createSymbolicPushoutComplementAdapter();
		}

		@Override
		public Adapter casePullbackTest(PullbackTest object) {
			return createPullbackTestAdapter();
		}

		@Override
		public Adapter caseDirectDerivationTestCases(DirectDerivationTestCases object) {
			return createDirectDerivationTestCasesAdapter();
		}

		@Override
		public Adapter caseNormalFormEquivalenceTestPatterns(NormalFormEquivalenceTestPatterns object) {
			return createNormalFormEquivalenceTestPatternsAdapter();
		}

		@Override
		public Adapter caseMorphismClassTestPatterns(MorphismClassTestPatterns object) {
			return createMorphismClassTestPatternsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.EnumTestPattern <em>Enum Test Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.EnumTestPattern
	 * @generated
	 */
	public Adapter createEnumTestPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest <em>Paper Example Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest
	 * @generated
	 */
	public Adapter createPaperExampleTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen <em>Dia Chase Test Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen
	 * @generated
	 */
	public Adapter createDiaChaseTestGenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator <em>Pattern Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator
	 * @generated
	 */
	public Adapter createPatternGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator <em>Nac Pattern Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator
	 * @generated
	 */
	public Adapter createNacPatternGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.CPATest <em>CPA Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.CPATest
	 * @generated
	 */
	public Adapter createCPATestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest <em>Initial Pushout Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest
	 * @generated
	 */
	public Adapter createInitialPushoutTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.CPAwithNACTest <em>CP Awith NAC Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.CPAwithNACTest
	 * @generated
	 */
	public Adapter createCPAwithNACTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement <em>Symbolic Pushout Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement
	 * @generated
	 */
	public Adapter createSymbolicPushoutComplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.PullbackTest <em>Pullback Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.PullbackTest
	 * @generated
	 */
	public Adapter createPullbackTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases <em>Direct Derivation Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases
	 * @generated
	 */
	public Adapter createDirectDerivationTestCasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns <em>Normal Form Equivalence Test Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns
	 * @generated
	 */
	public Adapter createNormalFormEquivalenceTestPatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns <em>Morphism Class Test Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns
	 * @generated
	 */
	public Adapter createMorphismClassTestPatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiachaseAdapterFactory
