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
import gameoflife.DeadCell;
import gameoflife.Position;
import gameoflife.WorldVisitor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class World {
  private Map<Position,Cell> cells = new Function0<Map<Position,Cell>>() {
    public Map<Position,Cell> apply() {
      HashMap<Position,Cell> _newHashMap = CollectionLiterals.<Position, Cell>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  protected void _addCell(final Position position, final AliveCell cell) {
    this.doAdd(position, cell);
    this.addDeadNeighbours(position);
  }
  
  private void addDeadNeighbours(final Position position) {
    Set<Position> _neighbours = position.neighbours();
    final Procedure1<Position> _function = new Procedure1<Position>() {
        public void apply(final Position it) {
          DeadCell _deadCell = DeadCell.deadCell();
          World.this.doAdd(it, _deadCell);
        }
      };
    IterableExtensions.<Position>forEach(_neighbours, _function);
  }
  
  protected void _addCell(final Position position, final DeadCell cell) {
    this.doAdd(position, cell);
  }
  
  private Cell doAdd(final Position position, final Cell cell) {
    Cell _put = this.cells.put(position, cell);
    return _put;
  }
  
  public void visit(final WorldVisitor visitor) {
    Set<Entry<Position,Cell>> _entrySet = this.cells.entrySet();
    final Procedure1<Entry<Position,Cell>> _function = new Procedure1<Entry<Position,Cell>>() {
        public void apply(final Entry<Position,Cell> it) {
          Cell _value = it.getValue();
          Position _key = it.getKey();
          visitor.visit(_value, _key);
        }
      };
    IterableExtensions.<Entry<Position,Cell>>forEach(_entrySet, _function);
  }
  
  public void addCell(final Position position, final Cell cell) {
    if (cell instanceof AliveCell) {
      _addCell(position, (AliveCell)cell);
      return;
    } else if (cell instanceof DeadCell) {
      _addCell(position, (DeadCell)cell);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(position, cell).toString());
    }
  }
}
