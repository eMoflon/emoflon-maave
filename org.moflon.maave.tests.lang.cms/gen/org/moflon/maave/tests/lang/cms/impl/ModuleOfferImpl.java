/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.Exam;
import org.moflon.maave.tests.lang.cms.Lecture;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleOfferImpl#getExams <em>Exams</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleOfferImpl#getLectures <em>Lectures</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ModuleOfferImpl#getCp <em>Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleOfferImpl extends EObjectImpl implements ModuleOffer {
	/**
	 * The cached value of the '{@link #getExams() <em>Exams</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExams()
	 * @generated
	 * @ordered
	 */
	protected Exam exams;

	/**
	 * The cached value of the '{@link #getLectures() <em>Lectures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectures()
	 * @generated
	 * @ordered
	 */
	protected Lecture lectures;

	/**
	 * The default value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected static final int CP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected int cp = CP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.MODULE_OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam getExams() {
		if (exams != null && exams.eIsProxy()) {
			InternalEObject oldExams = (InternalEObject) exams;
			exams = (Exam) eResolveProxy(oldExams);
			if (exams != oldExams) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.MODULE_OFFER__EXAMS, oldExams,
							exams));
			}
		}
		return exams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam basicGetExams() {
		return exams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExams(Exam newExams) {
		Exam oldExams = exams;
		exams = newExams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE_OFFER__EXAMS, oldExams, exams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lecture getLectures() {
		if (lectures != null && lectures.eIsProxy()) {
			InternalEObject oldLectures = (InternalEObject) lectures;
			lectures = (Lecture) eResolveProxy(oldLectures);
			if (lectures != oldLectures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.MODULE_OFFER__LECTURES,
							oldLectures, lectures));
			}
		}
		return lectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lecture basicGetLectures() {
		return lectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLectures(Lecture newLectures) {
		Lecture oldLectures = lectures;
		lectures = newLectures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE_OFFER__LECTURES, oldLectures,
					lectures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCp(int newCp) {
		int oldCp = cp;
		cp = newCp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.MODULE_OFFER__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsPackage.MODULE_OFFER__EXAMS:
			if (resolve)
				return getExams();
			return basicGetExams();
		case CmsPackage.MODULE_OFFER__LECTURES:
			if (resolve)
				return getLectures();
			return basicGetLectures();
		case CmsPackage.MODULE_OFFER__CP:
			return getCp();
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
		case CmsPackage.MODULE_OFFER__EXAMS:
			setExams((Exam) newValue);
			return;
		case CmsPackage.MODULE_OFFER__LECTURES:
			setLectures((Lecture) newValue);
			return;
		case CmsPackage.MODULE_OFFER__CP:
			setCp((Integer) newValue);
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
		case CmsPackage.MODULE_OFFER__EXAMS:
			setExams((Exam) null);
			return;
		case CmsPackage.MODULE_OFFER__LECTURES:
			setLectures((Lecture) null);
			return;
		case CmsPackage.MODULE_OFFER__CP:
			setCp(CP_EDEFAULT);
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
		case CmsPackage.MODULE_OFFER__EXAMS:
			return exams != null;
		case CmsPackage.MODULE_OFFER__LECTURES:
			return lectures != null;
		case CmsPackage.MODULE_OFFER__CP:
			return cp != CP_EDEFAULT;
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
		result.append(" (cp: ");
		result.append(cp);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ModuleOfferImpl
