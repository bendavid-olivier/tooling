/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.Mapping#getRelations <em>Relations</em>}</li>
 *   <li>{@link mapping.Mapping#getModelA <em>Model A</em>}</li>
 *   <li>{@link mapping.Mapping#getModelB <em>Model B</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends MappingElement
{
  /**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.Relation}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see mapping.MappingPackage#getMapping_Relations()
	 * @model containment="true"
	 * @generated
	 */
  EList<Relation> getRelations();

		/**
	 * Returns the value of the '<em><b>Model A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model A</em>' attribute.
	 * @see #setModelA(String)
	 * @see mapping.MappingPackage#getMapping_ModelA()
	 * @model
	 * @generated
	 */
	String getModelA();

		/**
	 * Sets the value of the '{@link mapping.Mapping#getModelA <em>Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model A</em>' attribute.
	 * @see #getModelA()
	 * @generated
	 */
	void setModelA(String value);

		/**
	 * Returns the value of the '<em><b>Model B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model B</em>' attribute.
	 * @see #setModelB(String)
	 * @see mapping.MappingPackage#getMapping_ModelB()
	 * @model
	 * @generated
	 */
	String getModelB();

		/**
	 * Sets the value of the '{@link mapping.Mapping#getModelB <em>Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model B</em>' attribute.
	 * @see #getModelB()
	 * @generated
	 */
	void setModelB(String value);

} // Mapping
