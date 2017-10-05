/**
 */
package org.moflon.maave.tests.lang.mnoq.impl;

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

import org.moflon.maave.tests.lang.mnoq.Foo;
import org.moflon.maave.tests.lang.mnoq.M;
import org.moflon.maave.tests.lang.mnoq.MnoqPackage;
import org.moflon.maave.tests.lang.mnoq.N;
import org.moflon.maave.tests.lang.mnoq.Q;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>N</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.impl.NImpl#getMms <em>Mms</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.impl.NImpl#getQs <em>Qs</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.impl.NImpl#getFoo <em>Foo</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.mnoq.impl.NImpl#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NImpl extends EObjectImpl implements N {
	/**
	 * The cached value of the '{@link #getMms() <em>Mms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMms()
	 * @generated
	 * @ordered
	 */
	protected EList<M> mms;

	/**
	 * The cached value of the '{@link #getQs() <em>Qs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQs()
	 * @generated
	 * @ordered
	 */
	protected EList<Q> qs;

	/**
	 * The cached value of the '{@link #getFoo() <em>Foo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoo()
	 * @generated
	 * @ordered
	 */
	protected Foo foo;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MnoqPackage.Literals.N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<M> getMms() {
		if (mms == null) {
			mms = new EObjectWithInverseResolvingEList.ManyInverse<M>(M.class, this, MnoqPackage.N__MMS,
					MnoqPackage.M__NNS);
		}
		return mms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Q> getQs() {
		if (qs == null) {
			qs = new EObjectWithInverseResolvingEList.ManyInverse<Q>(Q.class, this, MnoqPackage.N__QS,
					MnoqPackage.Q__NS);
		}
		return qs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo getFoo() {
		if (foo != null && foo.eIsProxy()) {
			InternalEObject oldFoo = (InternalEObject) foo;
			foo = (Foo) eResolveProxy(oldFoo);
			if (foo != oldFoo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MnoqPackage.N__FOO, oldFoo, foo));
			}
		}
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo basicGetFoo() {
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoo(Foo newFoo) {
		Foo oldFoo = foo;
		foo = newFoo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MnoqPackage.N__FOO, oldFoo, foo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MnoqPackage.N__X, oldX, x));
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
		case MnoqPackage.N__MMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMms()).basicAdd(otherEnd, msgs);
		case MnoqPackage.N__QS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQs()).basicAdd(otherEnd, msgs);
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
		case MnoqPackage.N__MMS:
			return ((InternalEList<?>) getMms()).basicRemove(otherEnd, msgs);
		case MnoqPackage.N__QS:
			return ((InternalEList<?>) getQs()).basicRemove(otherEnd, msgs);
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
		case MnoqPackage.N__MMS:
			return getMms();
		case MnoqPackage.N__QS:
			return getQs();
		case MnoqPackage.N__FOO:
			if (resolve)
				return getFoo();
			return basicGetFoo();
		case MnoqPackage.N__X:
			return getX();
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
		case MnoqPackage.N__MMS:
			getMms().clear();
			getMms().addAll((Collection<? extends M>) newValue);
			return;
		case MnoqPackage.N__QS:
			getQs().clear();
			getQs().addAll((Collection<? extends Q>) newValue);
			return;
		case MnoqPackage.N__FOO:
			setFoo((Foo) newValue);
			return;
		case MnoqPackage.N__X:
			setX((Integer) newValue);
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
		case MnoqPackage.N__MMS:
			getMms().clear();
			return;
		case MnoqPackage.N__QS:
			getQs().clear();
			return;
		case MnoqPackage.N__FOO:
			setFoo((Foo) null);
			return;
		case MnoqPackage.N__X:
			setX(X_EDEFAULT);
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
		case MnoqPackage.N__MMS:
			return mms != null && !mms.isEmpty();
		case MnoqPackage.N__QS:
			return qs != null && !qs.isEmpty();
		case MnoqPackage.N__FOO:
			return foo != null;
		case MnoqPackage.N__X:
			return x != X_EDEFAULT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NImpl
