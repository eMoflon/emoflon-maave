/**
 */
package org.moflon.maave.tests.testgen.genfeaturemodel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.maave.tests.lang.featuremodel.Feature;
import org.moflon.maave.tests.lang.featuremodel.FeaturemodelFactory;
import org.moflon.maave.tests.lang.featuremodel.Group;
import org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute;
import org.moflon.maave.tests.lang.featuremodel.RealFeatureAttribute;

import org.moflon.maave.tests.testgen.genfeaturemodel.GenfeaturemodelPackage;
import org.moflon.maave.tests.testgen.genfeaturemodel.Rules;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RulesImpl extends EObjectImpl implements Rules {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenfeaturemodelPackage.Literals.RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleA(Feature f1) {
		// ActivityNode1
		Object[] result1_black = RulesImpl.pattern_Rules_0_1_ActivityNode1_blackBFFF(f1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode1] failed." + " Variables: " + "[f1] = " + f1 + ".");
		}
		Group man = (Group) result1_black[1];
		Feature f2 = (Feature) result1_black[2];
		NatFeatureAttribute a2 = (NatFeatureAttribute) result1_black[3];
		RulesImpl.pattern_Rules_0_1_ActivityNode1_redBBBB(f1, man, f2, a2);

		RulesImpl.pattern_Rules_0_1_ActivityNode1_greenBF(f1);
		// NatFeatureAttribute a1 = (NatFeatureAttribute) result1_green[1];
		EcoreUtil.delete(man);
		man = null;
		EcoreUtil.delete(f2);
		f2 = null;
		EcoreUtil.delete(a2);
		a2 = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleB(Feature fx) {
		// ActivityNode2
		Object[] result1_black = RulesImpl.pattern_Rules_1_1_ActivityNode2_blackBF(fx);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode2] failed." + " Variables: " + "[fx] = " + fx + ".");
		}
		// NatFeatureAttribute ax = (NatFeatureAttribute) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleC(Feature fy) {
		// ActivityNode3
		Object[] result1_black = RulesImpl.pattern_Rules_2_1_ActivityNode3_blackBF(fy);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode3] failed." + " Variables: " + "[fy] = " + fy + ".");
		}
		// NatFeatureAttribute ay = (NatFeatureAttribute) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleA2(Feature f1) {
		// ActivityNode1
		Object[] result1_black = RulesImpl.pattern_Rules_3_1_ActivityNode1_blackBFFF(f1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode1] failed." + " Variables: " + "[f1] = " + f1 + ".");
		}
		Group man = (Group) result1_black[1];
		Feature f2 = (Feature) result1_black[2];
		RealFeatureAttribute a2 = (RealFeatureAttribute) result1_black[3];
		RulesImpl.pattern_Rules_3_1_ActivityNode1_redBBBB(f1, man, f2, a2);

		RulesImpl.pattern_Rules_3_1_ActivityNode1_greenBF(f1);
		// RealFeatureAttribute a1 = (RealFeatureAttribute) result1_green[1];
		EcoreUtil.delete(man);
		man = null;
		EcoreUtil.delete(f2);
		f2 = null;
		EcoreUtil.delete(a2);
		a2 = null;
		;

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleB2(Feature fx) {
		// ActivityNode2
		Object[] result1_black = RulesImpl.pattern_Rules_4_1_ActivityNode2_blackBF(fx);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode2] failed." + " Variables: " + "[fx] = " + fx + ".");
		}
		// RealFeatureAttribute ax = (RealFeatureAttribute) result1_black[1];
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ruleC2(Feature fy) {
		// ActivityNode3
		Object[] result1_black = RulesImpl.pattern_Rules_5_1_ActivityNode3_blackBF(fy);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode3] failed." + " Variables: " + "[fy] = " + fy + ".");
		}
		// RealFeatureAttribute ay = (RealFeatureAttribute) result1_black[1];
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
		case GenfeaturemodelPackage.RULES___RULE_A__FEATURE:
			ruleA((Feature) arguments.get(0));
			return null;
		case GenfeaturemodelPackage.RULES___RULE_B__FEATURE:
			ruleB((Feature) arguments.get(0));
			return null;
		case GenfeaturemodelPackage.RULES___RULE_C__FEATURE:
			ruleC((Feature) arguments.get(0));
			return null;
		case GenfeaturemodelPackage.RULES___RULE_A2__FEATURE:
			ruleA2((Feature) arguments.get(0));
			return null;
		case GenfeaturemodelPackage.RULES___RULE_B2__FEATURE:
			ruleB2((Feature) arguments.get(0));
			return null;
		case GenfeaturemodelPackage.RULES___RULE_C2__FEATURE:
			ruleC2((Feature) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Rules_0_1_ActivityNode1_blackBFFF(Feature f1) {
		for (Group man : f1.getGroups()) {
			for (Feature f2 : man.getFeatures()) {
				if (!f1.equals(f2)) {
					for (NatFeatureAttribute a2 : f2.getNat()) {
						return new Object[] { f1, man, f2, a2 };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Rules_0_1_ActivityNode1_redBBBB(Feature f1, Group man, Feature f2,
			NatFeatureAttribute a2) {
		f1.getGroups().remove(man);
		man.getFeatures().remove(f2);
		f2.getNat().remove(a2);
		return new Object[] { f1, man, f2, a2 };
	}

	public static final Object[] pattern_Rules_0_1_ActivityNode1_greenBF(Feature f1) {
		NatFeatureAttribute a1 = FeaturemodelFactory.eINSTANCE.createNatFeatureAttribute();
		f1.getNat().add(a1);
		return new Object[] { f1, a1 };
	}

	public static final Object[] pattern_Rules_1_1_ActivityNode2_blackBF(Feature fx) {
		for (NatFeatureAttribute ax : fx.getNat()) {
			return new Object[] { fx, ax };
		}
		return null;
	}

	public static final Object[] pattern_Rules_2_1_ActivityNode3_blackBF(Feature fy) {
		for (NatFeatureAttribute ay : fy.getNat()) {
			return new Object[] { fy, ay };
		}
		return null;
	}

	public static final Object[] pattern_Rules_3_1_ActivityNode1_blackBFFF(Feature f1) {
		for (Group man : f1.getGroups()) {
			for (Feature f2 : man.getFeatures()) {
				if (!f1.equals(f2)) {
					for (RealFeatureAttribute a2 : f2.getReal()) {
						return new Object[] { f1, man, f2, a2 };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Rules_3_1_ActivityNode1_redBBBB(Feature f1, Group man, Feature f2,
			RealFeatureAttribute a2) {
		f1.getGroups().remove(man);
		man.getFeatures().remove(f2);
		f2.getReal().remove(a2);
		return new Object[] { f1, man, f2, a2 };
	}

	public static final Object[] pattern_Rules_3_1_ActivityNode1_greenBF(Feature f1) {
		RealFeatureAttribute a1 = FeaturemodelFactory.eINSTANCE.createRealFeatureAttribute();
		f1.getReal().add(a1);
		return new Object[] { f1, a1 };
	}

	public static final Object[] pattern_Rules_4_1_ActivityNode2_blackBF(Feature fx) {
		for (RealFeatureAttribute ax : fx.getReal()) {
			return new Object[] { fx, ax };
		}
		return null;
	}

	public static final Object[] pattern_Rules_5_1_ActivityNode3_blackBF(Feature fy) {
		for (RealFeatureAttribute ay : fy.getReal()) {
			return new Object[] { fy, ay };
		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RulesImpl
