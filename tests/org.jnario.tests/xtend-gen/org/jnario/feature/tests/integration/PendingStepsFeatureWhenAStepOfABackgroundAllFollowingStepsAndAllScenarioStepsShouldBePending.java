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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: When a step of a background all following steps and all scenario steps should be pending")
@SuppressWarnings("all")
public class PendingStepsFeatureWhenAStepOfABackgroundAllFollowingStepsAndAllScenarioStepsShouldBePending extends PendingStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Ignore
  @Named("Given a scenario")
  public void givenAScenario() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("And the expected number of ignored steps is \\\"4\\\"")
  public void andTheExpectedNumberOfIgnoredStepsIs4() {
    StepArguments _stepArguments = new StepArguments("4");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    FeatureExecutor.ignoreCountIs(this.jnarioFile, _int);
  }
}
