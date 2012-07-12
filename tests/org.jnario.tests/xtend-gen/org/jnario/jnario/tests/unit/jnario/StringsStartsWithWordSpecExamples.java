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

public class StringsStartsWithWordSpecExamples extends ExampleTableRow {
  public StringsStartsWithWordSpecExamples(final List<String> cellNames, final String string, final String word, final int index) {
    super(cellNames);
    this.string = string;
    this.word = word;
    this.index = index;
  }
  
  public String string;
  
  public String getString() {
    return string;
  }
  
  public String word;
  
  public String getWord() {
    return word;
  }
  
  public int index;
  
  public int getIndex() {
    return index;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(string) , String.valueOf(word) , String.valueOf(index));
  }
}
