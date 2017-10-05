/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecture Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.LectureManagement#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.LectureManagement#getCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getLectureManagement()
 * @model
 * @generated
 */
public interface LectureManagement extends Module {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Semester}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semesters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getLectureManagement_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(Semester)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getLectureManagement_Current()
	 * @model
	 * @generated
	 */
	Semester getCurrent();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.LectureManagement#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(Semester value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LectureManagement
