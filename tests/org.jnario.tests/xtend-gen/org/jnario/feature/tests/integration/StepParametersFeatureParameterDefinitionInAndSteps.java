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
@Named("Scenario: Parameter definition in and steps")
@SuppressWarnings("all")
public class StepParametersFeatureParameterDefinitionInAndSteps {
  @Test
  @Order(0)
  @Named("When I define parameters in a an and step")
  public void whenIDefineParametersInAAnAndStep() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\t\tFeature: Test feature\n\t\t\t\tScenario: \"And\" args in step definition\n\t\t\t\t\tvar strings = <String>list()\n\t\t\t\t\tGiven a string \"hello\"\n\t\t\t\t\t\tstrings += args.first\n\t\t\t\t\t\tAnd another string \"world\"\n\t\t\t\t\t\t\tstrings += args.first\n\t\t\t\t\tThen the string is\n\t\t\t\t\t\tstrings => list(\"hello\", \"world\")\n\t\t\t\t\t\t\n\t\t\t\tScenario: \"And\" args in step reference\n\t\t\t\t\tvar strings = <String>list()\n\t\t\t\t\tGiven a string \"hello\"\n\t\t\t\t\t\tstrings += args.first\n\t\t\t\t\t\tAnd a string \"world\"\n\t\t\t\t\tThen the string is\n\t\t\t\t\t\tstrings => list(\"hello\", \"world\")\n\t\t\t");
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
