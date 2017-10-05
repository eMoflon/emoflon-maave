/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.Exam;
import org.moflon.maave.tests.lang.cms.Lecture;
import org.moflon.maave.tests.lang.cms.Semester;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl#getOfferedLectures <em>Offered Lectures</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl#getExams <em>Exams</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.SemesterImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemesterImpl extends EObjectImpl implements Semester {
	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Semester previous;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Semester next;

	/**
	 * The cached value of the '{@link #getOfferedLectures() <em>Offered Lectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedLectures()
	 * @generated
	 * @ordered
	 */
	protected EList<Lecture> offeredLectures;

	/**
	 * The cached value of the '{@link #getExams() <em>Exams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExams()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam> exams;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final long START_DATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected long startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final long END_DATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected long endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject) previous;
			previous = (Semester) eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.SEMESTER__PREVIOUS,
							oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Semester newPrevious, NotificationChain msgs) {
		Semester oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CmsPackage.SEMESTER__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(Semester newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this, CmsPackage.SEMESTER__NEXT, Semester.class,
						msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this, CmsPackage.SEMESTER__NEXT, Semester.class,
						msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.SEMESTER__PREVIOUS, newPrevious,
					newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (Semester) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsPackage.SEMESTER__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Semester newNext, NotificationChain msgs) {
		Semester oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsPackage.SEMESTER__NEXT,
					oldNext, newNext);
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
	public void setNext(Semester newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, CmsPackage.SEMESTER__PREVIOUS, Semester.class,
						msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this, CmsPackage.SEMESTER__PREVIOUS, Semester.class,
						msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.SEMESTER__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lecture> getOfferedLectures() {
		if (offeredLectures == null) {
			offeredLectures = new EObjectContainmentEList<Lecture>(Lecture.class, this,
					CmsPackage.SEMESTER__OFFERED_LECTURES);
		}
		return offeredLectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam> getExams() {
		if (exams == null) {
			exams = new EObjectContainmentEList<Exam>(Exam.class, this, CmsPackage.SEMESTER__EXAMS);
		}
		return exams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(long newStartDate) {
		long oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.SEMESTER__START_DATE, oldStartDate,
					startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(long newEndDate) {
		long oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.SEMESTER__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsPackage.SEMESTER__PREVIOUS:
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this, CmsPackage.SEMESTER__NEXT, Semester.class,
						msgs);
			return basicSetPrevious((Semester) otherEnd, msgs);
		case CmsPackage.SEMESTER__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, CmsPackage.SEMESTER__PREVIOUS, Semester.class,
						msgs);
			return basicSetNext((Semester) otherEnd, msgs);
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
		case CmsPackage.SEMESTER__PREVIOUS:
			return basicSetPrevious(null, msgs);
		case CmsPackage.SEMESTER__NEXT:
			return basicSetNext(null, msgs);
		case CmsPackage.SEMESTER__OFFERED_LECTURES:
			return ((InternalEList<?>) getOfferedLectures()).basicRemove(otherEnd, msgs);
		case CmsPackage.SEMESTER__EXAMS:
			return ((InternalEList<?>) getExams()).basicRemove(otherEnd, msgs);
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
		case CmsPackage.SEMESTER__PREVIOUS:
			if (resolve)
				return getPrevious();
			return basicGetPrevious();
		case CmsPackage.SEMESTER__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case CmsPackage.SEMESTER__OFFERED_LECTURES:
			return getOfferedLectures();
		case CmsPackage.SEMESTER__EXAMS:
			return getExams();
		case CmsPackage.SEMESTER__START_DATE:
			return getStartDate();
		case CmsPackage.SEMESTER__END_DATE:
			return getEndDate();
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
		case CmsPackage.SEMESTER__PREVIOUS:
			setPrevious((Semester) newValue);
			return;
		case CmsPackage.SEMESTER__NEXT:
			setNext((Semester) newValue);
			return;
		case CmsPackage.SEMESTER__OFFERED_LECTURES:
			getOfferedLectures().clear();
			getOfferedLectures().addAll((Collection<? extends Lecture>) newValue);
			return;
		case CmsPackage.SEMESTER__EXAMS:
			getExams().clear();
			getExams().addAll((Collection<? extends Exam>) newValue);
			return;
		case CmsPackage.SEMESTER__START_DATE:
			setStartDate((Long) newValue);
			return;
		case CmsPackage.SEMESTER__END_DATE:
			setEndDate((Long) newValue);
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
		case CmsPackage.SEMESTER__PREVIOUS:
			setPrevious((Semester) null);
			return;
		case CmsPackage.SEMESTER__NEXT:
			setNext((Semester) null);
			return;
		case CmsPackage.SEMESTER__OFFERED_LECTURES:
			getOfferedLectures().clear();
			return;
		case CmsPackage.SEMESTER__EXAMS:
			getExams().clear();
			return;
		case CmsPackage.SEMESTER__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case CmsPackage.SEMESTER__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
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
		case CmsPackage.SEMESTER__PREVIOUS:
			return previous != null;
		case CmsPackage.SEMESTER__NEXT:
			return next != null;
		case CmsPackage.SEMESTER__OFFERED_LECTURES:
			return offeredLectures != null && !offeredLectures.isEmpty();
		case CmsPackage.SEMESTER__EXAMS:
			return exams != null && !exams.isEmpty();
		case CmsPackage.SEMESTER__START_DATE:
			return startDate != START_DATE_EDEFAULT;
		case CmsPackage.SEMESTER__END_DATE:
			return endDate != END_DATE_EDEFAULT;
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SemesterImpl
