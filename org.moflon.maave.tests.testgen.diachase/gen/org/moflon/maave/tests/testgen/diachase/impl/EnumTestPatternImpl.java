/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.enumlang.E;
import org.moflon.maave.tests.lang.enumlang.LEVEL;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.EnumTestPattern;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Test Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnumTestPatternImpl extends EObjectImpl implements EnumTestPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTestPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.ENUM_TEST_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern1(E e) {
		// ActivityNode550
		Object[] result1_black = EnumTestPatternImpl.pattern_EnumTestPattern_0_1_ActivityNode550_blackB(e);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode550] failed." + " Variables: " + "[e] = " + e + ".");
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
		case DiachasePackage.ENUM_TEST_PATTERN___TEST_PATTERN1__E:
			testPattern1((E) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnumTestPattern_0_1_ActivityNode550_blackB(E e) {
		LEVEL e_level = e.getLevel();
		if (e_level == LEVEL.HIGH) {
			return new Object[] { e };
		}

		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumTestPatternImpl
