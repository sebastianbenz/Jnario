/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.AccessOfVariablesFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable in the same step it was declared in")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableInTheSameStepItWasDeclaredIn extends AccessOfVariablesFeature {
  @Test
  @Order(0)
  @Named("When I have scenario with a reference to a variable")
  public void whenIHaveScenarioWithAReferenceToAVariable() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field jnarioFile is undefined for the type Scenario: Access a variable in the same step it was declared in\r\n");
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Then it should execute successfully [PENDING]")
  public void thenItShouldExecuteSuccessfully() {
    
  }
}
