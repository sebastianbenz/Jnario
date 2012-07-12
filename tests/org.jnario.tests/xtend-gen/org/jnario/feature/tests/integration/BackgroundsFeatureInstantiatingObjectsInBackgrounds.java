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
@Named("Scenario: Instantiating Objects in Backgrounds")
@SuppressWarnings("all")
public class BackgroundsFeatureInstantiatingObjectsInBackgrounds {
  @Test
  @Order(0)
  @Named("When I have a feature with a background")
  public void whenIHaveAFeatureWithABackground() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap\r\n\t\t\t\timport org.jnario.feature.tests.integration.Calculator\r\n\t\t\t\tFeature: Calculator\r\n\t\t\t\t  Background:\r\n\t\t\t\t   int result \r\n\t\t\t\t   Calculator calculator\r\n\t\t\t\t   Given a calculator\r\n\t\t\t\t       calculator = new Calculator()\r\n\t\t\t\t  Scenario: Adding two numbers 1 \r\n\t\t\t\t   When I enter two numbers \"20\" and \"70\"\r\n\t\t\t\t        result = calculator.add(args.first.toInt, args.second.toInt)\r\n\t\t\t\t   Then it returns \"90\"\r\n\t\t\t\t     \tresult => args.first.toInt\r\n\t\t\t\t  Scenario: Adding two numbers 2\r\n\t\t\t\t    When I enter two numbers \"20\" and \"80\"\r\n\t\t\t\t      Then it returns \"100\"\r\n\t\t\t");
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
