/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>SEM STATE</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * 
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getSEM_STATE()
 * @model
 * @generated
 */
public enum SEM_STATE implements Enumerator {
	/**
	 * The '<em><b>SEM CREATED</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	SEM_CREATED(1, "SEM_CREATED", "SEM_CREATED"),

	/**
	 * The '<em><b>SEM STARTED</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	SEM_STARTED(2, "SEM_STARTED", "SEM_STARTED"),

	/**
	 * The '<em><b>SEM REG OPEN</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_REG_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	SEM_REG_OPEN(3, "SEM_REG_OPEN", "SEM_REG_OPEN"),

	/**
	 * The '<em><b>SEM REG CLOSED</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_REG_CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	SEM_REG_CLOSED(4, "SEM_REG_CLOSED", "SEM_REG_CLOSED"),

	/**
	 * The '<em><b>SEM STOP</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #SEM_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	SEM_STOP(5, "SEM_STOP", "SEM_STOP");

	/**
	 * The '<em><b>SEM CREATED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEM CREATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_CREATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEM_CREATED_VALUE = 1;

	/**
	 * The '<em><b>SEM STARTED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEM STARTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_STARTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEM_STARTED_VALUE = 2;

	/**
	 * The '<em><b>SEM REG OPEN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEM REG OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_REG_OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEM_REG_OPEN_VALUE = 3;

	/**
	 * The '<em><b>SEM REG CLOSED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEM REG CLOSED</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_REG_CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEM_REG_CLOSED_VALUE = 4;

	/**
	 * The '<em><b>SEM STOP</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEM STOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SEM_STOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEM_STOP_VALUE = 5;

	/**
	 * An array of all the '<em><b>SEM STATE</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final SEM_STATE[] VALUES_ARRAY = new SEM_STATE[] { SEM_CREATED, SEM_STARTED, SEM_REG_OPEN,
			SEM_REG_CLOSED, SEM_STOP, };

	/**
	 * A public read-only list of all the '<em><b>SEM STATE</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<SEM_STATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SEM STATE</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SEM_STATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SEM_STATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SEM STATE</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SEM_STATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SEM_STATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SEM STATE</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SEM_STATE get(int value) {
		switch (value) {
		case SEM_CREATED_VALUE:
			return SEM_CREATED;
		case SEM_STARTED_VALUE:
			return SEM_STARTED;
		case SEM_REG_OPEN_VALUE:
			return SEM_REG_OPEN;
		case SEM_REG_CLOSED_VALUE:
			return SEM_REG_CLOSED;
		case SEM_STOP_VALUE:
			return SEM_STOP;
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
	private SEM_STATE(int value, String name, String literal) {
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

} // SEM_STATE
