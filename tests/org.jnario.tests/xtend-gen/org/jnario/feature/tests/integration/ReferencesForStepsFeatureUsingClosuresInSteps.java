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
@Named("Scenario: Using closures in steps")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureUsingClosuresInSteps extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario which uses closures")
  public void whenIHaveAScenarioWhichUsesClosures() {
    StepArguments _stepArguments = new StepArguments("Feature: Using Closures\n\n\t\t\tScenario: Steps which define closures\n\t\t\t\tvar colors = list(\"green\", \"blue\")\n\t\t\t\tWhen we convert all strings to uppercase\n\t\t\t\t\tcolors = colors.map[toUpperCase]\n\t\t\t\tThen they are uppercase\n\t\t\t\t\tcolors => list(\"GREEN\", \"BLUE\")\n\t\t\n\t\t\tScenario: Steps which reference steps with closures\n\t\t\t\tvar colors = list(\"red\", \"blue\")\n\t\t\t\tWhen we convert all strings to uppercase\n\t\t\t\tThen they are uppercase\n\t\t\t\t\tcolors => list(\"RED\", \"BLUE\")\n");
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
