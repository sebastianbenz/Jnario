/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration;

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
@Named("Scenario: Inferring Fields from other Scenario")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class FieldInferenceFeatureInferringFieldsFromOtherScenario {
  @Test
  @Order(0)
  @Named("When I have a feature with two scenarios")
  public void whenIHaveAFeatureWithTwoScenarios() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\tFeature: Feature 1\n\t\t\t\tScenario: My Scenario\n\t\t\t\t\tString myString\n\t\t\t\t\tGiven a string \"value\"\n\t\t\t\t\t\tmyString = args.first\n\t\t\t\tScenario: My Scenario 2\n\t\t\t\t\tGiven a string \"test\"\n\t\t\t\t\tThen my string is \"test\"\n\t\t\t\t\t\tmyString => args.first  \n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
