package de.bmw.carit.jnario.common.tests.unit;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.ExampleTable;
import de.bmw.carit.jnario.common.test.util.ModelStore;
import de.bmw.carit.jnario.common.test.util.Query;
import de.bmw.carit.jnario.common.test.util.SpecTestInstantiator;
import de.bmw.carit.jnario.lib.MatcherChain;
import de.bmw.carit.jnario.lib.Should;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Extension;
import de.bmw.carit.jnario.runner.InstantiateWith;
import de.bmw.carit.jnario.runner.Named;
import de.bmw.carit.jnario.runner.Order;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("ExampleTable")
@InstantiateWith(SpecTestInstantiator.class)
public class ExampleTableSpec {
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("is valid if all rows have the same number of columns")
  @Order(1)
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
      ExampleTable _first = _query.<ExampleTable>first(de.bmw.carit.jnario.common.ExampleTable.class);
      boolean _isValid = _first.isValid();
      MatcherChain<Boolean> _should = Should.<Boolean>should(Boolean.valueOf(_isValid));
      Should.<Boolean>be(_should, Boolean.valueOf(true));
  }
  
  @Test
  @Named("is invalid if one row has a different number of columns")
  @Order(2)
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
      ExampleTable _first = _query.<ExampleTable>first(de.bmw.carit.jnario.common.ExampleTable.class);
      boolean _isValid = _first.isValid();
      MatcherChain<Boolean> _should = Should.<Boolean>should(Boolean.valueOf(_isValid));
      Should.<Boolean>be(_should, Boolean.valueOf(false));
  }
}
