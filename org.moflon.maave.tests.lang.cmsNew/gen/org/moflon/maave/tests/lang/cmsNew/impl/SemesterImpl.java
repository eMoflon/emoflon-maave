/**
 */
package org.moflon.maave.tests.lang.cmsNew.impl;

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

import org.moflon.maave.tests.lang.cmsNew.CmsNewPackage;
import org.moflon.maave.tests.lang.cmsNew.CourseManagement;
import org.moflon.maave.tests.lang.cmsNew.Exam;
import org.moflon.maave.tests.lang.cmsNew.Lecture;
import org.moflon.maave.tests.lang.cmsNew.SEM_STATE;
import org.moflon.maave.tests.lang.cmsNew.Semester;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getLectureMan <em>Lecture Man</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getExams <em>Exams</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getOfferedLectures <em>Offered Lectures</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getRegPeriodStart <em>Reg Period Start</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getRegPeriodStop <em>Reg Period Stop</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#isCurrent <em>Current</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cmsNew.impl.SemesterImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemesterImpl extends EObjectImpl implements Semester
{
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
    * The default value of the '{@link #getRegPeriodStart() <em>Reg Period Start</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegPeriodStart()
    * @generated
    * @ordered
    */
   protected static final long REG_PERIOD_START_EDEFAULT = 0L;

   /**
    * The cached value of the '{@link #getRegPeriodStart() <em>Reg Period Start</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegPeriodStart()
    * @generated
    * @ordered
    */
   protected long regPeriodStart = REG_PERIOD_START_EDEFAULT;

   /**
    * The default value of the '{@link #getRegPeriodStop() <em>Reg Period Stop</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegPeriodStop()
    * @generated
    * @ordered
    */
   protected static final long REG_PERIOD_STOP_EDEFAULT = 0L;

   /**
    * The cached value of the '{@link #getRegPeriodStop() <em>Reg Period Stop</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRegPeriodStop()
    * @generated
    * @ordered
    */
   protected long regPeriodStop = REG_PERIOD_STOP_EDEFAULT;

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
    * The default value of the '{@link #isCurrent() <em>Current</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isCurrent()
    * @generated
    * @ordered
    */
   protected static final boolean CURRENT_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isCurrent() <em>Current</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isCurrent()
    * @generated
    * @ordered
    */
   protected boolean current = CURRENT_EDEFAULT;

   /**
    * The default value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected static final SEM_STATE STATE_EDEFAULT = SEM_STATE.SEM_CREATED;

   /**
    * The cached value of the '{@link #getState() <em>State</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getState()
    * @generated
    * @ordered
    */
   protected SEM_STATE state = STATE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SemesterImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return CmsNewPackage.Literals.SEMESTER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CourseManagement getLectureMan()
   {
      if (eContainerFeatureID() != CmsNewPackage.SEMESTER__LECTURE_MAN)
         return null;
      return (CourseManagement) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLectureMan(CourseManagement newLectureMan, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newLectureMan, CmsNewPackage.SEMESTER__LECTURE_MAN, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLectureMan(CourseManagement newLectureMan)
   {
      if (newLectureMan != eInternalContainer() || (eContainerFeatureID() != CmsNewPackage.SEMESTER__LECTURE_MAN && newLectureMan != null))
      {
         if (EcoreUtil.isAncestor(this, newLectureMan))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newLectureMan != null)
            msgs = ((InternalEObject) newLectureMan).eInverseAdd(this, CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS, CourseManagement.class, msgs);
         msgs = basicSetLectureMan(newLectureMan, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__LECTURE_MAN, newLectureMan, newLectureMan));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Exam> getExams()
   {
      if (exams == null)
      {
         exams = new EObjectContainmentWithInverseEList<Exam>(Exam.class, this, CmsNewPackage.SEMESTER__EXAMS, CmsNewPackage.EXAM__SEMESTER);
      }
      return exams;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Semester getPrevious()
   {
      if (previous != null && previous.eIsProxy())
      {
         InternalEObject oldPrevious = (InternalEObject) previous;
         previous = (Semester) eResolveProxy(oldPrevious);
         if (previous != oldPrevious)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.SEMESTER__PREVIOUS, oldPrevious, previous));
         }
      }
      return previous;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Semester basicGetPrevious()
   {
      return previous;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPrevious(Semester newPrevious, NotificationChain msgs)
   {
      Semester oldPrevious = previous;
      previous = newPrevious;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__PREVIOUS, oldPrevious, newPrevious);
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
   public void setPrevious(Semester newPrevious)
   {
      if (newPrevious != previous)
      {
         NotificationChain msgs = null;
         if (previous != null)
            msgs = ((InternalEObject) previous).eInverseRemove(this, CmsNewPackage.SEMESTER__NEXT, Semester.class, msgs);
         if (newPrevious != null)
            msgs = ((InternalEObject) newPrevious).eInverseAdd(this, CmsNewPackage.SEMESTER__NEXT, Semester.class, msgs);
         msgs = basicSetPrevious(newPrevious, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__PREVIOUS, newPrevious, newPrevious));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Semester getNext()
   {
      if (next != null && next.eIsProxy())
      {
         InternalEObject oldNext = (InternalEObject) next;
         next = (Semester) eResolveProxy(oldNext);
         if (next != oldNext)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsNewPackage.SEMESTER__NEXT, oldNext, next));
         }
      }
      return next;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Semester basicGetNext()
   {
      return next;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetNext(Semester newNext, NotificationChain msgs)
   {
      Semester oldNext = next;
      next = newNext;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__NEXT, oldNext, newNext);
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
   public void setNext(Semester newNext)
   {
      if (newNext != next)
      {
         NotificationChain msgs = null;
         if (next != null)
            msgs = ((InternalEObject) next).eInverseRemove(this, CmsNewPackage.SEMESTER__PREVIOUS, Semester.class, msgs);
         if (newNext != null)
            msgs = ((InternalEObject) newNext).eInverseAdd(this, CmsNewPackage.SEMESTER__PREVIOUS, Semester.class, msgs);
         msgs = basicSetNext(newNext, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__NEXT, newNext, newNext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Lecture> getOfferedLectures()
   {
      if (offeredLectures == null)
      {
         offeredLectures = new EObjectContainmentWithInverseEList<Lecture>(Lecture.class, this, CmsNewPackage.SEMESTER__OFFERED_LECTURES,
               CmsNewPackage.LECTURE__SEMESTER);
      }
      return offeredLectures;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getRegPeriodStart()
   {
      return regPeriodStart;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRegPeriodStart(long newRegPeriodStart)
   {
      long oldRegPeriodStart = regPeriodStart;
      regPeriodStart = newRegPeriodStart;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__REG_PERIOD_START, oldRegPeriodStart, regPeriodStart));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getRegPeriodStop()
   {
      return regPeriodStop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRegPeriodStop(long newRegPeriodStop)
   {
      long oldRegPeriodStop = regPeriodStop;
      regPeriodStop = newRegPeriodStop;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__REG_PERIOD_STOP, oldRegPeriodStop, regPeriodStop));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getStartDate()
   {
      return startDate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setStartDate(long newStartDate)
   {
      long oldStartDate = startDate;
      startDate = newStartDate;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__START_DATE, oldStartDate, startDate));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public long getEndDate()
   {
      return endDate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEndDate(long newEndDate)
   {
      long oldEndDate = endDate;
      endDate = newEndDate;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__END_DATE, oldEndDate, endDate));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isCurrent()
   {
      return current;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCurrent(boolean newCurrent)
   {
      boolean oldCurrent = current;
      current = newCurrent;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__CURRENT, oldCurrent, current));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SEM_STATE getState()
   {
      return state;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setState(SEM_STATE newState)
   {
      SEM_STATE oldState = state;
      state = newState == null ? STATE_EDEFAULT : newState;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CmsNewPackage.SEMESTER__STATE, oldState, state));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case CmsNewPackage.SEMESTER__LECTURE_MAN:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetLectureMan((CourseManagement) otherEnd, msgs);
      case CmsNewPackage.SEMESTER__EXAMS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getExams()).basicAdd(otherEnd, msgs);
      case CmsNewPackage.SEMESTER__PREVIOUS:
         if (previous != null)
            msgs = ((InternalEObject) previous).eInverseRemove(this, CmsNewPackage.SEMESTER__NEXT, Semester.class, msgs);
         return basicSetPrevious((Semester) otherEnd, msgs);
      case CmsNewPackage.SEMESTER__NEXT:
         if (next != null)
            msgs = ((InternalEObject) next).eInverseRemove(this, CmsNewPackage.SEMESTER__PREVIOUS, Semester.class, msgs);
         return basicSetNext((Semester) otherEnd, msgs);
      case CmsNewPackage.SEMESTER__OFFERED_LECTURES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getOfferedLectures()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case CmsNewPackage.SEMESTER__LECTURE_MAN:
         return basicSetLectureMan(null, msgs);
      case CmsNewPackage.SEMESTER__EXAMS:
         return ((InternalEList<?>) getExams()).basicRemove(otherEnd, msgs);
      case CmsNewPackage.SEMESTER__PREVIOUS:
         return basicSetPrevious(null, msgs);
      case CmsNewPackage.SEMESTER__NEXT:
         return basicSetNext(null, msgs);
      case CmsNewPackage.SEMESTER__OFFERED_LECTURES:
         return ((InternalEList<?>) getOfferedLectures()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
      case CmsNewPackage.SEMESTER__LECTURE_MAN:
         return eInternalContainer().eInverseRemove(this, CmsNewPackage.COURSE_MANAGEMENT__SEMESTERS, CourseManagement.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case CmsNewPackage.SEMESTER__LECTURE_MAN:
         return getLectureMan();
      case CmsNewPackage.SEMESTER__EXAMS:
         return getExams();
      case CmsNewPackage.SEMESTER__PREVIOUS:
         if (resolve)
            return getPrevious();
         return basicGetPrevious();
      case CmsNewPackage.SEMESTER__NEXT:
         if (resolve)
            return getNext();
         return basicGetNext();
      case CmsNewPackage.SEMESTER__OFFERED_LECTURES:
         return getOfferedLectures();
      case CmsNewPackage.SEMESTER__REG_PERIOD_START:
         return getRegPeriodStart();
      case CmsNewPackage.SEMESTER__REG_PERIOD_STOP:
         return getRegPeriodStop();
      case CmsNewPackage.SEMESTER__START_DATE:
         return getStartDate();
      case CmsNewPackage.SEMESTER__END_DATE:
         return getEndDate();
      case CmsNewPackage.SEMESTER__CURRENT:
         return isCurrent();
      case CmsNewPackage.SEMESTER__STATE:
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
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case CmsNewPackage.SEMESTER__LECTURE_MAN:
         setLectureMan((CourseManagement) newValue);
         return;
      case CmsNewPackage.SEMESTER__EXAMS:
         getExams().clear();
         getExams().addAll((Collection<? extends Exam>) newValue);
         return;
      case CmsNewPackage.SEMESTER__PREVIOUS:
         setPrevious((Semester) newValue);
         return;
      case CmsNewPackage.SEMESTER__NEXT:
         setNext((Semester) newValue);
         return;
      case CmsNewPackage.SEMESTER__OFFERED_LECTURES:
         getOfferedLectures().clear();
         getOfferedLectures().addAll((Collection<? extends Lecture>) newValue);
         return;
      case CmsNewPackage.SEMESTER__REG_PERIOD_START:
         setRegPeriodStart((Long) newValue);
         return;
      case CmsNewPackage.SEMESTER__REG_PERIOD_STOP:
         setRegPeriodStop((Long) newValue);
         return;
      case CmsNewPackage.SEMESTER__START_DATE:
         setStartDate((Long) newValue);
         return;
      case CmsNewPackage.SEMESTER__END_DATE:
         setEndDate((Long) newValue);
         return;
      case CmsNewPackage.SEMESTER__CURRENT:
         setCurrent((Boolean) newValue);
         return;
      case CmsNewPackage.SEMESTER__STATE:
         setState((SEM_STATE) newValue);
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
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case CmsNewPackage.SEMESTER__LECTURE_MAN:
         setLectureMan((CourseManagement) null);
         return;
      case CmsNewPackage.SEMESTER__EXAMS:
         getExams().clear();
         return;
      case CmsNewPackage.SEMESTER__PREVIOUS:
         setPrevious((Semester) null);
         return;
      case CmsNewPackage.SEMESTER__NEXT:
         setNext((Semester) null);
         return;
      case CmsNewPackage.SEMESTER__OFFERED_LECTURES:
         getOfferedLectures().clear();
         return;
      case CmsNewPackage.SEMESTER__REG_PERIOD_START:
         setRegPeriodStart(REG_PERIOD_START_EDEFAULT);
         return;
      case CmsNewPackage.SEMESTER__REG_PERIOD_STOP:
         setRegPeriodStop(REG_PERIOD_STOP_EDEFAULT);
         return;
      case CmsNewPackage.SEMESTER__START_DATE:
         setStartDate(START_DATE_EDEFAULT);
         return;
      case CmsNewPackage.SEMESTER__END_DATE:
         setEndDate(END_DATE_EDEFAULT);
         return;
      case CmsNewPackage.SEMESTER__CURRENT:
         setCurrent(CURRENT_EDEFAULT);
         return;
      case CmsNewPackage.SEMESTER__STATE:
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
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case CmsNewPackage.SEMESTER__LECTURE_MAN:
         return getLectureMan() != null;
      case CmsNewPackage.SEMESTER__EXAMS:
         return exams != null && !exams.isEmpty();
      case CmsNewPackage.SEMESTER__PREVIOUS:
         return previous != null;
      case CmsNewPackage.SEMESTER__NEXT:
         return next != null;
      case CmsNewPackage.SEMESTER__OFFERED_LECTURES:
         return offeredLectures != null && !offeredLectures.isEmpty();
      case CmsNewPackage.SEMESTER__REG_PERIOD_START:
         return regPeriodStart != REG_PERIOD_START_EDEFAULT;
      case CmsNewPackage.SEMESTER__REG_PERIOD_STOP:
         return regPeriodStop != REG_PERIOD_STOP_EDEFAULT;
      case CmsNewPackage.SEMESTER__START_DATE:
         return startDate != START_DATE_EDEFAULT;
      case CmsNewPackage.SEMESTER__END_DATE:
         return endDate != END_DATE_EDEFAULT;
      case CmsNewPackage.SEMESTER__CURRENT:
         return current != CURRENT_EDEFAULT;
      case CmsNewPackage.SEMESTER__STATE:
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
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (regPeriodStart: ");
      result.append(regPeriodStart);
      result.append(", regPeriodStop: ");
      result.append(regPeriodStop);
      result.append(", startDate: ");
      result.append(startDate);
      result.append(", endDate: ");
      result.append(endDate);
      result.append(", current: ");
      result.append(current);
      result.append(", state: ");
      result.append(state);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //SemesterImpl
