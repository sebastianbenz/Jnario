/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Example")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExecutableIsPendingExampleSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("pendingExample.isPending[] should be true")
  @Order(1)
  public void _pendingExampleIsPendingShouldBeTrue() throws Exception {
    Example _pendingExample = Specs.pendingExample();
    boolean _isPending = _pendingExample.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected pendingExample.isPending() should be true but"
     + "\n     pendingExample.isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     pendingExample is " + new org.hamcrest.StringDescription().appendValue(_pendingExample).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("implementedExample.isPending[] should be false")
  @Order(2)
  public void _implementedExampleIsPendingShouldBeFalse() throws Exception {
    Example _implementedExample = Specs.implementedExample();
    boolean _isPending = _implementedExample.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), false);
    Assert.assertTrue("\nExpected implementedExample.isPending() should be false but"
     + "\n     implementedExample.isPending() is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     implementedExample is " + new org.hamcrest.StringDescription().appendValue(_implementedExample).toString() + "\n", _should_be);
    
  }
}
