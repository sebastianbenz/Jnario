/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.naming;

import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.jnario.test.util.Features;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("^describe[Feature]")
public class StepNameProviderDescribeFeatureSpec extends StepNameProviderSpec {
  @Test
  @Named("feature[\\\" With whitespace \\\"].desc =>  \\\"With whitespace\\\"")
  @Order(99)
  public void featureWithWhitespaceDescWithWhitespace() throws Exception {
    Feature _feature = Features.feature(" With whitespace ");
    String _desc = this.desc(_feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_desc, "With whitespace");
    Assert.assertTrue("\nExpected feature(\" With whitespace \").desc =>  \"With whitespace\" but"
     + "\n     feature(\" With whitespace \").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     feature(\" With whitespace \") is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("feature[\\\"With [parentheses]\\\"].desc =>  \\\"With [parentheses]\\\"")
  @Order(99)
  public void featureWithParenthesesDescWithParentheses() throws Exception {
    Feature _feature = Features.feature("With (parentheses)");
    String _desc = this.desc(_feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_desc, "With [parentheses]");
    Assert.assertTrue("\nExpected feature(\"With (parentheses)\").desc =>  \"With [parentheses]\" but"
     + "\n     feature(\"With (parentheses)\").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     feature(\"With (parentheses)\") is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
}
