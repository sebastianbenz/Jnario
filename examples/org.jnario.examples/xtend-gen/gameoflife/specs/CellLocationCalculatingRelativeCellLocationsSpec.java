package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.specs.CellLocationSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Calculating relative cell locations")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CellLocationCalculatingRelativeCellLocationsSpec extends CellLocationSpec {
  @Test
  @Named("cell[-1, 1].plus[cell[3,4]] => cell[2,5]")
  @Order(1)
  public void _cell11PlusCell34Cell25() throws Exception {
    int _minus = (-1);
    CellLocation _cell = CellLocation.cell(_minus, 1);
    CellLocation _cell_1 = CellLocation.cell(3, 4);
    CellLocation _plus = _cell.plus(_cell_1);
    CellLocation _cell_2 = CellLocation.cell(2, 5);
    boolean _doubleArrow = Should.<CellLocation>operator_doubleArrow(_plus, _cell_2);
    Assert.assertTrue("\nExpected cell(-1, 1).plus(cell(3,4)) => cell(2,5) but"
     + "\n     cell(-1, 1).plus(cell(3,4)) is " + new org.hamcrest.StringDescription().appendValue(_plus).toString()
     + "\n     cell(-1, 1) is " + new org.hamcrest.StringDescription().appendValue(_cell).toString()
     + "\n     -1 is " + new org.hamcrest.StringDescription().appendValue(_minus).toString()
     + "\n     cell(3,4) is " + new org.hamcrest.StringDescription().appendValue(_cell_1).toString()
     + "\n     cell(2,5) is " + new org.hamcrest.StringDescription().appendValue(_cell_2).toString() + "\n", _doubleArrow);
    
  }
}
