/**
 */
package org.moflon.maave.tests.lang.vwxyz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzFactory
 * @model kind="package"
 * @generated
 */
public interface VwxyzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vwxyz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.vwxyz/model/Vwxyz.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.vwxyz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VwxyzPackage eINSTANCE = org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.VImpl <em>V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getV()
	 * @generated
	 */
	int V = 0;

	/**
	 * The feature id for the '<em><b>W</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V__W = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V__X = 1;

	/**
	 * The number of structural features of the '<em>V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.WImpl <em>W</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.WImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getW()
	 * @generated
	 */
	int W = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int W__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int W__Y = 1;

	/**
	 * The number of structural features of the '<em>W</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int W_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>W</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int W_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.XImpl <em>X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.XImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getX()
	 * @generated
	 */
	int X = 2;

	/**
	 * The feature id for the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__Z = 0;

	/**
	 * The number of structural features of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.YImpl <em>Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.YImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getY()
	 * @generated
	 */
	int Y = 3;

	/**
	 * The feature id for the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__W = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.ZImpl <em>Z</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.ZImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getZ()
	 * @generated
	 */
	int Z = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z__PREVIOUS = 1;

	/**
	 * The number of structural features of the '<em>Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.CardinalityConstraintsTestPatternImpl <em>Cardinality Constraints Test Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.CardinalityConstraintsTestPatternImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getCardinalityConstraintsTestPattern()
	 * @generated
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN = 5;

	/**
	 * The number of structural features of the '<em>Cardinality Constraints Test Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Pattern Invalid1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID1__V_V = 0;

	/**
	 * The operation id for the '<em>Test Pattern Invalid2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID2__V = 1;

	/**
	 * The operation id for the '<em>Test Pattern Invalid3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID3__W_W = 2;

	/**
	 * The operation id for the '<em>Test Pattern Invalid4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID4__V = 3;

	/**
	 * The operation id for the '<em>Test Pattern Valid1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_VALID1__V = 4;

	/**
	 * The operation id for the '<em>Test Pattern Invalid5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID5__V = 5;

	/**
	 * The operation id for the '<em>Test Pattern Invalid6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID6__W_W = 6;

	/**
	 * The operation id for the '<em>Test Pattern Invalid7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID7__W_W = 7;

	/**
	 * The number of operations of the '<em>Cardinality Constraints Test Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINTS_TEST_PATTERN_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.UserDefinedConstraintsImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getUserDefinedConstraints()
	 * @generated
	 */
	int USER_DEFINED_CONSTRAINTS = 6;

	/**
	 * The number of structural features of the '<em>User Defined Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>NC Singelton V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_SINGELTON_V__V_V = 0;

	/**
	 * The operation id for the '<em>NC Singelton W</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_SINGELTON_W__W_W = 1;

	/**
	 * The operation id for the '<em>NC smaller5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_SMALLER5__V = 2;

	/**
	 * The number of operations of the '<em>User Defined Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.ConstraintToPostConditionPatternImpl <em>Constraint To Post Condition Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.ConstraintToPostConditionPatternImpl
	 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getConstraintToPostConditionPattern()
	 * @generated
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN = 7;

	/**
	 * The number of structural features of the '<em>Constraint To Post Condition Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Rule1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE1__V = 0;

	/**
	 * The operation id for the '<em>Testpattern1 Inconsistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN1_INCONSISTENT__V = 1;

	/**
	 * The operation id for the '<em>Testpattern2 Inconsistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2_INCONSISTENT__V = 2;

	/**
	 * The operation id for the '<em>Testpattern2consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2CONSISTENT__V = 3;

	/**
	 * The operation id for the '<em>Rule2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE2__V = 4;

	/**
	 * The operation id for the '<em>Testpattern22 Inconsistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_INCONSISTENT__V = 5;

	/**
	 * The operation id for the '<em>Testpattern22 Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_CONSISTENT__V = 6;

	/**
	 * The number of operations of the '<em>Constraint To Post Condition Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TO_POST_CONDITION_PATTERN_OPERATION_COUNT = 7;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.V <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>V</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.V
	 * @generated
	 */
	EClass getV();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.vwxyz.V#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>W</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.V#getW()
	 * @see #getV()
	 * @generated
	 */
	EReference getV_W();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.vwxyz.V#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.V#getX()
	 * @see #getV()
	 * @generated
	 */
	EAttribute getV_X();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.W <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>W</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.W
	 * @generated
	 */
	EClass getW();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.vwxyz.W#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.W#getX()
	 * @see #getW()
	 * @generated
	 */
	EReference getW_X();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.vwxyz.W#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Y</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.W#getY()
	 * @see #getW()
	 * @generated
	 */
	EReference getW_Y();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.X <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.X
	 * @generated
	 */
	EClass getX();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.vwxyz.X#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.X#getZ()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_Z();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.Y <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Y</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.Y
	 * @generated
	 */
	EClass getY();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.vwxyz.Y#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>W</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.Y#getW()
	 * @see #getY()
	 * @generated
	 */
	EReference getY_W();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.vwxyz.Y#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.Y#getNext()
	 * @see #getY()
	 * @generated
	 */
	EReference getY_Next();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.Z <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Z</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.Z
	 * @generated
	 */
	EClass getZ();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.vwxyz.Z#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.Z#getNext()
	 * @see #getZ()
	 * @generated
	 */
	EReference getZ_Next();

	/**
	 * Returns the meta object for the container reference '{@link org.moflon.maave.tests.lang.vwxyz.Z#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.Z#getPrevious()
	 * @see #getZ()
	 * @generated
	 */
	EReference getZ_Previous();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern <em>Cardinality Constraints Test Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Constraints Test Pattern</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern
	 * @generated
	 */
	EClass getCardinalityConstraintsTestPattern();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid1(org.moflon.maave.tests.lang.vwxyz.V, org.moflon.maave.tests.lang.vwxyz.V) <em>Test Pattern Invalid1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Invalid1</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid1(org.moflon.maave.tests.lang.vwxyz.V, org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid1__V_V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid2(org.moflon.maave.tests.lang.vwxyz.V) <em>Test Pattern Invalid2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Invalid2</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid2(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid2__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid3(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W) <em>Test Pattern Invalid3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Invalid3</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid3(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid3__W_W();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid4(org.moflon.maave.tests.lang.vwxyz.V) <em>Test Pattern Invalid4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Invalid4</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid4(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid4__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternValid1(org.moflon.maave.tests.lang.vwxyz.V) <em>Test Pattern Valid1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Valid1</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternValid1(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternValid1__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid5(org.moflon.maave.tests.lang.vwxyz.V) <em>Test Pattern Invalid5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Invalid5</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid5(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid5__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid6(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W) <em>Test Pattern Invalid6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Invalid6</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid6(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid6__W_W();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid7(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W) <em>Test Pattern Invalid7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Pattern Invalid7</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern#testPatternInvalid7(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W)
	 * @generated
	 */
	EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid7__W_W();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints <em>User Defined Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Constraints</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints
	 * @generated
	 */
	EClass getUserDefinedConstraints();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints#_NC_SingeltonV(org.moflon.maave.tests.lang.vwxyz.V, org.moflon.maave.tests.lang.vwxyz.V) <em>NC Singelton V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC Singelton V</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints#_NC_SingeltonV(org.moflon.maave.tests.lang.vwxyz.V, org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_SingeltonV__V_V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints#_NC_SingeltonW(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W) <em>NC Singelton W</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC Singelton W</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints#_NC_SingeltonW(org.moflon.maave.tests.lang.vwxyz.W, org.moflon.maave.tests.lang.vwxyz.W)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_SingeltonW__W_W();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints#_NC_smaller5(org.moflon.maave.tests.lang.vwxyz.V) <em>NC smaller5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC smaller5</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints#_NC_smaller5(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_smaller5__V();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern <em>Constraint To Post Condition Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint To Post Condition Pattern</em>'.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern
	 * @generated
	 */
	EClass getConstraintToPostConditionPattern();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#rule1(org.moflon.maave.tests.lang.vwxyz.V) <em>Rule1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule1</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#rule1(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getConstraintToPostConditionPattern__Rule1__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern1Inconsistent(org.moflon.maave.tests.lang.vwxyz.V) <em>Testpattern1 Inconsistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Testpattern1 Inconsistent</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern1Inconsistent(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getConstraintToPostConditionPattern__Testpattern1Inconsistent__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern2Inconsistent(org.moflon.maave.tests.lang.vwxyz.V) <em>Testpattern2 Inconsistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Testpattern2 Inconsistent</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern2Inconsistent(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getConstraintToPostConditionPattern__Testpattern2Inconsistent__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern2consistent(org.moflon.maave.tests.lang.vwxyz.V) <em>Testpattern2consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Testpattern2consistent</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern2consistent(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getConstraintToPostConditionPattern__Testpattern2consistent__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#rule2(org.moflon.maave.tests.lang.vwxyz.V) <em>Rule2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rule2</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#rule2(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getConstraintToPostConditionPattern__Rule2__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern22Inconsistent(org.moflon.maave.tests.lang.vwxyz.V) <em>Testpattern22 Inconsistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Testpattern22 Inconsistent</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern22Inconsistent(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getConstraintToPostConditionPattern__Testpattern22Inconsistent__V();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern22Consistent(org.moflon.maave.tests.lang.vwxyz.V) <em>Testpattern22 Consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Testpattern22 Consistent</em>' operation.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern#testpattern22Consistent(org.moflon.maave.tests.lang.vwxyz.V)
	 * @generated
	 */
	EOperation getConstraintToPostConditionPattern__Testpattern22Consistent__V();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VwxyzFactory getVwxyzFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.VImpl <em>V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getV()
		 * @generated
		 */
		EClass V = eINSTANCE.getV();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V__W = eINSTANCE.getV_W();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute V__X = eINSTANCE.getV_X();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.WImpl <em>W</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.WImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getW()
		 * @generated
		 */
		EClass W = eINSTANCE.getW();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference W__X = eINSTANCE.getW_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference W__Y = eINSTANCE.getW_Y();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.XImpl <em>X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.XImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getX()
		 * @generated
		 */
		EClass X = eINSTANCE.getX();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__Z = eINSTANCE.getX_Z();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.YImpl <em>Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.YImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getY()
		 * @generated
		 */
		EClass Y = eINSTANCE.getY();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Y__W = eINSTANCE.getY_W();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Y__NEXT = eINSTANCE.getY_Next();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.ZImpl <em>Z</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.ZImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getZ()
		 * @generated
		 */
		EClass Z = eINSTANCE.getZ();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Z__NEXT = eINSTANCE.getZ_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Z__PREVIOUS = eINSTANCE.getZ_Previous();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.CardinalityConstraintsTestPatternImpl <em>Cardinality Constraints Test Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.CardinalityConstraintsTestPatternImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getCardinalityConstraintsTestPattern()
		 * @generated
		 */
		EClass CARDINALITY_CONSTRAINTS_TEST_PATTERN = eINSTANCE.getCardinalityConstraintsTestPattern();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Invalid1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID1__V_V = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternInvalid1__V_V();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Invalid2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID2__V = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternInvalid2__V();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Invalid3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID3__W_W = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternInvalid3__W_W();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Invalid4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID4__V = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternInvalid4__V();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Valid1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_VALID1__V = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternValid1__V();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Invalid5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID5__V = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternInvalid5__V();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Invalid6</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID6__W_W = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternInvalid6__W_W();

		/**
		 * The meta object literal for the '<em><b>Test Pattern Invalid7</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID7__W_W = eINSTANCE
				.getCardinalityConstraintsTestPattern__TestPatternInvalid7__W_W();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.UserDefinedConstraintsImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getUserDefinedConstraints()
		 * @generated
		 */
		EClass USER_DEFINED_CONSTRAINTS = eINSTANCE.getUserDefinedConstraints();

		/**
		 * The meta object literal for the '<em><b>NC Singelton V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_SINGELTON_V__V_V = eINSTANCE
				.getUserDefinedConstraints___NC_SingeltonV__V_V();

		/**
		 * The meta object literal for the '<em><b>NC Singelton W</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_SINGELTON_W__W_W = eINSTANCE
				.getUserDefinedConstraints___NC_SingeltonW__W_W();

		/**
		 * The meta object literal for the '<em><b>NC smaller5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_SMALLER5__V = eINSTANCE.getUserDefinedConstraints___NC_smaller5__V();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.vwxyz.impl.ConstraintToPostConditionPatternImpl <em>Constraint To Post Condition Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.ConstraintToPostConditionPatternImpl
		 * @see org.moflon.maave.tests.lang.vwxyz.impl.VwxyzPackageImpl#getConstraintToPostConditionPattern()
		 * @generated
		 */
		EClass CONSTRAINT_TO_POST_CONDITION_PATTERN = eINSTANCE.getConstraintToPostConditionPattern();

		/**
		 * The meta object literal for the '<em><b>Rule1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE1__V = eINSTANCE
				.getConstraintToPostConditionPattern__Rule1__V();

		/**
		 * The meta object literal for the '<em><b>Testpattern1 Inconsistent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN1_INCONSISTENT__V = eINSTANCE
				.getConstraintToPostConditionPattern__Testpattern1Inconsistent__V();

		/**
		 * The meta object literal for the '<em><b>Testpattern2 Inconsistent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2_INCONSISTENT__V = eINSTANCE
				.getConstraintToPostConditionPattern__Testpattern2Inconsistent__V();

		/**
		 * The meta object literal for the '<em><b>Testpattern2consistent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2CONSISTENT__V = eINSTANCE
				.getConstraintToPostConditionPattern__Testpattern2consistent__V();

		/**
		 * The meta object literal for the '<em><b>Rule2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE2__V = eINSTANCE
				.getConstraintToPostConditionPattern__Rule2__V();

		/**
		 * The meta object literal for the '<em><b>Testpattern22 Inconsistent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_INCONSISTENT__V = eINSTANCE
				.getConstraintToPostConditionPattern__Testpattern22Inconsistent__V();

		/**
		 * The meta object literal for the '<em><b>Testpattern22 Consistent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_CONSISTENT__V = eINSTANCE
				.getConstraintToPostConditionPattern__Testpattern22Consistent__V();

	}

} //VwxyzPackage
