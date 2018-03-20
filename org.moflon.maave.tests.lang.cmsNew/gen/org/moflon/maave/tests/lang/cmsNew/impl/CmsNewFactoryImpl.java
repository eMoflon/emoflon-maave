/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.moflon.maave.tests.lang.cmsNew.Booking;
import org.moflon.maave.tests.lang.cmsNew.CMO_STATE;
import org.moflon.maave.tests.lang.cmsNew.CMS;
import org.moflon.maave.tests.lang.cmsNew.CmsNewFactory;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.CourseManagement;
import org.moflon.maave.tests.lang.cmsNew.Date;
import org.moflon.maave.tests.lang.cmsNew.Degree;
import org.moflon.maave.tests.lang.cmsNew.EN_STATE;
import org.moflon.maave.tests.lang.cmsNew.EX_STATE;
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
import org.moflon.maave.tests.lang.cmsNew.SEM_STATE;
import org.moflon.maave.tests.lang.cmsNew.Semester;
import org.moflon.maave.tests.lang.cmsNew.SystemTimer;
import org.moflon.maave.tests.lang.cmsNew.TH_STATE;
import org.moflon.maave.tests.lang.cmsNew.Thesis;
import org.moflon.maave.tests.lang.cmsNew.ThesisModule;
import org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer;
import org.moflon.maave.tests.lang.cmsNew.ThesisRecord;
import org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmsNewFactoryImpl extends EFactoryImpl implements CmsNewFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static CmsNewFactory init()
   {
      try
      {
         CmsNewFactory theCmsNewFactory = (CmsNewFactory) EPackage.Registry.INSTANCE.getEFactory(CmsNewPackage.eNS_URI);
         if (theCmsNewFactory != null)
         {
            return theCmsNewFactory;
         }
      } catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new CmsNewFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CmsNewFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
      case CmsNewPackage.GRADE_FORMULAR:
         return createGradeFormular();
      case CmsNewPackage.THESIS:
         return createThesis();
      case CmsNewPackage.ENROLLMENT:
         return createEnrollment();
      case CmsNewPackage.LECTURE:
         return createLecture();
      case CmsNewPackage.MODULE:
         return createModule();
      case CmsNewPackage.DATE:
         return createDate();
      case CmsNewPackage.ENTRY:
         return createEntry();
      case CmsNewPackage.THESIS_MODULE:
         return createThesisModule();
      case CmsNewPackage.CO_MOD_OFFER:
         return createCoModOffer();
      case CmsNewPackage.COURSE_MANAGEMENT:
         return createCourseManagement();
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS:
         return createUserDefinedConstraints();
      case CmsNewPackage.RECORD:
         return createRecord();
      case CmsNewPackage.ROOM:
         return createRoom();
      case CmsNewPackage.PROGRAM:
         return createProgram();
      case CmsNewPackage.CMS:
         return createCMS();
      case CmsNewPackage.EXAM:
         return createExam();
      case CmsNewPackage.DEGREE:
         return createDegree();
      case CmsNewPackage.ROOM_MANAGEMENT:
         return createRoomManagement();
      case CmsNewPackage.THESIS_RECORD:
         return createThesisRecord();
      case CmsNewPackage.SEMESTER:
         return createSemester();
      case CmsNewPackage.BOOKING:
         return createBooking();
      case CmsNewPackage.SYSTEM_TIMER:
         return createSystemTimer();
      case CmsNewPackage.THESIS_MODULE_OFFER:
         return createThesisModuleOffer();
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
   public Object createFromString(EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
      case CmsNewPackage.EX_STATE:
         return createEX_STATEFromString(eDataType, initialValue);
      case CmsNewPackage.EN_STATE:
         return createEN_STATEFromString(eDataType, initialValue);
      case CmsNewPackage.TH_STATE:
         return createTH_STATEFromString(eDataType, initialValue);
      case CmsNewPackage.SEM_STATE:
         return createSEM_STATEFromString(eDataType, initialValue);
      case CmsNewPackage.CMO_STATE:
         return createCMO_STATEFromString(eDataType, initialValue);
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
   public String convertToString(EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
      case CmsNewPackage.EX_STATE:
         return convertEX_STATEToString(eDataType, instanceValue);
      case CmsNewPackage.EN_STATE:
         return convertEN_STATEToString(eDataType, instanceValue);
      case CmsNewPackage.TH_STATE:
         return convertTH_STATEToString(eDataType, instanceValue);
      case CmsNewPackage.SEM_STATE:
         return convertSEM_STATEToString(eDataType, instanceValue);
      case CmsNewPackage.CMO_STATE:
         return convertCMO_STATEToString(eDataType, instanceValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GradeFormular createGradeFormular()
   {
      GradeFormularImpl gradeFormular = new GradeFormularImpl();
      return gradeFormular;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Thesis createThesis()
   {
      ThesisImpl thesis = new ThesisImpl();
      return thesis;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Enrollment createEnrollment()
   {
      EnrollmentImpl enrollment = new EnrollmentImpl();
      return enrollment;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Lecture createLecture()
   {
      LectureImpl lecture = new LectureImpl();
      return lecture;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Module createModule()
   {
      ModuleImpl module = new ModuleImpl();
      return module;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Date createDate()
   {
      DateImpl date = new DateImpl();
      return date;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entry createEntry()
   {
      EntryImpl entry = new EntryImpl();
      return entry;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisModule createThesisModule()
   {
      ThesisModuleImpl thesisModule = new ThesisModuleImpl();
      return thesisModule;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CoModOffer createCoModOffer()
   {
      CoModOfferImpl coModOffer = new CoModOfferImpl();
      return coModOffer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CourseManagement createCourseManagement()
   {
      CourseManagementImpl courseManagement = new CourseManagementImpl();
      return courseManagement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UserDefinedConstraints createUserDefinedConstraints()
   {
      UserDefinedConstraintsImpl userDefinedConstraints = new UserDefinedConstraintsImpl();
      return userDefinedConstraints;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Record createRecord()
   {
      RecordImpl record = new RecordImpl();
      return record;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Room createRoom()
   {
      RoomImpl room = new RoomImpl();
      return room;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Program createProgram()
   {
      ProgramImpl program = new ProgramImpl();
      return program;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CMS createCMS()
   {
      CMSImpl cms = new CMSImpl();
      return cms;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Exam createExam()
   {
      ExamImpl exam = new ExamImpl();
      return exam;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Degree createDegree()
   {
      DegreeImpl degree = new DegreeImpl();
      return degree;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RoomManagement createRoomManagement()
   {
      RoomManagementImpl roomManagement = new RoomManagementImpl();
      return roomManagement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisRecord createThesisRecord()
   {
      ThesisRecordImpl thesisRecord = new ThesisRecordImpl();
      return thesisRecord;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Semester createSemester()
   {
      SemesterImpl semester = new SemesterImpl();
      return semester;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Booking createBooking()
   {
      BookingImpl booking = new BookingImpl();
      return booking;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SystemTimer createSystemTimer()
   {
      SystemTimerImpl systemTimer = new SystemTimerImpl();
      return systemTimer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisModuleOffer createThesisModuleOffer()
   {
      ThesisModuleOfferImpl thesisModuleOffer = new ThesisModuleOfferImpl();
      return thesisModuleOffer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EX_STATE createEX_STATEFromString(EDataType eDataType, String initialValue)
   {
      EX_STATE result = EX_STATE.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertEX_STATEToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EN_STATE createEN_STATEFromString(EDataType eDataType, String initialValue)
   {
      EN_STATE result = EN_STATE.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertEN_STATEToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TH_STATE createTH_STATEFromString(EDataType eDataType, String initialValue)
   {
      TH_STATE result = TH_STATE.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertTH_STATEToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SEM_STATE createSEM_STATEFromString(EDataType eDataType, String initialValue)
   {
      SEM_STATE result = SEM_STATE.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertSEM_STATEToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CMO_STATE createCMO_STATEFromString(EDataType eDataType, String initialValue)
   {
      CMO_STATE result = CMO_STATE.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertCMO_STATEToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CmsNewPackage getCmsNewPackage()
   {
      return (CmsNewPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static CmsNewPackage getPackage()
   {
      return CmsNewPackage.eINSTANCE;
   }

} //CmsNewFactoryImpl
