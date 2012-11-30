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
@Named("Scenario: Access a variable in the same step it was declared in")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableInTheSameStepItWasDeclaredIn extends AccessOfVariablesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have scenario with a reference to a variable")
  public void whenIHaveScenarioWithAReferenceToAVariable() {
    StepArguments _stepArguments = new StepArguments("package bootstrap1\nFeature: Variable test\n\tScenario: Some scenario\n\t\tGiven a step with a variable\n\t\t\tvar x = 3\n\t\t\tx = 5\n");
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
