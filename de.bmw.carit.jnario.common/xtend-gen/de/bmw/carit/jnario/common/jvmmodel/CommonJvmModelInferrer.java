package de.bmw.carit.jnario.common.jvmmodel;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.ExampleHeading;
import de.bmw.carit.jnario.common.ExampleRow;
import de.bmw.carit.jnario.common.ExampleTable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
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
  
  public void updateTypeInExampleField(final XtendField field) {
      ExampleTable _containerOfType = EcoreUtil2.<ExampleTable>getContainerOfType(field, de.bmw.carit.jnario.common.ExampleTable.class);
      ExampleTable examples = _containerOfType;
      boolean _operator_equals = ObjectExtensions.operator_equals(examples, null);
      if (_operator_equals) {
        return;
      }
      ExampleHeading _heading = examples.getHeading();
      ExampleHeading heading = _heading;
      EList<XtendField> _cells = heading.getCells();
      boolean _contains = _cells.contains(field);
      boolean _operator_not = BooleanExtensions.operator_not(_contains);
      if (_operator_not) {
        return;
      }
      EList<XtendField> _cells_1 = heading.getCells();
      int _indexOf = _cells_1.indexOf(field);
      int index = _indexOf;
      EList<ExampleRow> _rows = examples.getRows();
      boolean _isEmpty = _rows.isEmpty();
      if (_isEmpty) {
        return;
      }
      EList<ExampleRow> _rows_1 = examples.getRows();
      ExampleRow _get = _rows_1.get(0);
      ExampleRow exampleRow = _get;
      EList<XExpression> _cells_2 = exampleRow.getCells();
      int _size = _cells_2.size();
      boolean _operator_lessThan = IntegerExtensions.operator_lessThan(index, _size);
      if (_operator_lessThan) {
        {
          EList<XExpression> _cells_3 = exampleRow.getCells();
          XExpression _get_1 = _cells_3.get(index);
          XExpression exampleCell = _get_1;
          JvmTypeReference _type = this._iTypeProvider.getType(exampleCell);
          field.setType(_type);
          field.setVisibility(JvmVisibility.PUBLIC);
        }
      }
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
