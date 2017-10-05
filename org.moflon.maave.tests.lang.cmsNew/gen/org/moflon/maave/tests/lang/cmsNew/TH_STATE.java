/**
 */
package org.moflon.maave.tests.lang.cmsNew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TH STATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.maave.tests.lang.cmsNew.CmsNewPackage#getTH_STATE()
 * @model
 * @generated
 */
public enum TH_STATE implements Enumerator {
   /**
    * The '<em><b>TH CREATED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #TH_CREATED_VALUE
    * @generated
    * @ordered
    */
   TH_CREATED(0, "TH_CREATED", "TH_CREATED"),

   /**
    * The '<em><b>TH IN PROGRESS</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #TH_IN_PROGRESS_VALUE
    * @generated
    * @ordered
    */
   TH_IN_PROGRESS(1, "TH_IN_PROGRESS", "TH_IN_PROGRESS"),

   /**
    * The '<em><b>TH FINISHED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #TH_FINISHED_VALUE
    * @generated
    * @ordered
    */
   TH_FINISHED(2, "TH_FINISHED", "TH_FINISHED"),

   /**
    * The '<em><b>TH STOP</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #TH_STOP_VALUE
    * @generated
    * @ordered
    */
   TH_STOP(3, "TH_STOP", "TH_STOP");

   /**
    * The '<em><b>TH CREATED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>TH CREATED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #TH_CREATED
    * @model
    * @generated
    * @ordered
    */
   public static final int TH_CREATED_VALUE = 0;

   /**
    * The '<em><b>TH IN PROGRESS</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>TH IN PROGRESS</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #TH_IN_PROGRESS
    * @model
    * @generated
    * @ordered
    */
   public static final int TH_IN_PROGRESS_VALUE = 1;

   /**
    * The '<em><b>TH FINISHED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>TH FINISHED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #TH_FINISHED
    * @model
    * @generated
    * @ordered
    */
   public static final int TH_FINISHED_VALUE = 2;

   /**
    * The '<em><b>TH STOP</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>TH STOP</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #TH_STOP
    * @model
    * @generated
    * @ordered
    */
   public static final int TH_STOP_VALUE = 3;

   /**
    * An array of all the '<em><b>TH STATE</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final TH_STATE[] VALUES_ARRAY = new TH_STATE[] { TH_CREATED, TH_IN_PROGRESS, TH_FINISHED, TH_STOP, };

   /**
    * A public read-only list of all the '<em><b>TH STATE</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<TH_STATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>TH STATE</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param literal the literal.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static TH_STATE get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         TH_STATE result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>TH STATE</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param name the name.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static TH_STATE getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         TH_STATE result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>TH STATE</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the integer value.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static TH_STATE get(int value)
   {
      switch (value)
      {
      case TH_CREATED_VALUE:
         return TH_CREATED;
      case TH_IN_PROGRESS_VALUE:
         return TH_IN_PROGRESS;
      case TH_FINISHED_VALUE:
         return TH_FINISHED;
      case TH_STOP_VALUE:
         return TH_STOP;
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
   private TH_STATE(int value, String name, String literal)
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

} //TH_STATE
