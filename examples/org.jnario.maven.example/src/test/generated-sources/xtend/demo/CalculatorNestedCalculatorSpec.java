/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package demo;

import demo.CalculatorSpec;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Nested Calculator")
public class CalculatorNestedCalculatorSpec extends CalculatorSpec {
  @Test
  @Named("\\\"hello\\\" => \\\"hello\\\"")
  @Order(99)
  public void helloHello() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow("hello", "hello");
    Assert.assertTrue("\nExpected \"hello\" => \"hello\" but"
     + "\n     \"hello\" => \"hello\" is " + new StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
}
