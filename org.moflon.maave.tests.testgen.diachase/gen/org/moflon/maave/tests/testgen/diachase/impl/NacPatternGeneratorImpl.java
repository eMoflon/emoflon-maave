/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.abc.A;
import org.moflon.maave.tests.lang.abc.B;
import org.moflon.maave.tests.lang.abc.C;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.NacPatternGenerator;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nac Pattern Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NacPatternGeneratorImpl extends EObjectImpl implements NacPatternGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NacPatternGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.NAC_PATTERN_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern1Valid(A a) {
		// ActivityNode8
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_0_1_ActivityNode8_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode8] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c = (C) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern1Invalid(A a) {
		// ActivityNode8
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_1_1_ActivityNode8_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode8] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// B b = (B) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern2InvalidA(A a) {
		// ActivityNode9
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_2_1_ActivityNode9_blackBFFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode9] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c1 = (C) result1_black[1];
		// C c2 = (C) result1_black[2];
		// B B = (B) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern2InvalidB(A a) {
		// ActivityNode9
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_3_1_ActivityNode9_blackBFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode9] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c1 = (C) result1_black[1];
		// B B = (B) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern2InvalidC(A a) {
		// ActivityNode9
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_4_1_ActivityNode9_blackBFFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode9] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c1 = (C) result1_black[1];
		// C c2 = (C) result1_black[2];
		// B B = (B) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern2valid(C c, A a) {
		// ActivityNode9
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_5_1_ActivityNode9_blackBBF(c, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode9] failed." + " Variables: " + "[c] = "
					+ c + ", " + "[a] = " + a + ".");
		}
		// B B = (B) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern4Invalid(A a) {
		// ActivityNode10
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_6_1_ActivityNode10_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode10] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c = (C) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instanceTestPattern4valid(A a) {
		// ActivityNode10
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_7_1_ActivityNode10_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode10] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c = (C) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nacTestPattern1(A a) {
		// ActivityNode8
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_8_1_ActivityNode8_blackB(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode8] failed." + " Variables: " + "[a] = " + a + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nacTestPattern2(C c1, A a) {
		// ActivityNode9
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_9_1_ActivityNode9_blackBB(a, c1);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode9] failed." + " Variables: " + "[a] = "
					+ a + ", " + "[c1] = " + c1 + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nacTestPattern3(A a) {
		// ActivityNode10
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_10_1_ActivityNode10_blackFBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode10] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c = (C) result1_black[0];
		int a_x_prime_1 = (int) result1_black[2];
		NacPatternGeneratorImpl.pattern_NacPatternGenerator_10_1_ActivityNode10_greenBB(a, a_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nacTestPattern4(A a) {
		// ActivityNode10
		Object[] result1_black = NacPatternGeneratorImpl.pattern_NacPatternGenerator_11_1_ActivityNode10_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode10] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// C c = (C) result1_black[1];
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
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_VALID__A:
			instanceTestPattern1Valid((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_INVALID__A:
			instanceTestPattern1Invalid((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_A__A:
			instanceTestPattern2InvalidA((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_B__A:
			instanceTestPattern2InvalidB((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_C__A:
			instanceTestPattern2InvalidC((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2VALID__C_A:
			instanceTestPattern2valid((C) arguments.get(0), (A) arguments.get(1));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4_INVALID__A:
			instanceTestPattern4Invalid((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4VALID__A:
			instanceTestPattern4valid((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN1__A:
			nacTestPattern1((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN2__C_A:
			nacTestPattern2((C) arguments.get(0), (A) arguments.get(1));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN3__A:
			nacTestPattern3((A) arguments.get(0));
			return null;
		case DiachasePackage.NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN4__A:
			nacTestPattern4((A) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NacPatternGenerator_0_1_ActivityNode8_blackBF(A a) {
		C c = a.getC();
		if (c != null) {
			return new Object[] { a, c };
		}

		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_1_1_ActivityNode8_blackBF(A a) {
		for (B b : a.getB()) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_2_1_ActivityNode9_blackBFFF(A a) {
		C c2 = a.getC();
		if (c2 != null) {
			C c1 = a.getC();
			if (c1 != null) {
				if (!c1.equals(c2)) {
					for (B b : c2.getB()) {
						return new Object[] { a, c1, c2, b };
					}
				}
			}

		}

		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_3_1_ActivityNode9_blackBFF(A a) {
		C c1 = a.getC();
		if (c1 != null) {
			for (B b : a.getB()) {
				if (c1.getB().contains(b)) {
					return new Object[] { a, c1, b };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_4_1_ActivityNode9_blackBFFF(A a) {
		C c2 = a.getC();
		if (c2 != null) {
			C c1 = a.getC();
			if (c1 != null) {
				if (!c1.equals(c2)) {
					for (B b : a.getB()) {
						if (c2.getB().contains(b)) {
							return new Object[] { a, c1, c2, b };
						}
					}
				}
			}

		}

		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_5_1_ActivityNode9_blackBBF(C c, A a) {
		for (B b : c.getB()) {
			if (b.getA().contains(a)) {
				return new Object[] { c, a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_6_1_ActivityNode10_blackBF(A a) {
		C c = a.getC();
		if (c != null) {
			int a_x = a.getX();
			if (a_x == 5) {
				int c_x = c.getX();
				if (c_x == 3) {
					return new Object[] { a, c };
				}
			}

		}

		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_7_1_ActivityNode10_blackBF(A a) {
		C c = a.getC();
		if (c != null) {
			int a_x = a.getX();
			if (a_x == 3) {
				int c_x = c.getX();
				if (c_x == 5) {
					return new Object[] { a, c };
				}
			}

		}

		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_8_1_ActivityNode8_blackB(A a) {
		return new Object[] { a };
	}

	public static final Object[] pattern_NacPatternGenerator_9_1_ActivityNode9_blackBB(A a, C c1) {
		return new Object[] { a, c1 };
	}

	public static final Object[] pattern_NacPatternGenerator_10_1_ActivityNode10_blackFBF(A a) {
		C c = a.getC();
		if (c != null) {
			int a_x = a.getX();
			int a_x_prime;

			a_x_prime = a_x + 1;
			return new Object[] { c, a, a_x_prime };

		}

		return null;
	}

	public static final Object[] pattern_NacPatternGenerator_10_1_ActivityNode10_greenBB(A a, int a_x_prime) {
		a.setX(Integer.valueOf(a_x_prime));
		return new Object[] { a, a_x_prime };
	}

	public static final Object[] pattern_NacPatternGenerator_11_1_ActivityNode10_blackBF(A a) {
		C c = a.getC();
		if (c != null) {
			return new Object[] { a, c };
		}

		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NacPatternGeneratorImpl
