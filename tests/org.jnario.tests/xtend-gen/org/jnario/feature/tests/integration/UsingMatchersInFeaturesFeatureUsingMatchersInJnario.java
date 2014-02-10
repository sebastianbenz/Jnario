/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.UsingMatchersInFeaturesFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using Matchers in Jnario")
@SuppressWarnings("all")
public class UsingMatchersInFeaturesFeatureUsingMatchersInJnario extends UsingMatchersInFeaturesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario which uses the Jnario matchers")
  public void _whenIHaveAScenarioWhichUsesTheJnarioMatchers() {
    final StepArguments args = new StepArguments("Feature: Should\n\t\n\tScenario: Features with should\n\t\t\n\t\tGiven a Scenario\n\t\tThen it should be possible to use \"should\"\n\t\t\ttrue should be true\n\t\t\t1 + 1 should not be 1\n\t\t\t\"something\" should not be null \n\t\tAnd the shortcut \"=>\"\n\t\t\t1 + 1 => 2 \n\t\t\t\"a string\" => typeof(String)\n");
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
