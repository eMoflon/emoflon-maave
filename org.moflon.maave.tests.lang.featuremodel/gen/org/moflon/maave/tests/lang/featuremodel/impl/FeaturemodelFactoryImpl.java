/**
 */
package org.moflon.maave.tests.lang.featuremodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.maave.tests.lang.featuremodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemodelFactoryImpl extends EFactoryImpl implements FeaturemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeaturemodelFactory init() {
		try {
			FeaturemodelFactory theFeaturemodelFactory = (FeaturemodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(FeaturemodelPackage.eNS_URI);
			if (theFeaturemodelFactory != null) {
				return theFeaturemodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeaturemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelFactoryImpl() {
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
		case FeaturemodelPackage.FEATURE_MODEL:
			return createFeatureModel();
		case FeaturemodelPackage.FEATURE:
			return createFeature();
		case FeaturemodelPackage.REAL_FEATURE_ATTRIBUTE:
			return createRealFeatureAttribute();
		case FeaturemodelPackage.NAT_FEATURE_ATTRIBUTE:
			return createNatFeatureAttribute();
		case FeaturemodelPackage.GROUP:
			return createGroup();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel createFeatureModel() {
		FeatureModelImpl featureModel = new FeatureModelImpl();
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealFeatureAttribute createRealFeatureAttribute() {
		RealFeatureAttributeImpl realFeatureAttribute = new RealFeatureAttributeImpl();
		return realFeatureAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatFeatureAttribute createNatFeatureAttribute() {
		NatFeatureAttributeImpl natFeatureAttribute = new NatFeatureAttributeImpl();
		return natFeatureAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelPackage getFeaturemodelPackage() {
		return (FeaturemodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturemodelPackage getPackage() {
		return FeaturemodelPackage.eINSTANCE;
	}

} //FeaturemodelFactoryImpl
