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
  @Named("subject.toString[\"text\"] => \"Prefix:text\\; \"")
  @Order(99)
  public void subjectToStringTextPrefixTextN() throws Exception {
    String _string = this.subject.toString("text");
    boolean _should_be = Should.should_be(_string, "Prefix:text\n");Assert
    .assertTrue("\nExpected subject.toString(\"text\") => \"Prefix:text\\n\" but:"
     + "\n     subject.toString(\"text\") is " + "\"" + _string + "\""
     + "\n     subject is " + this.subject + "\n", _should_be);
    
  }
  
  @Test
  @Named("subject.toString[null] => null")
  @Order(99)
  public void subjectToStringNullNull() throws Exception {
    String _string = this.subject.toString(null);
    boolean _should_be = Should.<String>should_be(_string, null);Assert
    .assertTrue("\nExpected subject.toString(null) => null but:"
     + "\n     subject.toString(null) is " + "\"" + _string + "\""
     + "\n     subject is " + this.subject + "\n", _should_be);
    
  }
}
