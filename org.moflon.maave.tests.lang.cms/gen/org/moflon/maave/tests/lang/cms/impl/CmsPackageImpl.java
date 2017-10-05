/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.maave.tests.lang.cms.Booking;
import org.moflon.maave.tests.lang.cms.CalendarDate;
import org.moflon.maave.tests.lang.cms.CmsFactory;
import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.Enrollment;
import org.moflon.maave.tests.lang.cms.Entry;
import org.moflon.maave.tests.lang.cms.Exam;
import org.moflon.maave.tests.lang.cms.ExamPrototype;
import org.moflon.maave.tests.lang.cms.GradeFormular;
import org.moflon.maave.tests.lang.cms.Lecture;
import org.moflon.maave.tests.lang.cms.LectureManagement;
import org.moflon.maave.tests.lang.cms.LecturePrototype;
import org.moflon.maave.tests.lang.cms.Module;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
import org.moflon.maave.tests.lang.cms.Program;
import org.moflon.maave.tests.lang.cms.ProgramManagement;
import org.moflon.maave.tests.lang.cms.Record;
import org.moflon.maave.tests.lang.cms.Room;
import org.moflon.maave.tests.lang.cms.RoomManagement;
import org.moflon.maave.tests.lang.cms.Semester;
import org.moflon.maave.tests.lang.cms.StrudentAffairs;
import org.moflon.maave.tests.lang.cms.Student;
import org.moflon.maave.tests.lang.cms.Sys;
import org.moflon.maave.tests.lang.cms.ThesisModule;
import org.moflon.maave.tests.lang.cms.ThesisOffer;
import org.moflon.maave.tests.lang.cms.ThesisRecord;
import org.moflon.maave.tests.lang.cms.UserDefinedConstraints;
import org.moflon.maave.tests.lang.cms.degree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmsPackageImpl extends EPackageImpl implements CmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thesisModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thesisRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lecturePrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleOfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradeFormularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lectureManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strudentAffairsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thesisOfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eN_STATEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eX_STATEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.moflon.maave.tests.lang.cms.CmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmsPackageImpl() {
		super(eNS_URI, CmsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmsPackage init() {
		if (isInited)
			return (CmsPackage) EPackage.Registry.INSTANCE.getEPackage(CmsPackage.eNS_URI);

		// Obtain or create and register package
		CmsPackageImpl theCmsPackage = (CmsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CmsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCmsPackage.createPackageContents();

		// Initialize created meta-data
		theCmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCmsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmsPackage.eNS_URI, theCmsPackage);
		return theCmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedConstraints() {
		return userDefinedConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_atMostOneRecordForModuleOffer__Enrollment() {
		return userDefinedConstraintsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_onlyOneEntryForID__GradeFormular() {
		return userDefinedConstraintsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_noTwoStudentsWithSameId__Student_Student() {
		return userDefinedConstraintsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_atMostOneRegistrationForExamPerEnrolment__Enrollment() {
		return userDefinedConstraintsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_onlyOneExamForFromular__Exam_Exam() {
		return userDefinedConstraintsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_LectureType() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ExamType() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModuleOffer() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Id() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Version() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamPrototype() {
		return examPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_Previous() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_Next() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_OfferedLectures() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_Exams() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemester_StartDate() {
		return (EAttribute) semesterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemester_EndDate() {
		return (EAttribute) semesterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThesisModule() {
		return thesisModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThesisModule_Thesises() {
		return (EReference) thesisModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThesisModule_Id() {
		return (EAttribute) thesisModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThesisRecord() {
		return thesisRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThesisRecord_ThesisModule() {
		return (EReference) thesisRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThesisRecord_Thesis() {
		return (EReference) thesisRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThesisRecord_Grade() {
		return (EAttribute) thesisRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThesisRecord_Tries() {
		return (EAttribute) thesisRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThesisRecord_Running() {
		return (EAttribute) thesisRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdegree() {
		return degreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdegree_Degree() {
		return (EAttribute) degreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdegree_Successfull() {
		return (EAttribute) degreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarDate() {
		return calendarDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendarDate_Location() {
		return (EReference) calendarDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarDate_Begin() {
		return (EAttribute) calendarDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarDate_Duration() {
		return (EAttribute) calendarDateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLecturePrototype() {
		return lecturePrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleOffer() {
		return moduleOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleOffer_Exams() {
		return (EReference) moduleOfferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleOffer_Lectures() {
		return (EReference) moduleOfferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleOffer_Cp() {
		return (EAttribute) moduleOfferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramManagement() {
		return programManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramManagement_ModuleOffers() {
		return (EReference) programManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramManagement_Programs() {
		return (EReference) programManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramManagement_Modules() {
		return (EReference) programManagementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSys() {
		return sysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSys_CurrentTime() {
		return (EAttribute) sysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradeFormular() {
		return gradeFormularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradeFormular_Records() {
		return (EReference) gradeFormularEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradeFormular_NrOfEntries() {
		return (EAttribute) gradeFormularEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_StudentId() {
		return (EAttribute) entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Grade() {
		return (EAttribute) entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnrollment() {
		return enrollmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollment_Student() {
		return (EReference) enrollmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollment_ThesisRecord() {
		return (EReference) enrollmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollment_Degree() {
		return (EReference) enrollmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollment_System() {
		return (EReference) enrollmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollment_Records() {
		return (EReference) enrollmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollment_Program() {
		return (EReference) enrollmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnrollment_Cp() {
		return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnrollment_State() {
		return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnrollment_RegCp() {
		return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnrollment__RegisterForModule__Module() {
		return enrollmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnrollment__RegisterForExam__Exam() {
		return enrollmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnrollment__UnregisterFromExam__Exam() {
		return enrollmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnrollment__RegisterForThesisModule__ThesisModule() {
		return enrollmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnrollment__RegisterThesis() {
		return enrollmentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnrollment__RegisterForExam_v2__Exam() {
		return enrollmentEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnrollment__UnregisterFromExam_v2__Exam() {
		return enrollmentEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Enrollment() {
		return (EReference) studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Id() {
		return (EAttribute) studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLectureManagement() {
		return lectureManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLectureManagement_Semesters() {
		return (EReference) lectureManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLectureManagement_Current() {
		return (EReference) lectureManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Enrollment() {
		return (EReference) recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Exam() {
		return (EReference) recordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_ModuleOffer() {
		return (EReference) recordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Grade() {
		return (EAttribute) recordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Tries() {
		return (EAttribute) recordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Reservations() {
		return (EReference) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Capacity() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrudentAffairs() {
		return strudentAffairsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrudentAffairs_Students() {
		return (EReference) strudentAffairsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMS() {
		return cmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMS_ProgramManagement() {
		return (EReference) cmsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMS_RoomManagement() {
		return (EReference) cmsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMS_StrudentManagements() {
		return (EReference) cmsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMS_CourseManagement() {
		return (EReference) cmsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMS_CurrentDate() {
		return (EAttribute) cmsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam() {
		return examEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Registrations() {
		return (EReference) examEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_GradeList() {
		return (EReference) examEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Location() {
		return (EReference) examEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Begin() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Duration() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_RegStudents() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_State() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__BookRoom__Room() {
		return examEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__TransscriptRecordPassed() {
		return examEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__OpenREG_v2() {
		return examEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__CloseREG_v2() {
		return examEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__BookRoom_v2__Room() {
		return examEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__TransscriptRecord_v2() {
		return examEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__UploadRecords_v2__GradeFormular() {
		return examEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__Close_v2() {
		return examEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__TransscriptRecordFailed() {
		return examEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManagement() {
		return roomManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManagement_Rooms() {
		return (EReference) roomManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Room() {
		return (EReference) bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Begin() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_End() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Modules() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_ThesisModules() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Id() {
		return (EAttribute) programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLecture() {
		return lectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLecture_LectureDates() {
		return (EReference) lectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThesisOffer() {
		return thesisOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThesisOffer_Begin() {
		return (EAttribute) thesisOfferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThesisOffer_End() {
		return (EAttribute) thesisOfferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEN_STATE() {
		return eN_STATEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEX_STATE() {
		return eX_STATEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsFactory getCmsFactory() {
		return (CmsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		userDefinedConstraintsEClass = createEClass(USER_DEFINED_CONSTRAINTS);
		createEOperation(userDefinedConstraintsEClass,
				USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_RECORD_FOR_MODULE_OFFER__ENROLLMENT);
		createEOperation(userDefinedConstraintsEClass,
				USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_ENTRY_FOR_ID__GRADEFORMULAR);
		createEOperation(userDefinedConstraintsEClass,
				USER_DEFINED_CONSTRAINTS___NC_NO_TWO_STUDENTS_WITH_SAME_ID__STUDENT_STUDENT);
		createEOperation(userDefinedConstraintsEClass,
				USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_REGISTRATION_FOR_EXAM_PER_ENROLMENT__ENROLLMENT);
		createEOperation(userDefinedConstraintsEClass,
				USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_EXAM_FOR_FROMULAR__EXAM_EXAM);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__LECTURE_TYPE);
		createEReference(moduleEClass, MODULE__EXAM_TYPE);
		createEReference(moduleEClass, MODULE__MODULE_OFFER);
		createEAttribute(moduleEClass, MODULE__ID);
		createEAttribute(moduleEClass, MODULE__VERSION);

		examPrototypeEClass = createEClass(EXAM_PROTOTYPE);

		semesterEClass = createEClass(SEMESTER);
		createEReference(semesterEClass, SEMESTER__PREVIOUS);
		createEReference(semesterEClass, SEMESTER__NEXT);
		createEReference(semesterEClass, SEMESTER__OFFERED_LECTURES);
		createEReference(semesterEClass, SEMESTER__EXAMS);
		createEAttribute(semesterEClass, SEMESTER__START_DATE);
		createEAttribute(semesterEClass, SEMESTER__END_DATE);

		thesisModuleEClass = createEClass(THESIS_MODULE);
		createEReference(thesisModuleEClass, THESIS_MODULE__THESISES);
		createEAttribute(thesisModuleEClass, THESIS_MODULE__ID);

		thesisRecordEClass = createEClass(THESIS_RECORD);
		createEReference(thesisRecordEClass, THESIS_RECORD__THESIS_MODULE);
		createEReference(thesisRecordEClass, THESIS_RECORD__THESIS);
		createEAttribute(thesisRecordEClass, THESIS_RECORD__GRADE);
		createEAttribute(thesisRecordEClass, THESIS_RECORD__TRIES);
		createEAttribute(thesisRecordEClass, THESIS_RECORD__RUNNING);

		degreeEClass = createEClass(DEGREE);
		createEAttribute(degreeEClass, DEGREE__DEGREE);
		createEAttribute(degreeEClass, DEGREE__SUCCESSFULL);

		calendarDateEClass = createEClass(CALENDAR_DATE);
		createEReference(calendarDateEClass, CALENDAR_DATE__LOCATION);
		createEAttribute(calendarDateEClass, CALENDAR_DATE__BEGIN);
		createEAttribute(calendarDateEClass, CALENDAR_DATE__DURATION);

		lecturePrototypeEClass = createEClass(LECTURE_PROTOTYPE);

		moduleOfferEClass = createEClass(MODULE_OFFER);
		createEReference(moduleOfferEClass, MODULE_OFFER__EXAMS);
		createEReference(moduleOfferEClass, MODULE_OFFER__LECTURES);
		createEAttribute(moduleOfferEClass, MODULE_OFFER__CP);

		programManagementEClass = createEClass(PROGRAM_MANAGEMENT);
		createEReference(programManagementEClass, PROGRAM_MANAGEMENT__MODULE_OFFERS);
		createEReference(programManagementEClass, PROGRAM_MANAGEMENT__PROGRAMS);
		createEReference(programManagementEClass, PROGRAM_MANAGEMENT__MODULES);

		sysEClass = createEClass(SYS);
		createEAttribute(sysEClass, SYS__CURRENT_TIME);

		gradeFormularEClass = createEClass(GRADE_FORMULAR);
		createEReference(gradeFormularEClass, GRADE_FORMULAR__RECORDS);
		createEAttribute(gradeFormularEClass, GRADE_FORMULAR__NR_OF_ENTRIES);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__STUDENT_ID);
		createEAttribute(entryEClass, ENTRY__GRADE);

		enrollmentEClass = createEClass(ENROLLMENT);
		createEReference(enrollmentEClass, ENROLLMENT__STUDENT);
		createEReference(enrollmentEClass, ENROLLMENT__THESIS_RECORD);
		createEReference(enrollmentEClass, ENROLLMENT__DEGREE);
		createEReference(enrollmentEClass, ENROLLMENT__SYSTEM);
		createEReference(enrollmentEClass, ENROLLMENT__RECORDS);
		createEReference(enrollmentEClass, ENROLLMENT__PROGRAM);
		createEAttribute(enrollmentEClass, ENROLLMENT__CP);
		createEAttribute(enrollmentEClass, ENROLLMENT__STATE);
		createEAttribute(enrollmentEClass, ENROLLMENT__REG_CP);
		createEOperation(enrollmentEClass, ENROLLMENT___REGISTER_FOR_MODULE__MODULE);
		createEOperation(enrollmentEClass, ENROLLMENT___REGISTER_FOR_EXAM__EXAM);
		createEOperation(enrollmentEClass, ENROLLMENT___UNREGISTER_FROM_EXAM__EXAM);
		createEOperation(enrollmentEClass, ENROLLMENT___REGISTER_FOR_THESIS_MODULE__THESISMODULE);
		createEOperation(enrollmentEClass, ENROLLMENT___REGISTER_THESIS);
		createEOperation(enrollmentEClass, ENROLLMENT___REGISTER_FOR_EXAM_V2__EXAM);
		createEOperation(enrollmentEClass, ENROLLMENT___UNREGISTER_FROM_EXAM_V2__EXAM);

		studentEClass = createEClass(STUDENT);
		createEReference(studentEClass, STUDENT__ENROLLMENT);
		createEAttribute(studentEClass, STUDENT__ID);

		lectureManagementEClass = createEClass(LECTURE_MANAGEMENT);
		createEReference(lectureManagementEClass, LECTURE_MANAGEMENT__SEMESTERS);
		createEReference(lectureManagementEClass, LECTURE_MANAGEMENT__CURRENT);

		recordEClass = createEClass(RECORD);
		createEReference(recordEClass, RECORD__ENROLLMENT);
		createEReference(recordEClass, RECORD__EXAM);
		createEReference(recordEClass, RECORD__MODULE_OFFER);
		createEAttribute(recordEClass, RECORD__GRADE);
		createEAttribute(recordEClass, RECORD__TRIES);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__RESERVATIONS);
		createEAttribute(roomEClass, ROOM__CAPACITY);

		strudentAffairsEClass = createEClass(STRUDENT_AFFAIRS);
		createEReference(strudentAffairsEClass, STRUDENT_AFFAIRS__STUDENTS);

		cmsEClass = createEClass(CMS);
		createEReference(cmsEClass, CMS__PROGRAM_MANAGEMENT);
		createEReference(cmsEClass, CMS__ROOM_MANAGEMENT);
		createEReference(cmsEClass, CMS__STRUDENT_MANAGEMENTS);
		createEReference(cmsEClass, CMS__COURSE_MANAGEMENT);
		createEAttribute(cmsEClass, CMS__CURRENT_DATE);

		examEClass = createEClass(EXAM);
		createEReference(examEClass, EXAM__REGISTRATIONS);
		createEReference(examEClass, EXAM__GRADE_LIST);
		createEReference(examEClass, EXAM__LOCATION);
		createEAttribute(examEClass, EXAM__BEGIN);
		createEAttribute(examEClass, EXAM__DURATION);
		createEAttribute(examEClass, EXAM__REG_STUDENTS);
		createEAttribute(examEClass, EXAM__STATE);
		createEOperation(examEClass, EXAM___BOOK_ROOM__ROOM);
		createEOperation(examEClass, EXAM___TRANSSCRIPT_RECORD_PASSED);
		createEOperation(examEClass, EXAM___OPEN_REG_V2);
		createEOperation(examEClass, EXAM___CLOSE_REG_V2);
		createEOperation(examEClass, EXAM___BOOK_ROOM_V2__ROOM);
		createEOperation(examEClass, EXAM___TRANSSCRIPT_RECORD_V2);
		createEOperation(examEClass, EXAM___UPLOAD_RECORDS_V2__GRADEFORMULAR);
		createEOperation(examEClass, EXAM___CLOSE_V2);
		createEOperation(examEClass, EXAM___TRANSSCRIPT_RECORD_FAILED);

		roomManagementEClass = createEClass(ROOM_MANAGEMENT);
		createEReference(roomManagementEClass, ROOM_MANAGEMENT__ROOMS);

		bookingEClass = createEClass(BOOKING);
		createEReference(bookingEClass, BOOKING__ROOM);
		createEAttribute(bookingEClass, BOOKING__BEGIN);
		createEAttribute(bookingEClass, BOOKING__END);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__MODULES);
		createEReference(programEClass, PROGRAM__THESIS_MODULES);
		createEAttribute(programEClass, PROGRAM__ID);

		lectureEClass = createEClass(LECTURE);
		createEReference(lectureEClass, LECTURE__LECTURE_DATES);

		thesisOfferEClass = createEClass(THESIS_OFFER);
		createEAttribute(thesisOfferEClass, THESIS_OFFER__BEGIN);
		createEAttribute(thesisOfferEClass, THESIS_OFFER__END);

		// Create enums
		eN_STATEEEnum = createEEnum(EN_STATE);
		eX_STATEEEnum = createEEnum(EX_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lectureManagementEClass.getESuperTypes().add(this.getModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(userDefinedConstraintsEClass, UserDefinedConstraints.class, "UserDefinedConstraints", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getUserDefinedConstraints___NC_atMostOneRecordForModuleOffer__Enrollment(), null,
				"_NC_atMostOneRecordForModuleOffer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnrollment(), "enrolment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserDefinedConstraints___NC_onlyOneEntryForID__GradeFormular(), null,
				"_NC_onlyOneEntryForID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGradeFormular(), "gradeFormular", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserDefinedConstraints___NC_noTwoStudentsWithSameId__Student_Student(), null,
				"_NC_noTwoStudentsWithSameId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStudent(), "studentA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStudent(), "studentB", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserDefinedConstraints___NC_atMostOneRegistrationForExamPerEnrolment__Enrollment(), null,
				"_NC_atMostOneRegistrationForExamPerEnrolment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnrollment(), "enrolment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserDefinedConstraints___NC_onlyOneExamForFromular__Exam_Exam(), null,
				"_NC_onlyOneExamForFromular", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExam(), "examB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExam(), "examA", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_LectureType(), this.getLecturePrototype(), null, "lectureType", null, 0, 1,
				Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ExamType(), this.getExamPrototype(), null, "examType", null, 0, 1, Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ModuleOffer(), this.getModuleOffer(), null, "moduleOffer", null, 0, 1, Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Id(), ecorePackage.getELong(), "id", null, 1, 1, Module.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModule_Version(), ecorePackage.getEInt(), "version", null, 1, 1, Module.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(examPrototypeEClass, ExamPrototype.class, "ExamPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemester_Previous(), this.getSemester(), this.getSemester_Next(), "previous", null, 0, 1,
				Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_Next(), this.getSemester(), this.getSemester_Previous(), "next", null, 0, 1,
				Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_OfferedLectures(), this.getLecture(), null, "offeredLectures", null, 0, -1,
				Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_Exams(), this.getExam(), null, "exams", null, 0, -1, Semester.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSemester_StartDate(), ecorePackage.getELong(), "startDate", null, 1, 1, Semester.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getSemester_EndDate(), ecorePackage.getELong(), "endDate", null, 1, 1, Semester.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(thesisModuleEClass, ThesisModule.class, "ThesisModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThesisModule_Thesises(), this.getThesisOffer(), null, "thesises", null, 0, -1,
				ThesisModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThesisModule_Id(), ecorePackage.getELong(), "id", null, 0, 1, ThesisModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(thesisRecordEClass, ThesisRecord.class, "ThesisRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThesisRecord_ThesisModule(), this.getThesisModule(), null, "thesisModule", null, 0, 1,
				ThesisRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThesisRecord_Thesis(), this.getThesisOffer(), null, "thesis", null, 0, -1, ThesisRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThesisRecord_Grade(), ecorePackage.getEInt(), "grade", null, 0, 1, ThesisRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getThesisRecord_Tries(), ecorePackage.getEInt(), "tries", null, 1, 1, ThesisRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getThesisRecord_Running(), ecorePackage.getEBoolean(), "running", null, 0, 1, ThesisRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(degreeEClass, degree.class, "degree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdegree_Degree(), ecorePackage.getEString(), "degree", null, 0, 1, degree.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getdegree_Successfull(), ecorePackage.getEBoolean(), "successfull", null, 1, 1, degree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(calendarDateEClass, CalendarDate.class, "CalendarDate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalendarDate_Location(), this.getBooking(), null, "location", null, 0, 1, CalendarDate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarDate_Begin(), ecorePackage.getELong(), "begin", null, 0, 1, CalendarDate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getCalendarDate_Duration(), ecorePackage.getELong(), "duration", null, 1, 1, CalendarDate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(lecturePrototypeEClass, LecturePrototype.class, "LecturePrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleOfferEClass, ModuleOffer.class, "ModuleOffer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleOffer_Exams(), this.getExam(), null, "exams", null, 0, 1, ModuleOffer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleOffer_Lectures(), this.getLecture(), null, "lectures", null, 0, 1, ModuleOffer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleOffer_Cp(), ecorePackage.getEInt(), "cp", null, 0, 1, ModuleOffer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(programManagementEClass, ProgramManagement.class, "ProgramManagement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramManagement_ModuleOffers(), this.getModuleOffer(), null, "moduleOffers", null, 0, -1,
				ProgramManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramManagement_Programs(), this.getProgram(), null, "programs", null, 0, -1,
				ProgramManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramManagement_Modules(), this.getModule(), null, "modules", null, 0, -1,
				ProgramManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sysEClass, Sys.class, "Sys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSys_CurrentTime(), ecorePackage.getELong(), "currentTime", null, 0, 1, Sys.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(gradeFormularEClass, GradeFormular.class, "GradeFormular", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradeFormular_Records(), this.getEntry(), null, "records", null, 0, -1, GradeFormular.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradeFormular_NrOfEntries(), ecorePackage.getEInt(), "nrOfEntries", null, 0, 1,
				GradeFormular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_StudentId(), ecorePackage.getEInt(), "studentId", null, 0, 1, Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getEntry_Grade(), ecorePackage.getEInt(), "grade", null, 1, 1, Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enrollmentEClass, Enrollment.class, "Enrollment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnrollment_Student(), this.getStudent(), this.getStudent_Enrollment(), "student", null, 0, 1,
				Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnrollment_ThesisRecord(), this.getThesisRecord(), null, "thesisRecord", null, 0, 1,
				Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnrollment_Degree(), this.getdegree(), null, "degree", null, 0, 1, Enrollment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnrollment_System(), this.getSys(), null, "system", null, 0, 1, Enrollment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnrollment_Records(), this.getRecord(), this.getRecord_Enrollment(), "records", null, 0, -1,
				Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnrollment_Program(), this.getProgram(), null, "program", null, 0, 1, Enrollment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnrollment_Cp(), ecorePackage.getEInt(), "cp", null, 1, 1, Enrollment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnrollment_State(), this.getEN_STATE(), "state", null, 0, 1, Enrollment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnrollment_RegCp(), ecorePackage.getEInt(), "regCp", null, 0, 1, Enrollment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(getEnrollment__RegisterForModule__Module(), null, "registerForModule", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getModule(), "module", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnrollment__RegisterForExam__Exam(), null, "registerForExam", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getExam(), "examREG", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnrollment__UnregisterFromExam__Exam(), null, "unregisterFromExam", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getExam(), "exam", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnrollment__RegisterForThesisModule__ThesisModule(), null, "registerForThesisModule", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThesisModule(), "thesisModule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnrollment__RegisterThesis(), null, "registerThesis", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnrollment__RegisterForExam_v2__Exam(), null, "registerForExam_v2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getExam(), "examREG", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnrollment__UnregisterFromExam_v2__Exam(), null, "unregisterFromExam_v2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExam(), "exam", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudent_Enrollment(), this.getEnrollment(), this.getEnrollment_Student(), "enrollment", null,
				0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Student.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lectureManagementEClass, LectureManagement.class, "LectureManagement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLectureManagement_Semesters(), this.getSemester(), null, "semesters", null, 0, -1,
				LectureManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLectureManagement_Current(), this.getSemester(), null, "current", null, 0, 1,
				LectureManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecord_Enrollment(), this.getEnrollment(), this.getEnrollment_Records(), "enrollment", null,
				0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecord_Exam(), this.getExam(), this.getExam_Registrations(), "exam", null, 0, 1, Record.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecord_ModuleOffer(), this.getModuleOffer(), null, "moduleOffer", null, 0, 1, Record.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecord_Grade(), ecorePackage.getEInt(), "grade", null, 1, 1, Record.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRecord_Tries(), ecorePackage.getEInt(), "tries", null, 1, 1, Record.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Reservations(), this.getBooking(), this.getBooking_Room(), "reservations", null, 0, -1,
				Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(strudentAffairsEClass, StrudentAffairs.class, "StrudentAffairs", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrudentAffairs_Students(), this.getStudent(), null, "students", null, 0, -1,
				StrudentAffairs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmsEClass, org.moflon.maave.tests.lang.cms.CMS.class, "CMS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMS_ProgramManagement(), this.getProgramManagement(), null, "programManagement", null, 0, 1,
				org.moflon.maave.tests.lang.cms.CMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMS_RoomManagement(), this.getRoomManagement(), null, "roomManagement", null, 1, 1,
				org.moflon.maave.tests.lang.cms.CMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMS_StrudentManagements(), this.getStrudentAffairs(), null, "strudentManagements", null, 1, 1,
				org.moflon.maave.tests.lang.cms.CMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMS_CourseManagement(), this.getLectureManagement(), null, "courseManagement", null, 1, 1,
				org.moflon.maave.tests.lang.cms.CMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMS_CurrentDate(), ecorePackage.getELong(), "currentDate", null, 1, 1,
				org.moflon.maave.tests.lang.cms.CMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExam_Registrations(), this.getRecord(), this.getRecord_Exam(), "registrations", null, 0, -1,
				Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_GradeList(), this.getGradeFormular(), null, "gradeList", null, 0, 1, Exam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_Location(), this.getBooking(), null, "location", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getExam_Begin(), ecorePackage.getELong(), "begin", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExam_Duration(), ecorePackage.getELong(), "duration", null, 1, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExam_RegStudents(), ecorePackage.getEInt(), "regStudents", null, 0, 1, Exam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getExam_State(), this.getEX_STATE(), "state", null, 1, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExam__BookRoom__Room(), null, "bookRoom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExam__TransscriptRecordPassed(), null, "transscriptRecordPassed", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getExam__OpenREG_v2(), null, "openREG_v2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExam__CloseREG_v2(), null, "closeREG_v2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExam__BookRoom_v2__Room(), null, "bookRoom_v2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExam__TransscriptRecord_v2(), null, "transscriptRecord_v2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExam__UploadRecords_v2__GradeFormular(), null, "uploadRecords_v2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getGradeFormular(), "gradeFormular", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExam__Close_v2(), null, "close_v2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExam__TransscriptRecordFailed(), null, "transscriptRecordFailed", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(roomManagementEClass, RoomManagement.class, "RoomManagement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManagement_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, RoomManagement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooking_Room(), this.getRoom(), this.getRoom_Reservations(), "room", null, 0, 1,
				Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooking_Begin(), ecorePackage.getELong(), "begin", null, 1, 1, Booking.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_End(), ecorePackage.getELong(), "end", null, 1, 1, Booking.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Modules(), this.getModule(), null, "modules", null, 0, -1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_ThesisModules(), this.getThesisModule(), null, "thesisModules", null, 0, -1,
				Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_Id(), ecorePackage.getEString(), "id", null, 0, 1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lectureEClass, Lecture.class, "Lecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLecture_LectureDates(), this.getCalendarDate(), null, "lectureDates", null, 0, -1,
				Lecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thesisOfferEClass, ThesisOffer.class, "ThesisOffer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThesisOffer_Begin(), ecorePackage.getELong(), "begin", null, 1, 1, ThesisOffer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getThesisOffer_End(), ecorePackage.getELong(), "end", null, 1, 1, ThesisOffer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eN_STATEEEnum, org.moflon.maave.tests.lang.cms.EN_STATE.class, "EN_STATE");
		addEEnumLiteral(eN_STATEEEnum, org.moflon.maave.tests.lang.cms.EN_STATE.STUDY);
		addEEnumLiteral(eN_STATEEEnum, org.moflon.maave.tests.lang.cms.EN_STATE.THESIS);
		addEEnumLiteral(eN_STATEEEnum, org.moflon.maave.tests.lang.cms.EN_STATE.FINISHED);

		initEEnum(eX_STATEEEnum, org.moflon.maave.tests.lang.cms.EX_STATE.class, "EX_STATE");
		addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cms.EX_STATE.INIT);
		addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cms.EX_STATE.REG_OPEN);
		addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cms.EX_STATE.REG_CLOSED);
		addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cms.EX_STATE.PERFORM);
		addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cms.EX_STATE.CLOSED);
		addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cms.EX_STATE.RECORDS);

		// Create resource
		createResource(eNS_URI);
	}

} //CmsPackageImpl
