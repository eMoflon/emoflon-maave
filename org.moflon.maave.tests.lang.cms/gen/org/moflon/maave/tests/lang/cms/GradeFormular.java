/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade Formular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.GradeFormular#getRecords <em>Records</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.GradeFormular#getNrOfEntries <em>Nr Of Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getGradeFormular()
 * @model
 * @generated
 */
public interface GradeFormular extends EObject {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getGradeFormular_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getRecords();

	/**
	 * Returns the value of the '<em><b>Nr Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Entries</em>' attribute.
	 * @see #setNrOfEntries(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getGradeFormular_NrOfEntries()
	 * @model ordered="false"
	 * @generated
	 */
	int getNrOfEntries();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.GradeFormular#getNrOfEntries <em>Nr Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Entries</em>' attribute.
	 * @see #getNrOfEntries()
	 * @generated
	 */
	void setNrOfEntries(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // GradeFormular
