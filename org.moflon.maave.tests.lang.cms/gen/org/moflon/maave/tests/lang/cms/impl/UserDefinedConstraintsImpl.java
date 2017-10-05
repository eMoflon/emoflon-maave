/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.Enrollment;
import org.moflon.maave.tests.lang.cms.Entry;
import org.moflon.maave.tests.lang.cms.Exam;
import org.moflon.maave.tests.lang.cms.GradeFormular;
import org.moflon.maave.tests.lang.cms.ModuleOffer;
import org.moflon.maave.tests.lang.cms.Record;
import org.moflon.maave.tests.lang.cms.Student;
import org.moflon.maave.tests.lang.cms.UserDefinedConstraints;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserDefinedConstraintsImpl extends EObjectImpl implements UserDefinedConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.USER_DEFINED_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_atMostOneRecordForModuleOffer(Enrollment enrolment) {
		// ActivityNode1
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_0_1_ActivityNode1_blackFFFB(enrolment);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode1] failed." + " Variables: "
					+ "[enrolment] = " + enrolment + ".");
		}
		// ModuleOffer moduleOffer = (ModuleOffer) result1_black[0];
		// Record recA = (Record) result1_black[1];
		// Record recB = (Record) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_onlyOneEntryForID(GradeFormular gradeFormular) {
		// ActivityNode2
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_1_1_ActivityNode2_blackBFF(gradeFormular);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode2] failed." + " Variables: "
					+ "[gradeFormular] = " + gradeFormular + ".");
		}
		// Entry entryB = (Entry) result1_black[1];
		// Entry entryA = (Entry) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_noTwoStudentsWithSameId(Student studentA, Student studentB) {
		// ActivityNode3
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_2_1_ActivityNode3_blackBB(studentA, studentB);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode3] failed." + " Variables: "
					+ "[studentA] = " + studentA + ", " + "[studentB] = " + studentB + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_atMostOneRegistrationForExamPerEnrolment(Enrollment enrolment) {
		// ActivityNode4
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_3_1_ActivityNode4_blackBFFF(enrolment);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode4] failed." + " Variables: "
					+ "[enrolment] = " + enrolment + ".");
		}
		// Record recordA = (Record) result1_black[1];
		// Record recordB = (Record) result1_black[2];
		// Exam exam = (Exam) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_onlyOneExamForFromular(Exam examB, Exam examA) {
		// ActivityNode5
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_4_1_ActivityNode5_blackBBF(examA, examB);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode5] failed." + " Variables: "
					+ "[examA] = " + examA + ", " + "[examB] = " + examB + ".");
		}
		// GradeFormular formular = (GradeFormular) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CmsPackage.USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_RECORD_FOR_MODULE_OFFER__ENROLLMENT:
			_NC_atMostOneRecordForModuleOffer((Enrollment) arguments.get(0));
			return null;
		case CmsPackage.USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_ENTRY_FOR_ID__GRADEFORMULAR:
			_NC_onlyOneEntryForID((GradeFormular) arguments.get(0));
			return null;
		case CmsPackage.USER_DEFINED_CONSTRAINTS___NC_NO_TWO_STUDENTS_WITH_SAME_ID__STUDENT_STUDENT:
			_NC_noTwoStudentsWithSameId((Student) arguments.get(0), (Student) arguments.get(1));
			return null;
		case CmsPackage.USER_DEFINED_CONSTRAINTS___NC_AT_MOST_ONE_REGISTRATION_FOR_EXAM_PER_ENROLMENT__ENROLLMENT:
			_NC_atMostOneRegistrationForExamPerEnrolment((Enrollment) arguments.get(0));
			return null;
		case CmsPackage.USER_DEFINED_CONSTRAINTS___NC_ONLY_ONE_EXAM_FOR_FROMULAR__EXAM_EXAM:
			_NC_onlyOneExamForFromular((Exam) arguments.get(0), (Exam) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UserDefinedConstraints_0_1_ActivityNode1_blackFFFB(Enrollment enrolment) {
		for (Record recA : enrolment.getRecords()) {
			ModuleOffer moduleOffer = recA.getModuleOffer();
			if (moduleOffer != null) {
				for (Record recB : enrolment.getRecords()) {
					if (!recA.equals(recB)) {
						if (moduleOffer.equals(recB.getModuleOffer())) {
							return new Object[] { moduleOffer, recA, recB, enrolment };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_UserDefinedConstraints_1_1_ActivityNode2_blackBFF(
			GradeFormular gradeFormular) {
		for (Entry entryA : gradeFormular.getRecords()) {
			int entryA_studentId = entryA.getStudentId();
			for (Entry entryB : gradeFormular.getRecords()) {
				if (!entryA.equals(entryB)) {
					int entryB_studentId = entryB.getStudentId();
					if (entryA_studentId == entryB_studentId) {
						return new Object[] { gradeFormular, entryB, entryA };
					}

				}
			}

		}
		return null;
	}

	public static final Object[] pattern_UserDefinedConstraints_2_1_ActivityNode3_blackBB(Student studentA,
			Student studentB) {
		if (!studentA.equals(studentB)) {
			int studentA_id = studentA.getId();
			int studentB_id = studentB.getId();
			if (studentA_id == studentB_id) {
				return new Object[] { studentA, studentB };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserDefinedConstraints_3_1_ActivityNode4_blackBFFF(Enrollment enrolment) {
		for (Record recordB : enrolment.getRecords()) {
			Exam exam = recordB.getExam();
			if (exam != null) {
				for (Record recordA : enrolment.getRecords()) {
					if (!recordA.equals(recordB)) {
						if (exam.equals(recordA.getExam())) {
							return new Object[] { enrolment, recordA, recordB, exam };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_UserDefinedConstraints_4_1_ActivityNode5_blackBBF(Exam examA, Exam examB) {
		if (!examA.equals(examB)) {
			GradeFormular formular = examA.getGradeList();
			if (formular != null) {
				if (formular.equals(examB.getGradeList())) {
					return new Object[] { examA, examB, formular };
				}
			}

		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserDefinedConstraintsImpl
