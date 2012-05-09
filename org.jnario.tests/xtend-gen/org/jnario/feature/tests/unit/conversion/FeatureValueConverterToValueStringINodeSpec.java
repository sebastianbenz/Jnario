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
@Named("toValue[String, INode]")
public class FeatureValueConverterToValueStringINodeSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toValue[\"Prefix: text\\ \", null] => \"text\"")
  @Order(99)
  public void subjectToValuePrefixTextNNullText() throws Exception {
    String _value = this.subject.toValue("Prefix: text\n", null);
    Should.operator_doubleArrow(_value, "text");
  }
  
  @Test
  @Named("subject.toValue[null, null] => null")
  @Order(99)
  public void subjectToValueNullNullNull() throws Exception {
    String _value = this.subject.toValue(null, null);
    ObjectExtensions.<String>operator_doubleArrow(_value, null);
  }
  
  @Test
  @Named("subject.toValue[\"xxx\", null] => \"xxx\"")
  @Order(99)
  public void subjectToValueXxxNullXxx() throws Exception {
    String _value = this.subject.toValue("xxx", null);
    Should.operator_doubleArrow(_value, "xxx");
  }
}
