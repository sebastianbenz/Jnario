package org.jnario.feature.tests.integration;

import org.hamcrest.StringDescription;
import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using jnario predefined extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureUsingJnarioPredefinedExtensions extends FeatureExtensionsFeature {
  String numberString;
  
  int number;
  
  @Test
  @Order(0)
  @Named("Given the number \\\"5\\\" as string")
  public void givenTheNumber5AsString() {
    StepArguments _stepArguments = new StepArguments("5");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.numberString = _first;
  }
  
  @Test
  @Order(1)
  @Named("When it is converted to int")
  public void whenItIsConvertedToInt() {
    int _int = StringConversions.toInt(this.numberString);
    this.number = _int;
  }
  
  @Test
  @Order(2)
  @Named("Then it should be \\\"5\\\"")
  public void thenItShouldBe5() {
    StepArguments _stepArguments = new StepArguments("5");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(this.number), Integer.valueOf(_int));
    Assert.assertTrue("\nExpected number => args.first.toInt but"
     + "\n     number is " + new StringDescription().appendValue(Integer.valueOf(this.number)).toString()
     + "\n     args.first.toInt is " + new StringDescription().appendValue(Integer.valueOf(_int)).toString()
     + "\n     args.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     args is " + new StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
}
