/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package javaz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link javaz.JavaParameter#isFinal <em>Final</em>}</li>
 *   <li>{@link javaz.JavaParameter#getParameterKind <em>Parameter Kind</em>}</li>
 *   <li>{@link javaz.JavaParameter#getType <em>Type</em>}</li>
 *   <li>{@link javaz.JavaParameter#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see javaz.JavazPackage#getJavaParameter()
 * @model
 * @generated
 */
public interface JavaParameter extends JavaElement {
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
	 * @see javaz.JavazPackage#getJavaParameter_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link javaz.JavaParameter#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link javaz.JavaParameterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Kind</em>' attribute.
	 * @see javaz.JavaParameterKind
	 * @see #setParameterKind(JavaParameterKind)
	 * @see javaz.JavazPackage#getJavaParameter_ParameterKind()
	 * @model
	 * @generated
	 */
	JavaParameterKind getParameterKind();

	/**
	 * Sets the value of the '{@link javaz.JavaParameter#getParameterKind <em>Parameter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Kind</em>' attribute.
	 * @see javaz.JavaParameterKind
	 * @see #getParameterKind()
	 * @generated
	 */
	void setParameterKind(JavaParameterKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see javaz.JavazPackage#getJavaParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link javaz.JavaParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link javaz.JavaParameterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see javaz.JavaParameterKind
	 * @see #setKind(JavaParameterKind)
	 * @see javaz.JavazPackage#getJavaParameter_Kind()
	 * @model
	 * @generated
	 */
	JavaParameterKind getKind();

	/**
	 * Sets the value of the '{@link javaz.JavaParameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see javaz.JavaParameterKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(JavaParameterKind value);

} // JavaParameter
