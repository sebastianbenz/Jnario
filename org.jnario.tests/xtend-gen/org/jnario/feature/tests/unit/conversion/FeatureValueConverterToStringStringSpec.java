package org.jnario.feature.tests.unit.conversion;

import org.jnario.feature.tests.unit.conversion.FeatureValueConverterSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toString[String]")
public class FeatureValueConverterToStringStringSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toString[\\\"text\\\"] => \\\"Prefix:text\\\\n\\\"")
  @Order(99)
  public void subjectToStringTextPrefixTextN() throws Exception {
    String _string = this.subject.toString("text");
    boolean _doubleArrow = Should.operator_doubleArrow(_string, "Prefix:text\n");Assert
    .assertTrue("\nExpected subject.toString(\"text\") => \"Prefix:text\\n\" but"
     + "\n     subject.toString(\"text\") is " + "\"" + _string + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.toString[null] => null")
  @Order(99)
  public void subjectToStringNullNull() throws Exception {
    String _string = this.subject.toString(null);
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_string, null);Assert
    .assertTrue("\nExpected subject.toString(null) => null but"
     + "\n     subject.toString(null) is " + "\"" + _string + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
}
