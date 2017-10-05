/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisModule#getThesises <em>Thesises</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisModule#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisModule()
 * @model
 * @generated
 */
public interface ThesisModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Thesises</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.ThesisOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesises</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesises</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisModule_Thesises()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThesisOffer> getThesises();

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
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisModule_Id()
	 * @model ordered="false"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ThesisModule#getId <em>Id</em>}' attribute.
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
