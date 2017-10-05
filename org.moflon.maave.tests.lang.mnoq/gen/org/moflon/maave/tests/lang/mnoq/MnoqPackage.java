/**
 */
package org.moflon.maave.tests.lang.mnoq;

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
 * @see org.moflon.maave.tests.lang.mnoq.MnoqFactory
 * @model kind="package"
 * @generated
 */
public interface MnoqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mnoq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.mnoq/model/Mnoq.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.mnoq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MnoqPackage eINSTANCE = org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.mnoq.impl.FooImpl <em>Foo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.mnoq.impl.FooImpl
	 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getFoo()
	 * @generated
	 */
	int FOO = 0;

	/**
	 * The number of structural features of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Foo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.mnoq.impl.OImpl <em>O</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.mnoq.impl.OImpl
	 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getO()
	 * @generated
	 */
	int O = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int O__X = 0;

	/**
	 * The number of structural features of the '<em>O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int O_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int O_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.mnoq.impl.QImpl <em>Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.mnoq.impl.QImpl
	 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getQ()
	 * @generated
	 */
	int Q = 2;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__NS = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__X = 1;

	/**
	 * The number of structural features of the '<em>Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.mnoq.impl.NImpl <em>N</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.mnoq.impl.NImpl
	 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getN()
	 * @generated
	 */
	int N = 3;

	/**
	 * The feature id for the '<em><b>Mms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int N__MMS = 0;

	/**
	 * The feature id for the '<em><b>Qs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int N__QS = 1;

	/**
	 * The feature id for the '<em><b>Foo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int N__FOO = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int N__X = 3;

	/**
	 * The number of structural features of the '<em>N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int N_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int N_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.mnoq.impl.MImpl <em>M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.mnoq.impl.MImpl
	 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getM()
	 * @generated
	 */
	int M = 4;

	/**
	 * The feature id for the '<em><b>Nns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M__NNS = 0;

	/**
	 * The feature id for the '<em><b>O</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M__O = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M__X = 2;

	/**
	 * The number of structural features of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.mnoq.Foo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foo</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.Foo
	 * @generated
	 */
	EClass getFoo();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.mnoq.O <em>O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>O</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.O
	 * @generated
	 */
	EClass getO();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.mnoq.O#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.O#getX()
	 * @see #getO()
	 * @generated
	 */
	EAttribute getO_X();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.mnoq.Q <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Q</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.Q
	 * @generated
	 */
	EClass getQ();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.mnoq.Q#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ns</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.Q#getNs()
	 * @see #getQ()
	 * @generated
	 */
	EReference getQ_Ns();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.mnoq.Q#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.Q#getX()
	 * @see #getQ()
	 * @generated
	 */
	EAttribute getQ_X();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.mnoq.N <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>N</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.N
	 * @generated
	 */
	EClass getN();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.mnoq.N#getMms <em>Mms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mms</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.N#getMms()
	 * @see #getN()
	 * @generated
	 */
	EReference getN_Mms();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.mnoq.N#getQs <em>Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qs</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.N#getQs()
	 * @see #getN()
	 * @generated
	 */
	EReference getN_Qs();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.mnoq.N#getFoo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foo</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.N#getFoo()
	 * @see #getN()
	 * @generated
	 */
	EReference getN_Foo();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.mnoq.N#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.N#getX()
	 * @see #getN()
	 * @generated
	 */
	EAttribute getN_X();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.mnoq.M <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.M
	 * @generated
	 */
	EClass getM();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.mnoq.M#getNns <em>Nns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nns</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.M#getNns()
	 * @see #getM()
	 * @generated
	 */
	EReference getM_Nns();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.mnoq.M#getO <em>O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>O</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.M#getO()
	 * @see #getM()
	 * @generated
	 */
	EReference getM_O();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.mnoq.M#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.mnoq.M#getX()
	 * @see #getM()
	 * @generated
	 */
	EAttribute getM_X();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MnoqFactory getMnoqFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.mnoq.impl.FooImpl <em>Foo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.mnoq.impl.FooImpl
		 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getFoo()
		 * @generated
		 */
		EClass FOO = eINSTANCE.getFoo();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.mnoq.impl.OImpl <em>O</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.mnoq.impl.OImpl
		 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getO()
		 * @generated
		 */
		EClass O = eINSTANCE.getO();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute O__X = eINSTANCE.getO_X();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.mnoq.impl.QImpl <em>Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.mnoq.impl.QImpl
		 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getQ()
		 * @generated
		 */
		EClass Q = eINSTANCE.getQ();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Q__NS = eINSTANCE.getQ_Ns();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Q__X = eINSTANCE.getQ_X();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.mnoq.impl.NImpl <em>N</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.mnoq.impl.NImpl
		 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getN()
		 * @generated
		 */
		EClass N = eINSTANCE.getN();

		/**
		 * The meta object literal for the '<em><b>Mms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference N__MMS = eINSTANCE.getN_Mms();

		/**
		 * The meta object literal for the '<em><b>Qs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference N__QS = eINSTANCE.getN_Qs();

		/**
		 * The meta object literal for the '<em><b>Foo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference N__FOO = eINSTANCE.getN_Foo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute N__X = eINSTANCE.getN_X();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.mnoq.impl.MImpl <em>M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.mnoq.impl.MImpl
		 * @see org.moflon.maave.tests.lang.mnoq.impl.MnoqPackageImpl#getM()
		 * @generated
		 */
		EClass M = eINSTANCE.getM();

		/**
		 * The meta object literal for the '<em><b>Nns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference M__NNS = eINSTANCE.getM_Nns();

		/**
		 * The meta object literal for the '<em><b>O</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference M__O = eINSTANCE.getM_O();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute M__X = eINSTANCE.getM_X();

	}

} //MnoqPackage
