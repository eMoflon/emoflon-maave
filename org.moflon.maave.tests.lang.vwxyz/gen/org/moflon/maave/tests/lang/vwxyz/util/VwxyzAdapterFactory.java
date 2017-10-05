/**
 */
package org.moflon.maave.tests.lang.vwxyz.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.maave.tests.lang.vwxyz.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.vwxyz.VwxyzPackage
 * @generated
 */
public class VwxyzAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VwxyzPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VwxyzAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VwxyzPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VwxyzSwitch<Adapter> modelSwitch = new VwxyzSwitch<Adapter>() {
		@Override
		public Adapter caseV(V object) {
			return createVAdapter();
		}

		@Override
		public Adapter caseW(W object) {
			return createWAdapter();
		}

		@Override
		public Adapter caseX(X object) {
			return createXAdapter();
		}

		@Override
		public Adapter caseY(Y object) {
			return createYAdapter();
		}

		@Override
		public Adapter caseZ(Z object) {
			return createZAdapter();
		}

		@Override
		public Adapter caseCardinalityConstraintsTestPattern(CardinalityConstraintsTestPattern object) {
			return createCardinalityConstraintsTestPatternAdapter();
		}

		@Override
		public Adapter caseUserDefinedConstraints(UserDefinedConstraints object) {
			return createUserDefinedConstraintsAdapter();
		}

		@Override
		public Adapter caseConstraintToPostConditionPattern(ConstraintToPostConditionPattern object) {
			return createConstraintToPostConditionPatternAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.V <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.V
	 * @generated
	 */
	public Adapter createVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.W <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.W
	 * @generated
	 */
	public Adapter createWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.X <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.X
	 * @generated
	 */
	public Adapter createXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.Y <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.Y
	 * @generated
	 */
	public Adapter createYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.Z <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.Z
	 * @generated
	 */
	public Adapter createZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern <em>Cardinality Constraints Test Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.CardinalityConstraintsTestPattern
	 * @generated
	 */
	public Adapter createCardinalityConstraintsTestPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints <em>User Defined Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.UserDefinedConstraints
	 * @generated
	 */
	public Adapter createUserDefinedConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern <em>Constraint To Post Condition Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.maave.tests.lang.vwxyz.ConstraintToPostConditionPattern
	 * @generated
	 */
	public Adapter createConstraintToPostConditionPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VwxyzAdapterFactory
