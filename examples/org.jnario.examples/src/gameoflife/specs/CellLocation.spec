package gameoflife.specs

import static gameoflife.CellLocation.*
import static gameoflife.World.*
import gameoflife.CellLocation

describe CellLocation{
  describe "Calculating relative cell locations"{
    fact cell(-1, 1).plus(cell(3,4)) => cell(2,5)
  } 
  describe "cell neighbours" {
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