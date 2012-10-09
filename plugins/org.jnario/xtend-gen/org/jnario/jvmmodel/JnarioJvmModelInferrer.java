package org.jnario.jvmmodel;

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.jnario.ExampleColumn;
import org.jnario.runner.Extension;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

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
  
  @Inject
  private IJvmModelAssociations _iJvmModelAssociations;
  
  public JvmField toField(final ExampleColumn column) {
    String _name = column.getName();
    JvmTypeReference _orCreateType = this.getOrCreateType(column);
    final JvmField field = this._jvmTypesBuilder.toField(column, _name, _orCreateType);
    boolean _notEquals = (!Objects.equal(field, null));
    if (_notEquals) {
      field.setVisibility(JvmVisibility.PUBLIC);
    }
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
        Iterable<JvmTypeReference> cellTypes = Iterables.<XExpression, JvmTypeReference>transform(_cells_1, new Function<XExpression,JvmTypeReference>() {
            public JvmTypeReference apply(XExpression input) {
              return _function.apply(input);
            }
        });
        Predicate<JvmTypeReference> _notNull = Predicates.<JvmTypeReference>notNull();
        Iterable<JvmTypeReference> _filter = Iterables.<JvmTypeReference>filter(cellTypes, _notNull);
        cellTypes = _filter;
        final ArrayList<JvmTypeReference> cellTypeList = Lists.<JvmTypeReference>newArrayList(cellTypes);
        boolean _isEmpty_1 = cellTypeList.isEmpty();
        if (_isEmpty_1) {
          JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName(Object.class, column);
          column.setType(_typeForName_1);
        } else {
          JvmTypeReference _commonSuperType = this._typeConformanceComputer.getCommonSuperType(cellTypeList);
          JvmTypeReference _cloneWithProxies = this._jvmTypesBuilder.cloneWithProxies(_commonSuperType);
          column.setType(_cloneWithProxies);
        }
      }
    }
    return column.getType();
  }
  
  public void infer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  protected void transform(final XtendField source, final JvmGenericType container) {
    JvmVisibility _visibility = source.getVisibility();
    boolean _equals = Objects.equal(_visibility, JvmVisibility.PRIVATE);
    if (_equals) {
      source.setVisibility(JvmVisibility.DEFAULT);
    }
    super.transform(source, container);
    boolean _isExtension = source.isExtension();
    if (_isExtension) {
      Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(source);
      EObject _head = IterableExtensions.<EObject>head(_jvmElements);
      final JvmField field = ((JvmField) _head);
      field.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmAnnotationReference> _annotations = field.getAnnotations();
      JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(source, Extension.class);
      this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
    }
  }
  
  public String serialize(final EObject obj) {
    ICompositeNode _node = NodeModelUtils.getNode(obj);
    return _node==null?(String)null:_node.getText();
  }
  
  public XtendFile xtendFile(final EObject obj) {
    XtendFile _containerOfType = EcoreUtil2.<XtendFile>getContainerOfType(obj, XtendFile.class);
    return _containerOfType;
  }
  
  public String packageName(final EObject obj) {
    XtendFile _xtendFile = this.xtendFile(obj);
    String _package = _xtendFile==null?(String)null:_xtendFile.getPackage();
    return _package;
  }
}
