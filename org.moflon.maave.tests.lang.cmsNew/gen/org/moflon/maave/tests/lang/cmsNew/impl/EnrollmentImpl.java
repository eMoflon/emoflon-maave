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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.maave.tests.lang.cmsNew.CmsNewFactory;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.Degree;
import org.moflon.maave.tests.lang.cmsNew.EN_STATE;
import org.moflon.maave.tests.lang.cmsNew.Enrollment;
import org.moflon.maave.tests.lang.cmsNew.Exam;
import org.moflon.maave.tests.lang.cmsNew.Module;
import org.moflon.maave.tests.lang.cmsNew.Program;
import org.moflon.maave.tests.lang.cmsNew.Record;
import org.moflon.maave.tests.lang.cmsNew.Semester;
import org.moflon.maave.tests.lang.cmsNew.SystemTimer;
import org.moflon.maave.tests.lang.cmsNew.Thesis;
import org.moflon.maave.tests.lang.cmsNew.ThesisModule;
import org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer;
import org.moflon.maave.tests.lang.cmsNew.ThesisRecord;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getThesisRecord <em>Thesis Record</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getState <em>State</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getRegCp <em>Reg Cp</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#getStudId <em>Stud Id</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.EnrollmentImpl#isEnrolled <em>Enrolled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnrollmentImpl extends EObjectImpl implements Enrollment
{
   /**
    * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRecords()
    * @generated
    * @ordered
    */
   protected EList<Record> records;

   /**
    * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProgram()
    * @generated
    * @ordered
    */
   protected Program program;

   /**
    * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDegree()
    * @generated
    * @ordered
    */
   protected Degree degree;

   /**
    * The cached value of the '{@link #getThesisRecord() <em>Thesis Record</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getThesisRecord()
    * @generated
    * @ordered
    */
   protected ThesisRecord thesisRecord;

   /**
    * The default value of the '{@link #getCp() <em>Cp</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCp()
    * @generated
    * @ordered
    */
   protected static final int CP_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCp()
    * @generated
    * @ordered
    */
   protected int cp = CP_EDEFAULT;

   /**
    * The default value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected static final EN_STATE STATE_EDEFAULT = EN_STATE.EN_STUDY;

   /**
    * The cached value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected EN_STATE state = STATE_EDEFAULT;

   /**
    * The default value of the '{@link #getRegCp() <em>Reg Cp</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegCp()
    * @generated
    * @ordered
    */
   protected static final int REG_CP_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getRegCp() <em>Reg Cp</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegCp()
    * @generated
    * @ordered
    */
   protected int regCp = REG_CP_EDEFAULT;

   /**
    * The default value of the '{@link #getStudId() <em>Stud Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStudId()
    * @generated
    * @ordered
    */
   protected static final int STUD_ID_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getStudId() <em>Stud Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStudId()
    * @generated
    * @ordered
    */
   protected int studId = STUD_ID_EDEFAULT;

   /**
    * The default value of the '{@link #isEnrolled() <em>Enrolled</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isEnrolled()
    * @generated
    * @ordered
    */
   protected static final boolean ENROLLED_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isEnrolled() <em>Enrolled</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isEnrolled()
    * @generated
    * @ordered
    */
   protected boolean enrolled = ENROLLED_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected EnrollmentImpl()
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
      return CmsNewPackage.Literals.ENROLLMENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Record> getRecords()
   {
      if (records == null)
      {
         records = new EObjectContainmentWithInverseEList<Record>(Record.class, this, CmsNewPackage.ENROLLMENT__RECORDS, CmsNewPackage.RECORD__ENROLLMENT);
      }
      return records;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Program getProgram()
   {
      if (program != null && program.eIsProxy())
      {
         InternalEObject oldProgram = (InternalEObject) program;
         program = (Program) eResolveProxy(oldProgram);
         if (program != oldProgram)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.ENROLLMENT__PROGRAM, oldProgram, program));
         }
      }
      return program;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Program basicGetProgram()
   {
      return program;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setProgram(Program newProgram)
   {
      Program oldProgram = program;
      program = newProgram;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__PROGRAM, oldProgram, program));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Degree getDegree()
   {
      return degree;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetDegree(Degree newDegree, NotificationChain msgs)
   {
      Degree oldDegree = degree;
      degree = newDegree;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__DEGREE, oldDegree, newDegree);
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
   public void setDegree(Degree newDegree)
   {
      if (newDegree != degree)
      {
         NotificationChain msgs = null;
         if (degree != null)
            msgs = ((InternalEObject) degree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.ENROLLMENT__DEGREE, null, msgs);
         if (newDegree != null)
            msgs = ((InternalEObject) newDegree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.ENROLLMENT__DEGREE, null, msgs);
         msgs = basicSetDegree(newDegree, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__DEGREE, newDegree, newDegree));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisRecord getThesisRecord()
   {
      return thesisRecord;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetThesisRecord(ThesisRecord newThesisRecord, NotificationChain msgs)
   {
      ThesisRecord oldThesisRecord = thesisRecord;
      thesisRecord = newThesisRecord;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__THESIS_RECORD, oldThesisRecord,
               newThesisRecord);
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
   public void setThesisRecord(ThesisRecord newThesisRecord)
   {
      if (newThesisRecord != thesisRecord)
      {
         NotificationChain msgs = null;
         if (thesisRecord != null)
            msgs = ((InternalEObject) thesisRecord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.ENROLLMENT__THESIS_RECORD, null, msgs);
         if (newThesisRecord != null)
            msgs = ((InternalEObject) newThesisRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.ENROLLMENT__THESIS_RECORD, null, msgs);
         msgs = basicSetThesisRecord(newThesisRecord, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__THESIS_RECORD, newThesisRecord, newThesisRecord));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getCp()
   {
      return cp;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCp(int newCp)
   {
      int oldCp = cp;
      cp = newCp;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__CP, oldCp, cp));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EN_STATE getState()
   {
      return state;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setState(EN_STATE newState)
   {
      EN_STATE oldState = state;
      state = newState == null ? STATE_EDEFAULT : newState;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__STATE, oldState, state));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getRegCp()
   {
      return regCp;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRegCp(int newRegCp)
   {
      int oldRegCp = regCp;
      regCp = newRegCp;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__REG_CP, oldRegCp, regCp));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getStudId()
   {
      return studId;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setStudId(int newStudId)
   {
      int oldStudId = studId;
      studId = newStudId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__STUD_ID, oldStudId, studId));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isEnrolled()
   {
      return enrolled;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEnrolled(boolean newEnrolled)
   {
      boolean oldEnrolled = enrolled;
      enrolled = newEnrolled;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.ENROLLMENT__ENROLLED, oldEnrolled, enrolled));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void regForExam_v1(SystemTimer st, Exam ex)
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_0_1_EN_regExam_v1_blackBBFFBFFF(this, ex, st);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[ex] = " + ex + ", " + "[st] = " + st + ".");
      }
      Record record = (Record) result1_black[2];
      //nothing CoModOffer moduleOfferREG = (CoModOffer) result1_black[3];
      //nothing Semester sem = (Semester) result1_black[5];
      int record_tries_prime_1 = (int) result1_black[6];
      int ex_regSt_prime_1 = (int) result1_black[7];
      EnrollmentImpl.pattern_Enrollment_0_1_EN_regExam_v1_greenBBBB(ex, record, record_tries_prime_1, ex_regSt_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void unregFromExam_v1(Exam ex, SystemTimer system)
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_1_1_EN_unregExam_v1_blackBBFFFBFF(this, ex, system);
      if (result1_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[ex] = " + ex + ", " + "[system] = " + system + ".");
      }
      Record record = (Record) result1_black[2];
      //nothing CoModOffer moduleOffer = (CoModOffer) result1_black[3];
      //nothing Semester currSem = (Semester) result1_black[4];
      int ex_regSt_prime_1 = (int) result1_black[6];
      int record_tries_prime_1 = (int) result1_black[7];
      EnrollmentImpl.pattern_Enrollment_1_1_EN_unregExam_v1_redBB(ex, record);

      EnrollmentImpl.pattern_Enrollment_1_1_EN_unregExam_v1_greenBBBB(ex, record, ex_regSt_prime_1, record_tries_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void regForExam_v0(Exam ex)
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_2_1_EN_regExam_v0_blackBBFFFF(this, ex);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[ex] = " + ex + ".");
      }
      Record record = (Record) result1_black[2];
      //nothing CoModOffer moduleOfferREG = (CoModOffer) result1_black[3];
      int record_tries_prime_1 = (int) result1_black[4];
      int ex_regSt_prime_1 = (int) result1_black[5];
      EnrollmentImpl.pattern_Enrollment_2_1_EN_regExam_v0_greenBBBB(ex, record, record_tries_prime_1, ex_regSt_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void regForModule_v0(CoModOffer mo)
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_3_1_EN_regCMO_v0_blackBFFBFFF(this, mo);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[mo] = " + mo + ".");
      }
      //nothing Module module = (Module) result1_black[1];
      //nothing Program program = (Program) result1_black[2];
      int record_grade_prime_1 = (int) result1_black[4];
      int record_tries_prime_1 = (int) result1_black[5];
      int this_regCp_prime_1 = (int) result1_black[6];
      EnrollmentImpl.pattern_Enrollment_3_1_EN_regCMO_v0_greenBFBBBB(this, mo, record_grade_prime_1, record_tries_prime_1, this_regCp_prime_1);
      //nothing Record record = (Record) result1_green[1];

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void unregFromExam_v0(Exam ex)
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_4_1_EN_unregExam_v0_blackBBFFFF(this, ex);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[ex] = " + ex + ".");
      }
      Record record = (Record) result1_black[2];
      //nothing CoModOffer moduleOffer = (CoModOffer) result1_black[3];
      int ex_regSt_prime_1 = (int) result1_black[4];
      int record_tries_prime_1 = (int) result1_black[5];
      EnrollmentImpl.pattern_Enrollment_4_1_EN_unregExam_v0_redBB(ex, record);

      EnrollmentImpl.pattern_Enrollment_4_1_EN_unregExam_v0_greenBBBB(ex, record, ex_regSt_prime_1, record_tries_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void regForThesisModuleOffer_v0(ThesisModuleOffer thModOffer)
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_5_1_EN_regTMO_v0_blackBBFFFFF(this, thModOffer);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[thModOffer] = " + thModOffer + ".");
      }
      //nothing Program prog = (Program) result1_black[2];
      //nothing ThesisModule thesisModule = (ThesisModule) result1_black[3];
      EN_STATE this_state_prime_1 = (EN_STATE) result1_black[4];
      int thesisRecord_grade_prime_1 = (int) result1_black[5];
      int thesisRecord_tries_prime_1 = (int) result1_black[6];
      EnrollmentImpl.pattern_Enrollment_5_1_EN_regTMO_v0_greenBBFBBB(this, thModOffer, this_state_prime_1, thesisRecord_grade_prime_1,
            thesisRecord_tries_prime_1);
      //nothing ThesisRecord thesisRecord = (ThesisRecord) result1_green[2];

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void regForThesis_v0()
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_6_1_EN_regThesis_v0_blackBFFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ThesisModuleOffer thesisModOffer = (ThesisModuleOffer) result1_black[1];
      ThesisRecord thesisRecord = (ThesisRecord) result1_black[2];
      int thesisRecord_tries_prime_1 = (int) result1_black[3];
      EnrollmentImpl.pattern_Enrollment_6_1_EN_regThesis_v0_greenBBFB(thesisModOffer, thesisRecord, thesisRecord_tries_prime_1);
      //nothing Thesis thesis = (Thesis) result1_green[2];

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void obtainDegree_v0()
   {

      Object[] result1_black = EnrollmentImpl.pattern_Enrollment_7_1_EN_obtDeg_v0_blackBFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      //nothing Program prog = (Program) result1_black[1];
      EN_STATE this_state_prime_1 = (EN_STATE) result1_black[2];
      EnrollmentImpl.pattern_Enrollment_7_1_EN_obtDeg_v0_greenBFB(this, this_state_prime_1);
      //nothing Degree degree = (Degree) result1_green[1];

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
      case CmsNewPackage.ENROLLMENT__RECORDS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getRecords()).basicAdd(otherEnd, msgs);
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
      case CmsNewPackage.ENROLLMENT__RECORDS:
         return ((InternalEList<?>) getRecords()).basicRemove(otherEnd, msgs);
      case CmsNewPackage.ENROLLMENT__DEGREE:
         return basicSetDegree(null, msgs);
      case CmsNewPackage.ENROLLMENT__THESIS_RECORD:
         return basicSetThesisRecord(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CmsNewPackage.ENROLLMENT__RECORDS:
         return getRecords();
      case CmsNewPackage.ENROLLMENT__PROGRAM:
         if (resolve)
            return getProgram();
         return basicGetProgram();
      case CmsNewPackage.ENROLLMENT__DEGREE:
         return getDegree();
      case CmsNewPackage.ENROLLMENT__THESIS_RECORD:
         return getThesisRecord();
      case CmsNewPackage.ENROLLMENT__CP:
         return getCp();
      case CmsNewPackage.ENROLLMENT__STATE:
         return getState();
      case CmsNewPackage.ENROLLMENT__REG_CP:
         return getRegCp();
      case CmsNewPackage.ENROLLMENT__STUD_ID:
         return getStudId();
      case CmsNewPackage.ENROLLMENT__ENROLLED:
         return isEnrolled();
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
      case CmsNewPackage.ENROLLMENT__RECORDS:
         getRecords().clear();
         getRecords().addAll((Collection<? extends Record>) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__PROGRAM:
         setProgram((Program) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__DEGREE:
         setDegree((Degree) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__THESIS_RECORD:
         setThesisRecord((ThesisRecord) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__CP:
         setCp((Integer) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__STATE:
         setState((EN_STATE) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__REG_CP:
         setRegCp((Integer) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__STUD_ID:
         setStudId((Integer) newValue);
         return;
      case CmsNewPackage.ENROLLMENT__ENROLLED:
         setEnrolled((Boolean) newValue);
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
      case CmsNewPackage.ENROLLMENT__RECORDS:
         getRecords().clear();
         return;
      case CmsNewPackage.ENROLLMENT__PROGRAM:
         setProgram((Program) null);
         return;
      case CmsNewPackage.ENROLLMENT__DEGREE:
         setDegree((Degree) null);
         return;
      case CmsNewPackage.ENROLLMENT__THESIS_RECORD:
         setThesisRecord((ThesisRecord) null);
         return;
      case CmsNewPackage.ENROLLMENT__CP:
         setCp(CP_EDEFAULT);
         return;
      case CmsNewPackage.ENROLLMENT__STATE:
         setState(STATE_EDEFAULT);
         return;
      case CmsNewPackage.ENROLLMENT__REG_CP:
         setRegCp(REG_CP_EDEFAULT);
         return;
      case CmsNewPackage.ENROLLMENT__STUD_ID:
         setStudId(STUD_ID_EDEFAULT);
         return;
      case CmsNewPackage.ENROLLMENT__ENROLLED:
         setEnrolled(ENROLLED_EDEFAULT);
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
      case CmsNewPackage.ENROLLMENT__RECORDS:
         return records != null && !records.isEmpty();
      case CmsNewPackage.ENROLLMENT__PROGRAM:
         return program != null;
      case CmsNewPackage.ENROLLMENT__DEGREE:
         return degree != null;
      case CmsNewPackage.ENROLLMENT__THESIS_RECORD:
         return thesisRecord != null;
      case CmsNewPackage.ENROLLMENT__CP:
         return cp != CP_EDEFAULT;
      case CmsNewPackage.ENROLLMENT__STATE:
         return state != STATE_EDEFAULT;
      case CmsNewPackage.ENROLLMENT__REG_CP:
         return regCp != REG_CP_EDEFAULT;
      case CmsNewPackage.ENROLLMENT__STUD_ID:
         return studId != STUD_ID_EDEFAULT;
      case CmsNewPackage.ENROLLMENT__ENROLLED:
         return enrolled != ENROLLED_EDEFAULT;
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
      case CmsNewPackage.ENROLLMENT___REG_FOR_EXAM_V1__SYSTEMTIMER_EXAM:
         regForExam_v1((SystemTimer) arguments.get(0), (Exam) arguments.get(1));
         return null;
      case CmsNewPackage.ENROLLMENT___UNREG_FROM_EXAM_V1__EXAM_SYSTEMTIMER:
         unregFromExam_v1((Exam) arguments.get(0), (SystemTimer) arguments.get(1));
         return null;
      case CmsNewPackage.ENROLLMENT___REG_FOR_EXAM_V0__EXAM:
         regForExam_v0((Exam) arguments.get(0));
         return null;
      case CmsNewPackage.ENROLLMENT___REG_FOR_MODULE_V0__COMODOFFER:
         regForModule_v0((CoModOffer) arguments.get(0));
         return null;
      case CmsNewPackage.ENROLLMENT___UNREG_FROM_EXAM_V0__EXAM:
         unregFromExam_v0((Exam) arguments.get(0));
         return null;
      case CmsNewPackage.ENROLLMENT___REG_FOR_THESIS_MODULE_OFFER_V0__THESISMODULEOFFER:
         regForThesisModuleOffer_v0((ThesisModuleOffer) arguments.get(0));
         return null;
      case CmsNewPackage.ENROLLMENT___REG_FOR_THESIS_V0:
         regForThesis_v0();
         return null;
      case CmsNewPackage.ENROLLMENT___OBTAIN_DEGREE_V0:
         obtainDegree_v0();
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
      result.append(" (cp: ");
      result.append(cp);
      result.append(", state: ");
      result.append(state);
      result.append(", regCp: ");
      result.append(regCp);
      result.append(", studId: ");
      result.append(studId);
      result.append(", enrolled: ");
      result.append(enrolled);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_Enrollment_0_1_EN_regExam_v1_blackBBFFBFFF(Enrollment _this, Exam ex, SystemTimer st)
   {
      Semester sem = ex.getSemester();
      if (sem != null)
      {
         EN_STATE this_state = _this.getState();
         int ex_regSt = ex.getRegSt();
         boolean this_enrolled = _this.isEnrolled();
         if (this_enrolled == true)
         {
            int this_cp = _this.getCp();
            int this_regCp = _this.getRegCp();
            if (this_cp < this_regCp)
            {
               long st_currentTime = st.getCurrentTime();
               boolean sem_current = sem.isCurrent();
               if (sem_current == true)
               {
                  long sem_regPeriodStart = sem.getRegPeriodStart();
                  if (sem_regPeriodStart < st_currentTime)
                  {
                     long sem_regPeriodStop = sem.getRegPeriodStop();
                     if (sem_regPeriodStop > st_currentTime)
                     {
                        for (Record record : _this.getRecords())
                        {
                           CoModOffer moduleOfferREG = record.getModuleOffer();
                           if (moduleOfferREG != null)
                           {
                              if (ex.equals(moduleOfferREG.getExams()))
                              {
                                 int record_grade = record.getGrade();
                                 if (record_grade > 4)
                                 {
                                    int record_tries = record.getTries();
                                    boolean is_STUDY_STATE;

                                    is_STUDY_STATE = (this_state == EN_STATE.EN_STUDY);
                                    boolean is_THESIS_STATE;

                                    is_THESIS_STATE = (this_state == EN_STATE.EN_WRITE_THESIS);
                                    if (is_STUDY_STATE || is_THESIS_STATE)
                                    {
                                       int ex_regSt_prime;

                                       ex_regSt_prime = ex_regSt + 1;
                                       int record_tries_prime;

                                       record_tries_prime = record_tries + 1;
                                       if (record_tries_prime <= 3)
                                       {
                                          return new Object[] { _this, ex, record, moduleOfferREG, st, sem, record_tries_prime, ex_regSt_prime };
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

   public static final Object[] pattern_Enrollment_0_1_EN_regExam_v1_greenBBBB(Exam ex, Record record, int record_tries_prime, int ex_regSt_prime)
   {
      record.setExam(ex);
      record.setTries(Integer.valueOf(record_tries_prime));
      ex.setRegSt(Integer.valueOf(ex_regSt_prime));
      return new Object[] { ex, record, record_tries_prime, ex_regSt_prime };
   }

   public static final Object[] pattern_Enrollment_1_1_EN_unregExam_v1_blackBBFFFBFF(Enrollment _this, Exam ex, SystemTimer system)
   {
      Semester currSem = ex.getSemester();
      if (currSem != null)
      {
         int ex_regSt = ex.getRegSt();
         EN_STATE this_state = _this.getState();
         int this_cp = _this.getCp();
         int this_regCp = _this.getRegCp();
         if (this_cp < this_regCp)
         {
            long system_currentTime = system.getCurrentTime();
            boolean currSem_current = currSem.isCurrent();
            if (currSem_current == true)
            {
               long currSem_regPeriodStart = currSem.getRegPeriodStart();
               if (system_currentTime > currSem_regPeriodStart)
               {
                  long currSem_regPeriodStop = currSem.getRegPeriodStop();
                  if (system_currentTime < currSem_regPeriodStop)
                  {
                     for (Record record : _this.getRecords())
                     {
                        if (ex.equals(record.getExam()))
                        {
                           CoModOffer moduleOffer = record.getModuleOffer();
                           if (moduleOffer != null)
                           {
                              if (ex.equals(moduleOffer.getExams()))
                              {
                                 int record_tries = record.getTries();
                                 int ex_regSt_prime;

                                 ex_regSt_prime = ex_regSt - 1;
                                 boolean is_STUDY_STATE;

                                 is_STUDY_STATE = (this_state == EN_STATE.EN_STUDY);
                                 boolean is_THESIS_STATE;

                                 is_THESIS_STATE = (this_state == EN_STATE.EN_WRITE_THESIS);
                                 if (is_STUDY_STATE || is_THESIS_STATE)
                                 {
                                    int record_tries_prime;

                                    record_tries_prime = record_tries - 1;
                                    return new Object[] { _this, ex, record, moduleOffer, currSem, system, ex_regSt_prime, record_tries_prime };
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

   public static final Object[] pattern_Enrollment_1_1_EN_unregExam_v1_redBB(Exam ex, Record record)
   {
      record.setExam(null);
      return new Object[] { ex, record };
   }

   public static final Object[] pattern_Enrollment_1_1_EN_unregExam_v1_greenBBBB(Exam ex, Record record, int ex_regSt_prime, int record_tries_prime)
   {
      ex.setRegSt(Integer.valueOf(ex_regSt_prime));
      record.setTries(Integer.valueOf(record_tries_prime));
      return new Object[] { ex, record, ex_regSt_prime, record_tries_prime };
   }

   public static final Object[] pattern_Enrollment_2_1_EN_regExam_v0_blackBBFFFF(Enrollment _this, Exam ex)
   {
      EN_STATE this_state = _this.getState();
      int ex_regSt = ex.getRegSt();
      boolean this_enrolled = _this.isEnrolled();
      if (this_enrolled == true)
      {
         int this_cp = _this.getCp();
         int this_regCp = _this.getRegCp();
         if (this_cp < this_regCp)
         {
            for (Record record : _this.getRecords())
            {
               CoModOffer moduleOfferREG = record.getModuleOffer();
               if (moduleOfferREG != null)
               {
                  if (ex.equals(moduleOfferREG.getExams()))
                  {
                     int record_grade = record.getGrade();
                     if (record_grade > 4)
                     {
                        int record_tries = record.getTries();
                        boolean is_STUDY_STATE;

                        is_STUDY_STATE = (this_state == EN_STATE.EN_STUDY);
                        boolean is_THESIS_STATE;

                        is_THESIS_STATE = (this_state == EN_STATE.EN_WRITE_THESIS);
                        if (is_STUDY_STATE || is_THESIS_STATE)
                        {
                           int ex_regSt_prime;

                           ex_regSt_prime = ex_regSt + 1;
                           int record_tries_prime;

                           record_tries_prime = record_tries + 1;
                           if (record_tries_prime <= 3)
                           {
                              return new Object[] { _this, ex, record, moduleOfferREG, record_tries_prime, ex_regSt_prime };
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

   public static final Object[] pattern_Enrollment_2_1_EN_regExam_v0_greenBBBB(Exam ex, Record record, int record_tries_prime, int ex_regSt_prime)
   {
      record.setExam(ex);
      record.setTries(Integer.valueOf(record_tries_prime));
      ex.setRegSt(Integer.valueOf(ex_regSt_prime));
      return new Object[] { ex, record, record_tries_prime, ex_regSt_prime };
   }

   public static final Object[] pattern_Enrollment_3_1_EN_regCMO_v0_blackBFFBFFF(Enrollment _this, CoModOffer mo)
   {
      Program program = _this.getProgram();
      if (program != null)
      {
         EN_STATE this_state = _this.getState();
         int mo_cp = mo.getCp();
         if (mo_cp >= 0)
         {
            int this_regCp = _this.getRegCp();
            boolean this_enrolled = _this.isEnrolled();
            if (this_enrolled == true)
            {
               int program_reqCp = program.getReqCp();
               if (this_regCp < program_reqCp)
               {
                  for (Module module : program.getModules())
                  {
                     if (mo.equals(module.getCurrent()))
                     {
                        int record_grade_prime;

                        record_grade_prime = 6;
                        int record_tries_prime;

                        record_tries_prime = 0;
                        boolean is_STUDY_STATE;

                        is_STUDY_STATE = (this_state == EN_STATE.EN_STUDY);
                        boolean is_THESIS_STATE;

                        is_THESIS_STATE = (this_state == EN_STATE.EN_WRITE_THESIS);
                        if (is_STUDY_STATE || is_THESIS_STATE)
                        {
                           int this_regCp_prime;

                           this_regCp_prime = this_regCp + mo_cp;
                           return new Object[] { _this, module, program, mo, record_grade_prime, record_tries_prime, this_regCp_prime };
                        }
                     }
                  }
               }
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_Enrollment_3_1_EN_regCMO_v0_greenBFBBBB(Enrollment _this, CoModOffer mo, int record_grade_prime, int record_tries_prime,
         int this_regCp_prime)
   {
      Record record = CmsNewFactory.eINSTANCE.createRecord();
      _this.setRegCp(Integer.valueOf(this_regCp_prime));
      record.setEnrollment(_this);
      record.setModuleOffer(mo);
      record.setGrade(Integer.valueOf(record_grade_prime));
      record.setTries(Integer.valueOf(record_tries_prime));
      return new Object[] { _this, record, mo, record_grade_prime, record_tries_prime, this_regCp_prime };
   }

   public static final Object[] pattern_Enrollment_4_1_EN_unregExam_v0_blackBBFFFF(Enrollment _this, Exam ex)
   {
      int ex_regSt = ex.getRegSt();
      EN_STATE this_state = _this.getState();
      int this_cp = _this.getCp();
      int this_regCp = _this.getRegCp();
      if (this_cp < this_regCp)
      {
         for (Record record : _this.getRecords())
         {
            if (ex.equals(record.getExam()))
            {
               CoModOffer moduleOffer = record.getModuleOffer();
               if (moduleOffer != null)
               {
                  if (ex.equals(moduleOffer.getExams()))
                  {
                     int record_tries = record.getTries();
                     int ex_regSt_prime;

                     ex_regSt_prime = ex_regSt - 1;
                     boolean is_STUDY_STATE;

                     is_STUDY_STATE = (this_state == EN_STATE.EN_STUDY);
                     boolean is_THESIS_STATE;

                     is_THESIS_STATE = (this_state == EN_STATE.EN_WRITE_THESIS);
                     if (is_STUDY_STATE || is_THESIS_STATE)
                     {
                        int record_tries_prime;

                        record_tries_prime = record_tries - 1;
                        return new Object[] { _this, ex, record, moduleOffer, ex_regSt_prime, record_tries_prime };
                     }

                  }
               }

            }
         }
      }

      return null;
   }

   public static final Object[] pattern_Enrollment_4_1_EN_unregExam_v0_redBB(Exam ex, Record record)
   {
      record.setExam(null);
      return new Object[] { ex, record };
   }

   public static final Object[] pattern_Enrollment_4_1_EN_unregExam_v0_greenBBBB(Exam ex, Record record, int ex_regSt_prime, int record_tries_prime)
   {
      ex.setRegSt(Integer.valueOf(ex_regSt_prime));
      record.setTries(Integer.valueOf(record_tries_prime));
      return new Object[] { ex, record, ex_regSt_prime, record_tries_prime };
   }

   public static final Object[] pattern_Enrollment_5_1_EN_regTMO_v0_blackBBFFFFF(Enrollment _this, ThesisModuleOffer thModOffer)
   {
      Program prog = _this.getProgram();
      if (prog != null)
      {
         EN_STATE this_state = _this.getState();
         if (this_state == EN_STATE.EN_STUDY)
         {
            int this_cp = _this.getCp();
            if (this_cp >= 130)
            {
               boolean this_enrolled = _this.isEnrolled();
               if (this_enrolled == true)
               {
                  ThesisModule thesisModule = prog.getThesisModules();
                  if (thesisModule != null)
                  {
                     if (thModOffer.equals(thesisModule.getActThesModOffer()))
                     {
                        EN_STATE this_state_prime;

                        this_state_prime = EN_STATE.EN_WRITE_THESIS;
                        int thesisRecord_grade_prime;

                        thesisRecord_grade_prime = 6;
                        int thesisRecord_tries_prime;

                        thesisRecord_tries_prime = 1;
                        return new Object[] { _this, thModOffer, prog, thesisModule, this_state_prime, thesisRecord_grade_prime, thesisRecord_tries_prime };
                     }
                  }
               }
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_Enrollment_5_1_EN_regTMO_v0_greenBBFBBB(Enrollment _this, ThesisModuleOffer thModOffer, EN_STATE this_state_prime,
         int thesisRecord_grade_prime, int thesisRecord_tries_prime)
   {
      ThesisRecord thesisRecord = CmsNewFactory.eINSTANCE.createThesisRecord();
      _this.setState(this_state_prime);
      _this.setThesisRecord(thesisRecord);
      thesisRecord.setThesisOffer(thModOffer);
      thesisRecord.setGrade(Integer.valueOf(thesisRecord_grade_prime));
      thesisRecord.setTries(Integer.valueOf(thesisRecord_tries_prime));
      return new Object[] { _this, thModOffer, thesisRecord, this_state_prime, thesisRecord_grade_prime, thesisRecord_tries_prime };
   }

   public static final Object[] pattern_Enrollment_6_1_EN_regThesis_v0_blackBFFF(Enrollment _this)
   {
      ThesisRecord thesisRecord = _this.getThesisRecord();
      if (thesisRecord != null)
      {
         EN_STATE this_state = _this.getState();
         if (this_state == EN_STATE.EN_WRITE_THESIS)
         {
            boolean this_enrolled = _this.isEnrolled();
            if (this_enrolled == true)
            {
               int this_cp = _this.getCp();
               int this_regCp = _this.getRegCp();
               if (this_cp < this_regCp)
               {
                  ThesisModuleOffer thesisModOffer = thesisRecord.getThesisOffer();
                  if (thesisModOffer != null)
                  {
                     int thesisRecord_grade = thesisRecord.getGrade();
                     if (thesisRecord_grade > 4)
                     {
                        int thesisRecord_tries = thesisRecord.getTries();
                        int thesisRecord_tries_prime;

                        thesisRecord_tries_prime = thesisRecord_tries + 1;
                        if (thesisRecord_tries_prime <= 2)
                        {
                           return new Object[] { _this, thesisModOffer, thesisRecord, thesisRecord_tries_prime };
                        }
                     }

                  }
               }

            }
         }

      }

      return null;
   }

   public static final Object[] pattern_Enrollment_6_1_EN_regThesis_v0_greenBBFB(ThesisModuleOffer thesisModOffer, ThesisRecord thesisRecord,
         int thesisRecord_tries_prime)
   {
      Thesis thesis = CmsNewFactory.eINSTANCE.createThesis();
      thesisRecord.setTries(Integer.valueOf(thesisRecord_tries_prime));
      thesisModOffer.getThesiss().add(thesis);
      thesisRecord.setThesis(thesis);
      return new Object[] { thesisModOffer, thesisRecord, thesis, thesisRecord_tries_prime };
   }

   public static final Object[] pattern_Enrollment_7_1_EN_obtDeg_v0_blackBFF(Enrollment _this)
   {
      Program prog = _this.getProgram();
      if (prog != null)
      {
         int this_cp = _this.getCp();
         int this_regCp = _this.getRegCp();
         if (this_cp >= this_regCp)
         {
            EN_STATE this_state = _this.getState();
            if (this_state == EN_STATE.EN_WRITE_THESIS)
            {
               boolean this_enrolled = _this.isEnrolled();
               if (this_enrolled == true)
               {
                  int prog_reqCp = prog.getReqCp();
                  if (this_regCp >= prog_reqCp)
                  {
                     EN_STATE this_state_prime;

                     this_state_prime = EN_STATE.EN_STOP;
                     return new Object[] { _this, prog, this_state_prime };
                  }
               }
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_Enrollment_7_1_EN_obtDeg_v0_greenBFB(Enrollment _this, EN_STATE this_state_prime)
   {
      Degree degree = CmsNewFactory.eINSTANCE.createDegree();
      _this.setState(this_state_prime);
      _this.setDegree(degree);
      return new Object[] { _this, degree, this_state_prime };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //EnrollmentImpl
