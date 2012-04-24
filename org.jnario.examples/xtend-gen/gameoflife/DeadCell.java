package gameoflife;


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
