/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameSpecExamples;
import org.jnario.spec.tests.unit.naming.ExampleSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("name")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameSpec extends ExampleSpec {
  public ExampleTable<ExampleNameSpecExamples> _initExampleNameSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("example", "name"), 
      new ExampleNameSpecExamples(  Arrays.asList("\"fact \'with description\'\"", "\"with description\""), _initExampleNameSpecExamplesCell0(), _initExampleNameSpecExamplesCell1()),
      new ExampleNameSpecExamples(  Arrays.asList("\"fact \'with code\' => \'with code\'\"", "\"\'with code\' => \'with code\'\""), _initExampleNameSpecExamplesCell2(), _initExampleNameSpecExamplesCell3()),
      new ExampleNameSpecExamples(  Arrays.asList("\"fact \'multiline code\' => \\n\'with code\'\"", "\"\'multiline code\' => \'with code\'\""), _initExampleNameSpecExamplesCell4(), _initExampleNameSpecExamplesCell5())
    );
  }
  
  protected ExampleTable<ExampleNameSpecExamples> examples = _initExampleNameSpecExamples();
  
  public String _initExampleNameSpecExamplesCell0() {
    return "fact \'with description\'";
  }
  
  public String _initExampleNameSpecExamplesCell1() {
    return "with description";
  }
  
  public String _initExampleNameSpecExamplesCell2() {
    return "fact \'with code\' => \'with code\'";
  }
  
  public String _initExampleNameSpecExamplesCell3() {
    return "\'with code\' => \'with code\'";
  }
  
  public String _initExampleNameSpecExamplesCell4() {
    return "fact \'multiline code\' => \n\'with code\'";
  }
  
  public String _initExampleNameSpecExamplesCell5() {
    return "\'multiline code\' => \'with code\'";
  }
  
  @Test
  @Named("examples.forEach[println[example.parse.name] should be name]")
  @Order(1)
  public void _examplesForEachPrintlnExampleParseNameShouldBeName() throws Exception {
    final Procedure1<ExampleNameSpecExamples> _function = new Procedure1<ExampleNameSpecExamples>() {
        public void apply(final ExampleNameSpecExamples it) {
          String _example = it.getExample();
          Example _parse = ExampleNameSpec.this.parse(_example);
          String _name = _parse.getName();
          String _println = InputOutput.<String>println(_name);
          String _name_1 = it.getName();
          boolean _should_be = Should.<String>should_be(_println, _name_1);
          Assert.assertTrue("\nExpected println(example.parse.name) should be name but"
           + "\n     println(example.parse.name) is " + new StringDescription().appendValue(_println).toString()
           + "\n     example.parse.name is " + new StringDescription().appendValue(_name).toString()
           + "\n     example.parse is " + new StringDescription().appendValue(_parse).toString()
           + "\n     example is " + new StringDescription().appendValue(_example).toString()
           + "\n     name is " + new StringDescription().appendValue(_name_1).toString() + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<ExampleNameSpecExamples>forEach(this.examples, _function);
  }
}
