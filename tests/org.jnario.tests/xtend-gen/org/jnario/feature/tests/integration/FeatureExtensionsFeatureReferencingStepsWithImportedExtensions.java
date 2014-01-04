/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with imported extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingStepsWithImportedExtensions extends FeatureExtensionsFeature {
  double value;
  
  double flooredValue;
  
  @Test
  @Order(0)
  @Named("Given the value \\\"13.9\\\"")
  public void _givenTheValue139() {
    StepArguments _stepArguments = new StepArguments("13.9");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    double _double = StringConversions.toDouble(_first);
    this.value = _double;
  }
  
  @Test
  @Order(1)
  @Named("When I floor it")
  public void _whenIFloorIt() {
    double _floor = Math.floor(this.value);
    this.flooredValue = _floor;
  }
  
  @Test
  @Order(2)
  @Named("Then the value should be \\\"13.0\\\"")
  public void _thenTheValueShouldBe130() {
    StepArguments _stepArguments = new StepArguments("13.0");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    double _double = StringConversions.toDouble(_first);
    Should.<Double>operator_doubleArrow(Double.valueOf(this.flooredValue), Double.valueOf(_double));
  }
}
