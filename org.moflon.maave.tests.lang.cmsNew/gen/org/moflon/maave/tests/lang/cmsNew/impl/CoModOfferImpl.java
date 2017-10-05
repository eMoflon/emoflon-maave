/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.maave.tests.lang.cmsNew.CMO_STATE;
import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CoModOffer;
import org.moflon.maave.tests.lang.cmsNew.CourseManagement;
import org.moflon.maave.tests.lang.cmsNew.Exam;
import org.moflon.maave.tests.lang.cmsNew.Lecture;
import org.moflon.maave.tests.lang.cmsNew.Semester;
import org.moflon.maave.tests.lang.cmsNew.SystemTimer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Co Mod Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl#getLecMan <em>Lec Man</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl#getExams <em>Exams</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl#getLectures <em>Lectures</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.CoModOfferImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoModOfferImpl extends EObjectImpl implements CoModOffer {
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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final CMO_STATE STATE_EDEFAULT = CMO_STATE.CMO_CREATED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected CMO_STATE state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoModOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsNewPackage.Literals.CO_MOD_OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseManagement getLecMan() {
		if (eContainerFeatureID() != CmsNewPackage.CO_MOD_OFFER__LEC_MAN)
			return null;
		return (CourseManagement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLecMan(CourseManagement newLecMan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLecMan, CmsNewPackage.CO_MOD_OFFER__LEC_MAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLecMan(CourseManagement newLecMan) {
		if (newLecMan != eInternalContainer()
				|| (eContainerFeatureID() != CmsNewPackage.CO_MOD_OFFER__LEC_MAN && newLecMan != null)) {
			if (EcoreUtil.isAncestor(this, newLecMan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLecMan != null)
				msgs = ((InternalEObject) newLecMan).eInverseAdd(this, CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS,
						CourseManagement.class, msgs);
			msgs = basicSetLecMan(newLecMan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.CO_MOD_OFFER__LEC_MAN, newLecMan,
					newLecMan));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.CO_MOD_OFFER__EXAMS,
							oldExams, exams));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.CO_MOD_OFFER__EXAMS, oldExams, exams));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.CO_MOD_OFFER__LECTURES,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.CO_MOD_OFFER__LECTURES, oldLectures,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.CO_MOD_OFFER__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMO_STATE getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(CMO_STATE newState) {
		CMO_STATE oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.CO_MOD_OFFER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateExam_v1(SystemTimer system, Exam ex) {
		// CMO_updateEx_v1
		Object[] result1_black = CoModOfferImpl.pattern_CoModOffer_0_1_CMO_updateEx_v1_blackBBFBFFF(system, this, ex);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [CMO_updateEx_v1] failed." + " Variables: "
					+ "[system] = " + system + ", " + "[this] = " + this + ", " + "[ex] = " + ex + ".");
		}
		Exam exOld = (Exam) result1_black[2];
		// Semester currSem = (Semester) result1_black[4];
		// Semester semOld = (Semester) result1_black[5];
		CMO_STATE this_state_prime_1 = (CMO_STATE) result1_black[6];
		CoModOfferImpl.pattern_CoModOffer_0_1_CMO_updateEx_v1_redBB(this, exOld);

		CoModOfferImpl.pattern_CoModOffer_0_1_CMO_updateEx_v1_greenBBB(this, ex, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLecture_v0(Lecture lect) {
		// CMO_setLecture_v0
		Object[] result1_black = CoModOfferImpl.pattern_CoModOffer_1_1_CMO_setLecture_v0_blackFFBBF(this, lect);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [CMO_setLecture_v0] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[lect] = " + lect + ".");
		}
		// Semester semCurr = (Semester) result1_black[0];
		// Semester semNext = (Semester) result1_black[1];
		CMO_STATE this_state_prime_1 = (CMO_STATE) result1_black[4];
		CoModOfferImpl.pattern_CoModOffer_1_1_CMO_setLecture_v0_greenBBB(this, lect, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExam_v0(Exam ex) {
		// CMO_setExam_v0
		Object[] result1_black = CoModOfferImpl.pattern_CoModOffer_2_1_CMO_setExam_v0_blackFFBBF(this, ex);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [CMO_setExam_v0] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[ex] = " + ex + ".");
		}
		// Semester semCurr = (Semester) result1_black[0];
		// Semester semNext = (Semester) result1_black[1];
		CMO_STATE this_state_prime_1 = (CMO_STATE) result1_black[4];
		CoModOfferImpl.pattern_CoModOffer_2_1_CMO_setExam_v0_greenBBB(this, ex, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset_v0() {
		// CMO_resetCMO_v0
		Object[] result1_black = CoModOfferImpl.pattern_CoModOffer_3_1_CMO_resetCMO_v0_blackBF(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [CMO_resetCMO_v0] failed." + " Variables: " + "[this] = " + this + ".");
		}
		CMO_STATE this_state_prime_1 = (CMO_STATE) result1_black[1];
		CoModOfferImpl.pattern_CoModOffer_3_1_CMO_resetCMO_v0_greenBB(this, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateExam_v0(Exam ex) {
		// CMO_updateEx_v0
		Object[] result1_black = CoModOfferImpl.pattern_CoModOffer_4_1_CMO_updateEx_v0_blackBFBFFF(this, ex);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [CMO_updateEx_v0] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[ex] = " + ex + ".");
		}
		Exam exOld = (Exam) result1_black[1];
		// Semester semCurr = (Semester) result1_black[3];
		// Semester semOld = (Semester) result1_black[4];
		CMO_STATE this_state_prime_1 = (CMO_STATE) result1_black[5];
		CoModOfferImpl.pattern_CoModOffer_4_1_CMO_updateEx_v0_redBB(this, exOld);

		CoModOfferImpl.pattern_CoModOffer_4_1_CMO_updateEx_v0_greenBBB(this, ex, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateLecture_v0(Lecture lec) {
		// CMO_updateLect_v0
		Object[] result1_black = CoModOfferImpl.pattern_CoModOffer_5_1_CMO_updateLect_v0_blackFFBBFF(this, lec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [CMO_updateLect_v0] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[lec] = " + lec + ".");
		}
		// Semester semCurr = (Semester) result1_black[0];
		// Semester semNext = (Semester) result1_black[1];
		Lecture lecOld = (Lecture) result1_black[4];
		CMO_STATE this_state_prime_1 = (CMO_STATE) result1_black[5];
		CoModOfferImpl.pattern_CoModOffer_5_1_CMO_updateLect_v0_redBB(this, lecOld);

		CoModOfferImpl.pattern_CoModOffer_5_1_CMO_updateLect_v0_greenBBB(this, lec, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void closeModuleOffer_v0() {
		// MO_closeModOffer_v0
		Object[] result1_black = CoModOfferImpl.pattern_CoModOffer_6_1_MO_closeModOffer_v0_blackBF(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [MO_closeModOffer_v0] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		CMO_STATE this_state_prime_1 = (CMO_STATE) result1_black[1];
		CoModOfferImpl.pattern_CoModOffer_6_1_MO_closeModOffer_v0_greenBB(this, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsNewPackage.CO_MOD_OFFER__LEC_MAN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetLecMan((CourseManagement) otherEnd, msgs);
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
		case CmsNewPackage.CO_MOD_OFFER__LEC_MAN:
			return basicSetLecMan(null, msgs);
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
		case CmsNewPackage.CO_MOD_OFFER__LEC_MAN:
			return eInternalContainer().eInverseRemove(this, CmsNewPackage.COURSE_MANAGEMENT__MODULE_OFFERS,
					CourseManagement.class, msgs);
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
		case CmsNewPackage.CO_MOD_OFFER__LEC_MAN:
			return getLecMan();
		case CmsNewPackage.CO_MOD_OFFER__EXAMS:
			if (resolve)
				return getExams();
			return basicGetExams();
		case CmsNewPackage.CO_MOD_OFFER__LECTURES:
			if (resolve)
				return getLectures();
			return basicGetLectures();
		case CmsNewPackage.CO_MOD_OFFER__CP:
			return getCp();
		case CmsNewPackage.CO_MOD_OFFER__STATE:
			return getState();
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
		case CmsNewPackage.CO_MOD_OFFER__LEC_MAN:
			setLecMan((CourseManagement) newValue);
			return;
		case CmsNewPackage.CO_MOD_OFFER__EXAMS:
			setExams((Exam) newValue);
			return;
		case CmsNewPackage.CO_MOD_OFFER__LECTURES:
			setLectures((Lecture) newValue);
			return;
		case CmsNewPackage.CO_MOD_OFFER__CP:
			setCp((Integer) newValue);
			return;
		case CmsNewPackage.CO_MOD_OFFER__STATE:
			setState((CMO_STATE) newValue);
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
		case CmsNewPackage.CO_MOD_OFFER__LEC_MAN:
			setLecMan((CourseManagement) null);
			return;
		case CmsNewPackage.CO_MOD_OFFER__EXAMS:
			setExams((Exam) null);
			return;
		case CmsNewPackage.CO_MOD_OFFER__LECTURES:
			setLectures((Lecture) null);
			return;
		case CmsNewPackage.CO_MOD_OFFER__CP:
			setCp(CP_EDEFAULT);
			return;
		case CmsNewPackage.CO_MOD_OFFER__STATE:
			setState(STATE_EDEFAULT);
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
		case CmsNewPackage.CO_MOD_OFFER__LEC_MAN:
			return getLecMan() != null;
		case CmsNewPackage.CO_MOD_OFFER__EXAMS:
			return exams != null;
		case CmsNewPackage.CO_MOD_OFFER__LECTURES:
			return lectures != null;
		case CmsNewPackage.CO_MOD_OFFER__CP:
			return cp != CP_EDEFAULT;
		case CmsNewPackage.CO_MOD_OFFER__STATE:
			return state != STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CmsNewPackage.CO_MOD_OFFER___UPDATE_EXAM_V1__SYSTEMTIMER_EXAM:
			updateExam_v1((SystemTimer) arguments.get(0), (Exam) arguments.get(1));
			return null;
		case CmsNewPackage.CO_MOD_OFFER___SET_LECTURE_V0__LECTURE:
			setLecture_v0((Lecture) arguments.get(0));
			return null;
		case CmsNewPackage.CO_MOD_OFFER___SET_EXAM_V0__EXAM:
			setExam_v0((Exam) arguments.get(0));
			return null;
		case CmsNewPackage.CO_MOD_OFFER___RESET_V0:
			reset_v0();
			return null;
		case CmsNewPackage.CO_MOD_OFFER___UPDATE_EXAM_V0__EXAM:
			updateExam_v0((Exam) arguments.get(0));
			return null;
		case CmsNewPackage.CO_MOD_OFFER___UPDATE_LECTURE_V0__LECTURE:
			updateLecture_v0((Lecture) arguments.get(0));
			return null;
		case CmsNewPackage.CO_MOD_OFFER___CLOSE_MODULE_OFFER_V0:
			closeModuleOffer_v0();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_CoModOffer_0_1_CMO_updateEx_v1_blackBBFBFFF(SystemTimer system,
			CoModOffer _this, Exam ex) {
		Exam exOld = _this.getExams();
		if (exOld != null) {
			if (!ex.equals(exOld)) {
				Semester currSem = ex.getSemester();
				if (currSem != null) {
					CMO_STATE this_state = _this.getState();
					long system_currentTime = system.getCurrentTime();
					Semester semOld = exOld.getSemester();
					if (semOld != null) {
						if (!currSem.equals(semOld)) {
							if (currSem.equals(semOld.getNext())) {
								boolean currSem_current = currSem.isCurrent();
								if (currSem_current == true) {
									long currSem_regPeriodStart = currSem.getRegPeriodStart();
									if (system_currentTime < currSem_regPeriodStart) {
										long currSem_startDate = currSem.getStartDate();
										if (system_currentTime > currSem_startDate) {
											CMO_STATE this_state_prime;

											this_state_prime = CMO_STATE.CMO_READY;
											boolean thisIs_RESETTED_state;

											thisIs_RESETTED_state = (this_state == CMO_STATE.CMO_RESETTED);
											boolean thisIs_LECTURE_UPDATED_state;

											thisIs_LECTURE_UPDATED_state = (this_state == CMO_STATE.CMO_LECT_UPDATED);
											if (thisIs_RESETTED_state || thisIs_LECTURE_UPDATED_state) {
												return new Object[] { system, _this, exOld, ex, currSem, semOld,
														this_state_prime };
											}
										}
									}
								}

							}
						}
					}

				}

			}
		}

		return null;
	}

	public static final Object[] pattern_CoModOffer_0_1_CMO_updateEx_v1_redBB(CoModOffer _this, Exam exOld) {
		_this.setExams(null);
		return new Object[] { _this, exOld };
	}

	public static final Object[] pattern_CoModOffer_0_1_CMO_updateEx_v1_greenBBB(CoModOffer _this, Exam ex,
			CMO_STATE this_state_prime) {
		_this.setExams(ex);
		_this.setState(this_state_prime);
		return new Object[] { _this, ex, this_state_prime };
	}

	public static final Object[] pattern_CoModOffer_1_1_CMO_setLecture_v0_blackFFBBF(CoModOffer _this, Lecture lect) {
		Semester semNext = lect.getSemester();
		if (semNext != null) {
			CMO_STATE this_state = _this.getState();
			if (this_state == CMO_STATE.CMO_CREATED) {
				Semester semCurr = semNext.getPrevious();
				if (semCurr != null) {
					if (!semCurr.equals(semNext)) {
						boolean semCurr_current = semCurr.isCurrent();
						if (semCurr_current == true) {
							CMO_STATE this_state_prime;

							this_state_prime = CMO_STATE.CMO_LECT_SET;
							return new Object[] { semCurr, semNext, _this, lect, this_state_prime };
						}

					}
				}
			}

		}

		return null;
	}

	public static final Object[] pattern_CoModOffer_1_1_CMO_setLecture_v0_greenBBB(CoModOffer _this, Lecture lect,
			CMO_STATE this_state_prime) {
		_this.setLectures(lect);
		_this.setState(this_state_prime);
		return new Object[] { _this, lect, this_state_prime };
	}

	public static final Object[] pattern_CoModOffer_2_1_CMO_setExam_v0_blackFFBBF(CoModOffer _this, Exam ex) {
		Semester semNext = ex.getSemester();
		if (semNext != null) {
			CMO_STATE this_state = _this.getState();
			if (this_state == CMO_STATE.CMO_LECT_SET) {
				Semester semCurr = semNext.getPrevious();
				if (semCurr != null) {
					if (!semCurr.equals(semNext)) {
						boolean semCurr_current = semCurr.isCurrent();
						if (semCurr_current == true) {
							CMO_STATE this_state_prime;

							this_state_prime = CMO_STATE.CMO_READY;
							return new Object[] { semCurr, semNext, _this, ex, this_state_prime };
						}

					}
				}
			}

		}

		return null;
	}

	public static final Object[] pattern_CoModOffer_2_1_CMO_setExam_v0_greenBBB(CoModOffer _this, Exam ex,
			CMO_STATE this_state_prime) {
		_this.setExams(ex);
		_this.setState(this_state_prime);
		return new Object[] { _this, ex, this_state_prime };
	}

	public static final Object[] pattern_CoModOffer_3_1_CMO_resetCMO_v0_blackBF(CoModOffer _this) {
		CMO_STATE this_state = _this.getState();
		if (this_state == CMO_STATE.CMO_READY) {
			CMO_STATE this_state_prime;

			this_state_prime = CMO_STATE.CMO_RESETTED;
			return new Object[] { _this, this_state_prime };
		}

		return null;
	}

	public static final Object[] pattern_CoModOffer_3_1_CMO_resetCMO_v0_greenBB(CoModOffer _this,
			CMO_STATE this_state_prime) {
		_this.setState(this_state_prime);
		return new Object[] { _this, this_state_prime };
	}

	public static final Object[] pattern_CoModOffer_4_1_CMO_updateEx_v0_blackBFBFFF(CoModOffer _this, Exam ex) {
		Exam exOld = _this.getExams();
		if (exOld != null) {
			if (!ex.equals(exOld)) {
				Semester semCurr = ex.getSemester();
				if (semCurr != null) {
					CMO_STATE this_state = _this.getState();
					Semester semOld = exOld.getSemester();
					if (semOld != null) {
						if (!semCurr.equals(semOld)) {
							if (semCurr.equals(semOld.getNext())) {
								boolean semCurr_current = semCurr.isCurrent();
								if (semCurr_current == true) {
									CMO_STATE this_state_prime;

									this_state_prime = CMO_STATE.CMO_READY;
									boolean thisIs_RESETTED_state;

									thisIs_RESETTED_state = (this_state == CMO_STATE.CMO_RESETTED);
									boolean thisIs_LECTURE_UPDATED_state;

									thisIs_LECTURE_UPDATED_state = (this_state == CMO_STATE.CMO_LECT_UPDATED);
									if (thisIs_RESETTED_state || thisIs_LECTURE_UPDATED_state) {
										return new Object[] { _this, exOld, ex, semCurr, semOld, this_state_prime };
									}
								}

							}
						}
					}

				}

			}
		}

		return null;
	}

	public static final Object[] pattern_CoModOffer_4_1_CMO_updateEx_v0_redBB(CoModOffer _this, Exam exOld) {
		_this.setExams(null);
		return new Object[] { _this, exOld };
	}

	public static final Object[] pattern_CoModOffer_4_1_CMO_updateEx_v0_greenBBB(CoModOffer _this, Exam ex,
			CMO_STATE this_state_prime) {
		_this.setExams(ex);
		_this.setState(this_state_prime);
		return new Object[] { _this, ex, this_state_prime };
	}

	public static final Object[] pattern_CoModOffer_5_1_CMO_updateLect_v0_blackFFBBFF(CoModOffer _this, Lecture lec) {
		Semester semNext = lec.getSemester();
		if (semNext != null) {
			Lecture lecOld = _this.getLectures();
			if (lecOld != null) {
				if (!lec.equals(lecOld)) {
					CMO_STATE this_state = _this.getState();
					if (this_state == CMO_STATE.CMO_RESETTED) {
						Semester semCurr = semNext.getPrevious();
						if (semCurr != null) {
							if (!semCurr.equals(semNext)) {
								if (semCurr.getOfferedLectures().contains(lecOld)) {
									boolean semCurr_current = semCurr.isCurrent();
									if (semCurr_current == true) {
										CMO_STATE this_state_prime;

										this_state_prime = CMO_STATE.CMO_LECT_UPDATED;
										return new Object[] { semCurr, semNext, _this, lec, lecOld, this_state_prime };
									}

								}
							}
						}
					}

				}
			}

		}

		return null;
	}

	public static final Object[] pattern_CoModOffer_5_1_CMO_updateLect_v0_redBB(CoModOffer _this, Lecture lecOld) {
		_this.setLectures(null);
		return new Object[] { _this, lecOld };
	}

	public static final Object[] pattern_CoModOffer_5_1_CMO_updateLect_v0_greenBBB(CoModOffer _this, Lecture lec,
			CMO_STATE this_state_prime) {
		_this.setLectures(lec);
		_this.setState(this_state_prime);
		return new Object[] { _this, lec, this_state_prime };
	}

	public static final Object[] pattern_CoModOffer_6_1_MO_closeModOffer_v0_blackBF(CoModOffer _this) {
		CMO_STATE this_state = _this.getState();
		if (this_state == CMO_STATE.CMO_RESETTED) {
			CMO_STATE this_state_prime;

			this_state_prime = CMO_STATE.CMO_CLOSED;
			return new Object[] { _this, this_state_prime };
		}

		return null;
	}

	public static final Object[] pattern_CoModOffer_6_1_MO_closeModOffer_v0_greenBB(CoModOffer _this,
			CMO_STATE this_state_prime) {
		_this.setState(this_state_prime);
		return new Object[] { _this, this_state_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CoModOfferImpl
