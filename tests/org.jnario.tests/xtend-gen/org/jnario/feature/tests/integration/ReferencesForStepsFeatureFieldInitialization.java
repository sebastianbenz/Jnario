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
    StepArguments _stepArguments = new StepArguments("import java.util.Stack\r\n\r\nFeature: Stack\r\n\r\n\r\nScenario: Stack adding elements\r\n\tStack<String> stack\r\n\tGiven a stack\r\n\t\tstack= new Stack<String>()\r\n\tWhen I add a value \"something\"\r\n\t\tstack.add(\"something\")\r\n\tThen the stack should contain \"something\"\r\n\t\tassert stack.contains(\"something\")\r\n\r\nScenario: Stack adding more elements\r\n\tGiven a stack\r\n\tWhen I add a value \"something else\"\r\n\tThen the stack should contain \"something else\"");
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
