/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.ThesisModule;
import org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thesis Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleImpl#getActThesModOffer <em>Act Thes Mod Offer</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisModuleImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThesisModuleImpl extends EObjectImpl implements ThesisModule
{
   /**
    * The cached value of the '{@link #getActThesModOffer() <em>Act Thes Mod Offer</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getActThesModOffer()
    * @generated
    * @ordered
    */
   protected ThesisModuleOffer actThesModOffer;

   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final long ID_EDEFAULT = 0L;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected long id = ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ThesisModuleImpl()
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
      return CmsNewPackage.Literals.THESIS_MODULE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisModuleOffer getActThesModOffer()
   {
      return actThesModOffer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetActThesModOffer(ThesisModuleOffer newActThesModOffer, NotificationChain msgs)
   {
      ThesisModuleOffer oldActThesModOffer = actThesModOffer;
      actThesModOffer = newActThesModOffer;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER, oldActThesModOffer,
               newActThesModOffer);
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
   public void setActThesModOffer(ThesisModuleOffer newActThesModOffer)
   {
      if (newActThesModOffer != actThesModOffer)
      {
         NotificationChain msgs = null;
         if (actThesModOffer != null)
            msgs = ((InternalEObject) actThesModOffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER, null,
                  msgs);
         if (newActThesModOffer != null)
            msgs = ((InternalEObject) newActThesModOffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER, null,
                  msgs);
         msgs = basicSetActThesModOffer(newActThesModOffer, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER, newActThesModOffer, newActThesModOffer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getId()
   {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setId(long newId)
   {
      long oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_MODULE__ID, oldId, id));
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
      case CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER:
         return basicSetActThesModOffer(null, msgs);
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
      case CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER:
         return getActThesModOffer();
      case CmsNewPackage.THESIS_MODULE__ID:
         return getId();
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
      case CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER:
         setActThesModOffer((ThesisModuleOffer) newValue);
         return;
      case CmsNewPackage.THESIS_MODULE__ID:
         setId((Long) newValue);
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
      case CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER:
         setActThesModOffer((ThesisModuleOffer) null);
         return;
      case CmsNewPackage.THESIS_MODULE__ID:
         setId(ID_EDEFAULT);
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
      case CmsNewPackage.THESIS_MODULE__ACT_THES_MOD_OFFER:
         return actThesModOffer != null;
      case CmsNewPackage.THESIS_MODULE__ID:
         return id != ID_EDEFAULT;
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
      result.append(" (id: ");
      result.append(id);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ThesisModuleImpl
