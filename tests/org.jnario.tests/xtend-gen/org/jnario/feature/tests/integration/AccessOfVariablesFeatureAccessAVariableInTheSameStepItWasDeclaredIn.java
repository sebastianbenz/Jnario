package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable in the same step it was declared in")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableInTheSameStepItWasDeclaredIn {
  @Test
  @Order(0)
  @Named("When I have scenario with a reference to a variable")
  public void whenIHaveScenarioWithAReferenceToAVariable() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\t\tpackage bootstrap1\n\t\t\t\tFeature: Variable test\n\t\t\t\t\tScenario: Some scenario\n\t\t\t\t\t\tGiven a step with a variable\n\t\t\t\t\t\t\tvar x = 3\n\t\t\t\t\t\t\tx = 5\n\t\t\t");
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
