package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("ExampleTable")
@CreateWith(value = SpecTestCreator.class)
public class ExampleTableSpec {
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("is valid if all rows have the same number of columns")
  @Order(99)
  public void isValidIfAllRowsHaveTheSameNumberOfColumns() throws Exception {
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
    _builder.append("| 1 | 3 |");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    Query _query = this._modelStore.query();
    ExampleTable _first = _query.<ExampleTable>first(ExampleTable.class);
    boolean _isValid = _first.isValid();
    Assert.assertTrue("\nExpected query.first(typeof(ExampleTable)).isValid() but"
     + "\n     query.first(typeof(ExampleTable)) is " + _first
     + "\n     query is " + _query
     + "\n      is " + this._modelStore + "\n", _isValid);
    
  }
  
  @Test
  @Named("is invalid if one row has a different number of columns")
  @Order(99)
  public void isInvalidIfOneRowHasADifferentNumberOfColumns() throws Exception {
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
    _builder.append("| 1 | ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    Query _query = this._modelStore.query();
    ExampleTable _first = _query.<ExampleTable>first(ExampleTable.class);
    boolean _isValid = _first.isValid();
    boolean _not = (!_isValid);
    Assert.assertTrue("\nExpected !query.first(typeof(ExampleTable)).isValid() but"
     + "\n     query.first(typeof(ExampleTable)).isValid() is " + _isValid
     + "\n     query.first(typeof(ExampleTable)) is " + _first
     + "\n     query is " + _query
     + "\n      is " + this._modelStore + "\n", _not);
    
  }
}
