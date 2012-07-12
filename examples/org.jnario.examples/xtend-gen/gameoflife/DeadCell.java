/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife;

import gameoflife.AliveCell;
import gameoflife.Cell;

@SuppressWarnings("all")
public class DeadCell extends Cell {
  public static DeadCell deadCell() {
    DeadCell _deadCell = new DeadCell();
    return _deadCell;
  }
  
  public Cell evolve(final int neighbourCount) {
    boolean _equals = (neighbourCount == 3);
    if (_equals) {
      return AliveCell.aliveCell();
    }
    return DeadCell.deadCell();
  }
}
