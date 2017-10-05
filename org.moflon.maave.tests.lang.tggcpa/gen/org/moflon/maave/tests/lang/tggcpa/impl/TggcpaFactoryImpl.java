/**
 */
package org.moflon.maave.tests.lang.tggcpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.maave.tests.lang.tggcpa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TggcpaFactoryImpl extends EFactoryImpl implements TggcpaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TggcpaFactory init() {
		try {
			TggcpaFactory theTggcpaFactory = (TggcpaFactory) EPackage.Registry.INSTANCE
					.getEFactory(TggcpaPackage.eNS_URI);
			if (theTggcpaFactory != null) {
				return theTggcpaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TggcpaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TggcpaFactoryImpl() {
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
		case TggcpaPackage.OBJ:
			return createObj();
		case TggcpaPackage.TRANSL:
			return createTransl();
		case TggcpaPackage.TYPE_A:
			return createTypeA();
		case TggcpaPackage.TYPE_B:
			return createTypeB();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obj createObj() {
		ObjImpl obj = new ObjImpl();
		return obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transl createTransl() {
		TranslImpl transl = new TranslImpl();
		return transl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeA createTypeA() {
		TypeAImpl typeA = new TypeAImpl();
		return typeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeB createTypeB() {
		TypeBImpl typeB = new TypeBImpl();
		return typeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TggcpaPackage getTggcpaPackage() {
		return (TggcpaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TggcpaPackage getPackage() {
		return TggcpaPackage.eINSTANCE;
	}

} //TggcpaFactoryImpl
