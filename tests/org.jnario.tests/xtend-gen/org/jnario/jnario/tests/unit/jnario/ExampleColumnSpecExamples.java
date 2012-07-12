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

public class ExampleColumnSpecExamples extends ExampleTableRow {
  public ExampleColumnSpecExamples(final List<String> cellNames, final int columnIndex, final int cellIndex, final String value) {
    super(cellNames);
    this.columnIndex = columnIndex;
    this.cellIndex = cellIndex;
    this.value = value;
  }
  
  public int columnIndex;
  
  public int getColumnIndex() {
    return columnIndex;
  }
  
  public int cellIndex;
  
  public int getCellIndex() {
    return cellIndex;
  }
  
  public String value;
  
  public String getValue() {
    return value;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(columnIndex) , String.valueOf(cellIndex) , String.valueOf(value));
  }
}
