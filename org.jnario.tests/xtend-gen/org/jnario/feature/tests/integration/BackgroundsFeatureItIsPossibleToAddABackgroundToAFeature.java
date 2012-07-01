package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.jnario.test.util.FeatureExecutor;
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
    this.jnarioFile = "\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\tFeature: Some feature\r\n\t\t\t\t\tBackground:\r\n\t\t\t\t\t\tGiven a user name\r\n\t\t\t\t\t\t\tval x = \'an implementation\'\r\n\t\t\t\t\tScenario: Scenario 1\r\n\t\t\t\t\tScenario: Scenario 2\r\n\t\t\t";
  }
  
  @Test
  @Order(1)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
      InputOutput.<String>println("executing scenario");
      FeatureExecutor.executesSuccessfully(this.jnarioFile);
  }
  
  CharSequence jnarioFile;
}
