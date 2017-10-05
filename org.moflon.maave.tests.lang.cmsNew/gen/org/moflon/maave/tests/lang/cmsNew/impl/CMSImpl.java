/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cmsNew.CMS;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CourseManagement;
import org.moflon.maave.tests.lang.cmsNew.RoomManagement;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CMSImpl#getRoomManagement <em>Room Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CMSImpl#getCourseManagement <em>Course Management</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMSImpl extends EObjectImpl implements CMS {
	/**
	 * The cached value of the '{@link #getRoomManagement() <em>Room Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomManagement()
	 * @generated
	 * @ordered
	 */
	protected RoomManagement roomManagement;

	/**
	 * The cached value of the '{@link #getCourseManagement() <em>Course Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseManagement()
	 * @generated
	 * @ordered
	 */
	protected CourseManagement courseManagement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.CMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagement getRoomManagement() {
		return roomManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomManagement(RoomManagement newRoomManagement, NotificationChain msgs) {
		RoomManagement oldRoomManagement = roomManagement;
		roomManagement = newRoomManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsNewPackage.CMS__ROOM_MANAGEMENT, oldRoomManagement, newRoomManagement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomManagement(RoomManagement newRoomManagement) {
		if (newRoomManagement != roomManagement) {
			NotificationChain msgs = null;
			if (roomManagement != null)
				msgs = ((InternalEObject) roomManagement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsNewPackage.CMS__ROOM_MANAGEMENT, null, msgs);
			if (newRoomManagement != null)
				msgs = ((InternalEObject) newRoomManagement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsNewPackage.CMS__ROOM_MANAGEMENT, null, msgs);
			msgs = basicSetRoomManagement(newRoomManagement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.CMS__ROOM_MANAGEMENT, newRoomManagement,
					newRoomManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseManagement getCourseManagement() {
		return courseManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseManagement(CourseManagement newCourseManagement, NotificationChain msgs) {
		CourseManagement oldCourseManagement = courseManagement;
		courseManagement = newCourseManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsNewPackage.CMS__COURSE_MANAGEMENT, oldCourseManagement, newCourseManagement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseManagement(CourseManagement newCourseManagement) {
		if (newCourseManagement != courseManagement) {
			NotificationChain msgs = null;
			if (courseManagement != null)
				msgs = ((InternalEObject) courseManagement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsNewPackage.CMS__COURSE_MANAGEMENT, null, msgs);
			if (newCourseManagement != null)
				msgs = ((InternalEObject) newCourseManagement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsNewPackage.CMS__COURSE_MANAGEMENT, null, msgs);
			msgs = basicSetCourseManagement(newCourseManagement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.CMS__COURSE_MANAGEMENT,
					newCourseManagement, newCourseManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.CMS__ROOM_MANAGEMENT:
			return basicSetRoomManagement(null, msgs);
		case CmsNewPackage.CMS__COURSE_MANAGEMENT:
			return basicSetCourseManagement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsNewPackage.CMS__ROOM_MANAGEMENT:
			return getRoomManagement();
		case CmsNewPackage.CMS__COURSE_MANAGEMENT:
			return getCourseManagement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsNewPackage.CMS__ROOM_MANAGEMENT:
			setRoomManagement((RoomManagement) newValue);
			return;
		case CmsNewPackage.CMS__COURSE_MANAGEMENT:
			setCourseManagement((CourseManagement) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CmsNewPackage.CMS__ROOM_MANAGEMENT:
			setRoomManagement((RoomManagement) null);
			return;
		case CmsNewPackage.CMS__COURSE_MANAGEMENT:
			setCourseManagement((CourseManagement) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CmsNewPackage.CMS__ROOM_MANAGEMENT:
			return roomManagement != null;
		case CmsNewPackage.CMS__COURSE_MANAGEMENT:
			return courseManagement != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CMSImpl
