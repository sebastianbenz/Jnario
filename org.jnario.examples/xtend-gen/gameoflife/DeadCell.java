package gameoflife;

import gameoflife.AliveCell;
import gameoflife.Cell;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;

@SuppressWarnings("all")
public class DeadCell extends Cell {
  public static DeadCell deadCell() {
    DeadCell _deadCell = new DeadCell();
    return _deadCell;
  }
  
  public Cell evolve(final int neighbourCount) {
    boolean _equals = IntegerExtensions.operator_equals(neighbourCount, 3);
    if (_equals) {
      AliveCell _aliveCell = AliveCell.aliveCell();
      return _aliveCell;
    }
    DeadCell _deadCell = DeadCell.deadCell();
    return _deadCell;
  }
}
