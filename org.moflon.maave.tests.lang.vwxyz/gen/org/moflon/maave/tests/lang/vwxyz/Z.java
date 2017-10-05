/**
 */
package org.moflon.maave.tests.lang.vwxyz;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Z</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.Z#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.Z#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getZ()
 * @model
 * @generated
 */
public interface Z extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.vwxyz.Z#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Z)
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getZ_Next()
	 * @see org.moflon.maave.tests.lang.vwxyz.Z#getPrevious
	 * @model opposite="previous" containment="true"
	 * @generated
	 */
	Z getNext();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.vwxyz.Z#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Z value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.vwxyz.Z#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' container reference.
	 * @see #setPrevious(Z)
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#getZ_Previous()
	 * @see org.moflon.maave.tests.lang.vwxyz.Z#getNext
	 * @model opposite="next" transient="false"
	 * @generated
	 */
	Z getPrevious();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.vwxyz.Z#getPrevious <em>Previous</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' container reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Z value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Z
