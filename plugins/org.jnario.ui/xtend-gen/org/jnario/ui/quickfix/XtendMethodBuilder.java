package org.jnario.ui.quickfix;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.ide.quickfix.XtendTypeReferenceSerializer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.common.types.util.Primitives.Primitive;
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions;
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions.VariableType;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.jnario.ui.quickfix.VariableNameAcceptor;

@SuppressWarnings("all")
public class XtendMethodBuilder {
  @Inject
  private ITypeProvider _iTypeProvider;
  
  @Inject
  private JdtVariableCompletions _jdtVariableCompletions;
  
  @Inject
  private XtendTypeReferenceSerializer _xtendTypeReferenceSerializer;
  
  @Inject
  private Primitives _primitives;
  
  private String _methodName;
  
  public String getMethodName() {
    return this._methodName;
  }
  
  public void setMethodName(final String methodName) {
    this._methodName = methodName;
  }
  
  private XAbstractFeatureCall _featureCall;
  
  public XAbstractFeatureCall getFeatureCall() {
    return this._featureCall;
  }
  
  public void setFeatureCall(final XAbstractFeatureCall featureCall) {
    this._featureCall = featureCall;
  }
  
  private ImportManager _importManager = new Function0<ImportManager>() {
    public ImportManager apply() {
      char _charAt = "$".charAt(0);
      ImportManager _importManager = new ImportManager(false, _charAt);
      return _importManager;
    }
  }.apply();
  
  public ImportManager getImportManager() {
    return this._importManager;
  }
  
  public void setImportManager(final ImportManager importManager) {
    this._importManager = importManager;
  }
  
  public IAppendable build(final IAppendable appendable) {
    final Procedure1<IAppendable> _function = new Procedure1<IAppendable>() {
        public void apply(final IAppendable it) {
          XtendMethodBuilder.this.addPrefix(it);
          XtendMethodBuilder.this.addName(it);
          XtendMethodBuilder.this.addArguments(it);
          XtendMethodBuilder.this.addBody(it);
        }
      };
    IAppendable _doubleArrow = ObjectExtensions.<IAppendable>operator_doubleArrow(appendable, _function);
    return _doubleArrow;
  }
  
  protected IAppendable addName(final IAppendable appendable) {
    String _methodName = this.getMethodName();
    IAppendable _append = appendable.append(_methodName);
    return _append;
  }
  
  protected IAppendable addPrefix(final IAppendable appendable) {
    IAppendable _append = appendable.append("def ");
    return _append;
  }
  
