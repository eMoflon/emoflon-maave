/**
 */
package org.moflon.maave.tests.lang.rbac.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.rbac.DsdRelation;
import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.Role;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsd Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.DsdRelationImpl#getDsdExclusiveRole <em>Dsd Exclusive Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DsdRelationImpl extends EObjectImpl implements DsdRelation {
	/**
	 * The cached value of the '{@link #getDsdExclusiveRole() <em>Dsd Exclusive Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsdExclusiveRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> dsdExclusiveRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DsdRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.DSD_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getDsdExclusiveRole() {
		if (dsdExclusiveRole == null) {
			dsdExclusiveRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE, RbacPackage.ROLE__DSD_RELATION);
		}
		return dsdExclusiveRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDsdExclusiveRole()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE:
			return ((InternalEList<?>) getDsdExclusiveRole()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE:
			return getDsdExclusiveRole();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE:
			getDsdExclusiveRole().clear();
			getDsdExclusiveRole().addAll((Collection<? extends Role>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE:
			getDsdExclusiveRole().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RbacPackage.DSD_RELATION__DSD_EXCLUSIVE_ROLE:
			return dsdExclusiveRole != null && !dsdExclusiveRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DsdRelationImpl
