/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleCell;
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
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("ExampleColumn")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleColumnSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore _modelStore;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ISerializer _iSerializer;
  
  public ExampleTable<ExampleColumnSpecExamples> _initExampleColumnSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("columnIndex", "cellIndex", "value"), 
      new ExampleColumnSpecExamples(  Arrays.asList("0", "0", "\"1\""), _initExampleColumnSpecExamplesCell0(), _initExampleColumnSpecExamplesCell1(), _initExampleColumnSpecExamplesCell2()),
      new ExampleColumnSpecExamples(  Arrays.asList("0", "1", "\"3\""), _initExampleColumnSpecExamplesCell3(), _initExampleColumnSpecExamplesCell4(), _initExampleColumnSpecExamplesCell5()),
      new ExampleColumnSpecExamples(  Arrays.asList("1", "0", "\"2\""), _initExampleColumnSpecExamplesCell6(), _initExampleColumnSpecExamplesCell7(), _initExampleColumnSpecExamplesCell8()),
      new ExampleColumnSpecExamples(  Arrays.asList("1", "1", "\"4\""), _initExampleColumnSpecExamplesCell9(), _initExampleColumnSpecExamplesCell10(), _initExampleColumnSpecExamplesCell11())
    );
  }
  
  protected ExampleTable<ExampleColumnSpecExamples> examples = _initExampleColumnSpecExamples();
  
  public int _initExampleColumnSpecExamplesCell0() {
    return 0;
  }
  
  public int _initExampleColumnSpecExamplesCell1() {
    return 0;
  }
  
  public String _initExampleColumnSpecExamplesCell2() {
    return "1";
  }
  
  public int _initExampleColumnSpecExamplesCell3() {
    return 0;
  }
  
  public int _initExampleColumnSpecExamplesCell4() {
    return 1;
  }
  
  public String _initExampleColumnSpecExamplesCell5() {
    return "3";
  }
  
  public int _initExampleColumnSpecExamplesCell6() {
    return 1;
  }
  
  public int _initExampleColumnSpecExamplesCell7() {
    return 0;
  }
  
  public String _initExampleColumnSpecExamplesCell8() {
    return "2";
  }
  
  public int _initExampleColumnSpecExamplesCell9() {
    return 1;
  }
  
  public int _initExampleColumnSpecExamplesCell10() {
    return 1;
  }
  
  public String _initExampleColumnSpecExamplesCell11() {
    return "4";
  }
  
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
        int _columnIndex = it.getColumnIndex();
        final ExampleColumn column = columns.get(_columnIndex);
        EList<ExampleCell> _cells = column.getCells();
        int _cellIndex = it.getCellIndex();
        final ExampleCell cell = _cells.get(_cellIndex);
        String _serialize = ExampleColumnSpec.this._iSerializer.serialize(cell);
        String _trim = _serialize.trim();
        String _value = it.getValue();
        Assert.assertTrue("\nExpected cell.serialize.trim => value but"
         + "\n     cell.serialize.trim is " + new org.hamcrest.StringDescription().appendValue(_trim).toString()
         + "\n     cell.serialize is " + new org.hamcrest.StringDescription().appendValue(_serialize).toString()
         + "\n     cell is " + new org.hamcrest.StringDescription().appendValue(cell).toString()
         + "\n     value is " + new org.hamcrest.StringDescription().appendValue(_value).toString() + "\n", Should.<String>operator_doubleArrow(_trim, _value));
        
      }
    };
    ExampleTableIterators.<ExampleColumnSpecExamples>forEach(this.examples, _function);
  }
}
