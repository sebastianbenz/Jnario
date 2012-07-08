package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable declared in background step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableDeclaredInBackgroundStep {
  @Test
  @Order(0)
  @Named("When I define a variable in the background")
  public void whenIDefineAVariableInTheBackground() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap4\r\n\t\t\t\tFeature: Variable test\r\n\t\t\t\t\tBackground:\r\n\t\t\t\t\t\tint x\r\n\t\t\t\t\t\tGiven some variable\r\n\t\t\t\t\t\t\tx = 3\r\n\t\t\t\t\tScenario: Some scenario\r\n\t\t\t\t\t\t\tThen x should be 3\r\n\t\t\t\t\t\t\t\tx => 3\r\n\t\t\t");
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
