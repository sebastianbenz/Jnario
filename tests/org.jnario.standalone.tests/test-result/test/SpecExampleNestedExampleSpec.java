/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package test;

import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import test.SpecExampleSpec;

@Named("Nested Example")
@SuppressWarnings("all")
public class SpecExampleNestedExampleSpec extends SpecExampleSpec {
  @Named("should pass aswell")
  @Order(1)
  public void _shouldPassAswell() throws Exception {
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(
      Integer.valueOf((1 + 1)), Integer.valueOf(2));
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf((1 + 1))).toString() + "\n", _doubleArrow);
    
  }
}
