package gameoflife;

import gameoflife.EvolveLivingCells;
import gameoflife.GameOfLifeRulesEvolveLivingCellsSpecExamples;
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
  public void _initGameOfLifeRulesEvolveLivingCellsSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("livingNeighbours", "becomesAlive"), 
      new GameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("1", "false"), 1, false),
      new GameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("2", "true"), 2, true),
      new GameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("3", "true"), 3, true),
      new GameOfLifeRulesEvolveLivingCellsSpecExamples(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<GameOfLifeRulesEvolveLivingCellsSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[ subject.becomesAlive[livingNeighbours] => becomesAlive ]")
  @Order(99)
  public void examplesForEachSubjectBecomesAliveLivingNeighboursBecomesAlive() throws Exception {
    final Procedure1<GameOfLifeRulesEvolveLivingCellsSpecExamples> _function = new Procedure1<GameOfLifeRulesEvolveLivingCellsSpecExamples>() {
        public void apply(final GameOfLifeRulesEvolveLivingCellsSpecExamples it) {
          boolean _becomesAlive = GameOfLifeRulesEvolveLivingCellsSpec.this.subject.becomesAlive(it.livingNeighbours);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.becomesAlive));
          Assert.assertTrue("\nExpected subject.becomesAlive(livingNeighbours) => becomesAlive but"
           + "\n     subject.becomesAlive(livingNeighbours) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(GameOfLifeRulesEvolveLivingCellsSpec.this.subject).toString()
           + "\n     livingNeighbours is " + new StringDescription().appendValue(it.livingNeighbours).toString()
           + "\n     becomesAlive is " + new StringDescription().appendValue(Boolean.valueOf(it.becomesAlive)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<GameOfLifeRulesEvolveLivingCellsSpecExamples>forEach(this.examples, _function);
  }
}
