/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package demo;

import demo.AdditionFeature;
import demo.Calculator;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith()
@SuppressWarnings("all")
public class AdditionFeatureAddTwoNumbers extends AdditionFeature {
  final Calculator calculator = new Function0<Calculator>() {
    public Calculator apply() {
      Calculator _calculator = new Calculator();
      return _calculator;
    }
  }.apply();
  
  int result;
  
  @Test
  public void whenIEntered50And70() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method first is undefined for the type Scenario: Add two numbers\n"
      + "\nThe method second is undefined for the type Scenario: Add two numbers\n"
      + "\ntoInt cannot be resolved"
      + "\ntoInt cannot be resolved");
  }
  
  @Test
  public void thenTheResultShouldBe120() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method first is undefined for the type Scenario: Add two numbers\n"
      + "\ntoInt cannot be resolved");
  }
}
