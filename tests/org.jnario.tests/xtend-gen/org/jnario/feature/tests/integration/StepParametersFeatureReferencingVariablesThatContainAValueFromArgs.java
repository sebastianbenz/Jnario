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
@Named("Scenario: Referencing variables that contain a value from args")
@SuppressWarnings("all")
public class StepParametersFeatureReferencingVariablesThatContainAValueFromArgs extends StepParametersFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario that references a step with arguments")
  public void whenIHaveAScenarioThatReferencesAStepWithArguments() {
    StepArguments _stepArguments = new StepArguments("package bootstrap \nFeature: Test feature\n\tScenario: using fields in step definitions\n\t\tString x\n\t\tString y \n\t\tGiven the value \"hello\"\n\t\t\tx = args.first\n\t\tWhen I add \" world\"\n\t\t\ty = x + args.first\n\t\tThen it should be \"hello world\"\n\t\t\ty should be args.first\n\t\t\t\n");
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
