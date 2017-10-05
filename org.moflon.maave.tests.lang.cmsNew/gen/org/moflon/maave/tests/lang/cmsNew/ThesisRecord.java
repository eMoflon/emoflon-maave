/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesis <em>Thesis</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesisOffer <em>Thesis Offer</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getTries <em>Tries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisRecord()
 * @model
 * @generated
 */
public interface ThesisRecord extends EObject
{
   /**
    * Returns the value of the '<em><b>Thesis</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getRecord <em>Record</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Thesis</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Thesis</em>' reference.
    * @see #setThesis(Thesis)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisRecord_Thesis()
    * @see org.moflon.maave.tests.lang.cmsNew.Thesis#getRecord
    * @model opposite="record"
    * @generated
    */
   Thesis getThesis();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesis <em>Thesis</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Thesis</em>' reference.
    * @see #getThesis()
    * @generated
    */
   void setThesis(Thesis value);

   /**
    * Returns the value of the '<em><b>Thesis Offer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Thesis Offer</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Thesis Offer</em>' reference.
    * @see #setThesisOffer(ThesisModuleOffer)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisRecord_ThesisOffer()
    * @model
    * @generated
    */
   ThesisModuleOffer getThesisOffer();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesisOffer <em>Thesis Offer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Thesis Offer</em>' reference.
    * @see #getThesisOffer()
    * @generated
    */
   void setThesisOffer(ThesisModuleOffer value);

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
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisRecord_Grade()
    * @model required="true" ordered="false"
    * @generated
    */
   int getGrade();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getGrade <em>Grade</em>}' attribute.
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
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisRecord_Tries()
    * @model required="true" ordered="false"
    * @generated
    */
   int getTries();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getTries <em>Tries</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Tries</em>' attribute.
    * @see #getTries()
    * @generated
    */
   void setTries(int value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ThesisRecord
