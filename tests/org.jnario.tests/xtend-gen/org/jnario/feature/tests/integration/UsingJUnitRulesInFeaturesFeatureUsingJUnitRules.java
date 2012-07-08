package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using JUnit Rules")
@SuppressWarnings("all")
public class UsingJUnitRulesInFeaturesFeatureUsingJUnitRules {
  @Test
  @Order(0)
  @Named("When I have a feature with JUnit rules")
  public void whenIHaveAFeatureWithJUnitRules() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage demo\r\n\t\t\t\timport org.junit.Rule\r\n\t\t\t\timport org.junit.rules.TemporaryFolder\r\n\t\t\t\t\r\n\t\t\t\tFeature:  JUnit Rules\r\n\t\t\t\t\r\n\t\t\t\t\tScenario: Using rules in a Feature\r\n\t\t\t\t\t\t@Rule public val folder = new TemporaryFolder\r\n\t\t\t\t\t\r\n\t\t\t\t\t\tGiven a feature with a rule\r\n\t\t\t\t\t\tThen the rule should be initialized\r\n\t\t\t\t\t\t\tfolder.root should not be null\t\r\n\t\t\t");
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
