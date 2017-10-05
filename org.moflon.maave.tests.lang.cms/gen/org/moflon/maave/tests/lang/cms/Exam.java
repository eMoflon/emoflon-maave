/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Exam#getRegistrations <em>Registrations</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Exam#getGradeList <em>Grade List</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Exam#getLocation <em>Location</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Exam#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Exam#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Exam#getRegStudents <em>Reg Students</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Exam#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam()
 * @model
 * @generated
 */
public interface Exam extends EObject {
	/**
	 * Returns the value of the '<em><b>Registrations</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Record}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cms.Record#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registrations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrations</em>' reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam_Registrations()
	 * @see org.moflon.maave.tests.lang.cms.Record#getExam
	 * @model opposite="exam"
	 * @generated
	 */
	EList<Record> getRegistrations();

	/**
	 * Returns the value of the '<em><b>Grade List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade List</em>' containment reference.
	 * @see #setGradeList(GradeFormular)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam_GradeList()
	 * @model containment="true"
	 * @generated
	 */
	GradeFormular getGradeList();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Exam#getGradeList <em>Grade List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade List</em>' containment reference.
	 * @see #getGradeList()
	 * @generated
	 */
	void setGradeList(GradeFormular value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Booking)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam_Location()
	 * @model containment="true"
	 * @generated
	 */
	Booking getLocation();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Exam#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Booking value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(long)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam_Begin()
	 * @model ordered="false"
	 * @generated
	 */
	long getBegin();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Exam#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam_Duration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Exam#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Reg Students</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Students</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Students</em>' attribute.
	 * @see #setRegStudents(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam_RegStudents()
	 * @model ordered="false"
	 * @generated
	 */
	int getRegStudents();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Exam#getRegStudents <em>Reg Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Students</em>' attribute.
	 * @see #getRegStudents()
	 * @generated
	 */
	void setRegStudents(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.moflon.maave.tests.lang.cms.EX_STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cms.EX_STATE
	 * @see #setState(EX_STATE)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getExam_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EX_STATE getState();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Exam#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cms.EX_STATE
	 * @see #getState()
	 * @generated
	 */
	void setState(EX_STATE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bookRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transscriptRecordPassed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openREG_v2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void closeREG_v2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bookRoom_v2(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transscriptRecord_v2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void uploadRecords_v2(GradeFormular gradeFormular);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close_v2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transscriptRecordFailed();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Exam
