/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.mnoq.N;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Morphism Class Test Patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MorphismClassTestPatternsImpl extends EObjectImpl implements MorphismClassTestPatterns {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MorphismClassTestPatternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.MORPHISM_CLASS_TEST_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern1(N n1) {
		// ActivityNode546
		Object[] result1_black = MorphismClassTestPatternsImpl
				.pattern_MorphismClassTestPatterns_0_1_ActivityNode546_blackB(n1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode546] failed." + " Variables: " + "[n1] = " + n1 + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern2(N n1) {
		// ActivityNode547
		Object[] result1_black = MorphismClassTestPatternsImpl
				.pattern_MorphismClassTestPatterns_1_1_ActivityNode547_blackB(n1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode547] failed." + " Variables: " + "[n1] = " + n1 + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern3(N n1) {
		// ActivityNode548
		Object[] result1_black = MorphismClassTestPatternsImpl
				.pattern_MorphismClassTestPatterns_2_1_ActivityNode548_blackBF(n1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode548] failed." + " Variables: " + "[n1] = " + n1 + ".");
		}
		int n1_x_prime_1 = (int) result1_black[1];
		MorphismClassTestPatternsImpl.pattern_MorphismClassTestPatterns_2_1_ActivityNode548_greenBB(n1, n1_x_prime_1);

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
		case DiachasePackage.MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN1__N:
			testPattern1((N) arguments.get(0));
			return null;
		case DiachasePackage.MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN2__N:
			testPattern2((N) arguments.get(0));
			return null;
		case DiachasePackage.MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN3__N:
			testPattern3((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MorphismClassTestPatterns_0_1_ActivityNode546_blackB(N n1) {
		int n1_x = n1.getX();
		if (n1_x < 7) {
			return new Object[] { n1 };
		}

		return null;
	}

	public static final Object[] pattern_MorphismClassTestPatterns_1_1_ActivityNode547_blackB(N n1) {
		int n1_x = n1.getX();
		if (n1_x < 4) {
			return new Object[] { n1 };
		}

		return null;
	}

	public static final Object[] pattern_MorphismClassTestPatterns_2_1_ActivityNode548_blackBF(N n1) {
		int n1_x = n1.getX();
		int n1_x_prime;

		n1_x_prime = n1_x + 1;
		if (n1_x_prime < 5) {
			return new Object[] { n1, n1_x_prime };
		}

		return null;
	}

	public static final Object[] pattern_MorphismClassTestPatterns_2_1_ActivityNode548_greenBB(N n1, int n1_x_prime) {
		n1.setX(Integer.valueOf(n1_x_prime));
		return new Object[] { n1, n1_x_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MorphismClassTestPatternsImpl
