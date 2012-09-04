package gameoflife;

import gameoflife.CellPosition;
import gameoflife.GameOfLifeCellPositionSpec;
import java.util.Set;
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
@Named("neighbours")
public class GameOfLifeCellPositionNeighboursSpec extends GameOfLifeCellPositionSpec {
  @Test
  @Named("are adjacent cells")
  @Order(99)
  public void _areAdjacentCells() throws Exception {
    final CellPosition cell = CellPosition.cell(5, 5);
    CellPosition _cell = CellPosition.cell(4, 6);
    CellPosition _cell_1 = CellPosition.cell(5, 6);
    CellPosition _cell_2 = CellPosition.cell(6, 6);
    CellPosition _cell_3 = CellPosition.cell(4, 5);
    CellPosition _cell_4 = CellPosition.cell(6, 5);
    CellPosition _cell_5 = CellPosition.cell(4, 4);
    CellPosition _cell_6 = CellPosition.cell(5, 4);
    CellPosition _cell_7 = CellPosition.cell(6, 4);
    final Set<CellPosition> expectedNeighbours = JnarioCollectionLiterals.<CellPosition>set(_cell, _cell_1, _cell_2, _cell_3, _cell_4, _cell_5, _cell_6, _cell_7);
    Set<CellPosition> _neighbours = cell.neighbours();
    boolean _doubleArrow = Should.operator_doubleArrow(_neighbours, expectedNeighbours);
    Assert.assertTrue("\nExpected cell.neighbours => expectedNeighbours but"
     + "\n     cell.neighbours is " + new StringDescription().appendValue(_neighbours).toString()
     + "\n     cell is " + new StringDescription().appendValue(cell).toString()
     + "\n     expectedNeighbours is " + new StringDescription().appendValue(expectedNeighbours).toString() + "\n", _doubleArrow);
    
  }
}
