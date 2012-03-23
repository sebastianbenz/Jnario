/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package demo;

import demo.Calculator;
import org.junit.Test;

@SuppressWarnings("all")
public class CalculatorTest {
  @Test
  public void shouldRun() {
    Calculator _calculator = new Calculator();
    _calculator.add(1, 1);
  }
}
