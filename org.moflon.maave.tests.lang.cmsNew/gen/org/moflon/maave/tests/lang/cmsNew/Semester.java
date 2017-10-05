/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getLectureMan <em>Lecture Man</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getExams <em>Exams</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getOfferedLectures <em>Offered Lectures</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStart <em>Reg Period Start</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStop <em>Reg Period Stop</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#isCurrent <em>Current</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Semester#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Lecture Man</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecture Man</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Man</em>' container reference.
	 * @see #setLectureMan(CourseManagement)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_LectureMan()
	 * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	CourseManagement getLectureMan();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getLectureMan <em>Lecture Man</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecture Man</em>' container reference.
	 * @see #getLectureMan()
	 * @generated
	 */
	void setLectureMan(CourseManagement value);

	/**
	 * Returns the value of the '<em><b>Exams</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Exam}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exams</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_Exams()
	 * @see org.moflon.maave.tests.lang.cmsNew.Exam#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<Exam> getExams();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Semester)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_Previous()
	 * @see org.moflon.maave.tests.lang.cmsNew.Semester#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Semester getPrevious();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Semester value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Semester)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_Next()
	 * @see org.moflon.maave.tests.lang.cmsNew.Semester#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Semester getNext();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Semester value);

	/**
	 * Returns the value of the '<em><b>Offered Lectures</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Lecture}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Lectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Lectures</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_OfferedLectures()
	 * @see org.moflon.maave.tests.lang.cmsNew.Lecture#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<Lecture> getOfferedLectures();

	/**
	 * Returns the value of the '<em><b>Reg Period Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Period Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Period Start</em>' attribute.
	 * @see #setRegPeriodStart(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_RegPeriodStart()
	 * @model ordered="false"
	 * @generated
	 */
	long getRegPeriodStart();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStart <em>Reg Period Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Period Start</em>' attribute.
	 * @see #getRegPeriodStart()
	 * @generated
	 */
	void setRegPeriodStart(long value);

	/**
	 * Returns the value of the '<em><b>Reg Period Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Period Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Period Stop</em>' attribute.
	 * @see #setRegPeriodStop(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_RegPeriodStop()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getRegPeriodStop();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStop <em>Reg Period Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Period Stop</em>' attribute.
	 * @see #getRegPeriodStop()
	 * @generated
	 */
	void setRegPeriodStop(long value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getStartDate();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(long value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getEndDate();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(long value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(boolean)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_Current()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.moflon.maave.tests.lang.cmsNew.SEM_STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.SEM_STATE
	 * @see #setState(SEM_STATE)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSemester_State()
	 * @model ordered="false"
	 * @generated
	 */
	SEM_STATE getState();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.SEM_STATE
	 * @see #getState()
	 * @generated
	 */
	void setState(SEM_STATE value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Semester
