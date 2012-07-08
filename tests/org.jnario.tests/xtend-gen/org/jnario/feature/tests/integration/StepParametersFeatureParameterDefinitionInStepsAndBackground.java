package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
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
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap \r\n\t\t\t\tFeature: Test feature\r\n\t\t\t\t\tBackground:\r\n\t\t\t\t\t\tString x\r\n\t\t\t\t\t\tGiven some values \"3\", \"4\"\r\n\t\t\t\t\t\t\tx = args.get(1)\r\n\t\t\t\t\tScenario: using fields in step definitions\r\n\t\t\t\t\t\tThen those values should be accessible\r\n\t\t\t\t\t\t\tx => \"4\"\r\n\t\t\t\t\t\t\t\r\n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = args.first();
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
