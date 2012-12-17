package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: White space normalizing")
@SuppressWarnings("all")
public class StepParametersFeatureWhiteSpaceNormalizing extends StepParametersFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with a multiline string")
  public void whenIHaveAScenarioWithAMultilineString() {
    this.jnarioFile = "\r\n\t\tFeature: Multiline String\r\n\t\t\tScenario: Example\r\n\t\t\t\tString arg \r\n\t\t\t\tGiven a step with a multiline argument:\r\n\t\t\t\t\t\'\'\'\r\n\t\t\t\t\t hello\r\n\t\t\t\t\t world\r\n\t\t\t\t\t\'\'\'\r\n\t\t\t\t\targ = args.first\r\n\t\t\t\tThen the whitespace should be normalized\r\n\t\t\t\t\tassertEquals(\'hello\nworld\n\', arg)\r\n\t\t";
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
