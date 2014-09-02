/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.FieldInferenceFeature;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Inferring Fields from Background in different Feature")
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class FieldInferenceFeatureInferringFieldsFromBackgroundInDifferentFeature extends FieldInferenceFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("When I have a feature")
  public void _whenIHaveAFeature() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("And another feature")
  public void _andAnotherFeature() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field feature2 is undefined for the type Scenario: Inferring Fields from Background in different Feature\r\n"
      + "\nThe method or field args is undefined for the type Scenario: Inferring Fields from Background in different Feature\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("Then both should execute successfully [PENDING]")
  public void _thenBothShouldExecuteSuccessfully() {
    
  }
}
