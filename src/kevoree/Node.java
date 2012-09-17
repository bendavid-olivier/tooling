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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Node#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends KevoreeElement
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link kevoree.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see kevoree.KevoreePackage#getNode_Components()
   * @model type="kevoree.Component" containment="true"
   * @generated
   */
  EList getComponents();

} // Node
