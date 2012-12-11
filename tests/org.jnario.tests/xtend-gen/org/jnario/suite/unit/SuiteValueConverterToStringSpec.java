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
@Named("toString")
@RunWith(ExampleGroupRunner.class)
public class SuiteValueConverterToStringSpec extends SuiteValueConverterSpec {
  @Test
  @Named("escapes dashes")
  @Order(1)
  public void _escapesDashes() throws Exception {
    String _string = this.subject.toString("##suite - with dash");
    boolean _doubleArrow = Should.operator_doubleArrow(_string, "##suite \\- with dash");
    Assert.assertTrue("\nExpected subject.toString(\"##suite - with dash\") => \"##suite \\\\- with dash\" but"
     + "\n     subject.toString(\"##suite - with dash\") is " + new StringDescription().appendValue(_string).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("escapes hashs")
  @Order(2)
  public void _escapesHashs() throws Exception {
    String _string = this.subject.toString("##suite # with hash");
    boolean _doubleArrow = Should.operator_doubleArrow(_string, "##suite \\# with hash");
    Assert.assertTrue("\nExpected subject.toString(\"##suite # with hash\") => \"##suite \\\\# with hash\" but"
     + "\n     subject.toString(\"##suite # with hash\") is " + new StringDescription().appendValue(_string).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
}
