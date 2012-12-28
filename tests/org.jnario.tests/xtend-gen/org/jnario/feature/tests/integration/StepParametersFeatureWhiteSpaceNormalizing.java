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
    this.jnarioFile = "\n\t\tFeature: Multiline String\n\t\t\tScenario: Example\n\t\t\t\tString arg \n\t\t\t\tGiven a step with a multiline argument:\n\t\t\t\t\t\'\'\'\n\t\t\t\t\t hello\n\t\t\t\t\t world\n\t\t\t\t\t\'\'\'\n\t\t\t\t\targ = args.first\n\t\t\t\tThen the whitespace should be normalized\n\t\t\t\t\tassertEquals(\'hello\nworld\n\', arg)\n\t\t";
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
