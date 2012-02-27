package gameoflife;

import gameoflife.AliveCell;
import gameoflife.Cell;
import gameoflife.CellSpecExamples;
import gameoflife.DeadCell;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.MatcherChain;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Cell")
public class CellSpec {
  @Before
  public void _initCellSpecExamples() {
    
    AliveCell _aliveCell = AliveCell.aliveCell();
    AliveCell _aliveCell_1 = AliveCell.aliveCell();
    AliveCell _aliveCell_2 = AliveCell.aliveCell();
    AliveCell _aliveCell_3 = AliveCell.aliveCell();
    DeadCell _deadCell = DeadCell.deadCell();
    DeadCell _deadCell_1 = DeadCell.deadCell();
    DeadCell _deadCell_2 = DeadCell.deadCell();examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("cell", "neighborCount", "newState"), 
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "3", "typeof(AliveCell)"), _aliveCell, 3, gameoflife.AliveCell.class),
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "2", "typeof(AliveCell)"), _aliveCell_1, 2, gameoflife.AliveCell.class),
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "4", "typeof(DeadCell)"), _aliveCell_2, 4, gameoflife.DeadCell.class),
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "1", "typeof(DeadCell)"), _aliveCell_3, 1, gameoflife.DeadCell.class),
      new CellSpecExamples(  java.util.Arrays.asList("deadCell", "3", "typeof(AliveCell)"), _deadCell, 3, gameoflife.AliveCell.class),
      new CellSpecExamples(  java.util.Arrays.asList("deadCell", "2", "typeof(DeadCell)"), _deadCell_1, 2, gameoflife.DeadCell.class),
      new CellSpecExamples(  java.util.Arrays.asList("deadCell", "4", "typeof(DeadCell)"), _deadCell_2, 4, gameoflife.DeadCell.class)
    );
  }
  
  private ExampleTable<CellSpecExamples> examples;
  
  @Test
  @Named("changes its state based on the neighbor count")
  @Order(1)
  public void changesItsStateBasedOnTheNeighborCount() throws Exception {
    final Procedure1<CellSpecExamples> _function = new Procedure1<CellSpecExamples>() {
        public void apply(final CellSpecExamples it) {
          Cell _evolve = it.cell.evolve(it.neighborCount);
          MatcherChain<Cell> _should = Should.<Cell>should(_evolve);
          Should.<Cell>be(_should, it.newState);
        }
      };
    ExampleTableIterators.<CellSpecExamples>forEach(this.examples, _function);
  }
}
