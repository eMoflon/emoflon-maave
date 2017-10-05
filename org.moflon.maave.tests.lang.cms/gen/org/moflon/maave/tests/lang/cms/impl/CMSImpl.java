/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cms.CMS;
import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.LectureManagement;
import org.moflon.maave.tests.lang.cms.ProgramManagement;
import org.moflon.maave.tests.lang.cms.RoomManagement;
import org.moflon.maave.tests.lang.cms.StrudentAffairs;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.CMSImpl#getProgramManagement <em>Program Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.CMSImpl#getRoomManagement <em>Room Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.CMSImpl#getStrudentManagements <em>Strudent Managements</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.CMSImpl#getCourseManagement <em>Course Management</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.CMSImpl#getCurrentDate <em>Current Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMSImpl extends EObjectImpl implements CMS {
	/**
	 * The cached value of the '{@link #getProgramManagement() <em>Program Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramManagement()
	 * @generated
	 * @ordered
	 */
	protected ProgramManagement programManagement;

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
	 * The cached value of the '{@link #getStrudentManagements() <em>Strudent Managements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrudentManagements()
	 * @generated
	 * @ordered
	 */
	protected StrudentAffairs strudentManagements;

	/**
	 * The cached value of the '{@link #getCourseManagement() <em>Course Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseManagement()
	 * @generated
	 * @ordered
	 */
	protected LectureManagement courseManagement;

	/**
	 * The default value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDate()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_DATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDate()
	 * @generated
	 * @ordered
	 */
	protected long currentDate = CURRENT_DATE_EDEFAULT;

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
		return CmsPackage.Literals.CMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramManagement getProgramManagement() {
		return programManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramManagement(ProgramManagement newProgramManagement, NotificationChain msgs) {
		ProgramManagement oldProgramManagement = programManagement;
		programManagement = newProgramManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsPackage.CMS__PROGRAM_MANAGEMENT, oldProgramManagement, newProgramManagement);
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
	public void setProgramManagement(ProgramManagement newProgramManagement) {
		if (newProgramManagement != programManagement) {
			NotificationChain msgs = null;
			if (programManagement != null)
				msgs = ((InternalEObject) programManagement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__PROGRAM_MANAGEMENT, null, msgs);
			if (newProgramManagement != null)
				msgs = ((InternalEObject) newProgramManagement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__PROGRAM_MANAGEMENT, null, msgs);
			msgs = basicSetProgramManagement(newProgramManagement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.CMS__PROGRAM_MANAGEMENT,
					newProgramManagement, newProgramManagement));
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
					CmsPackage.CMS__ROOM_MANAGEMENT, oldRoomManagement, newRoomManagement);
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
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__ROOM_MANAGEMENT, null, msgs);
			if (newRoomManagement != null)
				msgs = ((InternalEObject) newRoomManagement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__ROOM_MANAGEMENT, null, msgs);
			msgs = basicSetRoomManagement(newRoomManagement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.CMS__ROOM_MANAGEMENT, newRoomManagement,
					newRoomManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrudentAffairs getStrudentManagements() {
		return strudentManagements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrudentManagements(StrudentAffairs newStrudentManagements,
			NotificationChain msgs) {
		StrudentAffairs oldStrudentManagements = strudentManagements;
		strudentManagements = newStrudentManagements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsPackage.CMS__STRUDENT_MANAGEMENTS, oldStrudentManagements, newStrudentManagements);
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
	public void setStrudentManagements(StrudentAffairs newStrudentManagements) {
		if (newStrudentManagements != strudentManagements) {
			NotificationChain msgs = null;
			if (strudentManagements != null)
				msgs = ((InternalEObject) strudentManagements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__STRUDENT_MANAGEMENTS, null, msgs);
			if (newStrudentManagements != null)
				msgs = ((InternalEObject) newStrudentManagements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__STRUDENT_MANAGEMENTS, null, msgs);
			msgs = basicSetStrudentManagements(newStrudentManagements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.CMS__STRUDENT_MANAGEMENTS,
					newStrudentManagements, newStrudentManagements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LectureManagement getCourseManagement() {
		return courseManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseManagement(LectureManagement newCourseManagement, NotificationChain msgs) {
		LectureManagement oldCourseManagement = courseManagement;
		courseManagement = newCourseManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsPackage.CMS__COURSE_MANAGEMENT, oldCourseManagement, newCourseManagement);
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
	public void setCourseManagement(LectureManagement newCourseManagement) {
		if (newCourseManagement != courseManagement) {
			NotificationChain msgs = null;
			if (courseManagement != null)
				msgs = ((InternalEObject) courseManagement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__COURSE_MANAGEMENT, null, msgs);
			if (newCourseManagement != null)
				msgs = ((InternalEObject) newCourseManagement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.CMS__COURSE_MANAGEMENT, null, msgs);
			msgs = basicSetCourseManagement(newCourseManagement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.CMS__COURSE_MANAGEMENT,
					newCourseManagement, newCourseManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCurrentDate() {
		return currentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDate(long newCurrentDate) {
		long oldCurrentDate = currentDate;
		currentDate = newCurrentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.CMS__CURRENT_DATE, oldCurrentDate,
					currentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsPackage.CMS__PROGRAM_MANAGEMENT:
			return basicSetProgramManagement(null, msgs);
		case CmsPackage.CMS__ROOM_MANAGEMENT:
			return basicSetRoomManagement(null, msgs);
		case CmsPackage.CMS__STRUDENT_MANAGEMENTS:
			return basicSetStrudentManagements(null, msgs);
		case CmsPackage.CMS__COURSE_MANAGEMENT:
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
		case CmsPackage.CMS__PROGRAM_MANAGEMENT:
			return getProgramManagement();
		case CmsPackage.CMS__ROOM_MANAGEMENT:
			return getRoomManagement();
		case CmsPackage.CMS__STRUDENT_MANAGEMENTS:
			return getStrudentManagements();
		case CmsPackage.CMS__COURSE_MANAGEMENT:
			return getCourseManagement();
		case CmsPackage.CMS__CURRENT_DATE:
			return getCurrentDate();
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
		case CmsPackage.CMS__PROGRAM_MANAGEMENT:
			setProgramManagement((ProgramManagement) newValue);
			return;
		case CmsPackage.CMS__ROOM_MANAGEMENT:
			setRoomManagement((RoomManagement) newValue);
			return;
		case CmsPackage.CMS__STRUDENT_MANAGEMENTS:
			setStrudentManagements((StrudentAffairs) newValue);
			return;
		case CmsPackage.CMS__COURSE_MANAGEMENT:
			setCourseManagement((LectureManagement) newValue);
			return;
		case CmsPackage.CMS__CURRENT_DATE:
			setCurrentDate((Long) newValue);
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
		case CmsPackage.CMS__PROGRAM_MANAGEMENT:
			setProgramManagement((ProgramManagement) null);
			return;
		case CmsPackage.CMS__ROOM_MANAGEMENT:
			setRoomManagement((RoomManagement) null);
			return;
		case CmsPackage.CMS__STRUDENT_MANAGEMENTS:
			setStrudentManagements((StrudentAffairs) null);
			return;
		case CmsPackage.CMS__COURSE_MANAGEMENT:
			setCourseManagement((LectureManagement) null);
			return;
		case CmsPackage.CMS__CURRENT_DATE:
			setCurrentDate(CURRENT_DATE_EDEFAULT);
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
		case CmsPackage.CMS__PROGRAM_MANAGEMENT:
			return programManagement != null;
		case CmsPackage.CMS__ROOM_MANAGEMENT:
			return roomManagement != null;
		case CmsPackage.CMS__STRUDENT_MANAGEMENTS:
			return strudentManagements != null;
		case CmsPackage.CMS__COURSE_MANAGEMENT:
			return courseManagement != null;
		case CmsPackage.CMS__CURRENT_DATE:
			return currentDate != CURRENT_DATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentDate: ");
		result.append(currentDate);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CMSImpl
