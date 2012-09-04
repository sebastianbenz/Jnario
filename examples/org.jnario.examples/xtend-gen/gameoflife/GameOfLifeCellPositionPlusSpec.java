package gameoflife;

import gameoflife.CellPosition;
import gameoflife.GameOfLifeCellPositionSpec;
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
@Named("plus")
public class GameOfLifeCellPositionPlusSpec extends GameOfLifeCellPositionSpec {
  @Test
  @Named("cell[-1, 1].plus[cell[3,4]] => cell[2,5]")
  @Order(99)
  public void _cell11PlusCell34Cell25() throws Exception {
    int _minus = (-1);
    CellPosition _cell = CellPosition.cell(_minus, 1);
    CellPosition _cell_1 = CellPosition.cell(3, 4);
    CellPosition _plus = _cell.plus(_cell_1);
    CellPosition _cell_2 = CellPosition.cell(2, 5);
    boolean _doubleArrow = Should.operator_doubleArrow(_plus, _cell_2);
    Assert.assertTrue("\nExpected cell(-1, 1).plus(cell(3,4)) => cell(2,5) but"
     + "\n     cell(-1, 1).plus(cell(3,4)) is " + new StringDescription().appendValue(_plus).toString()
     + "\n     cell(-1, 1) is " + new StringDescription().appendValue(_cell).toString()
     + "\n     -1 is " + new StringDescription().appendValue(_minus).toString()
     + "\n     cell(3,4) is " + new StringDescription().appendValue(_cell_1).toString()
     + "\n     cell(2,5) is " + new StringDescription().appendValue(_cell_2).toString() + "\n", _doubleArrow);
    
  }
}
