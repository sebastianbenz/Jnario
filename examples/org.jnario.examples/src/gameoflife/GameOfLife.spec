package gameoflife

import static gameoflife.CellLocation.*
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
			fact "stay alive if rule says so" {
				val evolution = new Evolution(allLiveStayAlive, dontCare)
				evolution.evolve(worldWithLiveCell).livingCells => set(livingCell)
			}
		}
	}

	describe "rules"{
		describe EvolveLivingCells{
			def livingCells{
				| liveNeighbourCount | becomesAlive |
				| 1				   |   false      |
				| 2				   |   true       |
				| 3				   |   true       |
				| 4				   |   false      |
			}
			fact livingCells.forEach[
				subject.becomesAlive(liveNeighbourCount) => becomesAlive
			]
		}
		describe EvolveDeadCells {
			def deadcells{
				| liveNeighbourCount | becomesAlive |
				| 2				   |   false      |
				| 3				   |   true       |
				| 4				   |   false      |
			}
			fact deadcells.forEach[
				subject.becomesAlive(liveNeighbourCount) => becomesAlive
			] 
		}
	}
	
	describe CellLocation{
		context "adding cell locations"{
			fact cell(-1, 1).plus(cell(3,4)) => cell(2,5)
		} 
		context neighbours {
			fact "are adjacent cells"{
				val cell = cell(5, 5)
				val expectedNeighbours = set(
					cell(4, 6), cell(5, 6), cell(6, 6), 
					cell(4, 5),             cell(6, 5), 
					cell(4, 4), cell(5, 4), cell(6, 4)
				)
				cell.neighbours => expectedNeighbours
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
			fact "with a live cell all non-living neighbours are dead cells"{
				val expectedDeadCells = (livingCell.neighbours + anotherLivingCell.neighbours).toSet
				expectedDeadCells.remove(anotherLivingCell)
				expectedDeadCells.remove(livingCell)
				worldWithTwoLiveNeighbours.deadCells => expectedDeadCells
			}
		}
		context livingNeighbours{
			fact "returns number of live neighbours"{
				worldWithTwoLiveNeighbours.livingNeighbours(livingCell) => 1
			}
		}
	}
}