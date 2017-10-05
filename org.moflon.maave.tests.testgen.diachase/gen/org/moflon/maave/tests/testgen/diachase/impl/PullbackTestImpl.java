/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.mnoq.M;
import org.moflon.maave.tests.lang.mnoq.N;
import org.moflon.maave.tests.lang.mnoq.O;
import org.moflon.maave.tests.lang.mnoq.Q;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.PullbackTest;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pullback Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PullbackTestImpl extends EObjectImpl implements PullbackTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullbackTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.PULLBACK_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternD(N n) {
		// ActivityNode52
		Object[] result1_black = PullbackTestImpl.pattern_PullbackTest_0_1_ActivityNode52_blackBFFFF(n);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode52] failed." + " Variables: " + "[n] = " + n + ".");
		}
		// M mB = (M) result1_black[1];
		// Q q = (Q) result1_black[2];
		// M mC = (M) result1_black[3];
		// O o = (O) result1_black[4];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternC(N n) {
		// ActivityNode52
		Object[] result1_black = PullbackTestImpl.pattern_PullbackTest_1_1_ActivityNode52_blackBFF(n);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode52] failed." + " Variables: " + "[n] = " + n + ".");
		}
		// M mC = (M) result1_black[1];
		// Q q = (Q) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternB(N n) {
		// ActivityNode52
		Object[] result1_black = PullbackTestImpl.pattern_PullbackTest_2_1_ActivityNode52_blackBFF(n);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode52] failed." + " Variables: " + "[n] = " + n + ".");
		}
		// M mB = (M) result1_black[1];
		// Q q = (Q) result1_black[2];
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
		case DiachasePackage.PULLBACK_TEST___TEST_PATTERN_D__N:
			testPatternD((N) arguments.get(0));
			return null;
		case DiachasePackage.PULLBACK_TEST___TEST_PATTERN_C__N:
			testPatternC((N) arguments.get(0));
			return null;
		case DiachasePackage.PULLBACK_TEST___TEST_PATTERN_B__N:
			testPatternB((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PullbackTest_0_1_ActivityNode52_blackBFFFF(N n) {
		int n_x = n.getX();
		for (Q q : n.getQs()) {
			for (M mB : n.getMms()) {
				O o = mB.getO();
				if (o != null) {
					int mB_x = mB.getX();
					if (mB_x == n_x + 1) {
						for (M mC : n.getMms()) {
							if (!mB.equals(mC)) {
								int mC_x = mC.getX();
								if (mC_x == n_x - 1) {
									return new Object[] { n, mB, q, mC, o };
								}

							}
						}
					}

				}

			}
		}

		return null;
	}

	public static final Object[] pattern_PullbackTest_1_1_ActivityNode52_blackBFF(N n) {
		int n_x = n.getX();
		for (Q q : n.getQs()) {
			for (M mC : n.getMms()) {
				int mC_x = mC.getX();
				if (n_x > mC_x) {
					return new Object[] { n, mC, q };
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_PullbackTest_2_1_ActivityNode52_blackBFF(N n) {
		int n_x = n.getX();
		for (Q q : n.getQs()) {
			for (M mB : n.getMms()) {
				int mB_x = mB.getX();
				if (n_x < mB_x) {
					return new Object[] { n, mB, q };
				}

			}
		}

		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PullbackTestImpl
