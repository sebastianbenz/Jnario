package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Field initialization")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureFieldInitialization extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with field initialized in a given step")
  public void whenIHaveAScenarioWithFieldInitializedInAGivenStep() {
    StepArguments _stepArguments = new StepArguments("import java.util.Stack\n\nFeature: Stack\n\n\nScenario: Stack adding elements\n\tStack<String> stack\n\tGiven a stack\n\t\tstack= new Stack<String>()\n\tWhen I add a value \"something\"\n\t\tstack.add(\"something\")\n\tThen the stack should contain \"something\"\n\t\tassert stack.contains(\"something\")\n\nScenario: Stack adding more elements\n\tGiven a stack\n\tWhen I add a value \"something else\"\n\tThen the stack should contain \"something else\"\n\t \t\t");
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
