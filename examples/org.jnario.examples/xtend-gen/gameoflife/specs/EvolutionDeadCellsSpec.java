package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.Evolution;
import gameoflife.Rule;
import gameoflife.World;
import gameoflife.specs.EvolutionSpec;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("dead cells")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EvolutionDeadCellsSpec extends EvolutionSpec {
  final Rule allDeadLive = new Function0<Rule>() {
    public Rule apply() {
      final Rule _function = new Rule() {
          public boolean becomesAlive(final int it) {
            return true;
          }
        };
      return _function;
    }
  }.apply();
  
  @Test
  @Named("become alive if rule says so")
  @Order(1)
  public void _becomeAliveIfRuleSaysSo() throws Exception {
    Evolution _evolution = new Evolution(this.dontCare, this.allDeadLive);
    final Evolution evolution = _evolution;
    World _evolve = evolution.evolve(this.worldWithLiveCell);
    Set<CellLocation> _livingCells = _evolve.getLivingCells();
    Set<CellLocation> _neighbours = this.livingCell.neighbours();
    boolean _doubleArrow = Should.<Set<CellLocation>>operator_doubleArrow(_livingCells, _neighbours);
    Assert.assertTrue("\nExpected evolution.evolve(worldWithLiveCell).livingCells => livingCell.neighbours but"
     + "\n     evolution.evolve(worldWithLiveCell).livingCells is " + new org.hamcrest.StringDescription().appendValue(_livingCells).toString()
     + "\n     evolution.evolve(worldWithLiveCell) is " + new org.hamcrest.StringDescription().appendValue(_evolve).toString()
     + "\n     evolution is " + new org.hamcrest.StringDescription().appendValue(evolution).toString()
     + "\n     worldWithLiveCell is " + new org.hamcrest.StringDescription().appendValue(this.worldWithLiveCell).toString()
     + "\n     livingCell.neighbours is " + new org.hamcrest.StringDescription().appendValue(_neighbours).toString()
     + "\n     livingCell is " + new org.hamcrest.StringDescription().appendValue(this.livingCell).toString() + "\n", _doubleArrow);
    
  }
}
