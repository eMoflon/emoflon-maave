/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Session#getSessionRoles <em>Session Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Session#getNrOfActivatedRoles <em>Nr Of Activated Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Roles</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Role#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Roles</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getSession_SessionRoles()
	 * @see org.moflon.maave.tests.lang.rbac.Role#getSessions
	 * @model opposite="sessions"
	 * @generated
	 */
	EList<Role> getSessionRoles();

	/**
	 * Returns the value of the '<em><b>Nr Of Activated Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Activated Roles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Activated Roles</em>' attribute.
	 * @see #setNrOfActivatedRoles(int)
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getSession_NrOfActivatedRoles()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNrOfActivatedRoles();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.rbac.Session#getNrOfActivatedRoles <em>Nr Of Activated Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Activated Roles</em>' attribute.
	 * @see #getNrOfActivatedRoles()
	 * @generated
	 */
	void setNrOfActivatedRoles(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Session
