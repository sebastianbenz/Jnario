/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.BehaviorExecutor;
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
@Named("Scenario: Ordering in step references")
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureOrderingInStepReferences extends ReferencesForStepsFeature {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor behaviorExecutor;
  
  CharSequence jnarioFile;
  
  CharSequence jnarioFile2;
  
  @Test
  @Order(0)
  @Named("Given a feature")
  public void _givenAFeature() {
    StepArguments _stepArguments = new StepArguments("Feature: Ordering of step references\n \nScenario: First\n\tCharSequence jnarioFile\n\tThen it should execute successfully\n\t\tjnarioFile = \"\"\n\t\t\nScenario: Second\n\tWhen I have a scenario with a field\n\t\tjnarioFile = \"\"\n \tThen it should execute successfully\n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void _thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
