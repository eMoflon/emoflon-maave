/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.maave.tests.lang.abc.A;
import org.moflon.maave.tests.lang.abc.AbcFactory;
import org.moflon.maave.tests.lang.abc.B;
import org.moflon.maave.tests.lang.abc.C;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.PatternGenerator;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatternGeneratorImpl extends EObjectImpl implements PatternGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.PATTERN_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern1(A a) {
		// ActivityNode1
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_0_1_ActivityNode1_blackBFFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode1] failed." + " Variables: " + "[a] = " + a + ".");
		}
		B bDestroy = (B) result1_black[1];
		C c = (C) result1_black[2];
		// B bCheck = (B) result1_black[3];
		PatternGeneratorImpl.pattern_PatternGenerator_0_1_ActivityNode1_redBBB(a, bDestroy, c);

		PatternGeneratorImpl.pattern_PatternGenerator_0_1_ActivityNode1_greenBBF(a, c);
		// B bCreate = (B) result1_green[2];
		EcoreUtil.delete(bDestroy);
		bDestroy = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern2(A a) {
		// ActivityNode2
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_1_1_ActivityNode2_blackB(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode2] failed." + " Variables: " + "[a] = " + a + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern3(A a) {
		// ActivityNode3
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_2_1_ActivityNode3_blackBFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode3] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// B b = (B) result1_black[1];
		int a_x_prime_1 = (int) result1_black[2];
		PatternGeneratorImpl.pattern_PatternGenerator_2_1_ActivityNode3_greenBB(a, a_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern4(A a) {
		// ActivityNode4
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_3_1_ActivityNode4_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode4] failed." + " Variables: " + "[a] = " + a + ".");
		}
		int a_x_prime_1 = (int) result1_black[1];
		PatternGeneratorImpl.pattern_PatternGenerator_3_1_ActivityNode4_greenBB(a, a_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern5(A a) {
		// ActivityNode5
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_4_1_ActivityNode5_blackBFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode5] failed." + " Variables: " + "[a] = " + a + ".");
		}
		// B b = (B) result1_black[1];
		int a_x_prime_1 = (int) result1_black[2];
		PatternGeneratorImpl.pattern_PatternGenerator_4_1_ActivityNode5_greenBB(a, a_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern6(A a) {
		// ActivityNode6
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_5_1_ActivityNode6_blackBFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode6] failed." + " Variables: " + "[a] = " + a + ".");
		}
		C c = (C) result1_black[1];
		int a_x_prime_1 = (int) result1_black[2];
		PatternGeneratorImpl.pattern_PatternGenerator_5_1_ActivityNode6_redBB(a, c);

		PatternGeneratorImpl.pattern_PatternGenerator_5_1_ActivityNode6_greenBB(a, a_x_prime_1);

		EcoreUtil.delete(c);
		c = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern7(A a) {
		// ActivityNode7
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_6_1_ActivityNode7_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode7] failed." + " Variables: " + "[a] = " + a + ".");
		}
		int c_x_prime_1 = (int) result1_black[1];
		PatternGeneratorImpl.pattern_PatternGenerator_6_1_ActivityNode7_greenFBB(a, c_x_prime_1);
		// C c = (C) result1_green[0];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern8(A a) {
		// ActivityNode537
		Object[] result1_black = PatternGeneratorImpl.pattern_PatternGenerator_7_1_ActivityNode537_blackBFFF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode537] failed." + " Variables: " + "[a] = " + a + ".");
		}
		C c = (C) result1_black[1];
		int a_x_prime_1 = (int) result1_black[2];
		int b_x_prime_1 = (int) result1_black[3];
		PatternGeneratorImpl.pattern_PatternGenerator_7_1_ActivityNode537_redBB(a, c);

		PatternGeneratorImpl.pattern_PatternGenerator_7_1_ActivityNode537_greenBFBB(a, a_x_prime_1, b_x_prime_1);
		// B b = (B) result1_green[1];
		EcoreUtil.delete(c);
		c = null;
		;

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
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN1__A:
			testPattern1((A) arguments.get(0));
			return null;
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN2__A:
			testPattern2((A) arguments.get(0));
			return null;
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN3__A:
			testPattern3((A) arguments.get(0));
			return null;
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN4__A:
			testPattern4((A) arguments.get(0));
			return null;
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN5__A:
			testPattern5((A) arguments.get(0));
			return null;
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN6__A:
			testPattern6((A) arguments.get(0));
			return null;
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN7__A:
			testPattern7((A) arguments.get(0));
			return null;
		case DiachasePackage.PATTERN_GENERATOR___TEST_PATTERN8__A:
			testPattern8((A) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PatternGenerator_0_1_ActivityNode1_blackBFFF(A a) {
		C c = a.getC();
		if (c != null) {
			for (B bCheck : a.getB()) {
				for (B bDestroy : a.getB()) {
					if (!bCheck.equals(bDestroy)) {
						if (c.getB().contains(bDestroy)) {
							return new Object[] { a, bDestroy, c, bCheck };
						}
					}
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_PatternGenerator_0_1_ActivityNode1_redBBB(A a, B bDestroy, C c) {
		bDestroy.getA().remove(a);
		c.getB().remove(bDestroy);
		return new Object[] { a, bDestroy, c };
	}

	public static final Object[] pattern_PatternGenerator_0_1_ActivityNode1_greenBBF(A a, C c) {
		B bCreate = AbcFactory.eINSTANCE.createB();
		bCreate.getA().add(a);
		c.getB().add(bCreate);
		return new Object[] { a, c, bCreate };
	}

	public static final Object[] pattern_PatternGenerator_1_1_ActivityNode2_blackB(A a) {
		int a_x = a.getX();
		if (a_x < 5) {
			return new Object[] { a };
		}

		return null;
	}

	public static final Object[] pattern_PatternGenerator_2_1_ActivityNode3_blackBFF(A a) {
		int a_x = a.getX();
		for (B b : a.getB()) {
			int b_x = b.getX();
			int a_x_prime;

			a_x_prime = b_x + a_x;
			return new Object[] { a, b, a_x_prime };

		}

		return null;
	}

	public static final Object[] pattern_PatternGenerator_2_1_ActivityNode3_greenBB(A a, int a_x_prime) {
		a.setX(Integer.valueOf(a_x_prime));
		return new Object[] { a, a_x_prime };
	}

	public static final Object[] pattern_PatternGenerator_3_1_ActivityNode4_blackBF(A a) {
		int a_x = a.getX();
		int a_x_prime;

		a_x_prime = a_x + 1;
		return new Object[] { a, a_x_prime };

	}

	public static final Object[] pattern_PatternGenerator_3_1_ActivityNode4_greenBB(A a, int a_x_prime) {
		a.setX(Integer.valueOf(a_x_prime));
		return new Object[] { a, a_x_prime };
	}

	public static final Object[] pattern_PatternGenerator_4_1_ActivityNode5_blackBFF(A a) {
		for (B b : a.getB()) {
			int b_x = b.getX();
			int a_x_prime;

			a_x_prime = b_x;
			return new Object[] { a, b, a_x_prime };

		}
		return null;
	}

	public static final Object[] pattern_PatternGenerator_4_1_ActivityNode5_greenBB(A a, int a_x_prime) {
		a.setX(Integer.valueOf(a_x_prime));
		return new Object[] { a, a_x_prime };
	}

	public static final Object[] pattern_PatternGenerator_5_1_ActivityNode6_blackBFF(A a) {
		C c = a.getC();
		if (c != null) {
			int c_x = c.getX();
			int a_x_prime;

			a_x_prime = c_x;
			return new Object[] { a, c, a_x_prime };

		}

		return null;
	}

	public static final Object[] pattern_PatternGenerator_5_1_ActivityNode6_redBB(A a, C c) {
		a.setC(null);
		return new Object[] { a, c };
	}

	public static final Object[] pattern_PatternGenerator_5_1_ActivityNode6_greenBB(A a, int a_x_prime) {
		a.setX(Integer.valueOf(a_x_prime));
		return new Object[] { a, a_x_prime };
	}

	public static final Object[] pattern_PatternGenerator_6_1_ActivityNode7_blackBF(A a) {
		int a_x = a.getX();
		int c_x_prime;

		c_x_prime = a_x;
		return new Object[] { a, c_x_prime };

	}

	public static final Object[] pattern_PatternGenerator_6_1_ActivityNode7_greenFBB(A a, int c_x_prime) {
		C c = AbcFactory.eINSTANCE.createC();
		a.setC(c);
		c.setX(Integer.valueOf(c_x_prime));
		return new Object[] { c, a, c_x_prime };
	}

	public static final Object[] pattern_PatternGenerator_7_1_ActivityNode537_blackBFFF(A a) {
		C c = a.getC();
		if (c != null) {
			int c_x = c.getX();
			int temp;

			temp = 3 + c_x;
			int a_x_prime;

			a_x_prime = temp + 1;
			int b_x_prime;

			b_x_prime = a_x_prime + 3;
			return new Object[] { a, c, a_x_prime, b_x_prime };

		}

		return null;
	}

	public static final Object[] pattern_PatternGenerator_7_1_ActivityNode537_redBB(A a, C c) {
		a.setC(null);
		return new Object[] { a, c };
	}

	public static final Object[] pattern_PatternGenerator_7_1_ActivityNode537_greenBFBB(A a, int a_x_prime,
			int b_x_prime) {
		B b = AbcFactory.eINSTANCE.createB();
		a.setX(Integer.valueOf(a_x_prime));
		b.getA().add(a);
		b.setX(Integer.valueOf(b_x_prime));
		return new Object[] { a, b, a_x_prime, b_x_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PatternGeneratorImpl
