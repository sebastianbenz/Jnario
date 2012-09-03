package gameoflife;

import gameoflife.EvolveLivingCells;
import gameoflife.GameOfLifeRulesEvolveLivingCellsSpecLivingCells;
import gameoflife.GameOfLifeRulesSpec;
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
@Named("EvolveLivingCells")
public class GameOfLifeRulesEvolveLivingCellsSpec extends GameOfLifeRulesSpec {
  @Subject
  public EvolveLivingCells subject;
  
  @Before
  public void _initGameOfLifeRulesEvolveLivingCellsSpecLivingCells() {
    livingCells = ExampleTable.create("livingCells", 
      java.util.Arrays.asList("livingNeighbours", "becomesAlive"), 
      new GameOfLifeRulesEvolveLivingCellsSpecLivingCells(  java.util.Arrays.asList("1", "false"), 1, false),
      new GameOfLifeRulesEvolveLivingCellsSpecLivingCells(  java.util.Arrays.asList("2", "true"), 2, true),
      new GameOfLifeRulesEvolveLivingCellsSpecLivingCells(  java.util.Arrays.asList("3", "true"), 3, true),
      new GameOfLifeRulesEvolveLivingCellsSpecLivingCells(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<GameOfLifeRulesEvolveLivingCellsSpecLivingCells> livingCells;
  
  @Test
  @Named("livingCells.forEach[ subject.becomesAlive[livingNeighbours] => becomesAlive ]")
  @Order(99)
  public void livingCellsForEachSubjectBecomesAliveLivingNeighboursBecomesAlive() throws Exception {
    final Procedure1<GameOfLifeRulesEvolveLivingCellsSpecLivingCells> _function = new Procedure1<GameOfLifeRulesEvolveLivingCellsSpecLivingCells>() {
        public void apply(final GameOfLifeRulesEvolveLivingCellsSpecLivingCells it) {
          boolean _becomesAlive = GameOfLifeRulesEvolveLivingCellsSpec.this.subject.becomesAlive(it.livingNeighbours);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.becomesAlive));
          Assert.assertTrue("\nExpected subject.becomesAlive(livingNeighbours) => becomesAlive but"
           + "\n     subject.becomesAlive(livingNeighbours) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(GameOfLifeRulesEvolveLivingCellsSpec.this.subject).toString()
           + "\n     livingNeighbours is " + new StringDescription().appendValue(it.livingNeighbours).toString()
           + "\n     becomesAlive is " + new StringDescription().appendValue(Boolean.valueOf(it.becomesAlive)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<GameOfLifeRulesEvolveLivingCellsSpecLivingCells>forEach(this.livingCells, _function);
  }
}
