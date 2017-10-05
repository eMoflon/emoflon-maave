/**
 */
package org.moflon.maave.tests.lang.cmsNew;

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
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getSemester <em>Semester</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getDate <em>Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getRegSt <em>Reg St</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getLecture()
 * @model
 * @generated
 */
public interface Lecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getOfferedLectures <em>Offered Lectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getLecture_Semester()
	 * @see org.moflon.maave.tests.lang.cmsNew.Semester#getOfferedLectures
	 * @model opposite="offeredLectures" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.cmsNew.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getLecture_Date()
	 * @model containment="true"
	 * @generated
	 */
	EList<Date> getDate();

	/**
	 * Returns the value of the '<em><b>Reg St</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg St</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg St</em>' attribute.
	 * @see #setRegSt(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getLecture_RegSt()
	 * @model ordered="false"
	 * @generated
	 */
	int getRegSt();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getRegSt <em>Reg St</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg St</em>' attribute.
	 * @see #getRegSt()
	 * @generated
	 */
	void setRegSt(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Lecture
