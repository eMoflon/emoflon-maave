/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.User#getUserSessions <em>User Sessions</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.User#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.User#getNrOfSessions <em>Nr Of Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getUser()
 * @model
 * @generated
 */
public interface User extends NamedElement {
	/**
	 * Returns the value of the '<em><b>User Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Session}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Sessions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Sessions</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getUser_UserSessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getUserSessions();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Role#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getUser_Roles()
	 * @see org.moflon.maave.tests.lang.rbac.Role#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Nr Of Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Sessions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Sessions</em>' attribute.
	 * @see #setNrOfSessions(int)
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getUser_NrOfSessions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNrOfSessions();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.rbac.User#getNrOfSessions <em>Nr Of Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Sessions</em>' attribute.
	 * @see #getNrOfSessions()
	 * @generated
	 */
	void setNrOfSessions(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // User
