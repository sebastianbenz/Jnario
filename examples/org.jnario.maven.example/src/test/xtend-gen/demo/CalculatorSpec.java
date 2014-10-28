/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package demo;

import demo.Calculator;
import demo.CalculatorSpecExamples;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Calculator")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CalculatorSpec {
  @Test
  @Named("should add two values")
  @Order(1)
  public void _shouldAddTwoValues() throws Exception {
    Calculator _calculator = new Calculator();
    int _add = _calculator.add(1, 2);
    Assert.assertTrue("\nExpected new Calculator().add(1, 2) should be 3 but"
     + "\n     new Calculator().add(1, 2) is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_add)).toString()
     + "\n     new Calculator() is " + new org.hamcrest.StringDescription().appendValue(_calculator).toString() + "\n", Should.<Integer>should_be(Integer.valueOf(_add), Integer.valueOf(3)));
    
  }
  
  public ExampleTable<CalculatorSpecExamples> _initCalculatorSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("a", "b", "sum"), 
      new CalculatorSpecExamples(  Arrays.asList("1", "2", "3"), _initCalculatorSpecExamplesCell0(), _initCalculatorSpecExamplesCell1(), _initCalculatorSpecExamplesCell2()),
      new CalculatorSpecExamples(  Arrays.asList("1", "3", "4"), _initCalculatorSpecExamplesCell3(), _initCalculatorSpecExamplesCell4(), _initCalculatorSpecExamplesCell5())
    );
  }
  
  protected ExampleTable<CalculatorSpecExamples> examples = _initCalculatorSpecExamples();
  
  public int _initCalculatorSpecExamplesCell0() {
    return 1;
  }
  
  public int _initCalculatorSpecExamplesCell1() {
    return 2;
  }
  
  public int _initCalculatorSpecExamplesCell2() {
    return 3;
  }
  
  public int _initCalculatorSpecExamplesCell3() {
    return 1;
  }
  
  public int _initCalculatorSpecExamplesCell4() {
    return 3;
  }
  
  public int _initCalculatorSpecExamplesCell5() {
    return 4;
  }
  
  @Test
  @Named("should handle tables")
  @Order(2)
  public void _shouldHandleTables() throws Exception {
    final Procedure1<CalculatorSpecExamples> _function = new Procedure1<CalculatorSpecExamples>() {
      public void apply(final CalculatorSpecExamples it) {
        int _a = it.getA();
        int _b = it.getB();
        int _plus = (_a + _b);
        int _sum = it.getSum();
        Assert.assertTrue("\nExpected a + b => sum but"
         + "\n     a + b is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_plus)).toString()
         + "\n     a is " + new org.hamcrest.StringDescription().appendValue(_a).toString()
         + "\n     b is " + new org.hamcrest.StringDescription().appendValue(_b).toString()
         + "\n     sum is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_sum)).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(_sum)));
        
      }
    };
    Each.<CalculatorSpecExamples>forEach(this.examples, _function);
  }
}
