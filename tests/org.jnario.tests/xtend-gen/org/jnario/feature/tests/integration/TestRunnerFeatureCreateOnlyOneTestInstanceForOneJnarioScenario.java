package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Create only one test instance for one jnario scenario")
@SuppressWarnings("all")
public class TestRunnerFeatureCreateOnlyOneTestInstanceForOneJnarioScenario {
  @Test
  @Order(0)
  @Named("When I have a scenario that uses one variable in different steps")
  public void whenIHaveAScenarioThatUsesOneVariableInDifferentSteps() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\tpackage bootstrap\r\n\t\t\tFeature: a feature\r\n\t\t\t\tScenario: a scenario with field\r\n\t\t\t\t\tpublic int x\r\n\t\t\t\t\tGiven a variable access\r\n\t\t\t\t\t\tx = 3\r\n\t\t\t\t\tWhen the variable is accessed\r\n\t\t\t\t\t\tx = x + 1 \r\n\t\t\t\t\tThen it is accessed\r\n\t\t\t\t\t\tx => 4\r\n\t\t");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Then the scenario should have no validation errors that the variable was not defined [PENDING]")
  public void thenTheScenarioShouldHaveNoValidationErrorsThatTheVariableWasNotDefined() {
    
  }
  
  @Test
  @Order(2)
  @Named("And it should execute successfully")
  public void andItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
