/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.Thesis;
import org.moflon.maave.tests.lang.cmsNew.ThesisModuleOffer;
import org.moflon.maave.tests.lang.cmsNew.ThesisRecord;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Thesis
 * Record</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl#getThesis
 * <em>Thesis</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl#getThesisOffer
 * <em>Thesis Offer</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl#getGrade
 * <em>Grade</em>}</li>
 * <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.ThesisRecordImpl#getTries
 * <em>Tries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThesisRecordImpl extends EObjectImpl implements ThesisRecord {
	/**
	 * The cached value of the '{@link #getThesis() <em>Thesis</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getThesis()
	 * @generated
	 * @ordered
	 */
	protected Thesis thesis;

	/**
	 * The cached value of the '{@link #getThesisOffer() <em>Thesis Offer</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getThesisOffer()
	 * @generated
	 * @ordered
	 */
	protected ThesisModuleOffer thesisOffer;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final int GRADE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected int grade = GRADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTries() <em>Tries</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected static final int TRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTries() <em>Tries</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected int tries = TRIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ThesisRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.THESIS_RECORD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Thesis getThesis() {
		if (thesis != null && thesis.eIsProxy()) {
			InternalEObject oldThesis = (InternalEObject) thesis;
			thesis = (Thesis) eResolveProxy(oldThesis);
			if (thesis != oldThesis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.THESIS_RECORD__THESIS,
							oldThesis, thesis));
			}
		}
		return thesis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Thesis basicGetThesis() {
		return thesis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetThesis(Thesis newThesis, NotificationChain msgs) {
		Thesis oldThesis = thesis;
		thesis = newThesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsNewPackage.THESIS_RECORD__THESIS, oldThesis, newThesis);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setThesis(Thesis newThesis) {
		if (newThesis != thesis) {
			NotificationChain msgs = null;
			if (thesis != null)
				msgs = ((InternalEObject) thesis).eInverseRemove(this, CmsNewPackage.THESIS__RECORD, Thesis.class,
						msgs);
			if (newThesis != null)
				msgs = ((InternalEObject) newThesis).eInverseAdd(this, CmsNewPackage.THESIS__RECORD, Thesis.class,
						msgs);
			msgs = basicSetThesis(newThesis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_RECORD__THESIS, newThesis,
					newThesis));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ThesisModuleOffer getThesisOffer() {
		if (thesisOffer != null && thesisOffer.eIsProxy()) {
			InternalEObject oldThesisOffer = (InternalEObject) thesisOffer;
			thesisOffer = (ThesisModuleOffer) eResolveProxy(oldThesisOffer);
			if (thesisOffer != oldThesisOffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.THESIS_RECORD__THESIS_OFFER,
							oldThesisOffer, thesisOffer));
			}
		}
		return thesisOffer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ThesisModuleOffer basicGetThesisOffer() {
		return thesisOffer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setThesisOffer(ThesisModuleOffer newThesisOffer) {
		ThesisModuleOffer oldThesisOffer = thesisOffer;
		thesisOffer = newThesisOffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_RECORD__THESIS_OFFER,
					oldThesisOffer, thesisOffer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGrade(int newGrade) {
		int oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_RECORD__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getTries() {
		return tries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTries(int newTries) {
		int oldTries = tries;
		tries = newTries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.THESIS_RECORD__TRIES, oldTries, tries));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.THESIS_RECORD__THESIS:
			if (thesis != null)
				msgs = ((InternalEObject) thesis).eInverseRemove(this, CmsNewPackage.THESIS__RECORD, Thesis.class,
						msgs);
			return basicSetThesis((Thesis) otherEnd, msgs);
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
		case CmsNewPackage.THESIS_RECORD__THESIS:
			return basicSetThesis(null, msgs);
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
		case CmsNewPackage.THESIS_RECORD__THESIS:
			if (resolve)
				return getThesis();
			return basicGetThesis();
		case CmsNewPackage.THESIS_RECORD__THESIS_OFFER:
			if (resolve)
				return getThesisOffer();
			return basicGetThesisOffer();
		case CmsNewPackage.THESIS_RECORD__GRADE:
			return getGrade();
		case CmsNewPackage.THESIS_RECORD__TRIES:
			return getTries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsNewPackage.THESIS_RECORD__THESIS:
			setThesis((Thesis) newValue);
			return;
		case CmsNewPackage.THESIS_RECORD__THESIS_OFFER:
			setThesisOffer((ThesisModuleOffer) newValue);
			return;
		case CmsNewPackage.THESIS_RECORD__GRADE:
			setGrade((Integer) newValue);
			return;
		case CmsNewPackage.THESIS_RECORD__TRIES:
			setTries((Integer) newValue);
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
		case CmsNewPackage.THESIS_RECORD__THESIS:
			setThesis((Thesis) null);
			return;
		case CmsNewPackage.THESIS_RECORD__THESIS_OFFER:
			setThesisOffer((ThesisModuleOffer) null);
			return;
		case CmsNewPackage.THESIS_RECORD__GRADE:
			setGrade(GRADE_EDEFAULT);
			return;
		case CmsNewPackage.THESIS_RECORD__TRIES:
			setTries(TRIES_EDEFAULT);
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
		case CmsNewPackage.THESIS_RECORD__THESIS:
			return thesis != null;
		case CmsNewPackage.THESIS_RECORD__THESIS_OFFER:
			return thesisOffer != null;
		case CmsNewPackage.THESIS_RECORD__GRADE:
			return grade != GRADE_EDEFAULT;
		case CmsNewPackage.THESIS_RECORD__TRIES:
			return tries != TRIES_EDEFAULT;
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
		result.append(" (grade: ");
		result.append(grade);
		result.append(", tries: ");
		result.append(tries);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ThesisRecordImpl
