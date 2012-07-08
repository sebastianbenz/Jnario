package org.jnario.feature.tests.integration;

import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
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
  @Named("When I have a scenario with reused steps with different keywords that throw an exception")
  public void whenIHaveAScenarioWithReusedStepsWithDifferentKeywordsThatThrowAnException() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\tFeature: Test\r\n\t\t\t\t\tScenario: TestScenario 1\r\n\t\t\t\t\t\tGiven step\r\n\t\t\t\t\t\t\tthrow new RuntimeException()\r\n\t\t\t\t\t\t\r\n\t\t\t\t\tScenario: TestScenario 2\r\n\t\t\t\t\t\tWhen step\r\n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = args.first();
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then the number of failures should be \"2\"")
  public void thenTheNumberOfFailuresShouldBe2() {
      StepArguments _stepArguments = new StepArguments("2");
      final StepArguments args = _stepArguments;
      Result _run = FeatureExecutor.run(jnarioFile);
      int _failureCount = _run.getFailureCount();
      StepArguments _args = args;
      String _first = _args.first();
      int _int = StringConversions.toInt(_first);
      boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_failureCount), Integer.valueOf(_int));
      Assert.assertTrue("\nExpected  but"
       + "\n      is " + new StringDescription().appendValue(Integer.valueOf(_failureCount)).toString() + "\n", _doubleArrow);
      
  }
  
  CharSequence jnarioFile;
}
