package gameoflife;

import gameoflife.CellPosition;
import gameoflife.Evolution;
import gameoflife.GameOfLifeEvolutionSpec;
import gameoflife.Rule;
import gameoflife.World;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("live cells")
public class GameOfLifeEvolutionLiveCellsSpec extends GameOfLifeEvolutionSpec {
  final Rule allLiveStayAlive = new Function0<Rule>() {
    public Rule apply() {
      final Function1<Integer,Boolean> _function = new Function1<Integer,Boolean>() {
          public Boolean apply(final Integer it) {
            return true;
          }
        };
      return new Rule() {
          public boolean becomesAlive(int neighbourCount) {
            return _function.apply(neighbourCount);
          }
      };
    }
  }.apply();
  
  @Test
  @Named("become alive if rule says so")
  @Order(99)
  public void becomeAliveIfRuleSaysSo() throws Exception {
    Evolution _evolution = new Evolution(this.allLiveStayAlive, this.dontCare);
    final Evolution evolution = _evolution;
    World _evolve = evolution.evolve(this.worldWithLiveCell);
    Set<CellPosition> _livingCells = _evolve.getLivingCells();
    Set<CellPosition> _set = JnarioCollectionLiterals.<CellPosition>set(this.livingCell);
    boolean _doubleArrow = Should.operator_doubleArrow(_livingCells, _set);
    Assert.assertTrue("\nExpected evolution.evolve(worldWithLiveCell).livingCells => set(livingCell) but"
     + "\n     evolution.evolve(worldWithLiveCell).livingCells is " + new StringDescription().appendValue(_livingCells).toString()
     + "\n     evolution.evolve(worldWithLiveCell) is " + new StringDescription().appendValue(_evolve).toString()
     + "\n     evolution is " + new StringDescription().appendValue(evolution).toString()
     + "\n     worldWithLiveCell is " + new StringDescription().appendValue(this.worldWithLiveCell).toString()
     + "\n     set(livingCell) is " + new StringDescription().appendValue(_set).toString()
     + "\n     livingCell is " + new StringDescription().appendValue(this.livingCell).toString() + "\n", _doubleArrow);
    
  }
}
