/**
 */
package org.moflon.maave.tests.lang.abc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.abc.B#getA <em>A</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.abc.B#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.abc.AbcPackage#getB()
 * @model
 * @generated
 */
public interface B extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.abc.A}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.abc.A#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see org.moflon.maave.tests.lang.abc.AbcPackage#getB_A()
	 * @see org.moflon.maave.tests.lang.abc.A#getB
	 * @model opposite="b"
	 * @generated
	 */
	EList<A> getA();

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
	 * @see org.moflon.maave.tests.lang.abc.AbcPackage#getB_X()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.abc.B#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // B
