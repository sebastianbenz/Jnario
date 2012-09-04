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
@Named("Scenario: Steps")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureSteps {
  @Test
  @Order(0)
  @Named("When I have a scenario with a variable that is initialized")
  public void whenIHaveAScenarioWithAVariableThatIsInitialized() {
    StepArguments _stepArguments = new StepArguments("\r\n\t \timport java.util.concurrent.TimeUnit\r\n\r\n\t\tFeature: Test\r\n\t\t\r\n\t\tScenario: Scenario\r\n\t\tWhen test\r\n\t\tval test = TimeUnit::MINUTES\r\n\t\t\r\n\t\tScenario: Scenario 2\r\n\t\tWhen test\r\n\t \t");
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
