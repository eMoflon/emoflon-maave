/**
 */
package org.moflon.maave.tests.lang.mnoq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Q</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.Q#getNs <em>Ns</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.Q#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getQ()
 * @model
 * @generated
 */
public interface Q extends EObject {
	/**
	 * Returns the value of the '<em><b>Ns</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.mnoq.N}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.mnoq.N#getQs <em>Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns</em>' reference list.
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getQ_Ns()
	 * @see org.moflon.maave.tests.lang.mnoq.N#getQs
	 * @model opposite="qs"
	 * @generated
	 */
	EList<N> getNs();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getQ_X()
	 * @model ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.mnoq.Q#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Q
