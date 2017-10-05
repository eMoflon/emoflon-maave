/**
 */
package org.moflon.maave.tests.lang.tggcpa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.tggcpa.TggcpaPackage
 * @generated
 */
public interface TggcpaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TggcpaFactory eINSTANCE = org.moflon.maave.tests.lang.tggcpa.impl.TggcpaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Obj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obj</em>'.
	 * @generated
	 */
	Obj createObj();

	/**
	 * Returns a new object of class '<em>Transl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transl</em>'.
	 * @generated
	 */
	Transl createTransl();

	/**
	 * Returns a new object of class '<em>Type A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type A</em>'.
	 * @generated
	 */
	TypeA createTypeA();

	/**
	 * Returns a new object of class '<em>Type B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type B</em>'.
	 * @generated
	 */
	TypeB createTypeB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TggcpaPackage getTggcpaPackage();

} //TggcpaFactory
