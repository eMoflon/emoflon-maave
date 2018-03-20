/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.moflon.maave.tests.lang.cmsNew.Booking;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.Room;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.BookingImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.BookingImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.BookingImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends EObjectImpl implements Booking
{
   /**
    * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBegin()
    * @generated
    * @ordered
    */
   protected static final long BEGIN_EDEFAULT = 0L;

   /**
    * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBegin()
    * @generated
    * @ordered
    */
   protected long begin = BEGIN_EDEFAULT;

   /**
    * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEnd()
    * @generated
    * @ordered
    */
   protected static final long END_EDEFAULT = 0L;

   /**
    * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEnd()
    * @generated
    * @ordered
    */
   protected long end = END_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BookingImpl()
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
      return CmsNewPackage.Literals.BOOKING;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Room getRoom()
   {
      if (eContainerFeatureID() != CmsNewPackage.BOOKING__ROOM)
         return null;
      return (Room) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newRoom, CmsNewPackage.BOOKING__ROOM, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRoom(Room newRoom)
   {
      if (newRoom != eInternalContainer() || (eContainerFeatureID() != CmsNewPackage.BOOKING__ROOM && newRoom != null))
      {
         if (EcoreUtil.isAncestor(this, newRoom))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newRoom != null)
            msgs = ((InternalEObject) newRoom).eInverseAdd(this, CmsNewPackage.ROOM__RESERVATIONS, Room.class, msgs);
         msgs = basicSetRoom(newRoom, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.BOOKING__ROOM, newRoom, newRoom));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getBegin()
   {
      return begin;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBegin(long newBegin)
   {
      long oldBegin = begin;
      begin = newBegin;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.BOOKING__BEGIN, oldBegin, begin));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getEnd()
   {
      return end;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEnd(long newEnd)
   {
      long oldEnd = end;
      end = newEnd;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.BOOKING__END, oldEnd, end));
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
      case CmsNewPackage.BOOKING__ROOM:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetRoom((Room) otherEnd, msgs);
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
      case CmsNewPackage.BOOKING__ROOM:
         return basicSetRoom(null, msgs);
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
      case CmsNewPackage.BOOKING__ROOM:
         return eInternalContainer().eInverseRemove(this, CmsNewPackage.ROOM__RESERVATIONS, Room.class, msgs);
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
      case CmsNewPackage.BOOKING__ROOM:
         return getRoom();
      case CmsNewPackage.BOOKING__BEGIN:
         return getBegin();
      case CmsNewPackage.BOOKING__END:
         return getEnd();
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
      case CmsNewPackage.BOOKING__ROOM:
         setRoom((Room) newValue);
         return;
      case CmsNewPackage.BOOKING__BEGIN:
         setBegin((Long) newValue);
         return;
      case CmsNewPackage.BOOKING__END:
         setEnd((Long) newValue);
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
      case CmsNewPackage.BOOKING__ROOM:
         setRoom((Room) null);
         return;
      case CmsNewPackage.BOOKING__BEGIN:
         setBegin(BEGIN_EDEFAULT);
         return;
      case CmsNewPackage.BOOKING__END:
         setEnd(END_EDEFAULT);
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
      case CmsNewPackage.BOOKING__ROOM:
         return getRoom() != null;
      case CmsNewPackage.BOOKING__BEGIN:
         return begin != BEGIN_EDEFAULT;
      case CmsNewPackage.BOOKING__END:
         return end != END_EDEFAULT;
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
      result.append(" (begin: ");
      result.append(begin);
      result.append(", end: ");
      result.append(end);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //BookingImpl
