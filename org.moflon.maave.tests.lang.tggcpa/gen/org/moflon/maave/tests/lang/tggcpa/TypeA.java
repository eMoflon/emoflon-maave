/**
 */
package org.moflon.maave.tests.lang.tggcpa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.tggcpa.TypeA#getTransl <em>Transl</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.tggcpa.TypeA#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.tggcpa.TggcpaPackage#getTypeA()
 * @model
 * @generated
 */
public interface TypeA extends EObject {
	/**
	 * Returns the value of the '<em><b>Transl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transl</em>' reference.
	 * @see #setTransl(Transl)
	 * @see org.moflon.maave.tests.lang.tggcpa.TggcpaPackage#getTypeA_Transl()
	 * @model
	 * @generated
	 */
	Transl getTransl();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.tggcpa.TypeA#getTransl <em>Transl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transl</em>' reference.
	 * @see #getTransl()
	 * @generated
	 */
	void setTransl(Transl value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.tggcpa.TypeB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.moflon.maave.tests.lang.tggcpa.TggcpaPackage#getTypeA_Children()
	 * @model
	 * @generated
	 */
	EList<TypeB> getChildren();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TypeA
