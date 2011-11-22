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
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
   * @generated
   */
  int SPEC_FILE = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FILE__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FILE__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.MemberImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 1;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__ANNOTATION_INFO = 2;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
   * @generated
   */
  int EXAMPLE_GROUP = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__ANNOTATIONS = MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__ANNOTATION_INFO = MEMBER__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Preamble</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__PREAMBLE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__TARGET = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP__ELEMENTS = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Example Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_GROUP_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.ParameterImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.FieldImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getField()
   * @generated
   */
  int FIELD = 4;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATIONS = MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATION_INFO = MEMBER__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__RIGHT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.ExampleImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExample()
   * @generated
   */
  int EXAMPLE = 5;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__ANNOTATIONS = MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__ANNOTATION_INFO = MEMBER__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Preamble</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__PREAMBLE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__FEATURE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__BODY = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Example</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.spec.spec.impl.FunctionImpl
   * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ANNOTATIONS = MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ANNOTATION_INFO = MEMBER__ANNOTATION_INFO;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_TYPE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPRESSION = MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.SpecFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see de.bmw.carit.jnario.spec.spec.SpecFile
   * @generated
   */
  EClass getSpecFile();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.SpecFile#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see de.bmw.carit.jnario.spec.spec.SpecFile#getPackageName()
   * @see #getSpecFile()
   * @generated
   */
  EAttribute getSpecFile_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.SpecFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.bmw.carit.jnario.spec.spec.SpecFile#getImports()
   * @see #getSpecFile()
   * @generated
   */
  EReference getSpecFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.SpecFile#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.bmw.carit.jnario.spec.spec.SpecFile#getElements()
   * @see #getSpecFile()
   * @generated
   */
  EReference getSpecFile_Elements();

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
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preamble</em>'.
   * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble()
   * @see #getExampleGroup()
   * @generated
   */
  EAttribute getExampleGroup_Preamble();

  /**
   * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getTarget()
   * @see #getExampleGroup()
   * @generated
   */
  EReference getExampleGroup_Target();

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
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.Member#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Member#getAnnotations()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Annotations();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Member#getAnnotationInfo <em>Annotation Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Info</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Member#getAnnotationInfo()
   * @see #getMember()
   * @generated
   */
  EReference getMember_AnnotationInfo();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.Parameter#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Parameter#getAnnotations()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Parameter#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Type</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Parameter#getParameterType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ParameterType();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Field#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Field#getRight()
   * @see #getField()
   * @generated
   */
  EReference getField_Right();

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
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Example#getPreamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preamble</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Example#getPreamble()
   * @see #getExample()
   * @generated
   */
  EAttribute getExample_Preamble();

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
   * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.Function#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Function#getTypeParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Function#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Function#getReturnType()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.spec.spec.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.Function#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.bmw.carit.jnario.spec.spec.Function#getExpression()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Expression();

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
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
     * @generated
     */
    EClass SPEC_FILE = eINSTANCE.getSpecFile();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC_FILE__PACKAGE_NAME = eINSTANCE.getSpecFile_PackageName();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_FILE__IMPORTS = eINSTANCE.getSpecFile_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_FILE__ELEMENTS = eINSTANCE.getSpecFile_Elements();

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
     * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLE_GROUP__PREAMBLE = eINSTANCE.getExampleGroup_Preamble();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_GROUP__TARGET = eINSTANCE.getExampleGroup_Target();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_GROUP__ELEMENTS = eINSTANCE.getExampleGroup_Elements();

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
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__ANNOTATIONS = eINSTANCE.getMember_Annotations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '<em><b>Annotation Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__ANNOTATION_INFO = eINSTANCE.getMember_AnnotationInfo();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.ParameterImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ANNOTATIONS = eINSTANCE.getParameter_Annotations();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.FieldImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__RIGHT = eINSTANCE.getField_Right();

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
     * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLE__PREAMBLE = eINSTANCE.getExample_Preamble();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__FEATURE = eINSTANCE.getExample_Feature();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__BODY = eINSTANCE.getExample_Body();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.spec.spec.impl.FunctionImpl
     * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__TYPE_PARAMETERS = eINSTANCE.getFunction_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPRESSION = eINSTANCE.getFunction_Expression();

  }

} //SpecPackage
