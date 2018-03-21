/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.moflon.maave.tests.lang.cmsNew.Booking;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.Date;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Date</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.DateImpl#getLocation
 * <em>Location</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.DateImpl#getBegin
 * <em>Begin</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.DateImpl#getDuration
 * <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateImpl extends EObjectImpl implements Date {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Booking location;

	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final long BEGIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected long begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.DATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Booking getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject) location;
			location = (Booking) eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.DATE__LOCATION, oldLocation,
							location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Booking basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLocation(Booking newLocation) {
		Booking oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.DATE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBegin(long newBegin) {
		long oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.DATE__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDuration(long newDuration) {
		long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.DATE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsNewPackage.DATE__LOCATION:
			if (resolve)
				return getLocation();
			return basicGetLocation();
		case CmsNewPackage.DATE__BEGIN:
			return getBegin();
		case CmsNewPackage.DATE__DURATION:
			return getDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsNewPackage.DATE__LOCATION:
			setLocation((Booking) newValue);
			return;
		case CmsNewPackage.DATE__BEGIN:
			setBegin((Long) newValue);
			return;
		case CmsNewPackage.DATE__DURATION:
			setDuration((Long) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CmsNewPackage.DATE__LOCATION:
			setLocation((Booking) null);
			return;
		case CmsNewPackage.DATE__BEGIN:
			setBegin(BEGIN_EDEFAULT);
			return;
		case CmsNewPackage.DATE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CmsNewPackage.DATE__LOCATION:
			return location != null;
		case CmsNewPackage.DATE__BEGIN:
			return begin != BEGIN_EDEFAULT;
		case CmsNewPackage.DATE__DURATION:
			return duration != DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (begin: ");
		result.append(begin);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // DateImpl
