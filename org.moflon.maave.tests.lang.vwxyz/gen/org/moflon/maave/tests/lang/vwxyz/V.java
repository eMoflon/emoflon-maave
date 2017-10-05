/**
 */
package org.moflon.maave.tests.lang.vwxyz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>V</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.V#getW <em>W</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.V#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getV()
 * @model
 * @generated
 */
public interface V extends EObject {
	/**
	 * Returns the value of the '<em><b>W</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.vwxyz.W}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getV_W()
	 * @model containment="true"
	 * @generated
	 */
	EList<W> getW();

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
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getV_X()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.vwxyz.V#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // V
