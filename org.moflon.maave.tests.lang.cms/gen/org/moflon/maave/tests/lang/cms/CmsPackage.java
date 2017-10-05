/**
 */
package org.moflon.maave.tests.lang.cms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cms.CmsFactory
 * @model kind="package"
 * @generated
 */
public interface CmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.cms/model/Cms.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.cms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmsPackage eINSTANCE = org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.UserDefinedConstraintsImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getUserDefinedConstraints()
	 * @generated
	 */
	int USER_DEFINED_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>User Defined Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>NC at Most One Record For Module Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_RECORD_FOR_MODULE_OFFER__ENROLLMENT = 0;

	/**
	 * The operation id for the '<em>NC only One Entry For ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_ENTRY_FOR_ID__GRADEFORMULAR = 1;

	/**
	 * The operation id for the '<em>NC no Two Students With Same Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_NO_TWO_STUDENTS_WITH_SAME_ID__STUDENT_STUDENT = 2;

	/**
	 * The operation id for the '<em>NC at Most One Registration For Exam Per Enrolment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_REGISTRATION_FOR_EXAM_PER_ENROLMENT__ENROLLMENT = 3;

	/**
	 * The operation id for the '<em>NC only One Exam For Fromular</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_EXAM_FOR_FROMULAR__EXAM_EXAM = 4;

	/**
	 * The number of operations of the '<em>User Defined Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ModuleImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Lecture Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LECTURE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Exam Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXAM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Module Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_OFFER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ExamPrototypeImpl <em>Exam Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ExamPrototypeImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getExamPrototype()
	 * @generated
	 */
	int EXAM_PROTOTYPE = 2;

	/**
	 * The number of structural features of the '<em>Exam Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PROTOTYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exam Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PROTOTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.SemesterImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PREVIOUS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Offered Lectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__OFFERED_LECTURES = 2;

	/**
	 * The feature id for the '<em><b>Exams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__EXAMS = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__END_DATE = 5;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ThesisModuleImpl <em>Thesis Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ThesisModuleImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getThesisModule()
	 * @generated
	 */
	int THESIS_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Thesises</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODULE__THESISES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODULE__ID = 1;

	/**
	 * The number of structural features of the '<em>Thesis Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Thesis Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl <em>Thesis Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getThesisRecord()
	 * @generated
	 */
	int THESIS_RECORD = 5;

	/**
	 * The feature id for the '<em><b>Thesis Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_RECORD__THESIS_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Thesis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_RECORD__THESIS = 1;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_RECORD__GRADE = 2;

	/**
	 * The feature id for the '<em><b>Tries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_RECORD__TRIES = 3;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_RECORD__RUNNING = 4;

	/**
	 * The number of structural features of the '<em>Thesis Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_RECORD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thesis Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.degreeImpl <em>degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.degreeImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getdegree()
	 * @generated
	 */
	int DEGREE = 6;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__DEGREE = 0;

	/**
	 * The feature id for the '<em><b>Successfull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__SUCCESSFULL = 1;

	/**
	 * The number of structural features of the '<em>degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.CalendarDateImpl <em>Calendar Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.CalendarDateImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getCalendarDate()
	 * @generated
	 */
	int CALENDAR_DATE = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__BEGIN = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE__DURATION = 2;

	/**
	 * The number of structural features of the '<em>Calendar Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Calendar Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.LecturePrototypeImpl <em>Lecture Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.LecturePrototypeImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getLecturePrototype()
	 * @generated
	 */
	int LECTURE_PROTOTYPE = 8;

	/**
	 * The number of structural features of the '<em>Lecture Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_PROTOTYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lecture Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_PROTOTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ModuleOfferImpl <em>Module Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ModuleOfferImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getModuleOffer()
	 * @generated
	 */
	int MODULE_OFFER = 9;

	/**
	 * The feature id for the '<em><b>Exams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OFFER__EXAMS = 0;

	/**
	 * The feature id for the '<em><b>Lectures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OFFER__LECTURES = 1;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OFFER__CP = 2;

	/**
	 * The number of structural features of the '<em>Module Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OFFER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ProgramManagementImpl <em>Program Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ProgramManagementImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getProgramManagement()
	 * @generated
	 */
	int PROGRAM_MANAGEMENT = 10;

	/**
	 * The feature id for the '<em><b>Module Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGEMENT__MODULE_OFFERS = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGEMENT__PROGRAMS = 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGEMENT__MODULES = 2;

	/**
	 * The number of structural features of the '<em>Program Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.SysImpl <em>Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.SysImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getSys()
	 * @generated
	 */
	int SYS = 11;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS__CURRENT_TIME = 0;

	/**
	 * The number of structural features of the '<em>Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.GradeFormularImpl <em>Grade Formular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.GradeFormularImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getGradeFormular()
	 * @generated
	 */
	int GRADE_FORMULAR = 12;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FORMULAR__RECORDS = 0;

	/**
	 * The feature id for the '<em><b>Nr Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FORMULAR__NR_OF_ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Grade Formular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FORMULAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grade Formular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FORMULAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.EntryImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Student Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__STUDENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__GRADE = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl <em>Enrollment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEnrollment()
	 * @generated
	 */
	int ENROLLMENT = 14;

	/**
	 * The feature id for the '<em><b>Student</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__STUDENT = 0;

	/**
	 * The feature id for the '<em><b>Thesis Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__THESIS_RECORD = 1;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__DEGREE = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__RECORDS = 4;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__PROGRAM = 5;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__CP = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__STATE = 7;

	/**
	 * The feature id for the '<em><b>Reg Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__REG_CP = 8;

	/**
	 * The number of structural features of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Register For Module</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT___REGISTER_FOR_MODULE__MODULE = 0;

	/**
	 * The operation id for the '<em>Register For Exam</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT___REGISTER_FOR_EXAM__EXAM = 1;

	/**
	 * The operation id for the '<em>Unregister From Exam</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT___UNREGISTER_FROM_EXAM__EXAM = 2;

	/**
	 * The operation id for the '<em>Register For Thesis Module</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT___REGISTER_FOR_THESIS_MODULE__THESISMODULE = 3;

	/**
	 * The operation id for the '<em>Register Thesis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT___REGISTER_THESIS = 4;

	/**
	 * The operation id for the '<em>Register For Exam v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT___REGISTER_FOR_EXAM_V2__EXAM = 5;

	/**
	 * The operation id for the '<em>Unregister From Exam v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT___UNREGISTER_FROM_EXAM_V2__EXAM = 6;

	/**
	 * The number of operations of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.StudentImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 15;

	/**
	 * The feature id for the '<em><b>Enrollment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ENROLLMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.LectureManagementImpl <em>Lecture Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.LectureManagementImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getLectureManagement()
	 * @generated
	 */
	int LECTURE_MANAGEMENT = 16;

	/**
	 * The feature id for the '<em><b>Lecture Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT__LECTURE_TYPE = MODULE__LECTURE_TYPE;

	/**
	 * The feature id for the '<em><b>Exam Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT__EXAM_TYPE = MODULE__EXAM_TYPE;

	/**
	 * The feature id for the '<em><b>Module Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT__MODULE_OFFER = MODULE__MODULE_OFFER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT__ID = MODULE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT__SEMESTERS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT__CURRENT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lecture Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lecture Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_MANAGEMENT_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.RecordImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 17;

	/**
	 * The feature id for the '<em><b>Enrollment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ENROLLMENT = 0;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EXAM = 1;

	/**
	 * The feature id for the '<em><b>Module Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__MODULE_OFFER = 2;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__GRADE = 3;

	/**
	 * The feature id for the '<em><b>Tries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__TRIES = 4;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.RoomImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 18;

	/**
	 * The feature id for the '<em><b>Reservations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__RESERVATIONS = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.StrudentAffairsImpl <em>Strudent Affairs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.StrudentAffairsImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getStrudentAffairs()
	 * @generated
	 */
	int STRUDENT_AFFAIRS = 19;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUDENT_AFFAIRS__STUDENTS = 0;

	/**
	 * The number of structural features of the '<em>Strudent Affairs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUDENT_AFFAIRS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Strudent Affairs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUDENT_AFFAIRS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.CMSImpl <em>CMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.CMSImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getCMS()
	 * @generated
	 */
	int CMS = 20;

	/**
	 * The feature id for the '<em><b>Program Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMS__PROGRAM_MANAGEMENT = 0;

	/**
	 * The feature id for the '<em><b>Room Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMS__ROOM_MANAGEMENT = 1;

	/**
	 * The feature id for the '<em><b>Strudent Managements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMS__STRUDENT_MANAGEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Course Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMS__COURSE_MANAGEMENT = 3;

	/**
	 * The feature id for the '<em><b>Current Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMS__CURRENT_DATE = 4;

	/**
	 * The number of structural features of the '<em>CMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>CMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ExamImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 21;

	/**
	 * The feature id for the '<em><b>Registrations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__REGISTRATIONS = 0;

	/**
	 * The feature id for the '<em><b>Grade List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__GRADE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__BEGIN = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__DURATION = 4;

	/**
	 * The feature id for the '<em><b>Reg Students</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__REG_STUDENTS = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__STATE = 6;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Book Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___BOOK_ROOM__ROOM = 0;

	/**
	 * The operation id for the '<em>Transscript Record Passed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___TRANSSCRIPT_RECORD_PASSED = 1;

	/**
	 * The operation id for the '<em>Open REG v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___OPEN_REG_V2 = 2;

	/**
	 * The operation id for the '<em>Close REG v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___CLOSE_REG_V2 = 3;

	/**
	 * The operation id for the '<em>Book Room v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___BOOK_ROOM_V2__ROOM = 4;

	/**
	 * The operation id for the '<em>Transscript Record v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___TRANSSCRIPT_RECORD_V2 = 5;

	/**
	 * The operation id for the '<em>Upload Records v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___UPLOAD_RECORDS_V2__GRADEFORMULAR = 6;

	/**
	 * The operation id for the '<em>Close v2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___CLOSE_V2 = 7;

	/**
	 * The operation id for the '<em>Transscript Record Failed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM___TRANSSCRIPT_RECORD_FAILED = 8;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.RoomManagementImpl <em>Room Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.RoomManagementImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getRoomManagement()
	 * @generated
	 */
	int ROOM_MANAGEMENT = 22;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT__ROOMS = 0;

	/**
	 * The number of structural features of the '<em>Room Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Room Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.BookingImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 23;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BEGIN = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END = 2;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ProgramImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 24;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Thesis Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__THESIS_MODULES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.LectureImpl <em>Lecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.LectureImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getLecture()
	 * @generated
	 */
	int LECTURE = 25;

	/**
	 * The feature id for the '<em><b>Lecture Dates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE__LECTURE_DATES = 0;

	/**
	 * The number of structural features of the '<em>Lecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.impl.ThesisOfferImpl <em>Thesis Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.impl.ThesisOfferImpl
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getThesisOffer()
	 * @generated
	 */
	int THESIS_OFFER = 26;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_OFFER__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_OFFER__END = 1;

	/**
	 * The number of structural features of the '<em>Thesis Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_OFFER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Thesis Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_OFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.EN_STATE <em>EN STATE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.EN_STATE
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEN_STATE()
	 * @generated
	 */
	int EN_STATE = 27;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.cms.EX_STATE <em>EX STATE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.cms.EX_STATE
	 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEX_STATE()
	 * @generated
	 */
	int EX_STATE = 28;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.UserDefinedConstraints <em>User Defined Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Constraints</em>'.
	 * @see org.moflon.maave.tests.lang.cms.UserDefinedConstraints
	 * @generated
	 */
	EClass getUserDefinedConstraints();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_atMostOneRecordForModuleOffer(org.moflon.maave.tests.lang.cms.Enrollment) <em>NC at Most One Record For Module Offer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC at Most One Record For Module Offer</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_atMostOneRecordForModuleOffer(org.moflon.maave.tests.lang.cms.Enrollment)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_atMostOneRecordForModuleOffer__Enrollment();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_onlyOneEntryForID(org.moflon.maave.tests.lang.cms.GradeFormular) <em>NC only One Entry For ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC only One Entry For ID</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_onlyOneEntryForID(org.moflon.maave.tests.lang.cms.GradeFormular)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_onlyOneEntryForID__GradeFormular();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_noTwoStudentsWithSameId(org.moflon.maave.tests.lang.cms.Student, org.moflon.maave.tests.lang.cms.Student) <em>NC no Two Students With Same Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC no Two Students With Same Id</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_noTwoStudentsWithSameId(org.moflon.maave.tests.lang.cms.Student, org.moflon.maave.tests.lang.cms.Student)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_noTwoStudentsWithSameId__Student_Student();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_atMostOneRegistrationForExamPerEnrolment(org.moflon.maave.tests.lang.cms.Enrollment) <em>NC at Most One Registration For Exam Per Enrolment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC at Most One Registration For Exam Per Enrolment</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_atMostOneRegistrationForExamPerEnrolment(org.moflon.maave.tests.lang.cms.Enrollment)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_atMostOneRegistrationForExamPerEnrolment__Enrollment();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_onlyOneExamForFromular(org.moflon.maave.tests.lang.cms.Exam, org.moflon.maave.tests.lang.cms.Exam) <em>NC only One Exam For Fromular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC only One Exam For Fromular</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.UserDefinedConstraints#_NC_onlyOneExamForFromular(org.moflon.maave.tests.lang.cms.Exam, org.moflon.maave.tests.lang.cms.Exam)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_onlyOneExamForFromular__Exam_Exam();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.Module#getLectureType <em>Lecture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lecture Type</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Module#getLectureType()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_LectureType();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.Module#getExamType <em>Exam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exam Type</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Module#getExamType()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ExamType();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.Module#getModuleOffer <em>Module Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Offer</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Module#getModuleOffer()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleOffer();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Module#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Module#getId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Module#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Module#getVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Version();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.ExamPrototype <em>Exam Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Prototype</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ExamPrototype
	 * @generated
	 */
	EClass getExamPrototype();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.Semester#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Semester#getPrevious()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Previous();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.Semester#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Semester#getNext()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.Semester#getOfferedLectures <em>Offered Lectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Lectures</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Semester#getOfferedLectures()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_OfferedLectures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.Semester#getExams <em>Exams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exams</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Semester#getExams()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Exams();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Semester#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Semester#getStartDate()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Semester#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Semester#getEndDate()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_EndDate();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.ThesisModule <em>Thesis Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis Module</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisModule
	 * @generated
	 */
	EClass getThesisModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.ThesisModule#getThesises <em>Thesises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thesises</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisModule#getThesises()
	 * @see #getThesisModule()
	 * @generated
	 */
	EReference getThesisModule_Thesises();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.ThesisModule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisModule#getId()
	 * @see #getThesisModule()
	 * @generated
	 */
	EAttribute getThesisModule_Id();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.ThesisRecord <em>Thesis Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis Record</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisRecord
	 * @generated
	 */
	EClass getThesisRecord();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getThesisModule <em>Thesis Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thesis Module</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisRecord#getThesisModule()
	 * @see #getThesisRecord()
	 * @generated
	 */
	EReference getThesisRecord_ThesisModule();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getThesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thesis</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisRecord#getThesis()
	 * @see #getThesisRecord()
	 * @generated
	 */
	EReference getThesisRecord_Thesis();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisRecord#getGrade()
	 * @see #getThesisRecord()
	 * @generated
	 */
	EAttribute getThesisRecord_Grade();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#getTries <em>Tries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tries</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisRecord#getTries()
	 * @see #getThesisRecord()
	 * @generated
	 */
	EAttribute getThesisRecord_Tries();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.ThesisRecord#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisRecord#isRunning()
	 * @see #getThesisRecord()
	 * @generated
	 */
	EAttribute getThesisRecord_Running();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.degree <em>degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>degree</em>'.
	 * @see org.moflon.maave.tests.lang.cms.degree
	 * @generated
	 */
	EClass getdegree();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.degree#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see org.moflon.maave.tests.lang.cms.degree#getDegree()
	 * @see #getdegree()
	 * @generated
	 */
	EAttribute getdegree_Degree();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.degree#isSuccessfull <em>Successfull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successfull</em>'.
	 * @see org.moflon.maave.tests.lang.cms.degree#isSuccessfull()
	 * @see #getdegree()
	 * @generated
	 */
	EAttribute getdegree_Successfull();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.CalendarDate <em>Calendar Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Date</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CalendarDate
	 * @generated
	 */
	EClass getCalendarDate();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.CalendarDate#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CalendarDate#getLocation()
	 * @see #getCalendarDate()
	 * @generated
	 */
	EReference getCalendarDate_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.CalendarDate#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CalendarDate#getBegin()
	 * @see #getCalendarDate()
	 * @generated
	 */
	EAttribute getCalendarDate_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.CalendarDate#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CalendarDate#getDuration()
	 * @see #getCalendarDate()
	 * @generated
	 */
	EAttribute getCalendarDate_Duration();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.LecturePrototype <em>Lecture Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecture Prototype</em>'.
	 * @see org.moflon.maave.tests.lang.cms.LecturePrototype
	 * @generated
	 */
	EClass getLecturePrototype();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.ModuleOffer <em>Module Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Offer</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ModuleOffer
	 * @generated
	 */
	EClass getModuleOffer();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getExams <em>Exams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exams</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ModuleOffer#getExams()
	 * @see #getModuleOffer()
	 * @generated
	 */
	EReference getModuleOffer_Exams();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getLectures <em>Lectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lectures</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ModuleOffer#getLectures()
	 * @see #getModuleOffer()
	 * @generated
	 */
	EReference getModuleOffer_Lectures();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.ModuleOffer#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ModuleOffer#getCp()
	 * @see #getModuleOffer()
	 * @generated
	 */
	EAttribute getModuleOffer_Cp();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.ProgramManagement <em>Program Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Management</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ProgramManagement
	 * @generated
	 */
	EClass getProgramManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.ProgramManagement#getModuleOffers <em>Module Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Offers</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ProgramManagement#getModuleOffers()
	 * @see #getProgramManagement()
	 * @generated
	 */
	EReference getProgramManagement_ModuleOffers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.ProgramManagement#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ProgramManagement#getPrograms()
	 * @see #getProgramManagement()
	 * @generated
	 */
	EReference getProgramManagement_Programs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.ProgramManagement#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ProgramManagement#getModules()
	 * @see #getProgramManagement()
	 * @generated
	 */
	EReference getProgramManagement_Modules();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Sys <em>Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Sys
	 * @generated
	 */
	EClass getSys();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Sys#getCurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Time</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Sys#getCurrentTime()
	 * @see #getSys()
	 * @generated
	 */
	EAttribute getSys_CurrentTime();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.GradeFormular <em>Grade Formular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade Formular</em>'.
	 * @see org.moflon.maave.tests.lang.cms.GradeFormular
	 * @generated
	 */
	EClass getGradeFormular();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.GradeFormular#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see org.moflon.maave.tests.lang.cms.GradeFormular#getRecords()
	 * @see #getGradeFormular()
	 * @generated
	 */
	EReference getGradeFormular_Records();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.GradeFormular#getNrOfEntries <em>Nr Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Entries</em>'.
	 * @see org.moflon.maave.tests.lang.cms.GradeFormular#getNrOfEntries()
	 * @see #getGradeFormular()
	 * @generated
	 */
	EAttribute getGradeFormular_NrOfEntries();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Entry#getStudentId <em>Student Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student Id</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Entry#getStudentId()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_StudentId();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Entry#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Entry#getGrade()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Grade();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Enrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrollment</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment
	 * @generated
	 */
	EClass getEnrollment();

	/**
	 * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cms.Enrollment#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Student</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getStudent()
	 * @see #getEnrollment()
	 * @generated
	 */
	EReference getEnrollment_Student();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.Enrollment#getThesisRecord <em>Thesis Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thesis Record</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getThesisRecord()
	 * @see #getEnrollment()
	 * @generated
	 */
	EReference getEnrollment_ThesisRecord();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.Enrollment#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degree</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getDegree()
	 * @see #getEnrollment()
	 * @generated
	 */
	EReference getEnrollment_Degree();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.Enrollment#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getSystem()
	 * @see #getEnrollment()
	 * @generated
	 */
	EReference getEnrollment_System();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.Enrollment#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getRecords()
	 * @see #getEnrollment()
	 * @generated
	 */
	EReference getEnrollment_Records();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.Enrollment#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getProgram()
	 * @see #getEnrollment()
	 * @generated
	 */
	EReference getEnrollment_Program();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Enrollment#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getCp()
	 * @see #getEnrollment()
	 * @generated
	 */
	EAttribute getEnrollment_Cp();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Enrollment#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getState()
	 * @see #getEnrollment()
	 * @generated
	 */
	EAttribute getEnrollment_State();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Enrollment#getRegCp <em>Reg Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Cp</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#getRegCp()
	 * @see #getEnrollment()
	 * @generated
	 */
	EAttribute getEnrollment_RegCp();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Enrollment#registerForModule(org.moflon.maave.tests.lang.cms.Module) <em>Register For Module</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register For Module</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#registerForModule(org.moflon.maave.tests.lang.cms.Module)
	 * @generated
	 */
	EOperation getEnrollment__RegisterForModule__Module();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Enrollment#registerForExam(org.moflon.maave.tests.lang.cms.Exam) <em>Register For Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register For Exam</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#registerForExam(org.moflon.maave.tests.lang.cms.Exam)
	 * @generated
	 */
	EOperation getEnrollment__RegisterForExam__Exam();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Enrollment#unregisterFromExam(org.moflon.maave.tests.lang.cms.Exam) <em>Unregister From Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister From Exam</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#unregisterFromExam(org.moflon.maave.tests.lang.cms.Exam)
	 * @generated
	 */
	EOperation getEnrollment__UnregisterFromExam__Exam();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Enrollment#registerForThesisModule(org.moflon.maave.tests.lang.cms.ThesisModule) <em>Register For Thesis Module</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register For Thesis Module</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#registerForThesisModule(org.moflon.maave.tests.lang.cms.ThesisModule)
	 * @generated
	 */
	EOperation getEnrollment__RegisterForThesisModule__ThesisModule();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Enrollment#registerThesis() <em>Register Thesis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Thesis</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#registerThesis()
	 * @generated
	 */
	EOperation getEnrollment__RegisterThesis();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Enrollment#registerForExam_v2(org.moflon.maave.tests.lang.cms.Exam) <em>Register For Exam v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register For Exam v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#registerForExam_v2(org.moflon.maave.tests.lang.cms.Exam)
	 * @generated
	 */
	EOperation getEnrollment__RegisterForExam_v2__Exam();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Enrollment#unregisterFromExam_v2(org.moflon.maave.tests.lang.cms.Exam) <em>Unregister From Exam v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister From Exam v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Enrollment#unregisterFromExam_v2(org.moflon.maave.tests.lang.cms.Exam)
	 * @generated
	 */
	EOperation getEnrollment__UnregisterFromExam_v2__Exam();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.Student#getEnrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enrollment</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Student#getEnrollment()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Enrollment();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Student#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Student#getId()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Id();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.LectureManagement <em>Lecture Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecture Management</em>'.
	 * @see org.moflon.maave.tests.lang.cms.LectureManagement
	 * @generated
	 */
	EClass getLectureManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.LectureManagement#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see org.moflon.maave.tests.lang.cms.LectureManagement#getSemesters()
	 * @see #getLectureManagement()
	 * @generated
	 */
	EReference getLectureManagement_Semesters();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.LectureManagement#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see org.moflon.maave.tests.lang.cms.LectureManagement#getCurrent()
	 * @see #getLectureManagement()
	 * @generated
	 */
	EReference getLectureManagement_Current();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cms.Record#getEnrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enrollment</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Record#getEnrollment()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Enrollment();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.Record#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exam</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Record#getExam()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Exam();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cms.Record#getModuleOffer <em>Module Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Offer</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Record#getModuleOffer()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_ModuleOffer();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Record#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Record#getGrade()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Grade();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Record#getTries <em>Tries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tries</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Record#getTries()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Tries();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.Room#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reservations</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Room#getReservations()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Reservations();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Room#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Room#getCapacity()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Capacity();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.StrudentAffairs <em>Strudent Affairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strudent Affairs</em>'.
	 * @see org.moflon.maave.tests.lang.cms.StrudentAffairs
	 * @generated
	 */
	EClass getStrudentAffairs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.StrudentAffairs#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see org.moflon.maave.tests.lang.cms.StrudentAffairs#getStudents()
	 * @see #getStrudentAffairs()
	 * @generated
	 */
	EReference getStrudentAffairs_Students();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.CMS <em>CMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMS</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CMS
	 * @generated
	 */
	EClass getCMS();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.CMS#getProgramManagement <em>Program Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Management</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CMS#getProgramManagement()
	 * @see #getCMS()
	 * @generated
	 */
	EReference getCMS_ProgramManagement();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.CMS#getRoomManagement <em>Room Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Room Management</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CMS#getRoomManagement()
	 * @see #getCMS()
	 * @generated
	 */
	EReference getCMS_RoomManagement();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.CMS#getStrudentManagements <em>Strudent Managements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strudent Managements</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CMS#getStrudentManagements()
	 * @see #getCMS()
	 * @generated
	 */
	EReference getCMS_StrudentManagements();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.CMS#getCourseManagement <em>Course Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Course Management</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CMS#getCourseManagement()
	 * @see #getCMS()
	 * @generated
	 */
	EReference getCMS_CourseManagement();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.CMS#getCurrentDate <em>Current Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Date</em>'.
	 * @see org.moflon.maave.tests.lang.cms.CMS#getCurrentDate()
	 * @see #getCMS()
	 * @generated
	 */
	EAttribute getCMS_CurrentDate();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.cms.Exam#getRegistrations <em>Registrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registrations</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam#getRegistrations()
	 * @see #getExam()
	 * @generated
	 */
	EReference getExam_Registrations();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.Exam#getGradeList <em>Grade List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grade List</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam#getGradeList()
	 * @see #getExam()
	 * @generated
	 */
	EReference getExam_GradeList();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cms.Exam#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam#getLocation()
	 * @see #getExam()
	 * @generated
	 */
	EReference getExam_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Exam#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam#getBegin()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Exam#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam#getDuration()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Exam#getRegStudents <em>Reg Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Students</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam#getRegStudents()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_RegStudents();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Exam#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Exam#getState()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_State();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#bookRoom(org.moflon.maave.tests.lang.cms.Room) <em>Book Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Book Room</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#bookRoom(org.moflon.maave.tests.lang.cms.Room)
	 * @generated
	 */
	EOperation getExam__BookRoom__Room();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#transscriptRecordPassed() <em>Transscript Record Passed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transscript Record Passed</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#transscriptRecordPassed()
	 * @generated
	 */
	EOperation getExam__TransscriptRecordPassed();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#openREG_v2() <em>Open REG v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open REG v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#openREG_v2()
	 * @generated
	 */
	EOperation getExam__OpenREG_v2();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#closeREG_v2() <em>Close REG v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close REG v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#closeREG_v2()
	 * @generated
	 */
	EOperation getExam__CloseREG_v2();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#bookRoom_v2(org.moflon.maave.tests.lang.cms.Room) <em>Book Room v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Book Room v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#bookRoom_v2(org.moflon.maave.tests.lang.cms.Room)
	 * @generated
	 */
	EOperation getExam__BookRoom_v2__Room();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#transscriptRecord_v2() <em>Transscript Record v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transscript Record v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#transscriptRecord_v2()
	 * @generated
	 */
	EOperation getExam__TransscriptRecord_v2();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#uploadRecords_v2(org.moflon.maave.tests.lang.cms.GradeFormular) <em>Upload Records v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upload Records v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#uploadRecords_v2(org.moflon.maave.tests.lang.cms.GradeFormular)
	 * @generated
	 */
	EOperation getExam__UploadRecords_v2__GradeFormular();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#close_v2() <em>Close v2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close v2</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#close_v2()
	 * @generated
	 */
	EOperation getExam__Close_v2();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cms.Exam#transscriptRecordFailed() <em>Transscript Record Failed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transscript Record Failed</em>' operation.
	 * @see org.moflon.maave.tests.lang.cms.Exam#transscriptRecordFailed()
	 * @generated
	 */
	EOperation getExam__TransscriptRecordFailed();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.RoomManagement <em>Room Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Management</em>'.
	 * @see org.moflon.maave.tests.lang.cms.RoomManagement
	 * @generated
	 */
	EClass getRoomManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.RoomManagement#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see org.moflon.maave.tests.lang.cms.RoomManagement#getRooms()
	 * @see #getRoomManagement()
	 * @generated
	 */
	EReference getRoomManagement_Rooms();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cms.Booking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Booking#getRoom()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Room();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Booking#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Booking#getBegin()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Booking#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Booking#getEnd()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_End();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.cms.Program#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Program#getModules()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.Program#getThesisModules <em>Thesis Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thesis Modules</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Program#getThesisModules()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ThesisModules();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.Program#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Program#getId()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Id();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.Lecture <em>Lecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecture</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Lecture
	 * @generated
	 */
	EClass getLecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cms.Lecture#getLectureDates <em>Lecture Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lecture Dates</em>'.
	 * @see org.moflon.maave.tests.lang.cms.Lecture#getLectureDates()
	 * @see #getLecture()
	 * @generated
	 */
	EReference getLecture_LectureDates();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cms.ThesisOffer <em>Thesis Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis Offer</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisOffer
	 * @generated
	 */
	EClass getThesisOffer();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.ThesisOffer#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisOffer#getBegin()
	 * @see #getThesisOffer()
	 * @generated
	 */
	EAttribute getThesisOffer_Begin();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cms.ThesisOffer#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.moflon.maave.tests.lang.cms.ThesisOffer#getEnd()
	 * @see #getThesisOffer()
	 * @generated
	 */
	EAttribute getThesisOffer_End();

	/**
	 * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.cms.EN_STATE <em>EN STATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EN STATE</em>'.
	 * @see org.moflon.maave.tests.lang.cms.EN_STATE
	 * @generated
	 */
	EEnum getEN_STATE();

	/**
	 * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.cms.EX_STATE <em>EX STATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EX STATE</em>'.
	 * @see org.moflon.maave.tests.lang.cms.EX_STATE
	 * @generated
	 */
	EEnum getEX_STATE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmsFactory getCmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.UserDefinedConstraintsImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getUserDefinedConstraints()
		 * @generated
		 */
		EClass USER_DEFINED_CONSTRAINTS = eINSTANCE.getUserDefinedConstraints();

		/**
		 * The meta object literal for the '<em><b>NC at Most One Record For Module Offer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_RECORD_FOR_MODULE_OFFER__ENROLLMENT = eINSTANCE
				.getUserDefinedConstraints___NC_atMostOneRecordForModuleOffer__Enrollment();

		/**
		 * The meta object literal for the '<em><b>NC only One Entry For ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_ENTRY_FOR_ID__GRADEFORMULAR = eINSTANCE
				.getUserDefinedConstraints___NC_onlyOneEntryForID__GradeFormular();

		/**
		 * The meta object literal for the '<em><b>NC no Two Students With Same Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_NO_TWO_STUDENTS_WITH_SAME_ID__STUDENT_STUDENT = eINSTANCE
				.getUserDefinedConstraints___NC_noTwoStudentsWithSameId__Student_Student();

		/**
		 * The meta object literal for the '<em><b>NC at Most One Registration For Exam Per Enrolment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_REGISTRATION_FOR_EXAM_PER_ENROLMENT__ENROLLMENT = eINSTANCE
				.getUserDefinedConstraints___NC_atMostOneRegistrationForExamPerEnrolment__Enrollment();

		/**
		 * The meta object literal for the '<em><b>NC only One Exam For Fromular</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_EXAM_FOR_FROMULAR__EXAM_EXAM = eINSTANCE
				.getUserDefinedConstraints___NC_onlyOneExamForFromular__Exam_Exam();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ModuleImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Lecture Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__LECTURE_TYPE = eINSTANCE.getModule_LectureType();

		/**
		 * The meta object literal for the '<em><b>Exam Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__EXAM_TYPE = eINSTANCE.getModule_ExamType();

		/**
		 * The meta object literal for the '<em><b>Module Offer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_OFFER = eINSTANCE.getModule_ModuleOffer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__ID = eINSTANCE.getModule_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__VERSION = eINSTANCE.getModule_Version();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ExamPrototypeImpl <em>Exam Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ExamPrototypeImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getExamPrototype()
		 * @generated
		 */
		EClass EXAM_PROTOTYPE = eINSTANCE.getExamPrototype();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.SemesterImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PREVIOUS = eINSTANCE.getSemester_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__NEXT = eINSTANCE.getSemester_Next();

		/**
		 * The meta object literal for the '<em><b>Offered Lectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__OFFERED_LECTURES = eINSTANCE.getSemester_OfferedLectures();

		/**
		 * The meta object literal for the '<em><b>Exams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__EXAMS = eINSTANCE.getSemester_Exams();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__START_DATE = eINSTANCE.getSemester_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__END_DATE = eINSTANCE.getSemester_EndDate();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ThesisModuleImpl <em>Thesis Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ThesisModuleImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getThesisModule()
		 * @generated
		 */
		EClass THESIS_MODULE = eINSTANCE.getThesisModule();

		/**
		 * The meta object literal for the '<em><b>Thesises</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS_MODULE__THESISES = eINSTANCE.getThesisModule_Thesises();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS_MODULE__ID = eINSTANCE.getThesisModule_Id();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl <em>Thesis Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getThesisRecord()
		 * @generated
		 */
		EClass THESIS_RECORD = eINSTANCE.getThesisRecord();

		/**
		 * The meta object literal for the '<em><b>Thesis Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS_RECORD__THESIS_MODULE = eINSTANCE.getThesisRecord_ThesisModule();

		/**
		 * The meta object literal for the '<em><b>Thesis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS_RECORD__THESIS = eINSTANCE.getThesisRecord_Thesis();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS_RECORD__GRADE = eINSTANCE.getThesisRecord_Grade();

		/**
		 * The meta object literal for the '<em><b>Tries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS_RECORD__TRIES = eINSTANCE.getThesisRecord_Tries();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS_RECORD__RUNNING = eINSTANCE.getThesisRecord_Running();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.degreeImpl <em>degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.degreeImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getdegree()
		 * @generated
		 */
		EClass DEGREE = eINSTANCE.getdegree();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE__DEGREE = eINSTANCE.getdegree_Degree();

		/**
		 * The meta object literal for the '<em><b>Successfull</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE__SUCCESSFULL = eINSTANCE.getdegree_Successfull();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.CalendarDateImpl <em>Calendar Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.CalendarDateImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getCalendarDate()
		 * @generated
		 */
		EClass CALENDAR_DATE = eINSTANCE.getCalendarDate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR_DATE__LOCATION = eINSTANCE.getCalendarDate_Location();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_DATE__BEGIN = eINSTANCE.getCalendarDate_Begin();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_DATE__DURATION = eINSTANCE.getCalendarDate_Duration();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.LecturePrototypeImpl <em>Lecture Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.LecturePrototypeImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getLecturePrototype()
		 * @generated
		 */
		EClass LECTURE_PROTOTYPE = eINSTANCE.getLecturePrototype();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ModuleOfferImpl <em>Module Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ModuleOfferImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getModuleOffer()
		 * @generated
		 */
		EClass MODULE_OFFER = eINSTANCE.getModuleOffer();

		/**
		 * The meta object literal for the '<em><b>Exams</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_OFFER__EXAMS = eINSTANCE.getModuleOffer_Exams();

		/**
		 * The meta object literal for the '<em><b>Lectures</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_OFFER__LECTURES = eINSTANCE.getModuleOffer_Lectures();

		/**
		 * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_OFFER__CP = eINSTANCE.getModuleOffer_Cp();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ProgramManagementImpl <em>Program Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ProgramManagementImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getProgramManagement()
		 * @generated
		 */
		EClass PROGRAM_MANAGEMENT = eINSTANCE.getProgramManagement();

		/**
		 * The meta object literal for the '<em><b>Module Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_MANAGEMENT__MODULE_OFFERS = eINSTANCE.getProgramManagement_ModuleOffers();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_MANAGEMENT__PROGRAMS = eINSTANCE.getProgramManagement_Programs();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_MANAGEMENT__MODULES = eINSTANCE.getProgramManagement_Modules();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.SysImpl <em>Sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.SysImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getSys()
		 * @generated
		 */
		EClass SYS = eINSTANCE.getSys();

		/**
		 * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS__CURRENT_TIME = eINSTANCE.getSys_CurrentTime();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.GradeFormularImpl <em>Grade Formular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.GradeFormularImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getGradeFormular()
		 * @generated
		 */
		EClass GRADE_FORMULAR = eINSTANCE.getGradeFormular();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE_FORMULAR__RECORDS = eINSTANCE.getGradeFormular_Records();

		/**
		 * The meta object literal for the '<em><b>Nr Of Entries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE_FORMULAR__NR_OF_ENTRIES = eINSTANCE.getGradeFormular_NrOfEntries();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.EntryImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Student Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__STUDENT_ID = eINSTANCE.getEntry_StudentId();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__GRADE = eINSTANCE.getEntry_Grade();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl <em>Enrollment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEnrollment()
		 * @generated
		 */
		EClass ENROLLMENT = eINSTANCE.getEnrollment();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLLMENT__STUDENT = eINSTANCE.getEnrollment_Student();

		/**
		 * The meta object literal for the '<em><b>Thesis Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLLMENT__THESIS_RECORD = eINSTANCE.getEnrollment_ThesisRecord();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLLMENT__DEGREE = eINSTANCE.getEnrollment_Degree();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLLMENT__SYSTEM = eINSTANCE.getEnrollment_System();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLLMENT__RECORDS = eINSTANCE.getEnrollment_Records();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLLMENT__PROGRAM = eINSTANCE.getEnrollment_Program();

		/**
		 * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLLMENT__CP = eINSTANCE.getEnrollment_Cp();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLLMENT__STATE = eINSTANCE.getEnrollment_State();

		/**
		 * The meta object literal for the '<em><b>Reg Cp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLLMENT__REG_CP = eINSTANCE.getEnrollment_RegCp();

		/**
		 * The meta object literal for the '<em><b>Register For Module</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENROLLMENT___REGISTER_FOR_MODULE__MODULE = eINSTANCE.getEnrollment__RegisterForModule__Module();

		/**
		 * The meta object literal for the '<em><b>Register For Exam</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENROLLMENT___REGISTER_FOR_EXAM__EXAM = eINSTANCE.getEnrollment__RegisterForExam__Exam();

		/**
		 * The meta object literal for the '<em><b>Unregister From Exam</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENROLLMENT___UNREGISTER_FROM_EXAM__EXAM = eINSTANCE.getEnrollment__UnregisterFromExam__Exam();

		/**
		 * The meta object literal for the '<em><b>Register For Thesis Module</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENROLLMENT___REGISTER_FOR_THESIS_MODULE__THESISMODULE = eINSTANCE
				.getEnrollment__RegisterForThesisModule__ThesisModule();

		/**
		 * The meta object literal for the '<em><b>Register Thesis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENROLLMENT___REGISTER_THESIS = eINSTANCE.getEnrollment__RegisterThesis();

		/**
		 * The meta object literal for the '<em><b>Register For Exam v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENROLLMENT___REGISTER_FOR_EXAM_V2__EXAM = eINSTANCE.getEnrollment__RegisterForExam_v2__Exam();

		/**
		 * The meta object literal for the '<em><b>Unregister From Exam v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENROLLMENT___UNREGISTER_FROM_EXAM_V2__EXAM = eINSTANCE.getEnrollment__UnregisterFromExam_v2__Exam();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.StudentImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Enrollment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ENROLLMENT = eINSTANCE.getStudent_Enrollment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__ID = eINSTANCE.getStudent_Id();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.LectureManagementImpl <em>Lecture Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.LectureManagementImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getLectureManagement()
		 * @generated
		 */
		EClass LECTURE_MANAGEMENT = eINSTANCE.getLectureManagement();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURE_MANAGEMENT__SEMESTERS = eINSTANCE.getLectureManagement_Semesters();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURE_MANAGEMENT__CURRENT = eINSTANCE.getLectureManagement_Current();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.RecordImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Enrollment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__ENROLLMENT = eINSTANCE.getRecord_Enrollment();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__EXAM = eINSTANCE.getRecord_Exam();

		/**
		 * The meta object literal for the '<em><b>Module Offer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__MODULE_OFFER = eINSTANCE.getRecord_ModuleOffer();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__GRADE = eINSTANCE.getRecord_Grade();

		/**
		 * The meta object literal for the '<em><b>Tries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__TRIES = eINSTANCE.getRecord_Tries();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.RoomImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Reservations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__RESERVATIONS = eINSTANCE.getRoom_Reservations();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.StrudentAffairsImpl <em>Strudent Affairs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.StrudentAffairsImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getStrudentAffairs()
		 * @generated
		 */
		EClass STRUDENT_AFFAIRS = eINSTANCE.getStrudentAffairs();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUDENT_AFFAIRS__STUDENTS = eINSTANCE.getStrudentAffairs_Students();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.CMSImpl <em>CMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.CMSImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getCMS()
		 * @generated
		 */
		EClass CMS = eINSTANCE.getCMS();

		/**
		 * The meta object literal for the '<em><b>Program Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMS__PROGRAM_MANAGEMENT = eINSTANCE.getCMS_ProgramManagement();

		/**
		 * The meta object literal for the '<em><b>Room Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMS__ROOM_MANAGEMENT = eINSTANCE.getCMS_RoomManagement();

		/**
		 * The meta object literal for the '<em><b>Strudent Managements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMS__STRUDENT_MANAGEMENTS = eINSTANCE.getCMS_StrudentManagements();

		/**
		 * The meta object literal for the '<em><b>Course Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMS__COURSE_MANAGEMENT = eINSTANCE.getCMS_CourseManagement();

		/**
		 * The meta object literal for the '<em><b>Current Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMS__CURRENT_DATE = eINSTANCE.getCMS_CurrentDate();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl <em>Exam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ExamImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getExam()
		 * @generated
		 */
		EClass EXAM = eINSTANCE.getExam();

		/**
		 * The meta object literal for the '<em><b>Registrations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM__REGISTRATIONS = eINSTANCE.getExam_Registrations();

		/**
		 * The meta object literal for the '<em><b>Grade List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM__GRADE_LIST = eINSTANCE.getExam_GradeList();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM__LOCATION = eINSTANCE.getExam_Location();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__BEGIN = eINSTANCE.getExam_Begin();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__DURATION = eINSTANCE.getExam_Duration();

		/**
		 * The meta object literal for the '<em><b>Reg Students</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__REG_STUDENTS = eINSTANCE.getExam_RegStudents();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__STATE = eINSTANCE.getExam_State();

		/**
		 * The meta object literal for the '<em><b>Book Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___BOOK_ROOM__ROOM = eINSTANCE.getExam__BookRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Transscript Record Passed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___TRANSSCRIPT_RECORD_PASSED = eINSTANCE.getExam__TransscriptRecordPassed();

		/**
		 * The meta object literal for the '<em><b>Open REG v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___OPEN_REG_V2 = eINSTANCE.getExam__OpenREG_v2();

		/**
		 * The meta object literal for the '<em><b>Close REG v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___CLOSE_REG_V2 = eINSTANCE.getExam__CloseREG_v2();

		/**
		 * The meta object literal for the '<em><b>Book Room v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___BOOK_ROOM_V2__ROOM = eINSTANCE.getExam__BookRoom_v2__Room();

		/**
		 * The meta object literal for the '<em><b>Transscript Record v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___TRANSSCRIPT_RECORD_V2 = eINSTANCE.getExam__TransscriptRecord_v2();

		/**
		 * The meta object literal for the '<em><b>Upload Records v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___UPLOAD_RECORDS_V2__GRADEFORMULAR = eINSTANCE.getExam__UploadRecords_v2__GradeFormular();

		/**
		 * The meta object literal for the '<em><b>Close v2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___CLOSE_V2 = eINSTANCE.getExam__Close_v2();

		/**
		 * The meta object literal for the '<em><b>Transscript Record Failed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAM___TRANSSCRIPT_RECORD_FAILED = eINSTANCE.getExam__TransscriptRecordFailed();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.RoomManagementImpl <em>Room Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.RoomManagementImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getRoomManagement()
		 * @generated
		 */
		EClass ROOM_MANAGEMENT = eINSTANCE.getRoomManagement();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGEMENT__ROOMS = eINSTANCE.getRoomManagement_Rooms();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.BookingImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM = eINSTANCE.getBooking_Room();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BEGIN = eINSTANCE.getBooking_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END = eINSTANCE.getBooking_End();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ProgramImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__MODULES = eINSTANCE.getProgram_Modules();

		/**
		 * The meta object literal for the '<em><b>Thesis Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__THESIS_MODULES = eINSTANCE.getProgram_ThesisModules();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ID = eINSTANCE.getProgram_Id();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.LectureImpl <em>Lecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.LectureImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getLecture()
		 * @generated
		 */
		EClass LECTURE = eINSTANCE.getLecture();

		/**
		 * The meta object literal for the '<em><b>Lecture Dates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURE__LECTURE_DATES = eINSTANCE.getLecture_LectureDates();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.impl.ThesisOfferImpl <em>Thesis Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.impl.ThesisOfferImpl
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getThesisOffer()
		 * @generated
		 */
		EClass THESIS_OFFER = eINSTANCE.getThesisOffer();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS_OFFER__BEGIN = eINSTANCE.getThesisOffer_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS_OFFER__END = eINSTANCE.getThesisOffer_End();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.EN_STATE <em>EN STATE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.EN_STATE
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEN_STATE()
		 * @generated
		 */
		EEnum EN_STATE = eINSTANCE.getEN_STATE();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.cms.EX_STATE <em>EX STATE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.cms.EX_STATE
		 * @see org.moflon.maave.tests.lang.cms.impl.CmsPackageImpl#getEX_STATE()
		 * @generated
		 */
		EEnum EX_STATE = eINSTANCE.getEX_STATE();

	}

} //CmsPackage
