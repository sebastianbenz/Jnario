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
@Named("toString[String]")
public class SuiteValueConverterToStringStringSpec extends SuiteValueConverterSpec {
  @Test
  @Named("escapes dashes")
  @Order(99)
  public void escapesDashes() throws Exception {
    String _string = this.subject.toString("##suite - with dash");
    boolean _doubleArrow = Should.operator_doubleArrow(_string, "##suite \\- with dash");
    Assert.assertTrue("\nExpected subject.toString(\"##suite - with dash\") => \"##suite \\\\- with dash\" but"
     + "\n     subject.toString(\"##suite - with dash\") is " + "\"" + _string + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("escapes hashs")
  @Order(99)
  public void escapesHashs() throws Exception {
    String _string = this.subject.toString("##suite # with hash");
    boolean _doubleArrow = Should.operator_doubleArrow(_string, "##suite \\# with hash");
    Assert.assertTrue("\nExpected subject.toString(\"##suite # with hash\") => \"##suite \\\\# with hash\" but"
     + "\n     subject.toString(\"##suite # with hash\") is " + "\"" + _string + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
}
