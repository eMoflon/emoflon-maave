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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.CourseManagement;
import org.moflon.maave.tests.lang.cmsNew.Module;
import org.moflon.maave.tests.lang.cmsNew.Program;
import org.moflon.maave.tests.lang.cmsNew.Semester;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Course
 * Management</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl#getPrograms
 * <em>Programs</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl#getSemesters
 * <em>Semesters</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl#getModuleOffers
 * <em>Module Offers</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CourseManagementImpl#getModules
 * <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CourseManagementImpl extends EObjectImpl implements CourseManagement {
	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getModuleOffers() <em>Module Offers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModuleOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<CoModOffer> moduleOffers;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CourseManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.COURSE_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<Program>(Program.class, this,
					CmsNewPackage.COURSE_MANAGEMENT__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this,
					CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS, CmsNewPackage.SEMESTER__LECTURE_MAN);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CoModOffer> getModuleOffers() {
		if (moduleOffers == null) {
			moduleOffers = new EObjectContainmentWithInverseEList<CoModOffer>(CoModOffer.class, this,
					CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS, CmsNewPackage.CO_MOD_OFFER__LEC_MAN);
		}
		return moduleOffers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentWithInverseEList<Module>(Module.class, this,
					CmsNewPackage.COURSE_MANAGEMENT__MODULES, CmsNewPackage.MODULE__LEC_MAN);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSemesters()).basicAdd(otherEnd, msgs);
		case CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getModuleOffers()).basicAdd(otherEnd, msgs);
		case CmsNewPackage.COURSE_MANAGEMENT__MODULES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getModules()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.COURSE_MANAGEMENT__PROGRAMS:
			return ((InternalEList<?>) getPrograms()).basicRemove(otherEnd, msgs);
		case CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS:
			return ((InternalEList<?>) getSemesters()).basicRemove(otherEnd, msgs);
		case CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS:
			return ((InternalEList<?>) getModuleOffers()).basicRemove(otherEnd, msgs);
		case CmsNewPackage.COURSE_MANAGEMENT__MODULES:
			return ((InternalEList<?>) getModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsNewPackage.COURSE_MANAGEMENT__PROGRAMS:
			return getPrograms();
		case CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS:
			return getSemesters();
		case CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS:
			return getModuleOffers();
		case CmsNewPackage.COURSE_MANAGEMENT__MODULES:
			return getModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsNewPackage.COURSE_MANAGEMENT__PROGRAMS:
			getPrograms().clear();
			getPrograms().addAll((Collection<? extends Program>) newValue);
			return;
		case CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS:
			getSemesters().clear();
			getSemesters().addAll((Collection<? extends Semester>) newValue);
			return;
		case CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS:
			getModuleOffers().clear();
			getModuleOffers().addAll((Collection<? extends CoModOffer>) newValue);
			return;
		case CmsNewPackage.COURSE_MANAGEMENT__MODULES:
			getModules().clear();
			getModules().addAll((Collection<? extends Module>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CmsNewPackage.COURSE_MANAGEMENT__PROGRAMS:
			getPrograms().clear();
			return;
		case CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS:
			getSemesters().clear();
			return;
		case CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS:
			getModuleOffers().clear();
			return;
		case CmsNewPackage.COURSE_MANAGEMENT__MODULES:
			getModules().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CmsNewPackage.COURSE_MANAGEMENT__PROGRAMS:
			return programs != null && !programs.isEmpty();
		case CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS:
			return semesters != null && !semesters.isEmpty();
		case CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS:
			return moduleOffers != null && !moduleOffers.isEmpty();
		case CmsNewPackage.COURSE_MANAGEMENT__MODULES:
			return modules != null && !modules.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CourseManagementImpl
