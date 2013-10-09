/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.conversion;

import org.hamcrest.Matcher;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toValue")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureValueConverterToValueSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toValue[\\\"Prefix: text\\\\n\\\", null] should be \\\"text\\\"")
  @Order(1)
  public void _subjectToValuePrefixTextNNullShouldBeText() throws Exception {
    String _value = this.subject.toValue("Prefix: text\n", null);
    boolean _should_be = Should.<String>should_be(_value, "text");
    Assert.assertTrue("\nExpected subject.toValue(\"Prefix: text\\n\", null) should be \"text\" but"
     + "\n     subject.toValue(\"Prefix: text\\n\", null) is " + new org.hamcrest.StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("subject.toValue[null, null] should be null")
  @Order(2)
  public void _subjectToValueNullNullShouldBeNull() throws Exception {
    String _value = this.subject.toValue(null, null);
    Matcher<String> _nullValue = Should.<String>nullValue();
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_value, _nullValue);
    Assert.assertTrue("\nExpected subject.toValue(null, null) should be null but"
     + "\n     subject.toValue(null, null) is " + new org.hamcrest.StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.toValue[\\\"xxx\\\", null] should be \\\"xxx\\\"")
  @Order(3)
  public void _subjectToValueXxxNullShouldBeXxx() throws Exception {
    String _value = this.subject.toValue("xxx", null);
    boolean _should_be = Should.<String>should_be(_value, "xxx");
    Assert.assertTrue("\nExpected subject.toValue(\"xxx\", null) should be \"xxx\" but"
     + "\n     subject.toValue(\"xxx\", null) is " + new org.hamcrest.StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
}
