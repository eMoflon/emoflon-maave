/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ProgramManagement#getModuleOffers <em>Module Offers</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ProgramManagement#getPrograms <em>Programs</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ProgramManagement#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgramManagement()
 * @model
 * @generated
 */
public interface ProgramManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Offers</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.ModuleOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Offers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Offers</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgramManagement_ModuleOffers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleOffer> getModuleOffers();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Program}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgramManagement_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getProgramManagement_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ProgramManagement
