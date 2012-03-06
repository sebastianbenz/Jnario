package gameoflife;

import com.google.common.base.Objects;
import gameoflife.Position;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Position")
public class PositionSpec {
  @Test
  @Named("returns neighbouring positions")
  @Order(0)
  public void returnsNeighbouringPositions() throws Exception {
    Position _pos = Position.pos(2, 2);
    Position _pos_1 = Position.pos(2, 3);
    Position _pos_2 = Position.pos(2, 4);
    Position _pos_3 = Position.pos(3, 2);
    Position _pos_4 = Position.pos(3, 4);
    Position _pos_5 = Position.pos(4, 2);
    Position _pos_6 = Position.pos(4, 3);
    Position _pos_7 = Position.pos(4, 4);
    HashSet<Position> _newHashSet = CollectionLiterals.<Position>newHashSet(_pos, _pos_1, _pos_2, _pos_3, _pos_4, _pos_5, _pos_6, _pos_7);
    Position _pos_8 = Position.pos(3, 3);
    Set<Position> _neighbours = _pos_8.neighbours();
    Matcher<Set<Position>> _is = CoreMatchers.<Set<Position>>is(_neighbours);
    Assert.<Set<Position>>assertThat(_newHashSet, _is);
  }
  
  @Test
  @Named("calculates hash code based on coordinates")
  @Order(1)
  public void calculatesHashCodeBasedOnCoordinates() throws Exception {
    Position _pos = Position.pos(0, 0);
    int _hashCode = _pos.hashCode();
    Position _pos_1 = Position.pos(0, 0);
    int _hashCode_1 = _pos_1.hashCode();
    boolean _equals = (_hashCode == _hashCode_1);
    Assert.assertTrue("\nExpected pos(0, 0).hashCode == pos(0, 0).hashCode but:"
     + "\n     pos(0, 0).hashCode is " + _hashCode
     + "\n     pos(0, 0) is " + _pos + "\n", _equals);
    
  }
  
  @Test
  @Named("calculates equals based on coordinates")
  @Order(2)
  public void calculatesEqualsBasedOnCoordinates() throws Exception {
    Position _pos = Position.pos(0, 0);
    Position _pos_1 = Position.pos(0, 0);
    boolean _equals = Objects.equal(_pos, _pos_1);
    Assert.assertTrue("\nExpected pos(0, 0) == pos(0, 0) but:"
     + "\n     pos(0, 0) is " + _pos + "\n", _equals);
    
  }
  
  @Test
  @Named("can add another position")
  @Order(3)
  public void canAddAnotherPosition() throws Exception {
    Position _pos = Position.pos(1, 2);
    Position _pos_1 = Position.pos(3, 4);
    Position _plus = _pos.plus(_pos_1);
    Position _pos_2 = Position.pos(4, 6);
    boolean _equals = Objects.equal(_plus, _pos_2);
    Assert.assertTrue("\nExpected pos(1, 2).plus(pos(3, 4)) == pos(4, 6) but:"
     + "\n     pos(1, 2).plus(pos(3, 4)) is " + _plus
     + "\n     pos(1, 2) is " + _pos
     + "\n     pos(3, 4) is " + _pos_1
     + "\n     pos(4, 6) is " + _pos_2 + "\n", _equals);
    
  }
}
