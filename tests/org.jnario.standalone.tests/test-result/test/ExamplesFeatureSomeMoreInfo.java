/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package test;

import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import test.ExamplesFeature;

@RunWith(FeatureRunner.class)
@Named("Background: Some more info")
@SuppressWarnings("all")
public abstract class ExamplesFeatureSomeMoreInfo extends ExamplesFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("Given I have entered \\\"333\\\" into the calculator [PENDING]")
  public void _givenIHaveEntered333IntoTheCalculator() {
    
  }
}
