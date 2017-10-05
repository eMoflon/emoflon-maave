/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Module#getLectureType <em>Lecture Type</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Module#getExamType <em>Exam Type</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Module#getModuleOffer <em>Module Offer</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Module#getId <em>Id</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.Module#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Lecture Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecture Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Type</em>' containment reference.
	 * @see #setLectureType(LecturePrototype)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModule_LectureType()
	 * @model containment="true"
	 * @generated
	 */
	LecturePrototype getLectureType();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Module#getLectureType <em>Lecture Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecture Type</em>' containment reference.
	 * @see #getLectureType()
	 * @generated
	 */
	void setLectureType(LecturePrototype value);

	/**
	 * Returns the value of the '<em><b>Exam Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Type</em>' containment reference.
	 * @see #setExamType(ExamPrototype)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModule_ExamType()
	 * @model containment="true"
	 * @generated
	 */
	ExamPrototype getExamType();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Module#getExamType <em>Exam Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam Type</em>' containment reference.
	 * @see #getExamType()
	 * @generated
	 */
	void setExamType(ExamPrototype value);

	/**
	 * Returns the value of the '<em><b>Module Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Offer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Offer</em>' reference.
	 * @see #setModuleOffer(ModuleOffer)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModule_ModuleOffer()
	 * @model
	 * @generated
	 */
	ModuleOffer getModuleOffer();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Module#getModuleOffer <em>Module Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Offer</em>' reference.
	 * @see #getModuleOffer()
	 * @generated
	 */
	void setModuleOffer(ModuleOffer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModule_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Module#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getModule_Version()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.cms.Module#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Module
