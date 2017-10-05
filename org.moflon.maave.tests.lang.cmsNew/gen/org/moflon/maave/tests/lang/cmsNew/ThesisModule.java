/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule#getActThesModOffer <em>Act Thes Mod Offer</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisModule()
 * @model
 * @generated
 */
public interface ThesisModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Act Thes Mod Offer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act Thes Mod Offer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act Thes Mod Offer</em>' containment reference.
	 * @see #setActThesModOffer(ThesisModuleOffer)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisModule_ActThesModOffer()
	 * @model containment="true"
	 * @generated
	 */
	ThesisModuleOffer getActThesModOffer();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule#getActThesModOffer <em>Act Thes Mod Offer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act Thes Mod Offer</em>' containment reference.
	 * @see #getActThesModOffer()
	 * @generated
	 */
	void setActThesModOffer(ThesisModuleOffer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisModule_Id()
	 * @model ordered="false"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ThesisModule
