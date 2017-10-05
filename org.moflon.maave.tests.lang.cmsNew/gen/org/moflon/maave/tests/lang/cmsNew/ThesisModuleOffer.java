/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis Module Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer#getThesiss <em>Thesiss</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer#getCp <em>Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisModuleOffer()
 * @model
 * @generated
 */
public interface ThesisModuleOffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Thesiss</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Thesis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesiss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesiss</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisModuleOffer_Thesiss()
	 * @model containment="true"
	 * @generated
	 */
	EList<Thesis> getThesiss();

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesisModuleOffer_Cp()
	 * @model ordered="false"
	 * @generated
	 */
	int getCp();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer#getCp <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ThesisModuleOffer
