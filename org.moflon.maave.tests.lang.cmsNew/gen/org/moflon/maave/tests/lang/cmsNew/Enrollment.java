/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Enrollment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getRecords
 * <em>Records</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getProgram
 * <em>Program</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getDegree
 * <em>Degree</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getThesisRecord
 * <em>Thesis Record</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getCp
 * <em>Cp</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getState
 * <em>State</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getRegCp <em>Reg
 * Cp</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getStudId <em>Stud
 * Id</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#isEnrolled
 * <em>Enrolled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment()
 * @model
 * @generated
 */
public interface Enrollment extends EObject {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.moflon.maave.tests.lang.cmsNew.Record}. It is bidirectional and
	 * its opposite is
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Record#getEnrollment
	 * <em>Enrollment</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_Records()
	 * @see org.moflon.maave.tests.lang.cmsNew.Record#getEnrollment
	 * @model opposite="enrollment" containment="true"
	 * @generated
	 */
	EList<Record> getRecords();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_Program()
	 * @model
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getProgram
	 * <em>Program</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Degree</em>' containment reference.
	 * @see #setDegree(Degree)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_Degree()
	 * @model containment="true"
	 * @generated
	 */
	Degree getDegree();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getDegree
	 * <em>Degree</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Degree</em>' containment reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(Degree value);

	/**
	 * Returns the value of the '<em><b>Thesis Record</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesis Record</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Thesis Record</em>' containment reference.
	 * @see #setThesisRecord(ThesisRecord)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_ThesisRecord()
	 * @model containment="true"
	 * @generated
	 */
	ThesisRecord getThesisRecord();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getThesisRecord
	 * <em>Thesis Record</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Thesis Record</em>' containment
	 *            reference.
	 * @see #getThesisRecord()
	 * @generated
	 */
	void setThesisRecord(ThesisRecord value);

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_Cp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCp();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getCp <em>Cp</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute. The literals are
	 * from the enumeration {@link org.moflon.maave.tests.lang.cmsNew.EN_STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.EN_STATE
	 * @see #setState(EN_STATE)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EN_STATE getState();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getState
	 * <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.EN_STATE
	 * @see #getState()
	 * @generated
	 */
	void setState(EN_STATE value);

	/**
	 * Returns the value of the '<em><b>Reg Cp</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Cp</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reg Cp</em>' attribute.
	 * @see #setRegCp(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_RegCp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRegCp();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getRegCp <em>Reg
	 * Cp</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reg Cp</em>' attribute.
	 * @see #getRegCp()
	 * @generated
	 */
	void setRegCp(int value);

	/**
	 * Returns the value of the '<em><b>Stud Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stud Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stud Id</em>' attribute.
	 * @see #setStudId(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_StudId()
	 * @model ordered="false"
	 * @generated
	 */
	int getStudId();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getStudId <em>Stud
	 * Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Stud Id</em>' attribute.
	 * @see #getStudId()
	 * @generated
	 */
	void setStudId(int value);

	/**
	 * Returns the value of the '<em><b>Enrolled</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrolled</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enrolled</em>' attribute.
	 * @see #setEnrolled(boolean)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEnrollment_Enrolled()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isEnrolled();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#isEnrolled
	 * <em>Enrolled</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Enrolled</em>' attribute.
	 * @see #isEnrolled()
	 * @generated
	 */
	void setEnrolled(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void regForExam_v1(SystemTimer st, Exam ex);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void unregFromExam_v1(Exam ex, SystemTimer system);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void regForExam_v0(Exam ex);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void regForModule_v0(CoModOffer mo);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void unregFromExam_v0(Exam ex);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void regForThesisModuleOffer_v0(ThesisModuleOffer thModOffer);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void regForThesis_v0();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void obtainDegree_v0();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Enrollment
