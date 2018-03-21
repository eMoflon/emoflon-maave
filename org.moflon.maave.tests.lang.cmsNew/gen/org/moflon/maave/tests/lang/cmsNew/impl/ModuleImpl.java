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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.CourseManagement;
import org.moflon.maave.tests.lang.cmsNew.Module;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl#getLecMan
 * <em>Lec Man</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl#getAllOffers
 * <em>All Offers</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl#getCurrent
 * <em>Current</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ModuleImpl#getVersion
 * <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
	/**
	 * The cached value of the '{@link #getAllOffers() <em>All Offers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<CoModOffer> allOffers;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected CoModOffer current;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CourseManagement getLecMan() {
		if (eContainerFeatureID() != CmsNewPackage.MODULE__LEC_MAN)
			return null;
		return (CourseManagement) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLecMan(CourseManagement newLecMan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLecMan, CmsNewPackage.MODULE__LEC_MAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLecMan(CourseManagement newLecMan) {
		if (newLecMan != eInternalContainer()
				|| (eContainerFeatureID() != CmsNewPackage.MODULE__LEC_MAN && newLecMan != null)) {
			if (EcoreUtil.isAncestor(this, newLecMan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLecMan != null)
				msgs = ((InternalEObject) newLecMan).eInverseAdd(this, CmsNewPackage.COURSE_MANAGEMENT__MODULES,
						CourseManagement.class, msgs);
			msgs = basicSetLecMan(newLecMan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.MODULE__LEC_MAN, newLecMan, newLecMan));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CoModOffer> getAllOffers() {
		if (allOffers == null) {
			allOffers = new EObjectContainmentEList<CoModOffer>(CoModOffer.class, this,
					CmsNewPackage.MODULE__ALL_OFFERS);
		}
		return allOffers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoModOffer getCurrent() {
		if (current != null && current.eIsProxy()) {
			InternalEObject oldCurrent = (InternalEObject) current;
			current = (CoModOffer) eResolveProxy(oldCurrent);
			if (current != oldCurrent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.MODULE__CURRENT, oldCurrent,
							current));
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoModOffer basicGetCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCurrent(CoModOffer newCurrent) {
		CoModOffer oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.MODULE__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.MODULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.MODULE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.MODULE__LEC_MAN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetLecMan((CourseManagement) otherEnd, msgs);
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
		case CmsNewPackage.MODULE__LEC_MAN:
			return basicSetLecMan(null, msgs);
		case CmsNewPackage.MODULE__ALL_OFFERS:
			return ((InternalEList<?>) getAllOffers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CmsNewPackage.MODULE__LEC_MAN:
			return eInternalContainer().eInverseRemove(this, CmsNewPackage.COURSE_MANAGEMENT__MODULES,
					CourseManagement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsNewPackage.MODULE__LEC_MAN:
			return getLecMan();
		case CmsNewPackage.MODULE__ALL_OFFERS:
			return getAllOffers();
		case CmsNewPackage.MODULE__CURRENT:
			if (resolve)
				return getCurrent();
			return basicGetCurrent();
		case CmsNewPackage.MODULE__ID:
			return getId();
		case CmsNewPackage.MODULE__VERSION:
			return getVersion();
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
		case CmsNewPackage.MODULE__LEC_MAN:
			setLecMan((CourseManagement) newValue);
			return;
		case CmsNewPackage.MODULE__ALL_OFFERS:
			getAllOffers().clear();
			getAllOffers().addAll((Collection<? extends CoModOffer>) newValue);
			return;
		case CmsNewPackage.MODULE__CURRENT:
			setCurrent((CoModOffer) newValue);
			return;
		case CmsNewPackage.MODULE__ID:
			setId((Long) newValue);
			return;
		case CmsNewPackage.MODULE__VERSION:
			setVersion((Integer) newValue);
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
		case CmsNewPackage.MODULE__LEC_MAN:
			setLecMan((CourseManagement) null);
			return;
		case CmsNewPackage.MODULE__ALL_OFFERS:
			getAllOffers().clear();
			return;
		case CmsNewPackage.MODULE__CURRENT:
			setCurrent((CoModOffer) null);
			return;
		case CmsNewPackage.MODULE__ID:
			setId(ID_EDEFAULT);
			return;
		case CmsNewPackage.MODULE__VERSION:
			setVersion(VERSION_EDEFAULT);
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
		case CmsNewPackage.MODULE__LEC_MAN:
			return getLecMan() != null;
		case CmsNewPackage.MODULE__ALL_OFFERS:
			return allOffers != null && !allOffers.isEmpty();
		case CmsNewPackage.MODULE__CURRENT:
			return current != null;
		case CmsNewPackage.MODULE__ID:
			return id != ID_EDEFAULT;
		case CmsNewPackage.MODULE__VERSION:
			return version != VERSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ModuleImpl
