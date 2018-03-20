/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.TH_STATE;
import org.moflon.maave.tests.lang.cmsNew.Thesis;
import org.moflon.maave.tests.lang.cmsNew.ThesisRecord;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThesisImpl extends EObjectImpl implements Thesis
{
   /**
    * The cached value of the '{@link #getRecord() <em>Record</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRecord()
    * @generated
    * @ordered
    */
   protected ThesisRecord record;

   /**
    * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGrade()
    * @generated
    * @ordered
    */
   protected static final int GRADE_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGrade()
    * @generated
    * @ordered
    */
   protected int grade = GRADE_EDEFAULT;

   /**
    * The default value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected static final TH_STATE STATE_EDEFAULT = TH_STATE.TH_CREATED;

   /**
    * The cached value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected TH_STATE state = STATE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ThesisImpl()
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
      return CmsNewPackage.Literals.THESIS;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisRecord getRecord()
   {
      if (record != null && record.eIsProxy())
      {
         InternalEObject oldRecord = (InternalEObject) record;
         record = (ThesisRecord) eResolveProxy(oldRecord);
         if (record != oldRecord)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.THESIS__RECORD, oldRecord, record));
         }
      }
      return record;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisRecord basicGetRecord()
   {
      return record;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRecord(ThesisRecord newRecord, NotificationChain msgs)
   {
      ThesisRecord oldRecord = record;
      record = newRecord;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS__RECORD, oldRecord, newRecord);
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
   public void setRecord(ThesisRecord newRecord)
   {
      if (newRecord != record)
      {
         NotificationChain msgs = null;
         if (record != null)
            msgs = ((InternalEObject) record).eInverseRemove(this, CmsNewPackage.THESIS_RECORD__THESIS, ThesisRecord.class, msgs);
         if (newRecord != null)
            msgs = ((InternalEObject) newRecord).eInverseAdd(this, CmsNewPackage.THESIS_RECORD__THESIS, ThesisRecord.class, msgs);
         msgs = basicSetRecord(newRecord, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS__RECORD, newRecord, newRecord));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getGrade()
   {
      return grade;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGrade(int newGrade)
   {
      int oldGrade = grade;
      grade = newGrade;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS__GRADE, oldGrade, grade));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TH_STATE getState()
   {
      return state;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setState(TH_STATE newState)
   {
      TH_STATE oldState = state;
      state = newState == null ? STATE_EDEFAULT : newState;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS__STATE, oldState, state));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void enterGrade_v0()
   {

      Object[] result1_black = ThesisImpl.pattern_Thesis_0_1_TH_enterGrade_v0_blackBFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ThesisRecord thRec = (ThesisRecord) result1_black[1];
      int thRec_grade_prime_1 = (int) result1_black[2];
      ThesisImpl.pattern_Thesis_0_1_TH_enterGrade_v0_greenBB(thRec, thRec_grade_prime_1);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case CmsNewPackage.THESIS__RECORD:
         if (record != null)
            msgs = ((InternalEObject) record).eInverseRemove(this, CmsNewPackage.THESIS_RECORD__THESIS, ThesisRecord.class, msgs);
         return basicSetRecord((ThesisRecord) otherEnd, msgs);
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
      case CmsNewPackage.THESIS__RECORD:
         return basicSetRecord(null, msgs);
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
      case CmsNewPackage.THESIS__RECORD:
         if (resolve)
            return getRecord();
         return basicGetRecord();
      case CmsNewPackage.THESIS__GRADE:
         return getGrade();
      case CmsNewPackage.THESIS__STATE:
         return getState();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case CmsNewPackage.THESIS__RECORD:
         setRecord((ThesisRecord) newValue);
         return;
      case CmsNewPackage.THESIS__GRADE:
         setGrade((Integer) newValue);
         return;
      case CmsNewPackage.THESIS__STATE:
         setState((TH_STATE) newValue);
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
      case CmsNewPackage.THESIS__RECORD:
         setRecord((ThesisRecord) null);
         return;
      case CmsNewPackage.THESIS__GRADE:
         setGrade(GRADE_EDEFAULT);
         return;
      case CmsNewPackage.THESIS__STATE:
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
      case CmsNewPackage.THESIS__RECORD:
         return record != null;
      case CmsNewPackage.THESIS__GRADE:
         return grade != GRADE_EDEFAULT;
      case CmsNewPackage.THESIS__STATE:
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
      case CmsNewPackage.THESIS___ENTER_GRADE_V0:
         enterGrade_v0();
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
      result.append(" (grade: ");
      result.append(grade);
      result.append(", state: ");
      result.append(state);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_Thesis_0_1_TH_enterGrade_v0_blackBFF(Thesis _this)
   {
      ThesisRecord thRec = _this.getRecord();
      if (thRec != null)
      {
         TH_STATE this_state = _this.getState();
         if (this_state == TH_STATE.TH_FINISHED)
         {
            int this_grade = _this.getGrade();
            int thRec_grade_prime;

            thRec_grade_prime = this_grade;
            return new Object[] { _this, thRec, thRec_grade_prime };
         }

      }

      return null;
   }

   public static final Object[] pattern_Thesis_0_1_TH_enterGrade_v0_greenBB(ThesisRecord thRec, int thRec_grade_prime)
   {
      thRec.setGrade(Integer.valueOf(thRec_grade_prime));
      return new Object[] { thRec, thRec_grade_prime };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ThesisImpl
