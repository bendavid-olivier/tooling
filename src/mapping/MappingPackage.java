/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "mapping";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://mapping/1.0";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "mapping";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MappingPackage eINSTANCE = mapping.impl.MappingPackageImpl.init();

  /**
	 * The meta object id for the '{@link mapping.impl.MappingElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see mapping.impl.MappingElementImpl
	 * @see mapping.impl.MappingPackageImpl#getMappingElement()
	 * @generated
	 */
  int MAPPING_ELEMENT = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING_ELEMENT__NAME = 0;

  /**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING_ELEMENT_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link mapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see mapping.impl.MappingImpl
	 * @see mapping.impl.MappingPackageImpl#getMapping()
	 * @generated
	 */
  int MAPPING = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING__NAME = MAPPING_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING__RELATIONS = MAPPING_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Model A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MODEL_A = MAPPING_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Model B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MODEL_B = MAPPING_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPPING_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link mapping.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see mapping.impl.ElementImpl
	 * @see mapping.impl.MappingPackageImpl#getElement()
	 * @generated
	 */
  int ELEMENT = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT__NAME = MAPPING_ELEMENT__NAME;

  /**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link mapping.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see mapping.impl.RelationImpl
	 * @see mapping.impl.MappingPackageImpl#getRelation()
	 * @generated
	 */
  int RELATION = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATION__NAME = MAPPING_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATION__ELEMENT = MAPPING_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATION__ELEMENTS = MAPPING_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATION_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 2;


  /**
	 * Returns the meta object for class '{@link mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see mapping.Mapping
	 * @generated
	 */
  EClass getMapping();

  /**
	 * Returns the meta object for the containment reference list '{@link mapping.Mapping#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see mapping.Mapping#getRelations()
	 * @see #getMapping()
	 * @generated
	 */
  EReference getMapping_Relations();

  /**
	 * Returns the meta object for the attribute '{@link mapping.Mapping#getModelA <em>Model A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model A</em>'.
	 * @see mapping.Mapping#getModelA()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_ModelA();

		/**
	 * Returns the meta object for the attribute '{@link mapping.Mapping#getModelB <em>Model B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model B</em>'.
	 * @see mapping.Mapping#getModelB()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_ModelB();

		/**
	 * Returns the meta object for class '{@link mapping.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see mapping.Element
	 * @generated
	 */
  EClass getElement();

  /**
	 * Returns the meta object for class '{@link mapping.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see mapping.Relation
	 * @generated
	 */
  EClass getRelation();

  /**
	 * Returns the meta object for the containment reference '{@link mapping.Relation#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see mapping.Relation#getElement()
	 * @see #getRelation()
	 * @generated
	 */
  EReference getRelation_Element();

  /**
	 * Returns the meta object for the containment reference list '{@link mapping.Relation#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see mapping.Relation#getElements()
	 * @see #getRelation()
	 * @generated
	 */
  EReference getRelation_Elements();

  /**
	 * Returns the meta object for class '{@link mapping.MappingElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see mapping.MappingElement
	 * @generated
	 */
  EClass getMappingElement();

  /**
	 * Returns the meta object for the attribute '{@link mapping.MappingElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mapping.MappingElement#getName()
	 * @see #getMappingElement()
	 * @generated
	 */
  EAttribute getMappingElement_Name();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  MappingFactory getMappingFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link mapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see mapping.impl.MappingImpl
		 * @see mapping.impl.MappingPackageImpl#getMapping()
		 * @generated
		 */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAPPING__RELATIONS = eINSTANCE.getMapping_Relations();

    /**
		 * The meta object literal for the '<em><b>Model A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__MODEL_A = eINSTANCE.getMapping_ModelA();

				/**
		 * The meta object literal for the '<em><b>Model B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__MODEL_B = eINSTANCE.getMapping_ModelB();

				/**
		 * The meta object literal for the '{@link mapping.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see mapping.impl.ElementImpl
		 * @see mapping.impl.MappingPackageImpl#getElement()
		 * @generated
		 */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
		 * The meta object literal for the '{@link mapping.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see mapping.impl.RelationImpl
		 * @see mapping.impl.MappingPackageImpl#getRelation()
		 * @generated
		 */
    EClass RELATION = eINSTANCE.getRelation();

    /**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATION__ELEMENT = eINSTANCE.getRelation_Element();

    /**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATION__ELEMENTS = eINSTANCE.getRelation_Elements();

    /**
		 * The meta object literal for the '{@link mapping.impl.MappingElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see mapping.impl.MappingElementImpl
		 * @see mapping.impl.MappingPackageImpl#getMappingElement()
		 * @generated
		 */
    EClass MAPPING_ELEMENT = eINSTANCE.getMappingElement();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MAPPING_ELEMENT__NAME = eINSTANCE.getMappingElement_Name();

  }

} //MappingPackage
