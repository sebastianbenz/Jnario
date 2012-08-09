package gameoflife;

import gameoflife.EvolveDeadCells;
import gameoflife.GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples;
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
@Named("EvolveDeadCells")
public class GameOfLifeGameOfLifeRulesEvolveDeadCellsSpec extends GameOfLifeGameOfLifeRulesSpec {
  @Subject
  public EvolveDeadCells subject;
  
  @Before
  public void _initGameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("livingNeighbours", "becomesAlive"), 
      new GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples(  java.util.Arrays.asList("2", "false"), 2, false),
      new GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples(  java.util.Arrays.asList("3", "true"), 3, true),
      new GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[ subject.becomesAlive[livingNeighbours] => becomesAlive ]")
  @Order(99)
  public void examplesForEachSubjectBecomesAliveLivingNeighboursBecomesAlive() throws Exception {
    final Procedure1<GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples> _function = new Procedure1<GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples>() {
        public void apply(final GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples it) {
          boolean _becomesAlive = GameOfLifeGameOfLifeRulesEvolveDeadCellsSpec.this.subject.becomesAlive(it.livingNeighbours);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.becomesAlive));
          Assert.assertTrue("\nExpected subject.becomesAlive(livingNeighbours) => becomesAlive but"
           + "\n     subject.becomesAlive(livingNeighbours) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(GameOfLifeGameOfLifeRulesEvolveDeadCellsSpec.this.subject).toString()
           + "\n     livingNeighbours is " + new StringDescription().appendValue(it.livingNeighbours).toString()
           + "\n     becomesAlive is " + new StringDescription().appendValue(Boolean.valueOf(it.becomesAlive)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<GameOfLifeGameOfLifeRulesEvolveDeadCellsSpecExamples>forEach(this.examples, _function);
  }
}
