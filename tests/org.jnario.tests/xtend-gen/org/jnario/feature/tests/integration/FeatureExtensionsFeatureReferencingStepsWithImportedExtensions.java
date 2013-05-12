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
@Named("Scenario: Referencing steps with imported extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingStepsWithImportedExtensions extends FeatureExtensionsFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("Given the value \\\"13.9\\\" [PENDING]")
  public void givenTheValue139() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("When I floor it [PENDING]")
  public void whenIFloorIt() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("Then the value should be \\\"13.0\\\" [PENDING]")
  public void thenTheValueShouldBe130() {
    
  }
}
