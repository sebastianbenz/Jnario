/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife;

import gameoflife.AliveCell;
import gameoflife.Cell;
import gameoflife.Game;
import gameoflife.MockitoInstantiator;
import java.util.Set;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Game")
@CreateWith(value = MockitoInstantiator.class)
public class GameSpec {
  @Subject
  public Game subject;
  
  @Mock
  Cell cell;
  
  @Test
  @Named("keeps all alive cells")
  @Order(99)
  public void keepsAllAliveCells() throws Exception {
    final AliveCell newCell = AliveCell.aliveCell();
    Integer _any = Matchers.<Integer>any();
    Cell _evolve = this.cell.evolve((_any).intValue());
    OngoingStubbing<Cell> _when = Mockito.<Cell>when(_evolve);
    _when.thenReturn(newCell);
    Set<Cell> _set = JnarioCollectionLiterals.<Cell>set(this.cell);
    Iterable<Cell> _evolve_1 = this.subject.evolve(_set);
    boolean _should_contain = Should.<Cell>should_contain(_evolve_1, newCell);
    Assert.assertTrue("\nExpected subject.evolve(set(cell)) should contain newCell but"
     + "\n     subject.evolve(set(cell)) is " + new StringDescription().appendValue(_evolve_1).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     set(cell) is " + new StringDescription().appendValue(_set).toString()
     + "\n     cell is " + new StringDescription().appendValue(this.cell).toString()
     + "\n     newCell is " + new StringDescription().appendValue(newCell).toString() + "\n", _should_contain);
    
  }
}
