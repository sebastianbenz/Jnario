/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import java.util.Arrays;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.conversion.PatternValueConverter;
import org.jnario.suite.unit.PatternValueConverterSpec;
import org.jnario.suite.unit.PatternValueConverterToStringStringSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toString[String]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class PatternValueConverterToStringStringSpec extends PatternValueConverterSpec {
  @Subject
  public PatternValueConverter subject;
  
  public ExampleTable<PatternValueConverterToStringStringSpecExamples> _initPatternValueConverterToStringStringSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("input", "result"), 
      new PatternValueConverterToStringStringSpecExamples(  Arrays.asList("null", "\"\\\\\\\\\""), null, _initPatternValueConverterToStringStringSpecExamplesCell1()),
      new PatternValueConverterToStringStringSpecExamples(  Arrays.asList("\"\"", "\"\\\\\\\\\""), _initPatternValueConverterToStringStringSpecExamplesCell2(), _initPatternValueConverterToStringStringSpecExamplesCell3()),
      new PatternValueConverterToStringStringSpecExamples(  Arrays.asList("\"apattern\"", "\"\\\\apattern\\\\\""), _initPatternValueConverterToStringStringSpecExamplesCell4(), _initPatternValueConverterToStringStringSpecExamplesCell5())
    );
  }
  
  protected ExampleTable<PatternValueConverterToStringStringSpecExamples> examples = _initPatternValueConverterToStringStringSpecExamples();
  
  public Object _initPatternValueConverterToStringStringSpecExamplesCell0() {
    return null;
  }
  
  public String _initPatternValueConverterToStringStringSpecExamplesCell1() {
    return "\\\\";
  }
  
  public String _initPatternValueConverterToStringStringSpecExamplesCell2() {
    return "";
  }
  
  public String _initPatternValueConverterToStringStringSpecExamplesCell3() {
    return "\\\\";
  }
  
  public String _initPatternValueConverterToStringStringSpecExamplesCell4() {
    return "apattern";
  }
  
  public String _initPatternValueConverterToStringStringSpecExamplesCell5() {
    return "\\apattern\\";
  }
  
  @Test
  @Named("examples.forEach[subject.toString[input] => result + newLine]")
  @Order(1)
  public void _examplesForEachSubjectToStringInputResultNewLine() throws Exception {
    final Procedure1<PatternValueConverterToStringStringSpecExamples> _function = new Procedure1<PatternValueConverterToStringStringSpecExamples>() {
      public void apply(final PatternValueConverterToStringStringSpecExamples it) {
        String _input = it.getInput();
        String _string = PatternValueConverterToStringStringSpec.this.subject.toString(_input);
        String _result = it.getResult();
        String _newLine = Strings.newLine();
        String _plus = (_result + _newLine);
        Assert.assertTrue("\nExpected subject.toString(input) => result + newLine but"
         + "\n     subject.toString(input) is " + new org.hamcrest.StringDescription().appendValue(_string).toString()
         + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(PatternValueConverterToStringStringSpec.this.subject).toString()
         + "\n     input is " + new org.hamcrest.StringDescription().appendValue(_input).toString()
         + "\n     result + newLine is " + new org.hamcrest.StringDescription().appendValue(_plus).toString()
         + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString()
         + "\n     newLine is " + new org.hamcrest.StringDescription().appendValue(_newLine).toString() + "\n", Should.<String>operator_doubleArrow(_string, _plus));
        
      }
    };
    Each.<PatternValueConverterToStringStringSpecExamples>forEach(this.examples, _function);
  }
}
