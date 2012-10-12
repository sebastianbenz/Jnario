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
@Named("Scenario: Using fields from background steps")
@SuppressWarnings("all")
public class BackgroundsFeatureUsingFieldsFromBackgroundSteps {
  @Test
  @Order(0)
  @Named("When I have a scenario with a field")
  public void whenIHaveAScenarioWithAField() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\r\nimport java.util.*\r\nFeature: Test\r\n\tBackground: \r\n\t\tList<String> values = new ArrayList()\r\n\t\tGiven a list\r\n\t\t\tvalues += \"hello\"\r\n\t\t\r\n\tScenario: TestScenario 2\r\n\t\tThen it should have contents\r\n\t\t\tvalues.size => 1");
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
