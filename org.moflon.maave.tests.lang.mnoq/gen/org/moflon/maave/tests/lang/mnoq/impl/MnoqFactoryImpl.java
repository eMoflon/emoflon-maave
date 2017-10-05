/**
 */
package org.moflon.maave.tests.lang.mnoq.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.maave.tests.lang.mnoq.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MnoqFactoryImpl extends EFactoryImpl implements MnoqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MnoqFactory init() {
		try {
			MnoqFactory theMnoqFactory = (MnoqFactory) EPackage.Registry.INSTANCE.getEFactory(MnoqPackage.eNS_URI);
			if (theMnoqFactory != null) {
				return theMnoqFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MnoqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MnoqFactoryImpl() {
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
		case MnoqPackage.FOO:
			return createFoo();
		case MnoqPackage.O:
			return createO();
		case MnoqPackage.Q:
			return createQ();
		case MnoqPackage.N:
			return createN();
		case MnoqPackage.M:
			return createM();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo createFoo() {
		FooImpl foo = new FooImpl();
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public O createO() {
		OImpl o = new OImpl();
		return o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q createQ() {
		QImpl q = new QImpl();
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public N createN() {
		NImpl n = new NImpl();
		return n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M createM() {
		MImpl m = new MImpl();
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MnoqPackage getMnoqPackage() {
		return (MnoqPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MnoqPackage getPackage() {
		return MnoqPackage.eINSTANCE;
	}

} //MnoqFactoryImpl
