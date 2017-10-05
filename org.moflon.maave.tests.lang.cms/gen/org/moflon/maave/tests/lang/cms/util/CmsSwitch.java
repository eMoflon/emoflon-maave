/**
 */
package org.moflon.maave.tests.lang.cms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.maave.tests.lang.cms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cms.CmsPackage
 * @generated
 */
public class CmsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsSwitch() {
		if (modelPackage == null) {
			modelPackage = CmsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CmsPackage.USER_DEFINED_CONSTRAINTS: {
			UserDefinedConstraints userDefinedConstraints = (UserDefinedConstraints) theEObject;
			T result = caseUserDefinedConstraints(userDefinedConstraints);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.MODULE: {
			Module module = (Module) theEObject;
			T result = caseModule(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.EXAM_PROTOTYPE: {
			ExamPrototype examPrototype = (ExamPrototype) theEObject;
			T result = caseExamPrototype(examPrototype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.SEMESTER: {
			Semester semester = (Semester) theEObject;
			T result = caseSemester(semester);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.THESIS_MODULE: {
			ThesisModule thesisModule = (ThesisModule) theEObject;
			T result = caseThesisModule(thesisModule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.THESIS_RECORD: {
			ThesisRecord thesisRecord = (ThesisRecord) theEObject;
			T result = caseThesisRecord(thesisRecord);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.DEGREE: {
			degree degree = (degree) theEObject;
			T result = casedegree(degree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.CALENDAR_DATE: {
			CalendarDate calendarDate = (CalendarDate) theEObject;
			T result = caseCalendarDate(calendarDate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.LECTURE_PROTOTYPE: {
			LecturePrototype lecturePrototype = (LecturePrototype) theEObject;
			T result = caseLecturePrototype(lecturePrototype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.MODULE_OFFER: {
			ModuleOffer moduleOffer = (ModuleOffer) theEObject;
			T result = caseModuleOffer(moduleOffer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.PROGRAM_MANAGEMENT: {
			ProgramManagement programManagement = (ProgramManagement) theEObject;
			T result = caseProgramManagement(programManagement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.SYS: {
			Sys sys = (Sys) theEObject;
			T result = caseSys(sys);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.GRADE_FORMULAR: {
			GradeFormular gradeFormular = (GradeFormular) theEObject;
			T result = caseGradeFormular(gradeFormular);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.ENTRY: {
			Entry entry = (Entry) theEObject;
			T result = caseEntry(entry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.ENROLLMENT: {
			Enrollment enrollment = (Enrollment) theEObject;
			T result = caseEnrollment(enrollment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.STUDENT: {
			Student student = (Student) theEObject;
			T result = caseStudent(student);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.LECTURE_MANAGEMENT: {
			LectureManagement lectureManagement = (LectureManagement) theEObject;
			T result = caseLectureManagement(lectureManagement);
			if (result == null)
				result = caseModule(lectureManagement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.RECORD: {
			Record record = (Record) theEObject;
			T result = caseRecord(record);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.ROOM: {
			Room room = (Room) theEObject;
			T result = caseRoom(room);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.STRUDENT_AFFAIRS: {
			StrudentAffairs strudentAffairs = (StrudentAffairs) theEObject;
			T result = caseStrudentAffairs(strudentAffairs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.CMS: {
			CMS cms = (CMS) theEObject;
			T result = caseCMS(cms);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.EXAM: {
			Exam exam = (Exam) theEObject;
			T result = caseExam(exam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.ROOM_MANAGEMENT: {
			RoomManagement roomManagement = (RoomManagement) theEObject;
			T result = caseRoomManagement(roomManagement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.BOOKING: {
			Booking booking = (Booking) theEObject;
			T result = caseBooking(booking);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.LECTURE: {
			Lecture lecture = (Lecture) theEObject;
			T result = caseLecture(lecture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsPackage.THESIS_OFFER: {
			ThesisOffer thesisOffer = (ThesisOffer) theEObject;
			T result = caseThesisOffer(thesisOffer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedConstraints(UserDefinedConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamPrototype(ExamPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemester(Semester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thesis Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thesis Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThesisModule(ThesisModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thesis Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thesis Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThesisRecord(ThesisRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedegree(degree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarDate(CalendarDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lecture Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lecture Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLecturePrototype(LecturePrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleOffer(ModuleOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramManagement(ProgramManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSys(Sys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grade Formular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grade Formular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradeFormular(GradeFormular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrollment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrollment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrollment(Enrollment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent(Student object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lecture Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lecture Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLectureManagement(LectureManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strudent Affairs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strudent Affairs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrudentAffairs(StrudentAffairs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMS(CMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam(Exam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomManagement(RoomManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLecture(Lecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thesis Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thesis Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThesisOffer(ThesisOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CmsSwitch
