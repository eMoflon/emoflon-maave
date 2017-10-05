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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.Entry;
import org.moflon.maave.tests.lang.cms.GradeFormular;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade Formular</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.GradeFormularImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.GradeFormularImpl#getNrOfEntries <em>Nr Of Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeFormularImpl extends EObjectImpl implements GradeFormular {
	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> records;

	/**
	 * The default value of the '{@link #getNrOfEntries() <em>Nr Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfEntries()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_ENTRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfEntries() <em>Nr Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfEntries()
	 * @generated
	 * @ordered
	 */
	protected int nrOfEntries = NR_OF_ENTRIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradeFormularImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.GRADE_FORMULAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getRecords() {
		if (records == null) {
			records = new EObjectContainmentEList<Entry>(Entry.class, this, CmsPackage.GRADE_FORMULAR__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfEntries() {
		return nrOfEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfEntries(int newNrOfEntries) {
		int oldNrOfEntries = nrOfEntries;
		nrOfEntries = newNrOfEntries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.GRADE_FORMULAR__NR_OF_ENTRIES,
					oldNrOfEntries, nrOfEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsPackage.GRADE_FORMULAR__RECORDS:
			return ((InternalEList<?>) getRecords()).basicRemove(otherEnd, msgs);
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
		case CmsPackage.GRADE_FORMULAR__RECORDS:
			return getRecords();
		case CmsPackage.GRADE_FORMULAR__NR_OF_ENTRIES:
			return getNrOfEntries();
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
		case CmsPackage.GRADE_FORMULAR__RECORDS:
			getRecords().clear();
			getRecords().addAll((Collection<? extends Entry>) newValue);
			return;
		case CmsPackage.GRADE_FORMULAR__NR_OF_ENTRIES:
			setNrOfEntries((Integer) newValue);
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
		case CmsPackage.GRADE_FORMULAR__RECORDS:
			getRecords().clear();
			return;
		case CmsPackage.GRADE_FORMULAR__NR_OF_ENTRIES:
			setNrOfEntries(NR_OF_ENTRIES_EDEFAULT);
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
		case CmsPackage.GRADE_FORMULAR__RECORDS:
			return records != null && !records.isEmpty();
		case CmsPackage.GRADE_FORMULAR__NR_OF_ENTRIES:
			return nrOfEntries != NR_OF_ENTRIES_EDEFAULT;
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
		result.append(" (nrOfEntries: ");
		result.append(nrOfEntries);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //GradeFormularImpl
