/**
 */
package org.moflon.maave.tests.testgen.diachase.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.maave.tests.lang.mnoq.M;
import org.moflon.maave.tests.lang.mnoq.N;
import org.moflon.maave.tests.lang.mnoq.Q;

import org.moflon.maave.tests.testgen.diachase.DiachasePackage;
import org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbolic Pushout Complement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SymbolicPushoutComplementImpl extends EObjectImpl implements SymbolicPushoutComplement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicPushoutComplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiachasePackage.Literals.SYMBOLIC_PUSHOUT_COMPLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rule1(N n) {
		// ActivityNode51
		Object[] result1_black = SymbolicPushoutComplementImpl
				.pattern_SymbolicPushoutComplement_0_1_ActivityNode51_blackBFFF(n);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode51] failed." + " Variables: " + "[n] = " + n + ".");
		}
		M m = (M) result1_black[1];
		Q q = (Q) result1_black[2];
		int m_x_prime_1 = (int) result1_black[3];
		SymbolicPushoutComplementImpl.pattern_SymbolicPushoutComplement_0_1_ActivityNode51_redBB(n, q);

		SymbolicPushoutComplementImpl.pattern_SymbolicPushoutComplement_0_1_ActivityNode51_greenBB(m, m_x_prime_1);

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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DiachasePackage.SYMBOLIC_PUSHOUT_COMPLEMENT___RULE1__N:
			rule1((N) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SymbolicPushoutComplement_0_1_ActivityNode51_blackBFFF(N n) {
		int n_x = n.getX();
		if (n_x > 5) {
			for (M m : n.getMms()) {
				for (Q q : n.getQs()) {
					int m_x_prime;

					m_x_prime = n_x + 5;
					return new Object[] { n, m, q, m_x_prime };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_SymbolicPushoutComplement_0_1_ActivityNode51_redBB(N n, Q q) {
		q.getNs().remove(n);
		return new Object[] { n, q };
	}

	public static final Object[] pattern_SymbolicPushoutComplement_0_1_ActivityNode51_greenBB(M m, int m_x_prime) {
		m.setX(Integer.valueOf(m_x_prime));
		return new Object[] { m, m_x_prime };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SymbolicPushoutComplementImpl
