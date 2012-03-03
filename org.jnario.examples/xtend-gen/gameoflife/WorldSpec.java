package gameoflife;

import com.google.common.base.Objects;
import gameoflife.AliveCell;
import gameoflife.Cell;
import gameoflife.DeadCell;
import gameoflife.MockitoInstantiator;
import gameoflife.Position;
import gameoflife.World;
import gameoflife.WorldVisitor;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.Matcher;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

@RunWith(ExampleGroupRunner.class)
@Named("World")
@InstantiateWith(MockitoInstantiator.class)
public class WorldSpec {
  @Subject
  public World subject;
  
  @Mock
  protected WorldVisitor worldVisitor;
  
  protected AliveCell anAliveCell = new Function0<AliveCell>() {
    public AliveCell apply() {
      AliveCell _aliveCell = AliveCell.aliveCell();
      return _aliveCell;
    }
  }.apply();
  
  protected AliveCell anotherAliveCell = new Function0<AliveCell>() {
    public AliveCell apply() {
      AliveCell _aliveCell = AliveCell.aliveCell();
      return _aliveCell;
    }
  }.apply();
  
  protected DeadCell aDeadCell = new Function0<DeadCell>() {
    public DeadCell apply() {
      DeadCell _deadCell = DeadCell.deadCell();
      return _deadCell;
    }
  }.apply();
  
  @Test
  @Named("has initially no living cells")
  @Order(4)
  public void hasInitiallyNoLivingCells() throws Exception {
    this.subject.visit(this.worldVisitor);
    VerificationMode _never = Mockito.never();
    WorldVisitor _verify = Mockito.<WorldVisitor>verify(this.worldVisitor, _never);
    Cell _any = Matchers.<Cell>any();
    Position _any_1 = Matchers.<Position>any();
    _verify.visit(_any, _any_1);
  }
  
  @Test
  @Named("visits any dead cell")
  @Order(5)
  public void visitsAnyDeadCell() throws Exception {
    Position _pos = Position.pos(0, 0);
    this.subject.addCell(_pos, this.aDeadCell);
    this.subject.visit(this.worldVisitor);
    VerificationMode _atLeastOnce = Mockito.atLeastOnce();
    WorldVisitor _verify = Mockito.<WorldVisitor>verify(this.worldVisitor, _atLeastOnce);
    Position _pos_1 = Position.pos(0, 0);
    _verify.visit(this.aDeadCell, _pos_1);
  }
  
  @Test
  @Named("visits a living cell and its dead neighbours")
  @Order(6)
  public void visitsALivingCellAndItsDeadNeighbours() throws Exception {
    Position _pos = Position.pos(0, 0);
    this.subject.addCell(_pos, this.anAliveCell);
    this.subject.visit(this.worldVisitor);
    VerificationMode _times = Mockito.times(9);
    WorldVisitor _verify = Mockito.<WorldVisitor>verify(this.worldVisitor, _times);
    Cell _any = Matchers.<Cell>any();
    Position _pos_1 = Position.pos(0, 0);
    Position _neighbourOf = this.neighbourOf(_pos_1);
    _verify.visit(_any, _neighbourOf);
  }
  
  @Test
  @Named("visits any living cell and its dead neighbours")
  @Order(7)
  public void visitsAnyLivingCellAndItsDeadNeighbours() throws Exception {
    Position _pos = Position.pos(0, 0);
    this.subject.addCell(_pos, this.anAliveCell);
    Position _pos_1 = Position.pos(1, 1);
    this.subject.addCell(_pos_1, this.anotherAliveCell);
    this.subject.visit(this.worldVisitor);
    VerificationMode _times = Mockito.times(9);
    WorldVisitor _verify = Mockito.<WorldVisitor>verify(this.worldVisitor, _times);
    Cell _any = Matchers.<Cell>any();
    Position _pos_2 = Position.pos(0, 0);
    Position _neighbourOf = this.neighbourOf(_pos_2);
    _verify.visit(_any, _neighbourOf);
  }
  
  public Position neighbourOf(final Position pos) {
    String _plus = ("neighbours of " + pos);
    final Function1<Position,Boolean> _function = new Function1<Position,Boolean>() {
        public Boolean apply(final Position p) {
          boolean _or = false;
          Set<Position> _neighbours = pos.neighbours();
          boolean _contains = _neighbours.contains(p);
          if (_contains) {
            _or = true;
          } else {
            boolean _equals = Objects.equal(pos, p);
            _or = (_contains || _equals);
          }
          boolean _or_1 = false;
          Set<Position> _neighbours_1 = pos.neighbours();
          boolean _contains_1 = _neighbours_1.contains(p);
          boolean _equals_1 = Objects.equal(pos, p);
          if (_contains) {
            _or = true;
          } else {
            _or = (_contains || _equals_1);
          }
          return Boolean.valueOf(_or);
        }
      };
    Matcher<Position> _matches = Should.<Position>matches(_plus, _function);
    return Matchers.<Position>argThat(_matches);
  }
}
