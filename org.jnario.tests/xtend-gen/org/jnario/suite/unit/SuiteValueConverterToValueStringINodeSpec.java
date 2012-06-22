package org.jnario.suite.unit;

import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.unit.SuiteValueConverterSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toValue[String, INode]")
public class SuiteValueConverterToValueStringINodeSpec extends SuiteValueConverterSpec {
  @Test
  @Named("removes escape character for dashes")
  @Order(99)
  public void removesEscapeCharacterForDashes() throws Exception {
    String _value = this.subject.toValue("##suite \\- with dash", null);
    boolean _doubleArrow = Should.operator_doubleArrow(_value, "##suite - with dash");
    Assert.assertTrue("\nExpected subject.toValue(\"##suite \\\\- with dash\", null) => \"##suite - with dash\" but"
     + "\n     subject.toValue(\"##suite \\\\- with dash\", null) is " + "\"" + _value + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("removes escape character for  hashs")
  @Order(99)
  public void removesEscapeCharacterForHashs() throws Exception {
    String _value = this.subject.toValue("##suite \\# with hash", null);
    boolean _doubleArrow = Should.operator_doubleArrow(_value, "##suite # with hash");
    Assert.assertTrue("\nExpected subject.toValue(\"##suite \\\\# with hash\", null) => \"##suite # with hash\" but"
     + "\n     subject.toValue(\"##suite \\\\# with hash\", null) is " + "\"" + _value + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
}
