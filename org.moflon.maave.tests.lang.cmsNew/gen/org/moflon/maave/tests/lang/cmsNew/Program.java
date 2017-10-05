/**
 */
package org.moflon.maave.tests.lang.cmsNew;

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
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Program#getThesisModules <em>Thesis Modules</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Program#getModules <em>Modules</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Program#getReqCp <em>Req Cp</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Program#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Thesis Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesis Modules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis Modules</em>' containment reference.
	 * @see #setThesisModules(ThesisModule)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getProgram_ThesisModules()
	 * @model containment="true"
	 * @generated
	 */
	ThesisModule getThesisModules();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Program#getThesisModules <em>Thesis Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesis Modules</em>' containment reference.
	 * @see #getThesisModules()
	 * @generated
	 */
	void setThesisModules(ThesisModule value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getProgram_Modules()
	 * @model
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Req Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Cp</em>' attribute.
	 * @see #setReqCp(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getProgram_ReqCp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getReqCp();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Program#getReqCp <em>Req Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Cp</em>' attribute.
	 * @see #getReqCp()
	 * @generated
	 */
	void setReqCp(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getProgram_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Program#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Program
