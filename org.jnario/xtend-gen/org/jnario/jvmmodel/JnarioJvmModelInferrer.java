package org.jnario.jvmmodel;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.jvmmodel.JunitAnnotationProvider;
import org.jnario.runner.Named;

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public class JnarioJvmModelInferrer extends XtendJvmModelInferrer {
  @Inject
  public XbaseCompiler compiler;
  
  @Inject
  private ITypeProvider _iTypeProvider;
  
  @Inject
  private TypeConformanceComputer _typeConformanceComputer;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public boolean checkClassPath(final EObject context, final JunitAnnotationProvider annotationProvider) {
    try {
      annotationProvider.getBeforeAnnotation(context);
    } catch (final Throwable _t) {
      if (_t instanceof RuntimeException) {
        final RuntimeException e = (RuntimeException)_t;
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    JvmType _findDeclaredType = this._typeReferences.findDeclaredType(Named.class, context);
    boolean _equals = Objects.equal(_findDeclaredType, null);
    if (_equals) {
      return false;
    }
    return true;
  }
  
  public JvmField toField(final ExampleColumn column) {
    String _name = column.getName();
    JvmTypeReference _orCreateType = this.getOrCreateType(column);
    JvmField _field = this._jvmTypesBuilder.toField(column, _name, _orCreateType);
    final JvmField field = _field;
    field.setVisibility(JvmVisibility.PUBLIC);
    return field;
  }
  
  public JvmTypeReference getOrCreateType(final ExampleColumn column) {
    boolean _or = false;
    JvmTypeReference _type = column.getType();
    boolean _equals = Objects.equal(_type, null);
    if (_equals) {
      _or = true;
    } else {
      JvmTypeReference _type_1 = column.getType();
      JvmType _type_2 = _type_1.getType();
      boolean _equals_1 = Objects.equal(_type_2, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      EList<XExpression> _cells = column.getCells();
      boolean _isEmpty = _cells.isEmpty();
      if (_isEmpty) {
        JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Object.class, column);
        column.setType(_typeForName);
      } else {
        EList<XExpression> _cells_1 = column.getCells();
        final Function1<XExpression,JvmTypeReference> _function = new Function1<XExpression,JvmTypeReference>() {
            public JvmTypeReference apply(final XExpression it) {
              JvmTypeReference _type = JnarioJvmModelInferrer.this._iTypeProvider.getType(it);
              return _type;
            }
          };
        Iterable<JvmTypeReference> _transform = Iterables.<XExpression, JvmTypeReference>transform(_cells_1, new Function<XExpression,JvmTypeReference>() {
            public JvmTypeReference apply(XExpression arg0) {
              return _function.apply(arg0);
            }
        });
        Iterable<JvmTypeReference> cellTypes = _transform;
        Predicate<JvmTypeReference> _notNull = Predicates.<JvmTypeReference>notNull();
        Iterable<JvmTypeReference> _filter = Iterables.<JvmTypeReference>filter(cellTypes, _notNull);
        cellTypes = _filter;
        ArrayList<JvmTypeReference> _newArrayList = Lists.<JvmTypeReference>newArrayList(cellTypes);
        final ArrayList<JvmTypeReference> cellTypeList = _newArrayList;
        boolean _isEmpty_1 = cellTypeList.isEmpty();
        if (_isEmpty_1) {
          JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName(Object.class, column);
          column.setType(_typeForName_1);
        } else {
          JvmTypeReference _commonSuperType = this._typeConformanceComputer.getCommonSuperType(cellTypeList);
          column.setType(_commonSuperType);
        }
      }
    }
    JvmTypeReference _type_3 = column.getType();
    return _type_3;
  }
  
  public ITreeAppendable cellToAppendable(final ExampleRow row, final int i, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      EList<XExpression> _cells = row.getCells();
      int _size = _cells.size();
      boolean _greaterThan = (_size > i);
      if (_greaterThan) {
        EList<XExpression> _cells_1 = row.getCells();
        XExpression _get = _cells_1.get(i);
        this.compiler.toJavaExpression(_get, appendable);
      }
      _xblockexpression = (appendable);
    }
    return _xblockexpression;
  }
  
  public void infer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
}
