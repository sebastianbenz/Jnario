package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.FieldInferenceFeature;
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
@Named("Scenario: Inferring Fields from Background")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class FieldInferenceFeatureInferringFieldsFromBackground extends FieldInferenceFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a feature with a background and two scenarios")
  public void whenIHaveAFeatureWithABackgroundAndTwoScenarios() {
    StepArguments _stepArguments = new StepArguments("Feature: My Feature\n\tBackground: with field\n\t\tString myString\n\t\t\n\tScenario: My Scenario\n\t\tGiven a string \"value\"\n\t\t\tmyString = args.first\n\tScenario: My Scenario 2\n\t\tGiven a string \"test\"\n\t\tThen my string is \"test\"\n\t\t\tmyString => args.first  \n");
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
