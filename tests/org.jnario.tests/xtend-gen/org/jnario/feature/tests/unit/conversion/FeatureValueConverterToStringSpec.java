package org.jnario.feature.tests.unit.conversion;

import org.eclipse.xtext.util.Strings;
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
@Named("toString")
@RunWith(ExampleGroupRunner.class)
public class FeatureValueConverterToStringSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toString[\\\"text\\\"] should be \\\"Prefix:text\\\" + Strings::newLine")
  @Order(4)
  public void _subjectToStringTextShouldBePrefixTextStringsNewLine() throws Exception {
    String _string = this.subject.toString("text");
    String _newLine = Strings.newLine();
    String _plus = ("Prefix:text" + _newLine);
    boolean _should_be = Should.should_be(_string, _plus);
    Assert.assertTrue("\nExpected subject.toString(\"text\") should be \"Prefix:text\" + Strings::newLine but"
     + "\n     subject.toString(\"text\") is " + new StringDescription().appendValue(_string).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     \"Prefix:text\" + Strings::newLine is " + new StringDescription().appendValue(_plus).toString()
     + "\n     Strings::newLine is " + new StringDescription().appendValue(_newLine).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("subject.toString[null] should be null")
  @Order(5)
  public void _subjectToStringNullShouldBeNull() throws Exception {
    String _string = this.subject.toString(null);
    Matcher<String> _nullValue = CoreMatchers.<String>nullValue();
    boolean _should_be = Should.<String>should_be(_string, _nullValue);
    Assert.assertTrue("\nExpected subject.toString(null) should be null but"
     + "\n     subject.toString(null) is " + new StringDescription().appendValue(_string).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
}
