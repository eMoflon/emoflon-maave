/**
 */
package org.moflon.maave.tests.lang.featuremodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.Feature#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.Feature#getReal <em>Real</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.Feature#getNat <em>Nat</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.Feature#getReq <em>Req</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.Feature#isSel <em>Sel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.featuremodel.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeature_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Real</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.featuremodel.RealFeatureAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeature_Real()
	 * @model containment="true"
	 * @generated
	 */
	EList<RealFeatureAttribute> getReal();

	/**
	 * Returns the value of the '<em><b>Nat</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.featuremodel.NatFeatureAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeature_Nat()
	 * @model containment="true"
	 * @generated
	 */
	EList<NatFeatureAttribute> getNat();

	/**
	 * Returns the value of the '<em><b>Req</b></em>' reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req</em>' reference list.
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeature_Req()
	 * @model
	 * @generated
	 */
	EList<Feature> getReq();

	/**
	 * Returns the value of the '<em><b>Sel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sel</em>' attribute.
	 * @see #setSel(boolean)
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getFeature_Sel()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isSel();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.featuremodel.Feature#isSel <em>Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sel</em>' attribute.
	 * @see #isSel()
	 * @generated
	 */
	void setSel(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Feature
