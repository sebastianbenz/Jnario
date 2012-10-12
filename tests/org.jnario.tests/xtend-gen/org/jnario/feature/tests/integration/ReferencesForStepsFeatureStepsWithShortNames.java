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
@Named("Scenario: Steps with short names")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureStepsWithShortNames {
  @Test
  @Order(0)
  @Named("When I have a scenario with references and short step names [1 word]")
  public void whenIHaveAScenarioWithReferencesAndShortStepNames1Word() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\r\nimport java.util.*\r\nFeature: Test\r\n\tScenario: TestScenario1\r\n\t\tint x\r\n\t\tGiven step\r\n\t\t\tx = 3\r\n\tScenario: TestScenario2\r\n\t\tGiven step\r\n\t\tThen step\r\n\t\t\tx => 3");
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
