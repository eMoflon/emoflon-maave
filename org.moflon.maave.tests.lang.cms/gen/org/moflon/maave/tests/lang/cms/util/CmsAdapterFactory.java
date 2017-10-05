/**
 */
package org.moflon.maave.tests.lang.cms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.maave.tests.lang.cms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cms.CmsPackage
 * @generated
 */
public class CmsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CmsPackage.eINSTANCE;
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
	protected CmsSwitch<Adapter> modelSwitch = new CmsSwitch<Adapter>() {
		@Override
		public Adapter caseUserDefinedConstraints(UserDefinedConstraints object) {
			return createUserDefinedConstraintsAdapter();
		}

		@Override
		public Adapter caseModule(Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter caseExamPrototype(ExamPrototype object) {
			return createExamPrototypeAdapter();
		}

		@Override
		public Adapter caseSemester(Semester object) {
			return createSemesterAdapter();
		}

		@Override
		public Adapter caseThesisModule(ThesisModule object) {
			return createThesisModuleAdapter();
		}

		@Override
		public Adapter caseThesisRecord(ThesisRecord object) {
			return createThesisRecordAdapter();
		}

		@Override
		public Adapter casedegree(degree object) {
			return createdegreeAdapter();
		}

		@Override
		public Adapter caseCalendarDate(CalendarDate object) {
			return createCalendarDateAdapter();
		}

		@Override
		public Adapter caseLecturePrototype(LecturePrototype object) {
			return createLecturePrototypeAdapter();
		}

		@Override
		public Adapter caseModuleOffer(ModuleOffer object) {
			return createModuleOfferAdapter();
		}

		@Override
		public Adapter caseProgramManagement(ProgramManagement object) {
			return createProgramManagementAdapter();
		}

		@Override
		public Adapter caseSys(Sys object) {
			return createSysAdapter();
		}

		@Override
		public Adapter caseGradeFormular(GradeFormular object) {
			return createGradeFormularAdapter();
		}

		@Override
		public Adapter caseEntry(Entry object) {
			return createEntryAdapter();
		}

		@Override
		public Adapter caseEnrollment(Enrollment object) {
			return createEnrollmentAdapter();
		}

		@Override
		public Adapter caseStudent(Student object) {
			return createStudentAdapter();
		}

		@Override
		public Adapter caseLectureManagement(LectureManagement object) {
			return createLectureManagementAdapter();
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
		public Adapter caseStrudentAffairs(StrudentAffairs object) {
			return createStrudentAffairsAdapter();
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
		public Adapter caseRoomManagement(RoomManagement object) {
			return createRoomManagementAdapter();
		}

		@Override
		public Adapter caseBooking(Booking object) {
			return createBookingAdapter();
		}

		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseLecture(Lecture object) {
			return createLectureAdapter();
		}

		@Override
		public Adapter caseThesisOffer(ThesisOffer object) {
			return createThesisOfferAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.UserDefinedConstraints <em>User Defined Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.UserDefinedConstraints
	 * @generated
	 */
	public Adapter createUserDefinedConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.ExamPrototype <em>Exam Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.ExamPrototype
	 * @generated
	 */
	public Adapter createExamPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Semester
	 * @generated
	 */
	public Adapter createSemesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.ThesisModule <em>Thesis Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.ThesisModule
	 * @generated
	 */
	public Adapter createThesisModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.ThesisRecord <em>Thesis Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.ThesisRecord
	 * @generated
	 */
	public Adapter createThesisRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.degree <em>degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.degree
	 * @generated
	 */
	public Adapter createdegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.CalendarDate <em>Calendar Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.CalendarDate
	 * @generated
	 */
	public Adapter createCalendarDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.LecturePrototype <em>Lecture Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.LecturePrototype
	 * @generated
	 */
	public Adapter createLecturePrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.ModuleOffer <em>Module Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.ModuleOffer
	 * @generated
	 */
	public Adapter createModuleOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.ProgramManagement <em>Program Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.ProgramManagement
	 * @generated
	 */
	public Adapter createProgramManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Sys <em>Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Sys
	 * @generated
	 */
	public Adapter createSysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.GradeFormular <em>Grade Formular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.GradeFormular
	 * @generated
	 */
	public Adapter createGradeFormularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Enrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment
	 * @generated
	 */
	public Adapter createEnrollmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Student
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.LectureManagement <em>Lecture Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.LectureManagement
	 * @generated
	 */
	public Adapter createLectureManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.StrudentAffairs <em>Strudent Affairs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.StrudentAffairs
	 * @generated
	 */
	public Adapter createStrudentAffairsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.CMS <em>CMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.CMS
	 * @generated
	 */
	public Adapter createCMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Exam
	 * @generated
	 */
	public Adapter createExamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.RoomManagement <em>Room Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.RoomManagement
	 * @generated
	 */
	public Adapter createRoomManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.Lecture <em>Lecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.Lecture
	 * @generated
	 */
	public Adapter createLectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.cms.ThesisOffer <em>Thesis Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.cms.ThesisOffer
	 * @generated
	 */
	public Adapter createThesisOfferAdapter() {
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

} //CmsAdapterFactory
