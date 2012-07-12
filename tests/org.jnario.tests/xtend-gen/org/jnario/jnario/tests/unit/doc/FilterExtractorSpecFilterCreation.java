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

public class FilterExtractorSpecFilterCreation extends ExampleTableRow {
  public FilterExtractorSpecFilterCreation(final List<String> cellNames, final String input, final List<String> resultingFilters) {
    super(cellNames);
    this.input = input;
    this.resultingFilters = resultingFilters;
  }
  
  public String input;
  
  public String getInput() {
    return input;
  }
  
  public List<String> resultingFilters;
  
  public List<String> getResultingFilters() {
    return resultingFilters;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(input) , String.valueOf(resultingFilters));
  }
}
