/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.mnoq.Foo;
import org.moflon.maave.tests.lang.mnoq.MnoqFactory;
import org.moflon.maave.tests.lang.mnoq.N;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.PaperExampleTest;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paper Example Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PaperExampleTestImpl extends EObjectImpl implements PaperExampleTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaperExampleTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.PAPER_EXAMPLE_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleAddOne(N n) {
		// ruleAddOne
		Object[] result1_black = PaperExampleTestImpl.pattern_PaperExampleTest_0_1_ruleAddOne_blackBF(n);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ruleAddOne] failed." + " Variables: " + "[n] = " + n + ".");
		}
		int n_x_prime_1 = (int) result1_black[1];
		PaperExampleTestImpl.pattern_PaperExampleTest_0_1_ruleAddOne_greenBB(n, n_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleAddTwo(N m) {
		// ruleAddTwo
		Object[] result1_black = PaperExampleTestImpl.pattern_PaperExampleTest_1_1_ruleAddTwo_blackBF(m);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ruleAddTwo] failed." + " Variables: " + "[m] = " + m + ".");
		}
		int m_x_prime_1 = (int) result1_black[1];
		PaperExampleTestImpl.pattern_PaperExampleTest_1_1_ruleAddTwo_greenBB(m, m_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleLarger4(N k) {
		// ruleLarger4
		Object[] result1_black = PaperExampleTestImpl.pattern_PaperExampleTest_2_1_ruleLarger4_blackB(k);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ruleLarger4] failed." + " Variables: " + "[k] = " + k + ".");
		}
		PaperExampleTestImpl.pattern_PaperExampleTest_2_1_ruleLarger4_greenFB(k);
		// Foo x = (Foo) result1_green[0];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleSmaller4(N p) {
		// ruleSmaller4
		Object[] result1_black = PaperExampleTestImpl.pattern_PaperExampleTest_3_1_ruleSmaller4_blackB(p);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ruleSmaller4] failed." + " Variables: " + "[p] = " + p + ".");
		}
		PaperExampleTestImpl.pattern_PaperExampleTest_3_1_ruleSmaller4_greenBF(p);
		// Foo c = (Foo) result1_green[1];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleTimes(N m) {
		// ruleTimes2
		Object[] result1_black = PaperExampleTestImpl.pattern_PaperExampleTest_4_1_ruleTimes2_blackBF(m);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ruleTimes2] failed." + " Variables: " + "[m] = " + m + ".");
		}
		int m_x_prime_1 = (int) result1_black[1];
		PaperExampleTestImpl.pattern_PaperExampleTest_4_1_ruleTimes2_greenBB(m, m_x_prime_1);

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleLarger4AddTwo(N k) {
		// ruleLarger4AddTwo
		Object[] result1_black = PaperExampleTestImpl.pattern_PaperExampleTest_5_1_ruleLarger4AddTwo_blackBF(k);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ruleLarger4AddTwo] failed." + " Variables: " + "[k] = " + k + ".");
		}
		int k_x_prime_1 = (int) result1_black[1];
		PaperExampleTestImpl.pattern_PaperExampleTest_5_1_ruleLarger4AddTwo_greenBB(k, k_x_prime_1);

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
		case DiachasePackage.PAPER_EXAMPLE_TEST___RULE_ADD_ONE__N:
			ruleAddOne((N) arguments.get(0));
			return null;
		case DiachasePackage.PAPER_EXAMPLE_TEST___RULE_ADD_TWO__N:
			ruleAddTwo((N) arguments.get(0));
			return null;
		case DiachasePackage.PAPER_EXAMPLE_TEST___RULE_LARGER4__N:
			ruleLarger4((N) arguments.get(0));
			return null;
		case DiachasePackage.PAPER_EXAMPLE_TEST___RULE_SMALLER4__N:
			ruleSmaller4((N) arguments.get(0));
			return null;
		case DiachasePackage.PAPER_EXAMPLE_TEST___RULE_TIMES__N:
			ruleTimes((N) arguments.get(0));
			return null;
		case DiachasePackage.PAPER_EXAMPLE_TEST___RULE_LARGER4_ADD_TWO__N:
			ruleLarger4AddTwo((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PaperExampleTest_0_1_ruleAddOne_blackBF(N n) {
		int n_x = n.getX();
		int n_x_prime;

		n_x_prime = n_x + 1;
		return new Object[] { n, n_x_prime };

	}

	public static final Object[] pattern_PaperExampleTest_0_1_ruleAddOne_greenBB(N n, int n_x_prime) {
		n.setX(Integer.valueOf(n_x_prime));
		return new Object[] { n, n_x_prime };
	}

	public static final Object[] pattern_PaperExampleTest_1_1_ruleAddTwo_blackBF(N m) {
		int m_x = m.getX();
		int m_x_prime;

		m_x_prime = m_x + 2;
		return new Object[] { m, m_x_prime };

	}

	public static final Object[] pattern_PaperExampleTest_1_1_ruleAddTwo_greenBB(N m, int m_x_prime) {
		m.setX(Integer.valueOf(m_x_prime));
		return new Object[] { m, m_x_prime };
	}

	public static final Object[] pattern_PaperExampleTest_2_1_ruleLarger4_blackB(N k) {
		int k_x = k.getX();
		if (k_x > 4) {
			return new Object[] { k };
		}

		return null;
	}

	public static final Object[] pattern_PaperExampleTest_2_1_ruleLarger4_greenFB(N k) {
		Foo x = MnoqFactory.eINSTANCE.createFoo();
		k.setFoo(x);
		return new Object[] { x, k };
	}

	public static final Object[] pattern_PaperExampleTest_3_1_ruleSmaller4_blackB(N p) {
		int p_x = p.getX();
		if (p_x < 4) {
			return new Object[] { p };
		}

		return null;
	}

	public static final Object[] pattern_PaperExampleTest_3_1_ruleSmaller4_greenBF(N p) {
		Foo c = MnoqFactory.eINSTANCE.createFoo();
		p.setFoo(c);
		return new Object[] { p, c };
	}

	public static final Object[] pattern_PaperExampleTest_4_1_ruleTimes2_blackBF(N m) {
		int m_x = m.getX();
		int m_x_prime;

		m_x_prime = m_x * 2;
		return new Object[] { m, m_x_prime };

	}

	public static final Object[] pattern_PaperExampleTest_4_1_ruleTimes2_greenBB(N m, int m_x_prime) {
		m.setX(Integer.valueOf(m_x_prime));
		return new Object[] { m, m_x_prime };
	}

	public static final Object[] pattern_PaperExampleTest_5_1_ruleLarger4AddTwo_blackBF(N k) {
		int k_x = k.getX();
		if (k_x > 4) {
			int k_x_prime;

			k_x_prime = k_x + 2;
			return new Object[] { k, k_x_prime };
		}

		return null;
	}

	public static final Object[] pattern_PaperExampleTest_5_1_ruleLarger4AddTwo_greenBB(N k, int k_x_prime) {
		k.setX(Integer.valueOf(k_x_prime));
		return new Object[] { k, k_x_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PaperExampleTestImpl
