/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perm Ssd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.PermSsd#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getPermSsd()
 * @model
 * @generated
 */
public interface PermSsd extends EObject {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getPermSsd_Permission()
	 * @model lower="2"
	 * @generated
	 */
	EList<Permission> getPermission();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // PermSsd
