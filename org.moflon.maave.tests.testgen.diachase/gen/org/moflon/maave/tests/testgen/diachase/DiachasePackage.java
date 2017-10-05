/**
 */
package org.moflon.maave.tests.testgen.diachase;

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
 * @see org.moflon.maave.tests.testgen.diachase.DiachaseFactory
 * @model kind="package"
 * @generated
 */
public interface DiachasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diachase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.testgen.diachase/model/Diachase.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.testgen.diachase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiachasePackage eINSTANCE = org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.EnumTestPatternImpl <em>Enum Test Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.EnumTestPatternImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getEnumTestPattern()
	 * @generated
	 */
	int ENUM_TEST_PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Enum Test Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TEST_PATTERN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TEST_PATTERN___TEST_PATTERN1__E = 0;

	/**
	 * The number of operations of the '<em>Enum Test Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TEST_PATTERN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.PaperExampleTestImpl <em>Paper Example Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.PaperExampleTestImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getPaperExampleTest()
	 * @generated
	 */
	int PAPER_EXAMPLE_TEST = 1;

	/**
	 * The number of structural features of the '<em>Paper Example Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Rule Add One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST___RULE_ADD_ONE__N = 0;

	/**
	 * The operation id for the '<em>Rule Add Two</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST___RULE_ADD_TWO__N = 1;

	/**
	 * The operation id for the '<em>Rule Larger4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST___RULE_LARGER4__N = 2;

	/**
	 * The operation id for the '<em>Rule Smaller4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST___RULE_SMALLER4__N = 3;

	/**
	 * The operation id for the '<em>Rule Times</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST___RULE_TIMES__N = 4;

	/**
	 * The operation id for the '<em>Rule Larger4 Add Two</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST___RULE_LARGER4_ADD_TWO__N = 5;

	/**
	 * The number of operations of the '<em>Paper Example Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_EXAMPLE_TEST_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.DiaChaseTestGenImpl <em>Dia Chase Test Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiaChaseTestGenImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getDiaChaseTestGen()
	 * @generated
	 */
	int DIA_CHASE_TEST_GEN = 2;

	/**
	 * The number of structural features of the '<em>Dia Chase Test Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN__N = 0;

	/**
	 * The operation id for the '<em>Test Pattern A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_A__M_N = 1;

	/**
	 * The operation id for the '<em>Test Pattern A2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_A2__M_N = 2;

	/**
	 * The operation id for the '<em>Test Pattern B</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_B__Q_M_N = 3;

	/**
	 * The operation id for the '<em>Test Pattern B2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_B2__Q_M_N = 4;

	/**
	 * The operation id for the '<em>Test Pattern C</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_C__M_O_N = 5;

	/**
	 * The operation id for the '<em>Test Pattern C2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_C2__M_O_N = 6;

	/**
	 * The operation id for the '<em>Test Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_MODEL__N = 7;

	/**
	 * The operation id for the '<em>Test Pattern Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_ADD__N = 8;

	/**
	 * The operation id for the '<em>Test Pattern Larger4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_LARGER4__N = 9;

	/**
	 * The operation id for the '<em>Test Pattern Smaller5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_SMALLER5__N = 10;

	/**
	 * The operation id for the '<em>Test Pattern Temp Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_PATTERN_TEMP_VAR__N = 11;

	/**
	 * The operation id for the '<em>Test Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN___TEST_RULE__N = 12;

	/**
	 * The number of operations of the '<em>Dia Chase Test Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIA_CHASE_TEST_GEN_OPERATION_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.PatternGeneratorImpl <em>Pattern Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.PatternGeneratorImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getPatternGenerator()
	 * @generated
	 */
	int PATTERN_GENERATOR = 3;

	/**
	 * The number of structural features of the '<em>Pattern Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN1__A = 0;

	/**
	 * The operation id for the '<em>Test Pattern2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN2__A = 1;

	/**
	 * The operation id for the '<em>Test Pattern3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN3__A = 2;

	/**
	 * The operation id for the '<em>Test Pattern4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN4__A = 3;

	/**
	 * The operation id for the '<em>Test Pattern5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN5__A = 4;

	/**
	 * The operation id for the '<em>Test Pattern6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN6__A = 5;

	/**
	 * The operation id for the '<em>Test Pattern7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN7__A = 6;

	/**
	 * The operation id for the '<em>Test Pattern8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR___TEST_PATTERN8__A = 7;

	/**
	 * The number of operations of the '<em>Pattern Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_GENERATOR_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.NacPatternGeneratorImpl <em>Nac Pattern Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.NacPatternGeneratorImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getNacPatternGenerator()
	 * @generated
	 */
	int NAC_PATTERN_GENERATOR = 4;

	/**
	 * The number of structural features of the '<em>Nac Pattern Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Instance Test Pattern1 Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_VALID__A = 0;

	/**
	 * The operation id for the '<em>Instance Test Pattern1 Invalid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_INVALID__A = 1;

	/**
	 * The operation id for the '<em>Instance Test Pattern2 Invalid A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_A__A = 2;

	/**
	 * The operation id for the '<em>Instance Test Pattern2 Invalid B</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_B__A = 3;

	/**
	 * The operation id for the '<em>Instance Test Pattern2 Invalid C</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_C__A = 4;

	/**
	 * The operation id for the '<em>Instance Test Pattern2valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2VALID__C_A = 5;

	/**
	 * The operation id for the '<em>Instance Test Pattern4 Invalid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4_INVALID__A = 6;

	/**
	 * The operation id for the '<em>Instance Test Pattern4valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4VALID__A = 7;

	/**
	 * The operation id for the '<em>Nac Test Pattern1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN1__A = 8;

	/**
	 * The operation id for the '<em>Nac Test Pattern2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN2__C_A = 9;

	/**
	 * The operation id for the '<em>Nac Test Pattern3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN3__A = 10;

	/**
	 * The operation id for the '<em>Nac Test Pattern4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN4__A = 11;

	/**
	 * The number of operations of the '<em>Nac Pattern Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAC_PATTERN_GENERATOR_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.CPATestImpl <em>CPA Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.CPATestImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getCPATest()
	 * @generated
	 */
	int CPA_TEST = 5;

	/**
	 * The number of structural features of the '<em>CPA Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPA_TEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>No Attr Rule2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPA_TEST___NO_ATTR_RULE2__N = 0;

	/**
	 * The operation id for the '<em>No Attr Rule1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPA_TEST___NO_ATTR_RULE1__N = 1;

	/**
	 * The operation id for the '<em>No Attr Rule3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPA_TEST___NO_ATTR_RULE3__N = 2;

	/**
	 * The number of operations of the '<em>CPA Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPA_TEST_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.InitialPushoutTestImpl <em>Initial Pushout Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.InitialPushoutTestImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getInitialPushoutTest()
	 * @generated
	 */
	int INITIAL_PUSHOUT_TEST = 6;

	/**
	 * The number of structural features of the '<em>Initial Pushout Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_PATTERN1__N = 0;

	/**
	 * The operation id for the '<em>Test Model1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_MODEL1__N = 1;

	/**
	 * The operation id for the '<em>Test Pattern2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_PATTERN2__N = 2;

	/**
	 * The operation id for the '<em>Test Model2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_MODEL2__N = 3;

	/**
	 * The operation id for the '<em>Test Rule1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_RULE1__N = 4;

	/**
	 * The operation id for the '<em>Test Model3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_MODEL3__N = 5;

	/**
	 * The operation id for the '<em>Test Model4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_MODEL4__N = 6;

	/**
	 * The operation id for the '<em>Test Rule4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST___TEST_RULE4__N = 7;

	/**
	 * The number of operations of the '<em>Initial Pushout Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_PUSHOUT_TEST_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.CPAwithNACTestImpl <em>CP Awith NAC Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.CPAwithNACTestImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getCPAwithNACTest()
	 * @generated
	 */
	int CP_AWITH_NAC_TEST = 7;

	/**
	 * The number of structural features of the '<em>CP Awith NAC Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_AWITH_NAC_TEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Rule1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_AWITH_NAC_TEST___RULE1__N = 0;

	/**
	 * The operation id for the '<em>Rule2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_AWITH_NAC_TEST___RULE2__N = 1;

	/**
	 * The number of operations of the '<em>CP Awith NAC Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP_AWITH_NAC_TEST_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.SymbolicPushoutComplementImpl <em>Symbolic Pushout Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.SymbolicPushoutComplementImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getSymbolicPushoutComplement()
	 * @generated
	 */
	int SYMBOLIC_PUSHOUT_COMPLEMENT = 8;

	/**
	 * The number of structural features of the '<em>Symbolic Pushout Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_PUSHOUT_COMPLEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Rule1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_PUSHOUT_COMPLEMENT___RULE1__N = 0;

	/**
	 * The number of operations of the '<em>Symbolic Pushout Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_PUSHOUT_COMPLEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.PullbackTestImpl <em>Pullback Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.PullbackTestImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getPullbackTest()
	 * @generated
	 */
	int PULLBACK_TEST = 9;

	/**
	 * The number of structural features of the '<em>Pullback Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK_TEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern D</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK_TEST___TEST_PATTERN_D__N = 0;

	/**
	 * The operation id for the '<em>Test Pattern C</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK_TEST___TEST_PATTERN_C__N = 1;

	/**
	 * The operation id for the '<em>Test Pattern B</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK_TEST___TEST_PATTERN_B__N = 2;

	/**
	 * The number of operations of the '<em>Pullback Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULLBACK_TEST_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.DirectDerivationTestCasesImpl <em>Direct Derivation Test Cases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DirectDerivationTestCasesImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getDirectDerivationTestCases()
	 * @generated
	 */
	int DIRECT_DERIVATION_TEST_CASES = 10;

	/**
	 * The number of structural features of the '<em>Direct Derivation Test Cases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_TEST_CASES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Empty Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_TEST_CASES___EMPTY_RULE = 0;

	/**
	 * The operation id for the '<em>Test Rule1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_TEST_CASES___TEST_RULE1__M = 1;

	/**
	 * The operation id for the '<em>Test Model1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_TEST_CASES___TEST_MODEL1__M = 2;

	/**
	 * The operation id for the '<em>Test Model2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_TEST_CASES___TEST_MODEL2__M = 3;

	/**
	 * The operation id for the '<em>Test Model3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_TEST_CASES___TEST_MODEL3__M = 4;

	/**
	 * The number of operations of the '<em>Direct Derivation Test Cases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_DERIVATION_TEST_CASES_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.NormalFormEquivalenceTestPatternsImpl <em>Normal Form Equivalence Test Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.NormalFormEquivalenceTestPatternsImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getNormalFormEquivalenceTestPatterns()
	 * @generated
	 */
	int NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS = 11;

	/**
	 * The number of structural features of the '<em>Normal Form Equivalence Test Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN1__N_N = 0;

	/**
	 * The operation id for the '<em>Test Pattern2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN2__N_N = 1;

	/**
	 * The operation id for the '<em>Test Pattern3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN3__N_N = 2;

	/**
	 * The operation id for the '<em>Test Pattern4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN4__N_N = 3;

	/**
	 * The number of operations of the '<em>Normal Form Equivalence Test Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.testgen.diachase.impl.MorphismClassTestPatternsImpl <em>Morphism Class Test Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.testgen.diachase.impl.MorphismClassTestPatternsImpl
	 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getMorphismClassTestPatterns()
	 * @generated
	 */
	int MORPHISM_CLASS_TEST_PATTERNS = 12;

	/**
	 * The number of structural features of the '<em>Morphism Class Test Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CLASS_TEST_PATTERNS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN1__N = 0;

	/**
	 * The operation id for the '<em>Test Pattern2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN2__N = 1;

	/**
	 * The operation id for the '<em>Test Pattern3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN3__N = 2;

	/**
	 * The number of operations of the '<em>Morphism Class Test Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORPHISM_CLASS_TEST_PATTERNS_OPERATION_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.EnumTestPattern <em>Enum Test Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Test Pattern</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.EnumTestPattern
	 * @generated
	 */
	EClass getEnumTestPattern();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.EnumTestPattern#testPattern1(org.moflon.maave.tests.lang.enumlang.E) <em>Test Pattern1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.EnumTestPattern#testPattern1(org.moflon.maave.tests.lang.enumlang.E)
	 * @generated
	 */
	EOperation getEnumTestPattern__TestPattern1__E();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest <em>Paper Example Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paper Example Test</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest
	 * @generated
	 */
	EClass getPaperExampleTest();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleAddOne(org.moflon.maave.tests.lang.mnoq.N) <em>Rule Add One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule Add One</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleAddOne(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPaperExampleTest__RuleAddOne__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleAddTwo(org.moflon.maave.tests.lang.mnoq.N) <em>Rule Add Two</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule Add Two</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleAddTwo(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPaperExampleTest__RuleAddTwo__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleLarger4(org.moflon.maave.tests.lang.mnoq.N) <em>Rule Larger4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule Larger4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleLarger4(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPaperExampleTest__RuleLarger4__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleSmaller4(org.moflon.maave.tests.lang.mnoq.N) <em>Rule Smaller4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule Smaller4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleSmaller4(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPaperExampleTest__RuleSmaller4__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleTimes(org.moflon.maave.tests.lang.mnoq.N) <em>Rule Times</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule Times</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleTimes(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPaperExampleTest__RuleTimes__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleLarger4AddTwo(org.moflon.maave.tests.lang.mnoq.N) <em>Rule Larger4 Add Two</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule Larger4 Add Two</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PaperExampleTest#ruleLarger4AddTwo(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPaperExampleTest__RuleLarger4AddTwo__N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen <em>Dia Chase Test Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dia Chase Test Gen</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen
	 * @generated
	 */
	EClass getDiaChaseTestGen();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPattern(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPattern(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPattern__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternA(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern A</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternA(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternA__M_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternA2(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern A2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern A2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternA2(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternA2__M_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternB(org.moflon.maave.tests.lang.mnoq.Q, org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern B</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternB(org.moflon.maave.tests.lang.mnoq.Q, org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternB__Q_M_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternB2(org.moflon.maave.tests.lang.mnoq.Q, org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern B2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern B2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternB2(org.moflon.maave.tests.lang.mnoq.Q, org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternB2__Q_M_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternC(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.O, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern C</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern C</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternC(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.O, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternC__M_O_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternC2(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.O, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern C2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern C2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternC2(org.moflon.maave.tests.lang.mnoq.M, org.moflon.maave.tests.lang.mnoq.O, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternC2__M_O_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testModel(org.moflon.maave.tests.lang.mnoq.N) <em>Test Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testModel(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestModel__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternAdd(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Add</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternAdd(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternAdd__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternLarger4(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern Larger4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Larger4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternLarger4(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternLarger4__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternSmaller5(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern Smaller5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Smaller5</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternSmaller5(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternSmaller5__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternTempVar(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern Temp Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Temp Var</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testPatternTempVar(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestPatternTempVar__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testRule(org.moflon.maave.tests.lang.mnoq.N) <em>Test Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Rule</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DiaChaseTestGen#testRule(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getDiaChaseTestGen__TestRule__N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator <em>Pattern Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Generator</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator
	 * @generated
	 */
	EClass getPatternGenerator();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern1(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern1(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern1__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern2(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern2(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern2__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern3(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern3</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern3(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern3__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern4(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern4(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern4__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern5(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern5</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern5(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern5__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern6(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern6</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern6(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern6__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern7(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern7</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern7(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern7__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern8(org.moflon.maave.tests.lang.abc.A) <em>Test Pattern8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern8</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PatternGenerator#testPattern8(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getPatternGenerator__TestPattern8__A();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator <em>Nac Pattern Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nac Pattern Generator</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator
	 * @generated
	 */
	EClass getNacPatternGenerator();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern1Valid(org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern1 Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern1 Valid</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern1Valid(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern1Valid__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern1Invalid(org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern1 Invalid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern1 Invalid</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern1Invalid(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern1Invalid__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2InvalidA(org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern2 Invalid A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern2 Invalid A</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2InvalidA(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern2InvalidA__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2InvalidB(org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern2 Invalid B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern2 Invalid B</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2InvalidB(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern2InvalidB__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2InvalidC(org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern2 Invalid C</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern2 Invalid C</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2InvalidC(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern2InvalidC__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2valid(org.moflon.maave.tests.lang.abc.C, org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern2valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern2valid</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern2valid(org.moflon.maave.tests.lang.abc.C, org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern2valid__C_A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern4Invalid(org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern4 Invalid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern4 Invalid</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern4Invalid(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern4Invalid__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern4valid(org.moflon.maave.tests.lang.abc.A) <em>Instance Test Pattern4valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instance Test Pattern4valid</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#instanceTestPattern4valid(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__InstanceTestPattern4valid__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern1(org.moflon.maave.tests.lang.abc.A) <em>Nac Test Pattern1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nac Test Pattern1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern1(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__NacTestPattern1__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern2(org.moflon.maave.tests.lang.abc.C, org.moflon.maave.tests.lang.abc.A) <em>Nac Test Pattern2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nac Test Pattern2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern2(org.moflon.maave.tests.lang.abc.C, org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__NacTestPattern2__C_A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern3(org.moflon.maave.tests.lang.abc.A) <em>Nac Test Pattern3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nac Test Pattern3</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern3(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__NacTestPattern3__A();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern4(org.moflon.maave.tests.lang.abc.A) <em>Nac Test Pattern4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nac Test Pattern4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NacPatternGenerator#nacTestPattern4(org.moflon.maave.tests.lang.abc.A)
	 * @generated
	 */
	EOperation getNacPatternGenerator__NacTestPattern4__A();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.CPATest <em>CPA Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPA Test</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.CPATest
	 * @generated
	 */
	EClass getCPATest();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.CPATest#noAttrRule2(org.moflon.maave.tests.lang.mnoq.N) <em>No Attr Rule2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Attr Rule2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.CPATest#noAttrRule2(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getCPATest__NoAttrRule2__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.CPATest#noAttrRule1(org.moflon.maave.tests.lang.mnoq.N) <em>No Attr Rule1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Attr Rule1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.CPATest#noAttrRule1(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getCPATest__NoAttrRule1__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.CPATest#noAttrRule3(org.moflon.maave.tests.lang.mnoq.N) <em>No Attr Rule3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Attr Rule3</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.CPATest#noAttrRule3(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getCPATest__NoAttrRule3__N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest <em>Initial Pushout Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Pushout Test</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest
	 * @generated
	 */
	EClass getInitialPushoutTest();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testPattern1(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testPattern1(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestPattern1__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel1(org.moflon.maave.tests.lang.mnoq.N) <em>Test Model1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel1(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestModel1__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testPattern2(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testPattern2(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestPattern2__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel2(org.moflon.maave.tests.lang.mnoq.N) <em>Test Model2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel2(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestModel2__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testRule1(org.moflon.maave.tests.lang.mnoq.N) <em>Test Rule1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Rule1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testRule1(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestRule1__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel3(org.moflon.maave.tests.lang.mnoq.N) <em>Test Model3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model3</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel3(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestModel3__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel4(org.moflon.maave.tests.lang.mnoq.N) <em>Test Model4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testModel4(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestModel4__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testRule4(org.moflon.maave.tests.lang.mnoq.N) <em>Test Rule4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Rule4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.InitialPushoutTest#testRule4(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getInitialPushoutTest__TestRule4__N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.CPAwithNACTest <em>CP Awith NAC Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP Awith NAC Test</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.CPAwithNACTest
	 * @generated
	 */
	EClass getCPAwithNACTest();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.CPAwithNACTest#rule1(org.moflon.maave.tests.lang.mnoq.N) <em>Rule1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.CPAwithNACTest#rule1(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getCPAwithNACTest__Rule1__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.CPAwithNACTest#rule2(org.moflon.maave.tests.lang.mnoq.N) <em>Rule2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.CPAwithNACTest#rule2(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getCPAwithNACTest__Rule2__N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement <em>Symbolic Pushout Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Pushout Complement</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement
	 * @generated
	 */
	EClass getSymbolicPushoutComplement();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement#rule1(org.moflon.maave.tests.lang.mnoq.N) <em>Rule1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.SymbolicPushoutComplement#rule1(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getSymbolicPushoutComplement__Rule1__N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.PullbackTest <em>Pullback Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pullback Test</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.PullbackTest
	 * @generated
	 */
	EClass getPullbackTest();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PullbackTest#testPatternD(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern D</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern D</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PullbackTest#testPatternD(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPullbackTest__TestPatternD__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PullbackTest#testPatternC(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern C</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern C</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PullbackTest#testPatternC(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPullbackTest__TestPatternC__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.PullbackTest#testPatternB(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern B</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.PullbackTest#testPatternB(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getPullbackTest__TestPatternB__N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases <em>Direct Derivation Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Derivation Test Cases</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases
	 * @generated
	 */
	EClass getDirectDerivationTestCases();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#emptyRule() <em>Empty Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Empty Rule</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#emptyRule()
	 * @generated
	 */
	EOperation getDirectDerivationTestCases__EmptyRule();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testRule1(org.moflon.maave.tests.lang.mnoq.M) <em>Test Rule1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Rule1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testRule1(org.moflon.maave.tests.lang.mnoq.M)
	 * @generated
	 */
	EOperation getDirectDerivationTestCases__TestRule1__M();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testModel1(org.moflon.maave.tests.lang.mnoq.M) <em>Test Model1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testModel1(org.moflon.maave.tests.lang.mnoq.M)
	 * @generated
	 */
	EOperation getDirectDerivationTestCases__TestModel1__M();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testModel2(org.moflon.maave.tests.lang.mnoq.M) <em>Test Model2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testModel2(org.moflon.maave.tests.lang.mnoq.M)
	 * @generated
	 */
	EOperation getDirectDerivationTestCases__TestModel2__M();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testModel3(org.moflon.maave.tests.lang.mnoq.M) <em>Test Model3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model3</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.DirectDerivationTestCases#testModel3(org.moflon.maave.tests.lang.mnoq.M)
	 * @generated
	 */
	EOperation getDirectDerivationTestCases__TestModel3__M();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns <em>Normal Form Equivalence Test Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Form Equivalence Test Patterns</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns
	 * @generated
	 */
	EClass getNormalFormEquivalenceTestPatterns();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern1(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern1(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getNormalFormEquivalenceTestPatterns__TestPattern1__N_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern2(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern2(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getNormalFormEquivalenceTestPatterns__TestPattern2__N_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern3(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern3</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern3(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getNormalFormEquivalenceTestPatterns__TestPattern3__N_N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern4(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern4</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.NormalFormEquivalenceTestPatterns#testPattern4(org.moflon.maave.tests.lang.mnoq.N, org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getNormalFormEquivalenceTestPatterns__TestPattern4__N_N();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns <em>Morphism Class Test Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Morphism Class Test Patterns</em>'.
	 * @see org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns
	 * @generated
	 */
	EClass getMorphismClassTestPatterns();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns#testPattern1(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern1</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns#testPattern1(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getMorphismClassTestPatterns__TestPattern1__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns#testPattern2(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern2</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns#testPattern2(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getMorphismClassTestPatterns__TestPattern2__N();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns#testPattern3(org.moflon.maave.tests.lang.mnoq.N) <em>Test Pattern3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern3</em>' operation.
	 * @see org.moflon.maave.tests.testgen.diachase.MorphismClassTestPatterns#testPattern3(org.moflon.maave.tests.lang.mnoq.N)
	 * @generated
	 */
	EOperation getMorphismClassTestPatterns__TestPattern3__N();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiachaseFactory getDiachaseFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.EnumTestPatternImpl <em>Enum Test Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.EnumTestPatternImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getEnumTestPattern()
		 * @generated
		 */
		EClass ENUM_TEST_PATTERN = eINSTANCE.getEnumTestPattern();

		/**
		 * The meta object literal for the '<em><b>Test Pattern1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUM_TEST_PATTERN___TEST_PATTERN1__E = eINSTANCE.getEnumTestPattern__TestPattern1__E();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.PaperExampleTestImpl <em>Paper Example Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.PaperExampleTestImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getPaperExampleTest()
		 * @generated
		 */
		EClass PAPER_EXAMPLE_TEST = eINSTANCE.getPaperExampleTest();

		/**
		 * The meta object literal for the '<em><b>Rule Add One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER_EXAMPLE_TEST___RULE_ADD_ONE__N = eINSTANCE.getPaperExampleTest__RuleAddOne__N();

		/**
		 * The meta object literal for the '<em><b>Rule Add Two</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER_EXAMPLE_TEST___RULE_ADD_TWO__N = eINSTANCE.getPaperExampleTest__RuleAddTwo__N();

		/**
		 * The meta object literal for the '<em><b>Rule Larger4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER_EXAMPLE_TEST___RULE_LARGER4__N = eINSTANCE.getPaperExampleTest__RuleLarger4__N();

		/**
		 * The meta object literal for the '<em><b>Rule Smaller4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER_EXAMPLE_TEST___RULE_SMALLER4__N = eINSTANCE.getPaperExampleTest__RuleSmaller4__N();

		/**
		 * The meta object literal for the '<em><b>Rule Times</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER_EXAMPLE_TEST___RULE_TIMES__N = eINSTANCE.getPaperExampleTest__RuleTimes__N();

		/**
		 * The meta object literal for the '<em><b>Rule Larger4 Add Two</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER_EXAMPLE_TEST___RULE_LARGER4_ADD_TWO__N = eINSTANCE.getPaperExampleTest__RuleLarger4AddTwo__N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.DiaChaseTestGenImpl <em>Dia Chase Test Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiaChaseTestGenImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getDiaChaseTestGen()
		 * @generated
		 */
		EClass DIA_CHASE_TEST_GEN = eINSTANCE.getDiaChaseTestGen();

		/**
		 * The meta object literal for the '<em><b>Test Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN__N = eINSTANCE.getDiaChaseTestGen__TestPattern__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_A__M_N = eINSTANCE.getDiaChaseTestGen__TestPatternA__M_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern A2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_A2__M_N = eINSTANCE.getDiaChaseTestGen__TestPatternA2__M_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern B</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_B__Q_M_N = eINSTANCE.getDiaChaseTestGen__TestPatternB__Q_M_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern B2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_B2__Q_M_N = eINSTANCE.getDiaChaseTestGen__TestPatternB2__Q_M_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern C</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_C__M_O_N = eINSTANCE.getDiaChaseTestGen__TestPatternC__M_O_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern C2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_C2__M_O_N = eINSTANCE.getDiaChaseTestGen__TestPatternC2__M_O_N();

		/**
		 * The meta object literal for the '<em><b>Test Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_MODEL__N = eINSTANCE.getDiaChaseTestGen__TestModel__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_ADD__N = eINSTANCE.getDiaChaseTestGen__TestPatternAdd__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Larger4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_LARGER4__N = eINSTANCE.getDiaChaseTestGen__TestPatternLarger4__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Smaller5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_SMALLER5__N = eINSTANCE
				.getDiaChaseTestGen__TestPatternSmaller5__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Temp Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_PATTERN_TEMP_VAR__N = eINSTANCE
				.getDiaChaseTestGen__TestPatternTempVar__N();

		/**
		 * The meta object literal for the '<em><b>Test Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIA_CHASE_TEST_GEN___TEST_RULE__N = eINSTANCE.getDiaChaseTestGen__TestRule__N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.PatternGeneratorImpl <em>Pattern Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.PatternGeneratorImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getPatternGenerator()
		 * @generated
		 */
		EClass PATTERN_GENERATOR = eINSTANCE.getPatternGenerator();

		/**
		 * The meta object literal for the '<em><b>Test Pattern1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN1__A = eINSTANCE.getPatternGenerator__TestPattern1__A();

		/**
		 * The meta object literal for the '<em><b>Test Pattern2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN2__A = eINSTANCE.getPatternGenerator__TestPattern2__A();

		/**
		 * The meta object literal for the '<em><b>Test Pattern3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN3__A = eINSTANCE.getPatternGenerator__TestPattern3__A();

		/**
		 * The meta object literal for the '<em><b>Test Pattern4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN4__A = eINSTANCE.getPatternGenerator__TestPattern4__A();

		/**
		 * The meta object literal for the '<em><b>Test Pattern5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN5__A = eINSTANCE.getPatternGenerator__TestPattern5__A();

		/**
		 * The meta object literal for the '<em><b>Test Pattern6</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN6__A = eINSTANCE.getPatternGenerator__TestPattern6__A();

		/**
		 * The meta object literal for the '<em><b>Test Pattern7</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN7__A = eINSTANCE.getPatternGenerator__TestPattern7__A();

		/**
		 * The meta object literal for the '<em><b>Test Pattern8</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_GENERATOR___TEST_PATTERN8__A = eINSTANCE.getPatternGenerator__TestPattern8__A();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.NacPatternGeneratorImpl <em>Nac Pattern Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.NacPatternGeneratorImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getNacPatternGenerator()
		 * @generated
		 */
		EClass NAC_PATTERN_GENERATOR = eINSTANCE.getNacPatternGenerator();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern1 Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_VALID__A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern1Valid__A();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern1 Invalid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN1_INVALID__A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern1Invalid__A();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern2 Invalid A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_A__A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern2InvalidA__A();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern2 Invalid B</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_B__A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern2InvalidB__A();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern2 Invalid C</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2_INVALID_C__A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern2InvalidC__A();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern2valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN2VALID__C_A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern2valid__C_A();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern4 Invalid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4_INVALID__A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern4Invalid__A();

		/**
		 * The meta object literal for the '<em><b>Instance Test Pattern4valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___INSTANCE_TEST_PATTERN4VALID__A = eINSTANCE
				.getNacPatternGenerator__InstanceTestPattern4valid__A();

		/**
		 * The meta object literal for the '<em><b>Nac Test Pattern1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN1__A = eINSTANCE
				.getNacPatternGenerator__NacTestPattern1__A();

		/**
		 * The meta object literal for the '<em><b>Nac Test Pattern2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN2__C_A = eINSTANCE
				.getNacPatternGenerator__NacTestPattern2__C_A();

		/**
		 * The meta object literal for the '<em><b>Nac Test Pattern3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN3__A = eINSTANCE
				.getNacPatternGenerator__NacTestPattern3__A();

		/**
		 * The meta object literal for the '<em><b>Nac Test Pattern4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAC_PATTERN_GENERATOR___NAC_TEST_PATTERN4__A = eINSTANCE
				.getNacPatternGenerator__NacTestPattern4__A();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.CPATestImpl <em>CPA Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.CPATestImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getCPATest()
		 * @generated
		 */
		EClass CPA_TEST = eINSTANCE.getCPATest();

		/**
		 * The meta object literal for the '<em><b>No Attr Rule2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPA_TEST___NO_ATTR_RULE2__N = eINSTANCE.getCPATest__NoAttrRule2__N();

		/**
		 * The meta object literal for the '<em><b>No Attr Rule1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPA_TEST___NO_ATTR_RULE1__N = eINSTANCE.getCPATest__NoAttrRule1__N();

		/**
		 * The meta object literal for the '<em><b>No Attr Rule3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPA_TEST___NO_ATTR_RULE3__N = eINSTANCE.getCPATest__NoAttrRule3__N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.InitialPushoutTestImpl <em>Initial Pushout Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.InitialPushoutTestImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getInitialPushoutTest()
		 * @generated
		 */
		EClass INITIAL_PUSHOUT_TEST = eINSTANCE.getInitialPushoutTest();

		/**
		 * The meta object literal for the '<em><b>Test Pattern1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_PATTERN1__N = eINSTANCE.getInitialPushoutTest__TestPattern1__N();

		/**
		 * The meta object literal for the '<em><b>Test Model1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_MODEL1__N = eINSTANCE.getInitialPushoutTest__TestModel1__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_PATTERN2__N = eINSTANCE.getInitialPushoutTest__TestPattern2__N();

		/**
		 * The meta object literal for the '<em><b>Test Model2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_MODEL2__N = eINSTANCE.getInitialPushoutTest__TestModel2__N();

		/**
		 * The meta object literal for the '<em><b>Test Rule1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_RULE1__N = eINSTANCE.getInitialPushoutTest__TestRule1__N();

		/**
		 * The meta object literal for the '<em><b>Test Model3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_MODEL3__N = eINSTANCE.getInitialPushoutTest__TestModel3__N();

		/**
		 * The meta object literal for the '<em><b>Test Model4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_MODEL4__N = eINSTANCE.getInitialPushoutTest__TestModel4__N();

		/**
		 * The meta object literal for the '<em><b>Test Rule4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_PUSHOUT_TEST___TEST_RULE4__N = eINSTANCE.getInitialPushoutTest__TestRule4__N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.CPAwithNACTestImpl <em>CP Awith NAC Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.CPAwithNACTestImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getCPAwithNACTest()
		 * @generated
		 */
		EClass CP_AWITH_NAC_TEST = eINSTANCE.getCPAwithNACTest();

		/**
		 * The meta object literal for the '<em><b>Rule1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CP_AWITH_NAC_TEST___RULE1__N = eINSTANCE.getCPAwithNACTest__Rule1__N();

		/**
		 * The meta object literal for the '<em><b>Rule2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CP_AWITH_NAC_TEST___RULE2__N = eINSTANCE.getCPAwithNACTest__Rule2__N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.SymbolicPushoutComplementImpl <em>Symbolic Pushout Complement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.SymbolicPushoutComplementImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getSymbolicPushoutComplement()
		 * @generated
		 */
		EClass SYMBOLIC_PUSHOUT_COMPLEMENT = eINSTANCE.getSymbolicPushoutComplement();

		/**
		 * The meta object literal for the '<em><b>Rule1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMBOLIC_PUSHOUT_COMPLEMENT___RULE1__N = eINSTANCE.getSymbolicPushoutComplement__Rule1__N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.PullbackTestImpl <em>Pullback Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.PullbackTestImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getPullbackTest()
		 * @generated
		 */
		EClass PULLBACK_TEST = eINSTANCE.getPullbackTest();

		/**
		 * The meta object literal for the '<em><b>Test Pattern D</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PULLBACK_TEST___TEST_PATTERN_D__N = eINSTANCE.getPullbackTest__TestPatternD__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern C</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PULLBACK_TEST___TEST_PATTERN_C__N = eINSTANCE.getPullbackTest__TestPatternC__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern B</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PULLBACK_TEST___TEST_PATTERN_B__N = eINSTANCE.getPullbackTest__TestPatternB__N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.DirectDerivationTestCasesImpl <em>Direct Derivation Test Cases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DirectDerivationTestCasesImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getDirectDerivationTestCases()
		 * @generated
		 */
		EClass DIRECT_DERIVATION_TEST_CASES = eINSTANCE.getDirectDerivationTestCases();

		/**
		 * The meta object literal for the '<em><b>Empty Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECT_DERIVATION_TEST_CASES___EMPTY_RULE = eINSTANCE.getDirectDerivationTestCases__EmptyRule();

		/**
		 * The meta object literal for the '<em><b>Test Rule1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECT_DERIVATION_TEST_CASES___TEST_RULE1__M = eINSTANCE
				.getDirectDerivationTestCases__TestRule1__M();

		/**
		 * The meta object literal for the '<em><b>Test Model1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECT_DERIVATION_TEST_CASES___TEST_MODEL1__M = eINSTANCE
				.getDirectDerivationTestCases__TestModel1__M();

		/**
		 * The meta object literal for the '<em><b>Test Model2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECT_DERIVATION_TEST_CASES___TEST_MODEL2__M = eINSTANCE
				.getDirectDerivationTestCases__TestModel2__M();

		/**
		 * The meta object literal for the '<em><b>Test Model3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECT_DERIVATION_TEST_CASES___TEST_MODEL3__M = eINSTANCE
				.getDirectDerivationTestCases__TestModel3__M();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.NormalFormEquivalenceTestPatternsImpl <em>Normal Form Equivalence Test Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.NormalFormEquivalenceTestPatternsImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getNormalFormEquivalenceTestPatterns()
		 * @generated
		 */
		EClass NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS = eINSTANCE.getNormalFormEquivalenceTestPatterns();

		/**
		 * The meta object literal for the '<em><b>Test Pattern1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN1__N_N = eINSTANCE
				.getNormalFormEquivalenceTestPatterns__TestPattern1__N_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN2__N_N = eINSTANCE
				.getNormalFormEquivalenceTestPatterns__TestPattern2__N_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN3__N_N = eINSTANCE
				.getNormalFormEquivalenceTestPatterns__TestPattern3__N_N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NORMAL_FORM_EQUIVALENCE_TEST_PATTERNS___TEST_PATTERN4__N_N = eINSTANCE
				.getNormalFormEquivalenceTestPatterns__TestPattern4__N_N();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.testgen.diachase.impl.MorphismClassTestPatternsImpl <em>Morphism Class Test Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.testgen.diachase.impl.MorphismClassTestPatternsImpl
		 * @see org.moflon.maave.tests.testgen.diachase.impl.DiachasePackageImpl#getMorphismClassTestPatterns()
		 * @generated
		 */
		EClass MORPHISM_CLASS_TEST_PATTERNS = eINSTANCE.getMorphismClassTestPatterns();

		/**
		 * The meta object literal for the '<em><b>Test Pattern1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN1__N = eINSTANCE
				.getMorphismClassTestPatterns__TestPattern1__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN2__N = eINSTANCE
				.getMorphismClassTestPatterns__TestPattern2__N();

		/**
		 * The meta object literal for the '<em><b>Test Pattern3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MORPHISM_CLASS_TEST_PATTERNS___TEST_PATTERN3__N = eINSTANCE
				.getMorphismClassTestPatterns__TestPattern3__N();

	}

} //DiachasePackage
