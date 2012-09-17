/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package javaz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see javaz.JavazFactory
 * @model kind="package"
 * @generated
 */
public interface JavazPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "javaz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavazPackage eINSTANCE = javaz.impl.JavazPackageImpl.init();

	/**
	 * The meta object id for the '{@link javaz.impl.JavaElementImpl <em>Java Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.JavaElementImpl
	 * @see javaz.impl.JavazPackageImpl#getJavaElement()
	 * @generated
	 */
	int JAVA_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Java Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link javaz.impl.JavazImpl <em>Javaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.JavazImpl
	 * @see javaz.impl.JavazPackageImpl#getJavaz()
	 * @generated
	 */
	int JAVAZ = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVAZ__NAME = JAVA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVAZ__PACKAGES = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVAZ__CLASSES = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Javaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVAZ_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link javaz.impl.JavaClassImpl <em>Java Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.JavaClassImpl
	 * @see javaz.impl.JavazPackageImpl#getJavaClass()
	 * @generated
	 */
	int JAVA_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__NAME = JAVA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__METHODS = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__FIELDS = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__IMPORTS = JAVA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__PACKAGE = JAVA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__KIND = JAVA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__PUBLIC = JAVA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__FINAL = JAVA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__EXTENDS = JAVA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__IMPLEMENTS = JAVA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rewritable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__REWRITABLE = JAVA_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Need To Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__NEED_TO_GENERATE = JAVA_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Java Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link javaz.impl.JavaPackageXImpl <em>Java Package X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.JavaPackageXImpl
	 * @see javaz.impl.JavazPackageImpl#getJavaPackageX()
	 * @generated
	 */
	int JAVA_PACKAGE_X = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_X__NAME = JAVA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Need To Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_X__NEED_TO_GENERATE = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Package X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACKAGE_X_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link javaz.impl.JavaParameterImpl <em>Java Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.JavaParameterImpl
	 * @see javaz.impl.JavazPackageImpl#getJavaParameter()
	 * @generated
	 */
	int JAVA_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__NAME = JAVA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__FINAL = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__PARAMETER_KIND = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__TYPE = JAVA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER__KIND = JAVA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Java Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PARAMETER_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link javaz.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.MethodImpl
	 * @see javaz.impl.JavazPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = JAVA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FINAL = JAVA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATIC = JAVA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SYNCHRONIZED = JAVA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONSTRUCTOR = JAVA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NATIVE = JAVA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ABSTRACT = JAVA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BLOCK = JAVA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link javaz.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.FieldImpl
	 * @see javaz.impl.JavazPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = JAVA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VISIBILITY = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__STATIC = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TRANSIENT = JAVA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VOLATILE = JAVA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FINAL = JAVA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = JAVA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link javaz.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.impl.BlockImpl
	 * @see javaz.impl.JavazPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link javaz.JavaVisibilityKind <em>Java Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.JavaVisibilityKind
	 * @see javaz.impl.JavazPackageImpl#getJavaVisibilityKind()
	 * @generated
	 */
	int JAVA_VISIBILITY_KIND = 8;

	/**
	 * The meta object id for the '{@link javaz.JavaKind <em>Java Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.JavaKind
	 * @see javaz.impl.JavazPackageImpl#getJavaKind()
	 * @generated
	 */
	int JAVA_KIND = 9;

	/**
	 * The meta object id for the '{@link javaz.JavaParameterKind <em>Java Parameter Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaz.JavaParameterKind
	 * @see javaz.impl.JavazPackageImpl#getJavaParameterKind()
	 * @generated
	 */
	int JAVA_PARAMETER_KIND = 10;


	/**
	 * Returns the meta object for class '{@link javaz.Javaz <em>Javaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Javaz</em>'.
	 * @see javaz.Javaz
	 * @generated
	 */
	EClass getJavaz();

	/**
	 * Returns the meta object for the containment reference list '{@link javaz.Javaz#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see javaz.Javaz#getPackages()
	 * @see #getJavaz()
	 * @generated
	 */
	EReference getJavaz_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link javaz.Javaz#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see javaz.Javaz#getClasses()
	 * @see #getJavaz()
	 * @generated
	 */
	EReference getJavaz_Classes();

	/**
	 * Returns the meta object for class '{@link javaz.JavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Class</em>'.
	 * @see javaz.JavaClass
	 * @generated
	 */
	EClass getJavaClass();

	/**
	 * Returns the meta object for the containment reference list '{@link javaz.JavaClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see javaz.JavaClass#getMethods()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link javaz.JavaClass#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see javaz.JavaClass#getFields()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Fields();

	/**
	 * Returns the meta object for the reference list '{@link javaz.JavaClass#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see javaz.JavaClass#getImports()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Imports();

	/**
	 * Returns the meta object for the reference '{@link javaz.JavaClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see javaz.JavaClass#getPackage()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Package();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaClass#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see javaz.JavaClass#getKind()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_Kind();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaClass#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see javaz.JavaClass#isPublic()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_Public();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaClass#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see javaz.JavaClass#isFinal()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_Final();

	/**
	 * Returns the meta object for the reference '{@link javaz.JavaClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see javaz.JavaClass#getExtends()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Extends();

	/**
	 * Returns the meta object for the reference list '{@link javaz.JavaClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see javaz.JavaClass#getImplements()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Implements();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaClass#isRewritable <em>Rewritable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rewritable</em>'.
	 * @see javaz.JavaClass#isRewritable()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_Rewritable();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaClass#isNeedToGenerate <em>Need To Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need To Generate</em>'.
	 * @see javaz.JavaClass#isNeedToGenerate()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_NeedToGenerate();

	/**
	 * Returns the meta object for class '{@link javaz.JavaPackageX <em>Java Package X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Package X</em>'.
	 * @see javaz.JavaPackageX
	 * @generated
	 */
	EClass getJavaPackageX();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaPackageX#isNeedToGenerate <em>Need To Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need To Generate</em>'.
	 * @see javaz.JavaPackageX#isNeedToGenerate()
	 * @see #getJavaPackageX()
	 * @generated
	 */
	EAttribute getJavaPackageX_NeedToGenerate();

	/**
	 * Returns the meta object for class '{@link javaz.JavaParameter <em>Java Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Parameter</em>'.
	 * @see javaz.JavaParameter
	 * @generated
	 */
	EClass getJavaParameter();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaParameter#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see javaz.JavaParameter#isFinal()
	 * @see #getJavaParameter()
	 * @generated
	 */
	EAttribute getJavaParameter_Final();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaParameter#getParameterKind <em>Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Kind</em>'.
	 * @see javaz.JavaParameter#getParameterKind()
	 * @see #getJavaParameter()
	 * @generated
	 */
	EAttribute getJavaParameter_ParameterKind();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see javaz.JavaParameter#getType()
	 * @see #getJavaParameter()
	 * @generated
	 */
	EAttribute getJavaParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaParameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see javaz.JavaParameter#getKind()
	 * @see #getJavaParameter()
	 * @generated
	 */
	EAttribute getJavaParameter_Kind();

	/**
	 * Returns the meta object for class '{@link javaz.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see javaz.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link javaz.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see javaz.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see javaz.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Method#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see javaz.Method#isFinal()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Final();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Method#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see javaz.Method#isStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Static();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Method#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see javaz.Method#isSynchronized()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Synchronized();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Method#isConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor</em>'.
	 * @see javaz.Method#isConstructor()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Constructor();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Method#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see javaz.Method#isNative()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Native();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Method#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see javaz.Method#isAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link javaz.Method#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see javaz.Method#getBlock()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Block();

	/**
	 * Returns the meta object for class '{@link javaz.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see javaz.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Field#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see javaz.Field#getVisibility()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Field#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see javaz.Field#isStatic()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Static();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Field#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see javaz.Field#isTransient()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Transient();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Field#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see javaz.Field#isVolatile()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Field#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see javaz.Field#isFinal()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Final();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see javaz.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for class '{@link javaz.JavaElement <em>Java Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Element</em>'.
	 * @see javaz.JavaElement
	 * @generated
	 */
	EClass getJavaElement();

	/**
	 * Returns the meta object for the attribute '{@link javaz.JavaElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see javaz.JavaElement#getName()
	 * @see #getJavaElement()
	 * @generated
	 */
	EAttribute getJavaElement_Name();

	/**
	 * Returns the meta object for class '{@link javaz.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see javaz.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link javaz.Block#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see javaz.Block#getContent()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Content();

	/**
	 * Returns the meta object for enum '{@link javaz.JavaVisibilityKind <em>Java Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Visibility Kind</em>'.
	 * @see javaz.JavaVisibilityKind
	 * @generated
	 */
	EEnum getJavaVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link javaz.JavaKind <em>Java Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Kind</em>'.
	 * @see javaz.JavaKind
	 * @generated
	 */
	EEnum getJavaKind();

	/**
	 * Returns the meta object for enum '{@link javaz.JavaParameterKind <em>Java Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Parameter Kind</em>'.
	 * @see javaz.JavaParameterKind
	 * @generated
	 */
	EEnum getJavaParameterKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavazFactory getJavazFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link javaz.impl.JavazImpl <em>Javaz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.JavazImpl
		 * @see javaz.impl.JavazPackageImpl#getJavaz()
		 * @generated
		 */
		EClass JAVAZ = eINSTANCE.getJavaz();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVAZ__PACKAGES = eINSTANCE.getJavaz_Packages();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVAZ__CLASSES = eINSTANCE.getJavaz_Classes();

		/**
		 * The meta object literal for the '{@link javaz.impl.JavaClassImpl <em>Java Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.JavaClassImpl
		 * @see javaz.impl.JavazPackageImpl#getJavaClass()
		 * @generated
		 */
		EClass JAVA_CLASS = eINSTANCE.getJavaClass();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__METHODS = eINSTANCE.getJavaClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__FIELDS = eINSTANCE.getJavaClass_Fields();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__IMPORTS = eINSTANCE.getJavaClass_Imports();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__PACKAGE = eINSTANCE.getJavaClass_Package();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__KIND = eINSTANCE.getJavaClass_Kind();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__PUBLIC = eINSTANCE.getJavaClass_Public();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__FINAL = eINSTANCE.getJavaClass_Final();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__EXTENDS = eINSTANCE.getJavaClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__IMPLEMENTS = eINSTANCE.getJavaClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Rewritable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__REWRITABLE = eINSTANCE.getJavaClass_Rewritable();

		/**
		 * The meta object literal for the '<em><b>Need To Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__NEED_TO_GENERATE = eINSTANCE.getJavaClass_NeedToGenerate();

		/**
		 * The meta object literal for the '{@link javaz.impl.JavaPackageXImpl <em>Java Package X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.JavaPackageXImpl
		 * @see javaz.impl.JavazPackageImpl#getJavaPackageX()
		 * @generated
		 */
		EClass JAVA_PACKAGE_X = eINSTANCE.getJavaPackageX();

		/**
		 * The meta object literal for the '<em><b>Need To Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACKAGE_X__NEED_TO_GENERATE = eINSTANCE.getJavaPackageX_NeedToGenerate();

		/**
		 * The meta object literal for the '{@link javaz.impl.JavaParameterImpl <em>Java Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.JavaParameterImpl
		 * @see javaz.impl.JavazPackageImpl#getJavaParameter()
		 * @generated
		 */
		EClass JAVA_PARAMETER = eINSTANCE.getJavaParameter();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PARAMETER__FINAL = eINSTANCE.getJavaParameter_Final();

		/**
		 * The meta object literal for the '<em><b>Parameter Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PARAMETER__PARAMETER_KIND = eINSTANCE.getJavaParameter_ParameterKind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PARAMETER__TYPE = eINSTANCE.getJavaParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PARAMETER__KIND = eINSTANCE.getJavaParameter_Kind();

		/**
		 * The meta object literal for the '{@link javaz.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.MethodImpl
		 * @see javaz.impl.JavazPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__FINAL = eINSTANCE.getMethod_Final();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STATIC = eINSTANCE.getMethod_Static();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SYNCHRONIZED = eINSTANCE.getMethod_Synchronized();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CONSTRUCTOR = eINSTANCE.getMethod_Constructor();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NATIVE = eINSTANCE.getMethod_Native();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BLOCK = eINSTANCE.getMethod_Block();

		/**
		 * The meta object literal for the '{@link javaz.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.FieldImpl
		 * @see javaz.impl.JavazPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VISIBILITY = eINSTANCE.getField_Visibility();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__STATIC = eINSTANCE.getField_Static();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TRANSIENT = eINSTANCE.getField_Transient();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VOLATILE = eINSTANCE.getField_Volatile();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FINAL = eINSTANCE.getField_Final();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link javaz.impl.JavaElementImpl <em>Java Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.JavaElementImpl
		 * @see javaz.impl.JavazPackageImpl#getJavaElement()
		 * @generated
		 */
		EClass JAVA_ELEMENT = eINSTANCE.getJavaElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ELEMENT__NAME = eINSTANCE.getJavaElement_Name();

		/**
		 * The meta object literal for the '{@link javaz.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.impl.BlockImpl
		 * @see javaz.impl.JavazPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__CONTENT = eINSTANCE.getBlock_Content();

		/**
		 * The meta object literal for the '{@link javaz.JavaVisibilityKind <em>Java Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.JavaVisibilityKind
		 * @see javaz.impl.JavazPackageImpl#getJavaVisibilityKind()
		 * @generated
		 */
		EEnum JAVA_VISIBILITY_KIND = eINSTANCE.getJavaVisibilityKind();

		/**
		 * The meta object literal for the '{@link javaz.JavaKind <em>Java Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.JavaKind
		 * @see javaz.impl.JavazPackageImpl#getJavaKind()
		 * @generated
		 */
		EEnum JAVA_KIND = eINSTANCE.getJavaKind();

		/**
		 * The meta object literal for the '{@link javaz.JavaParameterKind <em>Java Parameter Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaz.JavaParameterKind
		 * @see javaz.impl.JavazPackageImpl#getJavaParameterKind()
		 * @generated
		 */
		EEnum JAVA_PARAMETER_KIND = eINSTANCE.getJavaParameterKind();

	}

} //JavazPackage
