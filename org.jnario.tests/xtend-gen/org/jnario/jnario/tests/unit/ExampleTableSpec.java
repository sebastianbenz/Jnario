/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.jnario.tests.unit;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.lib.MatcherChain;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
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
      ExampleTable _first = _query.<ExampleTable>first(org.jnario.ExampleTable.class);
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
      ExampleTable _first = _query.<ExampleTable>first(org.jnario.ExampleTable.class);
      boolean _isValid = _first.isValid();
      MatcherChain<Boolean> _should = Should.<Boolean>should(Boolean.valueOf(_isValid));
      Should.<Boolean>be(_should, Boolean.valueOf(false));
  }
}
