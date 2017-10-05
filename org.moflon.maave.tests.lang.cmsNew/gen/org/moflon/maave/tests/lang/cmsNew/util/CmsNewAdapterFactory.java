/**
 */
package org.moflon.maave.tests.lang.cmsNew.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.maave.tests.lang.cmsNew.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage
 * @generated
 */
public class CmsNewAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmsNewPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsNewAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CmsNewPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmsNewSwitch<Adapter> modelSwitch = new CmsNewSwitch<Adapter>() {
		@Override
		public Adapter caseGradeFormular(GradeFormular object) {
			return createGradeFormularAdapter();
		}

		@Override
		public Adapter caseThesis(Thesis object) {
			return createThesisAdapter();
		}

		@Override
		public Adapter caseEnrollment(Enrollment object) {
			return createEnrollmentAdapter();
		}

		@Override
		public Adapter caseLecture(Lecture object) {
			return createLectureAdapter();
		}

		@Override
		public Adapter caseModule(Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter caseDate(Date object) {
			return createDateAdapter();
		}

		@Override
		public Adapter caseEntry(Entry object) {
			return createEntryAdapter();
		}

		@Override
		public Adapter caseThesisModule(ThesisModule object) {
			return createThesisModuleAdapter();
		}

		@Override
		public Adapter caseCoModOffer(CoModOffer object) {
			return createCoModOfferAdapter();
		}

		@Override
		public Adapter caseCourseManagement(CourseManagement object) {
			return createCourseManagementAdapter();
		}

		@Override
		public Adapter caseUserDefinedConstraints(UserDefinedConstraints object) {
			return createUserDefinedConstraintsAdapter();
		}

		@Override
		public Adapter caseRecord(Record object) {
			return createRecordAdapter();
		}

		@Override
		public Adapter caseRoom(Room object) {
			return createRoomAdapter();
		}

		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseCMS(CMS object) {
			return createCMSAdapter();
		}

		@Override
		public Adapter caseExam(Exam object) {
			return createExamAdapter();
		}

		@Override
		public Adapter caseDegree(Degree object) {
			return createDegreeAdapter();
		}

		@Override
		public Adapter caseRoomManagement(RoomManagement object) {
			return createRoomManagementAdapter();
		}

		@Override
		public Adapter caseThesisRecord(ThesisRecord object) {
			return createThesisRecordAdapter();
		}

		@Override
		public Adapter caseSemester(Semester object) {
			return createSemesterAdapter();
		}

		@Override
		public Adapter caseBooking(Booking object) {
			return createBookingAdapter();
		}

		@Override
		public Adapter caseSystemTimer(SystemTimer object) {
			return createSystemTimerAdapter();
		}

		@Override
		public Adapter caseThesisModuleOffer(ThesisModuleOffer object) {
			return createThesisModuleOfferAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.GradeFormular <em>Grade Formular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.GradeFormular
	 * @generated
	 */
	public Adapter createGradeFormularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Thesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Thesis
	 * @generated
	 */
	public Adapter createThesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Enrollment
	 * @generated
	 */
	public Adapter createEnrollmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Lecture <em>Lecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Lecture
	 * @generated
	 */
	public Adapter createLectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule <em>Thesis Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.ThesisModule
	 * @generated
	 */
	public Adapter createThesisModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer <em>Co Mod Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer
	 * @generated
	 */
	public Adapter createCoModOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement <em>Course Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement
	 * @generated
	 */
	public Adapter createCourseManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints <em>User Defined Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints
	 * @generated
	 */
	public Adapter createUserDefinedConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.CMS <em>CMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.CMS
	 * @generated
	 */
	public Adapter createCMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Exam
	 * @generated
	 */
	public Adapter createExamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Degree
	 * @generated
	 */
	public Adapter createDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.RoomManagement <em>Room Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.RoomManagement
	 * @generated
	 */
	public Adapter createRoomManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord <em>Thesis Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.ThesisRecord
	 * @generated
	 */
	public Adapter createThesisRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Semester
	 * @generated
	 */
	public Adapter createSemesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.SystemTimer <em>System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.SystemTimer
	 * @generated
	 */
	public Adapter createSystemTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer <em>Thesis Module Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer
	 * @generated
	 */
	public Adapter createThesisModuleOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CmsNewAdapterFactory
