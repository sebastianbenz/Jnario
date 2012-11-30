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
@Named("Scenario: Access a variable that was assigned a value of a variable defined in a different step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableThatWasAssignedAValueOfAVariableDefinedInADifferentStep extends AccessOfVariablesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a complex usage of variables")
  public void whenIHaveAComplexUsageOfVariables() {
    StepArguments _stepArguments = new StepArguments("package bootstrap3\nFeature: Variable test\n\tScenario: Some scenario\n\t\tint x\n\t\tint y\n\t\tGiven a step with a variable\n\t\t\tx = 3\n\t\tWhen I assign it a different value\n\t\t\ty = x\n\t\tThen y should be 3\n\t\t\ty => 3\n");
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
