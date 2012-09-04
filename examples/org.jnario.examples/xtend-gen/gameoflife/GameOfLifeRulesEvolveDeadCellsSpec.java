package gameoflife;

import gameoflife.EvolveDeadCells;
import gameoflife.GameOfLifeRulesEvolveDeadCellsSpecDeadcells;
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
@Named("EvolveDeadCells")
public class GameOfLifeRulesEvolveDeadCellsSpec extends GameOfLifeRulesSpec {
  @Subject
  public EvolveDeadCells subject;
  
  @Before
  public void _initGameOfLifeRulesEvolveDeadCellsSpecDeadcells() {
    deadcells = ExampleTable.create("deadcells", 
      java.util.Arrays.asList("livingNeighbours", "becomesAlive"), 
      new GameOfLifeRulesEvolveDeadCellsSpecDeadcells(  java.util.Arrays.asList("2", "false"), 2, false),
      new GameOfLifeRulesEvolveDeadCellsSpecDeadcells(  java.util.Arrays.asList("3", "true"), 3, true),
      new GameOfLifeRulesEvolveDeadCellsSpecDeadcells(  java.util.Arrays.asList("4", "false"), 4, false)
    );
  }
  
  protected ExampleTable<GameOfLifeRulesEvolveDeadCellsSpecDeadcells> deadcells;
  
  @Test
  @Named("deadcells.forEach[ subject.becomesAlive[livingNeighbours] => becomesAlive ]")
  @Order(99)
  public void _deadcellsForEachSubjectBecomesAliveLivingNeighboursBecomesAlive() throws Exception {
    final Procedure1<GameOfLifeRulesEvolveDeadCellsSpecDeadcells> _function = new Procedure1<GameOfLifeRulesEvolveDeadCellsSpecDeadcells>() {
        public void apply(final GameOfLifeRulesEvolveDeadCellsSpecDeadcells it) {
          boolean _becomesAlive = GameOfLifeRulesEvolveDeadCellsSpec.this.subject.becomesAlive(it.livingNeighbours);
          boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_becomesAlive), Boolean.valueOf(it.becomesAlive));
          Assert.assertTrue("\nExpected subject.becomesAlive(livingNeighbours) => becomesAlive but"
           + "\n     subject.becomesAlive(livingNeighbours) is " + new StringDescription().appendValue(Boolean.valueOf(_becomesAlive)).toString()
           + "\n     subject is " + new StringDescription().appendValue(GameOfLifeRulesEvolveDeadCellsSpec.this.subject).toString()
           + "\n     livingNeighbours is " + new StringDescription().appendValue(it.livingNeighbours).toString()
           + "\n     becomesAlive is " + new StringDescription().appendValue(Boolean.valueOf(it.becomesAlive)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<GameOfLifeRulesEvolveDeadCellsSpecDeadcells>forEach(this.deadcells, _function);
  }
}
