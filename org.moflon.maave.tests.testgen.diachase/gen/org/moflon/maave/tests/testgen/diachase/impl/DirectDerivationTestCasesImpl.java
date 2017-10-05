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

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Derivation Test Cases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DirectDerivationTestCasesImpl extends EObjectImpl implements DirectDerivationTestCases {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectDerivationTestCasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.DIRECT_DERIVATION_TEST_CASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void emptyRule() {// ActivityNode551 story node is empty
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testRule1(M m) {
		// ActivityNode538
		Object[] result1_black = DirectDerivationTestCasesImpl
				.pattern_DirectDerivationTestCases_1_1_ActivityNode538_blackBFFF(m);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode538] failed." + " Variables: " + "[m] = " + m + ".");
		}
		N n = (N) result1_black[1];
		Q q = (Q) result1_black[2];
		int o_x_prime_1 = (int) result1_black[3];
		DirectDerivationTestCasesImpl.pattern_DirectDerivationTestCases_1_1_ActivityNode538_redBB(n, q);

		DirectDerivationTestCasesImpl.pattern_DirectDerivationTestCases_1_1_ActivityNode538_greenBFB(m, o_x_prime_1);
		// O o = (O) result1_green[1];
		EcoreUtil.delete(q);
		q = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel1(M m) {
		// ActivityNode539
		Object[] result1_black = DirectDerivationTestCasesImpl
				.pattern_DirectDerivationTestCases_2_1_ActivityNode539_blackBFF(m);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode539] failed." + " Variables: " + "[m] = " + m + ".");
		}
		// Q q = (Q) result1_black[1];
		// N n = (N) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel2(M m) {
		// ActivityNode539
		Object[] result1_black = DirectDerivationTestCasesImpl
				.pattern_DirectDerivationTestCases_3_1_ActivityNode539_blackBFF(m);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode539] failed." + " Variables: " + "[m] = " + m + ".");
		}
		// Q q = (Q) result1_black[1];
		// N n = (N) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel3(M m) {
		// ActivityNode540
		Object[] result1_black = DirectDerivationTestCasesImpl
				.pattern_DirectDerivationTestCases_4_1_ActivityNode540_blackBFFF(m);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode540] failed." + " Variables: " + "[m] = " + m + ".");
		}
		// Q q = (Q) result1_black[1];
		// N n = (N) result1_black[2];
		// N n2 = (N) result1_black[3];
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
		case DiachasePackage.DIRECT_DERIVATION_TEST_CASES___EMPTY_RULE:
			emptyRule();
			return null;
		case DiachasePackage.DIRECT_DERIVATION_TEST_CASES___TEST_RULE1__M:
			testRule1((M) arguments.get(0));
			return null;
		case DiachasePackage.DIRECT_DERIVATION_TEST_CASES___TEST_MODEL1__M:
			testModel1((M) arguments.get(0));
			return null;
		case DiachasePackage.DIRECT_DERIVATION_TEST_CASES___TEST_MODEL2__M:
			testModel2((M) arguments.get(0));
			return null;
		case DiachasePackage.DIRECT_DERIVATION_TEST_CASES___TEST_MODEL3__M:
			testModel3((M) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_DirectDerivationTestCases_1_1_ActivityNode538_blackBFFF(M m) {
		for (N n : m.getNns()) {
			int n_x = n.getX();
			for (Q q : n.getQs()) {
				int q_x = q.getX();
				int o_x_prime;

				o_x_prime = n_x + q_x;
				if (o_x_prime < 5) {
					return new Object[] { m, n, q, o_x_prime };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_DirectDerivationTestCases_1_1_ActivityNode538_redBB(N n, Q q) {
		q.getNs().remove(n);
		return new Object[] { n, q };
	}

	public static final Object[] pattern_DirectDerivationTestCases_1_1_ActivityNode538_greenBFB(M m, int o_x_prime) {
		O o = MnoqFactory.eINSTANCE.createO();
		m.setO(o);
		o.setX(Integer.valueOf(o_x_prime));
		return new Object[] { m, o, o_x_prime };
	}

	public static final Object[] pattern_DirectDerivationTestCases_2_1_ActivityNode539_blackBFF(M m) {
		int m_x = m.getX();
		if (m_x < -3) {
			for (N n : m.getNns()) {
				int n_x = n.getX();
				if (n_x == m_x + 5) {
					for (Q q : n.getQs()) {
						int q_x = q.getX();
						if (q_x < 2) {
							return new Object[] { m, q, n };
						}

					}
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_DirectDerivationTestCases_3_1_ActivityNode539_blackBFF(M m) {
		int m_x = m.getX();
		if (m_x < 0) {
			for (N n : m.getNns()) {
				int n_x = n.getX();
				if (n_x == m_x + 5) {
					for (Q q : n.getQs()) {
						int q_x = q.getX();
						if (q_x < 2) {
							return new Object[] { m, q, n };
						}

					}
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_DirectDerivationTestCases_4_1_ActivityNode540_blackBFFF(M m) {
		int m_x = m.getX();
		if (m_x == 1) {
			for (N n : m.getNns()) {
				int n_x = n.getX();
				if (n_x == 1) {
					for (Q q : n.getQs()) {
						int q_x = q.getX();
						if (q_x == 1) {
							for (N n2 : q.getNs()) {
								if (!n.equals(n2)) {
									return new Object[] { m, q, n, n2 };
								}
							}
						}

					}
				}

			}
		}

		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DirectDerivationTestCasesImpl
