/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;
import org.jnario.suite.suite.Suite;

public class SuiteNodeBuilderParentSpecExamples extends ExampleTableRow {
  public SuiteNodeBuilderParentSpecExamples(final List<String> cellNames, final List<Suite> suites, final int position, final String parent) {
    super(cellNames);
    this.suites = suites;
    this.position = position;
    this.parent = parent;
  }
  
  public List<Suite> suites;
  
  public List<Suite> getSuites() {
    return suites;
  }
  
  public int position;
  
  public int getPosition() {
    return position;
  }
  
  public String parent;
  
  public String getParent() {
    return parent;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(suites) , String.valueOf(position) , String.valueOf(parent));
  }
}
