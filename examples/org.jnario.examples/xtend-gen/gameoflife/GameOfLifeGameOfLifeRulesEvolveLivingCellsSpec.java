package gameoflife;

import gameoflife.EvolveLivingCells;
import gameoflife.GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples;
import gameoflife.GameOfLifeGameOfLifeRulesSpec;
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
public class GameOfLifeGameOfLifeRulesEvolveLivingCellsSpec extends GameOfLifeGameOfLifeRulesSpec {
  @Subject
  public EvolveLivingCells subject;
  
  @Before
  public void _initGameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("livingNeighbours", "becomesAlive"), 
      new GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("1", "false"), 1, false),
      new GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("2", "true"), 2, true),
      new GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("3", "true"), 3, true),
      new GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[ subject.becomesAlive[livingNeighbours] => becomesAlive ]")
  @Order(99)
  public void examplesForEachSubjectBecomesAliveLivingNeighboursBecomesAlive() throws Exception {
    final Procedure1<GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples> _function = new Procedure1<GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples>() {
        public void apply(final GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples it) {
          boolean _becomesAlive = GameOfLifeGameOfLifeRulesEvolveLivingCellsSpec.this.subject.becomesAlive(it.livingNeighbours);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.becomesAlive));
          Assert.assertTrue("\nExpected subject.becomesAlive(livingNeighbours) => becomesAlive but"
           + "\n     subject.becomesAlive(livingNeighbours) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(GameOfLifeGameOfLifeRulesEvolveLivingCellsSpec.this.subject).toString()
           + "\n     livingNeighbours is " + new StringDescription().appendValue(it.livingNeighbours).toString()
           + "\n     becomesAlive is " + new StringDescription().appendValue(Boolean.valueOf(it.becomesAlive)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples>forEach(this.examples, _function);
  }
}
