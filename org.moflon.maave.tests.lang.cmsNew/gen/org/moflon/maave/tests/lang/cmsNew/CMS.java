/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.CMS#getRoomManagement <em>Room Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.CMS#getCourseManagement <em>Course Management</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCMS()
 * @model
 * @generated
 */
public interface CMS extends EObject
{
   /**
    * Returns the value of the '<em><b>Room Management</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Room Management</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Room Management</em>' containment reference.
    * @see #setRoomManagement(RoomManagement)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCMS_RoomManagement()
    * @model containment="true" required="true"
    * @generated
    */
   RoomManagement getRoomManagement();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.CMS#getRoomManagement <em>Room Management</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Room Management</em>' containment reference.
    * @see #getRoomManagement()
    * @generated
    */
   void setRoomManagement(RoomManagement value);

   /**
    * Returns the value of the '<em><b>Course Management</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Course Management</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Course Management</em>' containment reference.
    * @see #setCourseManagement(CourseManagement)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCMS_CourseManagement()
    * @model containment="true" required="true"
    * @generated
    */
   CourseManagement getCourseManagement();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.CMS#getCourseManagement <em>Course Management</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Course Management</em>' containment reference.
    * @see #getCourseManagement()
    * @generated
    */
   void setCourseManagement(CourseManagement value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // CMS
