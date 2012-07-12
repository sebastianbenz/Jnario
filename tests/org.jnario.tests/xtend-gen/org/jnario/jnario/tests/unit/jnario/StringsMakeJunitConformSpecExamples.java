/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.jnario;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class StringsMakeJunitConformSpecExamples extends ExampleTableRow {
  public StringsMakeJunitConformSpecExamples(final List<String> cellNames, final String string, final String result) {
    super(cellNames);
    this.string = string;
    this.result = result;
  }
  
  public String string;
  
  public String getString() {
    return string;
  }
  
  public String result;
  
  public String getResult() {
    return result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(string) , String.valueOf(result));
  }
}
