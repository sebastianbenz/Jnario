/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import java.util.List;
import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using Multiple extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureUsingMultipleExtensions extends FeatureExtensionsFeature {
  List<String> list;
  
  @Test
  @Order(0)
  @Named("When sorting the colors \\\"red, green, blue\\\"")
  public void _whenSortingTheColorsRedGreenBlue() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Using Multiple extensions\r\n"
      + "\nThe method trim is undefined for the type Scenario: Using Multiple extensions\r\n"
      + "\nfirst cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nsort cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("Then they should be ordered \\\"blue, green, red\\\"")
  public void _thenTheyShouldBeOrderedBlueGreenRed() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Using Multiple extensions\r\n"
      + "\nfirst cannot be resolved"
      + "\ntoList cannot be resolved");
  }
}
