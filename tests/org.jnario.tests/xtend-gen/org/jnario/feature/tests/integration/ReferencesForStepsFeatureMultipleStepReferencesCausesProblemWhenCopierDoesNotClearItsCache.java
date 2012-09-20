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
@Named("Scenario: Multiple Step References [causes problem when copier does not clear its cache]")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureMultipleStepReferencesCausesProblemWhenCopierDoesNotClearItsCache {
  @Test
  @Order(0)
  @Named("When I have a feature with multiple scenarios")
  public void whenIHaveAFeatureWithMultipleScenarios() {
    StepArguments _stepArguments = new StepArguments("\r\n\t\t\tFeature: Field Inference\r\n\t\t\t \r\n\t\t\t\tScenario: Scenario 1\r\n\t\t\t\t\tCharSequence jnarioFile2\r\n\t\t\t \t\tThen it should execute successfully\r\n\t\t\t\t\t\tprintln(jnarioFile2)\r\n\t\t\t                  \r\n\t\t\t\tScenario: Scenario 2\r\n\t\t\t\t\tCharSequence feature1\r\n\t\t\t\t\tThen both should execute successfully \r\n\t\t\t\t\t\tprintln(feature1)\r\n\t\t\t                          \r\n\t\t\t\tScenario: Scenario 3\r\n\t\t\t\t\tWhen I have a feature with a background and two scenarios \"Feature: Feature 1\"         \r\n\t\t\t\t\t\tjnarioFile2 = args.first\r\n\t\t\t\t\tThen it should execute successfully\r\n\t\t\t\t\t     \r\n\t\t\t\tScenario: Scenario 4\r\n\t\t\t\t\tWhen I have a feature \"Feature: Feature 1\"\r\n\t\t\t\t\t\tfeature1 = args.first\r\n\t\t\t\t\tThen both should execute successfully \r\n\t\t\t\t\t");
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
