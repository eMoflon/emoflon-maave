/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Student#getEnrollment <em>Enrollment</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Student#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Enrollment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cms.Enrollment#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrollment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrollment</em>' containment reference.
	 * @see #setEnrollment(Enrollment)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getStudent_Enrollment()
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	Enrollment getEnrollment();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Student#getEnrollment <em>Enrollment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment</em>' containment reference.
	 * @see #getEnrollment()
	 * @generated
	 */
	void setEnrollment(Enrollment value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getStudent_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Student#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Student
