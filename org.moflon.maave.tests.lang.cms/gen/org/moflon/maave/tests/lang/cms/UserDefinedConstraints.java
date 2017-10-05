/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getUserDefinedConstraints()
 * @model
 * @generated
 */
public interface UserDefinedConstraints extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void _NC_atMostOneRecordForModuleOffer(Enrollment enrolment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void _NC_onlyOneEntryForID(GradeFormular gradeFormular);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void _NC_noTwoStudentsWithSameId(Student studentA, Student studentB);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void _NC_atMostOneRegistrationForExamPerEnrolment(Enrollment enrolment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void _NC_onlyOneExamForFromular(Exam examB, Exam examA);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UserDefinedConstraints
