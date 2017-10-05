/**
 */
package org.moflon.maave.tests.lang.vwxyz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.maave.tests.lang.vwxyz.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VwxyzFactoryImpl extends EFactoryImpl implements VwxyzFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VwxyzFactory init() {
		try {
			VwxyzFactory theVwxyzFactory = (VwxyzFactory) EPackage.Registry.INSTANCE.getEFactory(VwxyzPackage.eNS_URI);
			if (theVwxyzFactory != null) {
				return theVwxyzFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VwxyzFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VwxyzFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VwxyzPackage.V:
			return createV();
		case VwxyzPackage.W:
			return createW();
		case VwxyzPackage.X:
			return createX();
		case VwxyzPackage.Y:
			return createY();
		case VwxyzPackage.Z:
			return createZ();
		case VwxyzPackage.CARDINALITY_CONSTRAINTS_TEST_PATTERN:
			return createCardinalityConstraintsTestPattern();
		case VwxyzPackage.USER_DEFINED_CONSTRAINTS:
			return createUserDefinedConstraints();
		case VwxyzPackage.CONSTRAINT_TO_POST_CONDITION_PATTERN:
			return createConstraintToPostConditionPattern();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V createV() {
		VImpl v = new VImpl();
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W createW() {
		WImpl w = new WImpl();
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X createX() {
		XImpl x = new XImpl();
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Y createY() {
		YImpl y = new YImpl();
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Z createZ() {
		ZImpl z = new ZImpl();
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraintsTestPattern createCardinalityConstraintsTestPattern() {
		CardinalityConstraintsTestPatternImpl cardinalityConstraintsTestPattern = new CardinalityConstraintsTestPatternImpl();
		return cardinalityConstraintsTestPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedConstraints createUserDefinedConstraints() {
		UserDefinedConstraintsImpl userDefinedConstraints = new UserDefinedConstraintsImpl();
		return userDefinedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintToPostConditionPattern createConstraintToPostConditionPattern() {
		ConstraintToPostConditionPatternImpl constraintToPostConditionPattern = new ConstraintToPostConditionPatternImpl();
		return constraintToPostConditionPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VwxyzPackage getVwxyzPackage() {
		return (VwxyzPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VwxyzPackage getPackage() {
		return VwxyzPackage.eINSTANCE;
	}

} //VwxyzFactoryImpl
