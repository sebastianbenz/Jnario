/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using jnario predefined extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureUsingJnarioPredefinedExtensions extends FeatureExtensionsFeature {
  String numberString;
  
  int number;
  
  @Test
  @Order(0)
  @Named("Given the number \\\"5\\\" as string")
  public void _givenTheNumber5AsString() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Using jnario predefined extensions\r\n"
      + "\nfirst cannot be resolved");
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
  @Named("Then it should be \\\"5\\\"")
  public void _thenItShouldBe5() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Using jnario predefined extensions\r\n"
      + "\nfirst cannot be resolved"
      + "\ntoInt cannot be resolved");
  }
}
