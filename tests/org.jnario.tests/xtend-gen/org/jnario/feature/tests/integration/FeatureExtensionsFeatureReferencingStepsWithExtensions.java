/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingStepsWithExtensions extends FeatureExtensionsFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("Given the number \\\"12\\\" as string [PENDING]")
  public void _givenTheNumber12AsString() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("When it is converted to int [PENDING]")
  public void _whenItIsConvertedToInt() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("Then it should be \\\"12\\\" [PENDING]")
  public void _thenItShouldBe12() {
    
  }
}
