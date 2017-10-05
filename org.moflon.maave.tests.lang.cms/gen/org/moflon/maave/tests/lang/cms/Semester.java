/**
 */
package org.moflon.maave.tests.lang.cms;

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
 *   <li>{@link org.moflon.maave.tests.lang.cms.Semester#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Semester#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Semester#getOfferedLectures <em>Offered Lectures</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Semester#getExams <em>Exams</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Semester#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Semester#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cms.Semester#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Semester)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSemester_Previous()
	 * @see org.moflon.maave.tests.lang.cms.Semester#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Semester getPrevious();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Semester#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Semester value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cms.Semester#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Semester)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSemester_Next()
	 * @see org.moflon.maave.tests.lang.cms.Semester#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Semester getNext();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Semester#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Semester value);

	/**
	 * Returns the value of the '<em><b>Offered Lectures</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Lecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Lectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Lectures</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSemester_OfferedLectures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lecture> getOfferedLectures();

	/**
	 * Returns the value of the '<em><b>Exams</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Exam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exams</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSemester_Exams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exam> getExams();

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
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSemester_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getStartDate();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Semester#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSemester_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getEndDate();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Semester#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(long value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Semester
