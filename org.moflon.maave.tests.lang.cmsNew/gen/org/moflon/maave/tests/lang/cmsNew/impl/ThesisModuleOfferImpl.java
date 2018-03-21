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
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.Thesis;
import org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Thesis
 * Module Offer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleOfferImpl#getThesiss
 * <em>Thesiss</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleOfferImpl#getCp
 * <em>Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThesisModuleOfferImpl extends EObjectImpl implements ThesisModuleOffer {
	/**
	 * The cached value of the '{@link #getThesiss() <em>Thesiss</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getThesiss()
	 * @generated
	 * @ordered
	 */
	protected EList<Thesis> thesiss;

	/**
	 * The default value of the '{@link #getCp() <em>Cp</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected static final int CP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected int cp = CP_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ThesisModuleOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.THESIS_MODULE_OFFER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Thesis> getThesiss() {
		if (thesiss == null) {
			thesiss = new EObjectContainmentEList<Thesis>(Thesis.class, this,
					CmsNewPackage.THESIS_MODULE_OFFER__THESISS);
		}
		return thesiss;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCp(int newCp) {
		int oldCp = cp;
		cp = newCp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_MODULE_OFFER__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.THESIS_MODULE_OFFER__THESISS:
			return ((InternalEList<?>) getThesiss()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsNewPackage.THESIS_MODULE_OFFER__THESISS:
			return getThesiss();
		case CmsNewPackage.THESIS_MODULE_OFFER__CP:
			return getCp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsNewPackage.THESIS_MODULE_OFFER__THESISS:
			getThesiss().clear();
			getThesiss().addAll((Collection<? extends Thesis>) newValue);
			return;
		case CmsNewPackage.THESIS_MODULE_OFFER__CP:
			setCp((Integer) newValue);
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
		case CmsNewPackage.THESIS_MODULE_OFFER__THESISS:
			getThesiss().clear();
			return;
		case CmsNewPackage.THESIS_MODULE_OFFER__CP:
			setCp(CP_EDEFAULT);
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
		case CmsNewPackage.THESIS_MODULE_OFFER__THESISS:
			return thesiss != null && !thesiss.isEmpty();
		case CmsNewPackage.THESIS_MODULE_OFFER__CP:
			return cp != CP_EDEFAULT;
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
		result.append(" (cp: ");
		result.append(cp);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ThesisModuleOfferImpl
