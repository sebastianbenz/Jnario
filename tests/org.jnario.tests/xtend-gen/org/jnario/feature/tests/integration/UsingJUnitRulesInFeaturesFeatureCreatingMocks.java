package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Creating Mocks")
@SuppressWarnings("all")
public class UsingJUnitRulesInFeaturesFeatureCreatingMocks {
  @Test
  @Order(0)
  @Named("When I have a feature which creates a mock")
  public void whenIHaveAFeatureWhichCreatesAMock() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\t\tpackage demo\n\t\t\t\timport java.util.Stack\n\t\t\t\tFeature:  Mocking\n\t\t\t\t\n\t\t\t\t\tScenario: Create a mock in a Feature\n\t\t\t\t\t\tvar Stack x\n\t\t\t\t\t\tGiven a field with a mock\n\t\t\t\t\t\t\tx = mock(Stack)\n\t\t\t\t\t\tThen the mock should be created\n\t\t\t\t\t\t\tx => typeof(Stack)\t\n\t\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
  
  CharSequence jnarioFile;
}
