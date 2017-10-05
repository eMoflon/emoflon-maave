/**
 */
package org.moflon.maave.tests.testgen.diachase.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.maave.tests.testgen.diachase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.testgen.diachase.DiachasePackage
 * @generated
 */
public class DiachaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiachasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiachaseSwitch() {
		if (modelPackage == null) {
			modelPackage = DiachasePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DiachasePackage.ENUM_TEST_PATTERN: {
			EnumTestPattern enumTestPattern = (EnumTestPattern) theEObject;
			T result = caseEnumTestPattern(enumTestPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.PAPER_EXAMPLE_TEST: {
			PaperExampleTest paperExampleTest = (PaperExampleTest) theEObject;
			T result = casePaperExampleTest(paperExampleTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.DIA_CHASE_TEST_GEN: {
			DiaChaseTestGen diaChaseTestGen = (DiaChaseTestGen) theEObject;
			T result = caseDiaChaseTestGen(diaChaseTestGen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.PATTERN_GENERATOR: {
			PatternGenerator patternGenerator = (PatternGenerator) theEObject;
			T result = casePatternGenerator(patternGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.NAC_PATTERN_GENERATOR: {
			NacPatternGenerator nacPatternGenerator = (NacPatternGenerator) theEObject;
			T result = caseNacPatternGenerator(nacPatternGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.CPA_TEST: {
			CPATest cpaTest = (CPATest) theEObject;
			T result = caseCPATest(cpaTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.INITIAL_PUSHOUT_TEST: {
			InitialPushoutTest initialPushoutTest = (InitialPushoutTest) theEObject;
			T result = caseInitialPushoutTest(initialPushoutTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.CP_AWITH_NAC_TEST: {
			CPAwithNACTest cpAwithNACTest = (CPAwithNACTest) theEObject;
			T result = caseCPAwithNACTest(cpAwithNACTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.SYMBOLIC_PUSHOUT_COMPLEMENT: {
			SymbolicPushoutComplement symbolicPushoutComplement = (SymbolicPushoutComplement) theEObject;
			T result = caseSymbolicPushoutComplement(symbolicPushoutComplement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.PULLBACK_TEST: {
			PullbackTest pullbackTest = (PullbackTest) theEObject;
			T result = casePullbackTest(pullbackTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.DIRECT_DERIVATION_TEST_CASES: {
			DirectDerivationTestCases directDerivationTestCases = (DirectDerivationTestCases) theEObject;
			T result = caseDirectDerivationTestCases(directDerivationTestCases);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS: {
			NormalFormEquivalenceTestPatterns normalFormEquivalenceTestPatterns = (NormalFormEquivalenceTestPatterns) theEObject;
			T result = caseNormalFormEquivalenceTestPatterns(normalFormEquivalenceTestPatterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiachasePackage.MORPHISM_CLASS_TEST_PATTERNS: {
			MorphismClassTestPatterns morphismClassTestPatterns = (MorphismClassTestPatterns) theEObject;
			T result = caseMorphismClassTestPatterns(morphismClassTestPatterns);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Test Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Test Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumTestPattern(EnumTestPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paper Example Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paper Example Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaperExampleTest(PaperExampleTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dia Chase Test Gen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dia Chase Test Gen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiaChaseTestGen(DiaChaseTestGen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternGenerator(PatternGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nac Pattern Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nac Pattern Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNacPatternGenerator(NacPatternGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPA Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPA Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPATest(CPATest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Pushout Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Pushout Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialPushoutTest(InitialPushoutTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP Awith NAC Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP Awith NAC Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPAwithNACTest(CPAwithNACTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Pushout Complement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Pushout Complement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicPushoutComplement(SymbolicPushoutComplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pullback Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pullback Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePullbackTest(PullbackTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Derivation Test Cases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Derivation Test Cases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectDerivationTestCases(DirectDerivationTestCases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Form Equivalence Test Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Form Equivalence Test Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalFormEquivalenceTestPatterns(NormalFormEquivalenceTestPatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Morphism Class Test Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Morphism Class Test Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMorphismClassTestPatterns(MorphismClassTestPatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiachaseSwitch
