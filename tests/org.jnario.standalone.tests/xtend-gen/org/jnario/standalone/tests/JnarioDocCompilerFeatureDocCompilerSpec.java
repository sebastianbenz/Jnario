/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.standalone.tests;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.standalone.tests.JnarioDocCompilerSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("FeatureDocCompiler")
@CreateWith(value = FeatureTestCreator.class)
public class JnarioDocCompilerFeatureDocCompilerSpec extends JnarioDocCompilerSpec {
  @Test
  @Named("\\\"test/ExamplesFeature.html\\\" should be generated")
  @Order(99)
  public void testExamplesFeatureHtmlShouldBeGenerated() throws Exception {
    Matcher<String> _generated = this.generated();
    boolean _should_be = Should.<String>should_be("test/ExamplesFeature.html", _generated);
    Assert.assertTrue("\nExpected \"test/ExamplesFeature.html\" should be generated but"
     + "\n     generated is " + new StringDescription().appendValue(_generated).toString() + "\n", _should_be);
    
  }
}
