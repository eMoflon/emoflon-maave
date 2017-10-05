/**
 */
package org.moflon.maave.tests.lang.vwxyz.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern;
import org.moflon.maave.tests.lang.vwxyz.V;
import org.moflon.maave.tests.lang.vwxyz.VwxyzPackage;
import org.moflon.maave.tests.lang.vwxyz.W;
import org.moflon.maave.tests.lang.vwxyz.X;
import org.moflon.maave.tests.lang.vwxyz.Y;
import org.moflon.maave.tests.lang.vwxyz.Z;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Constraints Test Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CardinalityConstraintsTestPatternImpl extends EObjectImpl implements CardinalityConstraintsTestPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityConstraintsTestPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VwxyzPackage.Literals.CARDINALITY_CONSTRAINTS_TEST_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternInvalid1(V v1, V v2) {
		// ActivityNode552
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_0_1_ActivityNode552_blackBFB(v1, v2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode552] failed." + " Variables: " + "[v1] = "
					+ v1 + ", " + "[v2] = " + v2 + ".");
		}
		// W w1 = (W) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternInvalid2(V v) {
		// ActivityNode553
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_1_1_ActivityNode553_blackBFFF(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode553] failed." + " Variables: " + "[v] = " + v + ".");
		}
		// W w = (W) result1_black[1];
		// X x1 = (X) result1_black[2];
		// X x2 = (X) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternInvalid3(W w1, W w2) {
		// ActivityNode554
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_2_1_ActivityNode554_blackBBF(w1, w2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode554] failed." + " Variables: " + "[w1] = "
					+ w1 + ", " + "[w2] = " + w2 + ".");
		}
		// X x = (X) result1_black[2];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternInvalid4(V v) {
		// ActivityNode555
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_3_1_ActivityNode555_blackBFFF(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode555] failed." + " Variables: " + "[v] = " + v + ".");
		}
		// W w1 = (W) result1_black[1];
		// W w2 = (W) result1_black[2];
		// Y y = (Y) result1_black[3];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternValid1(V v) {
		// ActivityNode557
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_4_1_ActivityNode557_blackBFFFFFFFFFF(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode557] failed." + " Variables: " + "[v] = " + v + ".");
		}
		// W w1 = (W) result1_black[1];
		// W w2 = (W) result1_black[2];
		// Y y1 = (Y) result1_black[3];
		// Y y2 = (Y) result1_black[4];
		// X x1 = (X) result1_black[5];
		// X x2 = (X) result1_black[6];
		// Y y3 = (Y) result1_black[7];
		// Y y4 = (Y) result1_black[8];
		// Z z1 = (Z) result1_black[9];
		// Z z2 = (Z) result1_black[10];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternInvalid5(V v) {
		// ActivityNode556
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_5_1_ActivityNode556_blackBFFFF(v);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode556] failed." + " Variables: " + "[v] = " + v + ".");
		}
		// W w = (W) result1_black[1];
		// X x = (X) result1_black[2];
		// Z z1 = (Z) result1_black[3];
		// Z z2 = (Z) result1_black[4];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternInvalid6(W w1, W w2) {
		// ActivityNode559
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_6_1_ActivityNode559_blackBBFFFF(w1, w2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode559] failed." + " Variables: " + "[w1] = "
					+ w1 + ", " + "[w2] = " + w2 + ".");
		}
		// X x1 = (X) result1_black[2];
		// X x2 = (X) result1_black[3];
		// Z z1 = (Z) result1_black[4];
		// Z z3 = (Z) result1_black[5];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testPatternInvalid7(W w1, W w2) {
		// ActivityNode558
		Object[] result1_black = CardinalityConstraintsTestPatternImpl
				.pattern_CardinalityConstraintsTestPattern_7_1_ActivityNode558_blackBBFFF(w1, w2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [ActivityNode558] failed." + " Variables: " + "[w1] = "
					+ w1 + ", " + "[w2] = " + w2 + ".");
		}
		// Y y1 = (Y) result1_black[2];
		// Y y2 = (Y) result1_black[3];
		// Y y3 = (Y) result1_black[4];
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
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID1__V_V:
			testPatternInvalid1((V) arguments.get(0), (V) arguments.get(1));
			return null;
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID2__V:
			testPatternInvalid2((V) arguments.get(0));
			return null;
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID3__W_W:
			testPatternInvalid3((W) arguments.get(0), (W) arguments.get(1));
			return null;
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID4__V:
			testPatternInvalid4((V) arguments.get(0));
			return null;
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_VALID1__V:
			testPatternValid1((V) arguments.get(0));
			return null;
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID5__V:
			testPatternInvalid5((V) arguments.get(0));
			return null;
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID6__W_W:
			testPatternInvalid6((W) arguments.get(0), (W) arguments.get(1));
			return null;
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID7__W_W:
			testPatternInvalid7((W) arguments.get(0), (W) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CardinalityConstraintsTestPattern_0_1_ActivityNode552_blackBFB(V v1, V v2) {
		if (!v1.equals(v2)) {
			for (W w1 : v1.getW()) {
				if (v2.getW().contains(w1)) {
					return new Object[] { v1, w1, v2 };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CardinalityConstraintsTestPattern_1_1_ActivityNode553_blackBFFF(V v) {
		for (W w : v.getW()) {
			X x1 = w.getX();
			if (x1 != null) {
				X x2 = w.getX();
				if (x2 != null) {
					if (!x1.equals(x2)) {
						return new Object[] { v, w, x1, x2 };
					}
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_CardinalityConstraintsTestPattern_2_1_ActivityNode554_blackBBF(W w1, W w2) {
		if (!w1.equals(w2)) {
			X x = w1.getX();
			if (x != null) {
				if (x.equals(w2.getX())) {
					return new Object[] { w1, w2, x };
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_CardinalityConstraintsTestPattern_3_1_ActivityNode555_blackBFFF(V v) {
		for (W w2 : v.getW()) {
			for (W w1 : v.getW()) {
				if (!w1.equals(w2)) {
					for (Y y : w2.getY()) {
						if (w1.equals(y.getW())) {
							return new Object[] { v, w1, w2, y };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CardinalityConstraintsTestPattern_4_1_ActivityNode557_blackBFFFFFFFFFF(V v) {
		for (W w1 : v.getW()) {
			X x1 = w1.getX();
			if (x1 != null) {
				Z z1 = x1.getZ();
				if (z1 != null) {
					Z z2 = z1.getNext();
					if (z2 != null) {
						if (!z1.equals(z2)) {
							for (W w2 : v.getW()) {
								if (!w1.equals(w2)) {
									X x2 = w2.getX();
									if (x2 != null) {
										if (!x1.equals(x2)) {
											if (z2.equals(x2.getZ())) {
												for (Y y1 : w1.getY()) {
													for (Y y4 : w1.getY()) {
														if (!y1.equals(y4)) {
															for (Y y2 : w2.getY()) {
																if (!y1.equals(y2)) {
																	if (!y2.equals(y4)) {
																		for (Y y3 : w2.getY()) {
																			if (!y1.equals(y3)) {
																				if (!y2.equals(y3)) {
																					if (!y3.equals(y4)) {
																						if (y2.equals(y3.getNext())) {
																							return new Object[] { v, w1,
																									w2, y1, y2, x1, x2,
																									y3, y4, z1, z2 };
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

		}
		return null;
	}

	public static final Object[] pattern_CardinalityConstraintsTestPattern_5_1_ActivityNode556_blackBFFFF(V v) {
		for (W w : v.getW()) {
			X x = w.getX();
			if (x != null) {
				Z z1 = x.getZ();
				if (z1 != null) {
					Z z2 = x.getZ();
					if (z2 != null) {
						if (!z1.equals(z2)) {
							return new Object[] { v, w, x, z1, z2 };
						}
					}

				}

			}

		}
		return null;
	}

	public static final Object[] pattern_CardinalityConstraintsTestPattern_6_1_ActivityNode559_blackBBFFFF(W w1, W w2) {
		if (!w1.equals(w2)) {
			X x1 = w1.getX();
			if (x1 != null) {
				X x2 = w2.getX();
				if (x2 != null) {
					if (!x1.equals(x2)) {
						Z z1 = x1.getZ();
						if (z1 != null) {
							Z z3 = x2.getZ();
							if (z3 != null) {
								if (!z1.equals(z3)) {
									if (z3.equals(z1.getNext())) {
										if (z3.equals(z1.getNext())) {
											return new Object[] { w1, w2, x1, x2, z1, z3 };
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

	public static final Object[] pattern_CardinalityConstraintsTestPattern_7_1_ActivityNode558_blackBBFFF(W w1, W w2) {
		if (!w1.equals(w2)) {
			for (Y y1 : w1.getY()) {
				Y y3 = y1.getNext();
				if (y3 != null) {
					if (!y1.equals(y3)) {
						if (w2.equals(y3.getW())) {
							if (y3.equals(y1.getNext())) {
								for (Y y2 : w1.getY()) {
									if (!y1.equals(y2)) {
										if (!y2.equals(y3)) {
											if (y3.equals(y2.getNext())) {
												return new Object[] { w1, w2, y1, y2, y3 };
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

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CardinalityConstraintsTestPatternImpl
