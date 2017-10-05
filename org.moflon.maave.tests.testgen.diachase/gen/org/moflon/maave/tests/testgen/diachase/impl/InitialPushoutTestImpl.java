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
import org.moflon.maave.tests.testgen.diachase.InitialPushoutTest;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Pushout Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InitialPushoutTestImpl extends EObjectImpl implements InitialPushoutTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialPushoutTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.INITIAL_PUSHOUT_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern1(N nP1) {
		// ActivityNode38
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_0_1_ActivityNode38_blackBF(nP1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode38] failed." + " Variables: " + "[nP1] = " + nP1 + ".");
		}
		// M mP1 = (M) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel1(N nM1) {
		// ActivityNode39
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_1_1_ActivityNode39_blackBFF(nM1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode39] failed." + " Variables: " + "[nM1] = " + nM1 + ".");
		}
		// M mM1 = (M) result1_black[1];
		// O oM1 = (O) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPattern2(N nP1) {
		// ActivityNode38
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_2_1_ActivityNode38_blackBFFF(nP1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode38] failed." + " Variables: " + "[nP1] = " + nP1 + ".");
		}
		// M mP1 = (M) result1_black[1];
		// N n1P1 = (N) result1_black[2];
		// Q qP1 = (Q) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel2(N nM1) {
		// ActivityNode39
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_3_1_ActivityNode39_blackBFFF(nM1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode39] failed." + " Variables: " + "[nM1] = " + nM1 + ".");
		}
		// M mM1 = (M) result1_black[1];
		// N n2M2 = (N) result1_black[2];
		// Q qM2 = (Q) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testRule1(N nP1) {
		// ActivityNode44
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_4_1_ActivityNode44_blackBFFF(nP1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode44] failed." + " Variables: " + "[nP1] = " + nP1 + ".");
		}
		M mM1 = (M) result1_black[1];
		N n2M2 = (N) result1_black[2];
		// Q qM2 = (Q) result1_black[3];
		InitialPushoutTestImpl.pattern_InitialPushoutTest_4_1_ActivityNode44_redBB(mM1, n2M2);

		EcoreUtil.delete(n2M2);
		n2M2 = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel3(N nM1) {
		// ActivityNode39
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_5_1_ActivityNode39_blackBFFFF(nM1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode39] failed." + " Variables: " + "[nM1] = " + nM1 + ".");
		}
		// M mM1 = (M) result1_black[1];
		// N n2M2 = (N) result1_black[2];
		// Q qM2 = (Q) result1_black[3];
		// M mmm = (M) result1_black[4];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModel4(N nM1) {
		// ActivityNode536
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_6_1_ActivityNode536_blackBFFFF(nM1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode536] failed." + " Variables: " + "[nM1] = " + nM1 + ".");
		}
		// N n2M2 = (N) result1_black[1];
		// Q qM2 = (Q) result1_black[2];
		// M mM1 = (M) result1_black[3];
		// M mmm = (M) result1_black[4];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testRule4(N nM1) {
		// ActivityNode54
		Object[] result1_black = InitialPushoutTestImpl.pattern_InitialPushoutTest_7_1_ActivityNode54_blackBFFFF(nM1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode54] failed." + " Variables: " + "[nM1] = " + nM1 + ".");
		}
		M mM1 = (M) result1_black[1];
		N n2M2 = (N) result1_black[2];
		// Q qM2 = (Q) result1_black[3];
		int o_x_prime_1 = (int) result1_black[4];
		InitialPushoutTestImpl.pattern_InitialPushoutTest_7_1_ActivityNode54_redBB(mM1, n2M2);

		InitialPushoutTestImpl.pattern_InitialPushoutTest_7_1_ActivityNode54_greenBFB(mM1, o_x_prime_1);
		// O o = (O) result1_green[1];
		EcoreUtil.delete(n2M2);
		n2M2 = null;
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
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_PATTERN1__N:
			testPattern1((N) arguments.get(0));
			return null;
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_MODEL1__N:
			testModel1((N) arguments.get(0));
			return null;
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_PATTERN2__N:
			testPattern2((N) arguments.get(0));
			return null;
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_MODEL2__N:
			testModel2((N) arguments.get(0));
			return null;
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_RULE1__N:
			testRule1((N) arguments.get(0));
			return null;
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_MODEL3__N:
			testModel3((N) arguments.get(0));
			return null;
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_MODEL4__N:
			testModel4((N) arguments.get(0));
			return null;
		case DiachasePackage.INITIAL_PUSHOUT_TEST___TEST_RULE4__N:
			testRule4((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InitialPushoutTest_0_1_ActivityNode38_blackBF(N nP1) {
		for (M mP1 : nP1.getMms()) {
			return new Object[] { nP1, mP1 };
		}
		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_1_1_ActivityNode39_blackBFF(N nM1) {
		for (M mM1 : nM1.getMms()) {
			O oM1 = mM1.getO();
			if (oM1 != null) {
				return new Object[] { nM1, mM1, oM1 };
			}

		}
		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_2_1_ActivityNode38_blackBFFF(N nP1) {
		for (M mP1 : nP1.getMms()) {
			for (Q qP1 : nP1.getQs()) {
				for (N n1P1 : mP1.getNns()) {
					if (!n1P1.equals(nP1)) {
						return new Object[] { nP1, mP1, n1P1, qP1 };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_3_1_ActivityNode39_blackBFFF(N nM1) {
		for (M mM1 : nM1.getMms()) {
			for (Q qM2 : nM1.getQs()) {
				for (N n2M2 : mM1.getNns()) {
					if (!n2M2.equals(nM1)) {
						int n2M2_x = n2M2.getX();
						if (n2M2_x == 1) {
							return new Object[] { nM1, mM1, n2M2, qM2 };
						}

					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_4_1_ActivityNode44_blackBFFF(N nP1) {
		for (M mM1 : nP1.getMms()) {
			for (Q qM2 : nP1.getQs()) {
				for (N n2M2 : mM1.getNns()) {
					if (!n2M2.equals(nP1)) {
						return new Object[] { nP1, mM1, n2M2, qM2 };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_4_1_ActivityNode44_redBB(M mM1, N n2M2) {
		n2M2.getMms().remove(mM1);
		return new Object[] { mM1, n2M2 };
	}

	public static final Object[] pattern_InitialPushoutTest_5_1_ActivityNode39_blackBFFFF(N nM1) {
		for (M mM1 : nM1.getMms()) {
			for (Q qM2 : nM1.getQs()) {
				for (N n2M2 : mM1.getNns()) {
					if (!n2M2.equals(nM1)) {
						for (M mmm : n2M2.getMms()) {
							if (!mM1.equals(mmm)) {
								return new Object[] { nM1, mM1, n2M2, qM2, mmm };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_6_1_ActivityNode536_blackBFFFF(N nM1) {
		int nM1_x = nM1.getX();
		for (Q qM2 : nM1.getQs()) {
			for (M mM1 : nM1.getMms()) {
				int mM1_x = mM1.getX();
				if (nM1_x < mM1_x) {
					for (N n2M2 : mM1.getNns()) {
						if (!n2M2.equals(nM1)) {
							int n2M2_x = n2M2.getX();
							if (n2M2_x > 0) {
								for (M mmm : n2M2.getMms()) {
									if (!mM1.equals(mmm)) {
										int mmm_x = mmm.getX();
										if (mM1_x == mmm_x + n2M2_x) {
											if (mmm_x > 0) {
												return new Object[] { nM1, n2M2, qM2, mM1, mmm };
											}
										}

									}
								}
							}

						}
					}
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_7_1_ActivityNode54_blackBFFFF(N nM1) {
		for (M mM1 : nM1.getMms()) {
			int mM1_x = mM1.getX();
			for (Q qM2 : nM1.getQs()) {
				for (N n2M2 : mM1.getNns()) {
					if (!n2M2.equals(nM1)) {
						int n2M2_x = n2M2.getX();
						if (mM1_x > n2M2_x) {
							int o_x_prime;

							o_x_prime = n2M2_x + 1;
							if (o_x_prime < 5) {
								return new Object[] { nM1, mM1, n2M2, qM2, o_x_prime };
							}
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_InitialPushoutTest_7_1_ActivityNode54_redBB(M mM1, N n2M2) {
		n2M2.getMms().remove(mM1);
		return new Object[] { mM1, n2M2 };
	}

	public static final Object[] pattern_InitialPushoutTest_7_1_ActivityNode54_greenBFB(M mM1, int o_x_prime) {
		O o = MnoqFactory.eINSTANCE.createO();
		mM1.setO(o);
		o.setX(Integer.valueOf(o_x_prime));
		return new Object[] { mM1, o, o_x_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InitialPushoutTestImpl
