package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
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
      StepArguments _stepArguments = new StepArguments("\r\n\t \t\t\tpackage bootstrap\r\n\t \t\t\timport java.util.*\r\n\t \t\t\tFeature: Test\r\n\t \t\t\t\tScenario: TestScenario1\r\n\t \t\t\t\t\tint x\r\n\t \t\t\t\t\tGiven step\r\n\t \t\t\t\t\t\tx = 3\r\n\t \t\t\t\tScenario: TestScenario2\r\n\t \t\t\t\t\tGiven step\r\n\t \t\t\t\t\tThen step\r\n\t \t\t\t\t\t\tx => 3\r\n\t \t\t");
      final StepArguments args = _stepArguments;
      String _first = args.first();
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
