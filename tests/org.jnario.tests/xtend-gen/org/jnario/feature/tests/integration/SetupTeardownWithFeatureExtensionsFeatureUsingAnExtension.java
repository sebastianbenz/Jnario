/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.SetupTeardownWithFeatureExtensionsFeature;
import org.jnario.jnario.test.util.ConsoleRecorder;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using an Extension")
@SuppressWarnings("all")
public class SetupTeardownWithFeatureExtensionsFeatureUsingAnExtension extends SetupTeardownWithFeatureExtensionsFeature {
  CharSequence feature;
  
  ConsoleRecorder recorder;
  
  @Test
  @Order(0)
  @Named("When I declare an extension field of type **ExampleExtension** in the background")
  public void _whenIDeclareAnExtensionFieldOfTypeExampleExtensionInTheBackground() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Using an Extension\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("And execute the feature")
  public void _andExecuteTheFeature() {
    ConsoleRecorder _start = ConsoleRecorder.start();
    this.recorder = _start;
    FeatureExecutor.isSuccessful(this.feature);
  }
  
  @Test
  @Order(2)
  @Named("Then the execution order is")
  public void _thenTheExecutionOrderIs() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Using an Extension\r\n"
      + "\nThe method or field trim is undefined for the type Scenario: Using an Extension\r\n"
      + "\nfirst cannot be resolved"
      + "\ntrim cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
}
