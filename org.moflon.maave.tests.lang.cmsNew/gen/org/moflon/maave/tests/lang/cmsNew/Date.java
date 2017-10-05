/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Date#getLocation <em>Location</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Date#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Date#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Booking)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getDate_Location()
	 * @model
	 * @generated
	 */
	Booking getLocation();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Date#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Booking value);

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
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getDate_Begin()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getBegin();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Date#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getDate_Duration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Date#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Date
