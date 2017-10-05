/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.degree#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.degree#isSuccessfull <em>Successfull</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getdegree()
 * @model
 * @generated
 */
public interface degree extends EObject {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(String)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getdegree_Degree()
	 * @model ordered="false"
	 * @generated
	 */
	String getDegree();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.degree#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(String value);

	/**
	 * Returns the value of the '<em><b>Successfull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successfull</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successfull</em>' attribute.
	 * @see #setSuccessfull(boolean)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getdegree_Successfull()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isSuccessfull();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.degree#isSuccessfull <em>Successfull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successfull</em>' attribute.
	 * @see #isSuccessfull()
	 * @generated
	 */
	void setSuccessfull(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // degree
