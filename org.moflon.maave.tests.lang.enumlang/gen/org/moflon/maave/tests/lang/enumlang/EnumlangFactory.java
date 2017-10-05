/**
 */
package org.moflon.maave.tests.lang.enumlang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.enumlang.EnumlangPackage
 * @generated
 */
public interface EnumlangFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumlangFactory eINSTANCE = org.moflon.maave.tests.lang.enumlang.impl.EnumlangFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>E</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E</em>'.
	 * @generated
	 */
	E createE();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnumlangPackage getEnumlangPackage();

} //EnumlangFactory
