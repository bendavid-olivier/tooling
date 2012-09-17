/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Component#getProvided <em>Provided</em>}</li>
 *   <li>{@link kevoree.Component#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends KevoreeElement
{
  Object type = null;

/**
   * Returns the value of the '<em><b>Provided</b></em>' containment reference list.
   * The list contents are of type {@link kevoree.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided</em>' containment reference list.
   * @see kevoree.KevoreePackage#getComponent_Provided()
   * @model type="kevoree.Port" containment="true"
   * @generated
   */
  EList getProvided();

  /**
   * Returns the value of the '<em><b>Required</b></em>' containment reference list.
   * The list contents are of type {@link kevoree.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' containment reference list.
   * @see kevoree.KevoreePackage#getComponent_Required()
   * @model type="kevoree.Port" containment="true"
   * @generated
   */
  EList getRequired();

} // Component
