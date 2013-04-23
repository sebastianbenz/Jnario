package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.specs.CellLocationSpec;
import java.util.Set;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("cell neighbours")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CellLocationCellNeighboursSpec extends CellLocationSpec {
  @Test
  @Named("are adjacent cells")
  @Order(1)
  public void _areAdjacentCells() throws Exception {
    final CellLocation cell = CellLocation.cell(5, 5);
    CellLocation _cell = CellLocation.cell(4, 6);
    CellLocation _cell_1 = CellLocation.cell(5, 6);
    CellLocation _cell_2 = CellLocation.cell(6, 6);
    CellLocation _cell_3 = CellLocation.cell(4, 5);
    CellLocation _cell_4 = CellLocation.cell(6, 5);
    CellLocation _cell_5 = CellLocation.cell(4, 4);
    CellLocation _cell_6 = CellLocation.cell(5, 4);
    CellLocation _cell_7 = CellLocation.cell(6, 4);
    final Set<CellLocation> expectedNeighbours = JnarioCollectionLiterals.<CellLocation>set(_cell, _cell_1, _cell_2, _cell_3, _cell_4, _cell_5, _cell_6, _cell_7);
    Set<CellLocation> _neighbours = cell.neighbours();
    boolean _doubleArrow = Should.operator_doubleArrow(_neighbours, expectedNeighbours);
    Assert.assertTrue("\nExpected cell.neighbours => expectedNeighbours but"
     + "\n     cell.neighbours is " + new StringDescription().appendValue(_neighbours).toString()
     + "\n     cell is " + new StringDescription().appendValue(cell).toString()
     + "\n     expectedNeighbours is " + new StringDescription().appendValue(expectedNeighbours).toString() + "\n", _doubleArrow);
    
  }
}
