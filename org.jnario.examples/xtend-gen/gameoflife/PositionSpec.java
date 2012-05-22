package gameoflife;

import gameoflife.Position;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Position")
public class PositionSpec {
  @Test
  @Named("returns neighboring positions")
  @Order(99)
  public void returnsNeighboringPositions() throws Exception {
    Position _pos = Position.pos(3, 3);
    Set<Position> _neighbours = _pos.neighbours();
    Position _pos_1 = Position.pos(2, 2);
    Position _pos_2 = Position.pos(2, 3);
    Position _pos_3 = Position.pos(2, 4);
    Position _pos_4 = Position.pos(3, 2);
    Position _pos_5 = Position.pos(3, 4);
    Position _pos_6 = Position.pos(4, 2);
    Position _pos_7 = Position.pos(4, 3);
    Position _pos_8 = Position.pos(4, 4);
    Set<Position> _set = JnarioCollectionLiterals.<Position>set(_pos_1, _pos_2, _pos_3, _pos_4, _pos_5, _pos_6, _pos_7, _pos_8);
    boolean _doubleArrow = Should.operator_doubleArrow(_neighbours, _set);Assert
    .assertTrue("\nExpected pos(3, 3).neighbours() => \tset(\n\t\t\t\t\t\t\t\t\t\t\tpos(2, 2), pos(2, 3), pos(2, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(3, 2), pos(3, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(4, 2), pos(4, 3), pos(4, 4)\n\t\t\t\t\t\t\t\t\t\t) but"
     + "\n     pos(3, 3).neighbours() is " + _neighbours
     + "\n     pos(3, 3) is " + _pos
     + "\n     set(\n\t\t\t\t\t\t\t\t\t\t\tpos(2, 2), pos(2, 3), pos(2, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(3, 2), pos(3, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(4, 2), pos(4, 3), pos(4, 4)\n\t\t\t\t\t\t\t\t\t\t) is " + _set
     + "\n     pos(2, 2) is " + _pos_1
     + "\n     pos(2, 3) is " + _pos_2
     + "\n     pos(2, 4) is " + _pos_3
     + "\n     pos(3, 2) is " + _pos_4
     + "\n     pos(3, 4) is " + _pos_5
     + "\n     pos(4, 2) is " + _pos_6
     + "\n     pos(4, 3) is " + _pos_7
     + "\n     pos(4, 4) is " + _pos_8 + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("calculates hash code based on coordinates")
  @Order(99)
  public void calculatesHashCodeBasedOnCoordinates() throws Exception {
    Position _pos = Position.pos(0, 0);
    int _hashCode = _pos.hashCode();
    Position _pos_1 = Position.pos(0, 0);
    int _hashCode_1 = _pos_1.hashCode();
    boolean _equals = IntegerExtensions.operator_equals(_hashCode, _hashCode_1);
    Assert.assertTrue("\nExpected pos(0, 0).hashCode == pos(0, 0).hashCode but"
     + "\n     pos(0, 0).hashCode is " + _hashCode
     + "\n     pos(0, 0) is " + _pos + "\n", _equals);
    
  }
  
  @Test
  @Named("calculates equals based on coordinates")
  @Order(99)
  public void calculatesEqualsBasedOnCoordinates() throws Exception {
    Position _pos = Position.pos(0, 0);
    Position _pos_1 = Position.pos(0, 0);
    boolean _equals = ObjectExtensions.operator_equals(_pos, _pos_1);
    Assert.assertTrue("\nExpected pos(0, 0) == pos(0, 0) but"
     + "\n     pos(0, 0) is " + _pos + "\n", _equals);
    
  }
  
  @Test
  @Named("can add another position")
  @Order(99)
  public void canAddAnotherPosition() throws Exception {
    Position _pos = Position.pos(1, 2);
    Position _pos_1 = Position.pos(3, 4);
    Position _plus = _pos.plus(_pos_1);
    Position _pos_2 = Position.pos(4, 6);
    boolean _equals = ObjectExtensions.operator_equals(_plus, _pos_2);
    Assert.assertTrue("\nExpected pos(1, 2).plus(pos(3, 4)) == pos(4, 6) but"
     + "\n     pos(1, 2).plus(pos(3, 4)) is " + _plus
     + "\n     pos(1, 2) is " + _pos
     + "\n     pos(3, 4) is " + _pos_1
     + "\n     pos(4, 6) is " + _pos_2 + "\n", _equals);
    
  }
}
