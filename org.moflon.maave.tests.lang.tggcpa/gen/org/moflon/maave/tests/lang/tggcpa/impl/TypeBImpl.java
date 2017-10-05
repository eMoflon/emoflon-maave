/**
 */
package org.moflon.maave.tests.lang.tggcpa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.tggcpa.TggcpaPackage;
import org.moflon.maave.tests.lang.tggcpa.Transl;
import org.moflon.maave.tests.lang.tggcpa.TypeB;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.tggcpa.impl.TypeBImpl#getTransl <em>Transl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBImpl extends EObjectImpl implements TypeB {
	/**
	 * The cached value of the '{@link #getTransl() <em>Transl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransl()
	 * @generated
	 * @ordered
	 */
	protected Transl transl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggcpaPackage.Literals.TYPE_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transl getTransl() {
		if (transl != null && transl.eIsProxy()) {
			InternalEObject oldTransl = (InternalEObject) transl;
			transl = (Transl) eResolveProxy(oldTransl);
			if (transl != oldTransl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggcpaPackage.TYPE_B__TRANSL, oldTransl,
							transl));
			}
		}
		return transl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transl basicGetTransl() {
		return transl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransl(Transl newTransl) {
		Transl oldTransl = transl;
		transl = newTransl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggcpaPackage.TYPE_B__TRANSL, oldTransl, transl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TggcpaPackage.TYPE_B__TRANSL:
			if (resolve)
				return getTransl();
			return basicGetTransl();
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
		case TggcpaPackage.TYPE_B__TRANSL:
			setTransl((Transl) newValue);
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
		case TggcpaPackage.TYPE_B__TRANSL:
			setTransl((Transl) null);
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
		case TggcpaPackage.TYPE_B__TRANSL:
			return transl != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeBImpl
