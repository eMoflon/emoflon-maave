/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.CMS#getProgramManagement <em>Program Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.CMS#getRoomManagement <em>Room Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.CMS#getStrudentManagements <em>Strudent Managements</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.CMS#getCourseManagement <em>Course Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.CMS#getCurrentDate <em>Current Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getCMS()
 * @model
 * @generated
 */
public interface CMS extends EObject {
	/**
	 * Returns the value of the '<em><b>Program Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Management</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Management</em>' containment reference.
	 * @see #setProgramManagement(ProgramManagement)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getCMS_ProgramManagement()
	 * @model containment="true"
	 * @generated
	 */
	ProgramManagement getProgramManagement();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.CMS#getProgramManagement <em>Program Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Management</em>' containment reference.
	 * @see #getProgramManagement()
	 * @generated
	 */
	void setProgramManagement(ProgramManagement value);

	/**
	 * Returns the value of the '<em><b>Room Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Management</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Management</em>' containment reference.
	 * @see #setRoomManagement(RoomManagement)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getCMS_RoomManagement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RoomManagement getRoomManagement();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.CMS#getRoomManagement <em>Room Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Management</em>' containment reference.
	 * @see #getRoomManagement()
	 * @generated
	 */
	void setRoomManagement(RoomManagement value);

	/**
	 * Returns the value of the '<em><b>Strudent Managements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strudent Managements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strudent Managements</em>' containment reference.
	 * @see #setStrudentManagements(StrudentAffairs)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getCMS_StrudentManagements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StrudentAffairs getStrudentManagements();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.CMS#getStrudentManagements <em>Strudent Managements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strudent Managements</em>' containment reference.
	 * @see #getStrudentManagements()
	 * @generated
	 */
	void setStrudentManagements(StrudentAffairs value);

	/**
	 * Returns the value of the '<em><b>Course Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Management</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Management</em>' containment reference.
	 * @see #setCourseManagement(LectureManagement)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getCMS_CourseManagement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LectureManagement getCourseManagement();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.CMS#getCourseManagement <em>Course Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Management</em>' containment reference.
	 * @see #getCourseManagement()
	 * @generated
	 */
	void setCourseManagement(LectureManagement value);

	/**
	 * Returns the value of the '<em><b>Current Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Date</em>' attribute.
	 * @see #setCurrentDate(long)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getCMS_CurrentDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getCurrentDate();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.CMS#getCurrentDate <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Date</em>' attribute.
	 * @see #getCurrentDate()
	 * @generated
	 */
	void setCurrentDate(long value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CMS
