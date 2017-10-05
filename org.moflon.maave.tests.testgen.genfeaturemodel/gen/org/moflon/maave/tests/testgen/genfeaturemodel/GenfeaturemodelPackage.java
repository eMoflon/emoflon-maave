/**
 */
package org.moflon.maave.tests.testgen.genfeaturemodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.testgen.genfeaturemodel.GenfeaturemodelFactory
 * @model kind="package"
 * @generated
 */
public interface GenfeaturemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genfeaturemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.testgen.genfeaturemodel/model/Genfeaturemodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.testgen.genfeaturemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenfeaturemodelPackage eINSTANCE = org.moflon.maave.tests.testgen.genfeaturemodel.impl.GenfeaturemodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.impl.RulesImpl
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.impl.GenfeaturemodelPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 0;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Rule A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES___RULE_A__FEATURE = 0;

	/**
	 * The operation id for the '<em>Rule B</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES___RULE_B__FEATURE = 1;

	/**
	 * The operation id for the '<em>Rule C</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES___RULE_C__FEATURE = 2;

	/**
	 * The operation id for the '<em>Rule A2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES___RULE_A2__FEATURE = 3;

	/**
	 * The operation id for the '<em>Rule B2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES___RULE_B2__FEATURE = 4;

	/**
	 * The operation id for the '<em>Rule C2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES___RULE_C2__FEATURE = 5;

	/**
	 * The number of operations of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_OPERATION_COUNT = 6;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.genfeaturemodel.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleA(org.moflon.maave.tests.lang.featuremodel.Feature) <em>Rule A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule A</em>' operation.
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleA(org.moflon.maave.tests.lang.featuremodel.Feature)
	 * @generated
	 */
	EOperation getRules__RuleA__Feature();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleB(org.moflon.maave.tests.lang.featuremodel.Feature) <em>Rule B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule B</em>' operation.
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleB(org.moflon.maave.tests.lang.featuremodel.Feature)
	 * @generated
	 */
	EOperation getRules__RuleB__Feature();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleC(org.moflon.maave.tests.lang.featuremodel.Feature) <em>Rule C</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule C</em>' operation.
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleC(org.moflon.maave.tests.lang.featuremodel.Feature)
	 * @generated
	 */
	EOperation getRules__RuleC__Feature();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleA2(org.moflon.maave.tests.lang.featuremodel.Feature) <em>Rule A2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule A2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleA2(org.moflon.maave.tests.lang.featuremodel.Feature)
	 * @generated
	 */
	EOperation getRules__RuleA2__Feature();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleB2(org.moflon.maave.tests.lang.featuremodel.Feature) <em>Rule B2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule B2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleB2(org.moflon.maave.tests.lang.featuremodel.Feature)
	 * @generated
	 */
	EOperation getRules__RuleB2__Feature();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleC2(org.moflon.maave.tests.lang.featuremodel.Feature) <em>Rule C2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule C2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.Rules#ruleC2(org.moflon.maave.tests.lang.featuremodel.Feature)
	 * @generated
	 */
	EOperation getRules__RuleC2__Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenfeaturemodelFactory getGenfeaturemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.genfeaturemodel.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.genfeaturemodel.impl.RulesImpl
		 * @see org.moflon.maave.tests.testgen.genfeaturemodel.impl.GenfeaturemodelPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Rule A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULES___RULE_A__FEATURE = eINSTANCE.getRules__RuleA__Feature();

		/**
		 * The meta object literal for the '<em><b>Rule B</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULES___RULE_B__FEATURE = eINSTANCE.getRules__RuleB__Feature();

		/**
		 * The meta object literal for the '<em><b>Rule C</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULES___RULE_C__FEATURE = eINSTANCE.getRules__RuleC__Feature();

		/**
		 * The meta object literal for the '<em><b>Rule A2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULES___RULE_A2__FEATURE = eINSTANCE.getRules__RuleA2__Feature();

		/**
		 * The meta object literal for the '<em><b>Rule B2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULES___RULE_B2__FEATURE = eINSTANCE.getRules__RuleB2__Feature();

		/**
		 * The meta object literal for the '<em><b>Rule C2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULES___RULE_C2__FEATURE = eINSTANCE.getRules__RuleC2__Feature();

	}

} //GenfeaturemodelPackage
