/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator;

@SuppressWarnings("all")
public class Calculator {
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
  
  public Object enter(final String a) {
    return null;
  }
  
  public Object press(final String command) {
    return null;
  }
  
  public String result() {
    return "120";
  }
}
