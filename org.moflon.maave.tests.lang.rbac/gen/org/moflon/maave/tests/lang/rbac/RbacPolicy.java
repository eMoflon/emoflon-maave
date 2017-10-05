/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getDsdRelations <em>Dsd Relations</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getPermssd <em>Permssd</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getUsers <em>Users</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getSsdRelation <em>Ssd Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRbacPolicy()
 * @model
 * @generated
 */
public interface RbacPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRbacPolicy_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRbacPolicy_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Dsd Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.DsdRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsd Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsd Relations</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRbacPolicy_DsdRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DsdRelation> getDsdRelations();

	/**
	 * Returns the value of the '<em><b>Permssd</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.PermSsd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permssd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permssd</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRbacPolicy_Permssd()
	 * @model containment="true"
	 * @generated
	 */
	EList<PermSsd> getPermssd();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRbacPolicy_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Ssd Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.SsdRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssd Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssd Relation</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRbacPolicy_SsdRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsdRelation> getSsdRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean __validateSSD(Role roleA);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addUserToRole(User user, Role role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void __validateDSD(Role aRoleA);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void activateRole(Role role, Session session, User user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addUserToRoleCorrect(Role role, User user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void activateRole(User user, Role role, Session session);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createSession(User user);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // RbacPolicy
