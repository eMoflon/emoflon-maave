/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Co Mod
 * Offer</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLecMan <em>Lec
 * Man</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getExams
 * <em>Exams</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLectures
 * <em>Lectures</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getCp
 * <em>Cp</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getState
 * <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCoModOffer()
 * @model
 * @generated
 */
public interface CoModOffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Lec Man</b></em>' container reference. It is
	 * bidirectional and its opposite is
	 * '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModuleOffers
	 * <em>Module Offers</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lec Man</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lec Man</em>' container reference.
	 * @see #setLecMan(CourseManagement)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCoModOffer_LecMan()
	 * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModuleOffers
	 * @model opposite="moduleOffers" transient="false"
	 * @generated
	 */
	CourseManagement getLecMan();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLecMan <em>Lec
	 * Man</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Lec Man</em>' container reference.
	 * @see #getLecMan()
	 * @generated
	 */
	void setLecMan(CourseManagement value);

	/**
	 * Returns the value of the '<em><b>Exams</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exams</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exams</em>' reference.
	 * @see #setExams(Exam)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCoModOffer_Exams()
	 * @model
	 * @generated
	 */
	Exam getExams();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getExams
	 * <em>Exams</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Exams</em>' reference.
	 * @see #getExams()
	 * @generated
	 */
	void setExams(Exam value);

	/**
	 * Returns the value of the '<em><b>Lectures</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lectures</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lectures</em>' reference.
	 * @see #setLectures(Lecture)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCoModOffer_Lectures()
	 * @model
	 * @generated
	 */
	Lecture getLectures();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLectures
	 * <em>Lectures</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Lectures</em>' reference.
	 * @see #getLectures()
	 * @generated
	 */
	void setLectures(Lecture value);

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(int)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCoModOffer_Cp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCp();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getCp <em>Cp</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute. The literals are
	 * from the enumeration {@link org.moflon.maave.tests.lang.cmsNew.CMO_STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.CMO_STATE
	 * @see #setState(CMO_STATE)
	 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCoModOffer_State()
	 * @model ordered="false"
	 * @generated
	 */
	CMO_STATE getState();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getState
	 * <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>State</em>' attribute.
	 * @see org.moflon.maave.tests.lang.cmsNew.CMO_STATE
	 * @see #getState()
	 * @generated
	 */
	void setState(CMO_STATE value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void updateExam_v1(SystemTimer system, Exam ex);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void setLecture_v0(Lecture lect);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void setExam_v0(Exam ex);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void reset_v0();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void updateExam_v0(Exam ex);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void updateLecture_v0(Lecture lec);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void closeModuleOffer_v0();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CoModOffer
