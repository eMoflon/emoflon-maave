/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Module#getLecMan <em>Lec Man</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Module#getAllOffers <em>All Offers</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Module#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Module#getId <em>Id</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Module#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
   /**
    * Returns the value of the '<em><b>Lec Man</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModules <em>Modules</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Lec Man</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Lec Man</em>' container reference.
    * @see #setLecMan(CourseManagement)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getModule_LecMan()
    * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModules
    * @model opposite="modules" transient="false"
    * @generated
    */
   CourseManagement getLecMan();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Module#getLecMan <em>Lec Man</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Lec Man</em>' container reference.
    * @see #getLecMan()
    * @generated
    */
   void setLecMan(CourseManagement value);

   /**
    * Returns the value of the '<em><b>All Offers</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.CoModOffer}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>All Offers</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>All Offers</em>' containment reference list.
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getModule_AllOffers()
    * @model containment="true"
    * @generated
    */
   EList<CoModOffer> getAllOffers();

   /**
    * Returns the value of the '<em><b>Current</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Current</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Current</em>' reference.
    * @see #setCurrent(CoModOffer)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getModule_Current()
    * @model
    * @generated
    */
   CoModOffer getCurrent();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Module#getCurrent <em>Current</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Current</em>' reference.
    * @see #getCurrent()
    * @generated
    */
   void setCurrent(CoModOffer value);

   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(long)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getModule_Id()
    * @model required="true" ordered="false"
    * @generated
    */
   long getId();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Module#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(long value);

   /**
    * Returns the value of the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Version</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Version</em>' attribute.
    * @see #setVersion(int)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getModule_Version()
    * @model required="true" ordered="false"
    * @generated
    */
   int getVersion();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Module#getVersion <em>Version</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Version</em>' attribute.
    * @see #getVersion()
    * @generated
    */
   void setVersion(int value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Module
