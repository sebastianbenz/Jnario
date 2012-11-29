package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Field initializers in Backgrounds")
@SuppressWarnings("all")
public class StepParametersFeatureFieldInitializersInBackgrounds extends StepParametersFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with a background and a field initializer")
  public void whenIHaveAScenarioWithABackgroundAndAFieldInitializer() {
    StepArguments _stepArguments = new StepArguments("Feature: Field initializers in Backgrounds\nBackground:\n  String greeting = \"Hello \"\n  Given a name \"Sebastian\"\n    greeting = greeting + args.first\nScenario: Greeting someone\n  Then the greeting should be \"Hello Sebastian\" \n\tgreeting => args.first\n");
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
