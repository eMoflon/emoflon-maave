/**
 */
package org.moflon.maave.tests.lang.tggcpa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.moflon.maave.tests.lang.tggcpa.TggcpaPackage;
import org.moflon.maave.tests.lang.tggcpa.Transl;
import org.moflon.maave.tests.lang.tggcpa.TypeA;
import org.moflon.maave.tests.lang.tggcpa.TypeB;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.tggcpa.impl.TypeAImpl#getTransl <em>Transl</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.tggcpa.impl.TypeAImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAImpl extends EObjectImpl implements TypeA {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeB> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggcpaPackage.Literals.TYPE_A;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggcpaPackage.TYPE_A__TRANSL, oldTransl,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TggcpaPackage.TYPE_A__TRANSL, oldTransl, transl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeB> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<TypeB>(TypeB.class, this, TggcpaPackage.TYPE_A__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TggcpaPackage.TYPE_A__TRANSL:
			if (resolve)
				return getTransl();
			return basicGetTransl();
		case TggcpaPackage.TYPE_A__CHILDREN:
			return getChildren();
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
		case TggcpaPackage.TYPE_A__TRANSL:
			setTransl((Transl) newValue);
			return;
		case TggcpaPackage.TYPE_A__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends TypeB>) newValue);
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
		case TggcpaPackage.TYPE_A__TRANSL:
			setTransl((Transl) null);
			return;
		case TggcpaPackage.TYPE_A__CHILDREN:
			getChildren().clear();
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
		case TggcpaPackage.TYPE_A__TRANSL:
			return transl != null;
		case TggcpaPackage.TYPE_A__CHILDREN:
			return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAImpl
