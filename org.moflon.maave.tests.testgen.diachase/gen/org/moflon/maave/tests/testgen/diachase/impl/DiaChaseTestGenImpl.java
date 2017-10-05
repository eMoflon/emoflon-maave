/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.maave.tests.lang.mnoq.M;
import org.moflon.maave.tests.lang.mnoq.MnoqFactory;
import org.moflon.maave.tests.lang.mnoq.N;
import org.moflon.maave.tests.lang.mnoq.O;
import org.moflon.maave.tests.lang.mnoq.Q;

import org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen;
import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dia Chase Test Gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DiaChaseTestGenImpl extends EObjectImpl implements DiaChaseTestGen {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiaChaseTestGenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.DIA_CHASE_TEST_GEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern(N n1) {
		// ActivityNode1
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_0_1_ActivityNode1_blackFB(n1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode1] failed." + " Variables: " + "[n1] = " + n1 + ".");
		}
		// M m1 = (M) result1_black[0];
		DiaChaseTestGenImpl.pattern_DiaChaseTestGen_0_1_ActivityNode1_greenFB(n1);
		// Q q1 = (Q) result1_green[0];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternA(M mA, N nA) {
		// ActivityNode24
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_1_1_ActivityNode24_blackBB(nA, mA);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode24] failed." + " Variables: " + "[nA] = "
					+ nA + ", " + "[mA] = " + mA + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternA2(M mA, N nA) {
		// ActivityNode24
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_2_1_ActivityNode24_blackBB(nA, mA);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode24] failed." + " Variables: " + "[nA] = "
					+ nA + ", " + "[mA] = " + mA + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternB(Q qB, M mB, N nB) {
		// ActivityNode25
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_3_1_ActivityNode25_blackBBB(mB, qB, nB);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode25] failed." + " Variables: " + "[mB] = "
					+ mB + ", " + "[qB] = " + qB + ", " + "[nB] = " + nB + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternB2(Q qB, M mB, N nB) {
		// ActivityNode25
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_4_1_ActivityNode25_blackBBB(nB, qB, mB);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode25] failed." + " Variables: " + "[nB] = "
					+ nB + ", " + "[qB] = " + qB + ", " + "[mB] = " + mB + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternC(M mC, O oC, N nC) {
		// ActivityNode26
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_5_1_ActivityNode26_blackBBB(mC, oC, nC);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode26] failed." + " Variables: " + "[mC] = "
					+ mC + ", " + "[oC] = " + oC + ", " + "[nC] = " + nC + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternC2(M mC, O oC, N nC) {
		// ActivityNode26
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_6_1_ActivityNode26_blackBBB(nC, oC, mC);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode26] failed." + " Variables: " + "[nC] = "
					+ nC + ", " + "[oC] = " + oC + ", " + "[mC] = " + mC + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel(N n2) {
		// ActivityNode2
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_7_1_ActivityNode2_blackBFFF(n2);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode2] failed." + " Variables: " + "[n2] = " + n2 + ".");
		}
		// N n3 = (N) result1_black[1];
		// M m2 = (M) result1_black[2];
		// Q q2 = (Q) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternAdd(N a) {
		// ActivityNode7
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_8_1_ActivityNode7_blackBF(a);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode7] failed." + " Variables: " + "[a] = " + a + ".");
		}
		int a_x_prime_1 = (int) result1_black[1];
		DiaChaseTestGenImpl.pattern_DiaChaseTestGen_8_1_ActivityNode7_greenBB(a, a_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternLarger4(N a) {
		// ActivityNode8
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_9_1_ActivityNode8_blackB(a);
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
	public void testPatternSmaller5(N n) {
		// ActivityNode8
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_10_1_ActivityNode8_blackB(n);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode8] failed." + " Variables: " + "[n] = " + n + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternTempVar(N n) {
		// ActivityNode13
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_11_1_ActivityNode13_blackB(n);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode13] failed." + " Variables: " + "[n] = " + n + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testRule(N nRule) {
		// ActivityNode14
		Object[] result1_black = DiaChaseTestGenImpl.pattern_DiaChaseTestGen_12_1_ActivityNode14_blackBF(nRule);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode14] failed." + " Variables: " + "[nRule] = " + nRule + ".");
		}
		M mRule = (M) result1_black[1];
		DiaChaseTestGenImpl.pattern_DiaChaseTestGen_12_1_ActivityNode14_redBB(nRule, mRule);

		DiaChaseTestGenImpl.pattern_DiaChaseTestGen_12_1_ActivityNode14_greenFB(nRule);
		// Q qRule = (Q) result1_green[0];
		EcoreUtil.delete(mRule);
		mRule = null;
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
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN__N:
			testPattern((N) arguments.get(0));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_A__M_N:
			testPatternA((M) arguments.get(0), (N) arguments.get(1));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_A2__M_N:
			testPatternA2((M) arguments.get(0), (N) arguments.get(1));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_B__Q_M_N:
			testPatternB((Q) arguments.get(0), (M) arguments.get(1), (N) arguments.get(2));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_B2__Q_M_N:
			testPatternB2((Q) arguments.get(0), (M) arguments.get(1), (N) arguments.get(2));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_C__M_O_N:
			testPatternC((M) arguments.get(0), (O) arguments.get(1), (N) arguments.get(2));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_C2__M_O_N:
			testPatternC2((M) arguments.get(0), (O) arguments.get(1), (N) arguments.get(2));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_MODEL__N:
			testModel((N) arguments.get(0));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_ADD__N:
			testPatternAdd((N) arguments.get(0));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_LARGER4__N:
			testPatternLarger4((N) arguments.get(0));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_SMALLER5__N:
			testPatternSmaller5((N) arguments.get(0));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_PATTERN_TEMP_VAR__N:
			testPatternTempVar((N) arguments.get(0));
			return null;
		case DiachasePackage.DIA_CHASE_TEST_GEN___TEST_RULE__N:
			testRule((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_DiaChaseTestGen_0_1_ActivityNode1_blackFB(N n1) {
		for (M m1 : n1.getMms()) {
			return new Object[] { m1, n1 };
		}
		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_0_1_ActivityNode1_greenFB(N n1) {
		Q q1 = MnoqFactory.eINSTANCE.createQ();
		q1.getNs().add(n1);
		return new Object[] { q1, n1 };
	}

	public static final Object[] pattern_DiaChaseTestGen_1_1_ActivityNode24_blackBB(N nA, M mA) {
		return new Object[] { nA, mA };
	}

	public static final Object[] pattern_DiaChaseTestGen_2_1_ActivityNode24_blackBB(N nA, M mA) {
		if (nA.getMms().contains(mA)) {
			int nA_x = nA.getX();
			int mA_x = mA.getX();
			int tA;

			tA = nA_x + mA_x;
			if (tA < 10) {
				return new Object[] { nA, mA };
			}

		}
		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_3_1_ActivityNode25_blackBBB(M mB, Q qB, N nB) {
		return new Object[] { mB, qB, nB };
	}

	public static final Object[] pattern_DiaChaseTestGen_4_1_ActivityNode25_blackBBB(N nB, Q qB, M mB) {
		if (qB.getNs().contains(nB)) {
			if (nB.getMms().contains(mB)) {
				int nB_x = nB.getX();
				int mB_x = mB.getX();
				int tB;

				tB = nB_x + mB_x;
				if (tB < 10) {
					return new Object[] { nB, qB, mB };
				}

			}
		}
		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_5_1_ActivityNode26_blackBBB(M mC, O oC, N nC) {
		return new Object[] { mC, oC, nC };
	}

	public static final Object[] pattern_DiaChaseTestGen_6_1_ActivityNode26_blackBBB(N nC, O oC, M mC) {
		if (nC.getMms().contains(mC)) {
			if (oC.equals(mC.getO())) {
				int nC_x = nC.getX();
				int mC_x = mC.getX();
				int tC;

				tC = nC_x + mC_x;
				if (tC < 10) {
					return new Object[] { nC, oC, mC };
				}

			}
		}
		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_7_1_ActivityNode2_blackBFFF(N n2) {
		for (Q q2 : n2.getQs()) {
			for (N n3 : q2.getNs()) {
				if (!n2.equals(n3)) {
					for (M m2 : n3.getMms()) {
						return new Object[] { n2, n3, m2, q2 };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_8_1_ActivityNode7_blackBF(N a) {
		int a_x = a.getX();
		if (a_x > 4) {
			int a_x_prime;

			a_x_prime = a_x + 1;
			return new Object[] { a, a_x_prime };
		}

		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_8_1_ActivityNode7_greenBB(N a, int a_x_prime) {
		a.setX(Integer.valueOf(a_x_prime));
		return new Object[] { a, a_x_prime };
	}

	public static final Object[] pattern_DiaChaseTestGen_9_1_ActivityNode8_blackB(N a) {
		int a_x = a.getX();
		if (a_x > 4) {
			return new Object[] { a };
		}

		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_10_1_ActivityNode8_blackB(N n) {
		int n_x = n.getX();
		if (n_x < 5) {
			return new Object[] { n };
		}

		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_11_1_ActivityNode13_blackB(N n) {
		int n_x = n.getX();
		int a;

		a = n_x + 1;
		if (a > 5) {
			return new Object[] { n };
		}

		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_12_1_ActivityNode14_blackBF(N nRule) {
		for (M mRule : nRule.getMms()) {
			return new Object[] { nRule, mRule };
		}
		return null;
	}

	public static final Object[] pattern_DiaChaseTestGen_12_1_ActivityNode14_redBB(N nRule, M mRule) {
		nRule.getMms().remove(mRule);
		return new Object[] { nRule, mRule };
	}

	public static final Object[] pattern_DiaChaseTestGen_12_1_ActivityNode14_greenFB(N nRule) {
		Q qRule = MnoqFactory.eINSTANCE.createQ();
		qRule.getNs().add(nRule);
		return new Object[] { qRule, nRule };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DiaChaseTestGenImpl
