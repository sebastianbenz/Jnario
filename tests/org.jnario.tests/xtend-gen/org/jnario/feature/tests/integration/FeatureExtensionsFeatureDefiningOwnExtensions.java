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
@Named("Scenario: Defining own extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureDefiningOwnExtensions extends FeatureExtensionsFeature {
  double value;
  
  double flooredValue;
  
  @Test
  @Order(0)
  @Named("Given the value \\\"12.5\\\"")
  public void givenTheValue125() {
    StepArguments _stepArguments = new StepArguments("12.5");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    double _double = StringConversions.toDouble(_first);
    this.value = _double;
  }
  
  @Test
  @Order(1)
  @Named("When I floor it")
  public void whenIFloorIt() {
    double _floor = Math.floor(this.value);
    this.flooredValue = _floor;
  }
  
  @Test
  @Order(2)
  @Named("Then the value should be \\\"12.0\\\"")
  public void thenTheValueShouldBe120() {
    StepArguments _stepArguments = new StepArguments("12.0");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    double _double = StringConversions.toDouble(_first);
    boolean _doubleArrow = Should.operator_doubleArrow(Double.valueOf(this.flooredValue), Double.valueOf(_double));
    Assert.assertTrue("\nExpected flooredValue => args.first.toDouble but"
     + "\n     flooredValue is " + new StringDescription().appendValue(Double.valueOf(this.flooredValue)).toString()
     + "\n     args.first.toDouble is " + new StringDescription().appendValue(Double.valueOf(_double)).toString()
     + "\n     args.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     args is " + new StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
}
