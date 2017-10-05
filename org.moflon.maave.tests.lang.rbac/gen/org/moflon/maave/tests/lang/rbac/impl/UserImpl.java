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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.Role;
import org.moflon.maave.tests.lang.rbac.Session;
import org.moflon.maave.tests.lang.rbac.User;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.UserImpl#getUserSessions <em>User Sessions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.UserImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.UserImpl#getNrOfSessions <em>Nr Of Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends NamedElementImpl implements User {
	/**
	 * The cached value of the '{@link #getUserSessions() <em>User Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> userSessions;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The default value of the '{@link #getNrOfSessions() <em>Nr Of Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSessions()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_SESSIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfSessions() <em>Nr Of Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSessions()
	 * @generated
	 * @ordered
	 */
	protected int nrOfSessions = NR_OF_SESSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getUserSessions() {
		if (userSessions == null) {
			userSessions = new EObjectContainmentEList<Session>(Session.class, this, RbacPackage.USER__USER_SESSIONS);
		}
		return userSessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, RbacPackage.USER__ROLES,
					RbacPackage.ROLE__USERS);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfSessions() {
		return nrOfSessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfSessions(int newNrOfSessions) {
		int oldNrOfSessions = nrOfSessions;
		nrOfSessions = newNrOfSessions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.USER__NR_OF_SESSIONS, oldNrOfSessions,
					nrOfSessions));
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
		case RbacPackage.USER__ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRoles()).basicAdd(otherEnd, msgs);
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
		case RbacPackage.USER__USER_SESSIONS:
			return ((InternalEList<?>) getUserSessions()).basicRemove(otherEnd, msgs);
		case RbacPackage.USER__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
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
		case RbacPackage.USER__USER_SESSIONS:
			return getUserSessions();
		case RbacPackage.USER__ROLES:
			return getRoles();
		case RbacPackage.USER__NR_OF_SESSIONS:
			return getNrOfSessions();
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
		case RbacPackage.USER__USER_SESSIONS:
			getUserSessions().clear();
			getUserSessions().addAll((Collection<? extends Session>) newValue);
			return;
		case RbacPackage.USER__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case RbacPackage.USER__NR_OF_SESSIONS:
			setNrOfSessions((Integer) newValue);
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
		case RbacPackage.USER__USER_SESSIONS:
			getUserSessions().clear();
			return;
		case RbacPackage.USER__ROLES:
			getRoles().clear();
			return;
		case RbacPackage.USER__NR_OF_SESSIONS:
			setNrOfSessions(NR_OF_SESSIONS_EDEFAULT);
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
		case RbacPackage.USER__USER_SESSIONS:
			return userSessions != null && !userSessions.isEmpty();
		case RbacPackage.USER__ROLES:
			return roles != null && !roles.isEmpty();
		case RbacPackage.USER__NR_OF_SESSIONS:
			return nrOfSessions != NR_OF_SESSIONS_EDEFAULT;
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
		result.append(" (nrOfSessions: ");
		result.append(nrOfSessions);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserImpl
