/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.spec.spec;

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
 * @see de.bmw.carit.jnario.spec.spec.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bmw.de/carit/jnario/spec/Spec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecPackage eINSTANCE = de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl.init();

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpec()
   * @generated
   */
  int SPEC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.ImportImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
   * @generated
   */
  int EXAMPLE_GROUP = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__TARGET = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__NAME = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Example Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.AbstractElementImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.MemberImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 4;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__DECL = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.ContextImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.ExampleImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExample()
   * @generated
   */
  int EXAMPLE = 6;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__FEATURE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__BODY = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Example</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Spec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Spec
   * @generated
   */
  EClass getSpec();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Spec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Spec#getName()
   * @see #getSpec()
   * @generated
   */
  EAttribute getSpec_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.Spec#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Spec#getImports()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.Spec#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Spec#getElements()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_Elements();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup <em>Example Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example Group</em>'.
   * @see de.bmw.carit.jnario.spec.spec.ExampleGroup
   * @generated
   */
  EClass getExampleGroup();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getTarget()
   * @see #getExampleGroup()
   * @generated
   */
  EReference getExampleGroup_Target();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getName()
   * @see #getExampleGroup()
   * @generated
   */
  EAttribute getExampleGroup_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getElements()
   * @see #getExampleGroup()
   * @generated
   */
  EReference getExampleGroup_Elements();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see de.bmw.carit.jnario.spec.spec.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Member#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Member#getDecl()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Decl();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Context#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Context#getName()
   * @see #getContext()
   * @generated
   */
  EAttribute getContext_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.Context#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Context#getElements()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Elements();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Example <em>Example</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Example
   * @generated
   */
  EClass getExample();

  /**
   * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.Example#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Example#getFeature()
   * @see #getExample()
   * @generated
   */
  EReference getExample_Feature();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Example#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Example#getName()
   * @see #getExample()
   * @generated
   */
  EAttribute getExample_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Example#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Example#getBody()
   * @see #getExample()
   * @generated
   */
  EReference getExample_Body();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpecFactory getSpecFactory();

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
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpec()
     * @generated
     */
    EClass SPEC = eINSTANCE.getSpec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC__NAME = eINSTANCE.getSpec_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__IMPORTS = eINSTANCE.getSpec_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__ELEMENTS = eINSTANCE.getSpec_Elements();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.ImportImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
     * @generated
     */
    EClass EXAMPLE_GROUP = eINSTANCE.getExampleGroup();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_GROUP__TARGET = eINSTANCE.getExampleGroup_Target();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLE_GROUP__NAME = eINSTANCE.getExampleGroup_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_GROUP__ELEMENTS = eINSTANCE.getExampleGroup_Elements();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.AbstractElementImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.MemberImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__DECL = eINSTANCE.getMember_Decl();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.ContextImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__ELEMENTS = eINSTANCE.getContext_Elements();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.ExampleImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExample()
     * @generated
     */
    EClass EXAMPLE = eINSTANCE.getExample();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__FEATURE = eINSTANCE.getExample_Feature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLE__NAME = eINSTANCE.getExample_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__BODY = eINSTANCE.getExample_Body();

  }

} //SpecPackage
