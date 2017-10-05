/**
 */
package org.moflon.maave.tests.lang.rbac.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.rbac.DsdRelation;
import org.moflon.maave.tests.lang.rbac.Permission;
import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.Role;
import org.moflon.maave.tests.lang.rbac.Session;
import org.moflon.maave.tests.lang.rbac.SsdRelation;
import org.moflon.maave.tests.lang.rbac.User;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl#getDsdRelation <em>Dsd Relation</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl#getSsdRelation <em>Ssd Relation</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl#getSeniorRoles <em>Senior Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl#getJuniorRoles <em>Junior Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getSessions() <em>Sessions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessions;

	/**
	 * The cached value of the '{@link #getDsdRelation() <em>Dsd Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsdRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<DsdRelation> dsdRelation;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getSsdRelation() <em>Ssd Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsdRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<SsdRelation> ssdRelation;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

	/**
	 * The cached value of the '{@link #getSeniorRoles() <em>Senior Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeniorRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> seniorRoles;

	/**
	 * The cached value of the '{@link #getJuniorRoles() <em>Junior Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJuniorRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> juniorRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessions() {
		if (sessions == null) {
			sessions = new EObjectWithInverseResolvingEList.ManyInverse<Session>(Session.class, this,
					RbacPackage.ROLE__SESSIONS, RbacPackage.SESSION__SESSION_ROLES);
		}
		return sessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DsdRelation> getDsdRelation() {
		if (dsdRelation == null) {
			dsdRelation = new EObjectWithInverseResolvingEList.ManyInverse<DsdRelation>(DsdRelation.class, this,
					RbacPackage.ROLE__DSD_RELATION, RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE);
		}
		return dsdRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, RbacPackage.ROLE__USERS,
					RbacPackage.USER__ROLES);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsdRelation> getSsdRelation() {
		if (ssdRelation == null) {
			ssdRelation = new EObjectWithInverseResolvingEList.ManyInverse<SsdRelation>(SsdRelation.class, this,
					RbacPackage.ROLE__SSD_RELATION, RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES);
		}
		return ssdRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectWithInverseResolvingEList.ManyInverse<Permission>(Permission.class, this,
					RbacPackage.ROLE__PERMISSIONS, RbacPackage.PERMISSION__ROLES);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getSeniorRoles() {
		if (seniorRoles == null) {
			seniorRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					RbacPackage.ROLE__SENIOR_ROLES, RbacPackage.ROLE__JUNIOR_ROLES);
		}
		return seniorRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getJuniorRoles() {
		if (juniorRoles == null) {
			juniorRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					RbacPackage.ROLE__JUNIOR_ROLES, RbacPackage.ROLE__SENIOR_ROLES);
		}
		return juniorRoles;
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
		case RbacPackage.ROLE__SESSIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSessions()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__DSD_RELATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDsdRelation()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__USERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsers()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__SSD_RELATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSsdRelation()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__PERMISSIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPermissions()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__SENIOR_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSeniorRoles()).basicAdd(otherEnd, msgs);
		case RbacPackage.ROLE__JUNIOR_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJuniorRoles()).basicAdd(otherEnd, msgs);
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
		case RbacPackage.ROLE__SESSIONS:
			return ((InternalEList<?>) getSessions()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__DSD_RELATION:
			return ((InternalEList<?>) getDsdRelation()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__SSD_RELATION:
			return ((InternalEList<?>) getSsdRelation()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__PERMISSIONS:
			return ((InternalEList<?>) getPermissions()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__SENIOR_ROLES:
			return ((InternalEList<?>) getSeniorRoles()).basicRemove(otherEnd, msgs);
		case RbacPackage.ROLE__JUNIOR_ROLES:
			return ((InternalEList<?>) getJuniorRoles()).basicRemove(otherEnd, msgs);
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
		case RbacPackage.ROLE__SESSIONS:
			return getSessions();
		case RbacPackage.ROLE__DSD_RELATION:
			return getDsdRelation();
		case RbacPackage.ROLE__USERS:
			return getUsers();
		case RbacPackage.ROLE__SSD_RELATION:
			return getSsdRelation();
		case RbacPackage.ROLE__PERMISSIONS:
			return getPermissions();
		case RbacPackage.ROLE__SENIOR_ROLES:
			return getSeniorRoles();
		case RbacPackage.ROLE__JUNIOR_ROLES:
			return getJuniorRoles();
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
		case RbacPackage.ROLE__SESSIONS:
			getSessions().clear();
			getSessions().addAll((Collection<? extends Session>) newValue);
			return;
		case RbacPackage.ROLE__DSD_RELATION:
			getDsdRelation().clear();
			getDsdRelation().addAll((Collection<? extends DsdRelation>) newValue);
			return;
		case RbacPackage.ROLE__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
			return;
		case RbacPackage.ROLE__SSD_RELATION:
			getSsdRelation().clear();
			getSsdRelation().addAll((Collection<? extends SsdRelation>) newValue);
			return;
		case RbacPackage.ROLE__PERMISSIONS:
			getPermissions().clear();
			getPermissions().addAll((Collection<? extends Permission>) newValue);
			return;
		case RbacPackage.ROLE__SENIOR_ROLES:
			getSeniorRoles().clear();
			getSeniorRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case RbacPackage.ROLE__JUNIOR_ROLES:
			getJuniorRoles().clear();
			getJuniorRoles().addAll((Collection<? extends Role>) newValue);
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
		case RbacPackage.ROLE__SESSIONS:
			getSessions().clear();
			return;
		case RbacPackage.ROLE__DSD_RELATION:
			getDsdRelation().clear();
			return;
		case RbacPackage.ROLE__USERS:
			getUsers().clear();
			return;
		case RbacPackage.ROLE__SSD_RELATION:
			getSsdRelation().clear();
			return;
		case RbacPackage.ROLE__PERMISSIONS:
			getPermissions().clear();
			return;
		case RbacPackage.ROLE__SENIOR_ROLES:
			getSeniorRoles().clear();
			return;
		case RbacPackage.ROLE__JUNIOR_ROLES:
			getJuniorRoles().clear();
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
		case RbacPackage.ROLE__SESSIONS:
			return sessions != null && !sessions.isEmpty();
		case RbacPackage.ROLE__DSD_RELATION:
			return dsdRelation != null && !dsdRelation.isEmpty();
		case RbacPackage.ROLE__USERS:
			return users != null && !users.isEmpty();
		case RbacPackage.ROLE__SSD_RELATION:
			return ssdRelation != null && !ssdRelation.isEmpty();
		case RbacPackage.ROLE__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case RbacPackage.ROLE__SENIOR_ROLES:
			return seniorRoles != null && !seniorRoles.isEmpty();
		case RbacPackage.ROLE__JUNIOR_ROLES:
			return juniorRoles != null && !juniorRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RoleImpl
