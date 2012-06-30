package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using multiline Strings")
@SuppressWarnings("all")
public class StepParametersFeatureUsingMultilineStrings {
  @Test
  @Order(0)
  @Named("Given a feature")
  public void givenAFeature() {
    this.jnarioFile = "\n\t\t\t\tpackage bootstrap \n\t\t\t\tFeature: Test feature\n\t\t\t\t\tScenario: using multiline strings in step definitions\n\t\t\t\t\t\tString x\n\t\t\t\t\t\tGiven the multine string: \n\t\t\t\t\t\t\t\'\'\'hello\'\'\'\n\t\t\t\t\t\t\tx = args.first\n\t\t\t\t\t\tThen it should be \'hello\'\n\t\t\t\t\t\t\tx should be args.first\n\t\t\t";
  }
  
  @Test
  @Order(1)
  @Named("When this feature is executed")
  public void whenThisFeatureIsExecuted() {
    
  }
  
  @Test
  @Order(2)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
