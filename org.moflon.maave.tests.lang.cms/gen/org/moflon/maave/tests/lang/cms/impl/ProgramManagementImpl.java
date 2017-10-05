/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.Module;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
import org.moflon.maave.tests.lang.cms.Program;
import org.moflon.maave.tests.lang.cms.ProgramManagement;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ProgramManagementImpl#getModuleOffers <em>Module Offers</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ProgramManagementImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ProgramManagementImpl#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramManagementImpl extends EObjectImpl implements ProgramManagement {
	/**
	 * The cached value of the '{@link #getModuleOffers() <em>Module Offers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleOffer> moduleOffers;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.PROGRAM_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleOffer> getModuleOffers() {
		if (moduleOffers == null) {
			moduleOffers = new EObjectContainmentEList<ModuleOffer>(ModuleOffer.class, this,
					CmsPackage.PROGRAM_MANAGEMENT__MODULE_OFFERS);
		}
		return moduleOffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<Program>(Program.class, this,
					CmsPackage.PROGRAM_MANAGEMENT__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Module>(Module.class, this, CmsPackage.PROGRAM_MANAGEMENT__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsPackage.PROGRAM_MANAGEMENT__MODULE_OFFERS:
			return ((InternalEList<?>) getModuleOffers()).basicRemove(otherEnd, msgs);
		case CmsPackage.PROGRAM_MANAGEMENT__PROGRAMS:
			return ((InternalEList<?>) getPrograms()).basicRemove(otherEnd, msgs);
		case CmsPackage.PROGRAM_MANAGEMENT__MODULES:
			return ((InternalEList<?>) getModules()).basicRemove(otherEnd, msgs);
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
		case CmsPackage.PROGRAM_MANAGEMENT__MODULE_OFFERS:
			return getModuleOffers();
		case CmsPackage.PROGRAM_MANAGEMENT__PROGRAMS:
			return getPrograms();
		case CmsPackage.PROGRAM_MANAGEMENT__MODULES:
			return getModules();
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
		case CmsPackage.PROGRAM_MANAGEMENT__MODULE_OFFERS:
			getModuleOffers().clear();
			getModuleOffers().addAll((Collection<? extends ModuleOffer>) newValue);
			return;
		case CmsPackage.PROGRAM_MANAGEMENT__PROGRAMS:
			getPrograms().clear();
			getPrograms().addAll((Collection<? extends Program>) newValue);
			return;
		case CmsPackage.PROGRAM_MANAGEMENT__MODULES:
			getModules().clear();
			getModules().addAll((Collection<? extends Module>) newValue);
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
		case CmsPackage.PROGRAM_MANAGEMENT__MODULE_OFFERS:
			getModuleOffers().clear();
			return;
		case CmsPackage.PROGRAM_MANAGEMENT__PROGRAMS:
			getPrograms().clear();
			return;
		case CmsPackage.PROGRAM_MANAGEMENT__MODULES:
			getModules().clear();
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
		case CmsPackage.PROGRAM_MANAGEMENT__MODULE_OFFERS:
			return moduleOffers != null && !moduleOffers.isEmpty();
		case CmsPackage.PROGRAM_MANAGEMENT__PROGRAMS:
			return programs != null && !programs.isEmpty();
		case CmsPackage.PROGRAM_MANAGEMENT__MODULES:
			return modules != null && !modules.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ProgramManagementImpl
