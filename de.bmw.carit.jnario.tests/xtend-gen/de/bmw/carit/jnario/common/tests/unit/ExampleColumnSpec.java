package de.bmw.carit.jnario.common.tests.unit;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.ExampleColumn;
import de.bmw.carit.jnario.common.test.util.ModelStore;
import de.bmw.carit.jnario.common.test.util.Query;
import de.bmw.carit.jnario.common.test.util.SpecTestInstantiator;
import de.bmw.carit.jnario.common.tests.unit.ExampleColumnSpecExamples;
import de.bmw.carit.jnario.lib.ExampleTable;
import de.bmw.carit.jnario.lib.ExampleTableIterators;
import de.bmw.carit.jnario.lib.MatcherChain;
import de.bmw.carit.jnario.lib.Should;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Extension;
import de.bmw.carit.jnario.runner.InstantiateWith;
import de.bmw.carit.jnario.runner.Named;
import de.bmw.carit.jnario.runner.Order;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("ExampleColumn")
@InstantiateWith(SpecTestInstantiator.class)
public class ExampleColumnSpec {
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  @Extension
  public ISerializer _iSerializer;
  
  @Before
  public void _initExampleColumnSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("columnIndex", "cellIndex", "value"), 
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("0", "0", "\"1\""), 0, 0, "1"),
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("0", "1", "\"3\""), 0, 1, "3"),
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("1", "0", "\"2\""), 1, 0, "2"),
      new ExampleColumnSpecExamples(  java.util.Arrays.asList("1", "1", "\"4\""), 1, 1, "4")
    );
  }
  
  private ExampleTable<ExampleColumnSpecExamples> examples;
  
  @Test
  @Named("calculates cells based on table")
  @Order(3)
  public void calculatesCellsBasedOnTable() throws Exception {
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
            {
              Query _query = ExampleColumnSpec.this._modelStore.query();
              de.bmw.carit.jnario.common.ExampleTable _first = _query.<de.bmw.carit.jnario.common.ExampleTable>first(de.bmw.carit.jnario.common.ExampleTable.class);
              EList<ExampleColumn> _columns = _first.getColumns();
              final EList<ExampleColumn> columns = _columns;
              ExampleColumn _get = columns.get(it.columnIndex);
              final ExampleColumn column = _get;
              EList<XExpression> _cells = column.getCells();
              XExpression _get_1 = _cells.get(it.cellIndex);
              final XExpression cell = _get_1;
              String _serialize = ExampleColumnSpec.this._iSerializer.serialize(cell);
              String _trim = _serialize.trim();
              MatcherChain<String> _should = Should.<String>should(_trim);
              Should.<String>be(_should, it.value);
            }
          }
        };
      ExampleTableIterators.<ExampleColumnSpecExamples>forEach(this.examples, _function);
  }
}
