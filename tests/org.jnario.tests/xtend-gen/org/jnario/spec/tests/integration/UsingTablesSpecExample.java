/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

/**
 * Jnario will include example tables in the generated documentation.
 * (The errors in the table are intentional, we need it in the next example).
 */
public class UsingTablesSpecExample extends ExampleTableRow {
  public UsingTablesSpecExample(final List<String> cellNames, final int value1, final int value2, final int sum) {
    super(cellNames);
    this.value1 = value1;
    this.value2 = value2;
    this.sum = sum;
  }
  
  public int value1;
  
  public int getValue1() {
    return value1;
  }
  
  public int value2;
  
  public int getValue2() {
    return value2;
  }
  
  public int sum;
  
  public int getSum() {
    return sum;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(value1) , String.valueOf(value2) , String.valueOf(sum));
  }
}
