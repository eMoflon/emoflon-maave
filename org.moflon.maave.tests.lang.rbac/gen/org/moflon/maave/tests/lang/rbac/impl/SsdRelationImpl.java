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

import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.Role;
import org.moflon.maave.tests.lang.rbac.SsdRelation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssd Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.rbac.impl.SsdRelationImpl#getSsdExclusiveRoles <em>Ssd Exclusive Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SsdRelationImpl extends EObjectImpl implements SsdRelation {
	/**
	 * The cached value of the '{@link #getSsdExclusiveRoles() <em>Ssd Exclusive Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsdExclusiveRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> ssdExclusiveRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsdRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.SSD_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getSsdExclusiveRoles() {
		if (ssdExclusiveRoles == null) {
			ssdExclusiveRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES, RbacPackage.ROLE__SSD_RELATION);
		}
		return ssdExclusiveRoles;
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
		case RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSsdExclusiveRoles()).basicAdd(otherEnd,
					msgs);
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
		case RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES:
			return ((InternalEList<?>) getSsdExclusiveRoles()).basicRemove(otherEnd, msgs);
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
		case RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES:
			return getSsdExclusiveRoles();
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
		case RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES:
			getSsdExclusiveRoles().clear();
			getSsdExclusiveRoles().addAll((Collection<? extends Role>) newValue);
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
		case RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES:
			getSsdExclusiveRoles().clear();
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
		case RbacPackage.SSD_RELATION__SSD_EXCLUSIVE_ROLES:
			return ssdExclusiveRoles != null && !ssdExclusiveRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SsdRelationImpl
