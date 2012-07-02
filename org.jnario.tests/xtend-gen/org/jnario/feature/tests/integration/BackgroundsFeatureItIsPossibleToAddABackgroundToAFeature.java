package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.jnario.test.util.FeatureExecutor;
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
  @Named("Given I have a feature with a background")
  public void givenIHaveAFeatureWithABackground() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\tpackage demo\n\t\t\tFeature: Calculator\n\t\t\t  Background:\n\t\t\t   int result \n\t\t\t   Given a calculator\n\t\t\t  Scenario: Adding two numbers 2 \n\t\t\t   When I enter two numbers \"20\" and \"70\"\n\t\t\t       result = args.first.toInt + args.second.toInt\n\t\t\t   Then it returns \"90\"\n\t\t\t     \tresult => args.first.toInt\n\t\t\t  Scenario: Adding two numbers wer\n\t\t\t    When I enter two numbers \"20\" and \"80\"\n\t\t\t    Then it returns \"100\"   \n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = args.first();
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
      InputOutput.<String>println("executing scenario");
      FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
