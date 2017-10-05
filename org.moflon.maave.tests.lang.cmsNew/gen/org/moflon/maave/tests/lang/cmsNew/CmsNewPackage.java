/**
 */
package org.moflon.maave.tests.lang.cmsNew;

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
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.maave.tests.lang'"
 * @generated
 */
public interface CmsNewPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "cmsNew";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.cmsNew/model/CmsNew.ecore";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "org.moflon.maave.tests.lang.cmsNew";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   CmsNewPackage eINSTANCE = org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl.init();

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.GradeFormularImpl <em>Grade Formular</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.GradeFormularImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getGradeFormular()
    * @generated
    */
   int GRADE_FORMULAR = 0;

   /**
    * The feature id for the '<em><b>Records</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GRADE_FORMULAR__RECORDS = 0;

   /**
    * The number of structural features of the '<em>Grade Formular</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GRADE_FORMULAR_FEATURE_COUNT = 1;

   /**
    * The number of operations of the '<em>Grade Formular</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int GRADE_FORMULAR_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisImpl <em>Thesis</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesis()
    * @generated
    */
   int THESIS = 1;

   /**
    * The feature id for the '<em><b>Record</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS__RECORD = 0;

   /**
    * The feature id for the '<em><b>Grade</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS__GRADE = 1;

   /**
    * The feature id for the '<em><b>State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS__STATE = 2;

   /**
    * The number of structural features of the '<em>Thesis</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_FEATURE_COUNT = 3;

   /**
    * The operation id for the '<em>Enter Grade v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS___ENTER_GRADE_V0 = 0;

   /**
    * The number of operations of the '<em>Thesis</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_OPERATION_COUNT = 1;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl <em>Enrollment</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEnrollment()
    * @generated
    */
   int ENROLLMENT = 2;

   /**
    * The feature id for the '<em><b>Records</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__RECORDS = 0;

   /**
    * The feature id for the '<em><b>Program</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__PROGRAM = 1;

   /**
    * The feature id for the '<em><b>Degree</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__DEGREE = 2;

   /**
    * The feature id for the '<em><b>Thesis Record</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__THESIS_RECORD = 3;

   /**
    * The feature id for the '<em><b>Cp</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__CP = 4;

   /**
    * The feature id for the '<em><b>State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__STATE = 5;

   /**
    * The feature id for the '<em><b>Reg Cp</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__REG_CP = 6;

   /**
    * The feature id for the '<em><b>Stud Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__STUD_ID = 7;

   /**
    * The feature id for the '<em><b>Enrolled</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT__ENROLLED = 8;

   /**
    * The number of structural features of the '<em>Enrollment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT_FEATURE_COUNT = 9;

   /**
    * The operation id for the '<em>Reg For Exam v1</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___REG_FOR_EXAM_V1__SYSTEMTIMER_EXAM = 0;

   /**
    * The operation id for the '<em>Unreg From Exam v1</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___UNREG_FROM_EXAM_V1__EXAM_SYSTEMTIMER = 1;

   /**
    * The operation id for the '<em>Reg For Exam v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___REG_FOR_EXAM_V0__EXAM = 2;

   /**
    * The operation id for the '<em>Reg For Module v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___REG_FOR_MODULE_V0__COMODOFFER = 3;

   /**
    * The operation id for the '<em>Unreg From Exam v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___UNREG_FROM_EXAM_V0__EXAM = 4;

   /**
    * The operation id for the '<em>Reg For Thesis Module Offer v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___REG_FOR_THESIS_MODULE_OFFER_V0__THESISMODULEOFFER = 5;

   /**
    * The operation id for the '<em>Reg For Thesis v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___REG_FOR_THESIS_V0 = 6;

   /**
    * The operation id for the '<em>Obtain Degree v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT___OBTAIN_DEGREE_V0 = 7;

   /**
    * The number of operations of the '<em>Enrollment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ENROLLMENT_OPERATION_COUNT = 8;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.LectureImpl <em>Lecture</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.LectureImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getLecture()
    * @generated
    */
   int LECTURE = 3;

   /**
    * The feature id for the '<em><b>Semester</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LECTURE__SEMESTER = 0;

   /**
    * The feature id for the '<em><b>Date</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LECTURE__DATE = 1;

   /**
    * The feature id for the '<em><b>Reg St</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LECTURE__REG_ST = 2;

   /**
    * The number of structural features of the '<em>Lecture</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LECTURE_FEATURE_COUNT = 3;

   /**
    * The number of operations of the '<em>Lecture</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LECTURE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl <em>Module</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getModule()
    * @generated
    */
   int MODULE = 4;

   /**
    * The feature id for the '<em><b>Lec Man</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODULE__LEC_MAN = 0;

   /**
    * The feature id for the '<em><b>All Offers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODULE__ALL_OFFERS = 1;

   /**
    * The feature id for the '<em><b>Current</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODULE__CURRENT = 2;

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
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.DateImpl <em>Date</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.DateImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getDate()
    * @generated
    */
   int DATE = 5;

   /**
    * The feature id for the '<em><b>Location</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATE__LOCATION = 0;

   /**
    * The feature id for the '<em><b>Begin</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATE__BEGIN = 1;

   /**
    * The feature id for the '<em><b>Duration</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATE__DURATION = 2;

   /**
    * The number of structural features of the '<em>Date</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATE_FEATURE_COUNT = 3;

   /**
    * The number of operations of the '<em>Date</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DATE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.EntryImpl <em>Entry</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.EntryImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEntry()
    * @generated
    */
   int ENTRY = 6;

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
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleImpl <em>Thesis Module</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesisModule()
    * @generated
    */
   int THESIS_MODULE = 7;

   /**
    * The feature id for the '<em><b>Act Thes Mod Offer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_MODULE__ACT_THES_MOD_OFFER = 0;

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
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl <em>Co Mod Offer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCoModOffer()
    * @generated
    */
   int CO_MOD_OFFER = 8;

   /**
    * The feature id for the '<em><b>Lec Man</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER__LEC_MAN = 0;

   /**
    * The feature id for the '<em><b>Exams</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER__EXAMS = 1;

   /**
    * The feature id for the '<em><b>Lectures</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER__LECTURES = 2;

   /**
    * The feature id for the '<em><b>Cp</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER__CP = 3;

   /**
    * The feature id for the '<em><b>State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER__STATE = 4;

   /**
    * The number of structural features of the '<em>Co Mod Offer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER_FEATURE_COUNT = 5;

   /**
    * The operation id for the '<em>Update Exam v1</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER___UPDATE_EXAM_V1__SYSTEMTIMER_EXAM = 0;

   /**
    * The operation id for the '<em>Set Lecture v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER___SET_LECTURE_V0__LECTURE = 1;

   /**
    * The operation id for the '<em>Set Exam v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER___SET_EXAM_V0__EXAM = 2;

   /**
    * The operation id for the '<em>Reset v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER___RESET_V0 = 3;

   /**
    * The operation id for the '<em>Update Exam v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER___UPDATE_EXAM_V0__EXAM = 4;

   /**
    * The operation id for the '<em>Update Lecture v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER___UPDATE_LECTURE_V0__LECTURE = 5;

   /**
    * The operation id for the '<em>Close Module Offer v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER___CLOSE_MODULE_OFFER_V0 = 6;

   /**
    * The number of operations of the '<em>Co Mod Offer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CO_MOD_OFFER_OPERATION_COUNT = 7;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl <em>Course Management</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCourseManagement()
    * @generated
    */
   int COURSE_MANAGEMENT = 9;

   /**
    * The feature id for the '<em><b>Programs</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COURSE_MANAGEMENT__PROGRAMS = 0;

   /**
    * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COURSE_MANAGEMENT__SEMESTERS = 1;

   /**
    * The feature id for the '<em><b>Module Offers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COURSE_MANAGEMENT__MODULE_OFFERS = 2;

   /**
    * The feature id for the '<em><b>Modules</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COURSE_MANAGEMENT__MODULES = 3;

   /**
    * The number of structural features of the '<em>Course Management</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COURSE_MANAGEMENT_FEATURE_COUNT = 4;

   /**
    * The number of operations of the '<em>Course Management</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COURSE_MANAGEMENT_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.UserDefinedConstraintsImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getUserDefinedConstraints()
    * @generated
    */
   int USER_DEFINED_CONSTRAINTS = 10;

   /**
    * The number of structural features of the '<em>User Defined Constraints</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS_FEATURE_COUNT = 0;

   /**
    * The operation id for the '<em>NC Singelton System</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___NC_SINGELTON_SYSTEM__SYSTEMTIMER_SYSTEMTIMER = 0;

   /**
    * The operation id for the '<em>NC Singelton Current Sem</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___NC_SINGELTON_CURRENT_SEM__SEMESTER_SEMESTER = 1;

   /**
    * The operation id for the '<em>NC No Two Enrollments With Same ID</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENROLLMENTS_WITH_SAME_ID__ENROLLMENT_ENROLLMENT = 2;

   /**
    * The operation id for the '<em>NC No Two Entries With Same ID</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENTRIES_WITH_SAME_ID__GRADEFORMULAR = 3;

   /**
    * The operation id for the '<em>NC only One Record For Module Offer And Exam</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_RECORD_FOR_MODULE_OFFER_AND_EXAM__ENROLLMENT = 4;

   /**
    * The operation id for the '<em>XNC only One CMO Per Exam</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___XNC_ONLY_ONE_CMO_PER_EXAM__ENROLLMENT = 5;

   /**
    * The operation id for the '<em>NC Only One Reg Per Enrollment</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_REG_PER_ENROLLMENT__RECORD_RECORD = 6;

   /**
    * The operation id for the '<em>NC No Competing Bookings</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS___NC_NO_COMPETING_BOOKINGS__ROOM = 7;

   /**
    * The number of operations of the '<em>User Defined Constraints</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int USER_DEFINED_CONSTRAINTS_OPERATION_COUNT = 8;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.RecordImpl <em>Record</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.RecordImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getRecord()
    * @generated
    */
   int RECORD = 11;

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
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.RoomImpl <em>Room</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.RoomImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getRoom()
    * @generated
    */
   int ROOM = 12;

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
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl <em>Program</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getProgram()
    * @generated
    */
   int PROGRAM = 13;

   /**
    * The feature id for the '<em><b>Thesis Modules</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROGRAM__THESIS_MODULES = 0;

   /**
    * The feature id for the '<em><b>Modules</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROGRAM__MODULES = 1;

   /**
    * The feature id for the '<em><b>Req Cp</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROGRAM__REQ_CP = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROGRAM__ID = 3;

   /**
    * The number of structural features of the '<em>Program</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROGRAM_FEATURE_COUNT = 4;

   /**
    * The number of operations of the '<em>Program</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PROGRAM_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.CMSImpl <em>CMS</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CMSImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCMS()
    * @generated
    */
   int CMS = 14;

   /**
    * The feature id for the '<em><b>Room Management</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CMS__ROOM_MANAGEMENT = 0;

   /**
    * The feature id for the '<em><b>Course Management</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CMS__COURSE_MANAGEMENT = 1;

   /**
    * The number of structural features of the '<em>CMS</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CMS_FEATURE_COUNT = 2;

   /**
    * The number of operations of the '<em>CMS</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CMS_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl <em>Exam</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getExam()
    * @generated
    */
   int EXAM = 15;

   /**
    * The feature id for the '<em><b>Semester</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM__SEMESTER = 0;

   /**
    * The feature id for the '<em><b>Registrations</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM__REGISTRATIONS = 1;

   /**
    * The feature id for the '<em><b>Date</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM__DATE = 2;

   /**
    * The feature id for the '<em><b>Grade List</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM__GRADE_LIST = 3;

   /**
    * The feature id for the '<em><b>Reg St</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM__REG_ST = 4;

   /**
    * The feature id for the '<em><b>State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM__STATE = 5;

   /**
    * The number of structural features of the '<em>Exam</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM_FEATURE_COUNT = 6;

   /**
    * The operation id for the '<em>Zet Date v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___ZET_DATE_V0__DATE = 0;

   /**
    * The operation id for the '<em>Update Date v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___UPDATE_DATE_V0__DATE = 1;

   /**
    * The operation id for the '<em>Book Room v1</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___BOOK_ROOM_V1__ROOM_SYSTEMTIMER = 2;

   /**
    * The operation id for the '<em>Transfer Result Passed v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___TRANSFER_RESULT_PASSED_V0 = 3;

   /**
    * The operation id for the '<em>Transfer Result Failed v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___TRANSFER_RESULT_FAILED_V0 = 4;

   /**
    * The operation id for the '<em>Book Room v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___BOOK_ROOM_V0__ROOM = 5;

   /**
    * The operation id for the '<em>Upload Results v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___UPLOAD_RESULTS_V0__GRADEFORMULAR = 6;

   /**
    * The operation id for the '<em>Close Exam v0</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___CLOSE_EXAM_V0 = 7;

   /**
    * The operation id for the '<em>Transfer Result Passed v1</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___TRANSFER_RESULT_PASSED_V1__SYSTEMTIMER = 8;

   /**
    * The operation id for the '<em>Transfer Result Failed v1</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM___TRANSFER_RESULT_FAILED_V1__SYSTEMTIMER = 9;

   /**
    * The number of operations of the '<em>Exam</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXAM_OPERATION_COUNT = 10;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.DegreeImpl <em>Degree</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.DegreeImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getDegree()
    * @generated
    */
   int DEGREE = 16;

   /**
    * The number of structural features of the '<em>Degree</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEGREE_FEATURE_COUNT = 0;

   /**
    * The number of operations of the '<em>Degree</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEGREE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.RoomManagementImpl <em>Room Management</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.RoomManagementImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getRoomManagement()
    * @generated
    */
   int ROOM_MANAGEMENT = 17;

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
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl <em>Thesis Record</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesisRecord()
    * @generated
    */
   int THESIS_RECORD = 18;

   /**
    * The feature id for the '<em><b>Thesis</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_RECORD__THESIS = 0;

   /**
    * The feature id for the '<em><b>Thesis Offer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_RECORD__THESIS_OFFER = 1;

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
    * The number of structural features of the '<em>Thesis Record</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_RECORD_FEATURE_COUNT = 4;

   /**
    * The number of operations of the '<em>Thesis Record</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_RECORD_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl <em>Semester</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getSemester()
    * @generated
    */
   int SEMESTER = 19;

   /**
    * The feature id for the '<em><b>Lecture Man</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__LECTURE_MAN = 0;

   /**
    * The feature id for the '<em><b>Exams</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__EXAMS = 1;

   /**
    * The feature id for the '<em><b>Previous</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__PREVIOUS = 2;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__NEXT = 3;

   /**
    * The feature id for the '<em><b>Offered Lectures</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__OFFERED_LECTURES = 4;

   /**
    * The feature id for the '<em><b>Reg Period Start</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__REG_PERIOD_START = 5;

   /**
    * The feature id for the '<em><b>Reg Period Stop</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__REG_PERIOD_STOP = 6;

   /**
    * The feature id for the '<em><b>Start Date</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__START_DATE = 7;

   /**
    * The feature id for the '<em><b>End Date</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__END_DATE = 8;

   /**
    * The feature id for the '<em><b>Current</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__CURRENT = 9;

   /**
    * The feature id for the '<em><b>State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER__STATE = 10;

   /**
    * The number of structural features of the '<em>Semester</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER_FEATURE_COUNT = 11;

   /**
    * The number of operations of the '<em>Semester</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SEMESTER_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.BookingImpl <em>Booking</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.BookingImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getBooking()
    * @generated
    */
   int BOOKING = 20;

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
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.SystemTimerImpl <em>System Timer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.SystemTimerImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getSystemTimer()
    * @generated
    */
   int SYSTEM_TIMER = 21;

   /**
    * The feature id for the '<em><b>Current Time</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_TIMER__CURRENT_TIME = 0;

   /**
    * The number of structural features of the '<em>System Timer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_TIMER_FEATURE_COUNT = 1;

   /**
    * The number of operations of the '<em>System Timer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SYSTEM_TIMER_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleOfferImpl <em>Thesis Module Offer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleOfferImpl
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesisModuleOffer()
    * @generated
    */
   int THESIS_MODULE_OFFER = 22;

   /**
    * The feature id for the '<em><b>Thesiss</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_MODULE_OFFER__THESISS = 0;

   /**
    * The feature id for the '<em><b>Cp</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_MODULE_OFFER__CP = 1;

   /**
    * The number of structural features of the '<em>Thesis Module Offer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_MODULE_OFFER_FEATURE_COUNT = 2;

   /**
    * The number of operations of the '<em>Thesis Module Offer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int THESIS_MODULE_OFFER_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.EX_STATE <em>EX STATE</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.EX_STATE
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEX_STATE()
    * @generated
    */
   int EX_STATE = 23;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.EN_STATE <em>EN STATE</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.EN_STATE
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEN_STATE()
    * @generated
    */
   int EN_STATE = 24;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.TH_STATE <em>TH STATE</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.TH_STATE
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getTH_STATE()
    * @generated
    */
   int TH_STATE = 25;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.SEM_STATE <em>SEM STATE</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.SEM_STATE
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getSEM_STATE()
    * @generated
    */
   int SEM_STATE = 26;

   /**
    * The meta object id for the '{@link org.moflon.maave.tests.lang.cmsNew.CMO_STATE <em>CMO STATE</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.maave.tests.lang.cmsNew.CMO_STATE
    * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCMO_STATE()
    * @generated
    */
   int CMO_STATE = 27;

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.GradeFormular <em>Grade Formular</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Grade Formular</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.GradeFormular
    * @generated
    */
   EClass getGradeFormular();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.GradeFormular#getRecords <em>Records</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Records</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.GradeFormular#getRecords()
    * @see #getGradeFormular()
    * @generated
    */
   EReference getGradeFormular_Records();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Thesis <em>Thesis</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Thesis</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Thesis
    * @generated
    */
   EClass getThesis();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getRecord <em>Record</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Record</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Thesis#getRecord()
    * @see #getThesis()
    * @generated
    */
   EReference getThesis_Record();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getGrade <em>Grade</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Grade</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Thesis#getGrade()
    * @see #getThesis()
    * @generated
    */
   EAttribute getThesis_Grade();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#getState <em>State</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>State</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Thesis#getState()
    * @see #getThesis()
    * @generated
    */
   EAttribute getThesis_State();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Thesis#enterGrade_v0() <em>Enter Grade v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Enter Grade v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Thesis#enterGrade_v0()
    * @generated
    */
   EOperation getThesis__EnterGrade_v0();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment <em>Enrollment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Enrollment</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment
    * @generated
    */
   EClass getEnrollment();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getRecords <em>Records</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Records</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getRecords()
    * @see #getEnrollment()
    * @generated
    */
   EReference getEnrollment_Records();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getProgram <em>Program</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Program</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getProgram()
    * @see #getEnrollment()
    * @generated
    */
   EReference getEnrollment_Program();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getDegree <em>Degree</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Degree</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getDegree()
    * @see #getEnrollment()
    * @generated
    */
   EReference getEnrollment_Degree();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getThesisRecord <em>Thesis Record</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Thesis Record</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getThesisRecord()
    * @see #getEnrollment()
    * @generated
    */
   EReference getEnrollment_ThesisRecord();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getCp <em>Cp</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Cp</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getCp()
    * @see #getEnrollment()
    * @generated
    */
   EAttribute getEnrollment_Cp();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getState <em>State</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>State</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getState()
    * @see #getEnrollment()
    * @generated
    */
   EAttribute getEnrollment_State();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getRegCp <em>Reg Cp</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Reg Cp</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getRegCp()
    * @see #getEnrollment()
    * @generated
    */
   EAttribute getEnrollment_RegCp();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#getStudId <em>Stud Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Stud Id</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#getStudId()
    * @see #getEnrollment()
    * @generated
    */
   EAttribute getEnrollment_StudId();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#isEnrolled <em>Enrolled</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Enrolled</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#isEnrolled()
    * @see #getEnrollment()
    * @generated
    */
   EAttribute getEnrollment_Enrolled();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#regForExam_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer, org.moflon.maave.tests.lang.cmsNew.Exam) <em>Reg For Exam v1</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Reg For Exam v1</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#regForExam_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer, org.moflon.maave.tests.lang.cmsNew.Exam)
    * @generated
    */
   EOperation getEnrollment__RegForExam_v1__SystemTimer_Exam();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#unregFromExam_v1(org.moflon.maave.tests.lang.cmsNew.Exam, org.moflon.maave.tests.lang.cmsNew.SystemTimer) <em>Unreg From Exam v1</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Unreg From Exam v1</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#unregFromExam_v1(org.moflon.maave.tests.lang.cmsNew.Exam, org.moflon.maave.tests.lang.cmsNew.SystemTimer)
    * @generated
    */
   EOperation getEnrollment__UnregFromExam_v1__Exam_SystemTimer();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#regForExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam) <em>Reg For Exam v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Reg For Exam v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#regForExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam)
    * @generated
    */
   EOperation getEnrollment__RegForExam_v0__Exam();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#regForModule_v0(org.moflon.maave.tests.lang.cmsNew.CoModOffer) <em>Reg For Module v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Reg For Module v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#regForModule_v0(org.moflon.maave.tests.lang.cmsNew.CoModOffer)
    * @generated
    */
   EOperation getEnrollment__RegForModule_v0__CoModOffer();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#unregFromExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam) <em>Unreg From Exam v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Unreg From Exam v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#unregFromExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam)
    * @generated
    */
   EOperation getEnrollment__UnregFromExam_v0__Exam();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#regForThesisModuleOffer_v0(org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer) <em>Reg For Thesis Module Offer v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Reg For Thesis Module Offer v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#regForThesisModuleOffer_v0(org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer)
    * @generated
    */
   EOperation getEnrollment__RegForThesisModuleOffer_v0__ThesisModuleOffer();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#regForThesis_v0() <em>Reg For Thesis v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Reg For Thesis v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#regForThesis_v0()
    * @generated
    */
   EOperation getEnrollment__RegForThesis_v0();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Enrollment#obtainDegree_v0() <em>Obtain Degree v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Obtain Degree v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Enrollment#obtainDegree_v0()
    * @generated
    */
   EOperation getEnrollment__ObtainDegree_v0();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Lecture <em>Lecture</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Lecture</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Lecture
    * @generated
    */
   EClass getLecture();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getSemester <em>Semester</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Semester</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Lecture#getSemester()
    * @see #getLecture()
    * @generated
    */
   EReference getLecture_Semester();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getDate <em>Date</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Date</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Lecture#getDate()
    * @see #getLecture()
    * @generated
    */
   EReference getLecture_Date();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Lecture#getRegSt <em>Reg St</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Reg St</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Lecture#getRegSt()
    * @see #getLecture()
    * @generated
    */
   EAttribute getLecture_RegSt();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Module <em>Module</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Module</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Module
    * @generated
    */
   EClass getModule();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cmsNew.Module#getLecMan <em>Lec Man</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Lec Man</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Module#getLecMan()
    * @see #getModule()
    * @generated
    */
   EReference getModule_LecMan();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.Module#getAllOffers <em>All Offers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>All Offers</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Module#getAllOffers()
    * @see #getModule()
    * @generated
    */
   EReference getModule_AllOffers();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Module#getCurrent <em>Current</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Current</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Module#getCurrent()
    * @see #getModule()
    * @generated
    */
   EReference getModule_Current();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Module#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Module#getId()
    * @see #getModule()
    * @generated
    */
   EAttribute getModule_Id();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Module#getVersion <em>Version</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Version</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Module#getVersion()
    * @see #getModule()
    * @generated
    */
   EAttribute getModule_Version();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Date <em>Date</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Date</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Date
    * @generated
    */
   EClass getDate();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Date#getLocation <em>Location</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Location</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Date#getLocation()
    * @see #getDate()
    * @generated
    */
   EReference getDate_Location();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Date#getBegin <em>Begin</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Begin</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Date#getBegin()
    * @see #getDate()
    * @generated
    */
   EAttribute getDate_Begin();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Date#getDuration <em>Duration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Duration</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Date#getDuration()
    * @see #getDate()
    * @generated
    */
   EAttribute getDate_Duration();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Entry <em>Entry</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Entry</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Entry
    * @generated
    */
   EClass getEntry();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Entry#getStudentId <em>Student Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Student Id</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Entry#getStudentId()
    * @see #getEntry()
    * @generated
    */
   EAttribute getEntry_StudentId();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Entry#getGrade <em>Grade</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Grade</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Entry#getGrade()
    * @see #getEntry()
    * @generated
    */
   EAttribute getEntry_Grade();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule <em>Thesis Module</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Thesis Module</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisModule
    * @generated
    */
   EClass getThesisModule();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule#getActThesModOffer <em>Act Thes Mod Offer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Act Thes Mod Offer</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisModule#getActThesModOffer()
    * @see #getThesisModule()
    * @generated
    */
   EReference getThesisModule_ActThesModOffer();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModule#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisModule#getId()
    * @see #getThesisModule()
    * @generated
    */
   EAttribute getThesisModule_Id();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer <em>Co Mod Offer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Co Mod Offer</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer
    * @generated
    */
   EClass getCoModOffer();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLecMan <em>Lec Man</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Lec Man</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLecMan()
    * @see #getCoModOffer()
    * @generated
    */
   EReference getCoModOffer_LecMan();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getExams <em>Exams</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Exams</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#getExams()
    * @see #getCoModOffer()
    * @generated
    */
   EReference getCoModOffer_Exams();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLectures <em>Lectures</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Lectures</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#getLectures()
    * @see #getCoModOffer()
    * @generated
    */
   EReference getCoModOffer_Lectures();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getCp <em>Cp</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Cp</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#getCp()
    * @see #getCoModOffer()
    * @generated
    */
   EAttribute getCoModOffer_Cp();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#getState <em>State</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>State</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#getState()
    * @see #getCoModOffer()
    * @generated
    */
   EAttribute getCoModOffer_State();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#updateExam_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer, org.moflon.maave.tests.lang.cmsNew.Exam) <em>Update Exam v1</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Update Exam v1</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#updateExam_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer, org.moflon.maave.tests.lang.cmsNew.Exam)
    * @generated
    */
   EOperation getCoModOffer__UpdateExam_v1__SystemTimer_Exam();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#setLecture_v0(org.moflon.maave.tests.lang.cmsNew.Lecture) <em>Set Lecture v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Set Lecture v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#setLecture_v0(org.moflon.maave.tests.lang.cmsNew.Lecture)
    * @generated
    */
   EOperation getCoModOffer__SetLecture_v0__Lecture();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#setExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam) <em>Set Exam v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Set Exam v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#setExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam)
    * @generated
    */
   EOperation getCoModOffer__SetExam_v0__Exam();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#reset_v0() <em>Reset v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Reset v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#reset_v0()
    * @generated
    */
   EOperation getCoModOffer__Reset_v0();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#updateExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam) <em>Update Exam v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Update Exam v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#updateExam_v0(org.moflon.maave.tests.lang.cmsNew.Exam)
    * @generated
    */
   EOperation getCoModOffer__UpdateExam_v0__Exam();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#updateLecture_v0(org.moflon.maave.tests.lang.cmsNew.Lecture) <em>Update Lecture v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Update Lecture v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#updateLecture_v0(org.moflon.maave.tests.lang.cmsNew.Lecture)
    * @generated
    */
   EOperation getCoModOffer__UpdateLecture_v0__Lecture();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.CoModOffer#closeModuleOffer_v0() <em>Close Module Offer v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Close Module Offer v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.CoModOffer#closeModuleOffer_v0()
    * @generated
    */
   EOperation getCoModOffer__CloseModuleOffer_v0();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement <em>Course Management</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Course Management</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement
    * @generated
    */
   EClass getCourseManagement();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getPrograms <em>Programs</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Programs</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement#getPrograms()
    * @see #getCourseManagement()
    * @generated
    */
   EReference getCourseManagement_Programs();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getSemesters <em>Semesters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Semesters</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement#getSemesters()
    * @see #getCourseManagement()
    * @generated
    */
   EReference getCourseManagement_Semesters();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModuleOffers <em>Module Offers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Module Offers</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModuleOffers()
    * @see #getCourseManagement()
    * @generated
    */
   EReference getCourseManagement_ModuleOffers();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModules <em>Modules</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Modules</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CourseManagement#getModules()
    * @see #getCourseManagement()
    * @generated
    */
   EReference getCourseManagement_Modules();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints <em>User Defined Constraints</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>User Defined Constraints</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints
    * @generated
    */
   EClass getUserDefinedConstraints();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_SingeltonSystem(org.moflon.maave.tests.lang.cmsNew.SystemTimer, org.moflon.maave.tests.lang.cmsNew.SystemTimer) <em>NC Singelton System</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>NC Singelton System</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_SingeltonSystem(org.moflon.maave.tests.lang.cmsNew.SystemTimer, org.moflon.maave.tests.lang.cmsNew.SystemTimer)
    * @generated
    */
   EOperation getUserDefinedConstraints___NC_SingeltonSystem__SystemTimer_SystemTimer();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_SingeltonCurrentSem(org.moflon.maave.tests.lang.cmsNew.Semester, org.moflon.maave.tests.lang.cmsNew.Semester) <em>NC Singelton Current Sem</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>NC Singelton Current Sem</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_SingeltonCurrentSem(org.moflon.maave.tests.lang.cmsNew.Semester, org.moflon.maave.tests.lang.cmsNew.Semester)
    * @generated
    */
   EOperation getUserDefinedConstraints___NC_SingeltonCurrentSem__Semester_Semester();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_NoTwoEnrollmentsWithSameID(org.moflon.maave.tests.lang.cmsNew.Enrollment, org.moflon.maave.tests.lang.cmsNew.Enrollment) <em>NC No Two Enrollments With Same ID</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>NC No Two Enrollments With Same ID</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_NoTwoEnrollmentsWithSameID(org.moflon.maave.tests.lang.cmsNew.Enrollment, org.moflon.maave.tests.lang.cmsNew.Enrollment)
    * @generated
    */
   EOperation getUserDefinedConstraints___NC_NoTwoEnrollmentsWithSameID__Enrollment_Enrollment();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_NoTwoEntriesWithSameID(org.moflon.maave.tests.lang.cmsNew.GradeFormular) <em>NC No Two Entries With Same ID</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>NC No Two Entries With Same ID</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_NoTwoEntriesWithSameID(org.moflon.maave.tests.lang.cmsNew.GradeFormular)
    * @generated
    */
   EOperation getUserDefinedConstraints___NC_NoTwoEntriesWithSameID__GradeFormular();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_onlyOneRecordForModuleOfferAndExam(org.moflon.maave.tests.lang.cmsNew.Enrollment) <em>NC only One Record For Module Offer And Exam</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>NC only One Record For Module Offer And Exam</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_onlyOneRecordForModuleOfferAndExam(org.moflon.maave.tests.lang.cmsNew.Enrollment)
    * @generated
    */
   EOperation getUserDefinedConstraints___NC_onlyOneRecordForModuleOfferAndExam__Enrollment();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_XNC_onlyOneCMOPerExam(org.moflon.maave.tests.lang.cmsNew.Enrollment) <em>XNC only One CMO Per Exam</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>XNC only One CMO Per Exam</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_XNC_onlyOneCMOPerExam(org.moflon.maave.tests.lang.cmsNew.Enrollment)
    * @generated
    */
   EOperation getUserDefinedConstraints___XNC_onlyOneCMOPerExam__Enrollment();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_OnlyOneRegPerEnrollment(org.moflon.maave.tests.lang.cmsNew.Record, org.moflon.maave.tests.lang.cmsNew.Record) <em>NC Only One Reg Per Enrollment</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>NC Only One Reg Per Enrollment</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_OnlyOneRegPerEnrollment(org.moflon.maave.tests.lang.cmsNew.Record, org.moflon.maave.tests.lang.cmsNew.Record)
    * @generated
    */
   EOperation getUserDefinedConstraints___NC_OnlyOneRegPerEnrollment__Record_Record();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_NoCompetingBookings(org.moflon.maave.tests.lang.cmsNew.Room) <em>NC No Competing Bookings</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>NC No Competing Bookings</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints#_NC_NoCompetingBookings(org.moflon.maave.tests.lang.cmsNew.Room)
    * @generated
    */
   EOperation getUserDefinedConstraints___NC_NoCompetingBookings__Room();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Record <em>Record</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Record</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Record
    * @generated
    */
   EClass getRecord();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cmsNew.Record#getEnrollment <em>Enrollment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Enrollment</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Record#getEnrollment()
    * @see #getRecord()
    * @generated
    */
   EReference getRecord_Enrollment();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Record#getExam <em>Exam</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Exam</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Record#getExam()
    * @see #getRecord()
    * @generated
    */
   EReference getRecord_Exam();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Record#getModuleOffer <em>Module Offer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Module Offer</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Record#getModuleOffer()
    * @see #getRecord()
    * @generated
    */
   EReference getRecord_ModuleOffer();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Record#getGrade <em>Grade</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Grade</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Record#getGrade()
    * @see #getRecord()
    * @generated
    */
   EAttribute getRecord_Grade();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Record#getTries <em>Tries</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Tries</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Record#getTries()
    * @see #getRecord()
    * @generated
    */
   EAttribute getRecord_Tries();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Room <em>Room</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Room</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Room
    * @generated
    */
   EClass getRoom();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.Room#getReservations <em>Reservations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Reservations</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Room#getReservations()
    * @see #getRoom()
    * @generated
    */
   EReference getRoom_Reservations();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Room#getCapacity <em>Capacity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Capacity</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Room#getCapacity()
    * @see #getRoom()
    * @generated
    */
   EAttribute getRoom_Capacity();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Program <em>Program</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Program</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Program
    * @generated
    */
   EClass getProgram();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.Program#getThesisModules <em>Thesis Modules</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Thesis Modules</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Program#getThesisModules()
    * @see #getProgram()
    * @generated
    */
   EReference getProgram_ThesisModules();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.cmsNew.Program#getModules <em>Modules</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Modules</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Program#getModules()
    * @see #getProgram()
    * @generated
    */
   EReference getProgram_Modules();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Program#getReqCp <em>Req Cp</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Req Cp</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Program#getReqCp()
    * @see #getProgram()
    * @generated
    */
   EAttribute getProgram_ReqCp();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Program#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Program#getId()
    * @see #getProgram()
    * @generated
    */
   EAttribute getProgram_Id();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.CMS <em>CMS</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>CMS</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CMS
    * @generated
    */
   EClass getCMS();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.CMS#getRoomManagement <em>Room Management</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Room Management</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CMS#getRoomManagement()
    * @see #getCMS()
    * @generated
    */
   EReference getCMS_RoomManagement();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.CMS#getCourseManagement <em>Course Management</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Course Management</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CMS#getCourseManagement()
    * @see #getCMS()
    * @generated
    */
   EReference getCMS_CourseManagement();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Exam <em>Exam</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Exam</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam
    * @generated
    */
   EClass getExam();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getSemester <em>Semester</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Semester</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#getSemester()
    * @see #getExam()
    * @generated
    */
   EReference getExam_Semester();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getRegistrations <em>Registrations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Registrations</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#getRegistrations()
    * @see #getExam()
    * @generated
    */
   EReference getExam_Registrations();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getDate <em>Date</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Date</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#getDate()
    * @see #getExam()
    * @generated
    */
   EReference getExam_Date();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getGradeList <em>Grade List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Grade List</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#getGradeList()
    * @see #getExam()
    * @generated
    */
   EReference getExam_GradeList();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getRegSt <em>Reg St</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Reg St</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#getRegSt()
    * @see #getExam()
    * @generated
    */
   EAttribute getExam_RegSt();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Exam#getState <em>State</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>State</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#getState()
    * @see #getExam()
    * @generated
    */
   EAttribute getExam_State();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#zetDate_v0(org.moflon.maave.tests.lang.cmsNew.Date) <em>Zet Date v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Zet Date v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#zetDate_v0(org.moflon.maave.tests.lang.cmsNew.Date)
    * @generated
    */
   EOperation getExam__ZetDate_v0__Date();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#updateDate_v0(org.moflon.maave.tests.lang.cmsNew.Date) <em>Update Date v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Update Date v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#updateDate_v0(org.moflon.maave.tests.lang.cmsNew.Date)
    * @generated
    */
   EOperation getExam__UpdateDate_v0__Date();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#bookRoom_v1(org.moflon.maave.tests.lang.cmsNew.Room, org.moflon.maave.tests.lang.cmsNew.SystemTimer) <em>Book Room v1</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Book Room v1</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#bookRoom_v1(org.moflon.maave.tests.lang.cmsNew.Room, org.moflon.maave.tests.lang.cmsNew.SystemTimer)
    * @generated
    */
   EOperation getExam__BookRoom_v1__Room_SystemTimer();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#transferResultPassed_v0() <em>Transfer Result Passed v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transfer Result Passed v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#transferResultPassed_v0()
    * @generated
    */
   EOperation getExam__TransferResultPassed_v0();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#transferResultFailed_v0() <em>Transfer Result Failed v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transfer Result Failed v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#transferResultFailed_v0()
    * @generated
    */
   EOperation getExam__TransferResultFailed_v0();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#bookRoom_v0(org.moflon.maave.tests.lang.cmsNew.Room) <em>Book Room v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Book Room v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#bookRoom_v0(org.moflon.maave.tests.lang.cmsNew.Room)
    * @generated
    */
   EOperation getExam__BookRoom_v0__Room();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#uploadResults_v0(org.moflon.maave.tests.lang.cmsNew.GradeFormular) <em>Upload Results v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Upload Results v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#uploadResults_v0(org.moflon.maave.tests.lang.cmsNew.GradeFormular)
    * @generated
    */
   EOperation getExam__UploadResults_v0__GradeFormular();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#closeExam_v0() <em>Close Exam v0</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Close Exam v0</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#closeExam_v0()
    * @generated
    */
   EOperation getExam__CloseExam_v0();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#transferResultPassed_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer) <em>Transfer Result Passed v1</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transfer Result Passed v1</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#transferResultPassed_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer)
    * @generated
    */
   EOperation getExam__TransferResultPassed_v1__SystemTimer();

   /**
    * Returns the meta object for the '{@link org.moflon.maave.tests.lang.cmsNew.Exam#transferResultFailed_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer) <em>Transfer Result Failed v1</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Transfer Result Failed v1</em>' operation.
    * @see org.moflon.maave.tests.lang.cmsNew.Exam#transferResultFailed_v1(org.moflon.maave.tests.lang.cmsNew.SystemTimer)
    * @generated
    */
   EOperation getExam__TransferResultFailed_v1__SystemTimer();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Degree <em>Degree</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Degree</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Degree
    * @generated
    */
   EClass getDegree();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.RoomManagement <em>Room Management</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Room Management</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.RoomManagement
    * @generated
    */
   EClass getRoomManagement();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.RoomManagement#getRooms <em>Rooms</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Rooms</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.RoomManagement#getRooms()
    * @see #getRoomManagement()
    * @generated
    */
   EReference getRoomManagement_Rooms();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord <em>Thesis Record</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Thesis Record</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisRecord
    * @generated
    */
   EClass getThesisRecord();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesis <em>Thesis</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Thesis</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesis()
    * @see #getThesisRecord()
    * @generated
    */
   EReference getThesisRecord_Thesis();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesisOffer <em>Thesis Offer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Thesis Offer</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getThesisOffer()
    * @see #getThesisRecord()
    * @generated
    */
   EReference getThesisRecord_ThesisOffer();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getGrade <em>Grade</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Grade</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getGrade()
    * @see #getThesisRecord()
    * @generated
    */
   EAttribute getThesisRecord_Grade();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getTries <em>Tries</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Tries</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisRecord#getTries()
    * @see #getThesisRecord()
    * @generated
    */
   EAttribute getThesisRecord_Tries();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Semester <em>Semester</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Semester</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester
    * @generated
    */
   EClass getSemester();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getLectureMan <em>Lecture Man</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Lecture Man</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getLectureMan()
    * @see #getSemester()
    * @generated
    */
   EReference getSemester_LectureMan();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getExams <em>Exams</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Exams</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getExams()
    * @see #getSemester()
    * @generated
    */
   EReference getSemester_Exams();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getPrevious <em>Previous</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Previous</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getPrevious()
    * @see #getSemester()
    * @generated
    */
   EReference getSemester_Previous();

   /**
    * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getNext <em>Next</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Next</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getNext()
    * @see #getSemester()
    * @generated
    */
   EReference getSemester_Next();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getOfferedLectures <em>Offered Lectures</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Offered Lectures</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getOfferedLectures()
    * @see #getSemester()
    * @generated
    */
   EReference getSemester_OfferedLectures();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStart <em>Reg Period Start</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Reg Period Start</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStart()
    * @see #getSemester()
    * @generated
    */
   EAttribute getSemester_RegPeriodStart();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStop <em>Reg Period Stop</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Reg Period Stop</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getRegPeriodStop()
    * @see #getSemester()
    * @generated
    */
   EAttribute getSemester_RegPeriodStop();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getStartDate <em>Start Date</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Start Date</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getStartDate()
    * @see #getSemester()
    * @generated
    */
   EAttribute getSemester_StartDate();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getEndDate <em>End Date</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>End Date</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getEndDate()
    * @see #getSemester()
    * @generated
    */
   EAttribute getSemester_EndDate();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Semester#isCurrent <em>Current</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Current</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#isCurrent()
    * @see #getSemester()
    * @generated
    */
   EAttribute getSemester_Current();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Semester#getState <em>State</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>State</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Semester#getState()
    * @see #getSemester()
    * @generated
    */
   EAttribute getSemester_State();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.Booking <em>Booking</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Booking</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Booking
    * @generated
    */
   EClass getBooking();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.cmsNew.Booking#getRoom <em>Room</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Room</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Booking#getRoom()
    * @see #getBooking()
    * @generated
    */
   EReference getBooking_Room();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Booking#getBegin <em>Begin</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Begin</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Booking#getBegin()
    * @see #getBooking()
    * @generated
    */
   EAttribute getBooking_Begin();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.Booking#getEnd <em>End</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>End</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.Booking#getEnd()
    * @see #getBooking()
    * @generated
    */
   EAttribute getBooking_End();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.SystemTimer <em>System Timer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>System Timer</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.SystemTimer
    * @generated
    */
   EClass getSystemTimer();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.SystemTimer#getCurrentTime <em>Current Time</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Current Time</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.SystemTimer#getCurrentTime()
    * @see #getSystemTimer()
    * @generated
    */
   EAttribute getSystemTimer_CurrentTime();

   /**
    * Returns the meta object for class '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer <em>Thesis Module Offer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Thesis Module Offer</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer
    * @generated
    */
   EClass getThesisModuleOffer();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer#getThesiss <em>Thesiss</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Thesiss</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer#getThesiss()
    * @see #getThesisModuleOffer()
    * @generated
    */
   EReference getThesisModuleOffer_Thesiss();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer#getCp <em>Cp</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Cp</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer#getCp()
    * @see #getThesisModuleOffer()
    * @generated
    */
   EAttribute getThesisModuleOffer_Cp();

   /**
    * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.cmsNew.EX_STATE <em>EX STATE</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>EX STATE</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.EX_STATE
    * @generated
    */
   EEnum getEX_STATE();

   /**
    * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.cmsNew.EN_STATE <em>EN STATE</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>EN STATE</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.EN_STATE
    * @generated
    */
   EEnum getEN_STATE();

   /**
    * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.cmsNew.TH_STATE <em>TH STATE</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>TH STATE</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.TH_STATE
    * @generated
    */
   EEnum getTH_STATE();

   /**
    * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.cmsNew.SEM_STATE <em>SEM STATE</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>SEM STATE</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.SEM_STATE
    * @generated
    */
   EEnum getSEM_STATE();

   /**
    * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.cmsNew.CMO_STATE <em>CMO STATE</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>CMO STATE</em>'.
    * @see org.moflon.maave.tests.lang.cmsNew.CMO_STATE
    * @generated
    */
   EEnum getCMO_STATE();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   CmsNewFactory getCmsNewFactory();

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
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.GradeFormularImpl <em>Grade Formular</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.GradeFormularImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getGradeFormular()
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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisImpl <em>Thesis</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesis()
       * @generated
       */
      EClass THESIS = eINSTANCE.getThesis();

      /**
       * The meta object literal for the '<em><b>Record</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference THESIS__RECORD = eINSTANCE.getThesis_Record();

      /**
       * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute THESIS__GRADE = eINSTANCE.getThesis_Grade();

      /**
       * The meta object literal for the '<em><b>State</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute THESIS__STATE = eINSTANCE.getThesis_State();

      /**
       * The meta object literal for the '<em><b>Enter Grade v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation THESIS___ENTER_GRADE_V0 = eINSTANCE.getThesis__EnterGrade_v0();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl <em>Enrollment</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEnrollment()
       * @generated
       */
      EClass ENROLLMENT = eINSTANCE.getEnrollment();

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
       * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ENROLLMENT__DEGREE = eINSTANCE.getEnrollment_Degree();

      /**
       * The meta object literal for the '<em><b>Thesis Record</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ENROLLMENT__THESIS_RECORD = eINSTANCE.getEnrollment_ThesisRecord();

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
       * The meta object literal for the '<em><b>Stud Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ENROLLMENT__STUD_ID = eINSTANCE.getEnrollment_StudId();

      /**
       * The meta object literal for the '<em><b>Enrolled</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ENROLLMENT__ENROLLED = eINSTANCE.getEnrollment_Enrolled();

      /**
       * The meta object literal for the '<em><b>Reg For Exam v1</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___REG_FOR_EXAM_V1__SYSTEMTIMER_EXAM = eINSTANCE.getEnrollment__RegForExam_v1__SystemTimer_Exam();

      /**
       * The meta object literal for the '<em><b>Unreg From Exam v1</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___UNREG_FROM_EXAM_V1__EXAM_SYSTEMTIMER = eINSTANCE.getEnrollment__UnregFromExam_v1__Exam_SystemTimer();

      /**
       * The meta object literal for the '<em><b>Reg For Exam v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___REG_FOR_EXAM_V0__EXAM = eINSTANCE.getEnrollment__RegForExam_v0__Exam();

      /**
       * The meta object literal for the '<em><b>Reg For Module v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___REG_FOR_MODULE_V0__COMODOFFER = eINSTANCE.getEnrollment__RegForModule_v0__CoModOffer();

      /**
       * The meta object literal for the '<em><b>Unreg From Exam v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___UNREG_FROM_EXAM_V0__EXAM = eINSTANCE.getEnrollment__UnregFromExam_v0__Exam();

      /**
       * The meta object literal for the '<em><b>Reg For Thesis Module Offer v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___REG_FOR_THESIS_MODULE_OFFER_V0__THESISMODULEOFFER = eINSTANCE.getEnrollment__RegForThesisModuleOffer_v0__ThesisModuleOffer();

      /**
       * The meta object literal for the '<em><b>Reg For Thesis v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___REG_FOR_THESIS_V0 = eINSTANCE.getEnrollment__RegForThesis_v0();

      /**
       * The meta object literal for the '<em><b>Obtain Degree v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ENROLLMENT___OBTAIN_DEGREE_V0 = eINSTANCE.getEnrollment__ObtainDegree_v0();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.LectureImpl <em>Lecture</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.LectureImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getLecture()
       * @generated
       */
      EClass LECTURE = eINSTANCE.getLecture();

      /**
       * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LECTURE__SEMESTER = eINSTANCE.getLecture_Semester();

      /**
       * The meta object literal for the '<em><b>Date</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LECTURE__DATE = eINSTANCE.getLecture_Date();

      /**
       * The meta object literal for the '<em><b>Reg St</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LECTURE__REG_ST = eINSTANCE.getLecture_RegSt();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl <em>Module</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getModule()
       * @generated
       */
      EClass MODULE = eINSTANCE.getModule();

      /**
       * The meta object literal for the '<em><b>Lec Man</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference MODULE__LEC_MAN = eINSTANCE.getModule_LecMan();

      /**
       * The meta object literal for the '<em><b>All Offers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference MODULE__ALL_OFFERS = eINSTANCE.getModule_AllOffers();

      /**
       * The meta object literal for the '<em><b>Current</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference MODULE__CURRENT = eINSTANCE.getModule_Current();

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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.DateImpl <em>Date</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.DateImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getDate()
       * @generated
       */
      EClass DATE = eINSTANCE.getDate();

      /**
       * The meta object literal for the '<em><b>Location</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DATE__LOCATION = eINSTANCE.getDate_Location();

      /**
       * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DATE__BEGIN = eINSTANCE.getDate_Begin();

      /**
       * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DATE__DURATION = eINSTANCE.getDate_Duration();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.EntryImpl <em>Entry</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.EntryImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEntry()
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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleImpl <em>Thesis Module</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesisModule()
       * @generated
       */
      EClass THESIS_MODULE = eINSTANCE.getThesisModule();

      /**
       * The meta object literal for the '<em><b>Act Thes Mod Offer</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference THESIS_MODULE__ACT_THES_MOD_OFFER = eINSTANCE.getThesisModule_ActThesModOffer();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute THESIS_MODULE__ID = eINSTANCE.getThesisModule_Id();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl <em>Co Mod Offer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCoModOffer()
       * @generated
       */
      EClass CO_MOD_OFFER = eINSTANCE.getCoModOffer();

      /**
       * The meta object literal for the '<em><b>Lec Man</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CO_MOD_OFFER__LEC_MAN = eINSTANCE.getCoModOffer_LecMan();

      /**
       * The meta object literal for the '<em><b>Exams</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CO_MOD_OFFER__EXAMS = eINSTANCE.getCoModOffer_Exams();

      /**
       * The meta object literal for the '<em><b>Lectures</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CO_MOD_OFFER__LECTURES = eINSTANCE.getCoModOffer_Lectures();

      /**
       * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute CO_MOD_OFFER__CP = eINSTANCE.getCoModOffer_Cp();

      /**
       * The meta object literal for the '<em><b>State</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute CO_MOD_OFFER__STATE = eINSTANCE.getCoModOffer_State();

      /**
       * The meta object literal for the '<em><b>Update Exam v1</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CO_MOD_OFFER___UPDATE_EXAM_V1__SYSTEMTIMER_EXAM = eINSTANCE.getCoModOffer__UpdateExam_v1__SystemTimer_Exam();

      /**
       * The meta object literal for the '<em><b>Set Lecture v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CO_MOD_OFFER___SET_LECTURE_V0__LECTURE = eINSTANCE.getCoModOffer__SetLecture_v0__Lecture();

      /**
       * The meta object literal for the '<em><b>Set Exam v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CO_MOD_OFFER___SET_EXAM_V0__EXAM = eINSTANCE.getCoModOffer__SetExam_v0__Exam();

      /**
       * The meta object literal for the '<em><b>Reset v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CO_MOD_OFFER___RESET_V0 = eINSTANCE.getCoModOffer__Reset_v0();

      /**
       * The meta object literal for the '<em><b>Update Exam v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CO_MOD_OFFER___UPDATE_EXAM_V0__EXAM = eINSTANCE.getCoModOffer__UpdateExam_v0__Exam();

      /**
       * The meta object literal for the '<em><b>Update Lecture v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CO_MOD_OFFER___UPDATE_LECTURE_V0__LECTURE = eINSTANCE.getCoModOffer__UpdateLecture_v0__Lecture();

      /**
       * The meta object literal for the '<em><b>Close Module Offer v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CO_MOD_OFFER___CLOSE_MODULE_OFFER_V0 = eINSTANCE.getCoModOffer__CloseModuleOffer_v0();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl <em>Course Management</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCourseManagement()
       * @generated
       */
      EClass COURSE_MANAGEMENT = eINSTANCE.getCourseManagement();

      /**
       * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COURSE_MANAGEMENT__PROGRAMS = eINSTANCE.getCourseManagement_Programs();

      /**
       * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COURSE_MANAGEMENT__SEMESTERS = eINSTANCE.getCourseManagement_Semesters();

      /**
       * The meta object literal for the '<em><b>Module Offers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COURSE_MANAGEMENT__MODULE_OFFERS = eINSTANCE.getCourseManagement_ModuleOffers();

      /**
       * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COURSE_MANAGEMENT__MODULES = eINSTANCE.getCourseManagement_Modules();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.UserDefinedConstraintsImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getUserDefinedConstraints()
       * @generated
       */
      EClass USER_DEFINED_CONSTRAINTS = eINSTANCE.getUserDefinedConstraints();

      /**
       * The meta object literal for the '<em><b>NC Singelton System</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___NC_SINGELTON_SYSTEM__SYSTEMTIMER_SYSTEMTIMER = eINSTANCE
            .getUserDefinedConstraints___NC_SingeltonSystem__SystemTimer_SystemTimer();

      /**
       * The meta object literal for the '<em><b>NC Singelton Current Sem</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___NC_SINGELTON_CURRENT_SEM__SEMESTER_SEMESTER = eINSTANCE
            .getUserDefinedConstraints___NC_SingeltonCurrentSem__Semester_Semester();

      /**
       * The meta object literal for the '<em><b>NC No Two Enrollments With Same ID</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENROLLMENTS_WITH_SAME_ID__ENROLLMENT_ENROLLMENT = eINSTANCE
            .getUserDefinedConstraints___NC_NoTwoEnrollmentsWithSameID__Enrollment_Enrollment();

      /**
       * The meta object literal for the '<em><b>NC No Two Entries With Same ID</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENTRIES_WITH_SAME_ID__GRADEFORMULAR = eINSTANCE
            .getUserDefinedConstraints___NC_NoTwoEntriesWithSameID__GradeFormular();

      /**
       * The meta object literal for the '<em><b>NC only One Record For Module Offer And Exam</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_RECORD_FOR_MODULE_OFFER_AND_EXAM__ENROLLMENT = eINSTANCE
            .getUserDefinedConstraints___NC_onlyOneRecordForModuleOfferAndExam__Enrollment();

      /**
       * The meta object literal for the '<em><b>XNC only One CMO Per Exam</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___XNC_ONLY_ONE_CMO_PER_EXAM__ENROLLMENT = eINSTANCE.getUserDefinedConstraints___XNC_onlyOneCMOPerExam__Enrollment();

      /**
       * The meta object literal for the '<em><b>NC Only One Reg Per Enrollment</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_REG_PER_ENROLLMENT__RECORD_RECORD = eINSTANCE
            .getUserDefinedConstraints___NC_OnlyOneRegPerEnrollment__Record_Record();

      /**
       * The meta object literal for the '<em><b>NC No Competing Bookings</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation USER_DEFINED_CONSTRAINTS___NC_NO_COMPETING_BOOKINGS__ROOM = eINSTANCE.getUserDefinedConstraints___NC_NoCompetingBookings__Room();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.RecordImpl <em>Record</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.RecordImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getRecord()
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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.RoomImpl <em>Room</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.RoomImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getRoom()
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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl <em>Program</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getProgram()
       * @generated
       */
      EClass PROGRAM = eINSTANCE.getProgram();

      /**
       * The meta object literal for the '<em><b>Thesis Modules</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROGRAM__THESIS_MODULES = eINSTANCE.getProgram_ThesisModules();

      /**
       * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PROGRAM__MODULES = eINSTANCE.getProgram_Modules();

      /**
       * The meta object literal for the '<em><b>Req Cp</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PROGRAM__REQ_CP = eINSTANCE.getProgram_ReqCp();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute PROGRAM__ID = eINSTANCE.getProgram_Id();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.CMSImpl <em>CMS</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CMSImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCMS()
       * @generated
       */
      EClass CMS = eINSTANCE.getCMS();

      /**
       * The meta object literal for the '<em><b>Room Management</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CMS__ROOM_MANAGEMENT = eINSTANCE.getCMS_RoomManagement();

      /**
       * The meta object literal for the '<em><b>Course Management</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CMS__COURSE_MANAGEMENT = eINSTANCE.getCMS_CourseManagement();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl <em>Exam</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getExam()
       * @generated
       */
      EClass EXAM = eINSTANCE.getExam();

      /**
       * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXAM__SEMESTER = eINSTANCE.getExam_Semester();

      /**
       * The meta object literal for the '<em><b>Registrations</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXAM__REGISTRATIONS = eINSTANCE.getExam_Registrations();

      /**
       * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXAM__DATE = eINSTANCE.getExam_Date();

      /**
       * The meta object literal for the '<em><b>Grade List</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXAM__GRADE_LIST = eINSTANCE.getExam_GradeList();

      /**
       * The meta object literal for the '<em><b>Reg St</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute EXAM__REG_ST = eINSTANCE.getExam_RegSt();

      /**
       * The meta object literal for the '<em><b>State</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute EXAM__STATE = eINSTANCE.getExam_State();

      /**
       * The meta object literal for the '<em><b>Zet Date v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___ZET_DATE_V0__DATE = eINSTANCE.getExam__ZetDate_v0__Date();

      /**
       * The meta object literal for the '<em><b>Update Date v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___UPDATE_DATE_V0__DATE = eINSTANCE.getExam__UpdateDate_v0__Date();

      /**
       * The meta object literal for the '<em><b>Book Room v1</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___BOOK_ROOM_V1__ROOM_SYSTEMTIMER = eINSTANCE.getExam__BookRoom_v1__Room_SystemTimer();

      /**
       * The meta object literal for the '<em><b>Transfer Result Passed v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___TRANSFER_RESULT_PASSED_V0 = eINSTANCE.getExam__TransferResultPassed_v0();

      /**
       * The meta object literal for the '<em><b>Transfer Result Failed v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___TRANSFER_RESULT_FAILED_V0 = eINSTANCE.getExam__TransferResultFailed_v0();

      /**
       * The meta object literal for the '<em><b>Book Room v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___BOOK_ROOM_V0__ROOM = eINSTANCE.getExam__BookRoom_v0__Room();

      /**
       * The meta object literal for the '<em><b>Upload Results v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___UPLOAD_RESULTS_V0__GRADEFORMULAR = eINSTANCE.getExam__UploadResults_v0__GradeFormular();

      /**
       * The meta object literal for the '<em><b>Close Exam v0</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___CLOSE_EXAM_V0 = eINSTANCE.getExam__CloseExam_v0();

      /**
       * The meta object literal for the '<em><b>Transfer Result Passed v1</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___TRANSFER_RESULT_PASSED_V1__SYSTEMTIMER = eINSTANCE.getExam__TransferResultPassed_v1__SystemTimer();

      /**
       * The meta object literal for the '<em><b>Transfer Result Failed v1</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EXAM___TRANSFER_RESULT_FAILED_V1__SYSTEMTIMER = eINSTANCE.getExam__TransferResultFailed_v1__SystemTimer();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.DegreeImpl <em>Degree</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.DegreeImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getDegree()
       * @generated
       */
      EClass DEGREE = eINSTANCE.getDegree();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.RoomManagementImpl <em>Room Management</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.RoomManagementImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getRoomManagement()
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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl <em>Thesis Record</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesisRecord()
       * @generated
       */
      EClass THESIS_RECORD = eINSTANCE.getThesisRecord();

      /**
       * The meta object literal for the '<em><b>Thesis</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference THESIS_RECORD__THESIS = eINSTANCE.getThesisRecord_Thesis();

      /**
       * The meta object literal for the '<em><b>Thesis Offer</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference THESIS_RECORD__THESIS_OFFER = eINSTANCE.getThesisRecord_ThesisOffer();

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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl <em>Semester</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getSemester()
       * @generated
       */
      EClass SEMESTER = eINSTANCE.getSemester();

      /**
       * The meta object literal for the '<em><b>Lecture Man</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SEMESTER__LECTURE_MAN = eINSTANCE.getSemester_LectureMan();

      /**
       * The meta object literal for the '<em><b>Exams</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SEMESTER__EXAMS = eINSTANCE.getSemester_Exams();

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
       * The meta object literal for the '<em><b>Reg Period Start</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SEMESTER__REG_PERIOD_START = eINSTANCE.getSemester_RegPeriodStart();

      /**
       * The meta object literal for the '<em><b>Reg Period Stop</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SEMESTER__REG_PERIOD_STOP = eINSTANCE.getSemester_RegPeriodStop();

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
       * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SEMESTER__CURRENT = eINSTANCE.getSemester_Current();

      /**
       * The meta object literal for the '<em><b>State</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SEMESTER__STATE = eINSTANCE.getSemester_State();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.BookingImpl <em>Booking</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.BookingImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getBooking()
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
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.SystemTimerImpl <em>System Timer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.SystemTimerImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getSystemTimer()
       * @generated
       */
      EClass SYSTEM_TIMER = eINSTANCE.getSystemTimer();

      /**
       * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SYSTEM_TIMER__CURRENT_TIME = eINSTANCE.getSystemTimer_CurrentTime();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleOfferImpl <em>Thesis Module Offer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleOfferImpl
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getThesisModuleOffer()
       * @generated
       */
      EClass THESIS_MODULE_OFFER = eINSTANCE.getThesisModuleOffer();

      /**
       * The meta object literal for the '<em><b>Thesiss</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference THESIS_MODULE_OFFER__THESISS = eINSTANCE.getThesisModuleOffer_Thesiss();

      /**
       * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute THESIS_MODULE_OFFER__CP = eINSTANCE.getThesisModuleOffer_Cp();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.EX_STATE <em>EX STATE</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.EX_STATE
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEX_STATE()
       * @generated
       */
      EEnum EX_STATE = eINSTANCE.getEX_STATE();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.EN_STATE <em>EN STATE</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.EN_STATE
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getEN_STATE()
       * @generated
       */
      EEnum EN_STATE = eINSTANCE.getEN_STATE();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.TH_STATE <em>TH STATE</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.TH_STATE
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getTH_STATE()
       * @generated
       */
      EEnum TH_STATE = eINSTANCE.getTH_STATE();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.SEM_STATE <em>SEM STATE</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.SEM_STATE
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getSEM_STATE()
       * @generated
       */
      EEnum SEM_STATE = eINSTANCE.getSEM_STATE();

      /**
       * The meta object literal for the '{@link org.moflon.maave.tests.lang.cmsNew.CMO_STATE <em>CMO STATE</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.maave.tests.lang.cmsNew.CMO_STATE
       * @see org.moflon.maave.tests.lang.cmsNew.impl.CmsNewPackageImpl#getCMO_STATE()
       * @generated
       */
      EEnum CMO_STATE = eINSTANCE.getCMO_STATE();

   }

} //CmsNewPackage
