/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.Entry;
import org.moflon.maave.tests.lang.cmsNew.GradeFormular;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade Formular</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.GradeFormularImpl#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeFormularImpl extends EObjectImpl implements GradeFormular
{
   /**
    * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRecords()
    * @generated
    * @ordered
    */
   protected EList<Entry> records;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GradeFormularImpl()
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
      return CmsNewPackage.Literals.GRADE_FORMULAR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Entry> getRecords()
   {
      if (records == null)
      {
         records = new EObjectContainmentEList<Entry>(Entry.class, this, CmsNewPackage.GRADE_FORMULAR__RECORDS);
      }
      return records;
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
      case CmsNewPackage.GRADE_FORMULAR__RECORDS:
         return ((InternalEList<?>) getRecords()).basicRemove(otherEnd, msgs);
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
      case CmsNewPackage.GRADE_FORMULAR__RECORDS:
         return getRecords();
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
      case CmsNewPackage.GRADE_FORMULAR__RECORDS:
         getRecords().clear();
         getRecords().addAll((Collection<? extends Entry>) newValue);
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
      case CmsNewPackage.GRADE_FORMULAR__RECORDS:
         getRecords().clear();
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
      case CmsNewPackage.GRADE_FORMULAR__RECORDS:
         return records != null && !records.isEmpty();
      }
      return super.eIsSet(featureID);
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //GradeFormularImpl
