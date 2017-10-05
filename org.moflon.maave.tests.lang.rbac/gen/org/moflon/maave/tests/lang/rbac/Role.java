/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Role#getSessions <em>Sessions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Role#getDsdRelation <em>Dsd Relation</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Role#getUsers <em>Users</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Role#getSsdRelation <em>Ssd Relation</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Role#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Role#getSeniorRoles <em>Senior Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Role#getJuniorRoles <em>Junior Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Session}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Session#getSessionRoles <em>Session Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole_Sessions()
	 * @see org.moflon.maave.tests.lang.rbac.Session#getSessionRoles
	 * @model opposite="sessionRoles"
	 * @generated
	 */
	EList<Session> getSessions();

	/**
	 * Returns the value of the '<em><b>Dsd Relation</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.DsdRelation}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.DsdRelation#getDsdExclusiveRole <em>Dsd Exclusive Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsd Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsd Relation</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole_DsdRelation()
	 * @see org.moflon.maave.tests.lang.rbac.DsdRelation#getDsdExclusiveRole
	 * @model opposite="dsdExclusiveRole"
	 * @generated
	 */
	EList<DsdRelation> getDsdRelation();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.User}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole_Users()
	 * @see org.moflon.maave.tests.lang.rbac.User#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Ssd Relation</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.SsdRelation}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.SsdRelation#getSsdExclusiveRoles <em>Ssd Exclusive Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssd Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssd Relation</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole_SsdRelation()
	 * @see org.moflon.maave.tests.lang.rbac.SsdRelation#getSsdExclusiveRoles
	 * @model opposite="ssdExclusiveRoles"
	 * @generated
	 */
	EList<SsdRelation> getSsdRelation();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Permission}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Permission#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole_Permissions()
	 * @see org.moflon.maave.tests.lang.rbac.Permission#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Senior Roles</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Role#getJuniorRoles <em>Junior Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senior Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senior Roles</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole_SeniorRoles()
	 * @see org.moflon.maave.tests.lang.rbac.Role#getJuniorRoles
	 * @model opposite="juniorRoles"
	 * @generated
	 */
	EList<Role> getSeniorRoles();

	/**
	 * Returns the value of the '<em><b>Junior Roles</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Role#getSeniorRoles <em>Senior Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Junior Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Junior Roles</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getRole_JuniorRoles()
	 * @see org.moflon.maave.tests.lang.rbac.Role#getSeniorRoles
	 * @model opposite="seniorRoles"
	 * @generated
	 */
	EList<Role> getJuniorRoles();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Role
