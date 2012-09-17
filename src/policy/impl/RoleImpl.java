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

import policy.Permission;
import policy.PolicyPackage;
import policy.Role;
import policy.Session;
import policy.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link policy.impl.RoleImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getSsod <em>Ssod</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getSsodOpp <em>Ssod Opp</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getDsod <em>Dsod</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getDsodOpp <em>Dsod Opp</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getRh <em>Rh</em>}</li>
 *   <li>{@link policy.impl.RoleImpl#getRhOpp <em>Rh Opp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends PolicyElementImpl implements Role
{
  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList permissions;

  /**
   * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsers()
   * @generated
   * @ordered
   */
  protected EList users;

  /**
   * The cached value of the '{@link #getSessions() <em>Sessions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessions()
   * @generated
   * @ordered
   */
  protected EList sessions;

  /**
   * The cached value of the '{@link #getSsod() <em>Ssod</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsod()
   * @generated
   * @ordered
   */
  protected EList ssod;

  /**
   * The cached value of the '{@link #getSsodOpp() <em>Ssod Opp</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsodOpp()
   * @generated
   * @ordered
   */
  protected EList ssodOpp;

  /**
   * The cached value of the '{@link #getDsod() <em>Dsod</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsod()
   * @generated
   * @ordered
   */
  protected EList dsod;

  /**
   * The cached value of the '{@link #getDsodOpp() <em>Dsod Opp</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsodOpp()
   * @generated
   * @ordered
   */
  protected EList dsodOpp;

  /**
   * The cached value of the '{@link #getRh() <em>Rh</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRh()
   * @generated
   * @ordered
   */
  protected EList rh;

  /**
   * The cached value of the '{@link #getRhOpp() <em>Rh Opp</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhOpp()
   * @generated
   * @ordered
   */
  protected EList rhOpp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleImpl()
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
    return PolicyPackage.Literals.ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EObjectWithInverseResolvingEList.ManyInverse(Permission.class, this, PolicyPackage.ROLE__PERMISSIONS, PolicyPackage.PERMISSION__ROLES);
    }
    return permissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getUsers()
  {
    if (users == null)
    {
      users = new EObjectWithInverseResolvingEList.ManyInverse(User.class, this, PolicyPackage.ROLE__USERS, PolicyPackage.USER__ROLES);
    }
    return users;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getSessions()
  {
    if (sessions == null)
    {
      sessions = new EObjectWithInverseResolvingEList.ManyInverse(Session.class, this, PolicyPackage.ROLE__SESSIONS, PolicyPackage.SESSION__ROLES);
    }
    return sessions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getSsod()
  {
    if (ssod == null)
    {
      ssod = new EObjectWithInverseResolvingEList.ManyInverse(Role.class, this, PolicyPackage.ROLE__SSOD, PolicyPackage.ROLE__SSOD_OPP);
    }
    return ssod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getSsodOpp()
  {
    if (ssodOpp == null)
    {
      ssodOpp = new EObjectWithInverseResolvingEList.ManyInverse(Role.class, this, PolicyPackage.ROLE__SSOD_OPP, PolicyPackage.ROLE__SSOD);
    }
    return ssodOpp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDsod()
  {
    if (dsod == null)
    {
      dsod = new EObjectWithInverseResolvingEList.ManyInverse(Role.class, this, PolicyPackage.ROLE__DSOD, PolicyPackage.ROLE__DSOD_OPP);
    }
    return dsod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDsodOpp()
  {
    if (dsodOpp == null)
    {
      dsodOpp = new EObjectWithInverseResolvingEList.ManyInverse(Role.class, this, PolicyPackage.ROLE__DSOD_OPP, PolicyPackage.ROLE__DSOD);
    }
    return dsodOpp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRh()
  {
    if (rh == null)
    {
      rh = new EObjectWithInverseResolvingEList.ManyInverse(Role.class, this, PolicyPackage.ROLE__RH, PolicyPackage.ROLE__RH_OPP);
    }
    return rh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRhOpp()
  {
    if (rhOpp == null)
    {
      rhOpp = new EObjectWithInverseResolvingEList.ManyInverse(Role.class, this, PolicyPackage.ROLE__RH_OPP, PolicyPackage.ROLE__RH);
    }
    return rhOpp;
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
      case PolicyPackage.ROLE__PERMISSIONS:
        return ((InternalEList)getPermissions()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__USERS:
        return ((InternalEList)getUsers()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__SESSIONS:
        return ((InternalEList)getSessions()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__SSOD:
        return ((InternalEList)getSsod()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__SSOD_OPP:
        return ((InternalEList)getSsodOpp()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__DSOD:
        return ((InternalEList)getDsod()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__DSOD_OPP:
        return ((InternalEList)getDsodOpp()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__RH:
        return ((InternalEList)getRh()).basicAdd(otherEnd, msgs);
      case PolicyPackage.ROLE__RH_OPP:
        return ((InternalEList)getRhOpp()).basicAdd(otherEnd, msgs);
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
      case PolicyPackage.ROLE__PERMISSIONS:
        return ((InternalEList)getPermissions()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__USERS:
        return ((InternalEList)getUsers()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__SESSIONS:
        return ((InternalEList)getSessions()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__SSOD:
        return ((InternalEList)getSsod()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__SSOD_OPP:
        return ((InternalEList)getSsodOpp()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__DSOD:
        return ((InternalEList)getDsod()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__DSOD_OPP:
        return ((InternalEList)getDsodOpp()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__RH:
        return ((InternalEList)getRh()).basicRemove(otherEnd, msgs);
      case PolicyPackage.ROLE__RH_OPP:
        return ((InternalEList)getRhOpp()).basicRemove(otherEnd, msgs);
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
      case PolicyPackage.ROLE__PERMISSIONS:
        return getPermissions();
      case PolicyPackage.ROLE__USERS:
        return getUsers();
      case PolicyPackage.ROLE__SESSIONS:
        return getSessions();
      case PolicyPackage.ROLE__SSOD:
        return getSsod();
      case PolicyPackage.ROLE__SSOD_OPP:
        return getSsodOpp();
      case PolicyPackage.ROLE__DSOD:
        return getDsod();
      case PolicyPackage.ROLE__DSOD_OPP:
        return getDsodOpp();
      case PolicyPackage.ROLE__RH:
        return getRh();
      case PolicyPackage.ROLE__RH_OPP:
        return getRhOpp();
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
      case PolicyPackage.ROLE__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__USERS:
        getUsers().clear();
        getUsers().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__SESSIONS:
        getSessions().clear();
        getSessions().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__SSOD:
        getSsod().clear();
        getSsod().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__SSOD_OPP:
        getSsodOpp().clear();
        getSsodOpp().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__DSOD:
        getDsod().clear();
        getDsod().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__DSOD_OPP:
        getDsodOpp().clear();
        getDsodOpp().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__RH:
        getRh().clear();
        getRh().addAll((Collection)newValue);
        return;
      case PolicyPackage.ROLE__RH_OPP:
        getRhOpp().clear();
        getRhOpp().addAll((Collection)newValue);
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
      case PolicyPackage.ROLE__PERMISSIONS:
        getPermissions().clear();
        return;
      case PolicyPackage.ROLE__USERS:
        getUsers().clear();
        return;
      case PolicyPackage.ROLE__SESSIONS:
        getSessions().clear();
        return;
      case PolicyPackage.ROLE__SSOD:
        getSsod().clear();
        return;
      case PolicyPackage.ROLE__SSOD_OPP:
        getSsodOpp().clear();
        return;
      case PolicyPackage.ROLE__DSOD:
        getDsod().clear();
        return;
      case PolicyPackage.ROLE__DSOD_OPP:
        getDsodOpp().clear();
        return;
      case PolicyPackage.ROLE__RH:
        getRh().clear();
        return;
      case PolicyPackage.ROLE__RH_OPP:
        getRhOpp().clear();
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
      case PolicyPackage.ROLE__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
      case PolicyPackage.ROLE__USERS:
        return users != null && !users.isEmpty();
      case PolicyPackage.ROLE__SESSIONS:
        return sessions != null && !sessions.isEmpty();
      case PolicyPackage.ROLE__SSOD:
        return ssod != null && !ssod.isEmpty();
      case PolicyPackage.ROLE__SSOD_OPP:
        return ssodOpp != null && !ssodOpp.isEmpty();
      case PolicyPackage.ROLE__DSOD:
        return dsod != null && !dsod.isEmpty();
      case PolicyPackage.ROLE__DSOD_OPP:
        return dsodOpp != null && !dsodOpp.isEmpty();
      case PolicyPackage.ROLE__RH:
        return rh != null && !rh.isEmpty();
      case PolicyPackage.ROLE__RH_OPP:
        return rhOpp != null && !rhOpp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RoleImpl
