/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.conversion;

import org.eclipse.xtext.util.Strings;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toString")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureValueConverterToStringSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toString[\\\"text\\\"] should be \\\"Prefix:text\\\" + Strings::newLine")
  @Order(1)
  public void _subjectToStringTextShouldBePrefixTextStringsNewLine() throws Exception {
    String _string = this.subject.toString("text");
    String _newLine = Strings.newLine();
    String _plus = ("Prefix:text" + _newLine);
    boolean _should_be = Should.<String>should_be(_string, _plus);
    Assert.assertTrue("\nExpected subject.toString(\"text\") should be \"Prefix:text\" + Strings::newLine but"
     + "\n     subject.toString(\"text\") is " + new org.hamcrest.StringDescription().appendValue(_string).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     \"Prefix:text\" + Strings::newLine is " + new org.hamcrest.StringDescription().appendValue(_plus).toString()
     + "\n     Strings::newLine is " + new org.hamcrest.StringDescription().appendValue(_newLine).toString()
     + "\n     Strings is " + new org.hamcrest.StringDescription().appendValue(Strings.class).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("subject.toString[null] should be null")
  @Order(2)
  public void _subjectToStringNullShouldBeNull() throws Exception {
    String _string = this.subject.toString(null);
    Assert.assertNull("\nExpected subject.toString(null) should be null\n     but is " + new org.hamcrest.StringDescription().appendValue(_string).toString() + "\n", _string);
    
  }
}
