package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using multiline Strings")
@SuppressWarnings("all")
public class StepParametersFeatureUsingMultilineStrings extends StepParametersFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with multiline strings")
  public void whenIHaveAScenarioWithMultilineStrings() {
    this.jnarioFile = "\n\t\t\t\tpackage bootstrap \n\t\t\t\tFeature: Test feature\n\t\t\t\t\tScenario: using multiline strings in step definitions\n\t\t\t\t\t\tString x\n\t\t\t\t\t\tGiven the multine string: \n\t\t\t\t\t\t\t\'\'\'hello\'\'\'\n\t\t\t\t\t\t\tx = args.first\n\t\t\t\t\t\tThen it should be \"hello\"\n\t\t\t\t\t\t\tx should be args.first\n\t\t\t";
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
