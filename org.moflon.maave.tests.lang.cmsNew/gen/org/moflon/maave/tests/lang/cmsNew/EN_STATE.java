/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EN STATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEN_STATE()
 * @model
 * @generated
 */
public enum EN_STATE implements Enumerator {
	/**
	 * The '<em><b>EN STUDY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	EN_STUDY(4, "EN_STUDY", "EN_STUDY"),

	/**
	 * The '<em><b>EN WRITE THESIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_WRITE_THESIS_VALUE
	 * @generated
	 * @ordered
	 */
	EN_WRITE_THESIS(5, "EN_WRITE_THESIS", "EN_WRITE_THESIS"),

	/**
	 * The '<em><b>EN STOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	EN_STOP(5, "EN_STOP", "EN_STOP");

	/**
	 * The '<em><b>EN STUDY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EN STUDY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EN_STUDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EN_STUDY_VALUE = 4;

	/**
	 * The '<em><b>EN WRITE THESIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EN WRITE THESIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EN_WRITE_THESIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EN_WRITE_THESIS_VALUE = 5;

	/**
	 * The '<em><b>EN STOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EN STOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EN_STOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EN_STOP_VALUE = 5;

	/**
	 * An array of all the '<em><b>EN STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EN_STATE[] VALUES_ARRAY = new EN_STATE[] { EN_STUDY, EN_WRITE_THESIS, EN_STOP, };

	/**
	 * A public read-only list of all the '<em><b>EN STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EN_STATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EN STATE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EN_STATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EN_STATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EN STATE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EN_STATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EN_STATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EN STATE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EN_STATE get(int value) {
		switch (value) {
		case EN_STUDY_VALUE:
			return EN_STUDY;
		case EN_WRITE_THESIS_VALUE:
			return EN_WRITE_THESIS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EN_STATE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EN_STATE
