/**
 */
package org.moflon.maave.tests.lang.vwxyz;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.Y#getW <em>W</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.Y#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getY()
 * @model
 * @generated
 */
public interface Y extends EObject {
	/**
	 * Returns the value of the '<em><b>W</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.vwxyz.W#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' reference.
	 * @see #setW(W)
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getY_W()
	 * @see org.moflon.maave.tests.lang.vwxyz.W#getY
	 * @model opposite="y"
	 * @generated
	 */
	W getW();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.vwxyz.Y#getW <em>W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' reference.
	 * @see #getW()
	 * @generated
	 */
	void setW(W value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Y)
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getY_Next()
	 * @model
	 * @generated
	 */
	Y getNext();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.vwxyz.Y#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Y value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Y
