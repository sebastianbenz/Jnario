/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.linking;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class StepArgumentsProviderSpecExamples extends ExampleTableRow {
  public StepArgumentsProviderSpecExamples(final List<String> cellNames, final String step, final List<? extends Object> expectedArgs) {
    super(cellNames);
    this.step = step;
    this.expectedArgs = expectedArgs;
  }
  
  public String step;
  
  public String getStep() {
    return step;
  }
  
  public List<? extends Object> expectedArgs;
  
  public List<? extends Object> getExpectedArgs() {
    return expectedArgs;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(step) , String.valueOf(expectedArgs));
  }
}
