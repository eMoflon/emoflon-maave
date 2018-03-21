/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Grade
 * Formular</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.GradeFormular#getRecords
 * <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getGradeFormular()
 * @model
 * @generated
 */
public interface GradeFormular extends EObject {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.moflon.maave.tests.lang.cmsNew.Entry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getGradeFormular_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getRecords();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // GradeFormular
