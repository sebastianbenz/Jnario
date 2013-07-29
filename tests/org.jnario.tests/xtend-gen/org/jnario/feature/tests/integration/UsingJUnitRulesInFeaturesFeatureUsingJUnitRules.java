/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.UsingJUnitRulesInFeaturesFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using JUnit Rules")
@SuppressWarnings("all")
public class UsingJUnitRulesInFeaturesFeatureUsingJUnitRules extends UsingJUnitRulesInFeaturesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a feature with JUnit rules")
  public void _whenIHaveAFeatureWithJUnitRules() {
    StepArguments _stepArguments = new StepArguments("package demo\nimport org.junit.Rule\nimport org.junit.rules.TemporaryFolder\n\nFeature:  JUnit Rules\n\n\tScenario: Using rules in a Feature\n\t\t@Rule public val folder = new TemporaryFolder\n\t\n\t\tGiven a feature with a rule\n\t\tThen the rule should be initialized\n\t\t\tfolder.root should not be null\t\n");
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
