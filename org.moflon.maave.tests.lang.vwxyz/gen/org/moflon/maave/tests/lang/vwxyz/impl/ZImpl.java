/**
 */
package org.moflon.maave.tests.lang.vwxyz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.maave.tests.lang.vwxyz.VwxyzPackage;
import org.moflon.maave.tests.lang.vwxyz.Z;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Z</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.impl.ZImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.vwxyz.impl.ZImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZImpl extends EObjectImpl implements Z {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Z next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VwxyzPackage.Literals.Z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Z getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Z newNext, NotificationChain msgs) {
		Z oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VwxyzPackage.Z__NEXT,
					oldNext, newNext);
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
	public void setNext(Z newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, VwxyzPackage.Z__PREVIOUS, Z.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this, VwxyzPackage.Z__PREVIOUS, Z.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VwxyzPackage.Z__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Z getPrevious() {
		if (eContainerFeatureID() != VwxyzPackage.Z__PREVIOUS)
			return null;
		return (Z) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Z newPrevious, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPrevious, VwxyzPackage.Z__PREVIOUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Z newPrevious) {
		if (newPrevious != eInternalContainer()
				|| (eContainerFeatureID() != VwxyzPackage.Z__PREVIOUS && newPrevious != null)) {
			if (EcoreUtil.isAncestor(this, newPrevious))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this, VwxyzPackage.Z__NEXT, Z.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VwxyzPackage.Z__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VwxyzPackage.Z__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VwxyzPackage.Z__NEXT,
						null, msgs);
			return basicSetNext((Z) otherEnd, msgs);
		case VwxyzPackage.Z__PREVIOUS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPrevious((Z) otherEnd, msgs);
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
		case VwxyzPackage.Z__NEXT:
			return basicSetNext(null, msgs);
		case VwxyzPackage.Z__PREVIOUS:
			return basicSetPrevious(null, msgs);
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
		case VwxyzPackage.Z__PREVIOUS:
			return eInternalContainer().eInverseRemove(this, VwxyzPackage.Z__NEXT, Z.class, msgs);
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
		case VwxyzPackage.Z__NEXT:
			return getNext();
		case VwxyzPackage.Z__PREVIOUS:
			return getPrevious();
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
		case VwxyzPackage.Z__NEXT:
			setNext((Z) newValue);
			return;
		case VwxyzPackage.Z__PREVIOUS:
			setPrevious((Z) newValue);
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
		case VwxyzPackage.Z__NEXT:
			setNext((Z) null);
			return;
		case VwxyzPackage.Z__PREVIOUS:
			setPrevious((Z) null);
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
		case VwxyzPackage.Z__NEXT:
			return next != null;
		case VwxyzPackage.Z__PREVIOUS:
			return getPrevious() != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ZImpl
