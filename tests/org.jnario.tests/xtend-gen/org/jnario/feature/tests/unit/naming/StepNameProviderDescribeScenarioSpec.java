/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.naming;

import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.jnario.test.util.Features;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("^describe[Scenario]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StepNameProviderDescribeScenarioSpec extends StepNameProviderSpec {
  @Test
  @Named("Features::scenario[\\\" With whitespace \\\"].desc =>  \\\"With whitespace\\\"")
  @Order(1)
  public void _featuresScenarioWithWhitespaceDescWithWhitespace() throws Exception {
    Scenario _scenario = Features.scenario(" With whitespace ");
    String _desc = this.desc(_scenario);
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_desc, "With whitespace");
    Assert.assertTrue("\nExpected Features::scenario(\" With whitespace \").desc =>  \"With whitespace\" but"
     + "\n     Features::scenario(\" With whitespace \").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     Features::scenario(\" With whitespace \") is " + new StringDescription().appendValue(_scenario).toString()
     + "\n     Features is " + new StringDescription().appendValue(Features.class).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Features::scenario[\\\"With [parentheses]\\\"].desc =>  \\\"With [parentheses]\\\"")
  @Order(2)
  public void _featuresScenarioWithParenthesesDescWithParentheses() throws Exception {
    Scenario _scenario = Features.scenario("With (parentheses)");
    String _desc = this.desc(_scenario);
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_desc, "With [parentheses]");
    Assert.assertTrue("\nExpected Features::scenario(\"With (parentheses)\").desc =>  \"With [parentheses]\" but"
     + "\n     Features::scenario(\"With (parentheses)\").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     Features::scenario(\"With (parentheses)\") is " + new StringDescription().appendValue(_scenario).toString()
     + "\n     Features is " + new StringDescription().appendValue(Features.class).toString() + "\n", _doubleArrow);
    
  }
}
