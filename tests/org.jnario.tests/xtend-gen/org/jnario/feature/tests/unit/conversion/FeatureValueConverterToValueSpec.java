package org.jnario.feature.tests.unit.conversion;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toValue")
@RunWith(ExampleGroupRunner.class)
public class FeatureValueConverterToValueSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toValue[\\\"Prefix: text\\\\n\\\", null] should be \\\"text\\\"")
  @Order(1)
  public void _subjectToValuePrefixTextNNullShouldBeText() throws Exception {
    String _value = this.subject.toValue("Prefix: text\n", null);
    boolean _should_be = Should.should_be(_value, "text");
    Assert.assertTrue("\nExpected subject.toValue(\"Prefix: text\\n\", null) should be \"text\" but"
     + "\n     subject.toValue(\"Prefix: text\\n\", null) is " + new StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("subject.toValue[null, null] should be null")
  @Order(2)
  public void _subjectToValueNullNullShouldBeNull() throws Exception {
    String _value = this.subject.toValue(null, null);
    Matcher<String> _nullValue = CoreMatchers.<String>nullValue();
    boolean _should_be = Should.<String>should_be(_value, _nullValue);
    Assert.assertTrue("\nExpected subject.toValue(null, null) should be null but"
     + "\n     subject.toValue(null, null) is " + new StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("subject.toValue[\\\"xxx\\\", null] should be \\\"xxx\\\"")
  @Order(3)
  public void _subjectToValueXxxNullShouldBeXxx() throws Exception {
    String _value = this.subject.toValue("xxx", null);
    boolean _should_be = Should.should_be(_value, "xxx");
    Assert.assertTrue("\nExpected subject.toValue(\"xxx\", null) should be \"xxx\" but"
     + "\n     subject.toValue(\"xxx\", null) is " + new StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
}
