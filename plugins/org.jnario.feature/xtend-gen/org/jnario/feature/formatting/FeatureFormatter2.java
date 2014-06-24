package org.jnario.feature.formatting;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.AnonymousClass;
import org.eclipse.xtend.core.xtend.RichString;
import org.eclipse.xtend.core.xtend.XtendAnnotationType;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendConstructor;
import org.eclipse.xtend.core.xtend.XtendEnum;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendInterface;
import org.eclipse.xtend.core.xtend.XtendParameter;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.formatting.FormattableDocument;
import org.eclipse.xtext.xbase.formatting.FormattingData;
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory;
import org.eclipse.xtext.xbase.formatting.FormattingDataInit;
import org.eclipse.xtext.xbase.formatting.NodeModelAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Scenario;
import org.jnario.formatter.JnarioFormatter;

@SuppressWarnings("all")
public class FeatureFormatter2 extends JnarioFormatter {
  @Inject
  @Extension
  private NodeModelAccess _nodeModelAccess;
  
  @Inject
  @Extension
  private FormattingDataFactory _formattingDataFactory;
  
  protected void _format(final Scenario scenario, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(scenario);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
  }
  
  protected void _format(final Background background, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(background);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
  }
  
  protected void format(final EObject background, final FormattableDocument format) {
    if (background instanceof Background) {
      _format((Background)background, format);
      return;
    } else if (background instanceof Scenario) {
      _format((Scenario)background, format);
      return;
    } else if (background instanceof AnonymousClass) {
      _format((AnonymousClass)background, format);
      return;
    } else if (background instanceof XtendAnnotationType) {
      _format((XtendAnnotationType)background, format);
      return;
    } else if (background instanceof XtendClass) {
      _format((XtendClass)background, format);
      return;
    } else if (background instanceof XtendConstructor) {
      _format((XtendConstructor)background, format);
      return;
    } else if (background instanceof XtendEnum) {
      _format((XtendEnum)background, format);
      return;
    } else if (background instanceof XtendFunction) {
      _format((XtendFunction)background, format);
      return;
    } else if (background instanceof XtendInterface) {
      _format((XtendInterface)background, format);
      return;
    } else if (background instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)background, format);
      return;
    } else if (background instanceof RichString) {
      _format((RichString)background, format);
      return;
    } else if (background instanceof XtendField) {
      _format((XtendField)background, format);
      return;
    } else if (background instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)background, format);
      return;
    } else if (background instanceof XAssignment) {
      _format((XAssignment)background, format);
      return;
    } else if (background instanceof XBinaryOperation) {
      _format((XBinaryOperation)background, format);
      return;
    } else if (background instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)background, format);
      return;
    } else if (background instanceof XFeatureCall) {
      _format((XFeatureCall)background, format);
      return;
    } else if (background instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)background, format);
      return;
    } else if (background instanceof XWhileExpression) {
      _format((XWhileExpression)background, format);
      return;
    } else if (background instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)background, format);
      return;
    } else if (background instanceof ExampleTable) {
      _format((ExampleTable)background, format);
      return;
    } else if (background instanceof XtendParameter) {
      _format((XtendParameter)background, format);
      return;
    } else if (background instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)background, format);
      return;
    } else if (background instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)background, format);
      return;
    } else if (background instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)background, format);
      return;
    } else if (background instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)background, format);
      return;
    } else if (background instanceof XBlockExpression) {
      _format((XBlockExpression)background, format);
      return;
    } else if (background instanceof XClosure) {
      _format((XClosure)background, format);
      return;
    } else if (background instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)background, format);
      return;
    } else if (background instanceof XConstructorCall) {
      _format((XConstructorCall)background, format);
      return;
    } else if (background instanceof XForLoopExpression) {
      _format((XForLoopExpression)background, format);
      return;
    } else if (background instanceof XIfExpression) {
      _format((XIfExpression)background, format);
      return;
    } else if (background instanceof XReturnExpression) {
      _format((XReturnExpression)background, format);
      return;
    } else if (background instanceof XSwitchExpression) {
      _format((XSwitchExpression)background, format);
      return;
    } else if (background instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)background, format);
      return;
    } else if (background instanceof XThrowExpression) {
      _format((XThrowExpression)background, format);
      return;
    } else if (background instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)background, format);
      return;
    } else if (background instanceof XTypeLiteral) {
      _format((XTypeLiteral)background, format);
      return;
    } else if (background instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)background, format);
      return;
    } else if (background instanceof XAnnotation) {
      _format((XAnnotation)background, format);
      return;
    } else if (background instanceof XtendFile) {
      _format((XtendFile)background, format);
      return;
    } else if (background instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)background, format);
      return;
    } else if (background instanceof XCatchClause) {
      _format((XCatchClause)background, format);
      return;
    } else if (background instanceof XExpression) {
      _format((XExpression)background, format);
      return;
    } else if (background instanceof XImportDeclaration) {
      _format((XImportDeclaration)background, format);
      return;
    } else if (background instanceof XImportSection) {
      _format((XImportSection)background, format);
      return;
    } else if (background != null) {
      _format(background, format);
      return;
    } else if (background == null) {
      _format((Void)null, format);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(background, format).toString());
    }
  }
}
