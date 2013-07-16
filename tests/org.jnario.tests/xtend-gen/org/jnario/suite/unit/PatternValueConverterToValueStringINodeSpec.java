/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import java.util.Arrays;
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
import org.jnario.suite.unit.PatternValueConverterToValueStringINodeSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toValue[String, INode]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class PatternValueConverterToValueStringINodeSpec extends PatternValueConverterSpec {
  @Subject
  public PatternValueConverter subject;
  
  public ExampleTable<PatternValueConverterToValueStringINodeSpecExamples> _initPatternValueConverterToValueStringINodeSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("input", "result"), 
      new PatternValueConverterToValueStringINodeSpecExamples(  Arrays.asList("null", "null"), null, null),
      new PatternValueConverterToValueStringINodeSpecExamples(  Arrays.asList("\"\"", "null"), _initPatternValueConverterToValueStringINodeSpecExamplesCell2(), null),
      new PatternValueConverterToValueStringINodeSpecExamples(  Arrays.asList("\"\\\\apattern\\\\\"", "\"apattern\""), _initPatternValueConverterToValueStringINodeSpecExamplesCell4(), _initPatternValueConverterToValueStringINodeSpecExamplesCell5())
    );
  }
  
  protected ExampleTable<PatternValueConverterToValueStringINodeSpecExamples> examples = _initPatternValueConverterToValueStringINodeSpecExamples();
  
  public Object _initPatternValueConverterToValueStringINodeSpecExamplesCell0() {
    return null;
  }
  
  public Object _initPatternValueConverterToValueStringINodeSpecExamplesCell1() {
    return null;
  }
  
  public String _initPatternValueConverterToValueStringINodeSpecExamplesCell2() {
    return "";
  }
  
  public Object _initPatternValueConverterToValueStringINodeSpecExamplesCell3() {
    return null;
  }
  
  public String _initPatternValueConverterToValueStringINodeSpecExamplesCell4() {
    return "\\apattern\\";
  }
  
  public String _initPatternValueConverterToValueStringINodeSpecExamplesCell5() {
    return "apattern";
  }
  
  @Test
  @Named("examples.forEach[subject.toValue[input, null] => result]")
  @Order(1)
  public void _examplesForEachSubjectToValueInputNullResult() throws Exception {
    final Procedure1<PatternValueConverterToValueStringINodeSpecExamples> _function = new Procedure1<PatternValueConverterToValueStringINodeSpecExamples>() {
        public void apply(final PatternValueConverterToValueStringINodeSpecExamples it) {
          String _input = it.getInput();
          String _value = PatternValueConverterToValueStringINodeSpec.this.subject.toValue(_input, null);
          String _result = it.getResult();
          boolean _doubleArrow = Should.<String>operator_doubleArrow(_value, _result);
          Assert.assertTrue("\nExpected subject.toValue(input, null) => result but"
           + "\n     subject.toValue(input, null) is " + new org.hamcrest.StringDescription().appendValue(_value).toString()
           + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(PatternValueConverterToValueStringINodeSpec.this.subject).toString()
           + "\n     input is " + new org.hamcrest.StringDescription().appendValue(_input).toString()
           + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<PatternValueConverterToValueStringINodeSpecExamples>forEach(this.examples, _function);
  }
}
