/**
 */
package org.moflon.maave.tests.testgen.genfeaturemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.testgen.genfeaturemodel.GenfeaturemodelPackage
 * @generated
 */
public interface GenfeaturemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenfeaturemodelFactory eINSTANCE = org.moflon.maave.tests.testgen.genfeaturemodel.impl.GenfeaturemodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rules</em>'.
	 * @generated
	 */
	Rules createRules();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenfeaturemodelPackage getGenfeaturemodelPackage();

} //GenfeaturemodelFactory
