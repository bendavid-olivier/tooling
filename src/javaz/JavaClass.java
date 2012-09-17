/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package javaz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link javaz.JavaClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link javaz.JavaClass#getFields <em>Fields</em>}</li>
 *   <li>{@link javaz.JavaClass#getImports <em>Imports</em>}</li>
 *   <li>{@link javaz.JavaClass#getPackage <em>Package</em>}</li>
 *   <li>{@link javaz.JavaClass#getKind <em>Kind</em>}</li>
 *   <li>{@link javaz.JavaClass#isPublic <em>Public</em>}</li>
 *   <li>{@link javaz.JavaClass#isFinal <em>Final</em>}</li>
 *   <li>{@link javaz.JavaClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link javaz.JavaClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link javaz.JavaClass#isRewritable <em>Rewritable</em>}</li>
 *   <li>{@link javaz.JavaClass#isNeedToGenerate <em>Need To Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @see javaz.JavazPackage#getJavaClass()
 * @model
 * @generated
 */
public interface JavaClass extends JavaElement {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link javaz.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see javaz.JavazPackage#getJavaClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link javaz.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see javaz.JavazPackage#getJavaClass_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link javaz.JavaClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see javaz.JavazPackage#getJavaClass_Imports()
	 * @model
	 * @generated
	 */
	EList<JavaClass> getImports();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(JavaPackageX)
	 * @see javaz.JavazPackage#getJavaClass_Package()
	 * @model
	 * @generated
	 */
	JavaPackageX getPackage();

	/**
	 * Sets the value of the '{@link javaz.JavaClass#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(JavaPackageX value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link javaz.JavaKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see javaz.JavaKind
	 * @see #setKind(JavaKind)
	 * @see javaz.JavazPackage#getJavaClass_Kind()
	 * @model
	 * @generated
	 */
	JavaKind getKind();

	/**
	 * Sets the value of the '{@link javaz.JavaClass#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see javaz.JavaKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(JavaKind value);

	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see javaz.JavazPackage#getJavaClass_Public()
	 * @model
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link javaz.JavaClass#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see javaz.JavazPackage#getJavaClass_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link javaz.JavaClass#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(JavaClass)
	 * @see javaz.JavazPackage#getJavaClass_Extends()
	 * @model
	 * @generated
	 */
	JavaClass getExtends();

	/**
	 * Sets the value of the '{@link javaz.JavaClass#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(JavaClass value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link javaz.JavaClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see javaz.JavazPackage#getJavaClass_Implements()
	 * @model
	 * @generated
	 */
	EList<JavaClass> getImplements();

	/**
	 * Returns the value of the '<em><b>Rewritable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewritable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewritable</em>' attribute.
	 * @see #setRewritable(boolean)
	 * @see javaz.JavazPackage#getJavaClass_Rewritable()
	 * @model
	 * @generated
	 */
	boolean isRewritable();

	/**
	 * Sets the value of the '{@link javaz.JavaClass#isRewritable <em>Rewritable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewritable</em>' attribute.
	 * @see #isRewritable()
	 * @generated
	 */
	void setRewritable(boolean value);

	/**
	 * Returns the value of the '<em><b>Need To Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need To Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need To Generate</em>' attribute.
	 * @see #setNeedToGenerate(boolean)
	 * @see javaz.JavazPackage#getJavaClass_NeedToGenerate()
	 * @model
	 * @generated
	 */
	boolean isNeedToGenerate();

	/**
	 * Sets the value of the '{@link javaz.JavaClass#isNeedToGenerate <em>Need To Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need To Generate</em>' attribute.
	 * @see #isNeedToGenerate()
	 * @generated
	 */
	void setNeedToGenerate(boolean value);

} // JavaClass
