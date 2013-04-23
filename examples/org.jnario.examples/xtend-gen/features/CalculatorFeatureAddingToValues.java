/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package features;

import features.CalculatorFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario:  Adding to values")
@SuppressWarnings("all")
public class CalculatorFeatureAddingToValues extends CalculatorFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("Given I have a Calculator [PENDING]")
  public void givenIHaveACalculator() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("When I add two values [PENDING]")
  public void whenIAddTwoValues() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("Then it should print the result. [PENDING]")
  public void thenItShouldPrintTheResult() {
    
  }
}
