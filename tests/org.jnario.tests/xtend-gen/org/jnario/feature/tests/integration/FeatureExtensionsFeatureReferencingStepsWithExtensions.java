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
@Named("Scenario: Referencing steps with extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingStepsWithExtensions extends FeatureExtensionsFeature {
  String numberString;
  
  int number;
  
  @Test
  @Order(0)
  @Named("Given the number \\\"12\\\" as string")
  public void _givenTheNumber12AsString() {
    final StepArguments args = new StepArguments("12");
    String _first = JnarioIterableExtensions.<String>first(args);
    this.numberString = _first;
  }
  
  @Test
  @Order(1)
  @Named("When it is converted to int")
  public void _whenItIsConvertedToInt() {
    int _int = StringConversions.toInt(this.numberString);
    this.number = _int;
  }
  
  @Test
  @Order(2)
  @Named("Then it should be \\\"12\\\"")
  public void _thenItShouldBe12() {
    final StepArguments args = new StepArguments("12");
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    Should.<Integer>operator_doubleArrow(Integer.valueOf(this.number), Integer.valueOf(_int));
  }
}
