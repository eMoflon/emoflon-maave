/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Sys#getCurrentTime <em>Current Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSys()
 * @model
 * @generated
 */
public interface Sys extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time</em>' attribute.
	 * @see #setCurrentTime(long)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getSys_CurrentTime()
	 * @model ordered="false"
	 * @generated
	 */
	long getCurrentTime();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Sys#getCurrentTime <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time</em>' attribute.
	 * @see #getCurrentTime()
	 * @generated
	 */
	void setCurrentTime(long value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Sys
