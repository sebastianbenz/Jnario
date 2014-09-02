/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.TestRunnerFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Create only one test instance for one jnario scenario")
@SuppressWarnings("all")
public class TestRunnerFeatureCreateOnlyOneTestInstanceForOneJnarioScenario extends TestRunnerFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario that uses one variable in different steps")
  public void _whenIHaveAScenarioThatUsesOneVariableInDifferentSteps() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Create only one test instance for one jnario scenario\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Then the scenario should have no validation errors that the variable was not defined [PENDING]")
  public void _thenTheScenarioShouldHaveNoValidationErrorsThatTheVariableWasNotDefined() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("And it should execute successfully")
  public void _andItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
