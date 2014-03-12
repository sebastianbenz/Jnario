package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.Evolution;
import gameoflife.Rule;
import gameoflife.World;
import gameoflife.specs.EvolutionSpec;
import java.util.Set;
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
  final Rule allDeadLive = new Rule() {
    public boolean becomesAlive(final int it) {
      return true;
    }
  };
  
  @Test
  @Named("become alive if rule says so")
  @Order(1)
  public void _becomeAliveIfRuleSaysSo() throws Exception {
    final Evolution evolution = new Evolution(this.dontCare, this.allDeadLive);
    World _evolve = evolution.evolve(this.worldWithLiveCell);
    Set<CellLocation> _livingCells = _evolve.getLivingCells();
    Set<CellLocation> _neighbours = this.livingCell.neighbours();
    Assert.assertTrue("\nExpected evolution.evolve(worldWithLiveCell).livingCells => livingCell.neighbours but"
     + "\n     evolution.evolve(worldWithLiveCell).livingCells is " + new org.hamcrest.StringDescription().appendValue(_livingCells).toString()
     + "\n     evolution.evolve(worldWithLiveCell) is " + new org.hamcrest.StringDescription().appendValue(_evolve).toString()
     + "\n     evolution is " + new org.hamcrest.StringDescription().appendValue(evolution).toString()
     + "\n     worldWithLiveCell is " + new org.hamcrest.StringDescription().appendValue(this.worldWithLiveCell).toString()
     + "\n     livingCell.neighbours is " + new org.hamcrest.StringDescription().appendValue(_neighbours).toString()
     + "\n     livingCell is " + new org.hamcrest.StringDescription().appendValue(this.livingCell).toString() + "\n", Should.<Set<CellLocation>>operator_doubleArrow(_livingCells, _neighbours));
    
  }
}
