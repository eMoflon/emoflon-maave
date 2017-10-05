/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.ExamPrototype;
import org.moflon.maave.tests.lang.cms.LecturePrototype;
import org.moflon.maave.tests.lang.cms.Module;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleImpl#getLectureType <em>Lecture Type</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleImpl#getExamType <em>Exam Type</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleImpl#getModuleOffer <em>Module Offer</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
	/**
	 * The cached value of the '{@link #getLectureType() <em>Lecture Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureType()
	 * @generated
	 * @ordered
	 */
	protected LecturePrototype lectureType;

	/**
	 * The cached value of the '{@link #getExamType() <em>Exam Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamType()
	 * @generated
	 * @ordered
	 */
	protected ExamPrototype examType;

	/**
	 * The cached value of the '{@link #getModuleOffer() <em>Module Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleOffer()
	 * @generated
	 * @ordered
	 */
	protected ModuleOffer moduleOffer;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LecturePrototype getLectureType() {
		return lectureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLectureType(LecturePrototype newLectureType, NotificationChain msgs) {
		LecturePrototype oldLectureType = lectureType;
		lectureType = newLectureType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsPackage.MODULE__LECTURE_TYPE, oldLectureType, newLectureType);
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
	public void setLectureType(LecturePrototype newLectureType) {
		if (newLectureType != lectureType) {
			NotificationChain msgs = null;
			if (lectureType != null)
				msgs = ((InternalEObject) lectureType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.MODULE__LECTURE_TYPE, null, msgs);
			if (newLectureType != null)
				msgs = ((InternalEObject) newLectureType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.MODULE__LECTURE_TYPE, null, msgs);
			msgs = basicSetLectureType(newLectureType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE__LECTURE_TYPE, newLectureType,
					newLectureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamPrototype getExamType() {
		return examType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamType(ExamPrototype newExamType, NotificationChain msgs) {
		ExamPrototype oldExamType = examType;
		examType = newExamType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE__EXAM_TYPE,
					oldExamType, newExamType);
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
	public void setExamType(ExamPrototype newExamType) {
		if (newExamType != examType) {
			NotificationChain msgs = null;
			if (examType != null)
				msgs = ((InternalEObject) examType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.MODULE__EXAM_TYPE, null, msgs);
			if (newExamType != null)
				msgs = ((InternalEObject) newExamType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.MODULE__EXAM_TYPE, null, msgs);
			msgs = basicSetExamType(newExamType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE__EXAM_TYPE, newExamType,
					newExamType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleOffer getModuleOffer() {
		if (moduleOffer != null && moduleOffer.eIsProxy()) {
			InternalEObject oldModuleOffer = (InternalEObject) moduleOffer;
			moduleOffer = (ModuleOffer) eResolveProxy(oldModuleOffer);
			if (moduleOffer != oldModuleOffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.MODULE__MODULE_OFFER,
							oldModuleOffer, moduleOffer));
			}
		}
		return moduleOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleOffer basicGetModuleOffer() {
		return moduleOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleOffer(ModuleOffer newModuleOffer) {
		ModuleOffer oldModuleOffer = moduleOffer;
		moduleOffer = newModuleOffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE__MODULE_OFFER, oldModuleOffer,
					moduleOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsPackage.MODULE__LECTURE_TYPE:
			return basicSetLectureType(null, msgs);
		case CmsPackage.MODULE__EXAM_TYPE:
			return basicSetExamType(null, msgs);
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
		case CmsPackage.MODULE__LECTURE_TYPE:
			return getLectureType();
		case CmsPackage.MODULE__EXAM_TYPE:
			return getExamType();
		case CmsPackage.MODULE__MODULE_OFFER:
			if (resolve)
				return getModuleOffer();
			return basicGetModuleOffer();
		case CmsPackage.MODULE__ID:
			return getId();
		case CmsPackage.MODULE__VERSION:
			return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsPackage.MODULE__LECTURE_TYPE:
			setLectureType((LecturePrototype) newValue);
			return;
		case CmsPackage.MODULE__EXAM_TYPE:
			setExamType((ExamPrototype) newValue);
			return;
		case CmsPackage.MODULE__MODULE_OFFER:
			setModuleOffer((ModuleOffer) newValue);
			return;
		case CmsPackage.MODULE__ID:
			setId((Long) newValue);
			return;
		case CmsPackage.MODULE__VERSION:
			setVersion((Integer) newValue);
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
		case CmsPackage.MODULE__LECTURE_TYPE:
			setLectureType((LecturePrototype) null);
			return;
		case CmsPackage.MODULE__EXAM_TYPE:
			setExamType((ExamPrototype) null);
			return;
		case CmsPackage.MODULE__MODULE_OFFER:
			setModuleOffer((ModuleOffer) null);
			return;
		case CmsPackage.MODULE__ID:
			setId(ID_EDEFAULT);
			return;
		case CmsPackage.MODULE__VERSION:
			setVersion(VERSION_EDEFAULT);
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
		case CmsPackage.MODULE__LECTURE_TYPE:
			return lectureType != null;
		case CmsPackage.MODULE__EXAM_TYPE:
			return examType != null;
		case CmsPackage.MODULE__MODULE_OFFER:
			return moduleOffer != null;
		case CmsPackage.MODULE__ID:
			return id != ID_EDEFAULT;
		case CmsPackage.MODULE__VERSION:
			return version != VERSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
} //ModuleImpl
