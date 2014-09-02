/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Background steps referencing other steps")
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureBackgroundStepsReferencingOtherSteps extends ReferencesForStepsFeature {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor behaviorExecutor;
  
  CharSequence jnarioFile;
  
  CharSequence jnarioFile2;
  
  @Test
  @Order(0)
  @Named("Given a feature")
  public void _givenAFeature() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Background steps referencing other steps\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("When referencing the backround steps from another background")
  public void _whenReferencingTheBackroundStepsFromAnotherBackground() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Background steps referencing other steps\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(2)
  @Named("Then they should execute successfully")
  public void _thenTheyShouldExecuteSuccessfully() {
    this.behaviorExecutor.executesSuccessfully(this.jnarioFile);
    this.behaviorExecutor.executesSuccessfully(this.jnarioFile2);
  }
}
