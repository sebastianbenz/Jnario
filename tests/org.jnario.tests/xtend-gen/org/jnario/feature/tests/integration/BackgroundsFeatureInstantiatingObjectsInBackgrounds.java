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
@Named("Scenario: Instantiating Objects in Backgrounds")
@SuppressWarnings("all")
public class BackgroundsFeatureInstantiatingObjectsInBackgrounds {
  @Test
  @Order(0)
  @Named("When I have a feature with a background")
  public void whenIHaveAFeatureWithABackground() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\r\nimport org.jnario.feature.tests.integration.Calculator\r\nFeature: Calculator\r\n  Background:\r\n   int result \r\n   Calculator calculator\r\n   Given a calculator\r\n       calculator = new Calculator()\r\n  Scenario: Adding two numbers 1 \r\n   When I enter two numbers \"20\" and \"70\"\r\n        result = calculator.add(args.first.toInt, args.second.toInt)\r\n   Then it returns \"90\"\r\n     \tresult => args.first.toInt\r\n  Scenario: Adding two numbers 2\r\n    When I enter two numbers \"20\" and \"80\"\r\n      Then it returns \"100\"");
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
