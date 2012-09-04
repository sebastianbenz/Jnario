package gameoflife;

import gameoflife.GameOfLifeWorldSpec;
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
@Named("livingNeighbours")
public class GameOfLifeWorldLivingNeighboursSpec extends GameOfLifeWorldSpec {
  @Test
  @Named("returns number of live neighbours")
  @Order(99)
  public void _returnsNumberOfLiveNeighbours() throws Exception {
    int _livingNeighbours = this.worldWithTwoLiveNeighbours.livingNeighbours(this.livingCell);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_livingNeighbours), Integer.valueOf(1));
    Assert.assertTrue("\nExpected worldWithTwoLiveNeighbours.livingNeighbours(livingCell) => 1 but"
     + "\n     worldWithTwoLiveNeighbours.livingNeighbours(livingCell) is " + new StringDescription().appendValue(Integer.valueOf(_livingNeighbours)).toString()
     + "\n     worldWithTwoLiveNeighbours is " + new StringDescription().appendValue(this.worldWithTwoLiveNeighbours).toString()
     + "\n     livingCell is " + new StringDescription().appendValue(this.livingCell).toString() + "\n", _doubleArrow);
    
  }
}
