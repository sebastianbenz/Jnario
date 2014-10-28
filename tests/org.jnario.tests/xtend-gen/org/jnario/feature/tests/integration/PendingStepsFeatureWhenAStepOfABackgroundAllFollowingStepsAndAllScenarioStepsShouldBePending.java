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
@Named("Scenario: When a step of a background all following steps and all scenario steps should be pending")
@SuppressWarnings("all")
public class PendingStepsFeatureWhenAStepOfABackgroundAllFollowingStepsAndAllScenarioStepsShouldBePending extends PendingStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("Given a scenario")
  public void _givenAScenario() {
    final StepArguments args = new StepArguments("Feature: With pending steps\n\tBackground:\n\t\tint x\n\t\tGiven a variable x\n\t\t\tx = 3\n\t\tAnd has no implementation\n\tScenario: Scenario with pending steps\n\t\tGiven a variable y\n\t\t\tvar y = 3\n\t\tWhen something is added to x\n\t\t\tx = x + 5\n\t\tThen there should be the corresponding result\n\t\t\tx => 8\n");
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
  @Named("And the expected number of ignored steps is \\\"4\\\"")
  public void _andTheExpectedNumberOfIgnoredStepsIs4() {
    final StepArguments args = new StepArguments("4");
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    FeatureExecutor.ignoreCountIs(this.jnarioFile, _int);
  }
}
