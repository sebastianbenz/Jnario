package de.bmw.carit.jnario.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.bmw.carit.jnario.jnario.And;
import de.bmw.carit.jnario.jnario.Annotation;
import de.bmw.carit.jnario.jnario.Background;
import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.Examples;
import de.bmw.carit.jnario.jnario.Given;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Then;
import de.bmw.carit.jnario.jnario.VariableDeclaration;
import de.bmw.carit.jnario.jnario.When;
import de.bmw.carit.jnario.services.JnarioGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XIntLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.serializer.XbaseWithAnnotationsSemanticSequencer;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValueBinaryOperation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValuePair;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationValueArray;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtend2.xtend2.Xtend2Package;
import org.eclipse.xtext.xtend2.xtend2.XtendImport;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("restriction")
public class AbstractJnarioSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected JnarioGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	@Inject
	protected Provider<XbaseWithAnnotationsSemanticSequencer> superSequencerProvider;
	 
	protected XbaseWithAnnotationsSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JnarioPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JnarioPackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getBackgroundRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.BACKGROUND:
				if(context == grammarAccess.getBackgroundRule()) {
					sequence_Background(context, (Background) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.CODE:
				if(context == grammarAccess.getCodeRule()) {
					sequence_Code(context, (Code) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.EXAMPLE_CELL:
				if(context == grammarAccess.getExampleCellRule()) {
					sequence_ExampleCell(context, (ExampleCell) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.EXAMPLE_HEADING:
				if(context == grammarAccess.getExampleHeadingRule()) {
					sequence_ExampleHeading(context, (ExampleHeading) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.EXAMPLE_ROW:
				if(context == grammarAccess.getExampleRowRule()) {
					sequence_ExampleRow(context, (ExampleRow) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.EXAMPLES:
				if(context == grammarAccess.getExamplesRule()) {
					sequence_Examples(context, (Examples) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.GIVEN:
				if(context == grammarAccess.getGivenRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_Given(context, (Given) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.JNARIO:
				if(context == grammarAccess.getJnarioRule()) {
					sequence_Jnario(context, (Jnario) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.SCENARIO:
				if(context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.THEN:
				if(context == grammarAccess.getStepRule() ||
				   context == grammarAccess.getThenRule()) {
					sequence_Then(context, (Then) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case JnarioPackage.WHEN:
				if(context == grammarAccess.getStepRule() ||
				   context == grammarAccess.getWhenRule()) {
					sequence_When(context, (When) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				if(context == grammarAccess.getJvmTypeParameterRule()) {
					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XAnnotationsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XAnnotationsPackage.XANNOTATION:
				if(context == grammarAccess.getXAnnotationRule() ||
				   context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0()) {
					sequence_XAnnotation(context, (XAnnotation) semanticObject); 
					return; 
				}
				else break;
			case XAnnotationsPackage.XANNOTATION_ELEMENT_VALUE_BINARY_OPERATION:
				if(context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0()) {
					sequence_XAnnotationElementValueStringConcatenation(context, (XAnnotationElementValueBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XAnnotationsPackage.XANNOTATION_ELEMENT_VALUE_PAIR:
				if(context == grammarAccess.getXAnnotationElementValuePairRule()) {
					sequence_XAnnotationElementValuePair(context, (XAnnotationElementValuePair) semanticObject); 
					return; 
				}
				else break;
			case XAnnotationsPackage.XANNOTATION_VALUE_ARRAY:
				if(context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0() ||
				   context == grammarAccess.getXAnnotationValueArrayRule()) {
					sequence_XAnnotationValueArray(context, (XAnnotationValueArray) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XAssignment) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBINARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAdditiveExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getBlockExpressionRule()) {
					sequence_BlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBlockExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBooleanLiteralRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASE_PART:
				if(context == grammarAccess.getXCasePartRule()) {
					sequence_XCasePart(context, (XCasePart) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASTED_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCATCH_CLAUSE:
				if(context == grammarAccess.getXCatchClauseRule()) {
					sequence_XCatchClause(context, (XCatchClause) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCLOSURE:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXClosureRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXConstructorCallRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XDO_WHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXDoWhileExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFEATURE_CALL:
				if(context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0() ||
				   context == grammarAccess.getXAnnotationValueFieldReferenceRule()) {
					sequence_XAnnotationValueFieldReference(context, (XFeatureCall) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXForLoopExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XIF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XINT_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXIntLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIntLiteral(context, (XIntLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNULL_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNullLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XNullLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XRETURN_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXReturnExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSTRING_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXStringLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSWITCH_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSwitchExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTHROW_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXThrowExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTryCatchFinallyExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTYPE_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAnnotationElementValueRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationRule() ||
				   context == grammarAccess.getXAnnotationElementValueStringConcatenationAccess().getXAnnotationElementValueBinaryOperationLeftOperandAction_1_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTypeLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XUNARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XVARIABLE_DECLARATION:
				if(context == grammarAccess.getExampleHeadingCellRule()) {
					sequence_ExampleHeadingCell(context, (XVariableDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXVariableDeclarationRule()) {
					sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == Xtend2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Xtend2Package.XTEND_IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (XtendImport) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getXFunctionTypeRefRule()) {
					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=AND_TEXT code=Code)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=XAnnotation var=VariableDeclaration?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     steps+=Given
	 */
	protected void sequence_Background(EObject context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expressions+=XExpressionInsideBlock+
	 */
	protected void sequence_BlockExpression(EObject context, XBlockExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=XAnnotation* blockExpression=BlockExpression)
	 */
	protected void sequence_Code(EObject context, Code semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=XExpression
	 */
	protected void sequence_ExampleCell(EObject context, ExampleCell semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JnarioPackage.Literals.EXAMPLE_CELL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JnarioPackage.Literals.EXAMPLE_CELL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExampleCellAccess().getNameXExpressionParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_ExampleHeadingCell(EObject context, XVariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parts+=ExampleHeadingCell+
	 */
	protected void sequence_ExampleHeading(EObject context, ExampleHeading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parts+=ExampleCell+
	 */
	protected void sequence_ExampleRow(EObject context, ExampleRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EXAMPLE_TEXT heading=ExampleHeading rows+=ExampleRow*)
	 */
	protected void sequence_Examples(EObject context, Examples semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameterType=JvmTypeReference name=ValidID)
	 */
	protected void sequence_FullJvmFormalParameter(EObject context, JvmFormalParameter semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=GIVEN_TEXT code=Code? (and+=AND_TEXT and_code+=Code?)*)
	 */
	protected void sequence_Given(EObject context, Given semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (static?='static' extension?='extension'? importedType=[JvmType|QualifiedName]) | 
	 *         importedType=[JvmType|QualifiedName] | 
	 *         importedNamespace=QualifiedNameWithWildCard
	 *     )
	 */
	protected void sequence_Import(EObject context, XtendImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=QualifiedName? imports+=Import* name=FEATURE_TEXT background=Background? scenarios+=Scenario+)
	 */
	protected void sequence_Jnario(EObject context, Jnario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameterType=JvmTypeReference? name=ValidID)
	 */
	protected void sequence_JvmFormalParameter(EObject context, JvmFormalParameter semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeReference=JvmTypeReference
	 */
	protected void sequence_JvmLowerBound(EObject context, JvmLowerBound semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[JvmType|QualifiedName] (arguments+=JvmArgumentTypeReference arguments+=JvmArgumentTypeReference*)?)
	 */
	protected void sequence_JvmParameterizedTypeReference(EObject context, JvmParameterizedTypeReference semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID ((constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*) | constraints+=JvmLowerBound)?)
	 */
	protected void sequence_JvmTypeParameter(EObject context, JvmTypeParameter semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     componentType=JvmTypeReference_JvmGenericArrayTypeReference_0_1_0_0
	 */
	protected void sequence_JvmTypeReference(EObject context, JvmGenericArrayTypeReference semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeReference=JvmTypeReference
	 */
	protected void sequence_JvmUpperBoundAnded(EObject context, JvmUpperBound semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeReference=JvmTypeReference
	 */
	protected void sequence_JvmUpperBound(EObject context, JvmUpperBound semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((constraints+=JvmUpperBound | constraints+=JvmLowerBound)?)
	 */
	protected void sequence_JvmWildcardTypeReference(EObject context, JvmWildcardTypeReference semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=SCENARIO_TEXT 
	 *         annotations+=Annotation* 
	 *         steps+=Given? 
	 *         steps+=When? 
	 *         steps+=Then? 
	 *         examples+=Examples*
	 *     )
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=THEN_TEXT code=Code? (and+=AND_TEXT and_code+=Code?)*)
	 */
	protected void sequence_Then(EObject context, Then semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=VISIBILITY variableDec=XVariableDeclaration)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JnarioPackage.Literals.VARIABLE_DECLARATION__VISIBILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JnarioPackage.Literals.VARIABLE_DECLARATION__VISIBILITY));
			if(transientValues.isValueTransient(semanticObject, JnarioPackage.Literals.VARIABLE_DECLARATION__VARIABLE_DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JnarioPackage.Literals.VARIABLE_DECLARATION__VARIABLE_DEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getVisibilityVISIBILITYTerminalRuleCall_0_0(), semanticObject.getVisibility());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getVariableDecXVariableDeclarationParserRuleCall_1_0(), semanticObject.getVariableDec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=WHEN_TEXT code=Code? (and+=AND_TEXT and_code+=Code?)*)
	 */
	protected void sequence_When(EObject context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=XAdditiveExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpAdd] rightOperand=XMultiplicativeExpression) | 
	 *         (leftOperand=XMultiplicativeExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpMulti] rightOperand=XUnaryOperation) | 
	 *         (leftOperand=XOtherOperatorExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpOther] rightOperand=XAdditiveExpression) | 
	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_1_0_0_0 feature=[JvmIdentifiableElement|OpCompare] rightOperand=XOtherOperatorExpression) | 
	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpEquality] rightOperand=XRelationalExpression) | 
	 *         (leftOperand=XAndExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpAnd] rightOperand=XEqualityExpression) | 
	 *         (leftOperand=XOrExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpOr] rightOperand=XAndExpression) | 
	 *         (leftOperand=XAssignment_XBinaryOperation_1_1_0_0_0 feature=[JvmIdentifiableElement|OpMultiAssign] rightOperand=XAssignment)
	 *     )
	 */
	protected void sequence_XAdditiveExpression(EObject context, XBinaryOperation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=[JvmOperation|ValidID] value=XAnnotationElementValue)
	 */
	protected void sequence_XAnnotationElementValuePair(EObject context, XAnnotationElementValuePair semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         leftOperand=XAnnotationElementValueStringConcatenation_XAnnotationElementValueBinaryOperation_1_0 
	 *         operator='+' 
	 *         rightOperand=XAnnotationElementValue
	 *     )
	 */
	protected void sequence_XAnnotationElementValueStringConcatenation(EObject context, XAnnotationElementValueBinaryOperation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=XAnnotationElementValue values+=XAnnotationElementValue*)
	 */
	protected void sequence_XAnnotationValueArray(EObject context, XAnnotationValueArray semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaringType=[JvmDeclaredType|StaticQualifier]? feature=[JvmIdentifiableElement|IdOrSuper])
	 */
	protected void sequence_XAnnotationValueFieldReference(EObject context, XFeatureCall semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationType=[JvmAnnotationType|QualifiedName] 
	 *         ((elementValuePairs+=XAnnotationElementValuePair elementValuePairs+=XAnnotationElementValuePair*) | value=XAnnotationElementValue)?
	 *     )
	 */
	protected void sequence_XAnnotation(EObject context, XAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=XExpressionInsideBlock*)
	 */
	protected void sequence_XBlockExpression(EObject context, XBlockExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isTrue?='true'?)
	 */
	protected void sequence_XBooleanLiteral(EObject context, XBooleanLiteral semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeGuard=JvmTypeReference? case=XExpression? then=XExpression)
	 */
	protected void sequence_XCasePart(EObject context, XCasePart semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=XCastedExpression_XCastedExpression_1_0_0_0 type=JvmTypeReference)
	 */
	protected void sequence_XCastedExpression(EObject context, XCastedExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaredParam=FullJvmFormalParameter expression=XExpression)
	 */
	protected void sequence_XCatchClause(EObject context, XCatchClause semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((declaredFormalParameters+=JvmFormalParameter declaredFormalParameters+=JvmFormalParameter*)? explicitSyntax?='|')? 
	 *         expression=XExpressionInClosure
	 *     )
	 */
	protected void sequence_XClosure(EObject context, XClosure semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         constructor=[JvmConstructor|QualifiedName] 
	 *         (typeArguments+=JvmArgumentTypeReference typeArguments+=JvmArgumentTypeReference*)? 
	 *         (arguments+=XShortClosure | (arguments+=XExpression arguments+=XExpression*))? 
	 *         arguments+=XClosure?
	 *     )
	 */
	protected void sequence_XConstructorCall(EObject context, XConstructorCall semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body=XExpression predicate=XExpression)
	 */
	protected void sequence_XDoWhileExpression(EObject context, XDoWhileExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=XExpressionInsideBlock*)
	 */
	protected void sequence_XExpressionInClosure(EObject context, XBlockExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature=[JvmIdentifiableElement|IdOrSuper] featureCallArguments+=XExpression) | 
	 *         (
	 *             declaringType=[JvmDeclaredType|StaticQualifier]? 
	 *             (typeArguments+=JvmArgumentTypeReference typeArguments+=JvmArgumentTypeReference*)? 
	 *             feature=[JvmIdentifiableElement|IdOrSuper] 
	 *             (explicitOperationCall?='(' (featureCallArguments+=XShortClosure | (featureCallArguments+=XExpression featureCallArguments+=XExpression*))?)? 
	 *             featureCallArguments+=XClosure?
	 *         )
	 *     )
	 */
	protected void sequence_XFeatureCall(EObject context, XFeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaredParam=JvmFormalParameter forExpression=XExpression eachExpression=XExpression)
	 */
	protected void sequence_XForLoopExpression(EObject context, XForLoopExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((paramTypes+=JvmTypeReference paramTypes+=JvmTypeReference*)? returnType=JvmTypeReference)
	 */
	protected void sequence_XFunctionTypeRef(EObject context, XFunctionTypeRef semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=XExpression then=XExpression else=XExpression?)
	 */
	protected void sequence_XIfExpression(EObject context, XIfExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_XIntLiteral(EObject context, XIntLiteral semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (assignable=XMemberFeatureCall_XAssignment_1_0_0_0_0 feature=[JvmIdentifiableElement|ValidID] value=XAssignment) | 
	 *         (feature=[JvmIdentifiableElement|ValidID] value=XAssignment)
	 *     )
	 */
	protected void sequence_XMemberFeatureCall(EObject context, XAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (memberCallTarget=XMemberFeatureCall_XMemberFeatureCall_1_1_0_0_0 feature=[JvmIdentifiableElement|ValidID] memberCallArguments+=XExpression) | 
	 *         (
	 *             memberCallTarget=XMemberFeatureCall_XMemberFeatureCall_1_2_0_0_0 
	 *             (nullSafe?='?.' | spreading?='*.')? 
	 *             (typeArguments+=JvmArgumentTypeReference typeArguments+=JvmArgumentTypeReference*)? 
	 *             feature=[JvmIdentifiableElement|ValidID] 
	 *             (explicitOperationCall?='(' (memberCallArguments+=XShortClosure | (memberCallArguments+=XExpression memberCallArguments+=XExpression*))?)? 
	 *             memberCallArguments+=XClosure?
	 *         )
	 *     )
	 */
	protected void sequence_XMemberFeatureCall(EObject context, XMemberFeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {XNullLiteral}
	 */
	protected void sequence_XMemberFeatureCall(EObject context, XNullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=XRelationalExpression_XInstanceOfExpression_1_0_0_0_0 type=[JvmType|QualifiedName])
	 */
	protected void sequence_XRelationalExpression(EObject context, XInstanceOfExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=XExpression?)
	 */
	protected void sequence_XReturnExpression(EObject context, XReturnExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((declaredFormalParameters+=JvmFormalParameter declaredFormalParameters+=JvmFormalParameter*)? explicitSyntax?='|' expression=XExpression)
	 */
	protected void sequence_XShortClosure(EObject context, XClosure semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_XStringLiteral(EObject context, XStringLiteral semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (localVarName=ValidID? switch=XExpression cases+=XCasePart+ default=XExpression?)
	 */
	protected void sequence_XSwitchExpression(EObject context, XSwitchExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=XExpression
	 */
	protected void sequence_XThrowExpression(EObject context, XThrowExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=XExpression ((catchClauses+=XCatchClause+ finallyExpression=XExpression?) | finallyExpression=XExpression))
	 */
	protected void sequence_XTryCatchFinallyExpression(EObject context, XTryCatchFinallyExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[JvmType|QualifiedName]
	 */
	protected void sequence_XTypeLiteral(EObject context, XTypeLiteral semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[JvmIdentifiableElement|OpUnary] operand=XCastedExpression)
	 */
	protected void sequence_XUnaryOperation(EObject context, XUnaryOperation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (writeable?='var'? ((type=JvmTypeReference name=ValidID) | name=ValidID) right=XExpression?)
	 */
	protected void sequence_XVariableDeclaration(EObject context, XVariableDeclaration semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (predicate=XExpression body=XExpression)
	 */
	protected void sequence_XWhileExpression(EObject context, XWhileExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}
