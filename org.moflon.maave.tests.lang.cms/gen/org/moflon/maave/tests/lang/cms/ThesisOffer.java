/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisOffer#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisOffer#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisOffer()
 * @model
 * @generated
 */
public interface ThesisOffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(long)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisOffer_Begin()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getBegin();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ThesisOffer#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(long)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisOffer_End()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ThesisOffer#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ThesisOffer
