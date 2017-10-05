/**
 */
package org.moflon.maave.tests.lang.featuremodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuremodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.featuremodel/model/Featuremodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.featuremodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturemodelPackage eINSTANCE = org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeatureModelImpl
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Real</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REAL = 1;

	/**
	 * The feature id for the '<em><b>Nat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAT = 2;

	/**
	 * The feature id for the '<em><b>Req</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQ = 3;

	/**
	 * The feature id for the '<em><b>Sel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SEL = 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.RealFeatureAttributeImpl <em>Real Feature Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.RealFeatureAttributeImpl
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getRealFeatureAttribute()
	 * @generated
	 */
	int REAL_FEATURE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_ATTRIBUTE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Real Feature Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Real Feature Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.NatFeatureAttributeImpl <em>Nat Feature Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.NatFeatureAttributeImpl
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getNatFeatureAttribute()
	 * @generated
	 */
	int NAT_FEATURE_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_FEATURE_ATTRIBUTE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Nat Feature Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_FEATURE_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nat Feature Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_FEATURE_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.GroupImpl
	 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.featuremodel.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.moflon.maave.tests.lang.featuremodel.FeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.FeatureModel#getRootFeature()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_RootFeature();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.featuremodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.featuremodel.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Feature#getGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.featuremodel.Feature#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Feature#getReal()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Real();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.featuremodel.Feature#getNat <em>Nat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nat</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Feature#getNat()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Nat();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.featuremodel.Feature#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Req</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Feature#getReq()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Req();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.featuremodel.Feature#isSel <em>Sel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sel</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Feature#isSel()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Sel();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.featuremodel.RealFeatureAttribute <em>Real Feature Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Feature Attribute</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.RealFeatureAttribute
	 * @generated
	 */
	EClass getRealFeatureAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.featuremodel.RealFeatureAttribute#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.RealFeatureAttribute#getVal()
	 * @see #getRealFeatureAttribute()
	 * @generated
	 */
	EAttribute getRealFeatureAttribute_Val();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute <em>Nat Feature Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nat Feature Attribute</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute
	 * @generated
	 */
	EClass getNatFeatureAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute#getVal()
	 * @see #getNatFeatureAttribute()
	 * @generated
	 */
	EAttribute getNatFeatureAttribute_Val();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.featuremodel.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.moflon.maave.tests.lang.featuremodel.Group#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Group#getFeatures()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.featuremodel.Group#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.moflon.maave.tests.lang.featuremodel.Group#getType()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturemodelFactory getFeaturemodelFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeatureModelImpl
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOT_FEATURE = eINSTANCE.getFeatureModel_RootFeature();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeatureImpl
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPS = eINSTANCE.getFeature_Groups();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REAL = eINSTANCE.getFeature_Real();

		/**
		 * The meta object literal for the '<em><b>Nat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__NAT = eINSTANCE.getFeature_Nat();

		/**
		 * The meta object literal for the '<em><b>Req</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQ = eINSTANCE.getFeature_Req();

		/**
		 * The meta object literal for the '<em><b>Sel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SEL = eINSTANCE.getFeature_Sel();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.RealFeatureAttributeImpl <em>Real Feature Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.RealFeatureAttributeImpl
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getRealFeatureAttribute()
		 * @generated
		 */
		EClass REAL_FEATURE_ATTRIBUTE = eINSTANCE.getRealFeatureAttribute();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_FEATURE_ATTRIBUTE__VAL = eINSTANCE.getRealFeatureAttribute_Val();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.NatFeatureAttributeImpl <em>Nat Feature Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.NatFeatureAttributeImpl
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getNatFeatureAttribute()
		 * @generated
		 */
		EClass NAT_FEATURE_ATTRIBUTE = eINSTANCE.getNatFeatureAttribute();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_FEATURE_ATTRIBUTE__VAL = eINSTANCE.getNatFeatureAttribute_Val();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.featuremodel.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.GroupImpl
		 * @see org.moflon.maave.tests.lang.featuremodel.impl.FeaturemodelPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__FEATURES = eINSTANCE.getGroup_Features();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TYPE = eINSTANCE.getGroup_Type();

	}

} //FeaturemodelPackage
