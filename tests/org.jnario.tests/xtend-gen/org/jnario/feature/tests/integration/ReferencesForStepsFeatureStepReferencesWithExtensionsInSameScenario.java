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
@Named("Scenario: Step references with extensions in same scenario")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureStepReferencesWithExtensionsInSameScenario extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("Given a feature")
  public void givenAFeature() {
    StepArguments _stepArguments = new StepArguments("import org.jnario.feature.tests.integration.ExampleExtension\nFeature: Step references with extensions in same step\n\t\t\tScenario: Greetings\n\t\t\t\textension static ExampleExtension = new ExampleExtension\n\t\t\tWhen greeting \"Sebastian\" is \"Hello Sebastian\"\n\t\t\t\targs.first.greet => args.second\n\t\t\tBut greeting \"World\" is \"Hello World\"\n");
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
