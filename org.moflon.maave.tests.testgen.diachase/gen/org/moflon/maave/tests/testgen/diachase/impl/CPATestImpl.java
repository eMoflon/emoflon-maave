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

import org.moflon.maave.tests.testgen.diachase.CPATest;
import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPA Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CPATestImpl extends EObjectImpl implements CPATest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPATestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.CPA_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void noAttrRule2(N n2) {
		// ActivityNode34
		Object[] result1_black = CPATestImpl.pattern_CPATest_0_1_ActivityNode34_blackBFF(n2);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode34] failed." + " Variables: " + "[n2] = " + n2 + ".");
		}
		M m2 = (M) result1_black[1];
		// Q q2 = (Q) result1_black[2];
		CPATestImpl.pattern_CPATest_0_1_ActivityNode34_redBB(n2, m2);

		EcoreUtil.delete(m2);
		m2 = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void noAttrRule1(N n1) {
		// ActivityNode33
		Object[] result1_black = CPATestImpl.pattern_CPATest_1_1_ActivityNode33_blackBFF(n1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode33] failed." + " Variables: " + "[n1] = " + n1 + ".");
		}
		M m1 = (M) result1_black[1];
		Q q1 = (Q) result1_black[2];
		CPATestImpl.pattern_CPATest_1_1_ActivityNode33_redBB(n1, q1);

		CPATestImpl.pattern_CPATest_1_1_ActivityNode33_greenBF(m1);
		// O o1 = (O) result1_green[1];
		EcoreUtil.delete(q1);
		q1 = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void noAttrRule3(N n3) {
		// ActivityNode35
		Object[] result1_black = CPATestImpl.pattern_CPATest_2_1_ActivityNode35_blackBFF(n3);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode35] failed." + " Variables: " + "[n3] = " + n3 + ".");
		}
		M m3 = (M) result1_black[1];
		O o3 = (O) result1_black[2];
		CPATestImpl.pattern_CPATest_2_1_ActivityNode35_redBB(m3, o3);

		EcoreUtil.delete(o3);
		o3 = null;
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
		case DiachasePackage.CPA_TEST___NO_ATTR_RULE2__N:
			noAttrRule2((N) arguments.get(0));
			return null;
		case DiachasePackage.CPA_TEST___NO_ATTR_RULE1__N:
			noAttrRule1((N) arguments.get(0));
			return null;
		case DiachasePackage.CPA_TEST___NO_ATTR_RULE3__N:
			noAttrRule3((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CPATest_0_1_ActivityNode34_blackBFF(N n2) {
		for (M m2 : n2.getMms()) {
			for (Q q2 : n2.getQs()) {
				return new Object[] { n2, m2, q2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_CPATest_0_1_ActivityNode34_redBB(N n2, M m2) {
		n2.getMms().remove(m2);
		return new Object[] { n2, m2 };
	}

	public static final Object[] pattern_CPATest_1_1_ActivityNode33_blackBFF(N n1) {
		for (M m1 : n1.getMms()) {
			for (Q q1 : n1.getQs()) {
				return new Object[] { n1, m1, q1 };
			}
		}
		return null;
	}

	public static final Object[] pattern_CPATest_1_1_ActivityNode33_redBB(N n1, Q q1) {
		q1.getNs().remove(n1);
		return new Object[] { n1, q1 };
	}

	public static final Object[] pattern_CPATest_1_1_ActivityNode33_greenBF(M m1) {
		O o1 = MnoqFactory.eINSTANCE.createO();
		m1.setO(o1);
		return new Object[] { m1, o1 };
	}

	public static final Object[] pattern_CPATest_2_1_ActivityNode35_blackBFF(N n3) {
		for (M m3 : n3.getMms()) {
			O o3 = m3.getO();
			if (o3 != null) {
				return new Object[] { n3, m3, o3 };
			}

		}
		return null;
	}

	public static final Object[] pattern_CPATest_2_1_ActivityNode35_redBB(M m3, O o3) {
		m3.setO(null);
		return new Object[] { m3, o3 };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CPATestImpl
