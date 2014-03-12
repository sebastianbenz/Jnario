/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import java.util.Arrays;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.jnario.Should;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleImplementationSpecExamples;
import org.jnario.spec.tests.unit.naming.ExampleSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("implementation")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleImplementationSpec extends ExampleSpec {
  public ExampleTable<ExampleImplementationSpecExamples> _initExampleImplementationSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("example", "type"), 
      new ExampleImplementationSpecExamples(  Arrays.asList("\"fact \'with body\' {1}\"", "typeof(XBlockExpression)"), _initExampleImplementationSpecExamplesCell0(), _initExampleImplementationSpecExamplesCell1()),
      new ExampleImplementationSpecExamples(  Arrays.asList("\"fact \'with code\' should be \'with code\'\"", "typeof(Should)"), _initExampleImplementationSpecExamplesCell2(), _initExampleImplementationSpecExamplesCell3())
    );
  }
  
  protected ExampleTable<ExampleImplementationSpecExamples> examples = _initExampleImplementationSpecExamples();
  
  public String _initExampleImplementationSpecExamplesCell0() {
    return "fact \'with body\' {1}";
  }
  
  public Class<XBlockExpression> _initExampleImplementationSpecExamplesCell1() {
    return XBlockExpression.class;
  }
  
  public String _initExampleImplementationSpecExamplesCell2() {
    return "fact \'with code\' should be \'with code\'";
  }
  
  public Class<Should> _initExampleImplementationSpecExamplesCell3() {
    return Should.class;
  }
  
  @Test
  @Named("examples.forEach[example.parse.expression should be instanceOf[type]]")
  @Order(1)
  public void _examplesForEachExampleParseExpressionShouldBeInstanceOfType() throws Exception {
    final Procedure1<ExampleImplementationSpecExamples> _function = new Procedure1<ExampleImplementationSpecExamples>() {
      public void apply(final ExampleImplementationSpecExamples it) {
        String _example = it.getExample();
        Example _parse = ExampleImplementationSpec.this.parse(_example);
        XExpression _expression = _parse.getExpression();
        Class<? extends XExpression> _type = it.getType();
        Matcher<XExpression> _instanceOf = CoreMatchers.<XExpression>instanceOf(_type);
        Assert.assertTrue("\nExpected example.parse.expression should be instanceOf(type) but"
         + "\n     example.parse.expression is " + new org.hamcrest.StringDescription().appendValue(_expression).toString()
         + "\n     example.parse is " + new org.hamcrest.StringDescription().appendValue(_parse).toString()
         + "\n     example is " + new org.hamcrest.StringDescription().appendValue(_example).toString()
         + "\n     instanceOf(type) is " + new org.hamcrest.StringDescription().appendValue(_instanceOf).toString()
         + "\n     type is " + new org.hamcrest.StringDescription().appendValue(_type).toString() + "\n", org.jnario.lib.Should.<XExpression>should_be(_expression, _instanceOf));
        
      }
    };
    ExampleTableIterators.<ExampleImplementationSpecExamples>forEach(this.examples, _function);
  }
}
