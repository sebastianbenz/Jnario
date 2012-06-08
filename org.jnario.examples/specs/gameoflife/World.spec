/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife

import org.jnario.runner.InstantiateWith
import org.mockito.Matchers
import org.mockito.Mock

import static gameoflife.AliveCell.*
import static gameoflife.DeadCell.*
import static gameoflife.Position.*
import static org.mockito.Matchers.*
import static org.mockito.Mockito.*
import org.jnario.lib.Should

@InstantiateWith(typeof(MockitoInstantiator))
describe World{
 
	@Mock WorldVisitor worldVisitor
	AliveCell anAliveCell = aliveCell()
	AliveCell anotherAliveCell = aliveCell()
	DeadCell aDeadCell = deadCell()

	fact "has initially no living cells"{
		subject.visit(worldVisitor)
		verify(worldVisitor, never).visit(any, any)
	}
	
	fact "visits any dead cell"{
		subject.addCell(pos(0, 0), aDeadCell)
		subject.visit(worldVisitor)
		verify(worldVisitor, atLeastOnce).visit(aDeadCell, pos(0, 0))
	}
	
	fact "visits a living cell and its dead neighbours"{
		subject.addCell(pos(0, 0), anAliveCell)
		subject.visit(worldVisitor)
		verify(worldVisitor, times(9)).visit(any, neighbourOf(pos(0, 0)))
	}
	
	fact "visits any living cell and its dead neighbours"{
		subject.addCell(pos(0, 0), anAliveCell)
		subject.addCell(pos(1, 1), anotherAliveCell)
		subject.visit(worldVisitor)
		verify(worldVisitor, times(9)).visit(any, neighbourOf(pos(0, 0)))
	}
	
	def neighbourOf(Position pos){
		return Matchers::argThat(Should::matches("neighbours of " + pos)[
			Position p | pos.neighbours.contains(p) || pos == p
		])
	}
 
}