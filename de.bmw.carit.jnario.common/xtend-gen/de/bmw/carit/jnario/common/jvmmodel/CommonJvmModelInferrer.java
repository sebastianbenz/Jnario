package de.bmw.carit.jnario.common.jvmmodel;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.ExampleColumn;
import de.bmw.carit.jnario.common.ExampleRow;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer;

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public class CommonJvmModelInferrer extends Xtend2JvmModelInferrer {
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
  
  public JvmField toField(final ExampleColumn column) {
      String _name = column.getName();
      JvmTypeReference _orCreateType = this.getOrCreateType(column);
      JvmField _field = this._jvmTypesBuilder.toField(column, _name, _orCreateType);
      final JvmField field = _field;
      field.setVisibility(JvmVisibility.PUBLIC);
      return field;
  }
  
  public JvmTypeReference getOrCreateType(final ExampleColumn column) {
      boolean _operator_or = false;
      JvmTypeReference _type = column.getType();
      boolean _operator_equals = ObjectExtensions.operator_equals(_type, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        JvmTypeReference _type_1 = column.getType();
        JvmType _type_2 = _type_1.getType();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_type_2, null);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      if (_operator_or) {
        EList<XExpression> _cells = column.getCells();
        boolean _isEmpty = _cells.isEmpty();
        if (_isEmpty) {
          JvmTypeReference _typeForName = this._typeReferences.getTypeForName(java.lang.Object.class, column);
          column.setType(_typeForName);
        } else {
          {
            EList<XExpression> _cells_1 = column.getCells();
            final Function1<XExpression,JvmTypeReference> _function = new Function1<XExpression,JvmTypeReference>() {
                public JvmTypeReference apply(final XExpression it) {
                  JvmTypeReference _type = CommonJvmModelInferrer.this._iTypeProvider.getType(it);
                  return _type;
                }
              };
            List<JvmTypeReference> _map = ListExtensions.<XExpression, JvmTypeReference>map(_cells_1, _function);
            final List<JvmTypeReference> cellTypes = _map;
            JvmTypeReference _commonSuperType = this._typeConformanceComputer.getCommonSuperType(cellTypes);
            column.setType(_commonSuperType);
          }
        }
      }
      JvmTypeReference _type_3 = column.getType();
      return _type_3;
  }
  
  public StringBuilderBasedAppendable cellToAppendable(final ExampleRow row, final int i) {
    StringBuilderBasedAppendable _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
      StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
      EList<XExpression> _cells = row.getCells();
      int _size = _cells.size();
      boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_size, i);
      if (_operator_greaterThan) {
        EList<XExpression> _cells_1 = row.getCells();
        XExpression _get = _cells_1.get(i);
        this.compiler.toJavaExpression(_get, appendable);
      }
      _xblockexpression = (appendable);
    }
    return _xblockexpression;
  }
  
  public StringBuilderBasedAppendable toJavaExpression(final XExpression expr) {
    StringBuilderBasedAppendable _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
      StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
      this.compiler.toJavaExpression(expr, appendable);
      _xblockexpression = (appendable);
    }
    return _xblockexpression;
  }
  
  public StringBuilderBasedAppendable toJavaStatement(final XExpression expr, final boolean isReferenced) {
    StringBuilderBasedAppendable _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
      StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
      this.compiler.toJavaStatement(expr, appendable, isReferenced);
      _xblockexpression = (appendable);
    }
    return _xblockexpression;
  }
}
