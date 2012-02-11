package gameoflife;

import de.bmw.carit.jnario.lib.MatcherChain;
import de.bmw.carit.jnario.lib.Should;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Named;
import de.bmw.carit.jnario.runner.Order;
import gameoflife.AliveCell;
import gameoflife.Cell;
import gameoflife.CellSpec;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("AliveCell")
public class CellAliveCellSpec extends CellSpec {
  @Before
  public void before() throws Exception {
    AliveCell _aliveCell = AliveCell.aliveCell();
    this.subject = _aliveCell;
  }
  
  @Test
  @Named("stays alive if it has three living neighbours")
  @Order(1)
  public void staysAliveIfItHasThreeLivingNeighbours() throws Exception {
    Cell _evolveWithNeighbours = this.evolveWithNeighbours(3);
    MatcherChain<Cell> _should = Should.<Cell>should(_evolveWithNeighbours);
    Should.<Cell>be(_should, gameoflife.AliveCell.class);
  }
  
  @Test
  @Named("stays alive with two living neighbours")
  @Order(2)
  public void staysAliveWithTwoLivingNeighbours() throws Exception {
    Cell _evolveWithNeighbours = this.evolveWithNeighbours(2);
    MatcherChain<Cell> _should = Should.<Cell>should(_evolveWithNeighbours);
    Should.<Cell>be(_should, gameoflife.AliveCell.class);
  }
  
  @Test
  @Named("dies with more than three neighbours")
  @Order(3)
  public void diesWithMoreThanThreeNeighbours() throws Exception {
    Cell _evolveWithNeighbours = this.evolveWithNeighbours(4);
    MatcherChain<Cell> _should = Should.<Cell>should(_evolveWithNeighbours);
    Should.<Cell>be(_should, gameoflife.DeadCell.class);
  }
  
  @Test
  @Named("dies with less than two neighbours")
  @Order(4)
  public void diesWithLessThanTwoNeighbours() throws Exception {
    Cell _evolveWithNeighbours = this.evolveWithNeighbours(1);
    MatcherChain<Cell> _should = Should.<Cell>should(_evolveWithNeighbours);
    Should.<Cell>be(_should, gameoflife.DeadCell.class);
  }
}
