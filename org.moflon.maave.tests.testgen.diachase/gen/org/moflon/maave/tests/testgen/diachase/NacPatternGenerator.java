/**
 */
package org.moflon.maave.tests.testgen.diachase;

import org.eclipse.emf.ecore.EObject;

import org.moflon.maave.tests.lang.abc.A;
import org.moflon.maave.tests.lang.abc.C;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nac Pattern Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.maave.tests.testgen.diachase.DiachasePackage#getNacPatternGenerator()
 * @model
 * @generated
 */
public interface NacPatternGenerator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern1Valid(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern1Invalid(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern2InvalidA(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern2InvalidB(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern2InvalidC(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern2valid(C c, A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern4Invalid(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void instanceTestPattern4valid(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nacTestPattern1(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nacTestPattern2(C c1, A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nacTestPattern3(A a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void nacTestPattern4(A a);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NacPatternGenerator
