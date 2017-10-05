/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.Date;
import org.moflon.maave.tests.lang.cmsNew.Lecture;
import org.moflon.maave.tests.lang.cmsNew.Semester;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.LectureImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.LectureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.LectureImpl#getRegSt <em>Reg St</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LectureImpl extends EObjectImpl implements Lecture {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> date;

	/**
	 * The default value of the '{@link #getRegSt() <em>Reg St</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegSt()
	 * @generated
	 * @ordered
	 */
	protected static final int REG_ST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegSt() <em>Reg St</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegSt()
	 * @generated
	 * @ordered
	 */
	protected int regSt = REG_ST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.LECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		if (eContainerFeatureID() != CmsNewPackage.LECTURE__SEMESTER)
			return null;
		return (Semester) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSemester, CmsNewPackage.LECTURE__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer()
				|| (eContainerFeatureID() != CmsNewPackage.LECTURE__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject) newSemester).eInverseAdd(this, CmsNewPackage.SEMESTER__OFFERED_LECTURES,
						Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.LECTURE__SEMESTER, newSemester,
					newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDate() {
		if (date == null) {
			date = new EObjectContainmentEList<Date>(Date.class, this, CmsNewPackage.LECTURE__DATE);
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegSt() {
		return regSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegSt(int newRegSt) {
		int oldRegSt = regSt;
		regSt = newRegSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.LECTURE__REG_ST, oldRegSt, regSt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.LECTURE__SEMESTER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSemester((Semester) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.LECTURE__SEMESTER:
			return basicSetSemester(null, msgs);
		case CmsNewPackage.LECTURE__DATE:
			return ((InternalEList<?>) getDate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CmsNewPackage.LECTURE__SEMESTER:
			return eInternalContainer().eInverseRemove(this, CmsNewPackage.SEMESTER__OFFERED_LECTURES, Semester.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsNewPackage.LECTURE__SEMESTER:
			return getSemester();
		case CmsNewPackage.LECTURE__DATE:
			return getDate();
		case CmsNewPackage.LECTURE__REG_ST:
			return getRegSt();
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
		case CmsNewPackage.LECTURE__SEMESTER:
			setSemester((Semester) newValue);
			return;
		case CmsNewPackage.LECTURE__DATE:
			getDate().clear();
			getDate().addAll((Collection<? extends Date>) newValue);
			return;
		case CmsNewPackage.LECTURE__REG_ST:
			setRegSt((Integer) newValue);
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
		case CmsNewPackage.LECTURE__SEMESTER:
			setSemester((Semester) null);
			return;
		case CmsNewPackage.LECTURE__DATE:
			getDate().clear();
			return;
		case CmsNewPackage.LECTURE__REG_ST:
			setRegSt(REG_ST_EDEFAULT);
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
		case CmsNewPackage.LECTURE__SEMESTER:
			return getSemester() != null;
		case CmsNewPackage.LECTURE__DATE:
			return date != null && !date.isEmpty();
		case CmsNewPackage.LECTURE__REG_ST:
			return regSt != REG_ST_EDEFAULT;
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
		result.append(" (regSt: ");
		result.append(regSt);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LectureImpl
