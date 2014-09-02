/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with different keyword")
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with reused steps with different keywords that throw an exception")
  public void _whenIHaveAScenarioWithReusedStepsWithDifferentKeywordsThatThrowAnException() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Referencing steps with different keyword\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Then the number of failures should be \\\"2\\\" [PENDING]")
  public void _thenTheNumberOfFailuresShouldBe2() {
    
  }
}
