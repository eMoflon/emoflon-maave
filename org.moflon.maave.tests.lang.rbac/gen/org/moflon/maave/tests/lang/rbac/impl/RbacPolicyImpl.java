/**
 */
package org.moflon.maave.tests.lang.rbac.impl;

import java.lang.Object;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.rbac.DsdRelation;
import org.moflon.maave.tests.lang.rbac.PermSsd;
import org.moflon.maave.tests.lang.rbac.Permission;
import org.moflon.maave.tests.lang.rbac.RbacFactory;
import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.RbacPolicy;
import org.moflon.maave.tests.lang.rbac.Role;
import org.moflon.maave.tests.lang.rbac.Session;
import org.moflon.maave.tests.lang.rbac.SsdRelation;
import org.moflon.maave.tests.lang.rbac.User;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl#getDsdRelations <em>Dsd Relations</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl#getPermssd <em>Permssd</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl#getSsdRelation <em>Ssd Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RbacPolicyImpl extends EObjectImpl implements RbacPolicy {
	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getDsdRelations() <em>Dsd Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsdRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DsdRelation> dsdRelations;

	/**
	 * The cached value of the '{@link #getPermssd() <em>Permssd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermssd()
	 * @generated
	 * @ordered
	 */
	protected EList<PermSsd> permssd;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getSsdRelation() <em>Ssd Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsdRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<SsdRelation> ssdRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RbacPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.RBAC_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectContainmentEList<Permission>(Permission.class, this,
					RbacPackage.RBAC_POLICY__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, RbacPackage.RBAC_POLICY__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DsdRelation> getDsdRelations() {
		if (dsdRelations == null) {
			dsdRelations = new EObjectContainmentEList<DsdRelation>(DsdRelation.class, this,
					RbacPackage.RBAC_POLICY__DSD_RELATIONS);
		}
		return dsdRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PermSsd> getPermssd() {
		if (permssd == null) {
			permssd = new EObjectContainmentEList<PermSsd>(PermSsd.class, this, RbacPackage.RBAC_POLICY__PERMSSD);
		}
		return permssd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, RbacPackage.RBAC_POLICY__USERS);
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
			ssdRelation = new EObjectContainmentEList<SsdRelation>(SsdRelation.class, this,
					RbacPackage.RBAC_POLICY__SSD_RELATION);
		}
		return ssdRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean __validateSSD(Role roleA) {// ActivityNode1
		Object[] result1_black = RbacPolicyImpl.pattern_RbacPolicy_0_1_ActivityNode1_blackBFFF(roleA);
		if (result1_black != null) {
			// User userA = (User) result1_black[1];
			// Role roleB = (Role) result1_black[2];
			// SsdRelation ssdRelation = (SsdRelation) result1_black[3];
			return RbacPolicyImpl.pattern_RbacPolicy_0_2_expressionF();
		} else {
			return RbacPolicyImpl.pattern_RbacPolicy_0_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addUserToRole(User user, Role role) {
		// ActivityNode2
		Object[] result1_black = RbacPolicyImpl.pattern_RbacPolicy_1_1_ActivityNode2_blackBB(role, user);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode2] failed." + " Variables: " + "[role] = "
					+ role + ", " + "[user] = " + user + ".");
		}
		RbacPolicyImpl.pattern_RbacPolicy_1_1_ActivityNode2_greenBB(role, user);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void __validateDSD(Role aRoleA) {
		// ActivityNode3
		Object[] result1_black = RbacPolicyImpl.pattern_RbacPolicy_2_1_ActivityNode3_blackFBFF(aRoleA);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode3] failed." + " Variables: " + "[aRoleA] = " + aRoleA + ".");
		}
		// Session aSession = (Session) result1_black[0];
		// DsdRelation aDsdRelation = (DsdRelation) result1_black[2];
		// Role aRoleB = (Role) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void activateRole(Role role, Session session, User user) {
		// ActivityNode4
		Object[] result1_black = RbacPolicyImpl.pattern_RbacPolicy_3_1_ActivityNode4_blackBBB(session, user, role);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode4] failed." + " Variables: "
					+ "[session] = " + session + ", " + "[user] = " + user + ", " + "[role] = " + role + ".");
		}
		RbacPolicyImpl.pattern_RbacPolicy_3_1_ActivityNode4_greenBB(session, role);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addUserToRoleCorrect(Role role, User user) {
		// ActivityNode5
		Object[] result1_black = RbacPolicyImpl.pattern_RbacPolicy_4_1_ActivityNode5_blackFBBF(user, role);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode5] failed." + " Variables: " + "[user] = "
					+ user + ", " + "[role] = " + role + ".");
		}
		// SsdRelation ssdRelation = (SsdRelation) result1_black[0];
		// Role otherRole = (Role) result1_black[3];
		RbacPolicyImpl.pattern_RbacPolicy_4_1_ActivityNode5_greenBB(user, role);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void activateRole(User user, Role role, Session session) {
		// ActivityNode6
		Object[] result1_black = RbacPolicyImpl.pattern_RbacPolicy_5_1_ActivityNode6_blackBBB(user, session, role);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode6] failed." + " Variables: " + "[user] = "
					+ user + ", " + "[session] = " + session + ", " + "[role] = " + role + ".");
		}
		RbacPolicyImpl.pattern_RbacPolicy_5_1_ActivityNode6_greenBB(session, role);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSession(User user) {
		// ActivityNode7
		Object[] result1_black = RbacPolicyImpl.pattern_RbacPolicy_6_1_ActivityNode7_blackB(user);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode7] failed." + " Variables: " + "[user] = " + user + ".");
		}
		RbacPolicyImpl.pattern_RbacPolicy_6_1_ActivityNode7_greenBF(user);
		// Session session = (Session) result1_green[1];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RbacPackage.RBAC_POLICY__PERMISSIONS:
			return ((InternalEList<?>) getPermissions()).basicRemove(otherEnd, msgs);
		case RbacPackage.RBAC_POLICY__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
		case RbacPackage.RBAC_POLICY__DSD_RELATIONS:
			return ((InternalEList<?>) getDsdRelations()).basicRemove(otherEnd, msgs);
		case RbacPackage.RBAC_POLICY__PERMSSD:
			return ((InternalEList<?>) getPermssd()).basicRemove(otherEnd, msgs);
		case RbacPackage.RBAC_POLICY__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
		case RbacPackage.RBAC_POLICY__SSD_RELATION:
			return ((InternalEList<?>) getSsdRelation()).basicRemove(otherEnd, msgs);
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
		case RbacPackage.RBAC_POLICY__PERMISSIONS:
			return getPermissions();
		case RbacPackage.RBAC_POLICY__ROLES:
			return getRoles();
		case RbacPackage.RBAC_POLICY__DSD_RELATIONS:
			return getDsdRelations();
		case RbacPackage.RBAC_POLICY__PERMSSD:
			return getPermssd();
		case RbacPackage.RBAC_POLICY__USERS:
			return getUsers();
		case RbacPackage.RBAC_POLICY__SSD_RELATION:
			return getSsdRelation();
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
		case RbacPackage.RBAC_POLICY__PERMISSIONS:
			getPermissions().clear();
			getPermissions().addAll((Collection<? extends Permission>) newValue);
			return;
		case RbacPackage.RBAC_POLICY__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case RbacPackage.RBAC_POLICY__DSD_RELATIONS:
			getDsdRelations().clear();
			getDsdRelations().addAll((Collection<? extends DsdRelation>) newValue);
			return;
		case RbacPackage.RBAC_POLICY__PERMSSD:
			getPermssd().clear();
			getPermssd().addAll((Collection<? extends PermSsd>) newValue);
			return;
		case RbacPackage.RBAC_POLICY__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
			return;
		case RbacPackage.RBAC_POLICY__SSD_RELATION:
			getSsdRelation().clear();
			getSsdRelation().addAll((Collection<? extends SsdRelation>) newValue);
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
		case RbacPackage.RBAC_POLICY__PERMISSIONS:
			getPermissions().clear();
			return;
		case RbacPackage.RBAC_POLICY__ROLES:
			getRoles().clear();
			return;
		case RbacPackage.RBAC_POLICY__DSD_RELATIONS:
			getDsdRelations().clear();
			return;
		case RbacPackage.RBAC_POLICY__PERMSSD:
			getPermssd().clear();
			return;
		case RbacPackage.RBAC_POLICY__USERS:
			getUsers().clear();
			return;
		case RbacPackage.RBAC_POLICY__SSD_RELATION:
			getSsdRelation().clear();
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
		case RbacPackage.RBAC_POLICY__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case RbacPackage.RBAC_POLICY__ROLES:
			return roles != null && !roles.isEmpty();
		case RbacPackage.RBAC_POLICY__DSD_RELATIONS:
			return dsdRelations != null && !dsdRelations.isEmpty();
		case RbacPackage.RBAC_POLICY__PERMSSD:
			return permssd != null && !permssd.isEmpty();
		case RbacPackage.RBAC_POLICY__USERS:
			return users != null && !users.isEmpty();
		case RbacPackage.RBAC_POLICY__SSD_RELATION:
			return ssdRelation != null && !ssdRelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RbacPackage.RBAC_POLICY___VALIDATE_SSD__VALIDATESSD__ROLE:
			return __validateSSD((Role) arguments.get(0));
		case RbacPackage.RBAC_POLICY___ADD_USER_TO_ROLE__USER_ROLE:
			addUserToRole((User) arguments.get(0), (Role) arguments.get(1));
			return null;
		case RbacPackage.RBAC_POLICY___VALIDATE_DSD__VALIDATEDSD__ROLE:
			__validateDSD((Role) arguments.get(0));
			return null;
		case RbacPackage.RBAC_POLICY___ACTIVATE_ROLE__ROLE_SESSION_USER:
			activateRole((Role) arguments.get(0), (Session) arguments.get(1), (User) arguments.get(2));
			return null;
		case RbacPackage.RBAC_POLICY___ADD_USER_TO_ROLE_CORRECT__ROLE_USER:
			addUserToRoleCorrect((Role) arguments.get(0), (User) arguments.get(1));
			return null;
		case RbacPackage.RBAC_POLICY___ACTIVATE_ROLE__USER_ROLE_SESSION:
			activateRole((User) arguments.get(0), (Role) arguments.get(1), (Session) arguments.get(2));
			return null;
		case RbacPackage.RBAC_POLICY___CREATE_SESSION__USER:
			createSession((User) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RbacPolicy_0_1_ActivityNode1_blackBFFF(Role roleA) {
		for (User userA : roleA.getUsers()) {
			for (SsdRelation ssdRelation : roleA.getSsdRelation()) {
				for (Role roleB : userA.getRoles()) {
					if (!roleA.equals(roleB)) {
						if (ssdRelation.getSsdExclusiveRoles().contains(roleB)) {
							return new Object[] { roleA, userA, roleB, ssdRelation };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_RbacPolicy_0_2_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final boolean pattern_RbacPolicy_0_3_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final Object[] pattern_RbacPolicy_1_1_ActivityNode2_blackBB(Role role, User user) {
		return new Object[] { role, user };
	}

	public static final Object[] pattern_RbacPolicy_1_1_ActivityNode2_greenBB(Role role, User user) {
		user.getRoles().add(role);
		return new Object[] { role, user };
	}

	public static final Object[] pattern_RbacPolicy_2_1_ActivityNode3_blackFBFF(Role aRoleA) {
		for (Session aSession : aRoleA.getSessions()) {
			for (DsdRelation aDsdRelation : aRoleA.getDsdRelation()) {
				for (Role aRoleB : aSession.getSessionRoles()) {
					if (!aRoleA.equals(aRoleB)) {
						if (aRoleB.getDsdRelation().contains(aDsdRelation)) {
							return new Object[] { aSession, aRoleA, aDsdRelation, aRoleB };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RbacPolicy_3_1_ActivityNode4_blackBBB(Session session, User user, Role role) {
		if (user.getRoles().contains(role)) {
			if (user.getUserSessions().contains(session)) {
				return new Object[] { session, user, role };
			}
		}
		return null;
	}

	public static final Object[] pattern_RbacPolicy_3_1_ActivityNode4_greenBB(Session session, Role role) {
		session.getSessionRoles().add(role);
		return new Object[] { session, role };
	}

	public static final Object[] pattern_RbacPolicy_4_1_ActivityNode5_blackFBBF(User user, Role role) {
		for (SsdRelation ssdRelation : role.getSsdRelation()) {
			for (Role otherRole : user.getRoles()) {
				if (!otherRole.equals(role)) {
					if (ssdRelation.getSsdExclusiveRoles().contains(otherRole)) {
						return new Object[] { ssdRelation, user, role, otherRole };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RbacPolicy_4_1_ActivityNode5_greenBB(User user, Role role) {
		user.getRoles().add(role);
		return new Object[] { user, role };
	}

	public static final Object[] pattern_RbacPolicy_5_1_ActivityNode6_blackBBB(User user, Session session, Role role) {
		if (user.getRoles().contains(role)) {
			if (user.getUserSessions().contains(session)) {
				return new Object[] { user, session, role };
			}
		}
		return null;
	}

	public static final Object[] pattern_RbacPolicy_5_1_ActivityNode6_greenBB(Session session, Role role) {
		session.getSessionRoles().add(role);
		return new Object[] { session, role };
	}

	public static final Object[] pattern_RbacPolicy_6_1_ActivityNode7_blackB(User user) {
		return new Object[] { user };
	}

	public static final Object[] pattern_RbacPolicy_6_1_ActivityNode7_greenBF(User user) {
		Session session = RbacFactory.eINSTANCE.createSession();
		user.getUserSessions().add(session);
		return new Object[] { user, session };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RbacPolicyImpl
