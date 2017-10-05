/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strudent Affairs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.StrudentAffairs#getStudents <em>Students</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getStrudentAffairs()
 * @model
 * @generated
 */
public interface StrudentAffairs extends EObject {
	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getStrudentAffairs_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StrudentAffairs
