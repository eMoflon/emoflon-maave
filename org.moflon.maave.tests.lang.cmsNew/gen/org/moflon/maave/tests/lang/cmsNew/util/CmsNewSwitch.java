/**
 */
package org.moflon.maave.tests.lang.cmsNew.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.maave.tests.lang.cmsNew.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage
 * @generated
 */
public class CmsNewSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static CmsNewPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CmsNewSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = CmsNewPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
      case CmsNewPackage.GRADE_FORMULAR:
      {
         GradeFormular gradeFormular = (GradeFormular) theEObject;
         T result = caseGradeFormular(gradeFormular);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.THESIS:
      {
         Thesis thesis = (Thesis) theEObject;
         T result = caseThesis(thesis);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.ENROLLMENT:
      {
         Enrollment enrollment = (Enrollment) theEObject;
         T result = caseEnrollment(enrollment);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.LECTURE:
      {
         Lecture lecture = (Lecture) theEObject;
         T result = caseLecture(lecture);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.MODULE:
      {
         Module module = (Module) theEObject;
         T result = caseModule(module);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.DATE:
      {
         Date date = (Date) theEObject;
         T result = caseDate(date);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.ENTRY:
      {
         Entry entry = (Entry) theEObject;
         T result = caseEntry(entry);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.THESIS_MODULE:
      {
         ThesisModule thesisModule = (ThesisModule) theEObject;
         T result = caseThesisModule(thesisModule);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.CO_MOD_OFFER:
      {
         CoModOffer coModOffer = (CoModOffer) theEObject;
         T result = caseCoModOffer(coModOffer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.COURSE_MANAGEMENT:
      {
         CourseManagement courseManagement = (CourseManagement) theEObject;
         T result = caseCourseManagement(courseManagement);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS:
      {
         UserDefinedConstraints userDefinedConstraints = (UserDefinedConstraints) theEObject;
         T result = caseUserDefinedConstraints(userDefinedConstraints);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.RECORD:
      {
         Record record = (Record) theEObject;
         T result = caseRecord(record);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.ROOM:
      {
         Room room = (Room) theEObject;
         T result = caseRoom(room);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.PROGRAM:
      {
         Program program = (Program) theEObject;
         T result = caseProgram(program);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.CMS:
      {
         CMS cms = (CMS) theEObject;
         T result = caseCMS(cms);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.EXAM:
      {
         Exam exam = (Exam) theEObject;
         T result = caseExam(exam);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.DEGREE:
      {
         Degree degree = (Degree) theEObject;
         T result = caseDegree(degree);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.ROOM_MANAGEMENT:
      {
         RoomManagement roomManagement = (RoomManagement) theEObject;
         T result = caseRoomManagement(roomManagement);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.THESIS_RECORD:
      {
         ThesisRecord thesisRecord = (ThesisRecord) theEObject;
         T result = caseThesisRecord(thesisRecord);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.SEMESTER:
      {
         Semester semester = (Semester) theEObject;
         T result = caseSemester(semester);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.BOOKING:
      {
         Booking booking = (Booking) theEObject;
         T result = caseBooking(booking);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.SYSTEM_TIMER:
      {
         SystemTimer systemTimer = (SystemTimer) theEObject;
         T result = caseSystemTimer(systemTimer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case CmsNewPackage.THESIS_MODULE_OFFER:
      {
         ThesisModuleOffer thesisModuleOffer = (ThesisModuleOffer) theEObject;
         T result = caseThesisModuleOffer(thesisModuleOffer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      default:
         return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Grade Formular</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Grade Formular</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGradeFormular(GradeFormular object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Thesis</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Thesis</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseThesis(Thesis object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Enrollment</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Enrollment</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEnrollment(Enrollment object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Lecture</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Lecture</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLecture(Lecture object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Module</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseModule(Module object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Date</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDate(Date object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEntry(Entry object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Thesis Module</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Thesis Module</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseThesisModule(ThesisModule object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Co Mod Offer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Co Mod Offer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCoModOffer(CoModOffer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Course Management</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Course Management</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCourseManagement(CourseManagement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>User Defined Constraints</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>User Defined Constraints</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUserDefinedConstraints(UserDefinedConstraints object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Record</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRecord(Record object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Room</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRoom(Room object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Program</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProgram(Program object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>CMS</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>CMS</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCMS(CMS object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Exam</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Exam</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExam(Exam object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Degree</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Degree</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDegree(Degree object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Room Management</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Room Management</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRoomManagement(RoomManagement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Thesis Record</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Thesis Record</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseThesisRecord(ThesisRecord object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Semester</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Semester</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSemester(Semester object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBooking(Booking object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>System Timer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>System Timer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSystemTimer(SystemTimer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Thesis Module Offer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Thesis Module Offer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseThesisModuleOffer(ThesisModuleOffer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object)
   {
      return null;
   }

} //CmsNewSwitch
