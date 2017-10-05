/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getStudent <em>Student</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getThesisRecord <em>Thesis Record</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getSystem <em>System</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getRecords <em>Records</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getProgram <em>Program</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getCp <em>Cp</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getState <em>State</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Enrollment#getRegCp <em>Reg Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment()
 * @model
 * @generated
 */
public interface Enrollment extends EObject {
	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cms.Student#getEnrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_Student()
	 * @see org.moflon.maave.tests.lang.cms.Student#getEnrollment
	 * @model opposite="enrollment" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Thesis Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesis Record</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis Record</em>' containment reference.
	 * @see #setThesisRecord(ThesisRecord)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_ThesisRecord()
	 * @model containment="true"
	 * @generated
	 */
	ThesisRecord getThesisRecord();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getThesisRecord <em>Thesis Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesis Record</em>' containment reference.
	 * @see #getThesisRecord()
	 * @generated
	 */
	void setThesisRecord(ThesisRecord value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference.
	 * @see #setDegree(degree)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_Degree()
	 * @model containment="true"
	 * @generated
	 */
	degree getDegree();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getDegree <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' containment reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(degree value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(Sys)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_System()
	 * @model
	 * @generated
	 */
	Sys getSystem();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Sys value);

	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Record}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cms.Record#getEnrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_Records()
	 * @see org.moflon.maave.tests.lang.cms.Record#getEnrollment
	 * @model opposite="enrollment" containment="true"
	 * @generated
	 */
	EList<Record> getRecords();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_Program()
	 * @model
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_Cp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCp();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getCp <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.moflon.maave.tests.lang.cms.EN_STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cms.EN_STATE
	 * @see #setState(EN_STATE)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_State()
	 * @model ordered="false"
	 * @generated
	 */
	EN_STATE getState();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cms.EN_STATE
	 * @see #getState()
	 * @generated
	 */
	void setState(EN_STATE value);

	/**
	 * Returns the value of the '<em><b>Reg Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Cp</em>' attribute.
	 * @see #setRegCp(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEnrollment_RegCp()
	 * @model ordered="false"
	 * @generated
	 */
	int getRegCp();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Enrollment#getRegCp <em>Reg Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Cp</em>' attribute.
	 * @see #getRegCp()
	 * @generated
	 */
	void setRegCp(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerForModule(Module module);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerForExam(Exam examREG);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregisterFromExam(Exam exam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerForThesisModule(ThesisModule thesisModule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerThesis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerForExam_v2(Exam examREG);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregisterFromExam_v2(Exam exam);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Enrollment
