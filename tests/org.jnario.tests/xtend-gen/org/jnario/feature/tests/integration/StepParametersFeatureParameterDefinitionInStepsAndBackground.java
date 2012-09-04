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
@Named("Scenario: Parameter definition in steps and Background")
@SuppressWarnings("all")
public class StepParametersFeatureParameterDefinitionInStepsAndBackground {
  @Test
  @Order(0)
  @Named("When I define parameters in a background")
  public void whenIDefineParametersInABackground() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\t\tpackage bootstrap \n\t\t\t\tFeature: Test feature\n\t\t\t\t\tBackground:\n\t\t\t\t\t\tString x\n\t\t\t\t\t\tGiven some values \"3\", \"4\"\n\t\t\t\t\t\t\tx = args.get(1)\n\t\t\t\t\tScenario: using fields in step definitions\n\t\t\t\t\t\tThen those values should be accessible\n\t\t\t\t\t\t\tx => \"4\"\n\t\t\t\t\t\t\t\n\t\t\t");
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
