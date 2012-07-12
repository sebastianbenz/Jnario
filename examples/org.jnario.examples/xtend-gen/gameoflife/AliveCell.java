/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife;

import gameoflife.Cell;
import gameoflife.DeadCell;

@SuppressWarnings("all")
public class AliveCell extends Cell {
  public static AliveCell aliveCell() {
    AliveCell _aliveCell = new AliveCell();
    return _aliveCell;
  }
  
  public Cell evolve(final int neighbourCount) {
    boolean _or = false;
    boolean _underPopulated = this.underPopulated(neighbourCount);
    if (_underPopulated) {
      _or = true;
    } else {
      boolean _overpopulated = this.overpopulated(neighbourCount);
      _or = (_underPopulated || _overpopulated);
    }
    if (_or) {
      return DeadCell.deadCell();
    }
    return AliveCell.aliveCell();
  }
  
  public boolean underPopulated(final int neighbourCount) {
    return (neighbourCount < 2);
  }
  
  public boolean overpopulated(final int neighbourCount) {
    return (neighbourCount > 3);
  }
}
