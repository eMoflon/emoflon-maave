/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.SystemTimer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SystemTimerImpl#getCurrentTime <em>Current Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemTimerImpl extends EObjectImpl implements SystemTimer
{
   /**
    * The default value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCurrentTime()
    * @generated
    * @ordered
    */
   protected static final long CURRENT_TIME_EDEFAULT = 0L;

   /**
    * The cached value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCurrentTime()
    * @generated
    * @ordered
    */
   protected long currentTime = CURRENT_TIME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SystemTimerImpl()
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
      return CmsNewPackage.Literals.SYSTEM_TIMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getCurrentTime()
   {
      return currentTime;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCurrentTime(long newCurrentTime)
   {
      long oldCurrentTime = currentTime;
      currentTime = newCurrentTime;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SYSTEM_TIMER__CURRENT_TIME, oldCurrentTime, currentTime));
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
      case CmsNewPackage.SYSTEM_TIMER__CURRENT_TIME:
         return getCurrentTime();
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
      case CmsNewPackage.SYSTEM_TIMER__CURRENT_TIME:
         setCurrentTime((Long) newValue);
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
      case CmsNewPackage.SYSTEM_TIMER__CURRENT_TIME:
         setCurrentTime(CURRENT_TIME_EDEFAULT);
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
      case CmsNewPackage.SYSTEM_TIMER__CURRENT_TIME:
         return currentTime != CURRENT_TIME_EDEFAULT;
      }
      return super.eIsSet(featureID);
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
      result.append(" (currentTime: ");
      result.append(currentTime);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //SystemTimerImpl
