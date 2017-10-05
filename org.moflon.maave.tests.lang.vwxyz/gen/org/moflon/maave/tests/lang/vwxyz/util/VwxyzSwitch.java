/**
 */
package org.moflon.maave.tests.lang.vwxyz.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.maave.tests.lang.vwxyz.*;

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
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage
 * @generated
 */
public class VwxyzSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VwxyzPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VwxyzSwitch() {
		if (modelPackage == null) {
			modelPackage = VwxyzPackage.eINSTANCE;
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
		case VwxyzPackage.V: {
			V v = (V) theEObject;
			T result = caseV(v);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VwxyzPackage.W: {
			W w = (W) theEObject;
			T result = caseW(w);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VwxyzPackage.X: {
			X x = (X) theEObject;
			T result = caseX(x);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VwxyzPackage.Y: {
			Y y = (Y) theEObject;
			T result = caseY(y);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VwxyzPackage.Z: {
			Z z = (Z) theEObject;
			T result = caseZ(z);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN: {
			CardinalityConstraintsTestPattern cardinalityConstraintsTestPattern = (CardinalityConstraintsTestPattern) theEObject;
			T result = caseCardinalityConstraintsTestPattern(cardinalityConstraintsTestPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VwxyzPackage.USER_DEFINED_CONSTRAINTS: {
			UserDefinedConstraints userDefinedConstraints = (UserDefinedConstraints) theEObject;
			T result = caseUserDefinedConstraints(userDefinedConstraints);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN: {
			ConstraintToPostConditionPattern constraintToPostConditionPattern = (ConstraintToPostConditionPattern) theEObject;
			T result = caseConstraintToPostConditionPattern(constraintToPostConditionPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV(V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>W</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>W</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW(W object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX(X object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseY(Y object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Z</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Z</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZ(Z object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Constraints Test Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Constraints Test Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityConstraintsTestPattern(CardinalityConstraintsTestPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedConstraints(UserDefinedConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint To Post Condition Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint To Post Condition Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintToPostConditionPattern(ConstraintToPostConditionPattern object) {
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

} //VwxyzSwitch
