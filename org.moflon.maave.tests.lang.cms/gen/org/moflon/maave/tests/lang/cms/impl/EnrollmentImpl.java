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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cms.CmsFactory;
import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.EN_STATE;
import org.moflon.maave.tests.lang.cms.EX_STATE;
import org.moflon.maave.tests.lang.cms.Enrollment;
import org.moflon.maave.tests.lang.cms.Exam;
import org.moflon.maave.tests.lang.cms.Module;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
import org.moflon.maave.tests.lang.cms.Program;
import org.moflon.maave.tests.lang.cms.Record;
import org.moflon.maave.tests.lang.cms.Student;
import org.moflon.maave.tests.lang.cms.Sys;
import org.moflon.maave.tests.lang.cms.ThesisModule;
import org.moflon.maave.tests.lang.cms.ThesisOffer;
import org.moflon.maave.tests.lang.cms.ThesisRecord;
import org.moflon.maave.tests.lang.cms.degree;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getThesisRecord <em>Thesis Record</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getState <em>State</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.EnrollmentImpl#getRegCp <em>Reg Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnrollmentImpl extends EObjectImpl implements Enrollment {
	/**
	 * The cached value of the '{@link #getThesisRecord() <em>Thesis Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesisRecord()
	 * @generated
	 * @ordered
	 */
	protected ThesisRecord thesisRecord;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected degree degree;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Sys system;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<Record> records;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected Program program;

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
	protected static final EN_STATE STATE_EDEFAULT = EN_STATE.STUDY;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EN_STATE state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegCp() <em>Reg Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegCp()
	 * @generated
	 * @ordered
	 */
	protected static final int REG_CP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegCp() <em>Reg Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegCp()
	 * @generated
	 * @ordered
	 */
	protected int regCp = REG_CP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnrollmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.ENROLLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student getStudent() {
		if (eContainerFeatureID() != CmsPackage.ENROLLMENT__STUDENT)
			return null;
		return (Student) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStudent, CmsPackage.ENROLLMENT__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer()
				|| (eContainerFeatureID() != CmsPackage.ENROLLMENT__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject) newStudent).eInverseAdd(this, CmsPackage.STUDENT__ENROLLMENT, Student.class,
						msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__STUDENT, newStudent,
					newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisRecord getThesisRecord() {
		return thesisRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesisRecord(ThesisRecord newThesisRecord, NotificationChain msgs) {
		ThesisRecord oldThesisRecord = thesisRecord;
		thesisRecord = newThesisRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsPackage.ENROLLMENT__THESIS_RECORD, oldThesisRecord, newThesisRecord);
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
	public void setThesisRecord(ThesisRecord newThesisRecord) {
		if (newThesisRecord != thesisRecord) {
			NotificationChain msgs = null;
			if (thesisRecord != null)
				msgs = ((InternalEObject) thesisRecord).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.ENROLLMENT__THESIS_RECORD, null, msgs);
			if (newThesisRecord != null)
				msgs = ((InternalEObject) newThesisRecord).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.ENROLLMENT__THESIS_RECORD, null, msgs);
			msgs = basicSetThesisRecord(newThesisRecord, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__THESIS_RECORD, newThesisRecord,
					newThesisRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public degree getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegree(degree newDegree, NotificationChain msgs) {
		degree oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsPackage.ENROLLMENT__DEGREE, oldDegree, newDegree);
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
	public void setDegree(degree newDegree) {
		if (newDegree != degree) {
			NotificationChain msgs = null;
			if (degree != null)
				msgs = ((InternalEObject) degree).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.ENROLLMENT__DEGREE, null, msgs);
			if (newDegree != null)
				msgs = ((InternalEObject) newDegree).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CmsPackage.ENROLLMENT__DEGREE, null, msgs);
			msgs = basicSetDegree(newDegree, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__DEGREE, newDegree, newDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject) system;
			system = (Sys) eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.ENROLLMENT__SYSTEM, oldSystem,
							system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Sys newSystem) {
		Sys oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Record> getRecords() {
		if (records == null) {
			records = new EObjectContainmentWithInverseEList<Record>(Record.class, this, CmsPackage.ENROLLMENT__RECORDS,
					CmsPackage.RECORD__ENROLLMENT);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject) program;
			program = (Program) eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.ENROLLMENT__PROGRAM,
							oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program basicGetProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		Program oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__PROGRAM, oldProgram, program));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN_STATE getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(EN_STATE newState) {
		EN_STATE oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegCp() {
		return regCp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegCp(int newRegCp) {
		int oldRegCp = regCp;
		regCp = newRegCp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.ENROLLMENT__REG_CP, oldRegCp, regCp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerForModule(Module module) {
		// registerForModule
		Object[] result1_black = EnrollmentImpl.pattern_Enrollment_0_1_registerForModule_blackBBFFFFF(this, module);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [registerForModule] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[module] = " + module + ".");
		}
		// Program program = (Program) result1_black[2];
		ModuleOffer moduleOffer = (ModuleOffer) result1_black[3];
		int record_grade_prime_1 = (int) result1_black[4];
		int record_tries_prime_1 = (int) result1_black[5];
		int this_regCp_prime_1 = (int) result1_black[6];
		EnrollmentImpl.pattern_Enrollment_0_1_registerForModule_greenBFBBBB(this, moduleOffer, record_grade_prime_1,
				record_tries_prime_1, this_regCp_prime_1);
		// Record record = (Record) result1_green[1];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerForExam(Exam examREG) {
		// registerForExam
		Object[] result1_black = EnrollmentImpl.pattern_Enrollment_1_1_registerForExam_blackBBFFFF(this, examREG);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [registerForExam] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[examREG] = " + examREG + ".");
		}
		Record recordREG = (Record) result1_black[2];
		// ModuleOffer moduleOfferREG = (ModuleOffer) result1_black[3];
		int recordREG_tries_prime_1 = (int) result1_black[4];
		int examREG_regStudents_prime_1 = (int) result1_black[5];
		EnrollmentImpl.pattern_Enrollment_1_1_registerForExam_greenBBBB(examREG, recordREG, recordREG_tries_prime_1,
				examREG_regStudents_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unregisterFromExam(Exam exam) {
		// unregisterFromExam
		Object[] result1_black = EnrollmentImpl.pattern_Enrollment_2_1_unregisterFromExam_blackBFFBFF(exam, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [unregisterFromExam] failed." + " Variables: "
					+ "[exam] = " + exam + ", " + "[this] = " + this + ".");
		}
		Record record = (Record) result1_black[1];
		// ModuleOffer moduleOffer = (ModuleOffer) result1_black[2];
		int exam_regStudents_prime_1 = (int) result1_black[4];
		int record_tries_prime_1 = (int) result1_black[5];
		EnrollmentImpl.pattern_Enrollment_2_1_unregisterFromExam_redBB(exam, record);

		EnrollmentImpl.pattern_Enrollment_2_1_unregisterFromExam_greenBBBB(exam, record, exam_regStudents_prime_1,
				record_tries_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerForThesisModule(ThesisModule thesisModule) {
		// unregisterFromExam
		Object[] result1_black = EnrollmentImpl.pattern_Enrollment_3_1_unregisterFromExam_blackBBFFFF(thesisModule,
				this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [unregisterFromExam] failed." + " Variables: "
					+ "[thesisModule] = " + thesisModule + ", " + "[this] = " + this + ".");
		}
		EN_STATE this_state_prime_1 = (EN_STATE) result1_black[2];
		int thesisRecord_grade_prime_1 = (int) result1_black[3];
		int thesisRecord_tries_prime_1 = (int) result1_black[4];
		boolean thesisRecord_running_prime_1 = (boolean) result1_black[5];
		EnrollmentImpl.pattern_Enrollment_3_1_unregisterFromExam_greenBFBBBBB(thesisModule, this, this_state_prime_1,
				thesisRecord_grade_prime_1, thesisRecord_tries_prime_1, thesisRecord_running_prime_1);
		// ThesisRecord thesisRecord = (ThesisRecord) result1_green[1];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerThesis() {
		// registerThesis
		Object[] result1_black = EnrollmentImpl.pattern_Enrollment_4_1_registerThesis_blackBFFFF(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [registerThesis] failed." + " Variables: " + "[this] = " + this + ".");
		}
		ThesisModule thesisModule = (ThesisModule) result1_black[1];
		ThesisRecord thesisRecord = (ThesisRecord) result1_black[2];
		int thesisRecord_tries_prime_1 = (int) result1_black[3];
		boolean thesisRecord_running_prime_1 = (boolean) result1_black[4];
		EnrollmentImpl.pattern_Enrollment_4_1_registerThesis_greenBFBBB(thesisModule, thesisRecord,
				thesisRecord_tries_prime_1, thesisRecord_running_prime_1);
		// ThesisOffer ThesisOffer = (ThesisOffer) result1_green[1];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerForExam_v2(Exam examREG) {
		// registerForExam_v2
		Object[] result1_black = EnrollmentImpl.pattern_Enrollment_5_1_registerForExam_v2_blackBBFFFF(this, examREG);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [registerForExam_v2] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[examREG] = " + examREG + ".");
		}
		Record recordREG = (Record) result1_black[2];
		// ModuleOffer moduleOfferREG = (ModuleOffer) result1_black[3];
		int recordREG_tries_prime_1 = (int) result1_black[4];
		int examREG_regStudents_prime_1 = (int) result1_black[5];
		EnrollmentImpl.pattern_Enrollment_5_1_registerForExam_v2_greenBBBB(examREG, recordREG, recordREG_tries_prime_1,
				examREG_regStudents_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unregisterFromExam_v2(Exam exam) {
		// unregisterFromExam
		Object[] result1_black = EnrollmentImpl.pattern_Enrollment_6_1_unregisterFromExam_blackBBFFFF(this, exam);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [unregisterFromExam] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[exam] = " + exam + ".");
		}
		Record record = (Record) result1_black[2];
		// ModuleOffer moduleOffer = (ModuleOffer) result1_black[3];
		int exam_regStudents_prime_1 = (int) result1_black[4];
		int record_tries_prime_1 = (int) result1_black[5];
		EnrollmentImpl.pattern_Enrollment_6_1_unregisterFromExam_redBB(exam, record);

		EnrollmentImpl.pattern_Enrollment_6_1_unregisterFromExam_greenBBBB(exam, record, exam_regStudents_prime_1,
				record_tries_prime_1);

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
		case CmsPackage.ENROLLMENT__STUDENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStudent((Student) otherEnd, msgs);
		case CmsPackage.ENROLLMENT__RECORDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRecords()).basicAdd(otherEnd, msgs);
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
		case CmsPackage.ENROLLMENT__STUDENT:
			return basicSetStudent(null, msgs);
		case CmsPackage.ENROLLMENT__THESIS_RECORD:
			return basicSetThesisRecord(null, msgs);
		case CmsPackage.ENROLLMENT__DEGREE:
			return basicSetDegree(null, msgs);
		case CmsPackage.ENROLLMENT__RECORDS:
			return ((InternalEList<?>) getRecords()).basicRemove(otherEnd, msgs);
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
		case CmsPackage.ENROLLMENT__STUDENT:
			return eInternalContainer().eInverseRemove(this, CmsPackage.STUDENT__ENROLLMENT, Student.class, msgs);
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
		case CmsPackage.ENROLLMENT__STUDENT:
			return getStudent();
		case CmsPackage.ENROLLMENT__THESIS_RECORD:
			return getThesisRecord();
		case CmsPackage.ENROLLMENT__DEGREE:
			return getDegree();
		case CmsPackage.ENROLLMENT__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
		case CmsPackage.ENROLLMENT__RECORDS:
			return getRecords();
		case CmsPackage.ENROLLMENT__PROGRAM:
			if (resolve)
				return getProgram();
			return basicGetProgram();
		case CmsPackage.ENROLLMENT__CP:
			return getCp();
		case CmsPackage.ENROLLMENT__STATE:
			return getState();
		case CmsPackage.ENROLLMENT__REG_CP:
			return getRegCp();
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
		case CmsPackage.ENROLLMENT__STUDENT:
			setStudent((Student) newValue);
			return;
		case CmsPackage.ENROLLMENT__THESIS_RECORD:
			setThesisRecord((ThesisRecord) newValue);
			return;
		case CmsPackage.ENROLLMENT__DEGREE:
			setDegree((degree) newValue);
			return;
		case CmsPackage.ENROLLMENT__SYSTEM:
			setSystem((Sys) newValue);
			return;
		case CmsPackage.ENROLLMENT__RECORDS:
			getRecords().clear();
			getRecords().addAll((Collection<? extends Record>) newValue);
			return;
		case CmsPackage.ENROLLMENT__PROGRAM:
			setProgram((Program) newValue);
			return;
		case CmsPackage.ENROLLMENT__CP:
			setCp((Integer) newValue);
			return;
		case CmsPackage.ENROLLMENT__STATE:
			setState((EN_STATE) newValue);
			return;
		case CmsPackage.ENROLLMENT__REG_CP:
			setRegCp((Integer) newValue);
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
		case CmsPackage.ENROLLMENT__STUDENT:
			setStudent((Student) null);
			return;
		case CmsPackage.ENROLLMENT__THESIS_RECORD:
			setThesisRecord((ThesisRecord) null);
			return;
		case CmsPackage.ENROLLMENT__DEGREE:
			setDegree((degree) null);
			return;
		case CmsPackage.ENROLLMENT__SYSTEM:
			setSystem((Sys) null);
			return;
		case CmsPackage.ENROLLMENT__RECORDS:
			getRecords().clear();
			return;
		case CmsPackage.ENROLLMENT__PROGRAM:
			setProgram((Program) null);
			return;
		case CmsPackage.ENROLLMENT__CP:
			setCp(CP_EDEFAULT);
			return;
		case CmsPackage.ENROLLMENT__STATE:
			setState(STATE_EDEFAULT);
			return;
		case CmsPackage.ENROLLMENT__REG_CP:
			setRegCp(REG_CP_EDEFAULT);
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
		case CmsPackage.ENROLLMENT__STUDENT:
			return getStudent() != null;
		case CmsPackage.ENROLLMENT__THESIS_RECORD:
			return thesisRecord != null;
		case CmsPackage.ENROLLMENT__DEGREE:
			return degree != null;
		case CmsPackage.ENROLLMENT__SYSTEM:
			return system != null;
		case CmsPackage.ENROLLMENT__RECORDS:
			return records != null && !records.isEmpty();
		case CmsPackage.ENROLLMENT__PROGRAM:
			return program != null;
		case CmsPackage.ENROLLMENT__CP:
			return cp != CP_EDEFAULT;
		case CmsPackage.ENROLLMENT__STATE:
			return state != STATE_EDEFAULT;
		case CmsPackage.ENROLLMENT__REG_CP:
			return regCp != REG_CP_EDEFAULT;
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
		case CmsPackage.ENROLLMENT___REGISTER_FOR_MODULE__MODULE:
			registerForModule((Module) arguments.get(0));
			return null;
		case CmsPackage.ENROLLMENT___REGISTER_FOR_EXAM__EXAM:
			registerForExam((Exam) arguments.get(0));
			return null;
		case CmsPackage.ENROLLMENT___UNREGISTER_FROM_EXAM__EXAM:
			unregisterFromExam((Exam) arguments.get(0));
			return null;
		case CmsPackage.ENROLLMENT___REGISTER_FOR_THESIS_MODULE__THESISMODULE:
			registerForThesisModule((ThesisModule) arguments.get(0));
			return null;
		case CmsPackage.ENROLLMENT___REGISTER_THESIS:
			registerThesis();
			return null;
		case CmsPackage.ENROLLMENT___REGISTER_FOR_EXAM_V2__EXAM:
			registerForExam_v2((Exam) arguments.get(0));
			return null;
		case CmsPackage.ENROLLMENT___UNREGISTER_FROM_EXAM_V2__EXAM:
			unregisterFromExam_v2((Exam) arguments.get(0));
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
		result.append(", regCp: ");
		result.append(regCp);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_Enrollment_0_1_registerForModule_blackBBFFFFF(Enrollment _this,
			Module module) {
		Program program = _this.getProgram();
		if (program != null) {
			if (program.getModules().contains(module)) {
				ModuleOffer moduleOffer = module.getModuleOffer();
				if (moduleOffer != null) {
					EN_STATE this_state = _this.getState();
					int this_regCp = _this.getRegCp();
					if (this_regCp <= 178) {
						int moduleOffer_cp = moduleOffer.getCp();
						int record_grade_prime;

						record_grade_prime = 6;
						int record_tries_prime;

						record_tries_prime = 0;
						boolean is_STUDY_STATE;

						is_STUDY_STATE = (this_state == EN_STATE.STUDY);
						boolean is_THESIS_STATE;

						is_THESIS_STATE = (this_state == EN_STATE.THESIS);
						if (is_STUDY_STATE || is_THESIS_STATE) {
							int this_regCp_prime;

							this_regCp_prime = this_regCp + moduleOffer_cp;
							return new Object[] { _this, module, program, moduleOffer, record_grade_prime,
									record_tries_prime, this_regCp_prime };
						}
					}

				}

			}
		}

		return null;
	}

	public static final Object[] pattern_Enrollment_0_1_registerForModule_greenBFBBBB(Enrollment _this,
			ModuleOffer moduleOffer, int record_grade_prime, int record_tries_prime, int this_regCp_prime) {
		Record record = CmsFactory.eINSTANCE.createRecord();
		_this.setRegCp(Integer.valueOf(this_regCp_prime));
		record.setEnrollment(_this);
		record.setModuleOffer(moduleOffer);
		record.setGrade(Integer.valueOf(record_grade_prime));
		record.setTries(Integer.valueOf(record_tries_prime));
		return new Object[] { _this, record, moduleOffer, record_grade_prime, record_tries_prime, this_regCp_prime };
	}

	public static final Object[] pattern_Enrollment_1_1_registerForExam_blackBBFFFF(Enrollment _this, Exam examREG) {
		int examREG_regStudents = examREG.getRegStudents();
		EN_STATE this_state = _this.getState();
		for (Record recordREG : _this.getRecords()) {
			ModuleOffer moduleOfferREG = recordREG.getModuleOffer();
			if (moduleOfferREG != null) {
				if (examREG.equals(moduleOfferREG.getExams())) {
					int recordREG_tries = recordREG.getTries();
					int examREG_regStudents_prime;

					examREG_regStudents_prime = examREG_regStudents + 1;
					boolean is_STUDY_STATE;

					is_STUDY_STATE = (this_state == EN_STATE.STUDY);
					boolean is_THESIS_STATE;

					is_THESIS_STATE = (this_state == EN_STATE.THESIS);
					if (is_STUDY_STATE || is_THESIS_STATE) {
						int recordREG_tries_prime;

						recordREG_tries_prime = recordREG_tries + 1;
						if (recordREG_tries_prime <= 3) {
							return new Object[] { _this, examREG, recordREG, moduleOfferREG, recordREG_tries_prime,
									examREG_regStudents_prime };
						}
					}

				}
			}

		}

		return null;
	}

	public static final Object[] pattern_Enrollment_1_1_registerForExam_greenBBBB(Exam examREG, Record recordREG,
			int recordREG_tries_prime, int examREG_regStudents_prime) {
		recordREG.setExam(examREG);
		recordREG.setTries(Integer.valueOf(recordREG_tries_prime));
		examREG.setRegStudents(Integer.valueOf(examREG_regStudents_prime));
		return new Object[] { examREG, recordREG, recordREG_tries_prime, examREG_regStudents_prime };
	}

	public static final Object[] pattern_Enrollment_2_1_unregisterFromExam_blackBFFBFF(Exam exam, Enrollment _this) {
		int exam_regStudents = exam.getRegStudents();
		EN_STATE this_state = _this.getState();
		for (Record record : exam.getRegistrations()) {
			if (_this.equals(record.getEnrollment())) {
				ModuleOffer moduleOffer = record.getModuleOffer();
				if (moduleOffer != null) {
					if (exam.equals(moduleOffer.getExams())) {
						int record_tries = record.getTries();
						int exam_regStudents_prime;

						exam_regStudents_prime = exam_regStudents - 1;
						boolean is_STUDY_STATE;

						is_STUDY_STATE = (this_state == EN_STATE.STUDY);
						boolean is_THESIS_STATE;

						is_THESIS_STATE = (this_state == EN_STATE.THESIS);
						if (is_STUDY_STATE || is_THESIS_STATE) {
							int record_tries_prime;

							record_tries_prime = record_tries - 1;
							return new Object[] { exam, record, moduleOffer, _this, exam_regStudents_prime,
									record_tries_prime };
						}

					}
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_Enrollment_2_1_unregisterFromExam_redBB(Exam exam, Record record) {
		record.setExam(null);
		return new Object[] { exam, record };
	}

	public static final Object[] pattern_Enrollment_2_1_unregisterFromExam_greenBBBB(Exam exam, Record record,
			int exam_regStudents_prime, int record_tries_prime) {
		exam.setRegStudents(Integer.valueOf(exam_regStudents_prime));
		record.setTries(Integer.valueOf(record_tries_prime));
		return new Object[] { exam, record, exam_regStudents_prime, record_tries_prime };
	}

	public static final Object[] pattern_Enrollment_3_1_unregisterFromExam_blackBBFFFF(ThesisModule thesisModule,
			Enrollment _this) {
		EN_STATE this_state = _this.getState();
		if (this_state == EN_STATE.STUDY) {
			int this_cp = _this.getCp();
			if (this_cp >= 130) {
				EN_STATE this_state_prime;

				this_state_prime = EN_STATE.THESIS;
				int thesisRecord_grade_prime;

				thesisRecord_grade_prime = 6;
				int thesisRecord_tries_prime;

				thesisRecord_tries_prime = 1;
				boolean thesisRecord_running_prime;

				thesisRecord_running_prime = false;
				return new Object[] { thesisModule, _this, this_state_prime, thesisRecord_grade_prime,
						thesisRecord_tries_prime, thesisRecord_running_prime };
			}
		}

		return null;
	}

	public static final Object[] pattern_Enrollment_3_1_unregisterFromExam_greenBFBBBBB(ThesisModule thesisModule,
			Enrollment _this, EN_STATE this_state_prime, int thesisRecord_grade_prime, int thesisRecord_tries_prime,
			boolean thesisRecord_running_prime) {
		ThesisRecord thesisRecord = CmsFactory.eINSTANCE.createThesisRecord();
		_this.setState(this_state_prime);
		thesisRecord.setThesisModule(thesisModule);
		_this.setThesisRecord(thesisRecord);
		thesisRecord.setGrade(Integer.valueOf(thesisRecord_grade_prime));
		thesisRecord.setTries(Integer.valueOf(thesisRecord_tries_prime));
		thesisRecord.setRunning(Boolean.valueOf(thesisRecord_running_prime));
		return new Object[] { thesisModule, thesisRecord, _this, this_state_prime, thesisRecord_grade_prime,
				thesisRecord_tries_prime, thesisRecord_running_prime };
	}

	public static final Object[] pattern_Enrollment_4_1_registerThesis_blackBFFFF(Enrollment _this) {
		ThesisRecord thesisRecord = _this.getThesisRecord();
		if (thesisRecord != null) {
			EN_STATE this_state = _this.getState();
			if (this_state == EN_STATE.THESIS) {
				ThesisModule thesisModule = thesisRecord.getThesisModule();
				if (thesisModule != null) {
					int thesisRecord_grade = thesisRecord.getGrade();
					if (thesisRecord_grade == 6) {
						int thesisRecord_tries = thesisRecord.getTries();
						boolean thesisRecord_running = thesisRecord.isRunning();
						if (thesisRecord_running == false) {
							boolean thesisRecord_running_prime;

							thesisRecord_running_prime = true;
							int thesisRecord_tries_prime;

							thesisRecord_tries_prime = thesisRecord_tries + 1;
							if (thesisRecord_tries_prime == thesisRecord_tries + 1) {
								return new Object[] { _this, thesisModule, thesisRecord, thesisRecord_tries_prime,
										thesisRecord_running_prime };
							}
						}

					}

				}
			}

		}

		return null;
	}

	public static final Object[] pattern_Enrollment_4_1_registerThesis_greenBFBBB(ThesisModule thesisModule,
			ThesisRecord thesisRecord, int thesisRecord_tries_prime, boolean thesisRecord_running_prime) {
		ThesisOffer thesisOffer = CmsFactory.eINSTANCE.createThesisOffer();
		thesisRecord.setTries(Integer.valueOf(thesisRecord_tries_prime));
		thesisRecord.setRunning(Boolean.valueOf(thesisRecord_running_prime));
		thesisModule.getThesises().add(thesisOffer);
		thesisRecord.getThesis().add(thesisOffer);
		return new Object[] { thesisModule, thesisOffer, thesisRecord, thesisRecord_tries_prime,
				thesisRecord_running_prime };
	}

	public static final Object[] pattern_Enrollment_5_1_registerForExam_v2_blackBBFFFF(Enrollment _this, Exam examREG) {
		int examREG_regStudents = examREG.getRegStudents();
		EN_STATE this_state = _this.getState();
		EX_STATE examREG_state = examREG.getState();
		if (examREG_state == EX_STATE.REG_OPEN) {
			for (Record recordREG : _this.getRecords()) {
				ModuleOffer moduleOfferREG = recordREG.getModuleOffer();
				if (moduleOfferREG != null) {
					if (examREG.equals(moduleOfferREG.getExams())) {
						int recordREG_tries = recordREG.getTries();
						int examREG_regStudents_prime;

						examREG_regStudents_prime = examREG_regStudents + 1;
						boolean is_STUDY_STATE;

						is_STUDY_STATE = (this_state == EN_STATE.STUDY);
						boolean is_THESIS_STATE;

						is_THESIS_STATE = (this_state == EN_STATE.THESIS);
						if (is_STUDY_STATE || is_THESIS_STATE) {
							int recordREG_tries_prime;

							recordREG_tries_prime = recordREG_tries + 1;
							if (recordREG_tries_prime <= 3) {
								return new Object[] { _this, examREG, recordREG, moduleOfferREG, recordREG_tries_prime,
										examREG_regStudents_prime };
							}
						}

					}
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_Enrollment_5_1_registerForExam_v2_greenBBBB(Exam examREG, Record recordREG,
			int recordREG_tries_prime, int examREG_regStudents_prime) {
		recordREG.setExam(examREG);
		recordREG.setTries(Integer.valueOf(recordREG_tries_prime));
		examREG.setRegStudents(Integer.valueOf(examREG_regStudents_prime));
		return new Object[] { examREG, recordREG, recordREG_tries_prime, examREG_regStudents_prime };
	}

	public static final Object[] pattern_Enrollment_6_1_unregisterFromExam_blackBBFFFF(Enrollment _this, Exam exam) {
		int exam_regStudents = exam.getRegStudents();
		EN_STATE this_state = _this.getState();
		EX_STATE exam_state = exam.getState();
		if (exam_state == EX_STATE.REG_OPEN) {
			for (Record record : _this.getRecords()) {
				if (exam.equals(record.getExam())) {
					ModuleOffer moduleOffer = record.getModuleOffer();
					if (moduleOffer != null) {
						if (exam.equals(moduleOffer.getExams())) {
							int record_tries = record.getTries();
							int exam_regStudents_prime;

							exam_regStudents_prime = exam_regStudents - 1;
							boolean is_STUDY_STATE;

							is_STUDY_STATE = (this_state == EN_STATE.STUDY);
							boolean is_THESIS_STATE;

							is_THESIS_STATE = (this_state == EN_STATE.THESIS);
							if (is_STUDY_STATE || is_THESIS_STATE) {
								int record_tries_prime;

								record_tries_prime = record_tries - 1;
								return new Object[] { _this, exam, record, moduleOffer, exam_regStudents_prime,
										record_tries_prime };
							}

						}
					}

				}
			}
		}

		return null;
	}

	public static final Object[] pattern_Enrollment_6_1_unregisterFromExam_redBB(Exam exam, Record record) {
		record.setExam(null);
		return new Object[] { exam, record };
	}

	public static final Object[] pattern_Enrollment_6_1_unregisterFromExam_greenBBBB(Exam exam, Record record,
			int exam_regStudents_prime, int record_tries_prime) {
		exam.setRegStudents(Integer.valueOf(exam_regStudents_prime));
		record.setTries(Integer.valueOf(record_tries_prime));
		return new Object[] { exam, record, exam_regStudents_prime, record_tries_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnrollmentImpl
