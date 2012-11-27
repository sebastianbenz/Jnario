package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.BehaviorExecutor;
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
@Named("Scenario: Background steps referencing other steps")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureBackgroundStepsReferencingOtherSteps extends ReferencesForStepsFeature {
  @Inject
  @Extension
  public BehaviorExecutor behaviorExecutor;
  
  CharSequence jnarioFile;
  
  CharSequence jnarioFile2;
  
  @Test
  @Order(0)
  @Named("Given a feature")
  public void givenAFeature() {
    StepArguments _stepArguments = new StepArguments("Feature: Feature 1\nBackground:\nString testString\nGiven something\ntestString = \"test\"\nAnd it is upper case\ntestString.toUpperCase\nScenario: Scenario 1\n\t \t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("When referencing the backround steps from another background")
  public void whenReferencingTheBackroundStepsFromAnotherBackground() {
    StepArguments _stepArguments = new StepArguments("Feature: Feature 2\nBackground:\nGiven something\nScenario: Scenario 2\nGiven it is upper case\n\t \t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile2 = _first;
  }
  
  @Test
  @Order(2)
  @Named("Then they should execute successfully")
  public void thenTheyShouldExecuteSuccessfully() {
    this.behaviorExecutor.executesSuccessfully(this.jnarioFile);
    this.behaviorExecutor.executesSuccessfully(this.jnarioFile2);
  }
}
