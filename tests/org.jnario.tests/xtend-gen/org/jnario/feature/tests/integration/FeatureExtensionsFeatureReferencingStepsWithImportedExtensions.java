package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with imported extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingStepsWithImportedExtensions {
  @Test
  @Order(0)
  @Named("Given the value \"13.9\"")
  public void givenTheValue139() {
      StepArguments _stepArguments = new StepArguments("13.9");
      final StepArguments args = _stepArguments;
      this.value = StringConversions.toDouble(new Function0<String>() {
        public String apply() {
          StepArguments _args = args;
          String _first = JnarioIterableExtensions.<String>first(_args);
          return _first;
        }
      }.apply());
  }
  
  @Test
  @Order(1)
  @Named("When I floor it")
  public void whenIFloorIt() {
    this.flooredValue = Math.floor(value);
  }
  
  @Test
  @Order(2)
  @Named("Then the value should be \"13.0\"")
  public void thenTheValueShouldBe130() {
      StepArguments _stepArguments = new StepArguments("13.0");
      final StepArguments args = _stepArguments;
      StepArguments _args = args;
      String _first = JnarioIterableExtensions.<String>first(_args);
      double _double = StringConversions.toDouble(_first);
      boolean _doubleArrow = Should.operator_doubleArrow(Double.valueOf(flooredValue), Double.valueOf(_double));
      Assert.assertTrue("\nExpected  but"
       + "\n      is " + new StringDescription().appendValue(Double.valueOf(_double)).toString() + "\n", _doubleArrow);
      
  }
  
  double value;
  
  double flooredValue;
}
