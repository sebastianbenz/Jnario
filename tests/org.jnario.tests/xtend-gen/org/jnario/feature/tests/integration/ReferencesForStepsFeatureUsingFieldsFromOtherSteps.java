/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using fields from other steps")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureUsingFieldsFromOtherSteps {
  @Test
  @Order(0)
  @Named("When I have a scenario with a field")
  public void whenIHaveAScenarioWithAField() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\timport java.util.*\r\n\t\t\t\tFeature: Test\r\n\t\t\t\t\tScenario: TestScenario 1\r\n\t\t\t\t\t\tList<String> values = new ArrayList()\r\n\t\t\t\t\t\tGiven a list\r\n\t\t\t\t\t\t\tvalues += \"hello\"\r\n\t\t\t\t\t\t\r\n\t\t\t\t\tScenario: TestScenario 2\r\n\t\t\t\t\t\tGiven a list\r\n\t\t\t\t\t\tThen it should have contents\r\n\t\t\t\t\t\t\tvalues.size => 1\r\n\t\t\t");
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
