/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Room#getReservations <em>Reservations</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Room#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject
{
   /**
    * Returns the value of the '<em><b>Reservations</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Booking}.
    * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Booking#getRoom <em>Room</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Reservations</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Reservations</em>' containment reference list.
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRoom_Reservations()
    * @see org.moflon.maave.tests.lang.cmsNew.Booking#getRoom
    * @model opposite="room" containment="true"
    * @generated
    */
   EList<Booking> getReservations();

   /**
    * Returns the value of the '<em><b>Capacity</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Capacity</em>' attribute.
    * @see #setCapacity(int)
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getRoom_Capacity()
    * @model required="true" ordered="false"
    * @generated
    */
   int getCapacity();

   /**
    * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Room#getCapacity <em>Capacity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Capacity</em>' attribute.
    * @see #getCapacity()
    * @generated
    */
   void setCapacity(int value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Room
