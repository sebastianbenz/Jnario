package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using fields from background steps")
@SuppressWarnings("all")
public class BackgroundsFeatureUsingFieldsFromBackgroundSteps {
  @Test
  @Order(0)
  @Named("When I have a scenario with a field")
  public void whenIHaveAScenarioWithAField() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\timport java.util.*\r\n\t\t\t\tFeature: Test\r\n\t\t\t\t\tBackground: \r\n\t\t\t\t\t\tList<String> values = new ArrayList()\r\n\t\t\t\t\t\tGiven a list\r\n\t\t\t\t\t\t\tvalues += \"hello\"\r\n\t\t\t\t\t\t\r\n\t\t\t\t\tScenario: TestScenario 2\r\n\t\t\t\t\t\tThen it should have contents\r\n\t\t\t\t\t\t\tvalues.size => 1\r\n\t\t\t");
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
