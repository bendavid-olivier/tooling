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
 * A representation of the model object '<em><b>Javaz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link javaz.Javaz#getPackages <em>Packages</em>}</li>
 *   <li>{@link javaz.Javaz#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see javaz.JavazPackage#getJavaz()
 * @model
 * @generated
 */
public interface Javaz extends JavaElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link javaz.JavaPackageX}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see javaz.JavazPackage#getJavaz_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaPackageX> getPackages();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link javaz.JavaClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see javaz.JavazPackage#getJavaz_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaClass> getClasses();

} // Javaz
