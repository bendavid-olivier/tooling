/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kevoree.Binding#getChannel <em>Channel</em>}</li>
 *   <li>{@link kevoree.Binding#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see kevoree.KevoreePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends KevoreeElement
{
  /**
   * Returns the value of the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' reference.
   * @see #setChannel(Channel)
   * @see kevoree.KevoreePackage#getBinding_Channel()
   * @model required="true"
   * @generated
   */
  Channel getChannel();

  /**
   * Sets the value of the '{@link kevoree.Binding#getChannel <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' reference.
   * @see #getChannel()
   * @generated
   */
  void setChannel(Channel value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' reference.
   * @see #setPort(Port)
   * @see kevoree.KevoreePackage#getBinding_Port()
   * @model required="true"
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link kevoree.Binding#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

} // Binding
