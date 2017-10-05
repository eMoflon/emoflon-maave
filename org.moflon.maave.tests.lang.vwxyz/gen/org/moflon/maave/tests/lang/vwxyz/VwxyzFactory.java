/**
 */
package org.moflon.maave.tests.lang.vwxyz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage
 * @generated
 */
public interface VwxyzFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VwxyzFactory eINSTANCE = org.moflon.maave.tests.lang.vwxyz.impl.VwxyzFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>V</em>'.
	 * @generated
	 */
	V createV();

	/**
	 * Returns a new object of class '<em>W</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>W</em>'.
	 * @generated
	 */
	W createW();

	/**
	 * Returns a new object of class '<em>X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X</em>'.
	 * @generated
	 */
	X createX();

	/**
	 * Returns a new object of class '<em>Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Y</em>'.
	 * @generated
	 */
	Y createY();

	/**
	 * Returns a new object of class '<em>Z</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Z</em>'.
	 * @generated
	 */
	Z createZ();

	/**
	 * Returns a new object of class '<em>Cardinality Constraints Test Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality Constraints Test Pattern</em>'.
	 * @generated
	 */
	CardinalityConstraintsTestPattern createCardinalityConstraintsTestPattern();

	/**
	 * Returns a new object of class '<em>User Defined Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Constraints</em>'.
	 * @generated
	 */
	UserDefinedConstraints createUserDefinedConstraints();

	/**
	 * Returns a new object of class '<em>Constraint To Post Condition Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint To Post Condition Pattern</em>'.
	 * @generated
	 */
	ConstraintToPostConditionPattern createConstraintToPostConditionPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VwxyzPackage getVwxyzPackage();

} //VwxyzFactory
