/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.Binding;
import kevoree.Channel;
import kevoree.Kevoree;
import kevoree.KevoreePackage;
import kevoree.Node;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kevoree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.KevoreeImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link kevoree.impl.KevoreeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link kevoree.impl.KevoreeImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KevoreeImpl extends EObjectImpl implements Kevoree
{
  /**
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
  protected EList channels;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList nodes;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList bindings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KevoreeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return KevoreePackage.Literals.KEVOREE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getChannels()
  {
    if (channels == null)
    {
      channels = new EObjectContainmentEList(Channel.class, this, KevoreePackage.KEVOREE__CHANNELS);
    }
    return channels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList(Node.class, this, KevoreePackage.KEVOREE__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList(Binding.class, this, KevoreePackage.KEVOREE__BINDINGS);
    }
    return bindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KevoreePackage.KEVOREE__CHANNELS:
        return ((InternalEList)getChannels()).basicRemove(otherEnd, msgs);
      case KevoreePackage.KEVOREE__NODES:
        return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
      case KevoreePackage.KEVOREE__BINDINGS:
        return ((InternalEList)getBindings()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KevoreePackage.KEVOREE__CHANNELS:
        return getChannels();
      case KevoreePackage.KEVOREE__NODES:
        return getNodes();
      case KevoreePackage.KEVOREE__BINDINGS:
        return getBindings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KevoreePackage.KEVOREE__CHANNELS:
        getChannels().clear();
        getChannels().addAll((Collection)newValue);
        return;
      case KevoreePackage.KEVOREE__NODES:
        getNodes().clear();
        getNodes().addAll((Collection)newValue);
        return;
      case KevoreePackage.KEVOREE__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KevoreePackage.KEVOREE__CHANNELS:
        getChannels().clear();
        return;
      case KevoreePackage.KEVOREE__NODES:
        getNodes().clear();
        return;
      case KevoreePackage.KEVOREE__BINDINGS:
        getBindings().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KevoreePackage.KEVOREE__CHANNELS:
        return channels != null && !channels.isEmpty();
      case KevoreePackage.KEVOREE__NODES:
        return nodes != null && !nodes.isEmpty();
      case KevoreePackage.KEVOREE__BINDINGS:
        return bindings != null && !bindings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //KevoreeImpl
