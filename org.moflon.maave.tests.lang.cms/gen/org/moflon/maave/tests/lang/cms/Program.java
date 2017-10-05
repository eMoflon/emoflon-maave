/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Program#getModules <em>Modules</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Program#getThesisModules <em>Thesis Modules</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Program#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgram_Modules()
	 * @model
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Thesis Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.ThesisModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesis Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis Modules</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgram_ThesisModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThesisModule> getThesisModules();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgram_Id()
	 * @model ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Program#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Program
