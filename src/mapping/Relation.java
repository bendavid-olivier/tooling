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
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.Relation#getElement <em>Element</em>}</li>
 *   <li>{@link mapping.Relation#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends MappingElement
{
  /**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Element)
	 * @see mapping.MappingPackage#getRelation_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
  Element getElement();

  /**
	 * Sets the value of the '{@link mapping.Relation#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
  void setElement(Element value);

  /**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.Element}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see mapping.MappingPackage#getRelation_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
  EList<Element> getElements();

} // Relation
