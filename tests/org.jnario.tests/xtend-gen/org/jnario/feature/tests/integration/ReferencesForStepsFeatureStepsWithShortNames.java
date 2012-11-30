package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Steps with short names")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureStepsWithShortNames extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with references and short step names [1 word]")
  public void whenIHaveAScenarioWithReferencesAndShortStepNames1Word() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\nimport java.util.*\nFeature: Test\n\tScenario: TestScenario1\n\t\tint x\n\t\tGiven step\n\t\t\tx = 3\n\tScenario: TestScenario2\n\t\tGiven step\n\t\tThen step\n\t\t\tx => 3\n");
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
}
