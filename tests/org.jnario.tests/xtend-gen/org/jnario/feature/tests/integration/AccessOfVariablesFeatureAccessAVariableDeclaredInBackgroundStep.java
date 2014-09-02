/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.AccessOfVariablesFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable declared in background step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableDeclaredInBackgroundStep extends AccessOfVariablesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I define a variable in the background")
  public void _whenIDefineAVariableInTheBackground() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Access a variable declared in background step\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void _thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
