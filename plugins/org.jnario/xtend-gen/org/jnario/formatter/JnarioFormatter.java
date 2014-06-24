package org.jnario.formatter;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.formatting.XtendFormatter;
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
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.JnarioPackage;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class JnarioFormatter extends XtendFormatter {
  @Inject
  @Extension
  private NodeModelAccess _nodeModelAccess;
  
  @Inject
  @Extension
  private FormattingDataFactory _formattingDataFactory;
  
  private void formatRows(final EList<ExampleRow> rows, final FormattableDocument format) {
    final Procedure1<ExampleRow> _function = new Procedure1<ExampleRow>() {
      public void apply(final ExampleRow it) {
        INode _nodeForEObject = JnarioFormatter.this._nodeModelAccess.nodeForEObject(it);
        final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
          public void apply(final FormattingDataInit it) {
            it.newLine();
          }
        };
        Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _append = JnarioFormatter.this._formattingDataFactory.append(_nodeForEObject, _function);
        format.operator_add(_append);
      }
    };
    IterableExtensions.<ExampleRow>forEach(rows, _function);
  }
  
  private void formatColumns(final EList<ExampleColumn> columns, final FormattableDocument format) {
    final Procedure1<ExampleColumn> _function = new Procedure1<ExampleColumn>() {
      public void apply(final ExampleColumn it) {
        final INode nameNode = JnarioFormatter.this._nodeModelAccess.nodeForFeature(it, JnarioPackage.Literals.EXAMPLE_COLUMN__NAME);
        final INode typeNode = JnarioFormatter.this._nodeModelAccess.nodeForFeature(it, JnarioPackage.Literals.EXAMPLE_COLUMN__TYPE);
        int _xifexpression = (int) 0;
        boolean _equals = Objects.equal(typeNode, null);
        if (_equals) {
          _xifexpression = nameNode.getLength();
        } else {
          int _offset = nameNode.getOffset();
          int _length = nameNode.getLength();
          int _plus = (_offset + _length);
          int _offset_1 = typeNode.getOffset();
          _xifexpression = (_plus - _offset_1);
        }
        final int headerLength = _xifexpression;
        Integer _elvis = null;
        EList<ExampleCell> _cells = it.getCells();
        final Function1<ExampleCell, Integer> _function = new Function1<ExampleCell, Integer>() {
          public Integer apply(final ExampleCell it) {
            XExpression _expression = it.getExpression();
            INode _nodeForEObject = JnarioFormatter.this._nodeModelAccess.nodeForEObject(_expression);
            return JnarioFormatter.this.getMultilineLength(format, _nodeForEObject);
          }
        };
        List<Integer> _map = ListExtensions.<ExampleCell, Integer>map(_cells, _function);
        final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
          public Integer apply(final Integer p1, final Integer p2) {
            return Integer.valueOf(Math.max((p1).intValue(), (p2).intValue()));
          }
        };
        Integer _reduce = IterableExtensions.<Integer>reduce(_map, _function_1);
        if (_reduce != null) {
          _elvis = _reduce;
        } else {
          _elvis = Integer.valueOf(0);
        }
        final Integer maxExprLength = _elvis;
        final int maxLength = Math.max(headerLength, (maxExprLength).intValue());
        final int columnLength = ((1 + maxLength) - headerLength);
        INode _nodeForEObject = JnarioFormatter.this._nodeModelAccess.nodeForEObject(it);
        final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
          public void apply(final FormattingDataInit it) {
            it.oneSpace();
          }
        };
        Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _prepend = JnarioFormatter.this._formattingDataFactory.prepend(_nodeForEObject, _function_2);
        format.operator_add(_prepend);
        ILeafNode _nodeForKeyword = JnarioFormatter.this._nodeModelAccess.nodeForKeyword(it, "|");
        final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
          public void apply(final FormattingDataInit it) {
            JnarioFormatter.this.spaces(it, columnLength);
          }
        };
        Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _prepend_1 = JnarioFormatter.this._formattingDataFactory.prepend(_nodeForKeyword, _function_3);
        format.operator_add(_prepend_1);
        EList<ExampleCell> _cells_1 = it.getCells();
        final Procedure1<ExampleCell> _function_4 = new Procedure1<ExampleCell>() {
          public void apply(final ExampleCell it) {
            XExpression _expression = it.getExpression();
            INode _nodeForEObject = JnarioFormatter.this._nodeModelAccess.nodeForEObject(_expression);
            final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
              public void apply(final FormattingDataInit it) {
                it.oneSpace();
              }
            };
            Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _prepend = JnarioFormatter.this._formattingDataFactory.prepend(_nodeForEObject, _function);
            format.operator_add(_prepend);
            XExpression _expression_1 = it.getExpression();
            INode _nodeForEObject_1 = JnarioFormatter.this._nodeModelAccess.nodeForEObject(_expression_1);
            int _multilineLastSegmentLength = JnarioFormatter.this.getMultilineLastSegmentLength(format, _nodeForEObject_1);
            final int length = ((1 + maxLength) - _multilineLastSegmentLength);
            XExpression _expression_2 = it.getExpression();
            INode _nodeForEObject_2 = JnarioFormatter.this._nodeModelAccess.nodeForEObject(_expression_2);
            final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
              public void apply(final FormattingDataInit it) {
                JnarioFormatter.this.spaces(it, length);
              }
            };
            Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _append = JnarioFormatter.this._formattingDataFactory.append(_nodeForEObject_2, _function_1);
            format.operator_add(_append);
          }
        };
        IterableExtensions.<ExampleCell>forEach(_cells_1, _function_4);
      }
    };
    IterableExtensions.<ExampleColumn>forEach(columns, _function);
    ExampleColumn _last = IterableExtensions.<ExampleColumn>last(columns);
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(_last);
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.newLine();
      }
    };
    Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForEObject, _function_1);
    format.operator_add(_append);
  }
  
  public String spaces(final FormattingDataInit init, final int i) {
    IntegerRange _upTo = new IntegerRange(1, i);
    final Function2<String, Integer, String> _function = new Function2<String, Integer, String>() {
      public String apply(final String p1, final Integer p2) {
        return (p1 + " ");
      }
    };
    String _fold = IterableExtensions.<Integer, String>fold(_upTo, "", _function);
    return init.space = _fold;
  }
  
  private String[] getSplittedMultilineCell(final FormattableDocument format, final INode node) {
    String _document = format.getDocument();
    int _offset = node.getOffset();
    int _offset_1 = node.getOffset();
    int _length = node.getLength();
    int _plus = (_offset_1 + _length);
    String _substring = _document.substring(_offset, _plus);
    return _substring.split("\r?\n");
  }
  
  private int getMultilineLastSegmentLength(final FormattableDocument format, final INode node) {
    String[] _splittedMultilineCell = this.getSplittedMultilineCell(format, node);
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_splittedMultilineCell)));
    String _trim = _last.trim();
    return _trim.length();
  }
  
  private Integer getMultilineLength(final FormattableDocument format, final INode node) {
    String[] _splittedMultilineCell = this.getSplittedMultilineCell(format, node);
    final Function1<String, Integer> _function = new Function1<String, Integer>() {
      public Integer apply(final String it) {
        String _trim = it.trim();
        return Integer.valueOf(_trim.length());
      }
    };
    List<Integer> _map = ListExtensions.<String, Integer>map(((List<String>)Conversions.doWrapArray(_splittedMultilineCell)), _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(Math.max((p1).intValue(), (p2).intValue()));
      }
    };
    return IterableExtensions.<Integer>reduce(_map, _function_1);
  }
  
  protected void _format(final ExampleTable table, final FormattableDocument format) {
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(table, "{");
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
        it.newLine();
      }
    };
    Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(table, "}");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.decreaseIndentation();
      }
    };
    Function1<? super FormattableDocument, ? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForKeyword_1, _function_1);
    format.operator_add(_prepend);
    EList<ExampleRow> _rows = table.getRows();
    this.formatRows(_rows, format);
    EList<ExampleColumn> _columns = table.getColumns();
    this.formatColumns(_columns, format);
  }
  
  /**
   * Hack: No node for type Void - prevent NullPointerException
   */
  protected void _format(final JvmParameterizedTypeReference type, final FormattableDocument format) {
    ICompositeNode _findActualNodeFor = NodeModelUtils.findActualNodeFor(type);
    boolean _notEquals = (!Objects.equal(_findActualNodeFor, null));
    if (_notEquals) {
      super.format(type, format);
    }
  }
  
  protected void format(final EObject table, final FormattableDocument format) {
    if (table instanceof AnonymousClass) {
      _format((AnonymousClass)table, format);
      return;
    } else if (table instanceof XtendAnnotationType) {
      _format((XtendAnnotationType)table, format);
      return;
    } else if (table instanceof XtendClass) {
      _format((XtendClass)table, format);
      return;
    } else if (table instanceof XtendConstructor) {
      _format((XtendConstructor)table, format);
      return;
    } else if (table instanceof XtendEnum) {
      _format((XtendEnum)table, format);
      return;
    } else if (table instanceof XtendFunction) {
      _format((XtendFunction)table, format);
      return;
    } else if (table instanceof XtendInterface) {
      _format((XtendInterface)table, format);
      return;
    } else if (table instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)table, format);
      return;
    } else if (table instanceof RichString) {
      _format((RichString)table, format);
      return;
    } else if (table instanceof XtendField) {
      _format((XtendField)table, format);
      return;
    } else if (table instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)table, format);
      return;
    } else if (table instanceof XAssignment) {
      _format((XAssignment)table, format);
      return;
    } else if (table instanceof XBinaryOperation) {
      _format((XBinaryOperation)table, format);
      return;
    } else if (table instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)table, format);
      return;
    } else if (table instanceof XFeatureCall) {
      _format((XFeatureCall)table, format);
      return;
    } else if (table instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)table, format);
      return;
    } else if (table instanceof XWhileExpression) {
      _format((XWhileExpression)table, format);
      return;
    } else if (table instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)table, format);
      return;
    } else if (table instanceof ExampleTable) {
      _format((ExampleTable)table, format);
      return;
    } else if (table instanceof XtendParameter) {
      _format((XtendParameter)table, format);
      return;
    } else if (table instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)table, format);
      return;
    } else if (table instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)table, format);
      return;
    } else if (table instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)table, format);
      return;
    } else if (table instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)table, format);
      return;
    } else if (table instanceof XBlockExpression) {
      _format((XBlockExpression)table, format);
      return;
    } else if (table instanceof XClosure) {
      _format((XClosure)table, format);
      return;
    } else if (table instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)table, format);
      return;
    } else if (table instanceof XConstructorCall) {
      _format((XConstructorCall)table, format);
      return;
    } else if (table instanceof XForLoopExpression) {
      _format((XForLoopExpression)table, format);
      return;
    } else if (table instanceof XIfExpression) {
      _format((XIfExpression)table, format);
      return;
    } else if (table instanceof XReturnExpression) {
      _format((XReturnExpression)table, format);
      return;
    } else if (table instanceof XSwitchExpression) {
      _format((XSwitchExpression)table, format);
      return;
    } else if (table instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)table, format);
      return;
    } else if (table instanceof XThrowExpression) {
      _format((XThrowExpression)table, format);
      return;
    } else if (table instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)table, format);
      return;
    } else if (table instanceof XTypeLiteral) {
      _format((XTypeLiteral)table, format);
      return;
    } else if (table instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)table, format);
      return;
    } else if (table instanceof XAnnotation) {
      _format((XAnnotation)table, format);
      return;
    } else if (table instanceof XtendFile) {
      _format((XtendFile)table, format);
      return;
    } else if (table instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)table, format);
      return;
    } else if (table instanceof XCatchClause) {
      _format((XCatchClause)table, format);
      return;
    } else if (table instanceof XExpression) {
      _format((XExpression)table, format);
      return;
    } else if (table instanceof XImportDeclaration) {
      _format((XImportDeclaration)table, format);
      return;
    } else if (table instanceof XImportSection) {
      _format((XImportSection)table, format);
      return;
    } else if (table != null) {
      _format(table, format);
      return;
    } else if (table == null) {
      _format((Void)null, format);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(table, format).toString());
    }
  }
}
