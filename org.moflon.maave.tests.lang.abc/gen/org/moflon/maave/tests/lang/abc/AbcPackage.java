/**
 */
package org.moflon.maave.tests.lang.abc;

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
 * @see org.moflon.maave.tests.lang.abc.AbcFactory
 * @model kind="package"
 * @generated
 */
public interface AbcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.abc/model/Abc.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.abc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbcPackage eINSTANCE = org.moflon.maave.tests.lang.abc.impl.AbcPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.abc.impl.CImpl <em>C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.abc.impl.CImpl
	 * @see org.moflon.maave.tests.lang.abc.impl.AbcPackageImpl#getC()
	 * @generated
	 */
	int C = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__B = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C__X = 1;

	/**
	 * The number of structural features of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.abc.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.abc.impl.AImpl
	 * @see org.moflon.maave.tests.lang.abc.impl.AbcPackageImpl#getA()
	 * @generated
	 */
	int A = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__B = 0;

	/**
	 * The feature id for the '<em><b>C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__C = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__X = 2;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.abc.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.abc.impl.BImpl
	 * @see org.moflon.maave.tests.lang.abc.impl.AbcPackageImpl#getB()
	 * @generated
	 */
	int B = 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__A = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__X = 1;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.abc.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C</em>'.
	 * @see org.moflon.maave.tests.lang.abc.C
	 * @generated
	 */
	EClass getC();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.abc.C#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>B</em>'.
	 * @see org.moflon.maave.tests.lang.abc.C#getB()
	 * @see #getC()
	 * @generated
	 */
	EReference getC_B();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.abc.C#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.abc.C#getX()
	 * @see #getC()
	 * @generated
	 */
	EAttribute getC_X();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.abc.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see org.moflon.maave.tests.lang.abc.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.abc.A#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>B</em>'.
	 * @see org.moflon.maave.tests.lang.abc.A#getB()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_B();

	/**
	 * Returns the meta object for the reference '{@link org.moflon.maave.tests.lang.abc.A#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>C</em>'.
	 * @see org.moflon.maave.tests.lang.abc.A#getC()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_C();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.abc.A#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.abc.A#getX()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_X();

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.abc.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see org.moflon.maave.tests.lang.abc.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the reference list '{@link org.moflon.maave.tests.lang.abc.B#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>A</em>'.
	 * @see org.moflon.maave.tests.lang.abc.B#getA()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_A();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.abc.B#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.moflon.maave.tests.lang.abc.B#getX()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_X();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbcFactory getAbcFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.abc.impl.CImpl <em>C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.abc.impl.CImpl
		 * @see org.moflon.maave.tests.lang.abc.impl.AbcPackageImpl#getC()
		 * @generated
		 */
		EClass C = eINSTANCE.getC();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C__B = eINSTANCE.getC_B();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C__X = eINSTANCE.getC_X();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.abc.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.abc.impl.AImpl
		 * @see org.moflon.maave.tests.lang.abc.impl.AbcPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__B = eINSTANCE.getA_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__C = eINSTANCE.getA_C();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__X = eINSTANCE.getA_X();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.abc.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.abc.impl.BImpl
		 * @see org.moflon.maave.tests.lang.abc.impl.AbcPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B__A = eINSTANCE.getB_A();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__X = eINSTANCE.getB_X();

	}

} //AbcPackage
