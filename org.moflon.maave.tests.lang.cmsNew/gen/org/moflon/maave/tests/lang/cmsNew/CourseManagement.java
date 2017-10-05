/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getPrograms <em>Programs</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModuleOffers <em>Module Offers</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCourseManagement()
 * @model
 * @generated
 */
public interface CourseManagement extends EObject
{
   /**
    * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Program}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Programs</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Programs</em>' containment reference list.
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCourseManagement_Programs()
    * @model containment="true"
    * @generated
    */
   EList<Program> getPrograms();

   /**
    * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Semester}.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getLectureMan <em>Lecture Man</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Semesters</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Semesters</em>' containment reference list.
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCourseManagement_Semesters()
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getLectureMan
    * @model opposite="lectureMan" containment="true"
    * @generated
    */
   EList<Semester> getSemesters();

   /**
    * Returns the value of the '<em><b>Module Offers</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.CoModOffer}.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLecMan <em>Lec Man</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Module Offers</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Module Offers</em>' containment reference list.
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCourseManagement_ModuleOffers()
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLecMan
    * @model opposite="lecMan" containment="true"
    * @generated
    */
   EList<CoModOffer> getModuleOffers();

   /**
    * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Module}.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Module#getLecMan <em>Lec Man</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Modules</em>' containment reference list.
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCourseManagement_Modules()
    * @see org.moflon.maave.tests.lang.cmsNew.Module#getLecMan
    * @model opposite="lecMan" containment="true"
    * @generated
    */
   EList<Module> getModules();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // CourseManagement
