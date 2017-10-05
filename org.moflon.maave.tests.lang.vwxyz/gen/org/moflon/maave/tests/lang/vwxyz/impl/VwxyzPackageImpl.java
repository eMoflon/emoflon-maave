/**
 */
package org.moflon.maave.tests.lang.vwxyz.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern;
import org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern;
import org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints;
import org.moflon.maave.tests.lang.vwxyz.VwxyzFactory;
import org.moflon.maave.tests.lang.vwxyz.VwxyzPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VwxyzPackageImpl extends EPackageImpl implements VwxyzPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityConstraintsTestPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintToPostConditionPatternEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VwxyzPackageImpl() {
		super(eNS_URI, VwxyzFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VwxyzPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VwxyzPackage init() {
		if (isInited)
			return (VwxyzPackage) EPackage.Registry.INSTANCE.getEPackage(VwxyzPackage.eNS_URI);

		// Obtain or create and register package
		VwxyzPackageImpl theVwxyzPackage = (VwxyzPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof VwxyzPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new VwxyzPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVwxyzPackage.createPackageContents();

		// Initialize created meta-data
		theVwxyzPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVwxyzPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VwxyzPackage.eNS_URI, theVwxyzPackage);
		return theVwxyzPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getV() {
		return vEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getV_W() {
		return (EReference) vEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getV_X() {
		return (EAttribute) vEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getW() {
		return wEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getW_X() {
		return (EReference) wEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getW_Y() {
		return (EReference) wEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX() {
		return xEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getX_Z() {
		return (EReference) xEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getY() {
		return yEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getY_W() {
		return (EReference) yEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getY_Next() {
		return (EReference) yEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZ() {
		return zEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZ_Next() {
		return (EReference) zEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZ_Previous() {
		return (EReference) zEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityConstraintsTestPattern() {
		return cardinalityConstraintsTestPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid1__V_V() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid2__V() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid3__W_W() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid4__V() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternValid1__V() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid5__V() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid6__W_W() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardinalityConstraintsTestPattern__TestPatternInvalid7__W_W() {
		return cardinalityConstraintsTestPatternEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedConstraints() {
		return userDefinedConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_SingeltonV__V_V() {
		return userDefinedConstraintsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_SingeltonW__W_W() {
		return userDefinedConstraintsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserDefinedConstraints___NC_smaller5__V() {
		return userDefinedConstraintsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintToPostConditionPattern() {
		return constraintToPostConditionPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraintToPostConditionPattern__Rule1__V() {
		return constraintToPostConditionPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraintToPostConditionPattern__Testpattern1Inconsistent__V() {
		return constraintToPostConditionPatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraintToPostConditionPattern__Testpattern2Inconsistent__V() {
		return constraintToPostConditionPatternEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraintToPostConditionPattern__Testpattern2consistent__V() {
		return constraintToPostConditionPatternEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraintToPostConditionPattern__Rule2__V() {
		return constraintToPostConditionPatternEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraintToPostConditionPattern__Testpattern22Inconsistent__V() {
		return constraintToPostConditionPatternEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraintToPostConditionPattern__Testpattern22Consistent__V() {
		return constraintToPostConditionPatternEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VwxyzFactory getVwxyzFactory() {
		return (VwxyzFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		vEClass = createEClass(V);
		createEReference(vEClass, V__W);
		createEAttribute(vEClass, V__X);

		wEClass = createEClass(W);
		createEReference(wEClass, W__X);
		createEReference(wEClass, W__Y);

		xEClass = createEClass(X);
		createEReference(xEClass, X__Z);

		yEClass = createEClass(Y);
		createEReference(yEClass, Y__W);
		createEReference(yEClass, Y__NEXT);

		zEClass = createEClass(Z);
		createEReference(zEClass, Z__NEXT);
		createEReference(zEClass, Z__PREVIOUS);

		cardinalityConstraintsTestPatternEClass = createEClass(CARDINALITY_CONSTRAINTS_TEST_PATTERN);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID1__V_V);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID2__V);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID3__W_W);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID4__V);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_VALID1__V);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID5__V);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID6__W_W);
		createEOperation(cardinalityConstraintsTestPatternEClass,
				CARDINALITY_CONSTRAINTS_TEST_PATTERN___TEST_PATTERN_INVALID7__W_W);

		userDefinedConstraintsEClass = createEClass(USER_DEFINED_CONSTRAINTS);
		createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_SINGELTON_V__V_V);
		createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_SINGELTON_W__W_W);
		createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_SMALLER5__V);

		constraintToPostConditionPatternEClass = createEClass(CONSTRAINT_TO_POST_CONDITION_PATTERN);
		createEOperation(constraintToPostConditionPatternEClass, CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE1__V);
		createEOperation(constraintToPostConditionPatternEClass,
				CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN1_INCONSISTENT__V);
		createEOperation(constraintToPostConditionPatternEClass,
				CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2_INCONSISTENT__V);
		createEOperation(constraintToPostConditionPatternEClass,
				CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN2CONSISTENT__V);
		createEOperation(constraintToPostConditionPatternEClass, CONSTRAINT_TO_POST_CONDITION_PATTERN___RULE2__V);
		createEOperation(constraintToPostConditionPatternEClass,
				CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_INCONSISTENT__V);
		createEOperation(constraintToPostConditionPatternEClass,
				CONSTRAINT_TO_POST_CONDITION_PATTERN___TESTPATTERN22_CONSISTENT__V);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(vEClass, org.moflon.maave.tests.lang.vwxyz.V.class, "V", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getV_W(), this.getW(), null, "w", null, 0, -1, org.moflon.maave.tests.lang.vwxyz.V.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getV_X(), ecorePackage.getEInt(), "x", null, 1, 1, org.moflon.maave.tests.lang.vwxyz.V.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(wEClass, org.moflon.maave.tests.lang.vwxyz.W.class, "W", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getW_X(), this.getX(), null, "x", null, 0, 1, org.moflon.maave.tests.lang.vwxyz.W.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getW_Y(), this.getY(), this.getY_W(), "y", null, 0, -1,
				org.moflon.maave.tests.lang.vwxyz.W.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xEClass, org.moflon.maave.tests.lang.vwxyz.X.class, "X", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getX_Z(), this.getZ(), null, "z", null, 0, 1, org.moflon.maave.tests.lang.vwxyz.X.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEClass, org.moflon.maave.tests.lang.vwxyz.Y.class, "Y", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getY_W(), this.getW(), this.getW_Y(), "w", null, 0, 1, org.moflon.maave.tests.lang.vwxyz.Y.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getY_Next(), this.getY(), null, "next", null, 0, 1, org.moflon.maave.tests.lang.vwxyz.Y.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zEClass, org.moflon.maave.tests.lang.vwxyz.Z.class, "Z", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZ_Next(), this.getZ(), this.getZ_Previous(), "next", null, 0, 1,
				org.moflon.maave.tests.lang.vwxyz.Z.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZ_Previous(), this.getZ(), this.getZ_Next(), "previous", null, 0, 1,
				org.moflon.maave.tests.lang.vwxyz.Z.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityConstraintsTestPatternEClass, CardinalityConstraintsTestPattern.class,
				"CardinalityConstraintsTestPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternInvalid1__V_V(), null,
				"testPatternInvalid1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternInvalid2__V(), null, "testPatternInvalid2",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternInvalid3__W_W(), null,
				"testPatternInvalid3", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getW(), "w1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getW(), "w2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternInvalid4__V(), null, "testPatternInvalid4",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternValid1__V(), null, "testPatternValid1", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternInvalid5__V(), null, "testPatternInvalid5",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternInvalid6__W_W(), null,
				"testPatternInvalid6", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getW(), "w1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getW(), "w2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCardinalityConstraintsTestPattern__TestPatternInvalid7__W_W(), null,
				"testPatternInvalid7", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getW(), "w1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getW(), "w2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userDefinedConstraintsEClass, UserDefinedConstraints.class, "UserDefinedConstraints", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getUserDefinedConstraints___NC_SingeltonV__V_V(), null, "_NC_SingeltonV", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getV(), "v2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserDefinedConstraints___NC_SingeltonW__W_W(), null, "_NC_SingeltonW", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getW(), "w2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getW(), "w1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserDefinedConstraints___NC_smaller5__V(), null, "_NC_smaller5", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constraintToPostConditionPatternEClass, ConstraintToPostConditionPattern.class,
				"ConstraintToPostConditionPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getConstraintToPostConditionPattern__Rule1__V(), null, "rule1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraintToPostConditionPattern__Testpattern1Inconsistent__V(), null,
				"testpattern1Inconsistent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraintToPostConditionPattern__Testpattern2Inconsistent__V(), null,
				"testpattern2Inconsistent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraintToPostConditionPattern__Testpattern2consistent__V(), null,
				"testpattern2consistent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraintToPostConditionPattern__Rule2__V(), null, "rule2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraintToPostConditionPattern__Testpattern22Inconsistent__V(), null,
				"testpattern22Inconsistent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraintToPostConditionPattern__Testpattern22Consistent__V(), null,
				"testpattern22Consistent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getV(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VwxyzPackageImpl
