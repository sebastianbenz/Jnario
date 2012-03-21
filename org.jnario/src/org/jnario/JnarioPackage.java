/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtend.core.xtend.XtendPackage;

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
 * @see org.jnario.JnarioFactory
 * @model kind="package"
 * @generated
 */
public interface JnarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jnario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org/Jnario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jnario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JnarioPackage eINSTANCE = org.jnario.impl.JnarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnario.impl.ExampleTableImpl <em>Example Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ExampleTableImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getExampleTable()
	 * @generated
	 */
	int EXAMPLE_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATIONS = XtendPackage.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATION_INFO = XtendPackage.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__NAME = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ROWS = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__COLUMNS = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Example Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_FEATURE_COUNT = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ExampleRowImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getExampleRow()
	 * @generated
	 */
	int EXAMPLE_ROW = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Example Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jnario.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.AssertionImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.impl.MatcherImpl <em>Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.MatcherImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getMatcher()
	 * @generated
	 */
	int MATCHER = 3;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__CLOSURE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ExampleColumnImpl <em>Example Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ExampleColumnImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getExampleColumn()
	 * @generated
	 */
	int EXAMPLE_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__ANNOTATIONS = XtendPackage.XTEND_FIELD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__ANNOTATION_INFO = XtendPackage.XTEND_FIELD__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__NAME = XtendPackage.XTEND_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__TYPE = XtendPackage.XTEND_FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__EXTENSION = XtendPackage.XTEND_FIELD__EXTENSION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__VISIBILITY = XtendPackage.XTEND_FIELD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__STATIC = XtendPackage.XTEND_FIELD__STATIC;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__INITIAL_VALUE = XtendPackage.XTEND_FIELD__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__TABLE = XtendPackage.XTEND_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN__CELLS = XtendPackage.XTEND_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Example Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_COLUMN_FEATURE_COUNT = XtendPackage.XTEND_FIELD_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.jnario.impl.ShouldImpl <em>Should</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ShouldImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getShould()
	 * @generated
	 */
	int SHOULD = 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__FEATURE = XbasePackage.XBINARY_OPERATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__TYPE_ARGUMENTS = XbasePackage.XBINARY_OPERATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__IMPLICIT_RECEIVER = XbasePackage.XBINARY_OPERATION__IMPLICIT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__INVALID_FEATURE_ISSUE_CODE = XbasePackage.XBINARY_OPERATION__INVALID_FEATURE_ISSUE_CODE;

	/**
	 * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__VALID_FEATURE = XbasePackage.XBINARY_OPERATION__VALID_FEATURE;

	/**
	 * The feature id for the '<em><b>Implicit First Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__IMPLICIT_FIRST_ARGUMENT = XbasePackage.XBINARY_OPERATION__IMPLICIT_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__LEFT_OPERAND = XbasePackage.XBINARY_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__RIGHT_OPERAND = XbasePackage.XBINARY_OPERATION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD__NOT = XbasePackage.XBINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Should</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_FEATURE_COUNT = XbasePackage.XBINARY_OPERATION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.jnario.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.CollectionLiteralImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getCollectionLiteral()
	 * @generated
	 */
	int COLLECTION_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__FEATURE = XbasePackage.XFEATURE_CALL__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__TYPE_ARGUMENTS = XbasePackage.XFEATURE_CALL__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__IMPLICIT_RECEIVER = XbasePackage.XFEATURE_CALL__IMPLICIT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__INVALID_FEATURE_ISSUE_CODE = XbasePackage.XFEATURE_CALL__INVALID_FEATURE_ISSUE_CODE;

	/**
	 * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__VALID_FEATURE = XbasePackage.XFEATURE_CALL__VALID_FEATURE;

	/**
	 * The feature id for the '<em><b>Implicit First Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__IMPLICIT_FIRST_ARGUMENT = XbasePackage.XFEATURE_CALL__IMPLICIT_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Feature Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__FEATURE_CALL_ARGUMENTS = XbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__EXPLICIT_OPERATION_CALL = XbasePackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL__DECLARING_TYPE = XbasePackage.XFEATURE_CALL__DECLARING_TYPE;

	/**
	 * The number of structural features of the '<em>Collection Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_FEATURE_COUNT = XbasePackage.XFEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.impl.ListLiteralImpl <em>List Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ListLiteralImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getListLiteral()
	 * @generated
	 */
	int LIST_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__FEATURE = COLLECTION_LITERAL__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__TYPE_ARGUMENTS = COLLECTION_LITERAL__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__IMPLICIT_RECEIVER = COLLECTION_LITERAL__IMPLICIT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__INVALID_FEATURE_ISSUE_CODE = COLLECTION_LITERAL__INVALID_FEATURE_ISSUE_CODE;

	/**
	 * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__VALID_FEATURE = COLLECTION_LITERAL__VALID_FEATURE;

	/**
	 * The feature id for the '<em><b>Implicit First Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__IMPLICIT_FIRST_ARGUMENT = COLLECTION_LITERAL__IMPLICIT_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Feature Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__FEATURE_CALL_ARGUMENTS = COLLECTION_LITERAL__FEATURE_CALL_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__EXPLICIT_OPERATION_CALL = COLLECTION_LITERAL__EXPLICIT_OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__DECLARING_TYPE = COLLECTION_LITERAL__DECLARING_TYPE;

	/**
	 * The number of structural features of the '<em>List Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_FEATURE_COUNT = COLLECTION_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.impl.SetLiteralImpl <em>Set Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.SetLiteralImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getSetLiteral()
	 * @generated
	 */
	int SET_LITERAL = 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__FEATURE = COLLECTION_LITERAL__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__TYPE_ARGUMENTS = COLLECTION_LITERAL__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__IMPLICIT_RECEIVER = COLLECTION_LITERAL__IMPLICIT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__INVALID_FEATURE_ISSUE_CODE = COLLECTION_LITERAL__INVALID_FEATURE_ISSUE_CODE;

	/**
	 * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__VALID_FEATURE = COLLECTION_LITERAL__VALID_FEATURE;

	/**
	 * The feature id for the '<em><b>Implicit First Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__IMPLICIT_FIRST_ARGUMENT = COLLECTION_LITERAL__IMPLICIT_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Feature Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__FEATURE_CALL_ARGUMENTS = COLLECTION_LITERAL__FEATURE_CALL_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__EXPLICIT_OPERATION_CALL = COLLECTION_LITERAL__EXPLICIT_OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL__DECLARING_TYPE = COLLECTION_LITERAL__DECLARING_TYPE;

	/**
	 * The number of structural features of the '<em>Set Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LITERAL_FEATURE_COUNT = COLLECTION_LITERAL_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.jnario.impl.ShouldThrowImpl <em>Should Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.impl.ShouldThrowImpl
	 * @see org.jnario.impl.JnarioPackageImpl#getShouldThrow()
	 * @generated
	 */
	int SHOULD_THROW = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_THROW__TYPE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_THROW__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Should Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOULD_THROW_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.jnario.ExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Table</em>'.
	 * @see org.jnario.ExampleTable
	 * @generated
	 */
	EClass getExampleTable();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.ExampleTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.ExampleTable#getName()
	 * @see #getExampleTable()
	 * @generated
	 */
	EAttribute getExampleTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.ExampleTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.jnario.ExampleTable#getRows()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Rows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.ExampleTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.jnario.ExampleTable#getColumns()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Columns();

	/**
	 * Returns the meta object for class '{@link org.jnario.ExampleRow <em>Example Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Row</em>'.
	 * @see org.jnario.ExampleRow
	 * @generated
	 */
	EClass getExampleRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.ExampleRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.jnario.ExampleRow#getCells()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Cells();

	/**
	 * Returns the meta object for the container reference '{@link org.jnario.ExampleRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.jnario.ExampleRow#getTable()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Table();

	/**
	 * Returns the meta object for class '{@link org.jnario.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see org.jnario.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.Assertion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.jnario.Assertion#getExpression()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Expression();

	/**
	 * Returns the meta object for class '{@link org.jnario.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matcher</em>'.
	 * @see org.jnario.Matcher
	 * @generated
	 */
	EClass getMatcher();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.Matcher#getClosure <em>Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Closure</em>'.
	 * @see org.jnario.Matcher#getClosure()
	 * @see #getMatcher()
	 * @generated
	 */
	EReference getMatcher_Closure();

	/**
	 * Returns the meta object for class '{@link org.jnario.ExampleColumn <em>Example Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Column</em>'.
	 * @see org.jnario.ExampleColumn
	 * @generated
	 */
	EClass getExampleColumn();

	/**
	 * Returns the meta object for the container reference '{@link org.jnario.ExampleColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.jnario.ExampleColumn#getTable()
	 * @see #getExampleColumn()
	 * @generated
	 */
	EReference getExampleColumn_Table();

	/**
	 * Returns the meta object for the reference list '{@link org.jnario.ExampleColumn#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see org.jnario.ExampleColumn#getCells()
	 * @see #getExampleColumn()
	 * @generated
	 */
	EReference getExampleColumn_Cells();

	/**
	 * Returns the meta object for class '{@link org.jnario.Should <em>Should</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Should</em>'.
	 * @see org.jnario.Should
	 * @generated
	 */
	EClass getShould();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.Should#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see org.jnario.Should#isNot()
	 * @see #getShould()
	 * @generated
	 */
	EAttribute getShould_Not();

	/**
	 * Returns the meta object for class '{@link org.jnario.CollectionLiteral <em>Collection Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Literal</em>'.
	 * @see org.jnario.CollectionLiteral
	 * @generated
	 */
	EClass getCollectionLiteral();

	/**
	 * Returns the meta object for class '{@link org.jnario.ListLiteral <em>List Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Literal</em>'.
	 * @see org.jnario.ListLiteral
	 * @generated
	 */
	EClass getListLiteral();

	/**
	 * Returns the meta object for class '{@link org.jnario.SetLiteral <em>Set Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Literal</em>'.
	 * @see org.jnario.SetLiteral
	 * @generated
	 */
	EClass getSetLiteral();

	/**
	 * Returns the meta object for class '{@link org.jnario.ShouldThrow <em>Should Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Should Throw</em>'.
	 * @see org.jnario.ShouldThrow
	 * @generated
	 */
	EClass getShouldThrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.ShouldThrow#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.jnario.ShouldThrow#getType()
	 * @see #getShouldThrow()
	 * @generated
	 */
	EReference getShouldThrow_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.ShouldThrow#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.jnario.ShouldThrow#getExpression()
	 * @see #getShouldThrow()
	 * @generated
	 */
	EReference getShouldThrow_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JnarioFactory getJnarioFactory();

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
		 * The meta object literal for the '{@link org.jnario.impl.ExampleTableImpl <em>Example Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ExampleTableImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getExampleTable()
		 * @generated
		 */
		EClass EXAMPLE_TABLE = eINSTANCE.getExampleTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TABLE__NAME = eINSTANCE.getExampleTable_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__ROWS = eINSTANCE.getExampleTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__COLUMNS = eINSTANCE.getExampleTable_Columns();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ExampleRowImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getExampleRow()
		 * @generated
		 */
		EClass EXAMPLE_ROW = eINSTANCE.getExampleRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__CELLS = eINSTANCE.getExampleRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__TABLE = eINSTANCE.getExampleRow_Table();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.AssertionImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__EXPRESSION = eINSTANCE.getAssertion_Expression();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.MatcherImpl <em>Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.MatcherImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getMatcher()
		 * @generated
		 */
		EClass MATCHER = eINSTANCE.getMatcher();

		/**
		 * The meta object literal for the '<em><b>Closure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHER__CLOSURE = eINSTANCE.getMatcher_Closure();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ExampleColumnImpl <em>Example Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ExampleColumnImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getExampleColumn()
		 * @generated
		 */
		EClass EXAMPLE_COLUMN = eINSTANCE.getExampleColumn();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_COLUMN__TABLE = eINSTANCE.getExampleColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_COLUMN__CELLS = eINSTANCE.getExampleColumn_Cells();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ShouldImpl <em>Should</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ShouldImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getShould()
		 * @generated
		 */
		EClass SHOULD = eINSTANCE.getShould();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOULD__NOT = eINSTANCE.getShould_Not();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.CollectionLiteralImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getCollectionLiteral()
		 * @generated
		 */
		EClass COLLECTION_LITERAL = eINSTANCE.getCollectionLiteral();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ListLiteralImpl <em>List Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ListLiteralImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getListLiteral()
		 * @generated
		 */
		EClass LIST_LITERAL = eINSTANCE.getListLiteral();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.SetLiteralImpl <em>Set Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.SetLiteralImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getSetLiteral()
		 * @generated
		 */
		EClass SET_LITERAL = eINSTANCE.getSetLiteral();

		/**
		 * The meta object literal for the '{@link org.jnario.impl.ShouldThrowImpl <em>Should Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.impl.ShouldThrowImpl
		 * @see org.jnario.impl.JnarioPackageImpl#getShouldThrow()
		 * @generated
		 */
		EClass SHOULD_THROW = eINSTANCE.getShouldThrow();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOULD_THROW__TYPE = eINSTANCE.getShouldThrow_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOULD_THROW__EXPRESSION = eINSTANCE.getShouldThrow_Expression();

	}

} //JnarioPackage
