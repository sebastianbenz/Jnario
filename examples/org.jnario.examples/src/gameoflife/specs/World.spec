package gameoflife.specs

import static gameoflife.CellLocation.*
import static gameoflife.World.*
import gameoflife.World
  
describe World{
	
  val livingCell = cell(0,0)
  val anotherLivingCell = cell(1, 1)
  
  val worldWithLiveCell = worldWith(list(livingCell))
  val worldWithTwoLiveNeighbours = worldWith(list(livingCell, anotherLivingCell))
  
  context "dead cells"{
    fact "with no live cells there are no dead cells"{
      worldWith(emptyList).deadCells => emptySet
    }
    fact "with a live cell all neighbours are dead cells"{
      worldWithLiveCell.deadCells => livingCell.neighbours
    }
    fact "with a live cell all non-living neighbours are dead cells"{
      worldWithTwoLiveNeighbours.deadCells => allNonLivingNeighbours
    }
    
    def allNonLivingNeighbours(){
      val allNonLivingNeighbours = (livingCell.neighbours + anotherLivingCell.neighbours).toSet
      allNonLivingNeighbours.remove(anotherLivingCell)
      allNonLivingNeighbours.remove(livingCell)
      allNonLivingNeighbours
    }
  }
  describe "living Neighbours"{
    fact "returns number of live neighbours"{
      worldWithTwoLiveNeighbours.livingNeighbours(livingCell) => 1
    }
  }
}
  
