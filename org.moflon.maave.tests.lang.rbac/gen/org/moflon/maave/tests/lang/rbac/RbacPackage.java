/**
 */
package org.moflon.maave.tests.lang.rbac;

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
 * @see org.moflon.maave.tests.lang.rbac.RbacFactory
 * @model kind="package"
 * @generated
 */
public interface RbacPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rbac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.rbac/model/Rbac.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.rbac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RbacPackage eINSTANCE = org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.SsdRelationImpl <em>Ssd Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.SsdRelationImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getSsdRelation()
	 * @generated
	 */
	int SSD_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Ssd Exclusive Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSD_RELATION__SSD_EXCLUSIVE_ROLES = 0;

	/**
	 * The number of structural features of the '<em>Ssd Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSD_RELATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ssd Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSD_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.NamedElementImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.UserImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>User Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_SESSIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nr Of Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NR_OF_SESSIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.PermSsdImpl <em>Perm Ssd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.PermSsdImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getPermSsd()
	 * @generated
	 */
	int PERM_SSD = 2;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERM_SSD__PERMISSION = 0;

	/**
	 * The number of structural features of the '<em>Perm Ssd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERM_SSD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Perm Ssd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERM_SSD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.OperationImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.DsdRelationImpl <em>Dsd Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.DsdRelationImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getDsdRelation()
	 * @generated
	 */
	int DSD_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Dsd Exclusive Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSD_RELATION__DSD_EXCLUSIVE_ROLE = 0;

	/**
	 * The number of structural features of the '<em>Dsd Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSD_RELATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dsd Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSD_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.SessionImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 6;

	/**
	 * The feature id for the '<em><b>Session Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SESSION_ROLES = 0;

	/**
	 * The feature id for the '<em><b>Nr Of Activated Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__NR_OF_ACTIVATED_ROLES = 1;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.RoleImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SESSIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dsd Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DSD_RELATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__USERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ssd Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SSD_RELATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Senior Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SENIOR_ROLES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Junior Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__JUNIOR_ROLES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.ObjectImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getRbacPolicy()
	 * @generated
	 */
	int RBAC_POLICY = 9;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY__PERMISSIONS = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Dsd Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY__DSD_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Permssd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY__PERMSSD = 3;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY__USERS = 4;

	/**
	 * The feature id for the '<em><b>Ssd Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY__SSD_RELATION = 5;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>validate SSD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY___VALIDATE_SSD__VALIDATESSD__ROLE = 0;

	/**
	 * The operation id for the '<em>Add User To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY___ADD_USER_TO_ROLE__USER_ROLE = 1;

	/**
	 * The operation id for the '<em>validate DSD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY___VALIDATE_DSD__VALIDATEDSD__ROLE = 2;

	/**
	 * The operation id for the '<em>Activate Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY___ACTIVATE_ROLE__ROLE_SESSION_USER = 3;

	/**
	 * The operation id for the '<em>Add User To Role Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY___ADD_USER_TO_ROLE_CORRECT__ROLE_USER = 4;

	/**
	 * The operation id for the '<em>Activate Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY___ACTIVATE_ROLE__USER_ROLE_SESSION = 5;

	/**
	 * The operation id for the '<em>Create Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY___CREATE_SESSION__USER = 6;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_POLICY_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.PermissionImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ROLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OBJECT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.rbac.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.rbac.impl.UserDefinedConstraintsImpl
	 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getUserDefinedConstraints()
	 * @generated
	 */
	int USER_DEFINED_CONSTRAINTS = 11;

	/**
	 * The number of structural features of the '<em>User Defined Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>NC validate SSD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS___NC_VALIDATE_SSD__ROLE = 0;

	/**
	 * The number of operations of the '<em>User Defined Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CONSTRAINTS_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.SsdRelation <em>Ssd Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssd Relation</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.SsdRelation
	 * @generated
	 */
	EClass getSsdRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.SsdRelation#getSsdExclusiveRoles <em>Ssd Exclusive Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ssd Exclusive Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.SsdRelation#getSsdExclusiveRoles()
	 * @see #getSsdRelation()
	 * @generated
	 */
	EReference getSsdRelation_SsdExclusiveRoles();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.rbac.User#getUserSessions <em>User Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Sessions</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.User#getUserSessions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserSessions();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.User#getRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Roles();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.rbac.User#getNrOfSessions <em>Nr Of Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Sessions</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.User#getNrOfSessions()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_NrOfSessions();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.PermSsd <em>Perm Ssd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perm Ssd</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.PermSsd
	 * @generated
	 */
	EClass getPermSsd();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.PermSsd#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permission</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.PermSsd#getPermission()
	 * @see #getPermSsd()
	 * @generated
	 */
	EReference getPermSsd_Permission();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.DsdRelation <em>Dsd Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsd Relation</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.DsdRelation
	 * @generated
	 */
	EClass getDsdRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.DsdRelation#getDsdExclusiveRole <em>Dsd Exclusive Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dsd Exclusive Role</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.DsdRelation#getDsdExclusiveRole()
	 * @see #getDsdRelation()
	 * @generated
	 */
	EReference getDsdRelation_DsdExclusiveRole();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.rbac.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Session#getSessionRoles <em>Session Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Session Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Session#getSessionRoles()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_SessionRoles();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.rbac.Session#getNrOfActivatedRoles <em>Nr Of Activated Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Activated Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Session#getNrOfActivatedRoles()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_NrOfActivatedRoles();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Role#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sessions</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role#getSessions()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Sessions();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Role#getDsdRelation <em>Dsd Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dsd Relation</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role#getDsdRelation()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_DsdRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Role#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role#getUsers()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Users();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Role#getSsdRelation <em>Ssd Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ssd Relation</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role#getSsdRelation()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SsdRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role#getPermissions()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Role#getSeniorRoles <em>Senior Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Senior Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role#getSeniorRoles()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SeniorRoles();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Role#getJuniorRoles <em>Junior Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Junior Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Role#getJuniorRoles()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_JuniorRoles();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy
	 * @generated
	 */
	EClass getRbacPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#getPermissions()
	 * @see #getRbacPolicy()
	 * @generated
	 */
	EReference getRbacPolicy_Permissions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#getRoles()
	 * @see #getRbacPolicy()
	 * @generated
	 */
	EReference getRbacPolicy_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getDsdRelations <em>Dsd Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsd Relations</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#getDsdRelations()
	 * @see #getRbacPolicy()
	 * @generated
	 */
	EReference getRbacPolicy_DsdRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getPermssd <em>Permssd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permssd</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#getPermssd()
	 * @see #getRbacPolicy()
	 * @generated
	 */
	EReference getRbacPolicy_Permssd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#getUsers()
	 * @see #getRbacPolicy()
	 * @generated
	 */
	EReference getRbacPolicy_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#getSsdRelation <em>Ssd Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ssd Relation</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#getSsdRelation()
	 * @see #getRbacPolicy()
	 * @generated
	 */
	EReference getRbacPolicy_SsdRelation();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#__validateSSD(org.moflon.maave.tests.lang.rbac.Role) <em>validate SSD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>validate SSD</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#__validateSSD(org.moflon.maave.tests.lang.rbac.Role)
	 * @generated
	 */
	EOperation getRbacPolicy____validateSSD__Role();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#addUserToRole(org.moflon.maave.tests.lang.rbac.User, org.moflon.maave.tests.lang.rbac.Role) <em>Add User To Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add User To Role</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#addUserToRole(org.moflon.maave.tests.lang.rbac.User, org.moflon.maave.tests.lang.rbac.Role)
	 * @generated
	 */
	EOperation getRbacPolicy__AddUserToRole__User_Role();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#__validateDSD(org.moflon.maave.tests.lang.rbac.Role) <em>validate DSD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>validate DSD</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#__validateDSD(org.moflon.maave.tests.lang.rbac.Role)
	 * @generated
	 */
	EOperation getRbacPolicy____validateDSD__Role();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#activateRole(org.moflon.maave.tests.lang.rbac.Role, org.moflon.maave.tests.lang.rbac.Session, org.moflon.maave.tests.lang.rbac.User) <em>Activate Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate Role</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#activateRole(org.moflon.maave.tests.lang.rbac.Role, org.moflon.maave.tests.lang.rbac.Session, org.moflon.maave.tests.lang.rbac.User)
	 * @generated
	 */
	EOperation getRbacPolicy__ActivateRole__Role_Session_User();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#addUserToRoleCorrect(org.moflon.maave.tests.lang.rbac.Role, org.moflon.maave.tests.lang.rbac.User) <em>Add User To Role Correct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add User To Role Correct</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#addUserToRoleCorrect(org.moflon.maave.tests.lang.rbac.Role, org.moflon.maave.tests.lang.rbac.User)
	 * @generated
	 */
	EOperation getRbacPolicy__AddUserToRoleCorrect__Role_User();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#activateRole(org.moflon.maave.tests.lang.rbac.User, org.moflon.maave.tests.lang.rbac.Role, org.moflon.maave.tests.lang.rbac.Session) <em>Activate Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate Role</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#activateRole(org.moflon.maave.tests.lang.rbac.User, org.moflon.maave.tests.lang.rbac.Role, org.moflon.maave.tests.lang.rbac.Session)
	 * @generated
	 */
	EOperation getRbacPolicy__ActivateRole__User_Role_Session();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.RbacPolicy#createSession(org.moflon.maave.tests.lang.rbac.User) <em>Create Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Session</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.RbacPolicy#createSession(org.moflon.maave.tests.lang.rbac.User)
	 * @generated
	 */
	EOperation getRbacPolicy__CreateSession__User();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.rbac.Permission#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Permission#getRoles()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.rbac.Permission#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Permission#getObject()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Object();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.rbac.Permission#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.Permission#getOperation()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Operation();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.rbac.UserDefinedConstraints <em>User Defined Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Constraints</em>'.
	 * @see org.moflon.maave.tests.lang.rbac.UserDefinedConstraints
	 * @generated
	 */
	EClass getUserDefinedConstraints();

	/**
	 * Returns the meta object for the '{@link org.moflon.maave.tests.lang.rbac.UserDefinedConstraints#_NC_validateSSD(org.moflon.maave.tests.lang.rbac.Role) <em>NC validate SSD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>NC validate SSD</em>' operation.
	 * @see org.moflon.maave.tests.lang.rbac.UserDefinedConstraints#_NC_validateSSD(org.moflon.maave.tests.lang.rbac.Role)
	 * @generated
	 */
	EOperation getUserDefinedConstraints___NC_validateSSD__Role();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RbacFactory getRbacFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.SsdRelationImpl <em>Ssd Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.SsdRelationImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getSsdRelation()
		 * @generated
		 */
		EClass SSD_RELATION = eINSTANCE.getSsdRelation();

		/**
		 * The meta object literal for the '<em><b>Ssd Exclusive Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSD_RELATION__SSD_EXCLUSIVE_ROLES = eINSTANCE.getSsdRelation_SsdExclusiveRoles();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.UserImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_SESSIONS = eINSTANCE.getUser_UserSessions();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLES = eINSTANCE.getUser_Roles();

		/**
		 * The meta object literal for the '<em><b>Nr Of Sessions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NR_OF_SESSIONS = eINSTANCE.getUser_NrOfSessions();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.PermSsdImpl <em>Perm Ssd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.PermSsdImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getPermSsd()
		 * @generated
		 */
		EClass PERM_SSD = eINSTANCE.getPermSsd();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERM_SSD__PERMISSION = eINSTANCE.getPermSsd_Permission();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.OperationImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.DsdRelationImpl <em>Dsd Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.DsdRelationImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getDsdRelation()
		 * @generated
		 */
		EClass DSD_RELATION = eINSTANCE.getDsdRelation();

		/**
		 * The meta object literal for the '<em><b>Dsd Exclusive Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSD_RELATION__DSD_EXCLUSIVE_ROLE = eINSTANCE.getDsdRelation_DsdExclusiveRole();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.NamedElementImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.SessionImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Session Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__SESSION_ROLES = eINSTANCE.getSession_SessionRoles();

		/**
		 * The meta object literal for the '<em><b>Nr Of Activated Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__NR_OF_ACTIVATED_ROLES = eINSTANCE.getSession_NrOfActivatedRoles();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.RoleImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SESSIONS = eINSTANCE.getRole_Sessions();

		/**
		 * The meta object literal for the '<em><b>Dsd Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DSD_RELATION = eINSTANCE.getRole_DsdRelation();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__USERS = eINSTANCE.getRole_Users();

		/**
		 * The meta object literal for the '<em><b>Ssd Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SSD_RELATION = eINSTANCE.getRole_SsdRelation();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

		/**
		 * The meta object literal for the '<em><b>Senior Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SENIOR_ROLES = eINSTANCE.getRole_SeniorRoles();

		/**
		 * The meta object literal for the '<em><b>Junior Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__JUNIOR_ROLES = eINSTANCE.getRole_JuniorRoles();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.ObjectImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPolicyImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getRbacPolicy()
		 * @generated
		 */
		EClass RBAC_POLICY = eINSTANCE.getRbacPolicy();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_POLICY__PERMISSIONS = eINSTANCE.getRbacPolicy_Permissions();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_POLICY__ROLES = eINSTANCE.getRbacPolicy_Roles();

		/**
		 * The meta object literal for the '<em><b>Dsd Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_POLICY__DSD_RELATIONS = eINSTANCE.getRbacPolicy_DsdRelations();

		/**
		 * The meta object literal for the '<em><b>Permssd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_POLICY__PERMSSD = eINSTANCE.getRbacPolicy_Permssd();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_POLICY__USERS = eINSTANCE.getRbacPolicy_Users();

		/**
		 * The meta object literal for the '<em><b>Ssd Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_POLICY__SSD_RELATION = eINSTANCE.getRbacPolicy_SsdRelation();

		/**
		 * The meta object literal for the '<em><b>validate SSD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_POLICY___VALIDATE_SSD__VALIDATESSD__ROLE = eINSTANCE.getRbacPolicy____validateSSD__Role();

		/**
		 * The meta object literal for the '<em><b>Add User To Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_POLICY___ADD_USER_TO_ROLE__USER_ROLE = eINSTANCE.getRbacPolicy__AddUserToRole__User_Role();

		/**
		 * The meta object literal for the '<em><b>validate DSD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_POLICY___VALIDATE_DSD__VALIDATEDSD__ROLE = eINSTANCE.getRbacPolicy____validateDSD__Role();

		/**
		 * The meta object literal for the '<em><b>Activate Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_POLICY___ACTIVATE_ROLE__ROLE_SESSION_USER = eINSTANCE
				.getRbacPolicy__ActivateRole__Role_Session_User();

		/**
		 * The meta object literal for the '<em><b>Add User To Role Correct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_POLICY___ADD_USER_TO_ROLE_CORRECT__ROLE_USER = eINSTANCE
				.getRbacPolicy__AddUserToRoleCorrect__Role_User();

		/**
		 * The meta object literal for the '<em><b>Activate Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_POLICY___ACTIVATE_ROLE__USER_ROLE_SESSION = eINSTANCE
				.getRbacPolicy__ActivateRole__User_Role_Session();

		/**
		 * The meta object literal for the '<em><b>Create Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_POLICY___CREATE_SESSION__USER = eINSTANCE.getRbacPolicy__CreateSession__User();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.PermissionImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ROLES = eINSTANCE.getPermission_Roles();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OBJECT = eINSTANCE.getPermission_Object();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OPERATION = eINSTANCE.getPermission_Operation();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.rbac.impl.UserDefinedConstraintsImpl <em>User Defined Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.rbac.impl.UserDefinedConstraintsImpl
		 * @see org.moflon.maave.tests.lang.rbac.impl.RbacPackageImpl#getUserDefinedConstraints()
		 * @generated
		 */
		EClass USER_DEFINED_CONSTRAINTS = eINSTANCE.getUserDefinedConstraints();

		/**
		 * The meta object literal for the '<em><b>NC validate SSD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DEFINED_CONSTRAINTS___NC_VALIDATE_SSD__ROLE = eINSTANCE
				.getUserDefinedConstraints___NC_validateSSD__Role();

	}

} //RbacPackage
