/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using multiline Strings")
@SuppressWarnings("all")
public class StepParametersFeatureUsingMultilineStrings extends StepParametersFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with multiline strings")
  public void _whenIHaveAScenarioWithMultilineStrings() {
    this.jnarioFile = "\r\n\t\t\t\tpackage bootstrap \r\n\t\t\t\tFeature: Test feature\r\n\t\t\t\t\tScenario: using multiline strings in step definitions\r\n\t\t\t\t\t\tString x\r\n\t\t\t\t\t\tGiven the multine string: \r\n\t\t\t\t\t\t\t\'\'\'hello\'\'\'\r\n\t\t\t\t\t\t\tx = args.first\r\n\t\t\t\t\t\tThen it should be \"hello\"\r\n\t\t\t\t\t\t\tx should be args.first\r\n\t\t\t";
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void _thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
