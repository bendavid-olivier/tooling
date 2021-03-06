/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package policy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import policy.PolicyElement;
import policy.PolicyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link policy.impl.PolicyElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link policy.impl.PolicyElementImpl#getArchType <em>Arch Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PolicyElementImpl extends EObjectImpl implements PolicyElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getArchType() <em>Arch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchType()
   * @generated
   * @ordered
   */
  protected static final String ARCH_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArchType() <em>Arch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchType()
   * @generated
   * @ordered
   */
  protected String archType = ARCH_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolicyElementImpl()
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
    return PolicyPackage.Literals.POLICY_ELEMENT;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArchType()
  {
    return archType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchType(String newArchType)
  {
    String oldArchType = archType;
    archType = newArchType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY_ELEMENT__ARCH_TYPE, oldArchType, archType));
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
      case PolicyPackage.POLICY_ELEMENT__NAME:
        return getName();
      case PolicyPackage.POLICY_ELEMENT__ARCH_TYPE:
        return getArchType();
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
      case PolicyPackage.POLICY_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case PolicyPackage.POLICY_ELEMENT__ARCH_TYPE:
        setArchType((String)newValue);
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
      case PolicyPackage.POLICY_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PolicyPackage.POLICY_ELEMENT__ARCH_TYPE:
        setArchType(ARCH_TYPE_EDEFAULT);
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
      case PolicyPackage.POLICY_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PolicyPackage.POLICY_ELEMENT__ARCH_TYPE:
        return ARCH_TYPE_EDEFAULT == null ? archType != null : !ARCH_TYPE_EDEFAULT.equals(archType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", archType: ");
    result.append(archType);
    result.append(')');
    return result.toString();
  }

} //PolicyElementImpl
