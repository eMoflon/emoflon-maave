/**
 */
package org.moflon.maave.tests.lang.enumlang;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.maave.tests.lang.enumlang.E#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.maave.tests.lang.enumlang.EnumlangPackage#getE()
 * @model
 * @generated
 */
public interface E extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.moflon.maave.tests.lang.enumlang.LEVEL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.moflon.maave.tests.lang.enumlang.LEVEL
	 * @see #setLevel(LEVEL)
	 * @see org.moflon.maave.tests.lang.enumlang.EnumlangPackage#getE_Level()
	 * @model ordered="false"
	 * @generated
	 */
	LEVEL getLevel();

	/**
	 * Sets the value of the '{@link org.moflon.maave.tests.lang.enumlang.E#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.moflon.maave.tests.lang.enumlang.LEVEL
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LEVEL value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // E
