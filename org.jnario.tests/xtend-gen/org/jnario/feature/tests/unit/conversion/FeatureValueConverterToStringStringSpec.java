package org.jnario.feature.tests.unit.conversion;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toString[String]")
public class FeatureValueConverterToStringStringSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toString[\"text\"] => \"Prefix:text\\ \"")
  @Order(99)
  public void subjectToStringTextPrefixTextN() throws Exception {
    String _string = this.subject.toString("text");
    Should.operator_doubleArrow(_string, "Prefix:text\n");
  }
  
  @Test
  @Named("subject.toString[null] => null")
  @Order(99)
  public void subjectToStringNullNull() throws Exception {
    String _string = this.subject.toString(null);
    ObjectExtensions.<String>operator_doubleArrow(_string, null);
  }
}
