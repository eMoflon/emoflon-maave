/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Record#getEnrollment <em>Enrollment</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Record#getExam <em>Exam</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Record#getModuleOffer <em>Module Offer</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Record#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Record#getTries <em>Tries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends EObject
{
   /**
    * Returns the value of the '<em><b>Enrollment</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getRecords <em>Records</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Enrollment</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Enrollment</em>' container reference.
    * @see #setEnrollment(Enrollment)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRecord_Enrollment()
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getRecords
    * @model opposite="records" transient="false"
    * @generated
    */
   Enrollment getEnrollment();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Record#getEnrollment <em>Enrollment</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Enrollment</em>' container reference.
    * @see #getEnrollment()
    * @generated
    */
   void setEnrollment(Enrollment value);

   /**
    * Returns the value of the '<em><b>Exam</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getRegistrations <em>Registrations</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Exam</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Exam</em>' reference.
    * @see #setExam(Exam)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRecord_Exam()
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#getRegistrations
    * @model opposite="registrations"
    * @generated
    */
   Exam getExam();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Record#getExam <em>Exam</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Exam</em>' reference.
    * @see #getExam()
    * @generated
    */
   void setExam(Exam value);

   /**
    * Returns the value of the '<em><b>Module Offer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Module Offer</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Module Offer</em>' reference.
    * @see #setModuleOffer(CoModOffer)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRecord_ModuleOffer()
    * @model
    * @generated
    */
   CoModOffer getModuleOffer();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Record#getModuleOffer <em>Module Offer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Module Offer</em>' reference.
    * @see #getModuleOffer()
    * @generated
    */
   void setModuleOffer(CoModOffer value);

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
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRecord_Grade()
    * @model required="true" ordered="false"
    * @generated
    */
   int getGrade();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Record#getGrade <em>Grade</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Grade</em>' attribute.
    * @see #getGrade()
    * @generated
    */
   void setGrade(int value);

   /**
    * Returns the value of the '<em><b>Tries</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Tries</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Tries</em>' attribute.
    * @see #setTries(int)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRecord_Tries()
    * @model required="true" ordered="false"
    * @generated
    */
   int getTries();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Record#getTries <em>Tries</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Tries</em>' attribute.
    * @see #getTries()
    * @generated
    */
   void setTries(int value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Record
