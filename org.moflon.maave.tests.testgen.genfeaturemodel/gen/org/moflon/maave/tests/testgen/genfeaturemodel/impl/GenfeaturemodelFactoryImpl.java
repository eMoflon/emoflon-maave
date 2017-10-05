/**
 */
package org.moflon.maave.tests.testgen.genfeaturemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.maave.tests.testgen.genfeaturemodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenfeaturemodelFactoryImpl extends EFactoryImpl implements GenfeaturemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenfeaturemodelFactory init() {
		try {
			GenfeaturemodelFactory theGenfeaturemodelFactory = (GenfeaturemodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(GenfeaturemodelPackage.eNS_URI);
			if (theGenfeaturemodelFactory != null) {
				return theGenfeaturemodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenfeaturemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenfeaturemodelFactoryImpl() {
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
		case GenfeaturemodelPackage.RULES:
			return createRules();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rules createRules() {
		RulesImpl rules = new RulesImpl();
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenfeaturemodelPackage getGenfeaturemodelPackage() {
		return (GenfeaturemodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenfeaturemodelPackage getPackage() {
		return GenfeaturemodelPackage.eINSTANCE;
	}

} //GenfeaturemodelFactoryImpl
