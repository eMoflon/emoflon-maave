/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.LectureManagement;
import org.moflon.maave.tests.lang.cms.Semester;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lecture Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.LectureManagementImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.LectureManagementImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LectureManagementImpl extends ModuleImpl implements LectureManagement {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected Semester current;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LectureManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.LECTURE_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this,
					CmsPackage.LECTURE_MANAGEMENT__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getCurrent() {
		if (current != null && current.eIsProxy()) {
			InternalEObject oldCurrent = (InternalEObject) current;
			current = (Semester) eResolveProxy(oldCurrent);
			if (current != oldCurrent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.LECTURE_MANAGEMENT__CURRENT,
							oldCurrent, current));
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(Semester newCurrent) {
		Semester oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.LECTURE_MANAGEMENT__CURRENT, oldCurrent,
					current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsPackage.LECTURE_MANAGEMENT__SEMESTERS:
			return ((InternalEList<?>) getSemesters()).basicRemove(otherEnd, msgs);
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
		case CmsPackage.LECTURE_MANAGEMENT__SEMESTERS:
			return getSemesters();
		case CmsPackage.LECTURE_MANAGEMENT__CURRENT:
			if (resolve)
				return getCurrent();
			return basicGetCurrent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsPackage.LECTURE_MANAGEMENT__SEMESTERS:
			getSemesters().clear();
			getSemesters().addAll((Collection<? extends Semester>) newValue);
			return;
		case CmsPackage.LECTURE_MANAGEMENT__CURRENT:
			setCurrent((Semester) newValue);
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
		case CmsPackage.LECTURE_MANAGEMENT__SEMESTERS:
			getSemesters().clear();
			return;
		case CmsPackage.LECTURE_MANAGEMENT__CURRENT:
			setCurrent((Semester) null);
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
		case CmsPackage.LECTURE_MANAGEMENT__SEMESTERS:
			return semesters != null && !semesters.isEmpty();
		case CmsPackage.LECTURE_MANAGEMENT__CURRENT:
			return current != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LectureManagementImpl
