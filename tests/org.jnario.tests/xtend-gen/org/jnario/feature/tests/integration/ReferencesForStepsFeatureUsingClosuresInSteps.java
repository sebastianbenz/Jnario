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
@Named("Scenario: Using closures in steps")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureUsingClosuresInSteps {
  @Test
  @Order(0)
  @Named("When I have a scenario which uses closures")
  public void whenIHaveAScenarioWhichUsesClosures() {
    StepArguments _stepArguments = new StepArguments("Feature: Using Closures\r\n\r\n\t\t\tScenario: Steps which define closures\r\n\t\t\t\tvar colors = list(\"green\", \"blue\")\r\n\t\t\t\tWhen we convert all strings to uppercase\r\n\t\t\t\t\tcolors = colors.map[toUpperCase]\r\n\t\t\t\tThen they are uppercase\r\n\t\t\t\t\tcolors => list(\"GREEN\", \"BLUE\")\r\n\t\t\r\n\t\t\tScenario: Steps which reference steps with closures\r\n\t\t\t\tvar colors = list(\"red\", \"blue\")\r\n\t\t\t\tWhen we convert all strings to uppercase\r\n\t\t\t\tThen they are uppercase\r\n\t\t\t\t\tcolors => list(\"RED\", \"BLUE\")");
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
