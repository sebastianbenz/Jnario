package gameoflife

import de.bmw.carit.jnario.runner.InstantiateWith
import org.mockito.Matchers
import org.mockito.Mock

import static gameoflife.AliveCell.*
import static gameoflife.DeadCell.*
import static gameoflife.Position.*
import static org.mockito.Matchers.*
import static org.mockito.Mockito.*
import de.bmw.carit.jnario.lib.Should

@InstantiateWith(typeof(MockitoInstantiator))
describe World{
	
	@Mock WorldVisitor worldVisitor
	AliveCell anAliveCell = aliveCell()
	AliveCell anotherAliveCell = aliveCell()
	DeadCell aDeadCell = deadCell()

	it "has initially no living cells"{
		subject.visit(worldVisitor)
		verify(worldVisitor, never).visit(any, any)
	}
	
	it "visits any dead cell"{
		subject.addCell(pos(0, 0), aDeadCell)
		subject.visit(worldVisitor)
		verify(worldVisitor, atLeastOnce).visit(aDeadCell, pos(0, 0))
	}
	
	it "visits a living cell and its dead neighbours"{
		subject.addCell(pos(0, 0), anAliveCell)
		subject.visit(worldVisitor)
		verify(worldVisitor, times(9)).visit(any, neighbourOf(pos(0, 0)))
	}
	
	it "visits any living cell and its dead neighbours"{
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