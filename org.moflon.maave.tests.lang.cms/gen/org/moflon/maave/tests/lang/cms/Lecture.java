/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Lecture#getLectureDates <em>Lecture Dates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getLecture()
 * @model
 * @generated
 */
public interface Lecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Lecture Dates</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.CalendarDate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecture Dates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Dates</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getLecture_LectureDates()
	 * @model containment="true"
	 * @generated
	 */
	EList<CalendarDate> getLectureDates();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Lecture
