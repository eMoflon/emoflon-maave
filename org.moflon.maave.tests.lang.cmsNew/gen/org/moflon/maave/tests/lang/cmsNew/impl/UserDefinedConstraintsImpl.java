/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cmsNew.Booking;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.Enrollment;
import org.moflon.maave.tests.lang.cmsNew.Entry;
import org.moflon.maave.tests.lang.cmsNew.Exam;
import org.moflon.maave.tests.lang.cmsNew.GradeFormular;
import org.moflon.maave.tests.lang.cmsNew.Record;
import org.moflon.maave.tests.lang.cmsNew.Room;
import org.moflon.maave.tests.lang.cmsNew.Semester;
import org.moflon.maave.tests.lang.cmsNew.SystemTimer;
import org.moflon.maave.tests.lang.cmsNew.UserDefinedConstraints;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserDefinedConstraintsImpl extends EObjectImpl implements UserDefinedConstraints
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UserDefinedConstraintsImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return CmsNewPackage.Literals.USER_DEFINED_CONSTRAINTS;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _NC_SingeltonSystem(SystemTimer system1, SystemTimer system2)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_0_1_SingeltonSystem_blackBB(system1, system2);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[system1] = " + system1 + ", " + "[system2] = " + system2 + ".");
      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _NC_SingeltonCurrentSem(Semester sem2, Semester sem1)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_1_1_SingeltonCurrentSem_blackBB(sem1, sem2);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sem1] = " + sem1 + ", " + "[sem2] = " + sem2 + ".");
      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _NC_NoTwoEnrollmentsWithSameID(Enrollment en1, Enrollment en2)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_2_1_NoTwoEnrollmentsWithSameID_blackBB(en1, en2);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[en1] = " + en1 + ", " + "[en2] = " + en2 + ".");
      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _NC_NoTwoEntriesWithSameID(GradeFormular gf)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_3_1_NoTwoEntriesWithSameID_blackBFF(gf);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[gf] = " + gf + ".");
      }
      //nothing Entry e1 = (Entry) result1_black[1];
      //nothing Entry e2 = (Entry) result1_black[2];
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _NC_onlyOneRecordForModuleOfferAndExam(Enrollment en)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_4_1_onlyOneRecordForModuleOfferAndExam_blackBFFF(en);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[en] = " + en + ".");
      }
      //nothing CoModOffer cmo = (CoModOffer) result1_black[1];
      //nothing Record re1 = (Record) result1_black[2];
      //nothing Record re2 = (Record) result1_black[3];
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _XNC_onlyOneCMOPerExam(Enrollment en)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_5_1_onlyOneCMOPerExam_blackBFFFFF(en);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[en] = " + en + ".");
      }
      //nothing Record re1 = (Record) result1_black[1];
      //nothing Record re2 = (Record) result1_black[2];
      //nothing CoModOffer cmo1 = (CoModOffer) result1_black[3];
      //nothing CoModOffer cmo2 = (CoModOffer) result1_black[4];
      //nothing Exam ex = (Exam) result1_black[5];
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _NC_OnlyOneRegPerEnrollment(Record rec2, Record rec1)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_6_1_ActivityNode1_blackBBFF(rec1, rec2);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[rec1] = " + rec1 + ", " + "[rec2] = " + rec2 + ".");
      }
      //nothing Enrollment en = (Enrollment) result1_black[2];
      //nothing Exam exam = (Exam) result1_black[3];
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void _NC_NoCompetingBookings(Room room)
   {

      Object[] result1_black = UserDefinedConstraintsImpl.pattern_UserDefinedConstraints_7_1_NoCompetingBookings_blackBFF(room);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[room] = " + room + ".");
      }
      //nothing Booking boA = (Booking) result1_black[1];
      //nothing Booking boB = (Booking) result1_black[2];
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___NC_SINGELTON_SYSTEM__SYSTEMTIMER_SYSTEMTIMER:
         _NC_SingeltonSystem((SystemTimer) arguments.get(0), (SystemTimer) arguments.get(1));
         return null;
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___NC_SINGELTON_CURRENT_SEM__SEMESTER_SEMESTER:
         _NC_SingeltonCurrentSem((Semester) arguments.get(0), (Semester) arguments.get(1));
         return null;
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENROLLMENTS_WITH_SAME_ID__ENROLLMENT_ENROLLMENT:
         _NC_NoTwoEnrollmentsWithSameID((Enrollment) arguments.get(0), (Enrollment) arguments.get(1));
         return null;
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___NC_NO_TWO_ENTRIES_WITH_SAME_ID__GRADEFORMULAR:
         _NC_NoTwoEntriesWithSameID((GradeFormular) arguments.get(0));
         return null;
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_RECORD_FOR_MODULE_OFFER_AND_EXAM__ENROLLMENT:
         _NC_onlyOneRecordForModuleOfferAndExam((Enrollment) arguments.get(0));
         return null;
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___XNC_ONLY_ONE_CMO_PER_EXAM__ENROLLMENT:
         _XNC_onlyOneCMOPerExam((Enrollment) arguments.get(0));
         return null;
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_REG_PER_ENROLLMENT__RECORD_RECORD:
         _NC_OnlyOneRegPerEnrollment((Record) arguments.get(0), (Record) arguments.get(1));
         return null;
      case CmsNewPackage.USER_DEFINED_CONSTRAINTS___NC_NO_COMPETING_BOOKINGS__ROOM:
         _NC_NoCompetingBookings((Room) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_UserDefinedConstraints_0_1_SingeltonSystem_blackBB(SystemTimer system1, SystemTimer system2)
   {
      if (!system1.equals(system2))
      {
         return new Object[] { system1, system2 };
      }
      return null;
   }

   public static final Object[] pattern_UserDefinedConstraints_1_1_SingeltonCurrentSem_blackBB(Semester sem1, Semester sem2)
   {
      if (!sem1.equals(sem2))
      {
         boolean sem1_current = sem1.isCurrent();
         if (sem1_current == true)
         {
            boolean sem2_current = sem2.isCurrent();
            if (sem2_current == true)
            {
               return new Object[] { sem1, sem2 };
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_UserDefinedConstraints_2_1_NoTwoEnrollmentsWithSameID_blackBB(Enrollment en1, Enrollment en2)
   {
      if (!en1.equals(en2))
      {
         int en1_studId = en1.getStudId();
         int en2_studId = en2.getStudId();
         if (en1_studId == en2_studId)
         {
            return new Object[] { en1, en2 };
         }

      }
      return null;
   }

   public static final Object[] pattern_UserDefinedConstraints_3_1_NoTwoEntriesWithSameID_blackBFF(GradeFormular gf)
   {
      for (Entry e2 : gf.getRecords())
      {
         int e2_studentId = e2.getStudentId();
         for (Entry e1 : gf.getRecords())
         {
            if (!e1.equals(e2))
            {
               int e1_studentId = e1.getStudentId();
               if (e1_studentId == e2_studentId)
               {
                  return new Object[] { gf, e1, e2 };
               }

            }
         }

      }
      return null;
   }

   public static final Object[] pattern_UserDefinedConstraints_4_1_onlyOneRecordForModuleOfferAndExam_blackBFFF(Enrollment en)
   {
      for (Record re1 : en.getRecords())
      {
         CoModOffer cmo = re1.getModuleOffer();
         if (cmo != null)
         {
            for (Record re2 : en.getRecords())
            {
               if (!re1.equals(re2))
               {
                  if (cmo.equals(re2.getModuleOffer()))
                  {
                     return new Object[] { en, cmo, re1, re2 };
                  }
               }
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_UserDefinedConstraints_5_1_onlyOneCMOPerExam_blackBFFFFF(Enrollment en)
   {
      for (Record re2 : en.getRecords())
      {
         CoModOffer cmo2 = re2.getModuleOffer();
         if (cmo2 != null)
         {
            Exam ex = cmo2.getExams();
            if (ex != null)
            {
               for (Record re1 : en.getRecords())
               {
                  if (!re1.equals(re2))
                  {
                     CoModOffer cmo1 = re1.getModuleOffer();
                     if (cmo1 != null)
                     {
                        if (!cmo1.equals(cmo2))
                        {
                           if (ex.equals(cmo1.getExams()))
                           {
                              return new Object[] { en, re1, re2, cmo1, cmo2, ex };
                           }
                        }
                     }

                  }
               }
            }

         }

      }
      return null;
   }

   public static final Object[] pattern_UserDefinedConstraints_6_1_ActivityNode1_blackBBFF(Record rec1, Record rec2)
   {
      if (!rec1.equals(rec2))
      {
         Exam exam = rec1.getExam();
         if (exam != null)
         {
            if (exam.equals(rec2.getExam()))
            {
               Enrollment en = rec2.getEnrollment();
               if (en != null)
               {
                  if (en.equals(rec1.getEnrollment()))
                  {
                     return new Object[] { rec1, rec2, en, exam };
                  }
               }

            }
         }

      }
      return null;
   }

   public static final Object[] pattern_UserDefinedConstraints_7_1_NoCompetingBookings_blackBFF(Room room)
   {
      for (Booking boB : room.getReservations())
      {
         long boB_begin = boB.getBegin();
         long boB_end = boB.getEnd();
         for (Booking boA : room.getReservations())
         {
            if (!boA.equals(boB))
            {
               long boA_end = boA.getEnd();
               if (boA_end >= boB_begin)
               {
                  long boA_begin = boA.getBegin();
                  if (boB_end >= boA_begin)
                  {
                     return new Object[] { room, boA, boB };
                  }
               }

            }
         }

      }
      return null;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //UserDefinedConstraintsImpl
