/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Entry#getStudentId <em>Student Id</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Entry#getGrade <em>Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Student Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Id</em>' attribute.
	 * @see #setStudentId(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEntry_StudentId()
	 * @model ordered="false"
	 * @generated
	 */
	int getStudentId();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Entry#getStudentId <em>Student Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Id</em>' attribute.
	 * @see #getStudentId()
	 * @generated
	 */
	void setStudentId(int value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEntry_Grade()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getGrade();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Entry#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Entry
