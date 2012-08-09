package gameoflife

import static gameoflife.CellPosition.*
import static gameoflife.World.*

describe "Game of Life"{
	val livingCell = cell(0,0)
	val anotherLivingCell = cell(1, 1)
	
	val worldWithLiveCell = worldWith(list(livingCell))
	val worldWithTwoLiveNeighbours = worldWith(list(livingCell, anotherLivingCell))
	
	describe Evolution{
		val Rule dontCare  = [false]
		context "dead cells"{
			val Rule allDeadLive = [true]
			fact "become alive if rule says so" {
				val evolution = new Evolution(dontCare, allDeadLive)
				evolution.evolve(worldWithLiveCell).livingCells => livingCell.neighbours
			}
		}	
		context "live cells"{
			val Rule allLiveStayAlive  = [true]
			fact "become alive if rule says so" {
				val evolution = new Evolution(allLiveStayAlive, dontCare)
				evolution.evolve(worldWithLiveCell).livingCells => set(livingCell)
			}
		}				
	}

	describe "Rules"{
		describe EvolveLivingCells{
			def examples{
				| livingNeighbours | becomesAlive |
				| 1				   |   false      |
				| 2				   |   true       |
				| 3				   |   true       |
				| 4				   |   false      |
			}
			fact examples.forEach[
				subject.becomesAlive(livingNeighbours) => becomesAlive
			]
		}
		describe EvolveDeadCells {
			def examples{
				| livingNeighbours | becomesAlive |
				| 2				   |   false      |
				| 3				   |   true       |
				| 4				   |   false      |
			}
			fact examples.forEach[
				subject.becomesAlive(livingNeighbours) => becomesAlive
			] 
		}
	}
	
	describe CellPosition{
		context plus{
			fact cell(-1, 1).plus(cell(3,4)) => cell(2,5)
		}
		context neighbours {
			fact "are adjacent cells"{
				val cell = cell(0, 0)
				val neighbours = NEIGHBOUR_OFFSETS
				neighbours.forEach[cell.neighbours() should contain it]
			}
		}
	}
	
	describe World{
		context deadCells{
			fact "with no live cells there are no dead cells"{
				worldWith(emptyList).deadCells => emptySet
			}
			fact "with a live cell all neighbours are dead cells"{
				worldWithLiveCell.deadCells => livingCell.neighbours
			}
			fact "with a live cell all neighbours are dead cells if they do not life"{
				val deadCells = (livingCell.neighbours + anotherLivingCell.neighbours).toSet
				deadCells.remove(anotherLivingCell)
				deadCells.remove(livingCell)
				worldWithTwoLiveNeighbours.deadCells => deadCells
			}
		}
		context livingNeighbours{
			fact "returns number of live neighbours"{
				worldWithTwoLiveNeighbours.livingNeighbours(livingCell) => 1
			}
		}
	}
}