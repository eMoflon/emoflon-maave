/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getExams <em>Exams</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getLectures <em>Lectures</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getCp <em>Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModuleOffer()
 * @model
 * @generated
 */
public interface ModuleOffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Exams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exams</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exams</em>' reference.
	 * @see #setExams(Exam)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModuleOffer_Exams()
	 * @model
	 * @generated
	 */
	Exam getExams();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getExams <em>Exams</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exams</em>' reference.
	 * @see #getExams()
	 * @generated
	 */
	void setExams(Exam value);

	/**
	 * Returns the value of the '<em><b>Lectures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lectures</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lectures</em>' reference.
	 * @see #setLectures(Lecture)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModuleOffer_Lectures()
	 * @model
	 * @generated
	 */
	Lecture getLectures();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getLectures <em>Lectures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lectures</em>' reference.
	 * @see #getLectures()
	 * @generated
	 */
	void setLectures(Lecture value);

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
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModuleOffer_Cp()
	 * @model ordered="false"
	 * @generated
	 */
	int getCp();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getCp <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ModuleOffer
