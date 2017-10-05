/**
 */
package org.moflon.maave.tests.lang.cmsNew;

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
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Exam#getSemester <em>Semester</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Exam#getRegistrations <em>Registrations</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Exam#getDate <em>Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Exam#getGradeList <em>Grade List</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Exam#getRegSt <em>Reg St</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Exam#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getExam()
 * @model
 * @generated
 */
public interface Exam extends EObject
{
   /**
    * Returns the value of the '<em><b>Semester</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getExams <em>Exams</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Semester</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Semester</em>' container reference.
    * @see #setSemester(Semester)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getExam_Semester()
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getExams
    * @model opposite="exams" transient="false"
    * @generated
    */
   Semester getSemester();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getSemester <em>Semester</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Semester</em>' container reference.
    * @see #getSemester()
    * @generated
    */
   void setSemester(Semester value);

   /**
    * Returns the value of the '<em><b>Registrations</b></em>' reference list.
    * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Record}.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Record#getExam <em>Exam</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Registrations</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Registrations</em>' reference list.
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getExam_Registrations()
    * @see org.moflon.maave.tests.lang.cmsNew.Record#getExam
    * @model opposite="exam"
    * @generated
    */
   EList<Record> getRegistrations();

   /**
    * Returns the value of the '<em><b>Date</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Date</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Date</em>' containment reference.
    * @see #setDate(Date)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getExam_Date()
    * @model containment="true"
    * @generated
    */
   Date getDate();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getDate <em>Date</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Date</em>' containment reference.
    * @see #getDate()
    * @generated
    */
   void setDate(Date value);

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
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getExam_GradeList()
    * @model containment="true"
    * @generated
    */
   GradeFormular getGradeList();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getGradeList <em>Grade List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Grade List</em>' containment reference.
    * @see #getGradeList()
    * @generated
    */
   void setGradeList(GradeFormular value);

   /**
    * Returns the value of the '<em><b>Reg St</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Reg St</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Reg St</em>' attribute.
    * @see #setRegSt(int)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getExam_RegSt()
    * @model required="true" ordered="false"
    * @generated
    */
   int getRegSt();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getRegSt <em>Reg St</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Reg St</em>' attribute.
    * @see #getRegSt()
    * @generated
    */
   void setRegSt(int value);

   /**
    * Returns the value of the '<em><b>State</b></em>' attribute.
    * The literals are from the enumeration {@link org.moflon.maave.tests.lang.cmsNew.EX_STATE}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>State</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>State</em>' attribute.
    * @see org.moflon.maave.tests.lang.cmsNew.EX_STATE
    * @see #setState(EX_STATE)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getExam_State()
    * @model required="true" ordered="false"
    * @generated
    */
   EX_STATE getState();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getState <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>State</em>' attribute.
    * @see org.moflon.maave.tests.lang.cmsNew.EX_STATE
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
   void zetDate_v0(Date da);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void updateDate_v0(Date da);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void bookRoom_v1(Room ro, SystemTimer system);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void transferResultPassed_v0();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void transferResultFailed_v0();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void bookRoom_v0(Room ro);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void uploadResults_v0(GradeFormular gF);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void closeExam_v0();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void transferResultPassed_v1(SystemTimer system);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void transferResultFailed_v1(SystemTimer system);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Exam
