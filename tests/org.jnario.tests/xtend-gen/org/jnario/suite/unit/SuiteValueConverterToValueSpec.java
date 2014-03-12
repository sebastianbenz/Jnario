/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.unit.SuiteValueConverterSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toValue")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteValueConverterToValueSpec extends SuiteValueConverterSpec {
  @Test
  @Named("removes escape character for dashes")
  @Order(1)
  public void _removesEscapeCharacterForDashes() throws Exception {
    String _value = this.subject.toValue("##suite \\- with dash", null);
    Assert.assertTrue("\nExpected subject.toValue(\"##suite \\\\- with dash\", null) => \"##suite - with dash\" but"
     + "\n     subject.toValue(\"##suite \\\\- with dash\", null) is " + new org.hamcrest.StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", Should.<String>operator_doubleArrow(_value, "##suite - with dash"));
    
  }
  
  @Test
  @Named("removes escape character for  hashs")
  @Order(2)
  public void _removesEscapeCharacterForHashs() throws Exception {
    String _value = this.subject.toValue("##suite \\# with hash", null);
    Assert.assertTrue("\nExpected subject.toValue(\"##suite \\\\# with hash\", null) => \"##suite # with hash\" but"
     + "\n     subject.toValue(\"##suite \\\\# with hash\", null) is " + new org.hamcrest.StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", Should.<String>operator_doubleArrow(_value, "##suite # with hash"));
    
  }
}
