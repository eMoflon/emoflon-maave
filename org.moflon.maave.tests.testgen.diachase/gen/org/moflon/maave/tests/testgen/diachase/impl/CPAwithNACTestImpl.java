/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.mnoq.M;
import org.moflon.maave.tests.lang.mnoq.MnoqFactory;
import org.moflon.maave.tests.lang.mnoq.N;

import org.moflon.maave.tests.testgen.diachase.CPAwithNACTest;
import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP Awith NAC Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CPAwithNACTestImpl extends EObjectImpl implements CPAwithNACTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPAwithNACTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.CP_AWITH_NAC_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rule1(N n1) {
		// ActivityNode45
		Object[] result1_black = CPAwithNACTestImpl.pattern_CPAwithNACTest_0_1_ActivityNode45_blackB(n1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode45] failed." + " Variables: " + "[n1] = " + n1 + ".");
		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rule2(N n2) {
		// ActivityNode46
		Object[] result1_black = CPAwithNACTestImpl.pattern_CPAwithNACTest_1_1_ActivityNode46_blackB(n2);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode46] failed." + " Variables: " + "[n2] = " + n2 + ".");
		}
		CPAwithNACTestImpl.pattern_CPAwithNACTest_1_1_ActivityNode46_greenBF(n2);
		// M m2 = (M) result1_green[1];

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
		case DiachasePackage.CP_AWITH_NAC_TEST___RULE1__N:
			rule1((N) arguments.get(0));
			return null;
		case DiachasePackage.CP_AWITH_NAC_TEST___RULE2__N:
			rule2((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CPAwithNACTest_0_1_ActivityNode45_blackB(N n1) {
		return new Object[] { n1 };
	}

	public static final Object[] pattern_CPAwithNACTest_1_1_ActivityNode46_blackB(N n2) {
		return new Object[] { n2 };
	}

	public static final Object[] pattern_CPAwithNACTest_1_1_ActivityNode46_greenBF(N n2) {
		M m2 = MnoqFactory.eINSTANCE.createM();
		n2.getMms().add(m2);
		return new Object[] { n2, m2 };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CPAwithNACTestImpl
