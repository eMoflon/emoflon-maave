/**
 */
package org.moflon.maave.tests.lang.featuremodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.featuremodel.Feature;
import org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage;
import org.moflon.maave.tests.lang.featuremodel.Group;
import org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute;
import org.moflon.maave.tests.lang.featuremodel.RealFeatureAttribute;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl#getNat <em>Nat</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl#getReq <em>Req</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl#isSel <em>Sel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends EObjectImpl implements Feature {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getReal() <em>Real</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected EList<RealFeatureAttribute> real;

	/**
	 * The cached value of the '{@link #getNat() <em>Nat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNat()
	 * @generated
	 * @ordered
	 */
	protected EList<NatFeatureAttribute> nat;

	/**
	 * The cached value of the '{@link #getReq() <em>Req</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> req;

	/**
	 * The default value of the '{@link #isSel() <em>Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSel() <em>Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSel()
	 * @generated
	 * @ordered
	 */
	protected boolean sel = SEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, FeaturemodelPackage.FEATURE__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealFeatureAttribute> getReal() {
		if (real == null) {
			real = new EObjectContainmentEList<RealFeatureAttribute>(RealFeatureAttribute.class, this,
					FeaturemodelPackage.FEATURE__REAL);
		}
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NatFeatureAttribute> getNat() {
		if (nat == null) {
			nat = new EObjectContainmentEList<NatFeatureAttribute>(NatFeatureAttribute.class, this,
					FeaturemodelPackage.FEATURE__NAT);
		}
		return nat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getReq() {
		if (req == null) {
			req = new EObjectResolvingEList<Feature>(Feature.class, this, FeaturemodelPackage.FEATURE__REQ);
		}
		return req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSel() {
		return sel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSel(boolean newSel) {
		boolean oldSel = sel;
		sel = newSel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE__SEL, oldSel, sel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case FeaturemodelPackage.FEATURE__REAL:
			return ((InternalEList<?>) getReal()).basicRemove(otherEnd, msgs);
		case FeaturemodelPackage.FEATURE__NAT:
			return ((InternalEList<?>) getNat()).basicRemove(otherEnd, msgs);
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
		case FeaturemodelPackage.FEATURE__GROUPS:
			return getGroups();
		case FeaturemodelPackage.FEATURE__REAL:
			return getReal();
		case FeaturemodelPackage.FEATURE__NAT:
			return getNat();
		case FeaturemodelPackage.FEATURE__REQ:
			return getReq();
		case FeaturemodelPackage.FEATURE__SEL:
			return isSel();
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
		case FeaturemodelPackage.FEATURE__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
			return;
		case FeaturemodelPackage.FEATURE__REAL:
			getReal().clear();
			getReal().addAll((Collection<? extends RealFeatureAttribute>) newValue);
			return;
		case FeaturemodelPackage.FEATURE__NAT:
			getNat().clear();
			getNat().addAll((Collection<? extends NatFeatureAttribute>) newValue);
			return;
		case FeaturemodelPackage.FEATURE__REQ:
			getReq().clear();
			getReq().addAll((Collection<? extends Feature>) newValue);
			return;
		case FeaturemodelPackage.FEATURE__SEL:
			setSel((Boolean) newValue);
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
		case FeaturemodelPackage.FEATURE__GROUPS:
			getGroups().clear();
			return;
		case FeaturemodelPackage.FEATURE__REAL:
			getReal().clear();
			return;
		case FeaturemodelPackage.FEATURE__NAT:
			getNat().clear();
			return;
		case FeaturemodelPackage.FEATURE__REQ:
			getReq().clear();
			return;
		case FeaturemodelPackage.FEATURE__SEL:
			setSel(SEL_EDEFAULT);
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
		case FeaturemodelPackage.FEATURE__GROUPS:
			return groups != null && !groups.isEmpty();
		case FeaturemodelPackage.FEATURE__REAL:
			return real != null && !real.isEmpty();
		case FeaturemodelPackage.FEATURE__NAT:
			return nat != null && !nat.isEmpty();
		case FeaturemodelPackage.FEATURE__REQ:
			return req != null && !req.isEmpty();
		case FeaturemodelPackage.FEATURE__SEL:
			return sel != SEL_EDEFAULT;
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
		result.append(" (sel: ");
		result.append(sel);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FeatureImpl
