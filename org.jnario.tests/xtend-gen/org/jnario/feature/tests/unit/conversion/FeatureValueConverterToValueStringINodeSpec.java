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
@Named("toValue[String, INode]")
public class FeatureValueConverterToValueStringINodeSpec extends FeatureValueConverterSpec {
  @Test
  @Named("subject.toValue[\\\"Prefix: text\\\\n\\\", null] => \\\"text\\\"")
  @Order(99)
  public void subjectToValuePrefixTextNNullText() throws Exception {
    String _value = this.subject.toValue("Prefix: text\n", null);
    boolean _doubleArrow = Should.operator_doubleArrow(_value, "text");Assert
    .assertTrue("\nExpected subject.toValue(\"Prefix: text\\n\", null) => \"text\" but"
     + "\n     subject.toValue(\"Prefix: text\\n\", null) is " + "\"" + _value + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.toValue[null, null] => null")
  @Order(99)
  public void subjectToValueNullNullNull() throws Exception {
    String _value = this.subject.toValue(null, null);
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_value, null);Assert
    .assertTrue("\nExpected subject.toValue(null, null) => null but"
     + "\n     subject.toValue(null, null) is " + "\"" + _value + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.toValue[\\\"xxx\\\", null] => \\\"xxx\\\"")
  @Order(99)
  public void subjectToValueXxxNullXxx() throws Exception {
    String _value = this.subject.toValue("xxx", null);
    boolean _doubleArrow = Should.operator_doubleArrow(_value, "xxx");Assert
    .assertTrue("\nExpected subject.toValue(\"xxx\", null) => \"xxx\" but"
     + "\n     subject.toValue(\"xxx\", null) is " + "\"" + _value + "\""
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
}
