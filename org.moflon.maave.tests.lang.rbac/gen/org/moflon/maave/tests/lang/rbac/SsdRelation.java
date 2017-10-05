/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssd Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.SsdRelation#getSsdExclusiveRoles <em>Ssd Exclusive Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getSsdRelation()
 * @model
 * @generated
 */
public interface SsdRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Ssd Exclusive Roles</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Role#getSsdRelation <em>Ssd Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssd Exclusive Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssd Exclusive Roles</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getSsdRelation_SsdExclusiveRoles()
	 * @see org.moflon.maave.tests.lang.rbac.Role#getSsdRelation
	 * @model opposite="ssdRelation"
	 * @generated
	 */
	EList<Role> getSsdExclusiveRoles();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SsdRelation
