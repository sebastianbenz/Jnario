/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package calculator;

@SuppressWarnings("all")
public class Calculator {
  public int add(final String a, final String b) {
    Integer _valueOf = Integer.valueOf(a);
    Integer _valueOf_1 = Integer.valueOf(b);
    int _add = this.add((_valueOf).intValue(), (_valueOf_1).intValue());
    return _add;
  }
  
  public int add(final int a, final int b) {
    return (a + b);
  }
  
  public int divide(final int a, final int b) {
    return (a / b);
  }
  
  public int substract(final int a, final int b) {
    return (a - b);
  }
  
  public String toString() {
    return "Calculator";
  }
}
