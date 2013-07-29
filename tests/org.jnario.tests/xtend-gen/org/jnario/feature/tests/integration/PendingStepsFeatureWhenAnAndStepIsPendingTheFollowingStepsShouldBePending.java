/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.PendingStepsFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: When an and step is pending the following steps should be pending")
@SuppressWarnings("all")
public class PendingStepsFeatureWhenAnAndStepIsPendingTheFollowingStepsShouldBePending extends PendingStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("Given a scenario")
  public void _givenAScenario() {
    StepArguments _stepArguments = new StepArguments("Feature: With pending steps\n\tScenario: Scenario with pending steps\n\t\tint x\n\t\tGiven does something\n\t\t\tx = 3\n\t\tAnd a not implemented step\n\t\tWhen is implemented with\n\t\t\tx = x + 5\n\t\tThen does also something\n\t\t\tx => 8\n");
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
  
  @Test
  @Order(2)
  @Named("And the expected number of ignored steps is \\\"3\\\"")
  public void _andTheExpectedNumberOfIgnoredStepsIs3() {
    StepArguments _stepArguments = new StepArguments("3");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    FeatureExecutor.ignoreCountIs(this.jnarioFile, _int);
  }
}
