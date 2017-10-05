/**
 */
package org.moflon.maave.tests.lang.rbac.impl;

import java.lang.Object;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.Role;
import org.moflon.maave.tests.lang.rbac.SsdRelation;
import org.moflon.maave.tests.lang.rbac.User;
import org.moflon.maave.tests.lang.rbac.UserDefinedConstraints;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserDefinedConstraintsImpl extends EObjectImpl implements UserDefinedConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RbacPackage.Literals.USER_DEFINED_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _NC_validateSSD(Role roleA) {
		// ActivityNode1
		Object[] result1_black = UserDefinedConstraintsImpl
				.pattern_UserDefinedConstraints_0_1_ActivityNode1_blackBFFF(roleA);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode1] failed." + " Variables: " + "[roleA] = " + roleA + ".");
		}
		// Role roleB = (Role) result1_black[1];
		// SsdRelation ssdRelation = (SsdRelation) result1_black[2];
		// User userA = (User) result1_black[3];
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
		case RbacPackage.USER_DEFINED_CONSTRAINTS___NC_VALIDATE_SSD__ROLE:
			_NC_validateSSD((Role) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UserDefinedConstraints_0_1_ActivityNode1_blackBFFF(Role roleA) {
		for (User userA : roleA.getUsers()) {
			for (SsdRelation ssdRelation : roleA.getSsdRelation()) {
				for (Role roleB : userA.getRoles()) {
					if (!roleA.equals(roleB)) {
						if (ssdRelation.getSsdExclusiveRoles().contains(roleB)) {
							return new Object[] { roleA, roleB, ssdRelation, userA };
						}
					}
				}
			}
		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserDefinedConstraintsImpl
