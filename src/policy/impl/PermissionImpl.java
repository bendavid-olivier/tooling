/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package policy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import policy.Operation;
import policy.Permission;
import policy.PolicyPackage;
import policy.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link policy.impl.PermissionImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link policy.impl.PermissionImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link policy.impl.PermissionImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PermissionImpl extends PolicyElementImpl implements Permission
{
  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList operations;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList objects;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList roles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PermissionImpl()
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
    return PolicyPackage.Literals.PERMISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectWithInverseResolvingEList.ManyInverse(Operation.class, this, PolicyPackage.PERMISSION__OPERATIONS, PolicyPackage.OPERATION__PERMISSIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectWithInverseResolvingEList.ManyInverse(policy.Object.class, this, PolicyPackage.PERMISSION__OBJECTS, PolicyPackage.OBJECT__PERMISSIONS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectWithInverseResolvingEList.ManyInverse(Role.class, this, PolicyPackage.PERMISSION__ROLES, PolicyPackage.ROLE__PERMISSIONS);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PolicyPackage.PERMISSION__OPERATIONS:
        return ((InternalEList)getOperations()).basicAdd(otherEnd, msgs);
      case PolicyPackage.PERMISSION__OBJECTS:
        return ((InternalEList)getObjects()).basicAdd(otherEnd, msgs);
      case PolicyPackage.PERMISSION__ROLES:
        return ((InternalEList)getRoles()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case PolicyPackage.PERMISSION__OPERATIONS:
        return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
      case PolicyPackage.PERMISSION__OBJECTS:
        return ((InternalEList)getObjects()).basicRemove(otherEnd, msgs);
      case PolicyPackage.PERMISSION__ROLES:
        return ((InternalEList)getRoles()).basicRemove(otherEnd, msgs);
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
      case PolicyPackage.PERMISSION__OPERATIONS:
        return getOperations();
      case PolicyPackage.PERMISSION__OBJECTS:
        return getObjects();
      case PolicyPackage.PERMISSION__ROLES:
        return getRoles();
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
      case PolicyPackage.PERMISSION__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection)newValue);
        return;
      case PolicyPackage.PERMISSION__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection)newValue);
        return;
      case PolicyPackage.PERMISSION__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection)newValue);
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
      case PolicyPackage.PERMISSION__OPERATIONS:
        getOperations().clear();
        return;
      case PolicyPackage.PERMISSION__OBJECTS:
        getObjects().clear();
        return;
      case PolicyPackage.PERMISSION__ROLES:
        getRoles().clear();
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
      case PolicyPackage.PERMISSION__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case PolicyPackage.PERMISSION__OBJECTS:
        return objects != null && !objects.isEmpty();
      case PolicyPackage.PERMISSION__ROLES:
        return roles != null && !roles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PermissionImpl
