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
@Named("Scenario: It is possible to add a background to a feature")
@SuppressWarnings("all")
public class BackgroundsFeatureItIsPossibleToAddABackgroundToAFeature {
  @Test
  @Order(0)
  @Named("When I have a feature with a background")
  public void whenIHaveAFeatureWithABackground() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\nFeature: Some feature\n\tBackground:\n\t\tGiven a user name\n\t\t\tval x = \"an implementation\"\n\tScenario: Scenario 1\n\tScenario: Scenario 2\n\t\t\t");
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
