/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kevoree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Kevoree#getChannels <em>Channels</em>}</li>
 *   <li>{@link kevoree.Kevoree#getNodes <em>Nodes</em>}</li>
 *   <li>{@link kevoree.Kevoree#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getKevoree()
 * @model
 * @generated
 */
public interface Kevoree extends EObject
{
  /**
   * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
   * The list contents are of type {@link kevoree.Channel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channels</em>' containment reference list.
   * @see kevoree.KevoreePackage#getKevoree_Channels()
   * @model type="kevoree.Channel" containment="true"
   * @generated
   */
  EList getChannels();

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link kevoree.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see kevoree.KevoreePackage#getKevoree_Nodes()
   * @model type="kevoree.Node" containment="true"
   * @generated
   */
  EList getNodes();

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link kevoree.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see kevoree.KevoreePackage#getKevoree_Bindings()
   * @model type="kevoree.Binding" containment="true"
   * @generated
   */
  EList getBindings();

} // Kevoree
