/**
 */
package org.moflon.maave.tests.lang.vwxyz.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern;
import org.moflon.maave.tests.lang.vwxyz.V;
import org.moflon.maave.tests.lang.vwxyz.VwxyzFactory;
import org.moflon.maave.tests.lang.vwxyz.VwxyzPackage;
import org.moflon.maave.tests.lang.vwxyz.W;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint To Post Condition Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstraintToPostConditionPatternImpl extends EObjectImpl implements ConstraintToPostConditionPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintToPostConditionPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VwxyzPackage.Literals.CONSTRAINT_TO_POST_CONDITION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rule1(V v) {
		// ActivityNode561
		Object[] result1_black = ConstraintToPostConditionPatternImpl
				.pattern_ConstraintToPostConditionPattern_0_1_ActivityNode561_blackB(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode561] failed." + " Variables: " + "[v] = " + v + ".");
		}
		ConstraintToPostConditionPatternImpl.pattern_ConstraintToPostConditionPattern_0_1_ActivityNode561_greenBF(v);
		// W w = (W) result1_green[1];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testpattern1Inconsistent(V v) {
		// ActivityNode563
		Object[] result1_black = ConstraintToPostConditionPatternImpl
				.pattern_ConstraintToPostConditionPattern_1_1_ActivityNode563_blackBFF(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode563] failed." + " Variables: " + "[v] = " + v + ".");
		}
		// W w = (W) result1_black[1];
		// W w2 = (W) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testpattern2Inconsistent(V v) {
		// ActivityNode563
		Object[] result1_black = ConstraintToPostConditionPatternImpl
				.pattern_ConstraintToPostConditionPattern_2_1_ActivityNode563_blackBF(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode563] failed." + " Variables: " + "[v] = " + v + ".");
		}
		// W w = (W) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testpattern2consistent(V v) {
		// ActivityNode564
		Object[] result1_black = ConstraintToPostConditionPatternImpl
				.pattern_ConstraintToPostConditionPattern_3_1_ActivityNode564_blackB(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode564] failed." + " Variables: " + "[v] = " + v + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rule2(V v) {
		// ActivityNode565
		Object[] result1_black = ConstraintToPostConditionPatternImpl
				.pattern_ConstraintToPostConditionPattern_4_1_ActivityNode565_blackB(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode565] failed." + " Variables: " + "[v] = " + v + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testpattern22Inconsistent(V v) {
		// ActivityNode568
		Object[] result1_black = ConstraintToPostConditionPatternImpl
				.pattern_ConstraintToPostConditionPattern_5_1_ActivityNode568_blackB(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode568] failed." + " Variables: " + "[v] = " + v + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testpattern22Consistent(V v) {
		// ActivityNode567
		Object[] result1_black = ConstraintToPostConditionPatternImpl
				.pattern_ConstraintToPostConditionPattern_6_1_ActivityNode567_blackB(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode567] failed." + " Variables: " + "[v] = " + v + ".");
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
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE1__V:
			rule1((V) arguments.get(0));
			return null;
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN1_INCONSISTENT__V:
			testpattern1Inconsistent((V) arguments.get(0));
			return null;
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2_INCONSISTENT__V:
			testpattern2Inconsistent((V) arguments.get(0));
			return null;
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2CONSISTENT__V:
			testpattern2consistent((V) arguments.get(0));
			return null;
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE2__V:
			rule2((V) arguments.get(0));
			return null;
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_INCONSISTENT__V:
			testpattern22Inconsistent((V) arguments.get(0));
			return null;
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_CONSISTENT__V:
			testpattern22Consistent((V) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_0_1_ActivityNode561_blackB(V v) {
		return new Object[] { v };
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_0_1_ActivityNode561_greenBF(V v) {
		W w = VwxyzFactory.eINSTANCE.createW();
		v.getW().add(w);
		return new Object[] { v, w };
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_1_1_ActivityNode563_blackBFF(V v) {
		for (W w : v.getW()) {
			for (W w2 : v.getW()) {
				if (!w.equals(w2)) {
					return new Object[] { v, w, w2 };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_2_1_ActivityNode563_blackBF(V v) {
		for (W w : v.getW()) {
			return new Object[] { v, w };
		}
		return null;
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_3_1_ActivityNode564_blackB(V v) {
		return new Object[] { v };
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_4_1_ActivityNode565_blackB(V v) {
		return new Object[] { v };
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_5_1_ActivityNode568_blackB(V v) {
		return new Object[] { v };
	}

	public static final Object[] pattern_ConstraintToPostConditionPattern_6_1_ActivityNode567_blackB(V v) {
		return new Object[] { v };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstraintToPostConditionPatternImpl
