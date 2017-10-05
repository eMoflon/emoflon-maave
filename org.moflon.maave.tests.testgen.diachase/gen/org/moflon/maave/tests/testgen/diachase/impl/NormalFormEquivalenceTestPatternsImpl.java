/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.mnoq.N;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Form Equivalence Test Patterns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NormalFormEquivalenceTestPatternsImpl extends EObjectImpl implements NormalFormEquivalenceTestPatterns {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalFormEquivalenceTestPatternsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern1(N n1, N n2) {
		// ActivityNode541
		Object[] result1_black = NormalFormEquivalenceTestPatternsImpl
				.pattern_NormalFormEquivalenceTestPatterns_0_1_ActivityNode541_blackBBF(n1, n2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode541] failed." + " Variables: " + "[n1] = "
					+ n1 + ", " + "[n2] = " + n2 + ".");
		}
		int n2_x_prime_1 = (int) result1_black[2];
		NormalFormEquivalenceTestPatternsImpl.pattern_NormalFormEquivalenceTestPatterns_0_1_ActivityNode541_greenBB(n2,
				n2_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern2(N n1, N n2) {
		// ActivityNode542
		Object[] result1_black = NormalFormEquivalenceTestPatternsImpl
				.pattern_NormalFormEquivalenceTestPatterns_1_1_ActivityNode542_blackBBF(n1, n2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode542] failed." + " Variables: " + "[n1] = "
					+ n1 + ", " + "[n2] = " + n2 + ".");
		}
		int n2_x_prime_1 = (int) result1_black[2];
		NormalFormEquivalenceTestPatternsImpl.pattern_NormalFormEquivalenceTestPatterns_1_1_ActivityNode542_greenBB(n2,
				n2_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern3(N n1, N n2) {
		// ActivityNode543
		Object[] result1_black = NormalFormEquivalenceTestPatternsImpl
				.pattern_NormalFormEquivalenceTestPatterns_2_1_ActivityNode543_blackBBFF(n1, n2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode543] failed." + " Variables: " + "[n1] = "
					+ n1 + ", " + "[n2] = " + n2 + ".");
		}
		int n1_x_prime_1 = (int) result1_black[2];
		int n2_x_prime_1 = (int) result1_black[3];
		NormalFormEquivalenceTestPatternsImpl.pattern_NormalFormEquivalenceTestPatterns_2_1_ActivityNode543_greenBBBB(
				n1, n2, n1_x_prime_1, n2_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern4(N n1, N n2) {
		// ActivityNode544
		Object[] result1_black = NormalFormEquivalenceTestPatternsImpl
				.pattern_NormalFormEquivalenceTestPatterns_3_1_ActivityNode544_blackBBFF(n1, n2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode544] failed." + " Variables: " + "[n1] = "
					+ n1 + ", " + "[n2] = " + n2 + ".");
		}
		int n1_x_prime_1 = (int) result1_black[2];
		int n2_x_prime_1 = (int) result1_black[3];
		NormalFormEquivalenceTestPatternsImpl.pattern_NormalFormEquivalenceTestPatterns_3_1_ActivityNode544_greenBBBB(
				n1, n2, n1_x_prime_1, n2_x_prime_1);

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
		case DiachasePackage.NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN1__N_N:
			testPattern1((N) arguments.get(0), (N) arguments.get(1));
			return null;
		case DiachasePackage.NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN2__N_N:
			testPattern2((N) arguments.get(0), (N) arguments.get(1));
			return null;
		case DiachasePackage.NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN3__N_N:
			testPattern3((N) arguments.get(0), (N) arguments.get(1));
			return null;
		case DiachasePackage.NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN4__N_N:
			testPattern4((N) arguments.get(0), (N) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_0_1_ActivityNode541_blackBBF(N n1, N n2) {
		if (!n1.equals(n2)) {
			int n1_x = n1.getX();
			if (n1_x == 0) {
				int temp;

				temp = n1_x + 1;
				int n2_x_prime;

				n2_x_prime = temp + 2;
				return new Object[] { n1, n2, n2_x_prime };
			}

		}
		return null;
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_0_1_ActivityNode541_greenBB(N n2,
			int n2_x_prime) {
		n2.setX(Integer.valueOf(n2_x_prime));
		return new Object[] { n2, n2_x_prime };
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_1_1_ActivityNode542_blackBBF(N n1, N n2) {
		if (!n1.equals(n2)) {
			int n1_x = n1.getX();
			if (n1_x == 0) {
				int temp;

				temp = n1_x + 2;
				int n2_x_prime;

				n2_x_prime = temp + 1;
				return new Object[] { n1, n2, n2_x_prime };
			}

		}
		return null;
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_1_1_ActivityNode542_greenBB(N n2,
			int n2_x_prime) {
		n2.setX(Integer.valueOf(n2_x_prime));
		return new Object[] { n2, n2_x_prime };
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_2_1_ActivityNode543_blackBBFF(N n1, N n2) {
		if (!n1.equals(n2)) {
			int temp2;

			temp2 = 2;
			int temp3;

			temp3 = 3;
			int n1_x_prime;

			n1_x_prime = temp2 + temp3;
			int n2_x_prime;

			n2_x_prime = temp3 + temp2;
			return new Object[] { n1, n2, n1_x_prime, n2_x_prime };
		}
		return null;
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_2_1_ActivityNode543_greenBBBB(N n1, N n2,
			int n1_x_prime, int n2_x_prime) {
		n1.setX(Integer.valueOf(n1_x_prime));
		n2.setX(Integer.valueOf(n2_x_prime));
		return new Object[] { n1, n2, n1_x_prime, n2_x_prime };
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_3_1_ActivityNode544_blackBBFF(N n1, N n2) {
		if (!n1.equals(n2)) {
			int temp4;

			temp4 = 4;
			int temp1;

			temp1 = 1;
			int n1_x_prime;

			n1_x_prime = temp1 + temp4;
			int n2_x_prime;

			n2_x_prime = temp4 + temp1;
			return new Object[] { n1, n2, n1_x_prime, n2_x_prime };
		}
		return null;
	}

	public static final Object[] pattern_NormalFormEquivalenceTestPatterns_3_1_ActivityNode544_greenBBBB(N n1, N n2,
			int n1_x_prime, int n2_x_prime) {
		n1.setX(Integer.valueOf(n1_x_prime));
		n2.setX(Integer.valueOf(n2_x_prime));
		return new Object[] { n1, n2, n1_x_prime, n2_x_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NormalFormEquivalenceTestPatternsImpl
