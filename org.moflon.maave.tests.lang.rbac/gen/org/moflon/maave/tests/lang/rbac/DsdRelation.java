/**
 */
package org.moflon.maave.tests.lang.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsd Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.DsdRelation#getDsdExclusiveRole <em>Dsd Exclusive Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getDsdRelation()
 * @model
 * @generated
 */
public interface DsdRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Dsd Exclusive Role</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.rbac.Role}.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.rbac.Role#getDsdRelation <em>Dsd Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsd Exclusive Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsd Exclusive Role</em>' reference list.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#getDsdRelation_DsdExclusiveRole()
	 * @see org.moflon.maave.tests.lang.rbac.Role#getDsdRelation
	 * @model opposite="dsdRelation"
	 * @generated
	 */
	EList<Role> getDsdExclusiveRole();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // DsdRelation
