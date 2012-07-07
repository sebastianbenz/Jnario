package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access of parameters with first, second, ...")
@SuppressWarnings("all")
public class StepParametersFeatureAccessOfParametersWithFirstSecond {
  @Test
  @Order(0)
  @Named("When I access those parameters")
  public void whenIAccessThoseParameters() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\t\tpackage bootstrap\n\t\t\t\tFeature: Test feature\n\t\t\t\t\tScenario: using fields in step definitions\n\t\t\t\t\t\tString x\n\t\t\t\t\t\tGiven some values \"3\", \"4\"\n\t\t\t\t\t\t\tx = args.first\n\t\t\t\t\t\tThen it should be possible to get the value\n\t\t\t\t\t\t\tx => \"3\"\n\t\t\t");
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
