/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife;

import gameoflife.Cell;
import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class CellSpecExamples extends ExampleTableRow {
  public CellSpecExamples(final List<String> cellNames, final Cell cell, final int neighborCount, final Class<? extends Object> newState) {
    super(cellNames);
    this.cell = cell;
    this.neighborCount = neighborCount;
    this.newState = newState;
  }
  
  public Cell cell;
  
  public Cell getCell() {
    return cell;
  }
  
  public int neighborCount;
  
  public int getNeighborCount() {
    return neighborCount;
  }
  
  public Class<? extends Object> newState;
  
  public Class<? extends Object> getNewState() {
    return newState;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(cell) , String.valueOf(neighborCount) , String.valueOf(newState));
  }
}
