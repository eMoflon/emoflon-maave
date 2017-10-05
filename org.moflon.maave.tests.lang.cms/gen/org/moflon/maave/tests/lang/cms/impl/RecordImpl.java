/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.Enrollment;
import org.moflon.maave.tests.lang.cms.Exam;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
import org.moflon.maave.tests.lang.cms.Record;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.RecordImpl#getEnrollment <em>Enrollment</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.RecordImpl#getExam <em>Exam</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.RecordImpl#getModuleOffer <em>Module Offer</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.RecordImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.RecordImpl#getTries <em>Tries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordImpl extends EObjectImpl implements Record {
	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected Exam exam;

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
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final int GRADE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected int grade = GRADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTries() <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected static final int TRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTries() <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected int tries = TRIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enrollment getEnrollment() {
		if (eContainerFeatureID() != CmsPackage.RECORD__ENROLLMENT)
			return null;
		return (Enrollment) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollment(Enrollment newEnrollment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEnrollment, CmsPackage.RECORD__ENROLLMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollment(Enrollment newEnrollment) {
		if (newEnrollment != eInternalContainer()
				|| (eContainerFeatureID() != CmsPackage.RECORD__ENROLLMENT && newEnrollment != null)) {
			if (EcoreUtil.isAncestor(this, newEnrollment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnrollment != null)
				msgs = ((InternalEObject) newEnrollment).eInverseAdd(this, CmsPackage.ENROLLMENT__RECORDS,
						Enrollment.class, msgs);
			msgs = basicSetEnrollment(newEnrollment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.RECORD__ENROLLMENT, newEnrollment,
					newEnrollment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam getExam() {
		if (exam != null && exam.eIsProxy()) {
			InternalEObject oldExam = (InternalEObject) exam;
			exam = (Exam) eResolveProxy(oldExam);
			if (exam != oldExam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.RECORD__EXAM, oldExam, exam));
			}
		}
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam basicGetExam() {
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExam(Exam newExam, NotificationChain msgs) {
		Exam oldExam = exam;
		exam = newExam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsPackage.RECORD__EXAM,
					oldExam, newExam);
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
	public void setExam(Exam newExam) {
		if (newExam != exam) {
			NotificationChain msgs = null;
			if (exam != null)
				msgs = ((InternalEObject) exam).eInverseRemove(this, CmsPackage.EXAM__REGISTRATIONS, Exam.class, msgs);
			if (newExam != null)
				msgs = ((InternalEObject) newExam).eInverseAdd(this, CmsPackage.EXAM__REGISTRATIONS, Exam.class, msgs);
			msgs = basicSetExam(newExam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.RECORD__EXAM, newExam, newExam));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.RECORD__MODULE_OFFER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.RECORD__MODULE_OFFER, oldModuleOffer,
					moduleOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrade(int newGrade) {
		int oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.RECORD__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTries() {
		return tries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTries(int newTries) {
		int oldTries = tries;
		tries = newTries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.RECORD__TRIES, oldTries, tries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsPackage.RECORD__ENROLLMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEnrollment((Enrollment) otherEnd, msgs);
		case CmsPackage.RECORD__EXAM:
			if (exam != null)
				msgs = ((InternalEObject) exam).eInverseRemove(this, CmsPackage.EXAM__REGISTRATIONS, Exam.class, msgs);
			return basicSetExam((Exam) otherEnd, msgs);
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
		case CmsPackage.RECORD__ENROLLMENT:
			return basicSetEnrollment(null, msgs);
		case CmsPackage.RECORD__EXAM:
			return basicSetExam(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CmsPackage.RECORD__ENROLLMENT:
			return eInternalContainer().eInverseRemove(this, CmsPackage.ENROLLMENT__RECORDS, Enrollment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsPackage.RECORD__ENROLLMENT:
			return getEnrollment();
		case CmsPackage.RECORD__EXAM:
			if (resolve)
				return getExam();
			return basicGetExam();
		case CmsPackage.RECORD__MODULE_OFFER:
			if (resolve)
				return getModuleOffer();
			return basicGetModuleOffer();
		case CmsPackage.RECORD__GRADE:
			return getGrade();
		case CmsPackage.RECORD__TRIES:
			return getTries();
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
		case CmsPackage.RECORD__ENROLLMENT:
			setEnrollment((Enrollment) newValue);
			return;
		case CmsPackage.RECORD__EXAM:
			setExam((Exam) newValue);
			return;
		case CmsPackage.RECORD__MODULE_OFFER:
			setModuleOffer((ModuleOffer) newValue);
			return;
		case CmsPackage.RECORD__GRADE:
			setGrade((Integer) newValue);
			return;
		case CmsPackage.RECORD__TRIES:
			setTries((Integer) newValue);
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
		case CmsPackage.RECORD__ENROLLMENT:
			setEnrollment((Enrollment) null);
			return;
		case CmsPackage.RECORD__EXAM:
			setExam((Exam) null);
			return;
		case CmsPackage.RECORD__MODULE_OFFER:
			setModuleOffer((ModuleOffer) null);
			return;
		case CmsPackage.RECORD__GRADE:
			setGrade(GRADE_EDEFAULT);
			return;
		case CmsPackage.RECORD__TRIES:
			setTries(TRIES_EDEFAULT);
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
		case CmsPackage.RECORD__ENROLLMENT:
			return getEnrollment() != null;
		case CmsPackage.RECORD__EXAM:
			return exam != null;
		case CmsPackage.RECORD__MODULE_OFFER:
			return moduleOffer != null;
		case CmsPackage.RECORD__GRADE:
			return grade != GRADE_EDEFAULT;
		case CmsPackage.RECORD__TRIES:
			return tries != TRIES_EDEFAULT;
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
		result.append(" (grade: ");
		result.append(grade);
		result.append(", tries: ");
		result.append(tries);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RecordImpl
