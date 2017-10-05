/**
 */
package org.moflon.maave.tests.lang.mnoq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.mnoq.MnoqPackage
 * @generated
 */
public interface MnoqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MnoqFactory eINSTANCE = org.moflon.maave.tests.lang.mnoq.impl.MnoqFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Foo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foo</em>'.
	 * @generated
	 */
	Foo createFoo();

	/**
	 * Returns a new object of class '<em>O</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>O</em>'.
	 * @generated
	 */
	O createO();

	/**
	 * Returns a new object of class '<em>Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Q</em>'.
	 * @generated
	 */
	Q createQ();

	/**
	 * Returns a new object of class '<em>N</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>N</em>'.
	 * @generated
	 */
	N createN();

	/**
	 * Returns a new object of class '<em>M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M</em>'.
	 * @generated
	 */
	M createM();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MnoqPackage getMnoqPackage();

} //MnoqFactory
