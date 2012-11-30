package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.CreateWith;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Error messages in Step References")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureErrorMessagesInStepReferences extends ReferencesForStepsFeature {
  @Inject
  @Extension
  public BehaviorExecutor behaviorExecutor;
  
  CharSequence jnarioFile;
  
  CharSequence jnarioFile2;
  
  @Test
  @Order(0)
  @Named("Given a feature")
  public void givenAFeature() {
    StepArguments _stepArguments = new StepArguments("Feature: Error Messages in Step References\n \nScenario: Defines a failing step\n\tval aList = list(\"red\")\nGiven an extension\n\ttry{\n\t\taList should contain \"green\"\n\t}catch(AssertionError e){\n\t\tval expected = \n\'Expected aList should contain \"green\" but\n     aList is <[red]>\'\n\t\te.message should contain expected\n\t}\nScenario: Redefines failing step\nGiven an extension                      \n");
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
