package gameoflife;

import de.bmw.carit.jnario.lib.MatcherChain;
import de.bmw.carit.jnario.lib.Should;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.InstantiateWith;
import de.bmw.carit.jnario.runner.Named;
import de.bmw.carit.jnario.runner.Order;
import de.bmw.carit.jnario.runner.Subject;
import gameoflife.AliveCell;
import gameoflife.Cell;
import gameoflife.Game;
import gameoflife.MockitoInstantiator;
import java.util.HashSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

@RunWith(ExampleGroupRunner.class)
@Named("Game")
@InstantiateWith(MockitoInstantiator.class)
public class GameSpec {
  @Subject
  public Game subject;
  
  @Mock
  protected Cell cell;
  
  @Test
  @Named("keeps all alive cells")
  @Order(1)
  public void keepsAllAliveCells() throws Exception {
      AliveCell _aliveCell = AliveCell.aliveCell();
      final AliveCell newCell = _aliveCell;
      Integer _any = Matchers.<Integer>any();
      Cell _evolve = this.cell.evolve((_any).intValue());
      OngoingStubbing<Cell> _when = Mockito.<Cell>when(_evolve);
      _when.thenReturn(newCell);
      HashSet<Cell> _newHashSet = CollectionLiterals.<Cell>newHashSet(this.cell);
      Iterable<Cell> _evolve_1 = this.subject.evolve(_newHashSet);
      MatcherChain<Iterable<Cell>> _should = Should.<Iterable<Cell>>should(_evolve_1);
      Should.<Cell>contain(_should, newCell);
  }
}
