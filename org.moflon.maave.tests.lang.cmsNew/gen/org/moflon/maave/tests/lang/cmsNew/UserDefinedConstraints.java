/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>User
 * Defined Constraints</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getUserDefinedConstraints()
 * @model
 * @generated
 */
public interface UserDefinedConstraints extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _NC_SingeltonSystem(SystemTimer system1, SystemTimer system2);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _NC_SingeltonCurrentSem(Semester sem2, Semester sem1);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _NC_NoTwoEnrollmentsWithSameID(Enrollment en1, Enrollment en2);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _NC_NoTwoEntriesWithSameID(GradeFormular gf);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _NC_onlyOneRecordForModuleOfferAndExam(Enrollment en);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _XNC_onlyOneCMOPerExam(Enrollment en);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _NC_OnlyOneRegPerEnrollment(Record rec2, Record rec1);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void _NC_NoCompetingBookings(Room room);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // UserDefinedConstraints
