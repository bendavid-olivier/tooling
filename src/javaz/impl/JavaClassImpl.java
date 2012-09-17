/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package javaz.impl;

import java.util.Collection;

import javaz.Field;
import javaz.JavaClass;
import javaz.JavaKind;
import javaz.JavaPackageX;
import javaz.JavazPackage;
import javaz.Method;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link javaz.impl.JavaClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#isRewritable <em>Rewritable</em>}</li>
 *   <li>{@link javaz.impl.JavaClassImpl#isNeedToGenerate <em>Need To Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaClassImpl extends JavaElementImpl implements JavaClass {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaClass> imports;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected JavaPackageX package_;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final JavaKind KIND_EDEFAULT = JavaKind.CLASS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected JavaKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean public_ = PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected JavaClass extends_;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaClass> implements_;

	/**
	 * The default value of the '{@link #isRewritable() <em>Rewritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRewritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REWRITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRewritable() <em>Rewritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRewritable()
	 * @generated
	 * @ordered
	 */
	protected boolean rewritable = REWRITABLE_EDEFAULT;

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
	protected JavaClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavazPackage.Literals.JAVA_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, JavazPackage.JAVA_CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, JavazPackage.JAVA_CLASS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaClass> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<JavaClass>(JavaClass.class, this, JavazPackage.JAVA_CLASS__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackageX getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (JavaPackageX)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavazPackage.JAVA_CLASS__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackageX basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(JavaPackageX newPackage) {
		JavaPackageX oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_CLASS__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(JavaKind newKind) {
		JavaKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_CLASS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublic() {
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic(boolean newPublic) {
		boolean oldPublic = public_;
		public_ = newPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_CLASS__PUBLIC, oldPublic, public_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_CLASS__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (JavaClass)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavazPackage.JAVA_CLASS__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(JavaClass newExtends) {
		JavaClass oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_CLASS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaClass> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<JavaClass>(JavaClass.class, this, JavazPackage.JAVA_CLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRewritable() {
		return rewritable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewritable(boolean newRewritable) {
		boolean oldRewritable = rewritable;
		rewritable = newRewritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_CLASS__REWRITABLE, oldRewritable, rewritable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavazPackage.JAVA_CLASS__NEED_TO_GENERATE, oldNeedToGenerate, needToGenerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavazPackage.JAVA_CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case JavazPackage.JAVA_CLASS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavazPackage.JAVA_CLASS__METHODS:
				return getMethods();
			case JavazPackage.JAVA_CLASS__FIELDS:
				return getFields();
			case JavazPackage.JAVA_CLASS__IMPORTS:
				return getImports();
			case JavazPackage.JAVA_CLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case JavazPackage.JAVA_CLASS__KIND:
				return getKind();
			case JavazPackage.JAVA_CLASS__PUBLIC:
				return isPublic();
			case JavazPackage.JAVA_CLASS__FINAL:
				return isFinal();
			case JavazPackage.JAVA_CLASS__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case JavazPackage.JAVA_CLASS__IMPLEMENTS:
				return getImplements();
			case JavazPackage.JAVA_CLASS__REWRITABLE:
				return isRewritable();
			case JavazPackage.JAVA_CLASS__NEED_TO_GENERATE:
				return isNeedToGenerate();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavazPackage.JAVA_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case JavazPackage.JAVA_CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case JavazPackage.JAVA_CLASS__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends JavaClass>)newValue);
				return;
			case JavazPackage.JAVA_CLASS__PACKAGE:
				setPackage((JavaPackageX)newValue);
				return;
			case JavazPackage.JAVA_CLASS__KIND:
				setKind((JavaKind)newValue);
				return;
			case JavazPackage.JAVA_CLASS__PUBLIC:
				setPublic((Boolean)newValue);
				return;
			case JavazPackage.JAVA_CLASS__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JavazPackage.JAVA_CLASS__EXTENDS:
				setExtends((JavaClass)newValue);
				return;
			case JavazPackage.JAVA_CLASS__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends JavaClass>)newValue);
				return;
			case JavazPackage.JAVA_CLASS__REWRITABLE:
				setRewritable((Boolean)newValue);
				return;
			case JavazPackage.JAVA_CLASS__NEED_TO_GENERATE:
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
			case JavazPackage.JAVA_CLASS__METHODS:
				getMethods().clear();
				return;
			case JavazPackage.JAVA_CLASS__FIELDS:
				getFields().clear();
				return;
			case JavazPackage.JAVA_CLASS__IMPORTS:
				getImports().clear();
				return;
			case JavazPackage.JAVA_CLASS__PACKAGE:
				setPackage((JavaPackageX)null);
				return;
			case JavazPackage.JAVA_CLASS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case JavazPackage.JAVA_CLASS__PUBLIC:
				setPublic(PUBLIC_EDEFAULT);
				return;
			case JavazPackage.JAVA_CLASS__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JavazPackage.JAVA_CLASS__EXTENDS:
				setExtends((JavaClass)null);
				return;
			case JavazPackage.JAVA_CLASS__IMPLEMENTS:
				getImplements().clear();
				return;
			case JavazPackage.JAVA_CLASS__REWRITABLE:
				setRewritable(REWRITABLE_EDEFAULT);
				return;
			case JavazPackage.JAVA_CLASS__NEED_TO_GENERATE:
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
			case JavazPackage.JAVA_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case JavazPackage.JAVA_CLASS__FIELDS:
				return fields != null && !fields.isEmpty();
			case JavazPackage.JAVA_CLASS__IMPORTS:
				return imports != null && !imports.isEmpty();
			case JavazPackage.JAVA_CLASS__PACKAGE:
				return package_ != null;
			case JavazPackage.JAVA_CLASS__KIND:
				return kind != KIND_EDEFAULT;
			case JavazPackage.JAVA_CLASS__PUBLIC:
				return public_ != PUBLIC_EDEFAULT;
			case JavazPackage.JAVA_CLASS__FINAL:
				return final_ != FINAL_EDEFAULT;
			case JavazPackage.JAVA_CLASS__EXTENDS:
				return extends_ != null;
			case JavazPackage.JAVA_CLASS__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case JavazPackage.JAVA_CLASS__REWRITABLE:
				return rewritable != REWRITABLE_EDEFAULT;
			case JavazPackage.JAVA_CLASS__NEED_TO_GENERATE:
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", public: ");
		result.append(public_);
		result.append(", final: ");
		result.append(final_);
		result.append(", rewritable: ");
		result.append(rewritable);
		result.append(", needToGenerate: ");
		result.append(needToGenerate);
		result.append(')');
		return result.toString();
	}

} //JavaClassImpl
