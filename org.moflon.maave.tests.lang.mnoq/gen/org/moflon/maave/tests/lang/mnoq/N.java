/**
 */
package org.moflon.maave.tests.lang.mnoq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>N</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.N#getMms <em>Mms</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.N#getQs <em>Qs</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.N#getFoo <em>Foo</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.N#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getN()
 * @model
 * @generated
 */
public interface N extends EObject {
	/**
	 * Returns the value of the '<em><b>Mms</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.mnoq.M}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.mnoq.M#getNns <em>Nns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mms</em>' reference list.
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getN_Mms()
	 * @see org.moflon.maave.tests.lang.mnoq.M#getNns
	 * @model opposite="nns"
	 * @generated
	 */
	EList<M> getMms();

	/**
	 * Returns the value of the '<em><b>Qs</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.mnoq.Q}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.mnoq.Q#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qs</em>' reference list.
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getN_Qs()
	 * @see org.moflon.maave.tests.lang.mnoq.Q#getNs
	 * @model opposite="ns"
	 * @generated
	 */
	EList<Q> getQs();

	/**
	 * Returns the value of the '<em><b>Foo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foo</em>' reference.
	 * @see #setFoo(Foo)
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getN_Foo()
	 * @model
	 * @generated
	 */
	Foo getFoo();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.mnoq.N#getFoo <em>Foo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foo</em>' reference.
	 * @see #getFoo()
	 * @generated
	 */
	void setFoo(Foo value);

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
	 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage#getN_X()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.mnoq.N#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // N
