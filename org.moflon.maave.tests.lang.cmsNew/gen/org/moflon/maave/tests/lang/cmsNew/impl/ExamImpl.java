/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cmsNew.Booking;
import org.moflon.maave.tests.lang.cmsNew.CmsNewFactory;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.Date;
import org.moflon.maave.tests.lang.cmsNew.EX_STATE;
import org.moflon.maave.tests.lang.cmsNew.Enrollment;
import org.moflon.maave.tests.lang.cmsNew.Entry;
import org.moflon.maave.tests.lang.cmsNew.Exam;
import org.moflon.maave.tests.lang.cmsNew.GradeFormular;
import org.moflon.maave.tests.lang.cmsNew.Record;
import org.moflon.maave.tests.lang.cmsNew.Room;
import org.moflon.maave.tests.lang.cmsNew.Semester;
import org.moflon.maave.tests.lang.cmsNew.SystemTimer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl#getRegistrations <em>Registrations</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl#getGradeList <em>Grade List</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl#getRegSt <em>Reg St</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ExamImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExamImpl extends EObjectImpl implements Exam
{
   /**
    * The cached value of the '{@link #getRegistrations() <em>Registrations</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegistrations()
    * @generated
    * @ordered
    */
   protected EList<Record> registrations;

   /**
    * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDate()
    * @generated
    * @ordered
    */
   protected Date date;

   /**
    * The cached value of the '{@link #getGradeList() <em>Grade List</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGradeList()
    * @generated
    * @ordered
    */
   protected GradeFormular gradeList;

   /**
    * The default value of the '{@link #getRegSt() <em>Reg St</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegSt()
    * @generated
    * @ordered
    */
   protected static final int REG_ST_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getRegSt() <em>Reg St</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegSt()
    * @generated
    * @ordered
    */
   protected int regSt = REG_ST_EDEFAULT;

   /**
    * The default value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected static final EX_STATE STATE_EDEFAULT = EX_STATE.EX_PLANNING;

   /**
    * The cached value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected EX_STATE state = STATE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ExamImpl()
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
      return CmsNewPackage.Literals.EXAM;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Semester getSemester()
   {
      if (eContainerFeatureID() != CmsNewPackage.EXAM__SEMESTER)
         return null;
      return (Semester) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newSemester, CmsNewPackage.EXAM__SEMESTER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSemester(Semester newSemester)
   {
      if (newSemester != eInternalContainer() || (eContainerFeatureID() != CmsNewPackage.EXAM__SEMESTER && newSemester != null))
      {
         if (EcoreUtil.isAncestor(this, newSemester))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newSemester != null)
            msgs = ((InternalEObject) newSemester).eInverseAdd(this, CmsNewPackage.SEMESTER__EXAMS, Semester.class, msgs);
         msgs = basicSetSemester(newSemester, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.EXAM__SEMESTER, newSemester, newSemester));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Record> getRegistrations()
   {
      if (registrations == null)
      {
         registrations = new EObjectWithInverseResolvingEList<Record>(Record.class, this, CmsNewPackage.EXAM__REGISTRATIONS, CmsNewPackage.RECORD__EXAM);
      }
      return registrations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Date getDate()
   {
      return date;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetDate(Date newDate, NotificationChain msgs)
   {
      Date oldDate = date;
      date = newDate;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.EXAM__DATE, oldDate, newDate);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDate(Date newDate)
   {
      if (newDate != date)
      {
         NotificationChain msgs = null;
         if (date != null)
            msgs = ((InternalEObject) date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.EXAM__DATE, null, msgs);
         if (newDate != null)
            msgs = ((InternalEObject) newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.EXAM__DATE, null, msgs);
         msgs = basicSetDate(newDate, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.EXAM__DATE, newDate, newDate));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GradeFormular getGradeList()
   {
      return gradeList;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetGradeList(GradeFormular newGradeList, NotificationChain msgs)
   {
      GradeFormular oldGradeList = gradeList;
      gradeList = newGradeList;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.EXAM__GRADE_LIST, oldGradeList, newGradeList);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGradeList(GradeFormular newGradeList)
   {
      if (newGradeList != gradeList)
      {
         NotificationChain msgs = null;
         if (gradeList != null)
            msgs = ((InternalEObject) gradeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.EXAM__GRADE_LIST, null, msgs);
         if (newGradeList != null)
            msgs = ((InternalEObject) newGradeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.EXAM__GRADE_LIST, null, msgs);
         msgs = basicSetGradeList(newGradeList, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.EXAM__GRADE_LIST, newGradeList, newGradeList));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getRegSt()
   {
      return regSt;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRegSt(int newRegSt)
   {
      int oldRegSt = regSt;
      regSt = newRegSt;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.EXAM__REG_ST, oldRegSt, regSt));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EX_STATE getState()
   {
      return state;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setState(EX_STATE newState)
   {
      EX_STATE oldState = state;
      state = newState == null ? STATE_EDEFAULT : newState;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.EXAM__STATE, oldState, state));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void zetDate_v0(Date da)
   {

      Object[] result1_black = ExamImpl.pattern_Exam_0_1_EX_setDate_v0_blackBBF(da, this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[da] = " + da + ", " + "[this] = " + this + ".");
      }
      EX_STATE this_state_prime_1 = (EX_STATE) result1_black[2];
      ExamImpl.pattern_Exam_0_1_EX_setDate_v0_greenBBB(da, this, this_state_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void updateDate_v0(Date da)
   {

      Object[] result1_black = ExamImpl.pattern_Exam_1_1_EX_updateDate_v0_blackFBB(this, da);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[da] = " + da + ".");
      }
      Date oldDate = (Date) result1_black[0];
      ExamImpl.pattern_Exam_1_1_EX_updateDate_v0_redBB(oldDate, this);

      ExamImpl.pattern_Exam_1_1_EX_updateDate_v0_greenBB(this, da);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void bookRoom_v1(Room ro, SystemTimer system)
   {

      Object[] result1_black = ExamImpl.pattern_Exam_2_1_EX_bookRoom_v1_blackBBFFBFFF(this, ro, system);
      if (result1_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[ro] = " + ro + ", " + "[system] = " + system + ".");
      }
      Date da = (Date) result1_black[2];
      //nothing Semester currSem = (Semester) result1_black[3];
      long bo_end_prime_1 = (long) result1_black[5];
      long bo_begin_prime_1 = (long) result1_black[6];
      EX_STATE this_state_prime_1 = (EX_STATE) result1_black[7];
      ExamImpl.pattern_Exam_2_1_EX_bookRoom_v1_greenBBFBBBB(this, ro, da, bo_end_prime_1, bo_begin_prime_1, this_state_prime_1);
      //nothing Booking bo = (Booking) result1_green[2];

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transferResultPassed_v0()
   {

      Object[] result1_black = ExamImpl.pattern_Exam_3_1_EX_transResPas_v0_blackFBFFFFFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Record rec = (Record) result1_black[0];
      GradeFormular gradeFormular = (GradeFormular) result1_black[2];
      Entry entry = (Entry) result1_black[3];
      //nothing CoModOffer moduleOffer = (CoModOffer) result1_black[4];
      Enrollment enrollment = (Enrollment) result1_black[5];
      int rec_grade_prime_1 = (int) result1_black[6];
      int enrollment_cp_prime_1 = (int) result1_black[7];
      ExamImpl.pattern_Exam_3_1_EX_transResPas_v0_redBBBB(rec, this, gradeFormular, entry);

      ExamImpl.pattern_Exam_3_1_EX_transResPas_v0_greenBBBB(rec, enrollment, rec_grade_prime_1, enrollment_cp_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transferResultFailed_v0()
   {

      Object[] result1_black = ExamImpl.pattern_Exam_4_1_EX_transResFail_v0_blackBFFFFFFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Record rec = (Record) result1_black[1];
      GradeFormular gradeFormular = (GradeFormular) result1_black[2];
      Entry entry = (Entry) result1_black[3];
      //nothing CoModOffer moduleOffer = (CoModOffer) result1_black[4];
      Enrollment enrollment = (Enrollment) result1_black[5];
      int rec_grade_prime_1 = (int) result1_black[6];
      boolean enrollment_enrolled_prime_1 = (boolean) result1_black[7];
      ExamImpl.pattern_Exam_4_1_EX_transResFail_v0_redBBBB(this, rec, gradeFormular, entry);

      ExamImpl.pattern_Exam_4_1_EX_transResFail_v0_greenBBBB(rec, enrollment, rec_grade_prime_1, enrollment_enrolled_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void bookRoom_v0(Room ro)
   {

      Object[] result1_black = ExamImpl.pattern_Exam_5_1_EX_bookRoom_v0_blackFBBFFF(this, ro);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[ro] = " + ro + ".");
      }
      Date da = (Date) result1_black[0];
      long bo_end_prime_1 = (long) result1_black[3];
      long bo_begin_prime_1 = (long) result1_black[4];
      EX_STATE this_state_prime_1 = (EX_STATE) result1_black[5];
      ExamImpl.pattern_Exam_5_1_EX_bookRoom_v0_greenBBBFBBB(da, this, ro, bo_end_prime_1, bo_begin_prime_1, this_state_prime_1);
      //nothing Booking bo = (Booking) result1_green[3];

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void uploadResults_v0(GradeFormular gF)
   {

      Object[] result1_black = ExamImpl.pattern_Exam_6_1_EX_uploadRes_v0_blackBBF(this, gF);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[gF] = " + gF + ".");
      }
      EX_STATE this_state_prime_1 = (EX_STATE) result1_black[2];
      ExamImpl.pattern_Exam_6_1_EX_uploadRes_v0_greenBBB(this, gF, this_state_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void closeExam_v0()
   {

      Object[] result1_black = ExamImpl.pattern_Exam_7_1_EX_closeExam_v0_blackBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      EX_STATE this_state_prime_1 = (EX_STATE) result1_black[1];
      ExamImpl.pattern_Exam_7_1_EX_closeExam_v0_greenBB(this, this_state_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transferResultPassed_v1(SystemTimer system)
   {

      Object[] result1_black = ExamImpl.pattern_Exam_8_1_EX_transResPas_v1_blackBFFFFFFBFF(this, system);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[system] = " + system + ".");
      }
      Record rec = (Record) result1_black[1];
      GradeFormular gradeFormular = (GradeFormular) result1_black[2];
      Entry entry = (Entry) result1_black[3];
      //nothing CoModOffer moduleOffer = (CoModOffer) result1_black[4];
      Enrollment enrollment = (Enrollment) result1_black[5];
      //nothing Semester currSem = (Semester) result1_black[6];
      int rec_grade_prime_1 = (int) result1_black[8];
      int enrollment_cp_prime_1 = (int) result1_black[9];
      ExamImpl.pattern_Exam_8_1_EX_transResPas_v1_redBBBB(this, rec, gradeFormular, entry);

      ExamImpl.pattern_Exam_8_1_EX_transResPas_v1_greenBBBB(rec, enrollment, rec_grade_prime_1, enrollment_cp_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transferResultFailed_v1(SystemTimer system)
   {

      Object[] result1_black = ExamImpl.pattern_Exam_9_1_EX_transResFail_v1_blackBFFFFFFBFF(this, system);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[system] = " + system + ".");
      }
      Record rec = (Record) result1_black[1];
      GradeFormular gradeFormular = (GradeFormular) result1_black[2];
      Entry entry = (Entry) result1_black[3];
      //nothing CoModOffer moduleOffer = (CoModOffer) result1_black[4];
      Enrollment enrollment = (Enrollment) result1_black[5];
      //nothing Semester currSem = (Semester) result1_black[6];
      int rec_grade_prime_1 = (int) result1_black[8];
      boolean enrollment_enrolled_prime_1 = (boolean) result1_black[9];
      ExamImpl.pattern_Exam_9_1_EX_transResFail_v1_redBBBB(this, rec, gradeFormular, entry);

      ExamImpl.pattern_Exam_9_1_EX_transResFail_v1_greenBBBB(rec, enrollment, rec_grade_prime_1, enrollment_enrolled_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case CmsNewPackage.EXAM__SEMESTER:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetSemester((Semester) otherEnd, msgs);
      case CmsNewPackage.EXAM__REGISTRATIONS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegistrations()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case CmsNewPackage.EXAM__SEMESTER:
         return basicSetSemester(null, msgs);
      case CmsNewPackage.EXAM__REGISTRATIONS:
         return ((InternalEList<?>) getRegistrations()).basicRemove(otherEnd, msgs);
      case CmsNewPackage.EXAM__DATE:
         return basicSetDate(null, msgs);
      case CmsNewPackage.EXAM__GRADE_LIST:
         return basicSetGradeList(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
      case CmsNewPackage.EXAM__SEMESTER:
         return eInternalContainer().eInverseRemove(this, CmsNewPackage.SEMESTER__EXAMS, Semester.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case CmsNewPackage.EXAM__SEMESTER:
         return getSemester();
      case CmsNewPackage.EXAM__REGISTRATIONS:
         return getRegistrations();
      case CmsNewPackage.EXAM__DATE:
         return getDate();
      case CmsNewPackage.EXAM__GRADE_LIST:
         return getGradeList();
      case CmsNewPackage.EXAM__REG_ST:
         return getRegSt();
      case CmsNewPackage.EXAM__STATE:
         return getState();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case CmsNewPackage.EXAM__SEMESTER:
         setSemester((Semester) newValue);
         return;
      case CmsNewPackage.EXAM__REGISTRATIONS:
         getRegistrations().clear();
         getRegistrations().addAll((Collection<? extends Record>) newValue);
         return;
      case CmsNewPackage.EXAM__DATE:
         setDate((Date) newValue);
         return;
      case CmsNewPackage.EXAM__GRADE_LIST:
         setGradeList((GradeFormular) newValue);
         return;
      case CmsNewPackage.EXAM__REG_ST:
         setRegSt((Integer) newValue);
         return;
      case CmsNewPackage.EXAM__STATE:
         setState((EX_STATE) newValue);
         return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case CmsNewPackage.EXAM__SEMESTER:
         setSemester((Semester) null);
         return;
      case CmsNewPackage.EXAM__REGISTRATIONS:
         getRegistrations().clear();
         return;
      case CmsNewPackage.EXAM__DATE:
         setDate((Date) null);
         return;
      case CmsNewPackage.EXAM__GRADE_LIST:
         setGradeList((GradeFormular) null);
         return;
      case CmsNewPackage.EXAM__REG_ST:
         setRegSt(REG_ST_EDEFAULT);
         return;
      case CmsNewPackage.EXAM__STATE:
         setState(STATE_EDEFAULT);
         return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case CmsNewPackage.EXAM__SEMESTER:
         return getSemester() != null;
      case CmsNewPackage.EXAM__REGISTRATIONS:
         return registrations != null && !registrations.isEmpty();
      case CmsNewPackage.EXAM__DATE:
         return date != null;
      case CmsNewPackage.EXAM__GRADE_LIST:
         return gradeList != null;
      case CmsNewPackage.EXAM__REG_ST:
         return regSt != REG_ST_EDEFAULT;
      case CmsNewPackage.EXAM__STATE:
         return state != STATE_EDEFAULT;
      }
      return super.eIsSet(featureID);
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
      case CmsNewPackage.EXAM___ZET_DATE_V0__DATE:
         zetDate_v0((Date) arguments.get(0));
         return null;
      case CmsNewPackage.EXAM___UPDATE_DATE_V0__DATE:
         updateDate_v0((Date) arguments.get(0));
         return null;
      case CmsNewPackage.EXAM___BOOK_ROOM_V1__ROOM_SYSTEMTIMER:
         bookRoom_v1((Room) arguments.get(0), (SystemTimer) arguments.get(1));
         return null;
      case CmsNewPackage.EXAM___TRANSFER_RESULT_PASSED_V0:
         transferResultPassed_v0();
         return null;
      case CmsNewPackage.EXAM___TRANSFER_RESULT_FAILED_V0:
         transferResultFailed_v0();
         return null;
      case CmsNewPackage.EXAM___BOOK_ROOM_V0__ROOM:
         bookRoom_v0((Room) arguments.get(0));
         return null;
      case CmsNewPackage.EXAM___UPLOAD_RESULTS_V0__GRADEFORMULAR:
         uploadResults_v0((GradeFormular) arguments.get(0));
         return null;
      case CmsNewPackage.EXAM___CLOSE_EXAM_V0:
         closeExam_v0();
         return null;
      case CmsNewPackage.EXAM___TRANSFER_RESULT_PASSED_V1__SYSTEMTIMER:
         transferResultPassed_v1((SystemTimer) arguments.get(0));
         return null;
      case CmsNewPackage.EXAM___TRANSFER_RESULT_FAILED_V1__SYSTEMTIMER:
         transferResultFailed_v1((SystemTimer) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (regSt: ");
      result.append(regSt);
      result.append(", state: ");
      result.append(state);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_Exam_0_1_EX_setDate_v0_blackBBF(Date da, Exam _this)
   {
      EX_STATE this_state = _this.getState();
      if (this_state == EX_STATE.EX_CREATED)
      {
         EX_STATE this_state_prime;

         this_state_prime = EX_STATE.EX_PLANNING;
         return new Object[] { da, _this, this_state_prime };
      }

      return null;
   }

   public static final Object[] pattern_Exam_0_1_EX_setDate_v0_greenBBB(Date da, Exam _this, EX_STATE this_state_prime)
   {
      _this.setDate(da);
      _this.setState(this_state_prime);
      return new Object[] { da, _this, this_state_prime };
   }

   public static final Object[] pattern_Exam_1_1_EX_updateDate_v0_blackFBB(Exam _this, Date da)
   {
      Date oldDate = _this.getDate();
      if (oldDate != null)
      {
         if (!da.equals(oldDate))
         {
            EX_STATE this_state = _this.getState();
            if (this_state == EX_STATE.EX_PLANNING)
            {
               return new Object[] { oldDate, _this, da };
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_Exam_1_1_EX_updateDate_v0_redBB(Date oldDate, Exam _this)
   {
      _this.setDate(null);
      return new Object[] { oldDate, _this };
   }

   public static final Object[] pattern_Exam_1_1_EX_updateDate_v0_greenBB(Exam _this, Date da)
   {
      _this.setDate(da);
      return new Object[] { _this, da };
   }

   public static final Object[] pattern_Exam_2_1_EX_bookRoom_v1_blackBBFFBFFF(Exam _this, Room ro, SystemTimer system)
   {
      Date da = _this.getDate();
      if (da != null)
      {
         Semester currSem = _this.getSemester();
         if (currSem != null)
         {
            int ro_capacity = ro.getCapacity();
            int this_regSt = _this.getRegSt();
            if (ro_capacity >= this_regSt)
            {
               EX_STATE this_state = _this.getState();
               if (this_state == EX_STATE.EX_PLANNING)
               {
                  long system_currentTime = system.getCurrentTime();
                  long da_begin = da.getBegin();
                  long da_duration = da.getDuration();
                  boolean currSem_current = currSem.isCurrent();
                  if (currSem_current == true)
                  {
                     long currSem_regPeriodStop = currSem.getRegPeriodStop();
                     if (currSem_regPeriodStop < system_currentTime)
                     {
                        EX_STATE this_state_prime;

                        this_state_prime = EX_STATE.EX_READY;
                        long bo_begin_prime;

                        bo_begin_prime = da_begin;
                        long bo_end_prime;

                        bo_end_prime = da_begin + da_duration;
                        return new Object[] { _this, ro, da, currSem, system, bo_end_prime, bo_begin_prime, this_state_prime };
                     }
                  }

               }
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_Exam_2_1_EX_bookRoom_v1_greenBBFBBBB(Exam _this, Room ro, Date da, long bo_end_prime, long bo_begin_prime,
         EX_STATE this_state_prime)
   {
      Booking bo = CmsNewFactory.eINSTANCE.createBooking();
      _this.setState(this_state_prime);
      ro.getReservations().add(bo);
      da.setLocation(bo);
      bo.setEnd(Long.valueOf(bo_end_prime));
      bo.setBegin(Long.valueOf(bo_begin_prime));
      return new Object[] { _this, ro, bo, da, bo_end_prime, bo_begin_prime, this_state_prime };
   }

   public static final Object[] pattern_Exam_3_1_EX_transResPas_v0_blackFBFFFFFF(Exam _this)
   {
      GradeFormular gradeFormular = _this.getGradeList();
      if (gradeFormular != null)
      {
         EX_STATE this_state = _this.getState();
         if (this_state == EX_STATE.EX_FINALIZING)
         {
            for (Record rec : _this.getRegistrations())
            {
               CoModOffer moduleOffer = rec.getModuleOffer();
               if (moduleOffer != null)
               {
                  if (_this.equals(moduleOffer.getExams()))
                  {
                     Enrollment enrollment = rec.getEnrollment();
                     if (enrollment != null)
                     {
                        int moduleOffer_cp = moduleOffer.getCp();
                        if (moduleOffer_cp > 0)
                        {
                           int enrollment_studId = enrollment.getStudId();
                           int enrollment_cp = enrollment.getCp();
                           for (Entry entry : gradeFormular.getRecords())
                           {
                              int entry_studentId = entry.getStudentId();
                              if (enrollment_studId == entry_studentId)
                              {
                                 int entry_grade = entry.getGrade();
                                 if (entry_grade <= 4)
                                 {
                                    int enrollment_cp_prime;

                                    enrollment_cp_prime = enrollment_cp + moduleOffer_cp;
                                    int rec_grade_prime;

                                    rec_grade_prime = entry_grade;
                                    return new Object[] { rec, _this, gradeFormular, entry, moduleOffer, enrollment, rec_grade_prime, enrollment_cp_prime };
                                 }
                              }

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

   public static final Object[] pattern_Exam_3_1_EX_transResPas_v0_redBBBB(Record rec, Exam _this, GradeFormular gradeFormular, Entry entry)
   {
      rec.setExam(null);
      gradeFormular.getRecords().remove(entry);
      return new Object[] { rec, _this, gradeFormular, entry };
   }

   public static final Object[] pattern_Exam_3_1_EX_transResPas_v0_greenBBBB(Record rec, Enrollment enrollment, int rec_grade_prime, int enrollment_cp_prime)
   {
      rec.setGrade(Integer.valueOf(rec_grade_prime));
      enrollment.setCp(Integer.valueOf(enrollment_cp_prime));
      return new Object[] { rec, enrollment, rec_grade_prime, enrollment_cp_prime };
   }

   public static final Object[] pattern_Exam_4_1_EX_transResFail_v0_blackBFFFFFFF(Exam _this)
   {
      GradeFormular gradeFormular = _this.getGradeList();
      if (gradeFormular != null)
      {
         EX_STATE this_state = _this.getState();
         if (this_state == EX_STATE.EX_FINALIZING)
         {
            for (Record rec : _this.getRegistrations())
            {
               CoModOffer moduleOffer = rec.getModuleOffer();
               if (moduleOffer != null)
               {
                  if (_this.equals(moduleOffer.getExams()))
                  {
                     Enrollment enrollment = rec.getEnrollment();
                     if (enrollment != null)
                     {
                        int rec_tries = rec.getTries();
                        int enrollment_studId = enrollment.getStudId();
                        boolean enrollment_enrolled = enrollment.isEnrolled();
                        for (Entry entry : gradeFormular.getRecords())
                        {
                           int entry_studentId = entry.getStudentId();
                           if (enrollment_studId == entry_studentId)
                           {
                              int entry_grade = entry.getGrade();
                              if (entry_grade == 5)
                              {
                                 boolean failed;

                                 failed = (rec_tries == 3);
                                 int rec_grade_prime;

                                 rec_grade_prime = entry_grade;
                                 boolean enrollment_enrolled_prime;

                                 enrollment_enrolled_prime = failed ? false : enrollment_enrolled;
                                 return new Object[] { _this, rec, gradeFormular, entry, moduleOffer, enrollment, rec_grade_prime, enrollment_enrolled_prime };
                              }
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

   public static final Object[] pattern_Exam_4_1_EX_transResFail_v0_redBBBB(Exam _this, Record rec, GradeFormular gradeFormular, Entry entry)
   {
      rec.setExam(null);
      gradeFormular.getRecords().remove(entry);
      return new Object[] { _this, rec, gradeFormular, entry };
   }

   public static final Object[] pattern_Exam_4_1_EX_transResFail_v0_greenBBBB(Record rec, Enrollment enrollment, int rec_grade_prime,
         boolean enrollment_enrolled_prime)
   {
      rec.setGrade(Integer.valueOf(rec_grade_prime));
      enrollment.setEnrolled(Boolean.valueOf(enrollment_enrolled_prime));
      return new Object[] { rec, enrollment, rec_grade_prime, enrollment_enrolled_prime };
   }

   public static final Object[] pattern_Exam_5_1_EX_bookRoom_v0_blackFBBFFF(Exam _this, Room ro)
   {
      Date da = _this.getDate();
      if (da != null)
      {
         int ro_capacity = ro.getCapacity();
         int this_regSt = _this.getRegSt();
         if (ro_capacity >= this_regSt)
         {
            EX_STATE this_state = _this.getState();
            if (this_state == EX_STATE.EX_PLANNING)
            {
               long da_begin = da.getBegin();
               long da_duration = da.getDuration();
               EX_STATE this_state_prime;

               this_state_prime = EX_STATE.EX_READY;
               long bo_begin_prime;

               bo_begin_prime = da_begin;
               long bo_end_prime;

               bo_end_prime = da_begin + da_duration;
               return new Object[] { da, _this, ro, bo_end_prime, bo_begin_prime, this_state_prime };

            }
         }

      }

      return null;
   }

   public static final Object[] pattern_Exam_5_1_EX_bookRoom_v0_greenBBBFBBB(Date da, Exam _this, Room ro, long bo_end_prime, long bo_begin_prime,
         EX_STATE this_state_prime)
   {
      Booking bo = CmsNewFactory.eINSTANCE.createBooking();
      _this.setState(this_state_prime);
      da.setLocation(bo);
      ro.getReservations().add(bo);
      bo.setEnd(Long.valueOf(bo_end_prime));
      bo.setBegin(Long.valueOf(bo_begin_prime));
      return new Object[] { da, _this, ro, bo, bo_end_prime, bo_begin_prime, this_state_prime };
   }

   public static final Object[] pattern_Exam_6_1_EX_uploadRes_v0_blackBBF(Exam _this, GradeFormular gF)
   {
      EX_STATE this_state = _this.getState();
      if (this_state == EX_STATE.EX_READY)
      {
         EX_STATE this_state_prime;

         this_state_prime = EX_STATE.EX_FINALIZING;
         return new Object[] { _this, gF, this_state_prime };
      }

      return null;
   }

   public static final Object[] pattern_Exam_6_1_EX_uploadRes_v0_greenBBB(Exam _this, GradeFormular gF, EX_STATE this_state_prime)
   {
      _this.setGradeList(gF);
      _this.setState(this_state_prime);
      return new Object[] { _this, gF, this_state_prime };
   }

   public static final Object[] pattern_Exam_7_1_EX_closeExam_v0_blackBF(Exam _this)
   {
      EX_STATE this_state = _this.getState();
      if (this_state == EX_STATE.EX_FINALIZING)
      {
         EX_STATE this_state_prime;

         this_state_prime = EX_STATE.EX_CLOSED;
         return new Object[] { _this, this_state_prime };
      }

      return null;
   }

   public static final Object[] pattern_Exam_7_1_EX_closeExam_v0_greenBB(Exam _this, EX_STATE this_state_prime)
   {
      _this.setState(this_state_prime);
      return new Object[] { _this, this_state_prime };
   }

   public static final Object[] pattern_Exam_8_1_EX_transResPas_v1_blackBFFFFFFBFF(Exam _this, SystemTimer system)
   {
      GradeFormular gradeFormular = _this.getGradeList();
      if (gradeFormular != null)
      {
         Semester currSem = _this.getSemester();
         if (currSem != null)
         {
            EX_STATE this_state = _this.getState();
            if (this_state == EX_STATE.EX_FINALIZING)
            {
               long system_currentTime = system.getCurrentTime();
               boolean currSem_current = currSem.isCurrent();
               if (currSem_current == true)
               {
                  long currSem_regPeriodStop = currSem.getRegPeriodStop();
                  if (currSem_regPeriodStop < system_currentTime)
                  {
                     for (Record rec : _this.getRegistrations())
                     {
                        CoModOffer moduleOffer = rec.getModuleOffer();
                        if (moduleOffer != null)
                        {
                           if (_this.equals(moduleOffer.getExams()))
                           {
                              Enrollment enrollment = rec.getEnrollment();
                              if (enrollment != null)
                              {
                                 int moduleOffer_cp = moduleOffer.getCp();
                                 if (moduleOffer_cp > 0)
                                 {
                                    int enrollment_studId = enrollment.getStudId();
                                    int enrollment_cp = enrollment.getCp();
                                    for (Entry entry : gradeFormular.getRecords())
                                    {
                                       int entry_studentId = entry.getStudentId();
                                       if (enrollment_studId == entry_studentId)
                                       {
                                          int entry_grade = entry.getGrade();
                                          if (entry_grade <= 4)
                                          {
                                             int enrollment_cp_prime;

                                             enrollment_cp_prime = enrollment_cp + moduleOffer_cp;
                                             int rec_grade_prime;

                                             rec_grade_prime = entry_grade;
                                             return new Object[] { _this, rec, gradeFormular, entry, moduleOffer, enrollment, currSem, system, rec_grade_prime,
                                                   enrollment_cp_prime };
                                          }
                                       }

                                    }

                                 }

                              }

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

   public static final Object[] pattern_Exam_8_1_EX_transResPas_v1_redBBBB(Exam _this, Record rec, GradeFormular gradeFormular, Entry entry)
   {
      rec.setExam(null);
      gradeFormular.getRecords().remove(entry);
      return new Object[] { _this, rec, gradeFormular, entry };
   }

   public static final Object[] pattern_Exam_8_1_EX_transResPas_v1_greenBBBB(Record rec, Enrollment enrollment, int rec_grade_prime, int enrollment_cp_prime)
   {
      rec.setGrade(Integer.valueOf(rec_grade_prime));
      enrollment.setCp(Integer.valueOf(enrollment_cp_prime));
      return new Object[] { rec, enrollment, rec_grade_prime, enrollment_cp_prime };
   }

   public static final Object[] pattern_Exam_9_1_EX_transResFail_v1_blackBFFFFFFBFF(Exam _this, SystemTimer system)
   {
      GradeFormular gradeFormular = _this.getGradeList();
      if (gradeFormular != null)
      {
         Semester currSem = _this.getSemester();
         if (currSem != null)
         {
            EX_STATE this_state = _this.getState();
            if (this_state == EX_STATE.EX_FINALIZING)
            {
               long system_currentTime = system.getCurrentTime();
               boolean currSem_current = currSem.isCurrent();
               if (currSem_current == true)
               {
                  long currSem_regPeriodStop = currSem.getRegPeriodStop();
                  if (currSem_regPeriodStop < system_currentTime)
                  {
                     for (Record rec : _this.getRegistrations())
                     {
                        CoModOffer moduleOffer = rec.getModuleOffer();
                        if (moduleOffer != null)
                        {
                           if (_this.equals(moduleOffer.getExams()))
                           {
                              Enrollment enrollment = rec.getEnrollment();
                              if (enrollment != null)
                              {
                                 int rec_tries = rec.getTries();
                                 int enrollment_studId = enrollment.getStudId();
                                 boolean enrollment_enrolled = enrollment.isEnrolled();
                                 for (Entry entry : gradeFormular.getRecords())
                                 {
                                    int entry_studentId = entry.getStudentId();
                                    if (enrollment_studId == entry_studentId)
                                    {
                                       int entry_grade = entry.getGrade();
                                       if (entry_grade == 5)
                                       {
                                          boolean failed;

                                          failed = (rec_tries == 3);
                                          int rec_grade_prime;

                                          rec_grade_prime = entry_grade;
                                          boolean enrollment_enrolled_prime;

                                          enrollment_enrolled_prime = failed ? false : enrollment_enrolled;
                                          return new Object[] { _this, rec, gradeFormular, entry, moduleOffer, enrollment, currSem, system, rec_grade_prime,
                                                enrollment_enrolled_prime };
                                       }
                                    }

                                 }

                              }

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

   public static final Object[] pattern_Exam_9_1_EX_transResFail_v1_redBBBB(Exam _this, Record rec, GradeFormular gradeFormular, Entry entry)
   {
      rec.setExam(null);
      gradeFormular.getRecords().remove(entry);
      return new Object[] { _this, rec, gradeFormular, entry };
   }

   public static final Object[] pattern_Exam_9_1_EX_transResFail_v1_greenBBBB(Record rec, Enrollment enrollment, int rec_grade_prime,
         boolean enrollment_enrolled_prime)
   {
      rec.setGrade(Integer.valueOf(rec_grade_prime));
      enrollment.setEnrolled(Boolean.valueOf(enrollment_enrolled_prime));
      return new Object[] { rec, enrollment, rec_grade_prime, enrollment_enrolled_prime };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ExamImpl
