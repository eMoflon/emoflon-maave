/**
 */
package org.moflon.maave.tests.lang.cms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.cms.CmsPackage;
import org.moflon.maave.tests.lang.cms.degree;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.degreeImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.cms.impl.degreeImpl#isSuccessfull <em>Successfull</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class degreeImpl extends EObjectImpl implements degree {
	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected String degree = DEGREE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSuccessfull() <em>Successfull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccessfull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUCCESSFULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuccessfull() <em>Successfull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccessfull()
	 * @generated
	 * @ordered
	 */
	protected boolean successfull = SUCCESSFULL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected degreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsPackage.Literals.DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(String newDegree) {
		String oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.DEGREE__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuccessfull() {
		return successfull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessfull(boolean newSuccessfull) {
		boolean oldSuccessfull = successfull;
		successfull = newSuccessfull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsPackage.DEGREE__SUCCESSFULL, oldSuccessfull,
					successfull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsPackage.DEGREE__DEGREE:
			return getDegree();
		case CmsPackage.DEGREE__SUCCESSFULL:
			return isSuccessfull();
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
		case CmsPackage.DEGREE__DEGREE:
			setDegree((String) newValue);
			return;
		case CmsPackage.DEGREE__SUCCESSFULL:
			setSuccessfull((Boolean) newValue);
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
		case CmsPackage.DEGREE__DEGREE:
			setDegree(DEGREE_EDEFAULT);
			return;
		case CmsPackage.DEGREE__SUCCESSFULL:
			setSuccessfull(SUCCESSFULL_EDEFAULT);
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
		case CmsPackage.DEGREE__DEGREE:
			return DEGREE_EDEFAULT == null ? degree != null : !DEGREE_EDEFAULT.equals(degree);
		case CmsPackage.DEGREE__SUCCESSFULL:
			return successfull != SUCCESSFULL_EDEFAULT;
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
		result.append(" (degree: ");
		result.append(degree);
		result.append(", successfull: ");
		result.append(successfull);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //degreeImpl
