package gameoflife.specs

import gameoflife.World

import static gameoflife.CellLocation.*
import static gameoflife.World.*
  
describe World{
	
  val liveCell = cell(0,0)
  val anotherLivingCell = cell(1, 1)
  
  val worldWithLiveCell = worldWith(list(liveCell))
  val worldWithTwoLiveNeighbours = worldWith(list(liveCell, anotherLivingCell))
  
  context "dead cells"{
    fact "with no live cells there are no dead cells"{
      worldWith(emptyList).deadCells => emptySet
    }
    fact "with a live cell all neighbours are dead cells"{
      worldWithLiveCell.deadCells => liveCell.neighbours
    }
    fact "with a live cell all non-living neighbours are dead cells"{
      worldWithTwoLiveNeighbours.deadCells => allNonLivingNeighbours
    }
    
    def allNonLivingNeighbours(){
      val allNonLivingNeighbours = (liveCell.neighbours + anotherLivingCell.neighbours).toSet
      allNonLivingNeighbours.remove(anotherLivingCell)
      allNonLivingNeighbours.remove(liveCell)
      allNonLivingNeighbours
    }
  }
  describe "living Neighbours"{
    fact "returns number of live neighbours"{
      worldWithTwoLiveNeighbours.livingNeighbours(liveCell) => 1
    }
  }
}
  
