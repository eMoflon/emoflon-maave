/**
 */
package org.moflon.maave.tests.lang.rbac.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RbacFactoryImpl extends EFactoryImpl implements RbacFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RbacFactory init() {
		try {
			RbacFactory theRbacFactory = (RbacFactory) EPackage.Registry.INSTANCE.getEFactory(RbacPackage.eNS_URI);
			if (theRbacFactory != null) {
				return theRbacFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RbacFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbacFactoryImpl() {
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
		case RbacPackage.SSD_RELATION:
			return createSsdRelation();
		case RbacPackage.USER:
			return createUser();
		case RbacPackage.PERM_SSD:
			return createPermSsd();
		case RbacPackage.OPERATION:
			return createOperation();
		case RbacPackage.DSD_RELATION:
			return createDsdRelation();
		case RbacPackage.NAMED_ELEMENT:
			return createNamedElement();
		case RbacPackage.SESSION:
			return createSession();
		case RbacPackage.ROLE:
			return createRole();
		case RbacPackage.OBJECT:
			return createObject();
		case RbacPackage.RBAC_POLICY:
			return createRbacPolicy();
		case RbacPackage.PERMISSION:
			return createPermission();
		case RbacPackage.USER_DEFINED_CONSTRAINTS:
			return createUserDefinedConstraints();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsdRelation createSsdRelation() {
		SsdRelationImpl ssdRelation = new SsdRelationImpl();
		return ssdRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermSsd createPermSsd() {
		PermSsdImpl permSsd = new PermSsdImpl();
		return permSsd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsdRelation createDsdRelation() {
		DsdRelationImpl dsdRelation = new DsdRelationImpl();
		return dsdRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.moflon.maave.tests.lang.rbac.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbacPolicy createRbacPolicy() {
		RbacPolicyImpl rbacPolicy = new RbacPolicyImpl();
		return rbacPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
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
	public RbacPackage getRbacPackage() {
		return (RbacPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RbacPackage getPackage() {
		return RbacPackage.eINSTANCE;
	}

} //RbacFactoryImpl
