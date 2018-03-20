/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.moflon.maave.tests.lang.cmsNew.Booking;
import org.moflon.maave.tests.lang.cmsNew.CmsNewFactory;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.CourseManagement;
import org.moflon.maave.tests.lang.cmsNew.Date;
import org.moflon.maave.tests.lang.cmsNew.Degree;
import org.moflon.maave.tests.lang.cmsNew.Enrollment;
import org.moflon.maave.tests.lang.cmsNew.Entry;
import org.moflon.maave.tests.lang.cmsNew.Exam;
import org.moflon.maave.tests.lang.cmsNew.GradeFormular;
import org.moflon.maave.tests.lang.cmsNew.Lecture;
import org.moflon.maave.tests.lang.cmsNew.Module;
import org.moflon.maave.tests.lang.cmsNew.Program;
import org.moflon.maave.tests.lang.cmsNew.Record;
import org.moflon.maave.tests.lang.cmsNew.Room;
import org.moflon.maave.tests.lang.cmsNew.RoomManagement;
import org.moflon.maave.tests.lang.cmsNew.Semester;
import org.moflon.maave.tests.lang.cmsNew.SystemTimer;
import org.moflon.maave.tests.lang.cmsNew.Thesis;
import org.moflon.maave.tests.lang.cmsNew.ThesisModule;
import org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer;
import org.moflon.maave.tests.lang.cmsNew.ThesisRecord;
import org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmsNewPackageImpl extends EPackageImpl implements CmsNewPackage
{
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
   private EClass thesisEClass = null;

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
   private EClass lectureEClass = null;

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
   private EClass dateEClass = null;

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
   private EClass thesisModuleEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass coModOfferEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass courseManagementEClass = null;

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
   private EClass programEClass = null;

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
   private EClass degreeEClass = null;

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
   private EClass thesisRecordEClass = null;

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
   private EClass bookingEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass systemTimerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass thesisModuleOfferEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum eX_STATEEEnum = null;

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
   private EEnum tH_STATEEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum seM_STATEEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum cmO_STATEEEnum = null;

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
    * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private CmsNewPackageImpl()
   {
      super(eNS_URI, CmsNewFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link CmsNewPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static CmsNewPackage init()
   {
      if (isInited)
         return (CmsNewPackage) EPackage.Registry.INSTANCE.getEPackage(CmsNewPackage.eNS_URI);

      // Obtain or create and register package
      CmsNewPackageImpl theCmsNewPackage = (CmsNewPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CmsNewPackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new CmsNewPackageImpl());

      isInited = true;

      // Create package meta-data objects
      theCmsNewPackage.createPackageContents();

      // Initialize created meta-data
      theCmsNewPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theCmsNewPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(CmsNewPackage.eNS_URI, theCmsNewPackage);
      return theCmsNewPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getGradeFormular()
   {
      return gradeFormularEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getGradeFormular_Records()
   {
      return (EReference) gradeFormularEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getThesis()
   {
      return thesisEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getThesis_Record()
   {
      return (EReference) thesisEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getThesis_Grade()
   {
      return (EAttribute) thesisEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getThesis_State()
   {
      return (EAttribute) thesisEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getThesis__EnterGrade_v0()
   {
      return thesisEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEnrollment()
   {
      return enrollmentEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEnrollment_Records()
   {
      return (EReference) enrollmentEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEnrollment_Program()
   {
      return (EReference) enrollmentEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEnrollment_Degree()
   {
      return (EReference) enrollmentEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEnrollment_ThesisRecord()
   {
      return (EReference) enrollmentEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEnrollment_Cp()
   {
      return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEnrollment_State()
   {
      return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEnrollment_RegCp()
   {
      return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEnrollment_StudId()
   {
      return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEnrollment_Enrolled()
   {
      return (EAttribute) enrollmentEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__RegForExam_v1__SystemTimer_Exam()
   {
      return enrollmentEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__UnregFromExam_v1__Exam_SystemTimer()
   {
      return enrollmentEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__RegForExam_v0__Exam()
   {
      return enrollmentEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__RegForModule_v0__CoModOffer()
   {
      return enrollmentEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__UnregFromExam_v0__Exam()
   {
      return enrollmentEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__RegForThesisModuleOffer_v0__ThesisModuleOffer()
   {
      return enrollmentEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__RegForThesis_v0()
   {
      return enrollmentEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEnrollment__ObtainDegree_v0()
   {
      return enrollmentEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getLecture()
   {
      return lectureEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLecture_Semester()
   {
      return (EReference) lectureEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getLecture_Date()
   {
      return (EReference) lectureEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLecture_RegSt()
   {
      return (EAttribute) lectureEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getModule()
   {
      return moduleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getModule_LecMan()
   {
      return (EReference) moduleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getModule_AllOffers()
   {
      return (EReference) moduleEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getModule_Current()
   {
      return (EReference) moduleEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getModule_Id()
   {
      return (EAttribute) moduleEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getModule_Version()
   {
      return (EAttribute) moduleEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDate()
   {
      return dateEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDate_Location()
   {
      return (EReference) dateEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDate_Begin()
   {
      return (EAttribute) dateEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDate_Duration()
   {
      return (EAttribute) dateEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEntry()
   {
      return entryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEntry_StudentId()
   {
      return (EAttribute) entryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEntry_Grade()
   {
      return (EAttribute) entryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getThesisModule()
   {
      return thesisModuleEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getThesisModule_ActThesModOffer()
   {
      return (EReference) thesisModuleEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getThesisModule_Id()
   {
      return (EAttribute) thesisModuleEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCoModOffer()
   {
      return coModOfferEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCoModOffer_LecMan()
   {
      return (EReference) coModOfferEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCoModOffer_Exams()
   {
      return (EReference) coModOfferEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCoModOffer_Lectures()
   {
      return (EReference) coModOfferEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCoModOffer_Cp()
   {
      return (EAttribute) coModOfferEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getCoModOffer_State()
   {
      return (EAttribute) coModOfferEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCoModOffer__UpdateExam_v1__SystemTimer_Exam()
   {
      return coModOfferEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCoModOffer__SetLecture_v0__Lecture()
   {
      return coModOfferEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCoModOffer__SetExam_v0__Exam()
   {
      return coModOfferEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCoModOffer__Reset_v0()
   {
      return coModOfferEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCoModOffer__UpdateExam_v0__Exam()
   {
      return coModOfferEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCoModOffer__UpdateLecture_v0__Lecture()
   {
      return coModOfferEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCoModOffer__CloseModuleOffer_v0()
   {
      return coModOfferEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCourseManagement()
   {
      return courseManagementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCourseManagement_Programs()
   {
      return (EReference) courseManagementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCourseManagement_Semesters()
   {
      return (EReference) courseManagementEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCourseManagement_ModuleOffers()
   {
      return (EReference) courseManagementEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCourseManagement_Modules()
   {
      return (EReference) courseManagementEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getUserDefinedConstraints()
   {
      return userDefinedConstraintsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___NC_SingeltonSystem__SystemTimer_SystemTimer()
   {
      return userDefinedConstraintsEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___NC_SingeltonCurrentSem__Semester_Semester()
   {
      return userDefinedConstraintsEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___NC_NoTwoEnrollmentsWithSameID__Enrollment_Enrollment()
   {
      return userDefinedConstraintsEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___NC_NoTwoEntriesWithSameID__GradeFormular()
   {
      return userDefinedConstraintsEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___NC_onlyOneRecordForModuleOfferAndExam__Enrollment()
   {
      return userDefinedConstraintsEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___XNC_onlyOneCMOPerExam__Enrollment()
   {
      return userDefinedConstraintsEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___NC_OnlyOneRegPerEnrollment__Record_Record()
   {
      return userDefinedConstraintsEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getUserDefinedConstraints___NC_NoCompetingBookings__Room()
   {
      return userDefinedConstraintsEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRecord()
   {
      return recordEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRecord_Enrollment()
   {
      return (EReference) recordEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRecord_Exam()
   {
      return (EReference) recordEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRecord_ModuleOffer()
   {
      return (EReference) recordEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRecord_Grade()
   {
      return (EAttribute) recordEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRecord_Tries()
   {
      return (EAttribute) recordEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRoom()
   {
      return roomEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRoom_Reservations()
   {
      return (EReference) roomEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getRoom_Capacity()
   {
      return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getProgram()
   {
      return programEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProgram_ThesisModules()
   {
      return (EReference) programEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getProgram_Modules()
   {
      return (EReference) programEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProgram_ReqCp()
   {
      return (EAttribute) programEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getProgram_Id()
   {
      return (EAttribute) programEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCMS()
   {
      return cmsEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCMS_RoomManagement()
   {
      return (EReference) cmsEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCMS_CourseManagement()
   {
      return (EReference) cmsEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getExam()
   {
      return examEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExam_Semester()
   {
      return (EReference) examEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExam_Registrations()
   {
      return (EReference) examEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExam_Date()
   {
      return (EReference) examEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getExam_GradeList()
   {
      return (EReference) examEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getExam_RegSt()
   {
      return (EAttribute) examEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getExam_State()
   {
      return (EAttribute) examEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__ZetDate_v0__Date()
   {
      return examEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__UpdateDate_v0__Date()
   {
      return examEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__BookRoom_v1__Room_SystemTimer()
   {
      return examEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__TransferResultPassed_v0()
   {
      return examEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__TransferResultFailed_v0()
   {
      return examEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__BookRoom_v0__Room()
   {
      return examEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__UploadResults_v0__GradeFormular()
   {
      return examEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__CloseExam_v0()
   {
      return examEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__TransferResultPassed_v1__SystemTimer()
   {
      return examEClass.getEOperations().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getExam__TransferResultFailed_v1__SystemTimer()
   {
      return examEClass.getEOperations().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDegree()
   {
      return degreeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRoomManagement()
   {
      return roomManagementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRoomManagement_Rooms()
   {
      return (EReference) roomManagementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getThesisRecord()
   {
      return thesisRecordEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getThesisRecord_Thesis()
   {
      return (EReference) thesisRecordEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getThesisRecord_ThesisOffer()
   {
      return (EReference) thesisRecordEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getThesisRecord_Grade()
   {
      return (EAttribute) thesisRecordEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getThesisRecord_Tries()
   {
      return (EAttribute) thesisRecordEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSemester()
   {
      return semesterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSemester_LectureMan()
   {
      return (EReference) semesterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSemester_Exams()
   {
      return (EReference) semesterEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSemester_Previous()
   {
      return (EReference) semesterEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSemester_Next()
   {
      return (EReference) semesterEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSemester_OfferedLectures()
   {
      return (EReference) semesterEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSemester_RegPeriodStart()
   {
      return (EAttribute) semesterEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSemester_RegPeriodStop()
   {
      return (EAttribute) semesterEClass.getEStructuralFeatures().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSemester_StartDate()
   {
      return (EAttribute) semesterEClass.getEStructuralFeatures().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSemester_EndDate()
   {
      return (EAttribute) semesterEClass.getEStructuralFeatures().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSemester_Current()
   {
      return (EAttribute) semesterEClass.getEStructuralFeatures().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSemester_State()
   {
      return (EAttribute) semesterEClass.getEStructuralFeatures().get(10);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getBooking()
   {
      return bookingEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getBooking_Room()
   {
      return (EReference) bookingEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getBooking_Begin()
   {
      return (EAttribute) bookingEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getBooking_End()
   {
      return (EAttribute) bookingEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSystemTimer()
   {
      return systemTimerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSystemTimer_CurrentTime()
   {
      return (EAttribute) systemTimerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getThesisModuleOffer()
   {
      return thesisModuleOfferEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getThesisModuleOffer_Thesiss()
   {
      return (EReference) thesisModuleOfferEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getThesisModuleOffer_Cp()
   {
      return (EAttribute) thesisModuleOfferEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getEX_STATE()
   {
      return eX_STATEEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getEN_STATE()
   {
      return eN_STATEEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getTH_STATE()
   {
      return tH_STATEEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getSEM_STATE()
   {
      return seM_STATEEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getCMO_STATE()
   {
      return cmO_STATEEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CmsNewFactory getCmsNewFactory()
   {
      return (CmsNewFactory) getEFactoryInstance();
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
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      gradeFormularEClass = createEClass(GRADE_FORMULAR);
      createEReference(gradeFormularEClass, GRADE_FORMULAR__RECORDS);

      thesisEClass = createEClass(THESIS);
      createEReference(thesisEClass, THESIS__RECORD);
      createEAttribute(thesisEClass, THESIS__GRADE);
      createEAttribute(thesisEClass, THESIS__STATE);
      createEOperation(thesisEClass, THESIS___ENTER_GRADE_V0);

      enrollmentEClass = createEClass(ENROLLMENT);
      createEReference(enrollmentEClass, ENROLLMENT__RECORDS);
      createEReference(enrollmentEClass, ENROLLMENT__PROGRAM);
      createEReference(enrollmentEClass, ENROLLMENT__DEGREE);
      createEReference(enrollmentEClass, ENROLLMENT__THESIS_RECORD);
      createEAttribute(enrollmentEClass, ENROLLMENT__CP);
      createEAttribute(enrollmentEClass, ENROLLMENT__STATE);
      createEAttribute(enrollmentEClass, ENROLLMENT__REG_CP);
      createEAttribute(enrollmentEClass, ENROLLMENT__STUD_ID);
      createEAttribute(enrollmentEClass, ENROLLMENT__ENROLLED);
      createEOperation(enrollmentEClass, ENROLLMENT___REG_FOR_EXAM_V1__SYSTEMTIMER_EXAM);
      createEOperation(enrollmentEClass, ENROLLMENT___UNREG_FROM_EXAM_V1__EXAM_SYSTEMTIMER);
      createEOperation(enrollmentEClass, ENROLLMENT___REG_FOR_EXAM_V0__EXAM);
      createEOperation(enrollmentEClass, ENROLLMENT___REG_FOR_MODULE_V0__COMODOFFER);
      createEOperation(enrollmentEClass, ENROLLMENT___UNREG_FROM_EXAM_V0__EXAM);
      createEOperation(enrollmentEClass, ENROLLMENT___REG_FOR_THESIS_MODULE_OFFER_V0__THESISMODULEOFFER);
      createEOperation(enrollmentEClass, ENROLLMENT___REG_FOR_THESIS_V0);
      createEOperation(enrollmentEClass, ENROLLMENT___OBTAIN_DEGREE_V0);

      lectureEClass = createEClass(LECTURE);
      createEReference(lectureEClass, LECTURE__SEMESTER);
      createEReference(lectureEClass, LECTURE__DATE);
      createEAttribute(lectureEClass, LECTURE__REG_ST);

      moduleEClass = createEClass(MODULE);
      createEReference(moduleEClass, MODULE__LEC_MAN);
      createEReference(moduleEClass, MODULE__ALL_OFFERS);
      createEReference(moduleEClass, MODULE__CURRENT);
      createEAttribute(moduleEClass, MODULE__ID);
      createEAttribute(moduleEClass, MODULE__VERSION);

      dateEClass = createEClass(DATE);
      createEReference(dateEClass, DATE__LOCATION);
      createEAttribute(dateEClass, DATE__BEGIN);
      createEAttribute(dateEClass, DATE__DURATION);

      entryEClass = createEClass(ENTRY);
      createEAttribute(entryEClass, ENTRY__STUDENT_ID);
      createEAttribute(entryEClass, ENTRY__GRADE);

      thesisModuleEClass = createEClass(THESIS_MODULE);
      createEReference(thesisModuleEClass, THESIS_MODULE__ACT_THES_MOD_OFFER);
      createEAttribute(thesisModuleEClass, THESIS_MODULE__ID);

      coModOfferEClass = createEClass(CO_MOD_OFFER);
      createEReference(coModOfferEClass, CO_MOD_OFFER__LEC_MAN);
      createEReference(coModOfferEClass, CO_MOD_OFFER__EXAMS);
      createEReference(coModOfferEClass, CO_MOD_OFFER__LECTURES);
      createEAttribute(coModOfferEClass, CO_MOD_OFFER__CP);
      createEAttribute(coModOfferEClass, CO_MOD_OFFER__STATE);
      createEOperation(coModOfferEClass, CO_MOD_OFFER___UPDATE_EXAM_V1__SYSTEMTIMER_EXAM);
      createEOperation(coModOfferEClass, CO_MOD_OFFER___SET_LECTURE_V0__LECTURE);
      createEOperation(coModOfferEClass, CO_MOD_OFFER___SET_EXAM_V0__EXAM);
      createEOperation(coModOfferEClass, CO_MOD_OFFER___RESET_V0);
      createEOperation(coModOfferEClass, CO_MOD_OFFER___UPDATE_EXAM_V0__EXAM);
      createEOperation(coModOfferEClass, CO_MOD_OFFER___UPDATE_LECTURE_V0__LECTURE);
      createEOperation(coModOfferEClass, CO_MOD_OFFER___CLOSE_MODULE_OFFER_V0);

      courseManagementEClass = createEClass(COURSE_MANAGEMENT);
      createEReference(courseManagementEClass, COURSE_MANAGEMENT__PROGRAMS);
      createEReference(courseManagementEClass, COURSE_MANAGEMENT__SEMESTERS);
      createEReference(courseManagementEClass, COURSE_MANAGEMENT__MODULE_OFFERS);
      createEReference(courseManagementEClass, COURSE_MANAGEMENT__MODULES);

      userDefinedConstraintsEClass = createEClass(USER_DEFINED_CONSTRAINTS);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_SINGELTON_SYSTEM__SYSTEMTIMER_SYSTEMTIMER);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_SINGELTON_CURRENT_SEM__SEMESTER_SEMESTER);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENROLLMENTS_WITH_SAME_ID__ENROLLMENT_ENROLLMENT);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENTRIES_WITH_SAME_ID__GRADEFORMULAR);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_RECORD_FOR_MODULE_OFFER_AND_EXAM__ENROLLMENT);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___XNC_ONLY_ONE_CMO_PER_EXAM__ENROLLMENT);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_REG_PER_ENROLLMENT__RECORD_RECORD);
      createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_NO_COMPETING_BOOKINGS__ROOM);

      recordEClass = createEClass(RECORD);
      createEReference(recordEClass, RECORD__ENROLLMENT);
      createEReference(recordEClass, RECORD__EXAM);
      createEReference(recordEClass, RECORD__MODULE_OFFER);
      createEAttribute(recordEClass, RECORD__GRADE);
      createEAttribute(recordEClass, RECORD__TRIES);

      roomEClass = createEClass(ROOM);
      createEReference(roomEClass, ROOM__RESERVATIONS);
      createEAttribute(roomEClass, ROOM__CAPACITY);

      programEClass = createEClass(PROGRAM);
      createEReference(programEClass, PROGRAM__THESIS_MODULES);
      createEReference(programEClass, PROGRAM__MODULES);
      createEAttribute(programEClass, PROGRAM__REQ_CP);
      createEAttribute(programEClass, PROGRAM__ID);

      cmsEClass = createEClass(CMS);
      createEReference(cmsEClass, CMS__ROOM_MANAGEMENT);
      createEReference(cmsEClass, CMS__COURSE_MANAGEMENT);

      examEClass = createEClass(EXAM);
      createEReference(examEClass, EXAM__SEMESTER);
      createEReference(examEClass, EXAM__REGISTRATIONS);
      createEReference(examEClass, EXAM__DATE);
      createEReference(examEClass, EXAM__GRADE_LIST);
      createEAttribute(examEClass, EXAM__REG_ST);
      createEAttribute(examEClass, EXAM__STATE);
      createEOperation(examEClass, EXAM___ZET_DATE_V0__DATE);
      createEOperation(examEClass, EXAM___UPDATE_DATE_V0__DATE);
      createEOperation(examEClass, EXAM___BOOK_ROOM_V1__ROOM_SYSTEMTIMER);
      createEOperation(examEClass, EXAM___TRANSFER_RESULT_PASSED_V0);
      createEOperation(examEClass, EXAM___TRANSFER_RESULT_FAILED_V0);
      createEOperation(examEClass, EXAM___BOOK_ROOM_V0__ROOM);
      createEOperation(examEClass, EXAM___UPLOAD_RESULTS_V0__GRADEFORMULAR);
      createEOperation(examEClass, EXAM___CLOSE_EXAM_V0);
      createEOperation(examEClass, EXAM___TRANSFER_RESULT_PASSED_V1__SYSTEMTIMER);
      createEOperation(examEClass, EXAM___TRANSFER_RESULT_FAILED_V1__SYSTEMTIMER);

      degreeEClass = createEClass(DEGREE);

      roomManagementEClass = createEClass(ROOM_MANAGEMENT);
      createEReference(roomManagementEClass, ROOM_MANAGEMENT__ROOMS);

      thesisRecordEClass = createEClass(THESIS_RECORD);
      createEReference(thesisRecordEClass, THESIS_RECORD__THESIS);
      createEReference(thesisRecordEClass, THESIS_RECORD__THESIS_OFFER);
      createEAttribute(thesisRecordEClass, THESIS_RECORD__GRADE);
      createEAttribute(thesisRecordEClass, THESIS_RECORD__TRIES);

      semesterEClass = createEClass(SEMESTER);
      createEReference(semesterEClass, SEMESTER__LECTURE_MAN);
      createEReference(semesterEClass, SEMESTER__EXAMS);
      createEReference(semesterEClass, SEMESTER__PREVIOUS);
      createEReference(semesterEClass, SEMESTER__NEXT);
      createEReference(semesterEClass, SEMESTER__OFFERED_LECTURES);
      createEAttribute(semesterEClass, SEMESTER__REG_PERIOD_START);
      createEAttribute(semesterEClass, SEMESTER__REG_PERIOD_STOP);
      createEAttribute(semesterEClass, SEMESTER__START_DATE);
      createEAttribute(semesterEClass, SEMESTER__END_DATE);
      createEAttribute(semesterEClass, SEMESTER__CURRENT);
      createEAttribute(semesterEClass, SEMESTER__STATE);

      bookingEClass = createEClass(BOOKING);
      createEReference(bookingEClass, BOOKING__ROOM);
      createEAttribute(bookingEClass, BOOKING__BEGIN);
      createEAttribute(bookingEClass, BOOKING__END);

      systemTimerEClass = createEClass(SYSTEM_TIMER);
      createEAttribute(systemTimerEClass, SYSTEM_TIMER__CURRENT_TIME);

      thesisModuleOfferEClass = createEClass(THESIS_MODULE_OFFER);
      createEReference(thesisModuleOfferEClass, THESIS_MODULE_OFFER__THESISS);
      createEAttribute(thesisModuleOfferEClass, THESIS_MODULE_OFFER__CP);

      // Create enums
      eX_STATEEEnum = createEEnum(EX_STATE);
      eN_STATEEEnum = createEEnum(EN_STATE);
      tH_STATEEEnum = createEEnum(TH_STATE);
      seM_STATEEEnum = createEEnum(SEM_STATE);
      cmO_STATEEEnum = createEEnum(CMO_STATE);
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
   public void initializePackageContents()
   {
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

      // Initialize classes, features, and operations; add parameters
      initEClass(gradeFormularEClass, GradeFormular.class, "GradeFormular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getGradeFormular_Records(), this.getEntry(), null, "records", null, 0, -1, GradeFormular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(thesisEClass, Thesis.class, "Thesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getThesis_Record(), this.getThesisRecord(), this.getThesisRecord_Thesis(), "record", null, 0, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getThesis_Grade(), ecorePackage.getEInt(), "grade", null, 0, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getThesis_State(), this.getTH_STATE(), "state", null, 0, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEOperation(getThesis__EnterGrade_v0(), null, "enterGrade_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(enrollmentEClass, Enrollment.class, "Enrollment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEnrollment_Records(), this.getRecord(), this.getRecord_Enrollment(), "records", null, 0, -1, Enrollment.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEnrollment_Program(), this.getProgram(), null, "program", null, 0, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEnrollment_Degree(), this.getDegree(), null, "degree", null, 0, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEnrollment_ThesisRecord(), this.getThesisRecord(), null, "thesisRecord", null, 0, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEnrollment_Cp(), ecorePackage.getEInt(), "cp", null, 1, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getEnrollment_State(), this.getEN_STATE(), "state", null, 1, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getEnrollment_RegCp(), ecorePackage.getEInt(), "regCp", null, 1, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getEnrollment_StudId(), ecorePackage.getEInt(), "studId", null, 0, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getEnrollment_Enrolled(), ecorePackage.getEBoolean(), "enrolled", null, 0, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      EOperation op = initEOperation(getEnrollment__RegForExam_v1__SystemTimer_Exam(), null, "regForExam_v1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "st", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExam(), "ex", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getEnrollment__UnregFromExam_v1__Exam_SystemTimer(), null, "unregFromExam_v1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExam(), "ex", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "system", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getEnrollment__RegForExam_v0__Exam(), null, "regForExam_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExam(), "ex", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getEnrollment__RegForModule_v0__CoModOffer(), null, "regForModule_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getCoModOffer(), "mo", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getEnrollment__UnregFromExam_v0__Exam(), null, "unregFromExam_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExam(), "ex", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getEnrollment__RegForThesisModuleOffer_v0__ThesisModuleOffer(), null, "regForThesisModuleOffer_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getThesisModuleOffer(), "thModOffer", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getEnrollment__RegForThesis_v0(), null, "regForThesis_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getEnrollment__ObtainDegree_v0(), null, "obtainDegree_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(lectureEClass, Lecture.class, "Lecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getLecture_Semester(), this.getSemester(), this.getSemester_OfferedLectures(), "semester", null, 0, 1, Lecture.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getLecture_Date(), this.getDate(), null, "date", null, 0, -1, Lecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getLecture_RegSt(), ecorePackage.getEInt(), "regSt", null, 0, 1, Lecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getModule_LecMan(), this.getCourseManagement(), this.getCourseManagement_Modules(), "lecMan", null, 0, 1, Module.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getModule_AllOffers(), this.getCoModOffer(), null, "allOffers", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getModule_Current(), this.getCoModOffer(), null, "current", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getModule_Id(), ecorePackage.getELong(), "id", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getModule_Version(), ecorePackage.getEInt(), "version", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDate_Location(), this.getBooking(), null, "location", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getDate_Begin(), ecorePackage.getELong(), "begin", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getDate_Duration(), ecorePackage.getELong(), "duration", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEntry_StudentId(), ecorePackage.getEInt(), "studentId", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getEntry_Grade(), ecorePackage.getEInt(), "grade", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(thesisModuleEClass, ThesisModule.class, "ThesisModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getThesisModule_ActThesModOffer(), this.getThesisModuleOffer(), null, "actThesModOffer", null, 0, 1, ThesisModule.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getThesisModule_Id(), ecorePackage.getELong(), "id", null, 0, 1, ThesisModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(coModOfferEClass, CoModOffer.class, "CoModOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCoModOffer_LecMan(), this.getCourseManagement(), this.getCourseManagement_ModuleOffers(), "lecMan", null, 0, 1, CoModOffer.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCoModOffer_Exams(), this.getExam(), null, "exams", null, 0, 1, CoModOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCoModOffer_Lectures(), this.getLecture(), null, "lectures", null, 0, 1, CoModOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getCoModOffer_Cp(), ecorePackage.getEInt(), "cp", null, 1, 1, CoModOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getCoModOffer_State(), this.getCMO_STATE(), "state", null, 0, 1, CoModOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getCoModOffer__UpdateExam_v1__SystemTimer_Exam(), null, "updateExam_v1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "system", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExam(), "ex", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getCoModOffer__SetLecture_v0__Lecture(), null, "setLecture_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getLecture(), "lect", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getCoModOffer__SetExam_v0__Exam(), null, "setExam_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExam(), "ex", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getCoModOffer__Reset_v0(), null, "reset_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getCoModOffer__UpdateExam_v0__Exam(), null, "updateExam_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getExam(), "ex", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getCoModOffer__UpdateLecture_v0__Lecture(), null, "updateLecture_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getLecture(), "lec", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getCoModOffer__CloseModuleOffer_v0(), null, "closeModuleOffer_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(courseManagementEClass, CourseManagement.class, "CourseManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCourseManagement_Programs(), this.getProgram(), null, "programs", null, 0, -1, CourseManagement.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCourseManagement_Semesters(), this.getSemester(), this.getSemester_LectureMan(), "semesters", null, 0, -1, CourseManagement.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCourseManagement_ModuleOffers(), this.getCoModOffer(), this.getCoModOffer_LecMan(), "moduleOffers", null, 0, -1, CourseManagement.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCourseManagement_Modules(), this.getModule(), this.getModule_LecMan(), "modules", null, 0, -1, CourseManagement.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(userDefinedConstraintsEClass, UserDefinedConstraints.class, "UserDefinedConstraints", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getUserDefinedConstraints___NC_SingeltonSystem__SystemTimer_SystemTimer(), null, "_NC_SingeltonSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "system1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "system2", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUserDefinedConstraints___NC_SingeltonCurrentSem__Semester_Semester(), null, "_NC_SingeltonCurrentSem", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, this.getSemester(), "sem2", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSemester(), "sem1", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUserDefinedConstraints___NC_NoTwoEnrollmentsWithSameID__Enrollment_Enrollment(), null, "_NC_NoTwoEnrollmentsWithSameID", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getEnrollment(), "en1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getEnrollment(), "en2", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUserDefinedConstraints___NC_NoTwoEntriesWithSameID__GradeFormular(), null, "_NC_NoTwoEntriesWithSameID", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, this.getGradeFormular(), "gf", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUserDefinedConstraints___NC_onlyOneRecordForModuleOfferAndExam__Enrollment(), null, "_NC_onlyOneRecordForModuleOfferAndExam", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getEnrollment(), "en", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUserDefinedConstraints___XNC_onlyOneCMOPerExam__Enrollment(), null, "_XNC_onlyOneCMOPerExam", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getEnrollment(), "en", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUserDefinedConstraints___NC_OnlyOneRegPerEnrollment__Record_Record(), null, "_NC_OnlyOneRegPerEnrollment", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, this.getRecord(), "rec2", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getRecord(), "rec1", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getUserDefinedConstraints___NC_NoCompetingBookings__Room(), null, "_NC_NoCompetingBookings", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getRoom(), "room", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRecord_Enrollment(), this.getEnrollment(), this.getEnrollment_Records(), "enrollment", null, 0, 1, Record.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getRecord_Exam(), this.getExam(), this.getExam_Registrations(), "exam", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getRecord_ModuleOffer(), this.getCoModOffer(), null, "moduleOffer", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getRecord_Grade(), ecorePackage.getEInt(), "grade", null, 1, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getRecord_Tries(), ecorePackage.getEInt(), "tries", null, 1, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRoom_Reservations(), this.getBooking(), this.getBooking_Room(), "reservations", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getRoom_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getProgram_ThesisModules(), this.getThesisModule(), null, "thesisModules", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getProgram_Modules(), this.getModule(), null, "modules", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProgram_ReqCp(), ecorePackage.getEInt(), "reqCp", null, 1, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getProgram_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(cmsEClass, org.moflon.maave.tests.lang.cmsNew.CMS.class, "CMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCMS_RoomManagement(), this.getRoomManagement(), null, "roomManagement", null, 1, 1, org.moflon.maave.tests.lang.cmsNew.CMS.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCMS_CourseManagement(), this.getCourseManagement(), null, "courseManagement", null, 1, 1, org.moflon.maave.tests.lang.cmsNew.CMS.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExam_Semester(), this.getSemester(), this.getSemester_Exams(), "semester", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getExam_Registrations(), this.getRecord(), this.getRecord_Exam(), "registrations", null, 0, -1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getExam_Date(), this.getDate(), null, "date", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getExam_GradeList(), this.getGradeFormular(), null, "gradeList", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getExam_RegSt(), ecorePackage.getEInt(), "regSt", null, 1, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getExam_State(), this.getEX_STATE(), "state", null, 1, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getExam__ZetDate_v0__Date(), null, "zetDate_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getDate(), "da", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExam__UpdateDate_v0__Date(), null, "updateDate_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getDate(), "da", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExam__BookRoom_v1__Room_SystemTimer(), null, "bookRoom_v1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getRoom(), "ro", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "system", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getExam__TransferResultPassed_v0(), null, "transferResultPassed_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getExam__TransferResultFailed_v0(), null, "transferResultFailed_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExam__BookRoom_v0__Room(), null, "bookRoom_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getRoom(), "ro", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExam__UploadResults_v0__GradeFormular(), null, "uploadResults_v0", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getGradeFormular(), "gF", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEOperation(getExam__CloseExam_v0(), null, "closeExam_v0", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExam__TransferResultPassed_v1__SystemTimer(), null, "transferResultPassed_v1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "system", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getExam__TransferResultFailed_v1__SystemTimer(), null, "transferResultFailed_v1", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSystemTimer(), "system", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(degreeEClass, Degree.class, "Degree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(roomManagementEClass, RoomManagement.class, "RoomManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRoomManagement_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, RoomManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(thesisRecordEClass, ThesisRecord.class, "ThesisRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getThesisRecord_Thesis(), this.getThesis(), this.getThesis_Record(), "thesis", null, 0, 1, ThesisRecord.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getThesisRecord_ThesisOffer(), this.getThesisModuleOffer(), null, "thesisOffer", null, 0, 1, ThesisRecord.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getThesisRecord_Grade(), ecorePackage.getEInt(), "grade", null, 1, 1, ThesisRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getThesisRecord_Tries(), ecorePackage.getEInt(), "tries", null, 1, 1, ThesisRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSemester_LectureMan(), this.getCourseManagement(), this.getCourseManagement_Semesters(), "lectureMan", null, 0, 1, Semester.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSemester_Exams(), this.getExam(), this.getExam_Semester(), "exams", null, 0, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSemester_Previous(), this.getSemester(), this.getSemester_Next(), "previous", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSemester_Next(), this.getSemester(), this.getSemester_Previous(), "next", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSemester_OfferedLectures(), this.getLecture(), this.getLecture_Semester(), "offeredLectures", null, 0, -1, Semester.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getSemester_RegPeriodStart(), ecorePackage.getELong(), "regPeriodStart", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getSemester_RegPeriodStop(), ecorePackage.getELong(), "regPeriodStop", null, 1, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getSemester_StartDate(), ecorePackage.getELong(), "startDate", null, 1, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getSemester_EndDate(), ecorePackage.getELong(), "endDate", null, 1, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getSemester_Current(), ecorePackage.getEBoolean(), "current", null, 1, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getSemester_State(), this.getSEM_STATE(), "state", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getBooking_Room(), this.getRoom(), this.getRoom_Reservations(), "room", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getBooking_Begin(), ecorePackage.getELong(), "begin", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getBooking_End(), ecorePackage.getELong(), "end", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(systemTimerEClass, SystemTimer.class, "SystemTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getSystemTimer_CurrentTime(), ecorePackage.getELong(), "currentTime", null, 0, 1, SystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(thesisModuleOfferEClass, ThesisModuleOffer.class, "ThesisModuleOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getThesisModuleOffer_Thesiss(), this.getThesis(), null, "thesiss", null, 0, -1, ThesisModuleOffer.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getThesisModuleOffer_Cp(), ecorePackage.getEInt(), "cp", null, 0, 1, ThesisModuleOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(eX_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EX_STATE.class, "EX_STATE");
      addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EX_STATE.EX_PLANNING);
      addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EX_STATE.EX_CREATED);
      addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EX_STATE.EX_READY);
      addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EX_STATE.EX_FINALIZING);
      addEEnumLiteral(eX_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EX_STATE.EX_CLOSED);

      initEEnum(eN_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EN_STATE.class, "EN_STATE");
      addEEnumLiteral(eN_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EN_STATE.EN_STUDY);
      addEEnumLiteral(eN_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EN_STATE.EN_WRITE_THESIS);
      addEEnumLiteral(eN_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.EN_STATE.EN_STOP);

      initEEnum(tH_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.TH_STATE.class, "TH_STATE");
      addEEnumLiteral(tH_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.TH_STATE.TH_CREATED);
      addEEnumLiteral(tH_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.TH_STATE.TH_IN_PROGRESS);
      addEEnumLiteral(tH_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.TH_STATE.TH_FINISHED);
      addEEnumLiteral(tH_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.TH_STATE.TH_STOP);

      initEEnum(seM_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.SEM_STATE.class, "SEM_STATE");
      addEEnumLiteral(seM_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.SEM_STATE.SEM_CREATED);
      addEEnumLiteral(seM_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.SEM_STATE.SEM_STARTED);
      addEEnumLiteral(seM_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.SEM_STATE.SEM_REG_OPEN);
      addEEnumLiteral(seM_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.SEM_STATE.SEM_REG_CLOSED);
      addEEnumLiteral(seM_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.SEM_STATE.SEM_STOP);

      initEEnum(cmO_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.CMO_STATE.class, "CMO_STATE");
      addEEnumLiteral(cmO_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.CMO_STATE.CMO_CREATED);
      addEEnumLiteral(cmO_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.CMO_STATE.CMO_LECT_SET);
      addEEnumLiteral(cmO_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.CMO_STATE.CMO_READY);
      addEEnumLiteral(cmO_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.CMO_STATE.CMO_RESETTED);
      addEEnumLiteral(cmO_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.CMO_STATE.CMO_LECT_UPDATED);
      addEEnumLiteral(cmO_STATEEEnum, org.moflon.maave.tests.lang.cmsNew.CMO_STATE.CMO_CLOSED);

      // Create resource
      createResource(eNS_URI);
   }

} //CmsNewPackageImpl
