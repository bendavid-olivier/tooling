/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kevoree.impl;

import java.util.Collection;

import kevoree.Component;
import kevoree.KevoreePackage;
import kevoree.Port;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kevoree.impl.ComponentImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link kevoree.impl.ComponentImpl#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends KevoreeElementImpl implements Component
{
  /**
   * The cached value of the '{@link #getProvided() <em>Provided</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvided()
   * @generated
   * @ordered
   */
  protected EList provided;

  /**
   * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected EList required;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return KevoreePackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getProvided()
  {
    if (provided == null)
    {
      provided = new EObjectContainmentEList(Port.class, this, KevoreePackage.COMPONENT__PROVIDED);
    }
    return provided;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRequired()
  {
    if (required == null)
    {
      required = new EObjectContainmentEList(Port.class, this, KevoreePackage.COMPONENT__REQUIRED);
    }
    return required;
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
      case KevoreePackage.COMPONENT__PROVIDED:
        return ((InternalEList)getProvided()).basicRemove(otherEnd, msgs);
      case KevoreePackage.COMPONENT__REQUIRED:
        return ((InternalEList)getRequired()).basicRemove(otherEnd, msgs);
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
      case KevoreePackage.COMPONENT__PROVIDED:
        return getProvided();
      case KevoreePackage.COMPONENT__REQUIRED:
        return getRequired();
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
      case KevoreePackage.COMPONENT__PROVIDED:
        getProvided().clear();
        getProvided().addAll((Collection)newValue);
        return;
      case KevoreePackage.COMPONENT__REQUIRED:
        getRequired().clear();
        getRequired().addAll((Collection)newValue);
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
      case KevoreePackage.COMPONENT__PROVIDED:
        getProvided().clear();
        return;
      case KevoreePackage.COMPONENT__REQUIRED:
        getRequired().clear();
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
      case KevoreePackage.COMPONENT__PROVIDED:
        return provided != null && !provided.isEmpty();
      case KevoreePackage.COMPONENT__REQUIRED:
        return required != null && !required.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentImpl
