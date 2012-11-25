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
@Named("Scenario: Accessing extension field methods")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureAccessingExtensionFieldMethods extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I access extension field methods from referenced steps")
  public void whenIAccessExtensionFieldMethodsFromReferencedSteps() {
    StepArguments _stepArguments = new StepArguments("Feature: Sharing extension field\n\n\t\t  Scenario: Accessing extension field methods\n\t\t    extension String = \"hello\"\n\t\t   \n\t\t    Given an extension field access\n\t\t      concat(\" world\") should be \"hello world\"\n\t\t\n\t\t  Scenario: Accessing extension field methods in referenced steps\n\t\t  \t\n\t\t  \tGiven an extension field access\n");
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
