/**
 */
package org.moflon.maave.tests.lang.featuremodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.Group#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.moflon.maave.tests.lang.featuremodel.Group#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.moflon.maave.tests.lang.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getGroup_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see org.moflon.maave.tests.lang.featuremodel.FeaturemodelPackage#getGroup_Type()
	 * @model ordered="false"
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.featuremodel.Group#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Group
