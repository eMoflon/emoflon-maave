/**
 */
package org.moflon.maave.tests.lang.tggcpa;

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
 * @see org.moflon.maave.tests.lang.tggcpa.TggcpaFactory
 * @model kind="package"
 * @generated
 */
public interface TggcpaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tggcpa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.tggcpa/model/Tggcpa.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.tggcpa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TggcpaPackage eINSTANCE = org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.ObjImpl <em>Obj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.ObjImpl
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getObj()
	 * @generated
	 */
	int OBJ = 0;

	/**
	 * The number of structural features of the '<em>Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.TranslImpl <em>Transl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.TranslImpl
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getTransl()
	 * @generated
	 */
	int TRANSL = 1;

	/**
	 * The number of structural features of the '<em>Transl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.TypeAImpl <em>Type A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.TypeAImpl
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getTypeA()
	 * @generated
	 */
	int TYPE_A = 2;

	/**
	 * The feature id for the '<em><b>Transl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_A__TRANSL = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_A__CHILDREN = 1;

	/**
	 * The number of structural features of the '<em>Type A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_A_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.TypeBImpl <em>Type B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.TypeBImpl
	 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getTypeB()
	 * @generated
	 */
	int TYPE_B = 3;

	/**
	 * The feature id for the '<em><b>Transl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_B__TRANSL = 0;

	/**
	 * The number of structural features of the '<em>Type B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_B_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_B_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.tggcpa.Obj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obj</em>'.
	 * @see org.moflon.maave.tests.lang.tggcpa.Obj
	 * @generated
	 */
	EClass getObj();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.tggcpa.Transl <em>Transl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transl</em>'.
	 * @see org.moflon.maave.tests.lang.tggcpa.Transl
	 * @generated
	 */
	EClass getTransl();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.tggcpa.TypeA <em>Type A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type A</em>'.
	 * @see org.moflon.maave.tests.lang.tggcpa.TypeA
	 * @generated
	 */
	EClass getTypeA();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.tggcpa.TypeA#getTransl <em>Transl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transl</em>'.
	 * @see org.moflon.maave.tests.lang.tggcpa.TypeA#getTransl()
	 * @see #getTypeA()
	 * @generated
	 */
	EReference getTypeA_Transl();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.tggcpa.TypeA#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.moflon.maave.tests.lang.tggcpa.TypeA#getChildren()
	 * @see #getTypeA()
	 * @generated
	 */
	EReference getTypeA_Children();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.tggcpa.TypeB <em>Type B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type B</em>'.
	 * @see org.moflon.maave.tests.lang.tggcpa.TypeB
	 * @generated
	 */
	EClass getTypeB();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.tggcpa.TypeB#getTransl <em>Transl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transl</em>'.
	 * @see org.moflon.maave.tests.lang.tggcpa.TypeB#getTransl()
	 * @see #getTypeB()
	 * @generated
	 */
	EReference getTypeB_Transl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TggcpaFactory getTggcpaFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.ObjImpl <em>Obj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.ObjImpl
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getObj()
		 * @generated
		 */
		EClass OBJ = eINSTANCE.getObj();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.TranslImpl <em>Transl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.TranslImpl
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getTransl()
		 * @generated
		 */
		EClass TRANSL = eINSTANCE.getTransl();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.TypeAImpl <em>Type A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.TypeAImpl
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getTypeA()
		 * @generated
		 */
		EClass TYPE_A = eINSTANCE.getTypeA();

		/**
		 * The meta object literal for the '<em><b>Transl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_A__TRANSL = eINSTANCE.getTypeA_Transl();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_A__CHILDREN = eINSTANCE.getTypeA_Children();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.tggcpa.impl.TypeBImpl <em>Type B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.TypeBImpl
		 * @see org.moflon.maave.tests.lang.tggcpa.impl.TggcpaPackageImpl#getTypeB()
		 * @generated
		 */
		EClass TYPE_B = eINSTANCE.getTypeB();

		/**
		 * The meta object literal for the '<em><b>Transl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_B__TRANSL = eINSTANCE.getTypeB_Transl();

	}

} //TggcpaPackage
