/**
 */
package org.moflon.maave.tests.lang.featuremodel;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.FeatureModel#getRootFeature <em>Root Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' containment reference.
	 * @see #setRootFeature(Feature)
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeatureModel_RootFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Feature getRootFeature();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.featuremodel.FeatureModel#getRootFeature <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' containment reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(Feature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FeatureModel
