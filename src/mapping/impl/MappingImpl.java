/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapping.impl;

import java.util.Collection;

import mapping.Mapping;
import mapping.MappingPackage;
import mapping.Relation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mapping.impl.MappingImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link mapping.impl.MappingImpl#getModelA <em>Model A</em>}</li>
 *   <li>{@link mapping.impl.MappingImpl#getModelB <em>Model B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MappingElementImpl implements Mapping
{
  /**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
  protected EList<Relation> relations;

  /**
	 * The default value of the '{@link #getModelA() <em>Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelA()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_A_EDEFAULT = null;
		/**
	 * The cached value of the '{@link #getModelA() <em>Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelA()
	 * @generated
	 * @ordered
	 */
	protected String modelA = MODEL_A_EDEFAULT;
		/**
	 * The default value of the '{@link #getModelB() <em>Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelB()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_B_EDEFAULT = null;
		/**
	 * The cached value of the '{@link #getModelB() <em>Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelB()
	 * @generated
	 * @ordered
	 */
	protected String modelB = MODEL_B_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MappingImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		protected EClass eStaticClass()
  {
		return MappingPackage.Literals.MAPPING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Relation> getRelations()
  {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, MappingPackage.MAPPING__RELATIONS);
		}
		return relations;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelA() {
		return modelA;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelA(String newModelA) {
		String oldModelA = modelA;
		modelA = newModelA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__MODEL_A, oldModelA, modelA));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelB() {
		return modelB;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelB(String newModelB) {
		String oldModelB = modelB;
		modelB = newModelB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING__MODEL_B, oldModelB, modelB));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case MappingPackage.MAPPING__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case MappingPackage.MAPPING__RELATIONS:
				return getRelations();
			case MappingPackage.MAPPING__MODEL_A:
				return getModelA();
			case MappingPackage.MAPPING__MODEL_B:
				return getModelB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
			@Override
		public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case MappingPackage.MAPPING__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case MappingPackage.MAPPING__MODEL_A:
				setModelA((String)newValue);
				return;
			case MappingPackage.MAPPING__MODEL_B:
				setModelB((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void eUnset(int featureID)
  {
		switch (featureID) {
			case MappingPackage.MAPPING__RELATIONS:
				getRelations().clear();
				return;
			case MappingPackage.MAPPING__MODEL_A:
				setModelA(MODEL_A_EDEFAULT);
				return;
			case MappingPackage.MAPPING__MODEL_B:
				setModelB(MODEL_B_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case MappingPackage.MAPPING__RELATIONS:
				return relations != null && !relations.isEmpty();
			case MappingPackage.MAPPING__MODEL_A:
				return MODEL_A_EDEFAULT == null ? modelA != null : !MODEL_A_EDEFAULT.equals(modelA);
			case MappingPackage.MAPPING__MODEL_B:
				return MODEL_B_EDEFAULT == null ? modelB != null : !MODEL_B_EDEFAULT.equals(modelB);
		}
		return super.eIsSet(featureID);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelA: ");
		result.append(modelA);
		result.append(", modelB: ");
		result.append(modelB);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
