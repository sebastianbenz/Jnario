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
@Named("Scenario: Using fields from other steps")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureUsingFieldsFromOtherSteps extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with a field")
  public void whenIHaveAScenarioWithAField() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\nimport java.util.*\nFeature: Test\n\tScenario: TestScenario 1\n\t\tList<String> values = new ArrayList()\n\t\tGiven a list\n\t\t\tvalues += \"hello\"\n\t\t\n\tScenario: TestScenario 2\n\t\tGiven a list\n\t\tThen it should have contents\n\t\t\tvalues.size => 1\n");
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
