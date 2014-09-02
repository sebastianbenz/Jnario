/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.hamcrest.Matcher;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Duplicate extension via step rerferences")
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureDuplicateExtensionViaStepRerferences extends ReferencesForStepsFeature {
  @Inject
  FeatureExecutor runner;
  
  CharSequence feature1;
  
  CharSequence feature2;
  
  @Test
  @Order(0)
  @Named("When I have a feature")
  public void _whenIHaveAFeature() {
    throw new Error("Unresolved compilation problems:"
      + "\n<unkown> cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("And another feature")
  public void _andAnotherFeature() {
    throw new Error("Unresolved compilation problems:"
      + "\n<unkown> cannot be resolved");
  }
  
  @Test
  @Order(2)
  @Named("Then both should execute successfully")
  public void _thenBothShouldExecuteSuccessfully() {
    Result _execute = this.runner.execute(this.feature1);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Should.<Result>operator_doubleArrow(_execute, _isSuccessful);
    Result _execute_1 = this.runner.execute(this.feature2);
    Matcher<Result> _isSuccessful_1 = ResultMatchers.isSuccessful();
    Should.<Result>operator_doubleArrow(_execute_1, _isSuccessful_1);
  }
}
