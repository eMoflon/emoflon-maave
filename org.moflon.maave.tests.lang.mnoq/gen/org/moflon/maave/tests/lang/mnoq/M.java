/**
 */
package org.moflon.maave.tests.lang.mnoq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.M#getNns <em>Nns</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.M#getO <em>O</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.M#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getM()
 * @model
 * @generated
 */
public interface M extends EObject {
	/**
	 * Returns the value of the '<em><b>Nns</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.mnoq.N}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.mnoq.N#getMms <em>Mms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nns</em>' reference list.
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getM_Nns()
	 * @see org.moflon.maave.tests.lang.mnoq.N#getMms
	 * @model opposite="mms"
	 * @generated
	 */
	EList<N> getNns();

	/**
	 * Returns the value of the '<em><b>O</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>O</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O</em>' reference.
	 * @see #setO(O)
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getM_O()
	 * @model
	 * @generated
	 */
	O getO();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.mnoq.M#getO <em>O</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>O</em>' reference.
	 * @see #getO()
	 * @generated
	 */
	void setO(O value);

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
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getM_X()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.mnoq.M#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // M
