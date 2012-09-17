/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kevoree.KevoreeFactory
 * @model kind="package"
 * @generated
 */
public interface KevoreePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kevoree";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kevoree/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kevoree";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KevoreePackage eINSTANCE = kevoree.impl.KevoreePackageImpl.init();

  /**
   * The meta object id for the '{@link kevoree.impl.KevoreeImpl <em>Kevoree</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kevoree.impl.KevoreeImpl
   * @see kevoree.impl.KevoreePackageImpl#getKevoree()
   * @generated
   */
  int KEVOREE = 0;

  /**
   * The feature id for the '<em><b>Channels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEVOREE__CHANNELS = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEVOREE__NODES = 1;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEVOREE__BINDINGS = 2;

  /**
   * The number of structural features of the '<em>Kevoree</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEVOREE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link kevoree.impl.KevoreeElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kevoree.impl.KevoreeElementImpl
   * @see kevoree.impl.KevoreePackageImpl#getKevoreeElement()
   * @generated
   */
  int KEVOREE_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEVOREE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEVOREE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kevoree.impl.ChannelImpl <em>Channel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kevoree.impl.ChannelImpl
   * @see kevoree.impl.KevoreePackageImpl#getChannel()
   * @generated
   */
  int CHANNEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL__NAME = KEVOREE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Channel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_FEATURE_COUNT = KEVOREE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kevoree.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kevoree.impl.ComponentImpl
   * @see kevoree.impl.KevoreePackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = KEVOREE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Provided</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROVIDED = KEVOREE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__REQUIRED = KEVOREE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = KEVOREE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link kevoree.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kevoree.impl.NodeImpl
   * @see kevoree.impl.KevoreePackageImpl#getNode()
   * @generated
   */
  int NODE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = KEVOREE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__COMPONENTS = KEVOREE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = KEVOREE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kevoree.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kevoree.impl.BindingImpl
   * @see kevoree.impl.KevoreePackageImpl#getBinding()
   * @generated
   */
  int BINDING = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__NAME = KEVOREE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__CHANNEL = KEVOREE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__PORT = KEVOREE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = KEVOREE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link kevoree.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kevoree.impl.PortImpl
   * @see kevoree.impl.KevoreePackageImpl#getPort()
   * @generated
   */
  int PORT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = KEVOREE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = KEVOREE_ELEMENT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link kevoree.Kevoree <em>Kevoree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kevoree</em>'.
   * @see kevoree.Kevoree
   * @generated
   */
  EClass getKevoree();

  /**
   * Returns the meta object for the containment reference list '{@link kevoree.Kevoree#getChannels <em>Channels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Channels</em>'.
   * @see kevoree.Kevoree#getChannels()
   * @see #getKevoree()
   * @generated
   */
  EReference getKevoree_Channels();

  /**
   * Returns the meta object for the containment reference list '{@link kevoree.Kevoree#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see kevoree.Kevoree#getNodes()
   * @see #getKevoree()
   * @generated
   */
  EReference getKevoree_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link kevoree.Kevoree#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see kevoree.Kevoree#getBindings()
   * @see #getKevoree()
   * @generated
   */
  EReference getKevoree_Bindings();

  /**
   * Returns the meta object for class '{@link kevoree.Channel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Channel</em>'.
   * @see kevoree.Channel
   * @generated
   */
  EClass getChannel();

  /**
   * Returns the meta object for class '{@link kevoree.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see kevoree.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the containment reference list '{@link kevoree.Component#getProvided <em>Provided</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided</em>'.
   * @see kevoree.Component#getProvided()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Provided();

  /**
   * Returns the meta object for the containment reference list '{@link kevoree.Component#getRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required</em>'.
   * @see kevoree.Component#getRequired()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Required();

  /**
   * Returns the meta object for class '{@link kevoree.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see kevoree.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference list '{@link kevoree.Node#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see kevoree.Node#getComponents()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Components();

  /**
   * Returns the meta object for class '{@link kevoree.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see kevoree.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the reference '{@link kevoree.Binding#getChannel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Channel</em>'.
   * @see kevoree.Binding#getChannel()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Channel();

  /**
   * Returns the meta object for the reference '{@link kevoree.Binding#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see kevoree.Binding#getPort()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Port();

  /**
   * Returns the meta object for class '{@link kevoree.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see kevoree.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for class '{@link kevoree.KevoreeElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see kevoree.KevoreeElement
   * @generated
   */
  EClass getKevoreeElement();

  /**
   * Returns the meta object for the attribute '{@link kevoree.KevoreeElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kevoree.KevoreeElement#getName()
   * @see #getKevoreeElement()
   * @generated
   */
  EAttribute getKevoreeElement_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KevoreeFactory getKevoreeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link kevoree.impl.KevoreeImpl <em>Kevoree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kevoree.impl.KevoreeImpl
     * @see kevoree.impl.KevoreePackageImpl#getKevoree()
     * @generated
     */
    EClass KEVOREE = eINSTANCE.getKevoree();

    /**
     * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEVOREE__CHANNELS = eINSTANCE.getKevoree_Channels();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEVOREE__NODES = eINSTANCE.getKevoree_Nodes();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEVOREE__BINDINGS = eINSTANCE.getKevoree_Bindings();

    /**
     * The meta object literal for the '{@link kevoree.impl.ChannelImpl <em>Channel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kevoree.impl.ChannelImpl
     * @see kevoree.impl.KevoreePackageImpl#getChannel()
     * @generated
     */
    EClass CHANNEL = eINSTANCE.getChannel();

    /**
     * The meta object literal for the '{@link kevoree.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kevoree.impl.ComponentImpl
     * @see kevoree.impl.KevoreePackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Provided</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PROVIDED = eINSTANCE.getComponent_Provided();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__REQUIRED = eINSTANCE.getComponent_Required();

    /**
     * The meta object literal for the '{@link kevoree.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kevoree.impl.NodeImpl
     * @see kevoree.impl.KevoreePackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__COMPONENTS = eINSTANCE.getNode_Components();

    /**
     * The meta object literal for the '{@link kevoree.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kevoree.impl.BindingImpl
     * @see kevoree.impl.KevoreePackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__CHANNEL = eINSTANCE.getBinding_Channel();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__PORT = eINSTANCE.getBinding_Port();

    /**
     * The meta object literal for the '{@link kevoree.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kevoree.impl.PortImpl
     * @see kevoree.impl.KevoreePackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '{@link kevoree.impl.KevoreeElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kevoree.impl.KevoreeElementImpl
     * @see kevoree.impl.KevoreePackageImpl#getKevoreeElement()
     * @generated
     */
    EClass KEVOREE_ELEMENT = eINSTANCE.getKevoreeElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEVOREE_ELEMENT__NAME = eINSTANCE.getKevoreeElement_Name();

  }

} //KevoreePackage
