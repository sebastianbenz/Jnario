/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife;

import com.google.common.base.Objects;
import gameoflife.Position;
import java.util.Set;
import org.hamcrest.StringDescription;
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
    boolean _doubleArrow = Should.operator_doubleArrow(_neighbours, _set);
    Assert.assertTrue("\nExpected pos(3, 3).neighbours() => \tset(\n\t\t\t\t\t\t\t\t\t\t\tpos(2, 2), pos(2, 3), pos(2, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(3, 2), pos(3, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(4, 2), pos(4, 3), pos(4, 4)\n\t\t\t\t\t\t\t\t\t\t) but"
     + "\n     pos(3, 3).neighbours() is " + new StringDescription().appendValue(_neighbours).toString()
     + "\n     pos(3, 3) is " + new StringDescription().appendValue(_pos).toString()
     + "\n     set(\n\t\t\t\t\t\t\t\t\t\t\tpos(2, 2), pos(2, 3), pos(2, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(3, 2), pos(3, 4),\n\t\t\t\t\t\t\t\t\t\t\tpos(4, 2), pos(4, 3), pos(4, 4)\n\t\t\t\t\t\t\t\t\t\t) is " + new StringDescription().appendValue(_set).toString()
     + "\n     pos(2, 2) is " + new StringDescription().appendValue(_pos_1).toString()
     + "\n     pos(2, 3) is " + new StringDescription().appendValue(_pos_2).toString()
     + "\n     pos(2, 4) is " + new StringDescription().appendValue(_pos_3).toString()
     + "\n     pos(3, 2) is " + new StringDescription().appendValue(_pos_4).toString()
     + "\n     pos(3, 4) is " + new StringDescription().appendValue(_pos_5).toString()
     + "\n     pos(4, 2) is " + new StringDescription().appendValue(_pos_6).toString()
     + "\n     pos(4, 3) is " + new StringDescription().appendValue(_pos_7).toString()
     + "\n     pos(4, 4) is " + new StringDescription().appendValue(_pos_8).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("calculates hash code based on coordinates")
  @Order(99)
  public void calculatesHashCodeBasedOnCoordinates() throws Exception {
    Position _pos = Position.pos(0, 0);
    int _hashCode = _pos.hashCode();
    Position _pos_1 = Position.pos(0, 0);
    int _hashCode_1 = _pos_1.hashCode();
    boolean _equals = (_hashCode == _hashCode_1);
    Assert.assertTrue("\nExpected pos(0, 0).hashCode == pos(0, 0).hashCode but"
     + "\n     pos(0, 0).hashCode is " + new StringDescription().appendValue(_hashCode).toString()
     + "\n     pos(0, 0) is " + new StringDescription().appendValue(_pos).toString() + "\n", _equals);
    
  }
  
  @Test
  @Named("calculates equals based on coordinates")
  @Order(99)
  public void calculatesEqualsBasedOnCoordinates() throws Exception {
    Position _pos = Position.pos(0, 0);
    Position _pos_1 = Position.pos(0, 0);
    boolean _equals = Objects.equal(_pos, _pos_1);
    Assert.assertTrue("\nExpected pos(0, 0) == pos(0, 0) but"
     + "\n     pos(0, 0) is " + new StringDescription().appendValue(_pos).toString() + "\n", _equals);
    
  }
  
  @Test
  @Named("can add another position")
  @Order(99)
  public void canAddAnotherPosition() throws Exception {
    Position _pos = Position.pos(1, 2);
    Position _pos_1 = Position.pos(3, 4);
    Position _plus = _pos.plus(_pos_1);
    Position _pos_2 = Position.pos(4, 6);
    boolean _equals = Objects.equal(_plus, _pos_2);
    Assert.assertTrue("\nExpected pos(1, 2).plus(pos(3, 4)) == pos(4, 6) but"
     + "\n     pos(1, 2).plus(pos(3, 4)) is " + new StringDescription().appendValue(_plus).toString()
     + "\n     pos(1, 2) is " + new StringDescription().appendValue(_pos).toString()
     + "\n     pos(3, 4) is " + new StringDescription().appendValue(_pos_1).toString()
     + "\n     pos(4, 6) is " + new StringDescription().appendValue(_pos_2).toString() + "\n", _equals);
    
  }
}
