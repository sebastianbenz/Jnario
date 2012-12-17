package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.ExampleColumn;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.unit.jnario.ExampleColumnSpecExamples;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("ExampleColumn")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class ExampleColumnSpec {
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  @Extension
  public ISerializer _iSerializer;
  
  public ExampleTable<ExampleColumnSpecExamples> _initExampleColumnSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("columnIndex", "cellIndex", "value"), 
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("0", "0", "\"1\""), 0, 0, "1"),
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("0", "1", "\"3\""), 0, 1, "3"),
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("1", "0", "\"2\""), 1, 0, "2"),
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("1", "1", "\"4\""), 1, 1, "4")
    );
  }
  
  protected ExampleTable<ExampleColumnSpecExamples> examples = _initExampleColumnSpecExamples();
  
  @Test
  @Named("calculates cells based on table")
  @Order(1)
  public void _calculatesCellsBasedOnTable() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("describe \"ExampleTable\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| a | b |");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| 1 | 2 |");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| 3 | 4 |");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    final Procedure1<ExampleColumnSpecExamples> _function = new Procedure1<ExampleColumnSpecExamples>() {
        public void apply(final ExampleColumnSpecExamples it) {
          Query _query = ExampleColumnSpec.this._modelStore.query();
          org.jnario.ExampleTable _first = _query.<org.jnario.ExampleTable>first(org.jnario.ExampleTable.class);
          final EList<ExampleColumn> columns = _first.getColumns();
          final ExampleColumn column = columns.get(it.columnIndex);
          EList<XExpression> _cells = column.getCells();
          final XExpression cell = _cells.get(it.cellIndex);
          String _serialize = ExampleColumnSpec.this._iSerializer.serialize(cell);
          String _trim = _serialize.trim();
          boolean _doubleArrow = Should.operator_doubleArrow(_trim, it.value);
          Assert.assertTrue("\nExpected cell.serialize.trim => value but"
           + "\n     cell.serialize.trim is " + new StringDescription().appendValue(_trim).toString()
           + "\n     cell.serialize is " + new StringDescription().appendValue(_serialize).toString()
           + "\n     cell is " + new StringDescription().appendValue(cell).toString()
           + "\n     value is " + new StringDescription().appendValue(it.value).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<ExampleColumnSpecExamples>forEach(this.examples, _function);
  }
}
