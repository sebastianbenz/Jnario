package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Parameters are defined in quotes")
@SuppressWarnings("all")
public class StepParametersFeatureParametersAreDefinedInQuotes extends StepParametersFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a feature with parameters")
  public void whenIHaveAFeatureWithParameters() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\nFeature: Test feature\n\tScenario: using fields in step definitions\n\t\tString x\n\t\tGiven some values \"3\", \"4\"\n\t\t\tx = args.get(0)\n\t\tThen it should be possible to get the value\n\t\t\tx => \"3\"\n");
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
