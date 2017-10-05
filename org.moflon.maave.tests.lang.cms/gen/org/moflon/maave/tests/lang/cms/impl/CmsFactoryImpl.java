/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.maave.tests.lang.cms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmsFactoryImpl extends EFactoryImpl implements CmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmsFactory init() {
		try {
			CmsFactory theCmsFactory = (CmsFactory) EPackage.Registry.INSTANCE.getEFactory(CmsPackage.eNS_URI);
			if (theCmsFactory != null) {
				return theCmsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CmsPackage.USER_DEFINED_CONSTRAINTS:
			return createUserDefinedConstraints();
		case CmsPackage.MODULE:
			return createModule();
		case CmsPackage.EXAM_PROTOTYPE:
			return createExamPrototype();
		case CmsPackage.SEMESTER:
			return createSemester();
		case CmsPackage.THESIS_MODULE:
			return createThesisModule();
		case CmsPackage.THESIS_RECORD:
			return createThesisRecord();
		case CmsPackage.DEGREE:
			return createdegree();
		case CmsPackage.CALENDAR_DATE:
			return createCalendarDate();
		case CmsPackage.LECTURE_PROTOTYPE:
			return createLecturePrototype();
		case CmsPackage.MODULE_OFFER:
			return createModuleOffer();
		case CmsPackage.PROGRAM_MANAGEMENT:
			return createProgramManagement();
		case CmsPackage.SYS:
			return createSys();
		case CmsPackage.GRADE_FORMULAR:
			return createGradeFormular();
		case CmsPackage.ENTRY:
			return createEntry();
		case CmsPackage.ENROLLMENT:
			return createEnrollment();
		case CmsPackage.STUDENT:
			return createStudent();
		case CmsPackage.LECTURE_MANAGEMENT:
			return createLectureManagement();
		case CmsPackage.RECORD:
			return createRecord();
		case CmsPackage.ROOM:
			return createRoom();
		case CmsPackage.STRUDENT_AFFAIRS:
			return createStrudentAffairs();
		case CmsPackage.CMS:
			return createCMS();
		case CmsPackage.EXAM:
			return createExam();
		case CmsPackage.ROOM_MANAGEMENT:
			return createRoomManagement();
		case CmsPackage.BOOKING:
			return createBooking();
		case CmsPackage.PROGRAM:
			return createProgram();
		case CmsPackage.LECTURE:
			return createLecture();
		case CmsPackage.THESIS_OFFER:
			return createThesisOffer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CmsPackage.EN_STATE:
			return createEN_STATEFromString(eDataType, initialValue);
		case CmsPackage.EX_STATE:
			return createEX_STATEFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CmsPackage.EN_STATE:
			return convertEN_STATEToString(eDataType, instanceValue);
		case CmsPackage.EX_STATE:
			return convertEX_STATEToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedConstraints createUserDefinedConstraints() {
		UserDefinedConstraintsImpl userDefinedConstraints = new UserDefinedConstraintsImpl();
		return userDefinedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamPrototype createExamPrototype() {
		ExamPrototypeImpl examPrototype = new ExamPrototypeImpl();
		return examPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisModule createThesisModule() {
		ThesisModuleImpl thesisModule = new ThesisModuleImpl();
		return thesisModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisRecord createThesisRecord() {
		ThesisRecordImpl thesisRecord = new ThesisRecordImpl();
		return thesisRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public degree createdegree() {
		degreeImpl degree = new degreeImpl();
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarDate createCalendarDate() {
		CalendarDateImpl calendarDate = new CalendarDateImpl();
		return calendarDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LecturePrototype createLecturePrototype() {
		LecturePrototypeImpl lecturePrototype = new LecturePrototypeImpl();
		return lecturePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleOffer createModuleOffer() {
		ModuleOfferImpl moduleOffer = new ModuleOfferImpl();
		return moduleOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramManagement createProgramManagement() {
		ProgramManagementImpl programManagement = new ProgramManagementImpl();
		return programManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys createSys() {
		SysImpl sys = new SysImpl();
		return sys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradeFormular createGradeFormular() {
		GradeFormularImpl gradeFormular = new GradeFormularImpl();
		return gradeFormular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enrollment createEnrollment() {
		EnrollmentImpl enrollment = new EnrollmentImpl();
		return enrollment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LectureManagement createLectureManagement() {
		LectureManagementImpl lectureManagement = new LectureManagementImpl();
		return lectureManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrudentAffairs createStrudentAffairs() {
		StrudentAffairsImpl strudentAffairs = new StrudentAffairsImpl();
		return strudentAffairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMS createCMS() {
		CMSImpl cms = new CMSImpl();
		return cms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam createExam() {
		ExamImpl exam = new ExamImpl();
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagement createRoomManagement() {
		RoomManagementImpl roomManagement = new RoomManagementImpl();
		return roomManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lecture createLecture() {
		LectureImpl lecture = new LectureImpl();
		return lecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisOffer createThesisOffer() {
		ThesisOfferImpl thesisOffer = new ThesisOfferImpl();
		return thesisOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN_STATE createEN_STATEFromString(EDataType eDataType, String initialValue) {
		EN_STATE result = EN_STATE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEN_STATEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EX_STATE createEX_STATEFromString(EDataType eDataType, String initialValue) {
		EX_STATE result = EX_STATE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEX_STATEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsPackage getCmsPackage() {
		return (CmsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CmsPackage getPackage() {
		return CmsPackage.eINSTANCE;
	}

} //CmsFactoryImpl
