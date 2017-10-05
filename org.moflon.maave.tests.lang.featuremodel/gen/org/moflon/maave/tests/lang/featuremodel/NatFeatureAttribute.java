/**
 */
package org.moflon.maave.tests.lang.featuremodel;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nat Feature Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getNatFeatureAttribute()
 * @model
 * @generated
 */
public interface NatFeatureAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getNatFeatureAttribute_Val()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NatFeatureAttribute
