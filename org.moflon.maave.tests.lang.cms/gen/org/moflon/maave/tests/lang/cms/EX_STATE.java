/**
 */
package org.moflon.maave.tests.lang.cms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EX STATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cms.CmsPackage#getEX_STATE()
 * @model
 * @generated
 */
public enum EX_STATE implements Enumerator {
	/**
	 * The '<em><b>INIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INIT_VALUE
	 * @generated
	 * @ordered
	 */
	INIT(1, "INIT", "INIT"),

	/**
	 * The '<em><b>REG OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REG_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	REG_OPEN(2, "REG_OPEN", "REG_OPEN"),

	/**
	 * The '<em><b>REG CLOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REG_CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	REG_CLOSED(3, "REG_CLOSED", "REG_CLOSED"),

	/**
	 * The '<em><b>PERFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORM_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORM(4, "PERFORM", "PERFORM"),

	/**
	 * The '<em><b>CLOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(6, "CLOSED", "CLOSED"),

	/**
	 * The '<em><b>RECORDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORDS_VALUE
	 * @generated
	 * @ordered
	 */
	RECORDS(5, "RECORDS", "RECORDS");

	/**
	 * The '<em><b>INIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INIT_VALUE = 1;

	/**
	 * The '<em><b>REG OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REG OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REG_OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REG_OPEN_VALUE = 2;

	/**
	 * The '<em><b>REG CLOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REG CLOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REG_CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REG_CLOSED_VALUE = 3;

	/**
	 * The '<em><b>PERFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERFORM_VALUE = 4;

	/**
	 * The '<em><b>CLOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 6;

	/**
	 * The '<em><b>RECORDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECORDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECORDS_VALUE = 5;

	/**
	 * An array of all the '<em><b>EX STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EX_STATE[] VALUES_ARRAY = new EX_STATE[] { INIT, REG_OPEN, REG_CLOSED, PERFORM, CLOSED,
			RECORDS, };

	/**
	 * A public read-only list of all the '<em><b>EX STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EX_STATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EX STATE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EX_STATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EX_STATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EX STATE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EX_STATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EX_STATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EX STATE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EX_STATE get(int value) {
		switch (value) {
		case INIT_VALUE:
			return INIT;
		case REG_OPEN_VALUE:
			return REG_OPEN;
		case REG_CLOSED_VALUE:
			return REG_CLOSED;
		case PERFORM_VALUE:
			return PERFORM;
		case CLOSED_VALUE:
			return CLOSED;
		case RECORDS_VALUE:
			return RECORDS;
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
	private EX_STATE(int value, String name, String literal) {
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

} //EX_STATE
