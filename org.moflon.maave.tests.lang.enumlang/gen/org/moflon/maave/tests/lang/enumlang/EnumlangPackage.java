/**
 */
package org.moflon.maave.tests.lang.enumlang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.moflon.maave.tests.lang.enumlang.EnumlangFactory
 * @model kind="package"
 * @generated
 */
public interface EnumlangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumlang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.moflon.maave.tests.lang.enumlang/model/Enumlang.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.moflon.maave.tests.lang.enumlang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumlangPackage eINSTANCE = org.moflon.maave.tests.lang.enumlang.impl.EnumlangPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.enumlang.impl.EImpl <em>E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.enumlang.impl.EImpl
	 * @see org.moflon.maave.tests.lang.enumlang.impl.EnumlangPackageImpl#getE()
	 * @generated
	 */
	int E = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.moflon.maave.tests.lang.enumlang.LEVEL <em>LEVEL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.moflon.maave.tests.lang.enumlang.LEVEL
	 * @see org.moflon.maave.tests.lang.enumlang.impl.EnumlangPackageImpl#getLEVEL()
	 * @generated
	 */
	int LEVEL = 1;

	/**
	 * Returns the meta object for class '{@link org.moflon.maave.tests.lang.enumlang.E <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E</em>'.
	 * @see org.moflon.maave.tests.lang.enumlang.E
	 * @generated
	 */
	EClass getE();

	/**
	 * Returns the meta object for the attribute '{@link org.moflon.maave.tests.lang.enumlang.E#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.moflon.maave.tests.lang.enumlang.E#getLevel()
	 * @see #getE()
	 * @generated
	 */
	EAttribute getE_Level();

	/**
	 * Returns the meta object for enum '{@link org.moflon.maave.tests.lang.enumlang.LEVEL <em>LEVEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LEVEL</em>'.
	 * @see org.moflon.maave.tests.lang.enumlang.LEVEL
	 * @generated
	 */
	EEnum getLEVEL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumlangFactory getEnumlangFactory();

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
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.enumlang.impl.EImpl <em>E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.enumlang.impl.EImpl
		 * @see org.moflon.maave.tests.lang.enumlang.impl.EnumlangPackageImpl#getE()
		 * @generated
		 */
		EClass E = eINSTANCE.getE();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute E__LEVEL = eINSTANCE.getE_Level();

		/**
		 * The meta object literal for the '{@link org.moflon.maave.tests.lang.enumlang.LEVEL <em>LEVEL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.moflon.maave.tests.lang.enumlang.LEVEL
		 * @see org.moflon.maave.tests.lang.enumlang.impl.EnumlangPackageImpl#getLEVEL()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLEVEL();

	}

} //EnumlangPackage
