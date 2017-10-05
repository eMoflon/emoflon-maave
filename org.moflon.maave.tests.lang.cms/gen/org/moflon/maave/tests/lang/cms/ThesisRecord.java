/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getThesisModule <em>Thesis Module</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getThesis <em>Thesis</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getTries <em>Tries</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ThesisRecord#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisRecord()
 * @model
 * @generated
 */
public interface ThesisRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Thesis Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesis Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis Module</em>' reference.
	 * @see #setThesisModule(ThesisModule)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisRecord_ThesisModule()
	 * @model
	 * @generated
	 */
	ThesisModule getThesisModule();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getThesisModule <em>Thesis Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesis Module</em>' reference.
	 * @see #getThesisModule()
	 * @generated
	 */
	void setThesisModule(ThesisModule value);

	/**
	 * Returns the value of the '<em><b>Thesis</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cms.ThesisOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thesis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis</em>' reference list.
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisRecord_Thesis()
	 * @model
	 * @generated
	 */
	EList<ThesisOffer> getThesis();

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisRecord_Grade()
	 * @model ordered="false"
	 * @generated
	 */
	int getGrade();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(int value);

	/**
	 * Returns the value of the '<em><b>Tries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tries</em>' attribute.
	 * @see #setTries(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisRecord_Tries()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getTries();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getTries <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tries</em>' attribute.
	 * @see #getTries()
	 * @generated
	 */
	void setTries(int value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getThesisRecord_Running()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ThesisRecord
