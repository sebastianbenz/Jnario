/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package test;

import org.jnario.runner.Named;
import org.jnario.runner.Order;
import test.ExamplesFeature;

@Named("Background: Some more info")
@SuppressWarnings("all")
public abstract class ExamplesFeatureSomeMoreInfo extends ExamplesFeature {
  @Order(0)
  @Named("Given I have entered \\\"333\\\" into the calculator [PENDING]")
  public void _givenIHaveEntered333IntoTheCalculator() {
    
  }
}
