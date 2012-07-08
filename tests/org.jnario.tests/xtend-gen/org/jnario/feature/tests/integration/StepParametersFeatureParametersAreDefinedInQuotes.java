package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Parameters are defined in quotes")
@SuppressWarnings("all")
public class StepParametersFeatureParametersAreDefinedInQuotes {
  @Test
  @Order(0)
  @Named("When I have a feature with parameters")
  public void whenIHaveAFeatureWithParameters() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\tFeature: Test feature\r\n\t\t\t\t\tScenario: using fields in step definitions\r\n\t\t\t\t\t\tString x\r\n\t\t\t\t\t\tGiven some values \"3\", \"4\"\r\n\t\t\t\t\t\t\tx = args.get(0)\r\n\t\t\t\t\t\tThen it should be possible to get the value\r\n\t\t\t\t\t\t\tx => \"3\"\r\n\t\t\t");
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
