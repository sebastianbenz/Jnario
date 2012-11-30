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
@Named("Scenario: Parameter definition in and steps")
@SuppressWarnings("all")
public class StepParametersFeatureParameterDefinitionInAndSteps extends StepParametersFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I define parameters in a an and step")
  public void whenIDefineParametersInAAnAndStep() {
    StepArguments _stepArguments = new StepArguments("Feature: Test feature\nScenario: \"And\" args in step definition\n\tvar strings = <String>list()\n\tGiven a string \"hello\"\n\t\tstrings += args.first\n\t\tAnd another string \"world\"\n\t\t\tstrings += args.first\n\tThen the string is\n\t\tstrings => list(\"hello\", \"world\")\n\t\t\nScenario: \"And\" args in step reference\n\tvar strings = <String>list()\n\tGiven a string \"hello\"\n\t\tstrings += args.first\n\t\tAnd a string \"world\"\n\tThen the string is\n\t\tstrings => list(\"hello\", \"world\")\n");
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
