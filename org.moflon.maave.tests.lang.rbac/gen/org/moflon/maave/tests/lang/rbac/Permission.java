/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Permission#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Permission#getObject <em>Object</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.Permission#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getPermission_Roles()
	 * @see org.moflon.maave.tests.lang.rbac.Role#getPermissions
	 * @model opposite="permissions"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(org.moflon.maave.tests.lang.rbac.Object)
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getPermission_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.moflon.maave.tests.lang.rbac.Object getObject();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.rbac.Permission#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(org.moflon.maave.tests.lang.rbac.Object value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getPermission_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.rbac.Permission#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Permission
