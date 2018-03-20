/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.Module;
import org.moflon.maave.tests.lang.cmsNew.Program;
import org.moflon.maave.tests.lang.cmsNew.ThesisModule;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl#getThesisModules <em>Thesis Modules</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl#getReqCp <em>Req Cp</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ProgramImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends EObjectImpl implements Program
{
   /**
    * The cached value of the '{@link #getThesisModules() <em>Thesis Modules</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getThesisModules()
    * @generated
    * @ordered
    */
   protected ThesisModule thesisModules;

   /**
    * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getModules()
    * @generated
    * @ordered
    */
   protected EList<Module> modules;

   /**
    * The default value of the '{@link #getReqCp() <em>Req Cp</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReqCp()
    * @generated
    * @ordered
    */
   protected static final int REQ_CP_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getReqCp() <em>Req Cp</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReqCp()
    * @generated
    * @ordered
    */
   protected int reqCp = REQ_CP_EDEFAULT;

   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final int ID_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected int id = ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProgramImpl()
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
      return CmsNewPackage.Literals.PROGRAM;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ThesisModule getThesisModules()
   {
      return thesisModules;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetThesisModules(ThesisModule newThesisModules, NotificationChain msgs)
   {
      ThesisModule oldThesisModules = thesisModules;
      thesisModules = newThesisModules;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.PROGRAM__THESIS_MODULES, oldThesisModules,
               newThesisModules);
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
   public void setThesisModules(ThesisModule newThesisModules)
   {
      if (newThesisModules != thesisModules)
      {
         NotificationChain msgs = null;
         if (thesisModules != null)
            msgs = ((InternalEObject) thesisModules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.PROGRAM__THESIS_MODULES, null, msgs);
         if (newThesisModules != null)
            msgs = ((InternalEObject) newThesisModules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmsNewPackage.PROGRAM__THESIS_MODULES, null, msgs);
         msgs = basicSetThesisModules(newThesisModules, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.PROGRAM__THESIS_MODULES, newThesisModules, newThesisModules));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Module> getModules()
   {
      if (modules == null)
      {
         modules = new EObjectResolvingEList<Module>(Module.class, this, CmsNewPackage.PROGRAM__MODULES);
      }
      return modules;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getReqCp()
   {
      return reqCp;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setReqCp(int newReqCp)
   {
      int oldReqCp = reqCp;
      reqCp = newReqCp;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.PROGRAM__REQ_CP, oldReqCp, reqCp));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getId()
   {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setId(int newId)
   {
      int oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.PROGRAM__ID, oldId, id));
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
      case CmsNewPackage.PROGRAM__THESIS_MODULES:
         return basicSetThesisModules(null, msgs);
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
      case CmsNewPackage.PROGRAM__THESIS_MODULES:
         return getThesisModules();
      case CmsNewPackage.PROGRAM__MODULES:
         return getModules();
      case CmsNewPackage.PROGRAM__REQ_CP:
         return getReqCp();
      case CmsNewPackage.PROGRAM__ID:
         return getId();
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
      case CmsNewPackage.PROGRAM__THESIS_MODULES:
         setThesisModules((ThesisModule) newValue);
         return;
      case CmsNewPackage.PROGRAM__MODULES:
         getModules().clear();
         getModules().addAll((Collection<? extends Module>) newValue);
         return;
      case CmsNewPackage.PROGRAM__REQ_CP:
         setReqCp((Integer) newValue);
         return;
      case CmsNewPackage.PROGRAM__ID:
         setId((Integer) newValue);
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
      case CmsNewPackage.PROGRAM__THESIS_MODULES:
         setThesisModules((ThesisModule) null);
         return;
      case CmsNewPackage.PROGRAM__MODULES:
         getModules().clear();
         return;
      case CmsNewPackage.PROGRAM__REQ_CP:
         setReqCp(REQ_CP_EDEFAULT);
         return;
      case CmsNewPackage.PROGRAM__ID:
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
      case CmsNewPackage.PROGRAM__THESIS_MODULES:
         return thesisModules != null;
      case CmsNewPackage.PROGRAM__MODULES:
         return modules != null && !modules.isEmpty();
      case CmsNewPackage.PROGRAM__REQ_CP:
         return reqCp != REQ_CP_EDEFAULT;
      case CmsNewPackage.PROGRAM__ID:
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
      result.append(" (reqCp: ");
      result.append(reqCp);
      result.append(", id: ");
      result.append(id);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ProgramImpl
