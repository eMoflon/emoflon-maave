/**
 */
package org.moflon.maave.tests.lang.vwxyz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>W</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.W#getX <em>X</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.W#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getW()
 * @model
 * @generated
 */
public interface W extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(X)
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getW_X()
	 * @model containment="true"
	 * @generated
	 */
	X getX();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.vwxyz.W#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(X value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.vwxyz.Y}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.vwxyz.Y#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' reference list.
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getW_Y()
	 * @see org.moflon.maave.tests.lang.vwxyz.Y#getW
	 * @model opposite="w"
	 * @generated
	 */
	EList<Y> getY();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // W