  protected IAppendable addBody(final IAppendable appendable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    Object _returnStatement = this.returnStatement();
    _builder.append(_returnStatement, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    IAppendable _append = appendable.append(_builder);
    return _append;
  }
  
  protected Object returnStatement() {
    boolean _or = false;
    XAbstractFeatureCall _featureCall = this.getFeatureCall();
    boolean _equals = Objects.equal(_featureCall, null);
    if (_equals) {
      _or = true;
    } else {
      XAbstractFeatureCall _featureCall_1 = this.getFeatureCall();
      boolean _isVoid = this.isVoid(_featureCall_1);
      _or = (_equals || _isVoid);
    }
    if (_or) {
      return "";
    } else {
      return this.defaultReturnStatement();
    }
  }
  
  protected StringBuilder defaultReturnStatement() {
    final JvmTypeReference expectedType = this.returnType();
    StringBuilder _stringBuilder = new StringBuilder("return ");
    final StringBuilder result = _stringBuilder;
    boolean _isPrimitive = this._primitives.isPrimitive(expectedType);
    if (_isPrimitive) {
      JvmType _type = expectedType.getType();
      final Primitive primitiveKind = this._primitives.primitiveKind(((JvmPrimitiveType) _type));
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(primitiveKind,Primitive.Boolean)) {
          _matched=true;
          result.append("false");
        }
      }
      if (!_matched) {
        result.append("0");
      }
    } else {
      return result.append("null");
    }
    return result;
  }
  
  private boolean isVoid(final XAbstractFeatureCall featureCall) {
    JvmTypeReference _returnType = this.returnType();
    String _simpleName = _returnType.getSimpleName();
    return Objects.equal(_simpleName, "void");
  }
  
  protected JvmTypeReference returnType() {
    XAbstractFeatureCall _featureCall = this.getFeatureCall();
    JvmTypeReference _expectedType = this._iTypeProvider.getExpectedType(_featureCall);
    return _expectedType;
  }
  
  protected IAppendable addArguments(final IAppendable appendable) {
    IAppendable _xblockexpression = null;
    {
      XAbstractFeatureCall _featureCall = this.getFeatureCall();
      boolean _equals = Objects.equal(_featureCall, null);
      if (_equals) {
        return appendable.append("()");
      }
      XAbstractFeatureCall _featureCall_1 = this.getFeatureCall();
      EList<XExpression> _explicitArguments = _featureCall_1.getExplicitArguments();
      final Iterator<XExpression> iterator = _explicitArguments.iterator();
      final HashSet<String> notallowed = CollectionLiterals.<String>newHashSet();
      appendable.append("(");
      boolean _hasNext = iterator.hasNext();
      boolean _while = _hasNext;
      while (_while) {
        {
          final XExpression expression = iterator.next();
          final JvmTypeReference typeRef = this._iTypeProvider.getType(expression);
          boolean _notEquals = (!Objects.equal(typeRef, null));
          if (_notEquals) {
            this.append(appendable, typeRef);
            appendable.append(" ");
            VariableNameAcceptor _variableNameAcceptor = new VariableNameAcceptor(notallowed);
            final VariableNameAcceptor acceptor = _variableNameAcceptor;
            String _identifier = typeRef.getIdentifier();
            XAbstractFeatureCall _featureCall_2 = this.getFeatureCall();
            this._jdtVariableCompletions.getVariableProposals(_identifier, _featureCall_2, VariableType.PARAMETER, notallowed, acceptor);
            String _variableName = acceptor.getVariableName();
            appendable.append(_variableName);
          }
          boolean _hasNext_1 = iterator.hasNext();
          if (_hasNext_1) {
            appendable.append(", ");
          }
        }
        boolean _hasNext_1 = iterator.hasNext();
        _while = _hasNext_1;
      }
      IAppendable _append = appendable.append(")");
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
  
  protected IAppendable append(final IAppendable appendable, final JvmTypeReference typeRef) {
    IAppendable _xblockexpression = null;
    {
      boolean _equals = Objects.equal(typeRef, null);
      if (_equals) {
        appendable.append("void");
      } else {
        StringBuilder _stringBuilder = new StringBuilder();
        final StringBuilder typeString = _stringBuilder;
        ImportManager _importManager = this.getImportManager();
        JvmType _type = typeRef.getType();
        _importManager.appendType(_type, typeString);
        JvmType _type_1 = typeRef.getType();
        TreeIterator<EObject> _eAllContents = _type_1.eAllContents();
        Iterator<JvmTypeReference> _filter = Iterators.<JvmTypeReference>filter(_eAllContents, JvmTypeReference.class);
        final Function1<JvmTypeReference,Boolean> _function = new Function1<JvmTypeReference,Boolean>() {
            public Boolean apply(final JvmTypeReference it) {
              JvmType _type = it.getType();
              boolean _notEquals = (!Objects.equal(_type, null));
              return Boolean.valueOf(_notEquals);
            }
          };
        Iterator<JvmTypeReference> _filter_1 = IteratorExtensions.<JvmTypeReference>filter(_filter, _function);
        final Procedure1<JvmTypeReference> _function_1 = new Procedure1<JvmTypeReference>() {
            public void apply(final JvmTypeReference it) {
              ImportManager _importManager = XtendMethodBuilder.this.getImportManager();
              JvmType _type = it.getType();
              _importManager.appendType(_type, typeString);
            }
          };
        IteratorExtensions.<JvmTypeReference>forEach(_filter_1, _function_1);
        XAbstractFeatureCall _featureCall = this.getFeatureCall();
        this._xtendTypeReferenceSerializer.serialize(typeRef, _featureCall, appendable);
      }
      _xblockexpression = (appendable);
    }
    return _xblockexpression;
  }
  
  public List<String> imports() {
    ImportManager _importManager = this.getImportManager();
    List<String> _imports = _importManager.getImports();
    return _imports;
  }
}
