package de.bmw.carit.jnario.common.jvmmodel;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.ExampleHeading;
import de.bmw.carit.jnario.common.ExampleRow;
import de.bmw.carit.jnario.common.ExampleTable;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer;
import org.eclipse.xtext.xtend2.xtend2.XtendField;

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public class CommonJvmModelInferrer extends Xtend2JvmModelInferrer {
  @Inject
  private ITypeProvider _iTypeProvider;
  
  @Inject
  public XbaseCompiler compiler;
  
  @Inject
  private TypeConformanceComputer typeConformanceComputer;
  
  public void updateTypeInExampleField(final XtendField field) {
      ExampleTable _containerOfType = EcoreUtil2.<ExampleTable>getContainerOfType(field, de.bmw.carit.jnario.common.ExampleTable.class);
      ExampleTable examples = _containerOfType;
      boolean _operator_or = false;
      boolean _operator_equals = ObjectExtensions.operator_equals(examples, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        ExampleHeading _heading = examples.getHeading();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_heading, null);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      if (_operator_or) {
        return;
      }
      ExampleHeading _heading_1 = examples.getHeading();
      final ExampleHeading heading = _heading_1;
      EList<XtendField> _cells = heading.getCells();
      boolean _contains = _cells.contains(field);
      boolean _operator_not = BooleanExtensions.operator_not(_contains);
      if (_operator_not) {
        return;
      }
      EList<ExampleRow> _rows = examples.getRows();
      boolean _isEmpty = _rows.isEmpty();
      if (_isEmpty) {
        return;
      }
      boolean _isValidTable = this.isValidTable(examples);
      boolean _operator_not_1 = BooleanExtensions.operator_not(_isValidTable);
      if (_operator_not_1) {
        return;
      }
      EList<XtendField> _cells_1 = heading.getCells();
      int _indexOf = _cells_1.indexOf(field);
      final int column = _indexOf;
      EList<ExampleRow> _rows_1 = examples.getRows();
      final Function1<ExampleRow,XExpression> _function = new Function1<ExampleRow,XExpression>() {
          public XExpression apply(final ExampleRow it) {
            EList<XExpression> _cells = it.getCells();
            XExpression _get = _cells.get(column);
            return _get;
          }
        };
      List<XExpression> _map = ListExtensions.<ExampleRow, XExpression>map(_rows_1, _function);
      final List<XExpression> cells = _map;
      final Function1<XExpression,JvmTypeReference> _function_1 = new Function1<XExpression,JvmTypeReference>() {
          public JvmTypeReference apply(final XExpression it) {
            JvmTypeReference _type = CommonJvmModelInferrer.this._iTypeProvider.getType(it);
            return _type;
          }
        };
      List<JvmTypeReference> _map_1 = ListExtensions.<XExpression, JvmTypeReference>map(cells, _function_1);
      final List<JvmTypeReference> cellTypes = _map_1;
      JvmTypeReference _commonSuperType = this.typeConformanceComputer.getCommonSuperType(cellTypes);
      field.setType(_commonSuperType);
      field.setVisibility(JvmVisibility.PUBLIC);
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
  
  public boolean isValidTable(final ExampleTable table) {
      ExampleHeading _heading = table.getHeading();
      EList<XtendField> _cells = _heading.getCells();
      int _size = _cells.size();
      final int expected = _size;
      EList<ExampleRow> _rows = table.getRows();
      for (final ExampleRow row : _rows) {
        EList<XExpression> _cells_1 = row.getCells();
        int _size_1 = _cells_1.size();
        boolean _operator_notEquals = IntegerExtensions.operator_notEquals(_size_1, expected);
        if (_operator_notEquals) {
          return false;
        }
      }
      return true;
  }
}
