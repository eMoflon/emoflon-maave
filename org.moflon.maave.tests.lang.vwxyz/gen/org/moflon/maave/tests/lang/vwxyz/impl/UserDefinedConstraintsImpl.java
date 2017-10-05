/**
 */
package org.moflon.maave.tests.lang.vwxyz.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints;
import org.moflon.maave.tests.lang.vwxyz.V;
import org.moflon.maave.tests.lang.vwxyz.VwxyzPackage;
import org.moflon.maave.tests.lang.vwxyz.W;
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
		return VwxyzPackage.Literals.USER_DEFINED_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_SingeltonV(V v2, V v1) {
		// ActivityNode560
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_0_1_ActivityNode560_blackBB(v1, v2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode560] failed." + " Variables: " + "[v1] = "
					+ v1 + ", " + "[v2] = " + v2 + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_SingeltonW(W w2, W w1) {
		// ActivityNode562
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_1_1_ActivityNode562_blackBB(w1, w2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode562] failed." + " Variables: " + "[w1] = "
					+ w1 + ", " + "[w2] = " + w2 + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_smaller5(V v) {
		// ActivityNode566
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_2_1_ActivityNode566_blackB(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode566] failed." + " Variables: " + "[v] = " + v + ".");
		}
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
		case VwxyzPackage.USER_DEFINED_CONSTRAINTS___NC_SINGELTON_V__V_V:
			_NC_SingeltonV((V) arguments.get(0), (V) arguments.get(1));
			return null;
		case VwxyzPackage.USER_DEFINED_CONSTRAINTS___NC_SINGELTON_W__W_W:
			_NC_SingeltonW((W) arguments.get(0), (W) arguments.get(1));
			return null;
		case VwxyzPackage.USER_DEFINED_CONSTRAINTS___NC_SMALLER5__V:
			_NC_smaller5((V) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UserDefinedConstraints_0_1_ActivityNode560_blackBB(V v1, V v2) {
		if (!v1.equals(v2)) {
			return new Object[] { v1, v2 };
		}
		return null;
	}

	public static final Object[] pattern_UserDefinedConstraints_1_1_ActivityNode562_blackBB(W w1, W w2) {
		if (!w1.equals(w2)) {
			return new Object[] { w1, w2 };
		}
		return null;
	}

	public static final Object[] pattern_UserDefinedConstraints_2_1_ActivityNode566_blackB(V v) {
		return new Object[] { v };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserDefinedConstraintsImpl
