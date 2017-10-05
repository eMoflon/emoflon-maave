/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EX STATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getEX_STATE()
 * @model
 * @generated
 */
public enum EX_STATE implements Enumerator {
   /**
    * The '<em><b>EX PLANNING</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EX_PLANNING_VALUE
    * @generated
    * @ordered
    */
   EX_PLANNING(2, "EX_PLANNING", "EX_PLANNING"),

   /**
    * The '<em><b>EX CREATED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EX_CREATED_VALUE
    * @generated
    * @ordered
    */
   EX_CREATED(1, "EX_CREATED", "EX_CREATED"),

   /**
    * The '<em><b>EX READY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EX_READY_VALUE
    * @generated
    * @ordered
    */
   EX_READY(3, "EX_READY", "EX_READY"),

   /**
    * The '<em><b>EX FINALIZING</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EX_FINALIZING_VALUE
    * @generated
    * @ordered
    */
   EX_FINALIZING(4, "EX_FINALIZING", "EX_FINALIZING"),

   /**
    * The '<em><b>EX CLOSED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EX_CLOSED_VALUE
    * @generated
    * @ordered
    */
   EX_CLOSED(5, "EX_CLOSED", "EX_CLOSED");

   /**
    * The '<em><b>EX PLANNING</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EX PLANNING</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EX_PLANNING
    * @model
    * @generated
    * @ordered
    */
   public static final int EX_PLANNING_VALUE = 2;

   /**
    * The '<em><b>EX CREATED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EX CREATED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EX_CREATED
    * @model
    * @generated
    * @ordered
    */
   public static final int EX_CREATED_VALUE = 1;

   /**
    * The '<em><b>EX READY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EX READY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EX_READY
    * @model
    * @generated
    * @ordered
    */
   public static final int EX_READY_VALUE = 3;

   /**
    * The '<em><b>EX FINALIZING</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EX FINALIZING</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EX_FINALIZING
    * @model
    * @generated
    * @ordered
    */
   public static final int EX_FINALIZING_VALUE = 4;

   /**
    * The '<em><b>EX CLOSED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EX CLOSED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EX_CLOSED
    * @model
    * @generated
    * @ordered
    */
   public static final int EX_CLOSED_VALUE = 5;

   /**
    * An array of all the '<em><b>EX STATE</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final EX_STATE[] VALUES_ARRAY = new EX_STATE[] { EX_PLANNING, EX_CREATED, EX_READY, EX_FINALIZING, EX_CLOSED, };

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
   public static EX_STATE get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         EX_STATE result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
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
   public static EX_STATE getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         EX_STATE result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
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
   public static EX_STATE get(int value)
   {
      switch (value)
      {
      case EX_PLANNING_VALUE:
         return EX_PLANNING;
      case EX_CREATED_VALUE:
         return EX_CREATED;
      case EX_READY_VALUE:
         return EX_READY;
      case EX_FINALIZING_VALUE:
         return EX_FINALIZING;
      case EX_CLOSED_VALUE:
         return EX_CLOSED;
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
   private EX_STATE(int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      return literal;
   }

} //EX_STATE
