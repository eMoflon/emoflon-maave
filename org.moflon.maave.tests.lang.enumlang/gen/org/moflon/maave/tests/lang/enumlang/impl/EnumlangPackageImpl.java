/**
 */
package org.moflon.maave.tests.lang.enumlang.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.maave.tests.lang.enumlang.EnumlangFactory;
import org.moflon.maave.tests.lang.enumlang.EnumlangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumlangPackageImpl extends EPackageImpl implements EnumlangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

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
	 * @see org.moflon.maave.tests.lang.enumlang.EnumlangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumlangPackageImpl() {
		super(eNS_URI, EnumlangFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumlangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumlangPackage init() {
		if (isInited)
			return (EnumlangPackage) EPackage.Registry.INSTANCE.getEPackage(EnumlangPackage.eNS_URI);

		// Obtain or create and register package
		EnumlangPackageImpl theEnumlangPackage = (EnumlangPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EnumlangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new EnumlangPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEnumlangPackage.createPackageContents();

		// Initialize created meta-data
		theEnumlangPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumlangPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumlangPackage.eNS_URI, theEnumlangPackage);
		return theEnumlangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE() {
		return eEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getE_Level() {
		return (EAttribute) eEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLEVEL() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumlangFactory getEnumlangFactory() {
		return (EnumlangFactory) getEFactoryInstance();
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
		eEClass = createEClass(E);
		createEAttribute(eEClass, E__LEVEL);

		// Create enums
		levelEEnum = createEEnum(LEVEL);
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
		initEClass(eEClass, org.moflon.maave.tests.lang.enumlang.E.class, "E", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getE_Level(), this.getLEVEL(), "level", null, 0, 1, org.moflon.maave.tests.lang.enumlang.E.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(levelEEnum, org.moflon.maave.tests.lang.enumlang.LEVEL.class, "LEVEL");
		addEEnumLiteral(levelEEnum, org.moflon.maave.tests.lang.enumlang.LEVEL.LOW);
		addEEnumLiteral(levelEEnum, org.moflon.maave.tests.lang.enumlang.LEVEL.HIGH);

		// Create resource
		createResource(eNS_URI);
	}

} //EnumlangPackageImpl
