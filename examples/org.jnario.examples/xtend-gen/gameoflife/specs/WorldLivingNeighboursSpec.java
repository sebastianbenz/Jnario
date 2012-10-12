package gameoflife.specs;

import gameoflife.specs.WorldSpec;
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
@Named("living Neighbours")
public class WorldLivingNeighboursSpec extends WorldSpec {
  @Test
  @Named("returns number of live neighbours")
  @Order(3)
  public void _returnsNumberOfLiveNeighbours() throws Exception {
    int _livingNeighbours = this.worldWithTwoLiveNeighbours.livingNeighbours(this.liveCell);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_livingNeighbours), Integer.valueOf(1));
    Assert.assertTrue("\nExpected worldWithTwoLiveNeighbours.livingNeighbours(liveCell) => 1 but"
     + "\n     worldWithTwoLiveNeighbours.livingNeighbours(liveCell) is " + new StringDescription().appendValue(Integer.valueOf(_livingNeighbours)).toString()
     + "\n     worldWithTwoLiveNeighbours is " + new StringDescription().appendValue(this.worldWithTwoLiveNeighbours).toString()
     + "\n     liveCell is " + new StringDescription().appendValue(this.liveCell).toString() + "\n", _doubleArrow);
    
  }
}
