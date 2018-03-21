/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>CMO STATE</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * 
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getCMO_STATE()
 * @model
 * @generated
 */
public enum CMO_STATE implements Enumerator {
	/**
	 * The '<em><b>CMO CREATED</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CMO_CREATED(1, "CMO_CREATED", "CMO_CREATED"),

	/**
	 * The '<em><b>CMO LECT SET</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_LECT_SET_VALUE
	 * @generated
	 * @ordered
	 */
	CMO_LECT_SET(2, "CMO_LECT_SET", "CMO_LECT_SET"),

	/**
	 * The '<em><b>CMO READY</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #CMO_READY_VALUE
	 * @generated
	 * @ordered
	 */
	CMO_READY(3, "CMO_READY", "CMO_READY"),

	/**
	 * The '<em><b>CMO RESETTED</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_RESETTED_VALUE
	 * @generated
	 * @ordered
	 */
	CMO_RESETTED(5, "CMO_RESETTED", "CMO_RESETTED"),

	/**
	 * The '<em><b>CMO LECT UPDATED</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #CMO_LECT_UPDATED_VALUE
	 * @generated
	 * @ordered
	 */
	CMO_LECT_UPDATED(6, "CMO_LECT_UPDATED", "CMO_LECT_UPDATED"),

	/**
	 * The '<em><b>CMO CLOSED</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #CMO_CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CMO_CLOSED(7, "CMO_CLOSED", "CMO_CLOSED");

	/**
	 * The '<em><b>CMO CREATED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMO CREATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_CREATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMO_CREATED_VALUE = 1;

	/**
	 * The '<em><b>CMO LECT SET</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMO LECT SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_LECT_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMO_LECT_SET_VALUE = 2;

	/**
	 * The '<em><b>CMO READY</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMO READY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_READY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMO_READY_VALUE = 3;

	/**
	 * The '<em><b>CMO RESETTED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMO RESETTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_RESETTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMO_RESETTED_VALUE = 5;

	/**
	 * The '<em><b>CMO LECT UPDATED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMO LECT UPDATED</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_LECT_UPDATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMO_LECT_UPDATED_VALUE = 6;

	/**
	 * The '<em><b>CMO CLOSED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMO CLOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CMO_CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMO_CLOSED_VALUE = 7;

	/**
	 * An array of all the '<em><b>CMO STATE</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final CMO_STATE[] VALUES_ARRAY = new CMO_STATE[] { CMO_CREATED, CMO_LECT_SET, CMO_READY,
			CMO_RESETTED, CMO_LECT_UPDATED, CMO_CLOSED, };

	/**
	 * A public read-only list of all the '<em><b>CMO STATE</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<CMO_STATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CMO STATE</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CMO_STATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMO_STATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMO STATE</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CMO_STATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMO_STATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMO STATE</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CMO_STATE get(int value) {
		switch (value) {
		case CMO_CREATED_VALUE:
			return CMO_CREATED;
		case CMO_LECT_SET_VALUE:
			return CMO_LECT_SET;
		case CMO_READY_VALUE:
			return CMO_READY;
		case CMO_RESETTED_VALUE:
			return CMO_RESETTED;
		case CMO_LECT_UPDATED_VALUE:
			return CMO_LECT_UPDATED;
		case CMO_CLOSED_VALUE:
			return CMO_CLOSED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private CMO_STATE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // CMO_STATE
