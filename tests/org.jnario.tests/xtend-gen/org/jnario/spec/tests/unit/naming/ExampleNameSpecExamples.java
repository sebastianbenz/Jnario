/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class ExampleNameSpecExamples extends ExampleTableRow {
  public ExampleNameSpecExamples(final List<String> cellNames, final String example, final String name) {
    super(cellNames);
    this.example = example;
    this.name = name;
  }
  
  public String example;
  
  public String getExample() {
    return example;
  }
  
  public String name;
  
  public String getName() {
    return name;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(example) , String.valueOf(name));
  }
}
