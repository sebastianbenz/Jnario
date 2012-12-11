package org.jnario.suite.unit;

import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.unit.SuiteValueConverterSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toValue")
@RunWith(ExampleGroupRunner.class)
public class SuiteValueConverterToValueSpec extends SuiteValueConverterSpec {
  @Test
  @Named("removes escape character for dashes")
  @Order(3)
  public void _removesEscapeCharacterForDashes() throws Exception {
    String _value = this.subject.toValue("##suite \\- with dash", null);
    boolean _doubleArrow = Should.operator_doubleArrow(_value, "##suite - with dash");
    Assert.assertTrue("\nExpected subject.toValue(\"##suite \\\\- with dash\", null) => \"##suite - with dash\" but"
     + "\n     subject.toValue(\"##suite \\\\- with dash\", null) is " + new StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("removes escape character for  hashs")
  @Order(4)
  public void _removesEscapeCharacterForHashs() throws Exception {
    String _value = this.subject.toValue("##suite \\# with hash", null);
    boolean _doubleArrow = Should.operator_doubleArrow(_value, "##suite # with hash");
    Assert.assertTrue("\nExpected subject.toValue(\"##suite \\\\# with hash\", null) => \"##suite # with hash\" but"
     + "\n     subject.toValue(\"##suite \\\\# with hash\", null) is " + new StringDescription().appendValue(_value).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
}
