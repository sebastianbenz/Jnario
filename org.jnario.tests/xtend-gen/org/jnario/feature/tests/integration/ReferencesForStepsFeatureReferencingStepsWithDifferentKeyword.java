package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.Should;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with different keyword")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword {
  @Test
  @Order(0)
  @Named("Given a scenario with reused steps")
  public void givenAScenarioWithReusedSteps() {
    this.jnarioFile = "\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\tFeature: Test\r\n\t\t\t\t\tScenario: TestScenario 1\r\n\t\t\t\t\t\tGiven step\r\n\t\t\t\t\t\t\tthrow new RuntimeException()\r\n\t\t\t\t\t\t\r\n\t\t\t\t\tScenario: TestScenario 2\r\n\t\t\t\t\t\tWhen step\r\n\t\t\t\t";
  }
  
  @Test
  @Order(1)
  @Named("When I run it it should fail")
  public void whenIRunItItShouldFail() {
    Result _execute = FeatureExecutor.execute(jnarioFile);
    int _failureCount = _execute.getFailureCount();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_failureCount), Integer.valueOf(2));Assert
    .assertTrue("\nExpected  but"
     + "\n      is " + Integer.valueOf(_failureCount) + "\n", _doubleArrow);
    
  }
  
  public String jnarioFile;
}
