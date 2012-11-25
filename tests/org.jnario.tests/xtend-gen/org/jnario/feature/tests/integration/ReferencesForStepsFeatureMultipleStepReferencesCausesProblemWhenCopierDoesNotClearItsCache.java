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
@Named("Scenario: Multiple Step References [causes problem when copier does not clear its cache]")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureMultipleStepReferencesCausesProblemWhenCopierDoesNotClearItsCache extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a feature with multiple scenarios")
  public void whenIHaveAFeatureWithMultipleScenarios() {
    StepArguments _stepArguments = new StepArguments("Feature: Field Inference\n \n\tScenario: Scenario 1\n\t\tCharSequence jnarioFile2\n \t\tThen it should execute successfully\n\t\t\tprintln(jnarioFile2)\n                  \n\tScenario: Scenario 2\n\t\tCharSequence feature1\n\t\tThen both should execute successfully \n\t\t\tprintln(feature1)\n                          \n\tScenario: Scenario 3\n\t\tWhen I have a feature with a background and two scenarios \"Feature: Feature 1\"         \n\t\t\tjnarioFile2 = args.first\n\t\tThen it should execute successfully\n\t\t     \n\tScenario: Scenario 4\n\t\tWhen I have a feature \"Feature: Feature 1\"\n\t\t\tfeature1 = args.first\n\t\tThen both should execute successfully \n\t\t");
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
