package gameoflife;

import de.bmw.carit.jnario.lib.MatcherChain;
import de.bmw.carit.jnario.lib.Should;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Named;
import de.bmw.carit.jnario.runner.Order;
import gameoflife.Cell;
import gameoflife.CellSpec;
import gameoflife.DeadCell;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("DeadCell")
public class CellDeadCellSpec extends CellSpec {
  @Before
  public void before() throws Exception {
    DeadCell _deadCell = DeadCell.deadCell();
    this.subject = _deadCell;
  }
  
  @Test
  @Named("becomes alive if it has three living neighbours")
  @Order(1)
  public void becomesAliveIfItHasThreeLivingNeighbours() throws Exception {
    Cell _evolveWithNeighbours = this.evolveWithNeighbours(3);
    MatcherChain<Cell> _should = Should.<Cell>should(_evolveWithNeighbours);
    Should.<Cell>be(_should, gameoflife.AliveCell.class);
  }
  
  @Test
  @Named("stays dead with less than three neighbours")
  @Order(2)
  public void staysDeadWithLessThanThreeNeighbours() throws Exception {
    Cell _evolveWithNeighbours = this.evolveWithNeighbours(2);
    MatcherChain<Cell> _should = Should.<Cell>should(_evolveWithNeighbours);
    Should.<Cell>be(_should, gameoflife.DeadCell.class);
  }
  
  @Test
  @Named("stays dead with more than three neighbours")
  @Order(3)
  public void staysDeadWithMoreThanThreeNeighbours() throws Exception {
    Cell _evolveWithNeighbours = this.evolveWithNeighbours(4);
    MatcherChain<Cell> _should = Should.<Cell>should(_evolveWithNeighbours);
    Should.<Cell>be(_should, gameoflife.DeadCell.class);
  }
}
