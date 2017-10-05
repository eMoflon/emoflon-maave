/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.ThesisModule;
import org.moflon.maave.tests.lang.cms.ThesisOffer;
import org.moflon.maave.tests.lang.cms.ThesisRecord;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thesis Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl#getThesisModule <em>Thesis Module</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl#getThesis <em>Thesis</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl#getTries <em>Tries</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ThesisRecordImpl#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThesisRecordImpl extends EObjectImpl implements ThesisRecord {
	/**
	 * The cached value of the '{@link #getThesisModule() <em>Thesis Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesisModule()
	 * @generated
	 * @ordered
	 */
	protected ThesisModule thesisModule;

	/**
	 * The cached value of the '{@link #getThesis() <em>Thesis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesis()
	 * @generated
	 * @ordered
	 */
	protected EList<ThesisOffer> thesis;

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
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThesisRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.THESIS_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisModule getThesisModule() {
		if (thesisModule != null && thesisModule.eIsProxy()) {
			InternalEObject oldThesisModule = (InternalEObject) thesisModule;
			thesisModule = (ThesisModule) eResolveProxy(oldThesisModule);
			if (thesisModule != oldThesisModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.THESIS_RECORD__THESIS_MODULE,
							oldThesisModule, thesisModule));
			}
		}
		return thesisModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisModule basicGetThesisModule() {
		return thesisModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThesisModule(ThesisModule newThesisModule) {
		ThesisModule oldThesisModule = thesisModule;
		thesisModule = newThesisModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.THESIS_RECORD__THESIS_MODULE,
					oldThesisModule, thesisModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThesisOffer> getThesis() {
		if (thesis == null) {
			thesis = new EObjectResolvingEList<ThesisOffer>(ThesisOffer.class, this, CmsPackage.THESIS_RECORD__THESIS);
		}
		return thesis;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.THESIS_RECORD__GRADE, oldGrade, grade));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.THESIS_RECORD__TRIES, oldTries, tries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.THESIS_RECORD__RUNNING, oldRunning,
					running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsPackage.THESIS_RECORD__THESIS_MODULE:
			if (resolve)
				return getThesisModule();
			return basicGetThesisModule();
		case CmsPackage.THESIS_RECORD__THESIS:
			return getThesis();
		case CmsPackage.THESIS_RECORD__GRADE:
			return getGrade();
		case CmsPackage.THESIS_RECORD__TRIES:
			return getTries();
		case CmsPackage.THESIS_RECORD__RUNNING:
			return isRunning();
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
		case CmsPackage.THESIS_RECORD__THESIS_MODULE:
			setThesisModule((ThesisModule) newValue);
			return;
		case CmsPackage.THESIS_RECORD__THESIS:
			getThesis().clear();
			getThesis().addAll((Collection<? extends ThesisOffer>) newValue);
			return;
		case CmsPackage.THESIS_RECORD__GRADE:
			setGrade((Integer) newValue);
			return;
		case CmsPackage.THESIS_RECORD__TRIES:
			setTries((Integer) newValue);
			return;
		case CmsPackage.THESIS_RECORD__RUNNING:
			setRunning((Boolean) newValue);
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
		case CmsPackage.THESIS_RECORD__THESIS_MODULE:
			setThesisModule((ThesisModule) null);
			return;
		case CmsPackage.THESIS_RECORD__THESIS:
			getThesis().clear();
			return;
		case CmsPackage.THESIS_RECORD__GRADE:
			setGrade(GRADE_EDEFAULT);
			return;
		case CmsPackage.THESIS_RECORD__TRIES:
			setTries(TRIES_EDEFAULT);
			return;
		case CmsPackage.THESIS_RECORD__RUNNING:
			setRunning(RUNNING_EDEFAULT);
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
		case CmsPackage.THESIS_RECORD__THESIS_MODULE:
			return thesisModule != null;
		case CmsPackage.THESIS_RECORD__THESIS:
			return thesis != null && !thesis.isEmpty();
		case CmsPackage.THESIS_RECORD__GRADE:
			return grade != GRADE_EDEFAULT;
		case CmsPackage.THESIS_RECORD__TRIES:
			return tries != TRIES_EDEFAULT;
		case CmsPackage.THESIS_RECORD__RUNNING:
			return running != RUNNING_EDEFAULT;
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
		result.append(", running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ThesisRecordImpl
