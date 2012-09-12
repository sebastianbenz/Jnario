package gameoflife.specs

import static gameoflife.CellLocation.*
import gameoflife.EvolveLiveCells
import gameoflife.EvolveDeadCells
  
describe "Rules"{
  describe EvolveLiveCells{
    def liveCells{
      | liveNeighbourCount |   result     |
      | 1                  |   false      |
      | 2                  |   true       |
      | 3                  |   true       |
      | 4                  |   false      |
    }
    fact liveCells.forEach[
      subject.becomesAlive(liveNeighbourCount) => result
    ]
  }
  describe EvolveDeadCells{
    def deadcells{
      | liveNeighbourCount |   result     |
      | 2                  |   false      |
      | 3                  |   true       |
      | 4                  |   false      |
    }
    fact deadcells.forEach[
      subject.becomesAlive(liveNeighbourCount) => result
    ] 
  }
}