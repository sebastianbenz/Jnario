/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package test;

import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import test.ExamplesFeatureSomeMoreInfo;

@Named("Scenario: Example tables.")
@SuppressWarnings("all")
public class ExamplesFeatureExampleTables extends ExamplesFeatureSomeMoreInfo {
  int a = 0;
  
  int b = 0;
  
  int result = 0;
  
  @Order(0)
  @Named("Given I have entered \\\"333\\\" into the calculator [PENDING]")
  public void _givenIHaveEntered333IntoTheCalculator() {
    super._givenIHaveEntered333IntoTheCalculator();
  }
  
  @Order(1)
  @Named("Given some two numbers \\\"10\\\" and \\\"20\\\"")
  public void _givenSomeTwoNumbers10And20() {
    final StepArguments args = new StepArguments("10", "20");
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    this.a = _int;
    String _second = JnarioIterableExtensions.<String>second(args);
    int _int_1 = StringConversions.toInt(_second);
    this.b = _int_1;
  }
  
  @Order(2)
  @Named("When I add them")
  public void _whenIAddThem() {
    this.result = (this.a + this.b);
  }
  
  @Order(3)
  @Named("Then the result should be \\\"30\\\"")
  public void _thenTheResultShouldBe30() {
    final StepArguments args = new StepArguments("30");
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    Assert.assertTrue("\nExpected result => args.first.toInt but"
     + "\n     result is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(this.result)).toString()
     + "\n     args.first.toInt is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_int)).toString()
     + "\n     args.first is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     args is " + new org.hamcrest.StringDescription().appendValue(args).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(this.result), Integer.valueOf(_int)));
    
  }
}
