/**
 */
package org.moflon.maave.tests.lang.rbac.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.maave.tests.lang.rbac.DsdRelation;
import org.moflon.maave.tests.lang.rbac.NamedElement;
import org.moflon.maave.tests.lang.rbac.Operation;
import org.moflon.maave.tests.lang.rbac.PermSsd;
import org.moflon.maave.tests.lang.rbac.Permission;
import org.moflon.maave.tests.lang.rbac.RbacFactory;
import org.moflon.maave.tests.lang.rbac.RbacPackage;
import org.moflon.maave.tests.lang.rbac.RbacPolicy;
import org.moflon.maave.tests.lang.rbac.Role;
import org.moflon.maave.tests.lang.rbac.Session;
import org.moflon.maave.tests.lang.rbac.SsdRelation;
import org.moflon.maave.tests.lang.rbac.User;
import org.moflon.maave.tests.lang.rbac.UserDefinedConstraints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RbacPackageImpl extends EPackageImpl implements RbacPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssdRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permSsdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsdRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbacPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedConstraintsEClass = null;

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
	 * @see org.moflon.maave.tests.lang.rbac.RbacPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RbacPackageImpl() {
		super(eNS_URI, RbacFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RbacPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RbacPackage init() {
		if (isInited)
			return (RbacPackage) EPackage.Registry.INSTANCE.getEPackage(RbacPackage.eNS_URI);

		// Obtain or create and register package
		RbacPackageImpl theRbacPackage = (RbacPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RbacPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RbacPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRbacPackage.createPackageContents();

		// Initialize created meta-data
		theRbacPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRbacPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RbacPackage.eNS_URI, theRbacPackage);
		return theRbacPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsdRelation() {
		return ssdRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsdRelation_SsdExclusiveRoles() {
		return (EReference) ssdRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_UserSessions() {
		return (EReference) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Roles() {
		return (EReference) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_NrOfSessions() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermSsd() {
		return permSsdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermSsd_Permission() {
		return (EReference) permSsdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDsdRelation() {
		return dsdRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsdRelation_DsdExclusiveRole() {
		return (EReference) dsdRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSession_SessionRoles() {
		return (EReference) sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSession_NrOfActivatedRoles() {
		return (EAttribute) sessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Sessions() {
		return (EReference) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_DsdRelation() {
		return (EReference) roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Users() {
		return (EReference) roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_SsdRelation() {
		return (EReference) roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Permissions() {
		return (EReference) roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_SeniorRoles() {
		return (EReference) roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_JuniorRoles() {
		return (EReference) roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRbacPolicy() {
		return rbacPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRbacPolicy_Permissions() {
		return (EReference) rbacPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRbacPolicy_Roles() {
		return (EReference) rbacPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRbacPolicy_DsdRelations() {
		return (EReference) rbacPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRbacPolicy_Permssd() {
		return (EReference) rbacPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRbacPolicy_Users() {
		return (EReference) rbacPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRbacPolicy_SsdRelation() {
		return (EReference) rbacPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRbacPolicy____validateSSD__Role() {
		return rbacPolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRbacPolicy__AddUserToRole__User_Role() {
		return rbacPolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRbacPolicy____validateDSD__Role() {
		return rbacPolicyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRbacPolicy__ActivateRole__Role_Session_User() {
		return rbacPolicyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRbacPolicy__AddUserToRoleCorrect__Role_User() {
		return rbacPolicyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRbacPolicy__ActivateRole__User_Role_Session() {
		return rbacPolicyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRbacPolicy__CreateSession__User() {
		return rbacPolicyEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Roles() {
		return (EReference) permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Object() {
		return (EReference) permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Operation() {
		return (EReference) permissionEClass.getEStructuralFeatures().get(2);
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
	public EOperation getUserDefinedConstraints___NC_validateSSD__Role() {
		return userDefinedConstraintsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbacFactory getRbacFactory() {
		return (RbacFactory) getEFactoryInstance();
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
		ssdRelationEClass = createEClass(SSD_RELATION);
		createEReference(ssdRelationEClass, SSD_RELATION__SSD_EXCLUSIVE_ROLES);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__USER_SESSIONS);
		createEReference(userEClass, USER__ROLES);
		createEAttribute(userEClass, USER__NR_OF_SESSIONS);

		permSsdEClass = createEClass(PERM_SSD);
		createEReference(permSsdEClass, PERM_SSD__PERMISSION);

		operationEClass = createEClass(OPERATION);

		dsdRelationEClass = createEClass(DSD_RELATION);
		createEReference(dsdRelationEClass, DSD_RELATION__DSD_EXCLUSIVE_ROLE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		sessionEClass = createEClass(SESSION);
		createEReference(sessionEClass, SESSION__SESSION_ROLES);
		createEAttribute(sessionEClass, SESSION__NR_OF_ACTIVATED_ROLES);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__SESSIONS);
		createEReference(roleEClass, ROLE__DSD_RELATION);
		createEReference(roleEClass, ROLE__USERS);
		createEReference(roleEClass, ROLE__SSD_RELATION);
		createEReference(roleEClass, ROLE__PERMISSIONS);
		createEReference(roleEClass, ROLE__SENIOR_ROLES);
		createEReference(roleEClass, ROLE__JUNIOR_ROLES);

		objectEClass = createEClass(OBJECT);

		rbacPolicyEClass = createEClass(RBAC_POLICY);
		createEReference(rbacPolicyEClass, RBAC_POLICY__PERMISSIONS);
		createEReference(rbacPolicyEClass, RBAC_POLICY__ROLES);
		createEReference(rbacPolicyEClass, RBAC_POLICY__DSD_RELATIONS);
		createEReference(rbacPolicyEClass, RBAC_POLICY__PERMSSD);
		createEReference(rbacPolicyEClass, RBAC_POLICY__USERS);
		createEReference(rbacPolicyEClass, RBAC_POLICY__SSD_RELATION);
		createEOperation(rbacPolicyEClass, RBAC_POLICY___VALIDATE_SSD__VALIDATESSD__ROLE);
		createEOperation(rbacPolicyEClass, RBAC_POLICY___ADD_USER_TO_ROLE__USER_ROLE);
		createEOperation(rbacPolicyEClass, RBAC_POLICY___VALIDATE_DSD__VALIDATEDSD__ROLE);
		createEOperation(rbacPolicyEClass, RBAC_POLICY___ACTIVATE_ROLE__ROLE_SESSION_USER);
		createEOperation(rbacPolicyEClass, RBAC_POLICY___ADD_USER_TO_ROLE_CORRECT__ROLE_USER);
		createEOperation(rbacPolicyEClass, RBAC_POLICY___ACTIVATE_ROLE__USER_ROLE_SESSION);
		createEOperation(rbacPolicyEClass, RBAC_POLICY___CREATE_SESSION__USER);

		permissionEClass = createEClass(PERMISSION);
		createEReference(permissionEClass, PERMISSION__ROLES);
		createEReference(permissionEClass, PERMISSION__OBJECT);
		createEReference(permissionEClass, PERMISSION__OPERATION);

		userDefinedConstraintsEClass = createEClass(USER_DEFINED_CONSTRAINTS);
		createEOperation(userDefinedConstraintsEClass, USER_DEFINED_CONSTRAINTS___NC_VALIDATE_SSD__ROLE);
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
		userEClass.getESuperTypes().add(this.getNamedElement());
		operationEClass.getESuperTypes().add(this.getNamedElement());
		roleEClass.getESuperTypes().add(this.getNamedElement());
		objectEClass.getESuperTypes().add(this.getNamedElement());
		permissionEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(ssdRelationEClass, SsdRelation.class, "SsdRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsdRelation_SsdExclusiveRoles(), this.getRole(), this.getRole_SsdRelation(),
				"ssdExclusiveRoles", null, 0, -1, SsdRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_UserSessions(), this.getSession(), null, "userSessions", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Roles(), this.getRole(), this.getRole_Users(), "roles", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_NrOfSessions(), ecorePackage.getEInt(), "nrOfSessions", null, 1, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(permSsdEClass, PermSsd.class, "PermSsd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermSsd_Permission(), this.getPermission(), null, "permission", null, 2, -1, PermSsd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsdRelationEClass, DsdRelation.class, "DsdRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsdRelation_DsdExclusiveRole(), this.getRole(), this.getRole_DsdRelation(),
				"dsdExclusiveRole", null, 0, -1, DsdRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSession_SessionRoles(), this.getRole(), this.getRole_Sessions(), "sessionRoles", null, 0, -1,
				Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_NrOfActivatedRoles(), ecorePackage.getEInt(), "nrOfActivatedRoles", null, 1, 1,
				Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Sessions(), this.getSession(), this.getSession_SessionRoles(), "sessions", null, 0, -1,
				Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_DsdRelation(), this.getDsdRelation(), this.getDsdRelation_DsdExclusiveRole(),
				"dsdRelation", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Users(), this.getUser(), this.getUser_Roles(), "users", null, 0, -1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_SsdRelation(), this.getSsdRelation(), this.getSsdRelation_SsdExclusiveRoles(),
				"ssdRelation", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Permissions(), this.getPermission(), this.getPermission_Roles(), "permissions", null, 0,
				-1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_SeniorRoles(), this.getRole(), this.getRole_JuniorRoles(), "seniorRoles", null, 0, -1,
				Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_JuniorRoles(), this.getRole(), this.getRole_SeniorRoles(), "juniorRoles", null, 0, -1,
				Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, org.moflon.maave.tests.lang.rbac.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rbacPolicyEClass, RbacPolicy.class, "RbacPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRbacPolicy_Permissions(), this.getPermission(), null, "permissions", null, 0, -1,
				RbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRbacPolicy_Roles(), this.getRole(), null, "roles", null, 0, -1, RbacPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRbacPolicy_DsdRelations(), this.getDsdRelation(), null, "dsdRelations", null, 0, -1,
				RbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRbacPolicy_Permssd(), this.getPermSsd(), null, "permssd", null, 0, -1, RbacPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRbacPolicy_Users(), this.getUser(), null, "users", null, 0, -1, RbacPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRbacPolicy_SsdRelation(), this.getSsdRelation(), null, "ssdRelation", null, 0, -1,
				RbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRbacPolicy____validateSSD__Role(), ecorePackage.getEBoolean(),
				"__validateSSD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "roleA", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRbacPolicy__AddUserToRole__User_Role(), null, "addUserToRole", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRbacPolicy____validateDSD__Role(), null, "__validateDSD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "aRoleA", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRbacPolicy__ActivateRole__Role_Session_User(), null, "activateRole", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRbacPolicy__AddUserToRoleCorrect__Role_User(), null, "addUserToRoleCorrect", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRbacPolicy__ActivateRole__User_Role_Session(), null, "activateRole", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSession(), "session", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRbacPolicy__CreateSession__User(), null, "createSession", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermission_Roles(), this.getRole(), this.getRole_Permissions(), "roles", null, 0, -1,
				Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Object(), this.getObject(), null, "object", null, 1, 1, Permission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Operation(), this.getOperation(), null, "operation", null, 1, 1, Permission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedConstraintsEClass, UserDefinedConstraints.class, "UserDefinedConstraints", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getUserDefinedConstraints___NC_validateSSD__Role(), null, "_NC_validateSSD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "roleA", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RbacPackageImpl
