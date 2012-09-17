/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package javaz.impl;

import javaz.JavaPackageX;
import javaz.JavazPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Package X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link javaz.impl.JavaPackageXImpl#isNeedToGenerate <em>Need To Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaPackageXImpl extends JavaElementImpl implements JavaPackageX {
	/**
	 * The default value of the '{@link #isNeedToGenerate() <em>Need To Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedToGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEED_TO_GENERATE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNeedToGenerate() <em>Need To Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedToGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean needToGenerate = NEED_TO_GENERATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaPackageXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavazPackage.Literals.JAVA_PACKAGE_X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedToGenerate() {
		return needToGenerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedToGenerate(boolean newNeedToGenerate) {
		boolean oldNeedToGenerate = needToGenerate;
		needToGenerate = newNeedToGenerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_PACKAGE_X__NEED_TO_GENERATE, oldNeedToGenerate, needToGenerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavazPackage.JAVA_PACKAGE_X__NEED_TO_GENERATE:
				return isNeedToGenerate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavazPackage.JAVA_PACKAGE_X__NEED_TO_GENERATE:
				setNeedToGenerate((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavazPackage.JAVA_PACKAGE_X__NEED_TO_GENERATE:
				setNeedToGenerate(NEED_TO_GENERATE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavazPackage.JAVA_PACKAGE_X__NEED_TO_GENERATE:
				return needToGenerate != NEED_TO_GENERATE_EDEFAULT;
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
		result.append(" (needToGenerate: ");
		result.append(needToGenerate);
		result.append(')');
		return result.toString();
	}

} //JavaPackageXImpl
