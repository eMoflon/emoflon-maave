/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getRecord <em>Record</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesis()
 * @model
 * @generated
 */
public interface Thesis extends EObject {
	/**
	 * Returns the value of the '<em><b>Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' reference.
	 * @see #setRecord(ThesisRecord)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesis_Record()
	 * @see org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesis
	 * @model opposite="thesis"
	 * @generated
	 */
	ThesisRecord getRecord();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getRecord <em>Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(ThesisRecord value);

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
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesis_Grade()
	 * @model ordered="false"
	 * @generated
	 */
	int getGrade();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.moflon.maave.tests.lang.cmsNew.TH_STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.TH_STATE
	 * @see #setState(TH_STATE)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getThesis_State()
	 * @model ordered="false"
	 * @generated
	 */
	TH_STATE getState();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.TH_STATE
	 * @see #getState()
	 * @generated
	 */
	void setState(TH_STATE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterGrade_v0();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Thesis
