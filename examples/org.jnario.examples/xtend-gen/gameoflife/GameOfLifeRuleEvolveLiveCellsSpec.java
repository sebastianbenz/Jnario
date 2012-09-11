package gameoflife;

import gameoflife.EvolveLiveCells;
import gameoflife.GameOfLifeRuleEvolveLiveCellsSpecLiveCells;
import gameoflife.GameOfLifeRuleSpec;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("EvolveLiveCells")
public class GameOfLifeRuleEvolveLiveCellsSpec extends GameOfLifeRuleSpec {
  @Subject
  public EvolveLiveCells subject;
  
  @Before
  public void _initGameOfLifeRuleEvolveLiveCellsSpecLiveCells() {
    liveCells = ExampleTable.create("liveCells", 
      java.util.Arrays.asList("liveNeighbourCount", "result"), 
      new GameOfLifeRuleEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("1", "false"), 1, false),
      new GameOfLifeRuleEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("2", "true"), 2, true),
      new GameOfLifeRuleEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("3", "true"), 3, true),
      new GameOfLifeRuleEvolveLiveCellsSpecLiveCells(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<GameOfLifeRuleEvolveLiveCellsSpecLiveCells> liveCells;
  
  @Test
  @Named("liveCells.forEach[ subject.becomesAlive[liveNeighbourCount] => result ]")
  @Order(99)
  public void _liveCellsForEachSubjectBecomesAliveLiveNeighbourCountResult() throws Exception {
    final Procedure1<GameOfLifeRuleEvolveLiveCellsSpecLiveCells> _function = new Procedure1<GameOfLifeRuleEvolveLiveCellsSpecLiveCells>() {
        public void apply(final GameOfLifeRuleEvolveLiveCellsSpecLiveCells it) {
          boolean _becomesAlive = GameOfLifeRuleEvolveLiveCellsSpec.this.subject.becomesAlive(it.liveNeighbourCount);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.result));
          Assert.assertTrue("\nExpected subject.becomesAlive(liveNeighbourCount) => result but"
           + "\n     subject.becomesAlive(liveNeighbourCount) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(GameOfLifeRuleEvolveLiveCellsSpec.this.subject).toString()
           + "\n     liveNeighbourCount is " + new StringDescription().appendValue(it.liveNeighbourCount).toString()
           + "\n     result is " + new StringDescription().appendValue(Boolean.valueOf(it.result)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<GameOfLifeRuleEvolveLiveCellsSpecLiveCells>forEach(this.liveCells, _function);
  }
}
