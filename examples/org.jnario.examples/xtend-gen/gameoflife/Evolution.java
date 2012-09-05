package gameoflife;

import com.google.common.collect.Iterables;
import gameoflife.CellLocation;
import gameoflife.EvolveDeadCells;
import gameoflife.EvolveLivingCells;
import gameoflife.Rule;
import gameoflife.World;
import java.util.Set;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Evolution {
  public static Evolution gameOfLife() {
    EvolveLivingCells _evolveLivingCells = new EvolveLivingCells();
    EvolveDeadCells _evolveDeadCells = new EvolveDeadCells();
    Evolution _evolution = new Evolution(_evolveLivingCells, _evolveDeadCells);
    return _evolution;
  }
  
  private final Rule _livingCellRule;
  
  public Rule getLivingCellRule() {
    return this._livingCellRule;
  }
  
  private final Rule _deadCellRule;
  
  public Rule getDeadCellRule() {
    return this._deadCellRule;
  }
  
  public World evolve(final World world) {
    Set<CellLocation> _livingCells = world.getLivingCells();
    final Function1<CellLocation,Boolean> _function = new Function1<CellLocation,Boolean>() {
        public Boolean apply(final CellLocation it) {
          Rule _livingCellRule = Evolution.this.getLivingCellRule();
          boolean _apply = Evolution.this.apply(_livingCellRule, world, it);
          return Boolean.valueOf(_apply);
        }
      };
    Iterable<CellLocation> _filter = IterableExtensions.<CellLocation>filter(_livingCells, _function);
    Set<CellLocation> _deadCells = world.deadCells();
    final Function1<CellLocation,Boolean> _function_1 = new Function1<CellLocation,Boolean>() {
        public Boolean apply(final CellLocation it) {
          Rule _deadCellRule = Evolution.this.getDeadCellRule();
          boolean _apply = Evolution.this.apply(_deadCellRule, world, it);
          return Boolean.valueOf(_apply);
        }
      };
    Iterable<CellLocation> _filter_1 = IterableExtensions.<CellLocation>filter(_deadCells, _function_1);
    Iterable<CellLocation> _plus = Iterables.<CellLocation>concat(_filter, _filter_1);
    World _worldWith = World.worldWith(_plus);
    return _worldWith;
  }
  
  private boolean apply(final Rule rule, final World world, final CellLocation cell) {
    int _livingNeighbours = world.livingNeighbours(cell);
    boolean _becomesAlive = rule.becomesAlive(_livingNeighbours);
    return _becomesAlive;
  }
  
  public Evolution(final Rule livingCellRule, final Rule deadCellRule) {
    super();
    this._livingCellRule = livingCellRule;
    this._deadCellRule = deadCellRule;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_livingCellRule== null) ? 0 : _livingCellRule.hashCode());
    result = prime * result + ((_deadCellRule== null) ? 0 : _deadCellRule.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Evolution other = (Evolution) obj;
    if (_livingCellRule == null) {
      if (other._livingCellRule != null)
        return false;
    } else if (!_livingCellRule.equals(other._livingCellRule))
      return false;
    if (_deadCellRule == null) {
      if (other._deadCellRule != null)
        return false;
    } else if (!_deadCellRule.equals(other._deadCellRule))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
