package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.AccessOfVariablesFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable declared in background step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableDeclaredInBackgroundStep extends AccessOfVariablesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I define a variable in the background")
  public void whenIDefineAVariableInTheBackground() {
    StepArguments _stepArguments = new StepArguments("package bootstrap4\nFeature: Variable test\n\tBackground:\n\t\tint x\n\t\tGiven some variable\n\t\t\tx = 3\n\tScenario: Some scenario\n\t\t\tThen x should be 3\n\t\t\t\tx => 3\n");
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
