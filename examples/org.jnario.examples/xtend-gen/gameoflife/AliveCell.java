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
