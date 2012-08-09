package gameoflife;

import gameoflife.CellPosition;
import gameoflife.GameOfLifeCellPositionSpec;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("neighbours")
public class GameOfLifeCellPositionNeighboursSpec extends GameOfLifeCellPositionSpec {
  @Test
  @Named("are adjacent cells")
  @Order(99)
  public void areAdjacentCells() throws Exception {
    final CellPosition cell = CellPosition.cell(0, 0);
    final HashSet<CellPosition> neighbours = CellPosition.NEIGHBOUR_OFFSETS;
    final Procedure1<CellPosition> _function = new Procedure1<CellPosition>() {
        public void apply(final CellPosition it) {
          Set<CellPosition> _neighbours = cell.neighbours();
          boolean _should_contain = Should.<CellPosition>should_contain(_neighbours, it);
          Assert.assertTrue("\nExpected cell.neighbours() should contain it but"
           + "\n     cell.neighbours() is " + new StringDescription().appendValue(_neighbours).toString()
           + "\n     cell is " + new StringDescription().appendValue(cell).toString()
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_contain);
          
        }
      };
    IterableExtensions.<CellPosition>forEach(neighbours, _function);
  }
}
