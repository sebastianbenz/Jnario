/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration;

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
public class TestRunnerFeatureCreateOnlyOneTestInstanceForOneJnarioScenario {
  @Test
  @Order(0)
  @Named("Given a jnario-file that uses one variable in different steps")
  public void givenAJnarioFileThatUsesOneVariableInDifferentSteps() {
    this.jnarioFile = "\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\tFeature: a feature\r\n\t\t\t\t\tScenario: a scenario with field\r\n\t\t\t\t\t\tpublic int x\r\n\t\t\t\t\t\tGiven a variable access\r\n\t\t\t\t\t\t\tx = 3\r\n\t\t\t\t\t\tWhen the variable is accessed\r\n\t\t\t\t\t\t\tx = x + 1 \r\n\t\t\t\t\t\tThen it is accessed\r\n\t\t\t\t\t\t\tx => 4\r\n\t\t\t\t";
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] When I run the scenario")
  public void whenIRunTheScenario() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("[PENDING] Then the scenario should have no validation errors that the variable was not defined")
  public void thenTheScenarioShouldHaveNoValidationErrorsThatTheVariableWasNotDefined() {
    
  }
  
  @Test
  @Order(3)
  @Named("And it should pass")
  public void andItShouldPass() {
    FeatureExecutor.executesSuccessfully(this.jnarioFile);
  }
  
  public String jnarioFile;
}
