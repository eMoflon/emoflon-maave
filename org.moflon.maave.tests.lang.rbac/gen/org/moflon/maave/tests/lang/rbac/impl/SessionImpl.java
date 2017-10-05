/**
 */
package org.moflon.maave.tests.lang.rbac.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.Role;
import org.moflon.maave.tests.lang.rbac.Session;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.SessionImpl#getSessionRoles <em>Session Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.SessionImpl#getNrOfActivatedRoles <em>Nr Of Activated Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionImpl extends EObjectImpl implements Session {
	/**
	 * The cached value of the '{@link #getSessionRoles() <em>Session Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> sessionRoles;

	/**
	 * The default value of the '{@link #getNrOfActivatedRoles() <em>Nr Of Activated Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfActivatedRoles()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_ACTIVATED_ROLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfActivatedRoles() <em>Nr Of Activated Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfActivatedRoles()
	 * @generated
	 * @ordered
	 */
	protected int nrOfActivatedRoles = NR_OF_ACTIVATED_ROLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getSessionRoles() {
		if (sessionRoles == null) {
			sessionRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					RbacPackage.SESSION__SESSION_ROLES, RbacPackage.ROLE__SESSIONS);
		}
		return sessionRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfActivatedRoles() {
		return nrOfActivatedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfActivatedRoles(int newNrOfActivatedRoles) {
		int oldNrOfActivatedRoles = nrOfActivatedRoles;
		nrOfActivatedRoles = newNrOfActivatedRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.SESSION__NR_OF_ACTIVATED_ROLES,
					oldNrOfActivatedRoles, nrOfActivatedRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RbacPackage.SESSION__SESSION_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSessionRoles()).basicAdd(otherEnd, msgs);
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
		case RbacPackage.SESSION__SESSION_ROLES:
			return ((InternalEList<?>) getSessionRoles()).basicRemove(otherEnd, msgs);
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
		case RbacPackage.SESSION__SESSION_ROLES:
			return getSessionRoles();
		case RbacPackage.SESSION__NR_OF_ACTIVATED_ROLES:
			return getNrOfActivatedRoles();
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
		case RbacPackage.SESSION__SESSION_ROLES:
			getSessionRoles().clear();
			getSessionRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case RbacPackage.SESSION__NR_OF_ACTIVATED_ROLES:
			setNrOfActivatedRoles((Integer) newValue);
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
		case RbacPackage.SESSION__SESSION_ROLES:
			getSessionRoles().clear();
			return;
		case RbacPackage.SESSION__NR_OF_ACTIVATED_ROLES:
			setNrOfActivatedRoles(NR_OF_ACTIVATED_ROLES_EDEFAULT);
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
		case RbacPackage.SESSION__SESSION_ROLES:
			return sessionRoles != null && !sessionRoles.isEmpty();
		case RbacPackage.SESSION__NR_OF_ACTIVATED_ROLES:
			return nrOfActivatedRoles != NR_OF_ACTIVATED_ROLES_EDEFAULT;
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
		result.append(" (nrOfActivatedRoles: ");
		result.append(nrOfActivatedRoles);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SessionImpl
