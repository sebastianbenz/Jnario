package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.CalculatorFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Simple calculator test with background and references")
@SuppressWarnings("all")
public class CalculatorFeatureSimpleCalculatorTestWithBackgroundAndReferences extends CalculatorFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a feature with a background and references")
  public void whenIHaveAFeatureWithABackgroundAndReferences() {
    StepArguments _stepArguments = new StepArguments("package demo\nFeature: Calculator\n  Background:\n   int result \n   Given a calculator\n  Scenario: Adding two numbers 2 \n   When I enter two numbers \"20\" and \"70\"\n       result = args.first.toInt + args.second.toInt\n   Then it returns \"90\"\n     \tresult => args.first.toInt\n  Scenario: Adding two numbers wer\n    When I enter two numbers \"20\" and \"80\"\n    Then it returns \"100\"   \n");
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
