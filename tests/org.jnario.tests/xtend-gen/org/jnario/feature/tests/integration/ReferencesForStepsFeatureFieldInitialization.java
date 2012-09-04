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
@Named("Scenario: Field initialization")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureFieldInitialization {
  @Test
  @Order(0)
  @Named("When I have a scenario with field initialized in a given step")
  public void whenIHaveAScenarioWithFieldInitializedInAGivenStep() {
    StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\timport java.util.Stack\r\n\t\t\t\t\r\n\t\t\t\tFeature: Stack\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\tScenario: Stack adding elements\r\n\t\t\t\t\tStack<String> stack\r\n\t\t\t\t\tGiven a stack\r\n\t\t\t\t\t\tstack= new Stack<String>()\r\n\t\t\t\t\tWhen I add a value \"something\"\r\n\t\t\t\t\t\tstack.add(\"something\")\r\n\t\t\t\t\tThen the stack should contain \"something\"\r\n\t\t\t\t\t\tassert stack.contains(\"something\")\r\n\t\t\t\t\r\n\t\t\t\tScenario: Stack adding more elements\r\n\t\t\t\t\tGiven a stack\r\n\t\t\t\t\tWhen I add a value \"something else\"\r\n\t\t\t\t\tThen the stack should contain \"something else\"\r\n\t \t\t");
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
