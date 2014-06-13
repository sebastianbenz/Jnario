package gameoflife;

import com.google.common.collect.Iterables;
import gameoflife.CellLocation;
import gameoflife.EvolveDeadCells;
import gameoflife.EvolveLiveCells;
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
    EvolveLiveCells _evolveLiveCells = new EvolveLiveCells();
    EvolveDeadCells _evolveDeadCells = new EvolveDeadCells();
    return new Evolution(_evolveLiveCells, _evolveDeadCells);
  }
  
  private final Rule _staysAlive;
  
  public Rule getStaysAlive() {
    return this._staysAlive;
  }
  
  private final Rule _becomesAlive;
  
  public Rule getBecomesAlive() {
    return this._becomesAlive;
  }
  
  public World evolve(final World world) {
    Set<CellLocation> _livingCells = world.getLivingCells();
    final Function1<CellLocation, Boolean> _function = new Function1<CellLocation, Boolean>() {
      public Boolean apply(final CellLocation it) {
        Rule _staysAlive = Evolution.this.getStaysAlive();
        return Boolean.valueOf(Evolution.this.apply(_staysAlive, world, it));
      }
    };
    Iterable<CellLocation> _filter = IterableExtensions.<CellLocation>filter(_livingCells, _function);
    Set<CellLocation> _deadCells = world.deadCells();
    final Function1<CellLocation, Boolean> _function_1 = new Function1<CellLocation, Boolean>() {
      public Boolean apply(final CellLocation it) {
        Rule _becomesAlive = Evolution.this.getBecomesAlive();
        return Boolean.valueOf(Evolution.this.apply(_becomesAlive, world, it));
      }
    };
    Iterable<CellLocation> _filter_1 = IterableExtensions.<CellLocation>filter(_deadCells, _function_1);
    Iterable<CellLocation> _plus = Iterables.<CellLocation>concat(_filter, _filter_1);
    return World.worldWith(_plus);
  }
  
  private boolean apply(final Rule rule, final World world, final CellLocation cell) {
    int _livingNeighbours = world.livingNeighbours(cell);
    return rule.becomesAlive(_livingNeighbours);
  }
  
  public Evolution(final Rule staysAlive, final Rule becomesAlive) {
    super();
    this._staysAlive = staysAlive;
    this._becomesAlive = becomesAlive;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._staysAlive== null) ? 0 : this._staysAlive.hashCode());
    result = prime * result + ((this._becomesAlive== null) ? 0 : this._becomesAlive.hashCode());
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
    if (this._staysAlive == null) {
      if (other._staysAlive != null)
        return false;
    } else if (!this._staysAlive.equals(other._staysAlive))
      return false;
    if (this._becomesAlive == null) {
      if (other._becomesAlive != null)
        return false;
    } else if (!this._becomesAlive.equals(other._becomesAlive))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
