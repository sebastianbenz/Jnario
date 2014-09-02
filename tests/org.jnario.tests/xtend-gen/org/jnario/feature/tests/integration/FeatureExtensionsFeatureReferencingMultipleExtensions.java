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
@Named("Scenario: Referencing multiple extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingMultipleExtensions extends FeatureExtensionsFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("When sorting the colors \\\"yellow, red\\\" [PENDING]")
  public void _whenSortingTheColorsYellowRed() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Then they should be ordered \\\"red, yellow\\\" [PENDING]")
  public void _thenTheyShouldBeOrderedRedYellow() {
    
  }
}
