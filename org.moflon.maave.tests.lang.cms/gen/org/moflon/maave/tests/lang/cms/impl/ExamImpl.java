/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cms.Booking;
import org.moflon.maave.tests.lang.cms.CmsFactory;
import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.EX_STATE;
import org.moflon.maave.tests.lang.cms.Enrollment;
import org.moflon.maave.tests.lang.cms.Entry;
import org.moflon.maave.tests.lang.cms.Exam;
import org.moflon.maave.tests.lang.cms.GradeFormular;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
import org.moflon.maave.tests.lang.cms.Record;
import org.moflon.maave.tests.lang.cms.Room;
import org.moflon.maave.tests.lang.cms.Student;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl#getRegistrations <em>Registrations</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl#getGradeList <em>Grade List</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl#getRegStudents <em>Reg Students</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.ExamImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExamImpl extends EObjectImpl implements Exam {
	/**
	 * The cached value of the '{@link #getRegistrations() <em>Registrations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrations()
	 * @generated
	 * @ordered
	 */
	protected EList<Record> registrations;

	/**
	 * The cached value of the '{@link #getGradeList() <em>Grade List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeList()
	 * @generated
	 * @ordered
	 */
	protected GradeFormular gradeList;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Booking location;

	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final long BEGIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected long begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegStudents() <em>Reg Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegStudents()
	 * @generated
	 * @ordered
	 */
	protected static final int REG_STUDENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegStudents() <em>Reg Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegStudents()
	 * @generated
	 * @ordered
	 */
	protected int regStudents = REG_STUDENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final EX_STATE STATE_EDEFAULT = EX_STATE.INIT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EX_STATE state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.EXAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Record> getRegistrations() {
		if (registrations == null) {
			registrations = new EObjectWithInverseResolvingEList<Record>(Record.class, this,
					CmsPackage.EXAM__REGISTRATIONS, CmsPackage.RECORD__EXAM);
		}
		return registrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradeFormular getGradeList() {
		return gradeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradeList(GradeFormular newGradeList, NotificationChain msgs) {
		GradeFormular oldGradeList = gradeList;
		gradeList = newGradeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__GRADE_LIST,
					oldGradeList, newGradeList);
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
	public void setGradeList(GradeFormular newGradeList) {
		if (newGradeList != gradeList) {
			NotificationChain msgs = null;
			if (gradeList != null)
				msgs = ((InternalEObject) gradeList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.EXAM__GRADE_LIST, null, msgs);
			if (newGradeList != null)
				msgs = ((InternalEObject) newGradeList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.EXAM__GRADE_LIST, null, msgs);
			msgs = basicSetGradeList(newGradeList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__GRADE_LIST, newGradeList,
					newGradeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Booking newLocation, NotificationChain msgs) {
		Booking oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__LOCATION,
					oldLocation, newLocation);
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
	public void setLocation(Booking newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.EXAM__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.EXAM__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(long newBegin) {
		long oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(long newDuration) {
		long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegStudents() {
		return regStudents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegStudents(int newRegStudents) {
		int oldRegStudents = regStudents;
		regStudents = newRegStudents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__REG_STUDENTS, oldRegStudents,
					regStudents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EX_STATE getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(EX_STATE newState) {
		EX_STATE oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.EXAM__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bookRoom(Room room) {
		// bookRoom
		Object[] result1_black = ExamImpl.pattern_Exam_0_1_bookRoom_blackBBFF(this, room);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [bookRoom] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[room] = " + room + ".");
		}
		long bo_end_prime_1 = (long) result1_black[2];
		long bo_begin_prime_1 = (long) result1_black[3];
		ExamImpl.pattern_Exam_0_1_bookRoom_greenBBFBB(this, room, bo_end_prime_1, bo_begin_prime_1);
		// Booking bo = (Booking) result1_green[2];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transscriptRecordPassed() {
		// transscriptRecordPassed
		Object[] result1_black = ExamImpl.pattern_Exam_1_1_transscriptRecordPassed_blackFBFFFFFFFF(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [transscriptRecordPassed] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		Record rec = (Record) result1_black[0];
		// ModuleOffer moduleOffer = (ModuleOffer) result1_black[2];
		Enrollment enrollment = (Enrollment) result1_black[3];
		GradeFormular gradeFormular = (GradeFormular) result1_black[4];
		Entry entry = (Entry) result1_black[5];
		// Student student = (Student) result1_black[6];
		int rec_grade_prime_1 = (int) result1_black[7];
		int enrollment_cp_prime_1 = (int) result1_black[8];
		int gradeFormular_nrOfEntries_prime_1 = (int) result1_black[9];
		ExamImpl.pattern_Exam_1_1_transscriptRecordPassed_redBBBB(rec, this, gradeFormular, entry);

		ExamImpl.pattern_Exam_1_1_transscriptRecordPassed_greenBBBBBB(rec, enrollment, gradeFormular, rec_grade_prime_1,
				enrollment_cp_prime_1, gradeFormular_nrOfEntries_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openREG_v2() {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void closeREG_v2() {
		// closeREG_v2
		Object[] result1_black = ExamImpl.pattern_Exam_3_1_closeREG_v2_blackBFF(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [closeREG_v2] failed." + " Variables: " + "[this] = " + this + ".");
		}
		// GradeFormular formular = (GradeFormular) result1_black[1];
		EX_STATE this_state_prime_1 = (EX_STATE) result1_black[2];
		ExamImpl.pattern_Exam_3_1_closeREG_v2_greenBB(this, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bookRoom_v2(Room room) {
		// bookRoom_v2
		Object[] result1_black = ExamImpl.pattern_Exam_4_1_bookRoom_v2_blackBBFFF(this, room);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [bookRoom_v2] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[room] = " + room + ".");
		}
		long bo_end_prime_1 = (long) result1_black[2];
		long bo_begin_prime_1 = (long) result1_black[3];
		EX_STATE this_state_prime_1 = (EX_STATE) result1_black[4];
		ExamImpl.pattern_Exam_4_1_bookRoom_v2_greenBBFBBB(this, room, bo_end_prime_1, bo_begin_prime_1,
				this_state_prime_1);
		// Booking bo = (Booking) result1_green[2];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transscriptRecord_v2() {
		// transscriptRecord_v2
		Object[] result1_black = ExamImpl.pattern_Exam_5_1_transscriptRecord_v2_blackBFFFFFFFFF(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [transscriptRecord_v2] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		Record rec = (Record) result1_black[1];
		// ModuleOffer moduleOffer = (ModuleOffer) result1_black[2];
		Enrollment enrollment = (Enrollment) result1_black[3];
		GradeFormular gradeFormular = (GradeFormular) result1_black[4];
		Entry entry = (Entry) result1_black[5];
		// Student student = (Student) result1_black[6];
		int rec_grade_prime_1 = (int) result1_black[7];
		int enrollment_cp_prime_1 = (int) result1_black[8];
		int gradeFormular_nrOfEntries_prime_1 = (int) result1_black[9];
		ExamImpl.pattern_Exam_5_1_transscriptRecord_v2_redBBBB(this, rec, gradeFormular, entry);

		ExamImpl.pattern_Exam_5_1_transscriptRecord_v2_greenBBBBBB(rec, enrollment, gradeFormular, rec_grade_prime_1,
				enrollment_cp_prime_1, gradeFormular_nrOfEntries_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void uploadRecords_v2(GradeFormular gradeFormular) {
		// uploadRecords_v2
		Object[] result1_black = ExamImpl.pattern_Exam_6_1_uploadRecords_v2_blackBF(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [uploadRecords_v2] failed." + " Variables: " + "[this] = " + this + ".");
		}
		EX_STATE this_state_prime_1 = (EX_STATE) result1_black[1];
		ExamImpl.pattern_Exam_6_1_uploadRecords_v2_greenFBB(this, this_state_prime_1);
		// GradeFormular gradeFormularNew = (GradeFormular) result1_green[0];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void close_v2() {
		// close_v2
		Object[] result1_black = ExamImpl.pattern_Exam_7_1_close_v2_blackBFF(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [close_v2] failed." + " Variables: " + "[this] = " + this + ".");
		}
		// GradeFormular formular = (GradeFormular) result1_black[1];
		EX_STATE this_state_prime_1 = (EX_STATE) result1_black[2];
		ExamImpl.pattern_Exam_7_1_close_v2_greenBB(this, this_state_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transscriptRecordFailed() {
		// transscriptRecordFailed
		Object[] result1_black = ExamImpl.pattern_Exam_8_1_transscriptRecordFailed_blackBFFFFFFFF(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [transscriptRecordFailed] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		Record rec = (Record) result1_black[1];
		// ModuleOffer moduleOffer = (ModuleOffer) result1_black[2];
		// Enrollment enrollment = (Enrollment) result1_black[3];
		GradeFormular gradeFormular = (GradeFormular) result1_black[4];
		Entry entry = (Entry) result1_black[5];
		// Student student = (Student) result1_black[6];
		int rec_grade_prime_1 = (int) result1_black[7];
		int gradeFormular_nrOfEntries_prime_1 = (int) result1_black[8];
		ExamImpl.pattern_Exam_8_1_transscriptRecordFailed_redBBBB(this, rec, gradeFormular, entry);

		ExamImpl.pattern_Exam_8_1_transscriptRecordFailed_greenBBBB(rec, gradeFormular, rec_grade_prime_1,
				gradeFormular_nrOfEntries_prime_1);

		return;
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
		case CmsPackage.EXAM__REGISTRATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegistrations()).basicAdd(otherEnd, msgs);
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
		case CmsPackage.EXAM__REGISTRATIONS:
			return ((InternalEList<?>) getRegistrations()).basicRemove(otherEnd, msgs);
		case CmsPackage.EXAM__GRADE_LIST:
			return basicSetGradeList(null, msgs);
		case CmsPackage.EXAM__LOCATION:
			return basicSetLocation(null, msgs);
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
		case CmsPackage.EXAM__REGISTRATIONS:
			return getRegistrations();
		case CmsPackage.EXAM__GRADE_LIST:
			return getGradeList();
		case CmsPackage.EXAM__LOCATION:
			return getLocation();
		case CmsPackage.EXAM__BEGIN:
			return getBegin();
		case CmsPackage.EXAM__DURATION:
			return getDuration();
		case CmsPackage.EXAM__REG_STUDENTS:
			return getRegStudents();
		case CmsPackage.EXAM__STATE:
			return getState();
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
		case CmsPackage.EXAM__REGISTRATIONS:
			getRegistrations().clear();
			getRegistrations().addAll((Collection<? extends Record>) newValue);
			return;
		case CmsPackage.EXAM__GRADE_LIST:
			setGradeList((GradeFormular) newValue);
			return;
		case CmsPackage.EXAM__LOCATION:
			setLocation((Booking) newValue);
			return;
		case CmsPackage.EXAM__BEGIN:
			setBegin((Long) newValue);
			return;
		case CmsPackage.EXAM__DURATION:
			setDuration((Long) newValue);
			return;
		case CmsPackage.EXAM__REG_STUDENTS:
			setRegStudents((Integer) newValue);
			return;
		case CmsPackage.EXAM__STATE:
			setState((EX_STATE) newValue);
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
		case CmsPackage.EXAM__REGISTRATIONS:
			getRegistrations().clear();
			return;
		case CmsPackage.EXAM__GRADE_LIST:
			setGradeList((GradeFormular) null);
			return;
		case CmsPackage.EXAM__LOCATION:
			setLocation((Booking) null);
			return;
		case CmsPackage.EXAM__BEGIN:
			setBegin(BEGIN_EDEFAULT);
			return;
		case CmsPackage.EXAM__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case CmsPackage.EXAM__REG_STUDENTS:
			setRegStudents(REG_STUDENTS_EDEFAULT);
			return;
		case CmsPackage.EXAM__STATE:
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
		case CmsPackage.EXAM__REGISTRATIONS:
			return registrations != null && !registrations.isEmpty();
		case CmsPackage.EXAM__GRADE_LIST:
			return gradeList != null;
		case CmsPackage.EXAM__LOCATION:
			return location != null;
		case CmsPackage.EXAM__BEGIN:
			return begin != BEGIN_EDEFAULT;
		case CmsPackage.EXAM__DURATION:
			return duration != DURATION_EDEFAULT;
		case CmsPackage.EXAM__REG_STUDENTS:
			return regStudents != REG_STUDENTS_EDEFAULT;
		case CmsPackage.EXAM__STATE:
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
		case CmsPackage.EXAM___BOOK_ROOM__ROOM:
			bookRoom((Room) arguments.get(0));
			return null;
		case CmsPackage.EXAM___TRANSSCRIPT_RECORD_PASSED:
			transscriptRecordPassed();
			return null;
		case CmsPackage.EXAM___OPEN_REG_V2:
			openREG_v2();
			return null;
		case CmsPackage.EXAM___CLOSE_REG_V2:
			closeREG_v2();
			return null;
		case CmsPackage.EXAM___BOOK_ROOM_V2__ROOM:
			bookRoom_v2((Room) arguments.get(0));
			return null;
		case CmsPackage.EXAM___TRANSSCRIPT_RECORD_V2:
			transscriptRecord_v2();
			return null;
		case CmsPackage.EXAM___UPLOAD_RECORDS_V2__GRADEFORMULAR:
			uploadRecords_v2((GradeFormular) arguments.get(0));
			return null;
		case CmsPackage.EXAM___CLOSE_V2:
			close_v2();
			return null;
		case CmsPackage.EXAM___TRANSSCRIPT_RECORD_FAILED:
			transscriptRecordFailed();
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
		result.append(" (begin: ");
		result.append(begin);
		result.append(", duration: ");
		result.append(duration);
		result.append(", regStudents: ");
		result.append(regStudents);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_Exam_0_1_bookRoom_blackBBFF(Exam _this, Room room) {
		long this_begin = _this.getBegin();
		long this_duration = _this.getDuration();
		int room_capacity = room.getCapacity();
		int this_regStudents = _this.getRegStudents();
		if (room_capacity >= this_regStudents) {
			long bo_begin_prime;

			bo_begin_prime = this_begin;
			long bo_end_prime;

			bo_end_prime = this_begin + this_duration;
			return new Object[] { _this, room, bo_end_prime, bo_begin_prime };
		}

		return null;
	}

	public static final Object[] pattern_Exam_0_1_bookRoom_greenBBFBB(Exam _this, Room room, long bo_end_prime,
			long bo_begin_prime) {
		Booking bo = CmsFactory.eINSTANCE.createBooking();
		_this.setLocation(bo);
		room.getReservations().add(bo);
		bo.setEnd(Long.valueOf(bo_end_prime));
		bo.setBegin(Long.valueOf(bo_begin_prime));
		return new Object[] { _this, room, bo, bo_end_prime, bo_begin_prime };
	}

	public static final Object[] pattern_Exam_1_1_transscriptRecordPassed_blackFBFFFFFFFF(Exam _this) {
		GradeFormular gradeFormular = _this.getGradeList();
		if (gradeFormular != null) {
			int gradeFormular_nrOfEntries = gradeFormular.getNrOfEntries();
			for (Record rec : _this.getRegistrations()) {
				ModuleOffer moduleOffer = rec.getModuleOffer();
				if (moduleOffer != null) {
					if (_this.equals(moduleOffer.getExams())) {
						Enrollment enrollment = rec.getEnrollment();
						if (enrollment != null) {
							int moduleOffer_cp = moduleOffer.getCp();
							Student student = enrollment.getStudent();
							if (student != null) {
								int enrollment_cp = enrollment.getCp();
								int student_id = student.getId();
								for (Entry entry : gradeFormular.getRecords()) {
									int entry_studentId = entry.getStudentId();
									if (student_id == entry_studentId) {
										int entry_grade = entry.getGrade();
										if (entry_grade <= 4) {
											int gradeFormular_nrOfEntries_prime;

											gradeFormular_nrOfEntries_prime = gradeFormular_nrOfEntries - 1;
											int enrollment_cp_prime;

											enrollment_cp_prime = enrollment_cp + moduleOffer_cp;
											int rec_grade_prime;

											rec_grade_prime = entry_grade;
											return new Object[] { rec, _this, moduleOffer, enrollment, gradeFormular,
													entry, student, rec_grade_prime, enrollment_cp_prime,
													gradeFormular_nrOfEntries_prime };
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

	public static final Object[] pattern_Exam_1_1_transscriptRecordPassed_redBBBB(Record rec, Exam _this,
			GradeFormular gradeFormular, Entry entry) {
		rec.setExam(null);
		gradeFormular.getRecords().remove(entry);
		return new Object[] { rec, _this, gradeFormular, entry };
	}

	public static final Object[] pattern_Exam_1_1_transscriptRecordPassed_greenBBBBBB(Record rec, Enrollment enrollment,
			GradeFormular gradeFormular, int rec_grade_prime, int enrollment_cp_prime,
			int gradeFormular_nrOfEntries_prime) {
		rec.setGrade(Integer.valueOf(rec_grade_prime));
		enrollment.setCp(Integer.valueOf(enrollment_cp_prime));
		gradeFormular.setNrOfEntries(Integer.valueOf(gradeFormular_nrOfEntries_prime));
		return new Object[] { rec, enrollment, gradeFormular, rec_grade_prime, enrollment_cp_prime,
				gradeFormular_nrOfEntries_prime };
	}

	public static final Object[] pattern_Exam_3_1_closeREG_v2_blackBFF(Exam _this) {
		GradeFormular formular = _this.getGradeList();
		if (formular != null) {
			EX_STATE this_state = _this.getState();
			if (this_state == EX_STATE.REG_OPEN) {
				EX_STATE this_state_prime;

				this_state_prime = EX_STATE.REG_CLOSED;
				return new Object[] { _this, formular, this_state_prime };
			}

		}

		return null;
	}

	public static final Object[] pattern_Exam_3_1_closeREG_v2_greenBB(Exam _this, EX_STATE this_state_prime) {
		_this.setState(this_state_prime);
		return new Object[] { _this, this_state_prime };
	}

	public static final Object[] pattern_Exam_4_1_bookRoom_v2_blackBBFFF(Exam _this, Room room) {
		long this_begin = _this.getBegin();
		long this_duration = _this.getDuration();
		int room_capacity = room.getCapacity();
		int this_regStudents = _this.getRegStudents();
		if (room_capacity >= this_regStudents) {
			EX_STATE this_state = _this.getState();
			if (this_state == EX_STATE.REG_CLOSED) {
				EX_STATE this_state_prime;

				this_state_prime = EX_STATE.PERFORM;
				long bo_begin_prime;

				bo_begin_prime = this_begin;
				long bo_end_prime;

				bo_end_prime = this_begin + this_duration;
				return new Object[] { _this, room, bo_end_prime, bo_begin_prime, this_state_prime };
			}
		}

		return null;
	}

	public static final Object[] pattern_Exam_4_1_bookRoom_v2_greenBBFBBB(Exam _this, Room room, long bo_end_prime,
			long bo_begin_prime, EX_STATE this_state_prime) {
		Booking bo = CmsFactory.eINSTANCE.createBooking();
		_this.setState(this_state_prime);
		_this.setLocation(bo);
		room.getReservations().add(bo);
		bo.setEnd(Long.valueOf(bo_end_prime));
		bo.setBegin(Long.valueOf(bo_begin_prime));
		return new Object[] { _this, room, bo, bo_end_prime, bo_begin_prime, this_state_prime };
	}

	public static final Object[] pattern_Exam_5_1_transscriptRecord_v2_blackBFFFFFFFFF(Exam _this) {
		GradeFormular gradeFormular = _this.getGradeList();
		if (gradeFormular != null) {
			EX_STATE this_state = _this.getState();
			if (this_state == EX_STATE.RECORDS) {
				int gradeFormular_nrOfEntries = gradeFormular.getNrOfEntries();
				for (Record rec : _this.getRegistrations()) {
					ModuleOffer moduleOffer = rec.getModuleOffer();
					if (moduleOffer != null) {
						if (_this.equals(moduleOffer.getExams())) {
							Enrollment enrollment = rec.getEnrollment();
							if (enrollment != null) {
								int moduleOffer_cp = moduleOffer.getCp();
								Student student = enrollment.getStudent();
								if (student != null) {
									int enrollment_cp = enrollment.getCp();
									int student_id = student.getId();
									for (Entry entry : gradeFormular.getRecords()) {
										int entry_studentId = entry.getStudentId();
										if (student_id == entry_studentId) {
											int entry_grade = entry.getGrade();
											if (entry_grade <= 5) {
												if (entry_grade > 0) {
													int gradeFormular_nrOfEntries_prime;

													gradeFormular_nrOfEntries_prime = gradeFormular_nrOfEntries - 1;
													if (gradeFormular_nrOfEntries_prime >= 1) {
														int newCP;

														newCP = enrollment_cp + moduleOffer_cp;
														int rec_grade_prime;

														rec_grade_prime = entry_grade;
														boolean passed;

														passed = (entry_grade <= 4);
														int enrollment_cp_prime;

														enrollment_cp_prime = passed ? newCP : enrollment_cp;
														return new Object[] { _this, rec, moduleOffer, enrollment,
																gradeFormular, entry, student, rec_grade_prime,
																enrollment_cp_prime, gradeFormular_nrOfEntries_prime };
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
			}

		}

		return null;
	}

	public static final Object[] pattern_Exam_5_1_transscriptRecord_v2_redBBBB(Exam _this, Record rec,
			GradeFormular gradeFormular, Entry entry) {
		rec.setExam(null);
		gradeFormular.getRecords().remove(entry);
		return new Object[] { _this, rec, gradeFormular, entry };
	}

	public static final Object[] pattern_Exam_5_1_transscriptRecord_v2_greenBBBBBB(Record rec, Enrollment enrollment,
			GradeFormular gradeFormular, int rec_grade_prime, int enrollment_cp_prime,
			int gradeFormular_nrOfEntries_prime) {
		rec.setGrade(Integer.valueOf(rec_grade_prime));
		enrollment.setCp(Integer.valueOf(enrollment_cp_prime));
		gradeFormular.setNrOfEntries(Integer.valueOf(gradeFormular_nrOfEntries_prime));
		return new Object[] { rec, enrollment, gradeFormular, rec_grade_prime, enrollment_cp_prime,
				gradeFormular_nrOfEntries_prime };
	}

	public static final Object[] pattern_Exam_6_1_uploadRecords_v2_blackBF(Exam _this) {
		EX_STATE this_state = _this.getState();
		if (this_state == EX_STATE.PERFORM) {
			EX_STATE this_state_prime;

			this_state_prime = EX_STATE.RECORDS;
			return new Object[] { _this, this_state_prime };
		}

		return null;
	}

	public static final Object[] pattern_Exam_6_1_uploadRecords_v2_greenFBB(Exam _this, EX_STATE this_state_prime) {
		GradeFormular gradeFormularNew = CmsFactory.eINSTANCE.createGradeFormular();
		_this.setState(this_state_prime);
		_this.setGradeList(gradeFormularNew);
		return new Object[] { gradeFormularNew, _this, this_state_prime };
	}

	public static final Object[] pattern_Exam_7_1_close_v2_blackBFF(Exam _this) {
		GradeFormular formular = _this.getGradeList();
		if (formular != null) {
			EX_STATE this_state = _this.getState();
			if (this_state == EX_STATE.RECORDS) {
				int formular_nrOfEntries = formular.getNrOfEntries();
				if (formular_nrOfEntries == 0) {
					EX_STATE this_state_prime;

					this_state_prime = EX_STATE.CLOSED;
					return new Object[] { _this, formular, this_state_prime };
				}
			}

		}

		return null;
	}

	public static final Object[] pattern_Exam_7_1_close_v2_greenBB(Exam _this, EX_STATE this_state_prime) {
		_this.setState(this_state_prime);
		return new Object[] { _this, this_state_prime };
	}

	public static final Object[] pattern_Exam_8_1_transscriptRecordFailed_blackBFFFFFFFF(Exam _this) {
		GradeFormular gradeFormular = _this.getGradeList();
		if (gradeFormular != null) {
			int gradeFormular_nrOfEntries = gradeFormular.getNrOfEntries();
			for (Record rec : _this.getRegistrations()) {
				ModuleOffer moduleOffer = rec.getModuleOffer();
				if (moduleOffer != null) {
					if (_this.equals(moduleOffer.getExams())) {
						Enrollment enrollment = rec.getEnrollment();
						if (enrollment != null) {
							Student student = enrollment.getStudent();
							if (student != null) {
								int student_id = student.getId();
								for (Entry entry : gradeFormular.getRecords()) {
									int entry_studentId = entry.getStudentId();
									if (student_id == entry_studentId) {
										int entry_grade = entry.getGrade();
										if (entry_grade > 4) {
											int gradeFormular_nrOfEntries_prime;

											gradeFormular_nrOfEntries_prime = gradeFormular_nrOfEntries - 1;
											int rec_grade_prime;

											rec_grade_prime = entry_grade;
											return new Object[] { _this, rec, moduleOffer, enrollment, gradeFormular,
													entry, student, rec_grade_prime, gradeFormular_nrOfEntries_prime };
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

	public static final Object[] pattern_Exam_8_1_transscriptRecordFailed_redBBBB(Exam _this, Record rec,
			GradeFormular gradeFormular, Entry entry) {
		rec.setExam(null);
		gradeFormular.getRecords().remove(entry);
		return new Object[] { _this, rec, gradeFormular, entry };
	}

	public static final Object[] pattern_Exam_8_1_transscriptRecordFailed_greenBBBB(Record rec,
			GradeFormular gradeFormular, int rec_grade_prime, int gradeFormular_nrOfEntries_prime) {
		rec.setGrade(Integer.valueOf(rec_grade_prime));
		gradeFormular.setNrOfEntries(Integer.valueOf(gradeFormular_nrOfEntries_prime));
		return new Object[] { rec, gradeFormular, rec_grade_prime, gradeFormular_nrOfEntries_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExamImpl
