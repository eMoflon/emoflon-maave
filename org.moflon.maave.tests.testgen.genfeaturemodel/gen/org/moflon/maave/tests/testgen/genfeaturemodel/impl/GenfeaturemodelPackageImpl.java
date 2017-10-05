/**
 */
package org.moflon.maave.tests.testgen.genfeaturemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage;

import org.moflon.maave.tests.testgen.genfeaturemodel.GenfeaturemodelFactory;
import org.moflon.maave.tests.testgen.genfeaturemodel.GenfeaturemodelPackage;
import org.moflon.maave.tests.testgen.genfeaturemodel.Rules;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenfeaturemodelPackageImpl extends EPackageImpl implements GenfeaturemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesEClass = null;

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
	 * @see org.moflon.maave.tests.testgen.genfeaturemodel.GenfeaturemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenfeaturemodelPackageImpl() {
		super(eNS_URI, GenfeaturemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenfeaturemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenfeaturemodelPackage init() {
		if (isInited)
			return (GenfeaturemodelPackage) EPackage.Registry.INSTANCE.getEPackage(GenfeaturemodelPackage.eNS_URI);

		// Obtain or create and register package
		GenfeaturemodelPackageImpl theGenfeaturemodelPackage = (GenfeaturemodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GenfeaturemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GenfeaturemodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FeaturemodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGenfeaturemodelPackage.createPackageContents();

		// Initialize created meta-data
		theGenfeaturemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenfeaturemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenfeaturemodelPackage.eNS_URI, theGenfeaturemodelPackage);
		return theGenfeaturemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRules() {
		return rulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRules__RuleA__Feature() {
		return rulesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRules__RuleB__Feature() {
		return rulesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRules__RuleC__Feature() {
		return rulesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRules__RuleA2__Feature() {
		return rulesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRules__RuleB2__Feature() {
		return rulesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRules__RuleC2__Feature() {
		return rulesEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenfeaturemodelFactory getGenfeaturemodelFactory() {
		return (GenfeaturemodelFactory) getEFactoryInstance();
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
		rulesEClass = createEClass(RULES);
		createEOperation(rulesEClass, RULES___RULE_A__FEATURE);
		createEOperation(rulesEClass, RULES___RULE_B__FEATURE);
		createEOperation(rulesEClass, RULES___RULE_C__FEATURE);
		createEOperation(rulesEClass, RULES___RULE_A2__FEATURE);
		createEOperation(rulesEClass, RULES___RULE_B2__FEATURE);
		createEOperation(rulesEClass, RULES___RULE_C2__FEATURE);
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

		// Obtain other dependent packages
		FeaturemodelPackage theFeaturemodelPackage = (FeaturemodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(FeaturemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getRules__RuleA__Feature(), null, "ruleA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFeaturemodelPackage.getFeature(), "f1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRules__RuleB__Feature(), null, "ruleB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFeaturemodelPackage.getFeature(), "fx", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRules__RuleC__Feature(), null, "ruleC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFeaturemodelPackage.getFeature(), "fy", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRules__RuleA2__Feature(), null, "ruleA2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFeaturemodelPackage.getFeature(), "f1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRules__RuleB2__Feature(), null, "ruleB2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFeaturemodelPackage.getFeature(), "fx", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRules__RuleC2__Feature(), null, "ruleC2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFeaturemodelPackage.getFeature(), "fy", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GenfeaturemodelPackageImpl
