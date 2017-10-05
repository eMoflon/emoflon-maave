/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Booking#getRoom <em>Room</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Booking#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Booking#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Room#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getBooking_Room()
	 * @see org.moflon.maave.tests.lang.cmsNew.Room#getReservations
	 * @model opposite="reservations" transient="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Booking#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getBooking_Begin()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getBegin();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Booking#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getBooking_End()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Booking#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Booking
