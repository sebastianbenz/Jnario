/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class FilterExtractorSpecFilterExtractions extends ExampleTableRow {
  public FilterExtractorSpecFilterExtractions(final List<String> cellNames, final String input, final String resultString) {
    super(cellNames);
    this.input = input;
    this.resultString = resultString;
  }
  
  public String input;
  
  public String getInput() {
    return input;
  }
  
  public String resultString;
  
  public String getResultString() {
    return resultString;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(input) , String.valueOf(resultString));
  }
}
