package org.jnario.feature.tests.integration;

import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Simple calculator test with background and references")
@SuppressWarnings("all")
public class CalculatorFeatureSimpleCalculatorTestWithBackgroundAndReferences {
  @Test
  @Order(0)
  @Named("When I have a feature with a background and references")
  public void whenIHaveAFeatureWithABackgroundAndReferences() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\tpackage demo\r\n\t\t\tFeature: Calculator\r\n\t\t\t  Background:\r\n\t\t\t   int result \r\n\t\t\t   Given a calculator\r\n\t\t\t  Scenario: Adding two numbers 2 \r\n\t\t\t   When I enter two numbers \"20\" and \"70\"\r\n\t\t\t       result = args.first.toInt + args.second.toInt\r\n\t\t\t   Then it returns \"90\"\r\n\t\t\t     \tresult => args.first.toInt\r\n\t\t\t  Scenario: Adding two numbers wer\r\n\t\t\t    When I enter two numbers \"20\" and \"80\"\r\n\t\t\t    Then it returns \"100\"   \r\n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = args.first();
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    
  }
  
  CharSequence jnarioFile;
}
