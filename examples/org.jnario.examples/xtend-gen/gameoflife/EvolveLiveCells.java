package gameoflife;

import gameoflife.Rule;

@SuppressWarnings("all")
public class EvolveLiveCells implements Rule {
  public boolean becomesAlive(final int neighbourCount) {
    boolean _and = false;
    boolean _underPopulated = this.underPopulated(neighbourCount);
    boolean _not = (!_underPopulated);
    if (!_not) {
      _and = false;
    } else {
      boolean _overPopulated = this.overPopulated(neighbourCount);
      boolean _not_1 = (!_overPopulated);
      _and = (_not && _not_1);
    }
    return _and;
  }
  
  public boolean underPopulated(final int neighbourCount) {
    return (neighbourCount < 2);
  }
  
  public boolean overPopulated(final int neighbourCount) {
    return (neighbourCount > 3);
  }
}
