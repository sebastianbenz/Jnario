package gameoflife;

import gameoflife.AliveCell;
import gameoflife.Cell;
import gameoflife.CellSpecExamples;
import gameoflife.DeadCell;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Cell")
public class CellSpec {
  Class<?> alive = AliveCell.class;
  
  Class<?> dead = DeadCell.class;
  
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
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "3", "alive"), _aliveCell, 3, this.alive),
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "2", "alive"), _aliveCell_1, 2, this.alive),
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "4", "dead"), _aliveCell_2, 4, this.dead),
      new CellSpecExamples(  java.util.Arrays.asList("aliveCell", "1", "dead"), _aliveCell_3, 1, this.dead),
      new CellSpecExamples(  java.util.Arrays.asList("deadCell", "3", "alive"), _deadCell, 3, this.alive),
      new CellSpecExamples(  java.util.Arrays.asList("deadCell", "2", "dead"), _deadCell_1, 2, this.dead),
      new CellSpecExamples(  java.util.Arrays.asList("deadCell", "4", "dead"), _deadCell_2, 4, this.dead)
    );
  }
  
  protected ExampleTable<CellSpecExamples> examples;
  
  @Test
  @Named("changes its state based on the neighbor count")
  @Order(99)
  public void changesItsStateBasedOnTheNeighborCount() throws Exception {
    final Procedure1<CellSpecExamples> _function = new Procedure1<CellSpecExamples>() {
        public void apply(final CellSpecExamples it) {
          Cell _evolve = it.cell.evolve(it.neighborCount);
          boolean _doubleArrow = Should.operator_doubleArrow(_evolve, it.newState);Assert
          .assertTrue("\nExpected cell.evolve(neighborCount) => newState but"
           + "\n     cell.evolve(neighborCount) is " + _evolve
           + "\n     cell is " + it.cell
           + "\n     neighborCount is " + it.neighborCount
           + "\n     newState is " + it.newState + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<CellSpecExamples>forEach(this.examples, _function);
  }
}
