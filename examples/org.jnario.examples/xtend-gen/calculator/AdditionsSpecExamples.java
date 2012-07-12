/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class AdditionsSpecExamples extends ExampleTableRow {
  public AdditionsSpecExamples(final List<String> cellNames, final int a, final int b, final int sum) {
    super(cellNames);
    this.a = a;
    this.b = b;
    this.sum = sum;
  }
  
  public int a;
  
  public int getA() {
    return a;
  }
  
  public int b;
  
  public int getB() {
    return b;
  }
  
  public int sum;
  
  public int getSum() {
    return sum;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(a) , String.valueOf(b) , String.valueOf(sum));
  }
}
