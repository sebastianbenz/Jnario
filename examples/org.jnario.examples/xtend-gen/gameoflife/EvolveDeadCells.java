package gameoflife;

import gameoflife.Rule;

@SuppressWarnings("all")
public class EvolveDeadCells implements Rule {
  public boolean becomesAlive(final int neighbourCount) {
    boolean _equals = (neighbourCount == 3);
    return _equals;
  }
}
