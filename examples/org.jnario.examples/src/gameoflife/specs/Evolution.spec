package gameoflife.specs

import static gameoflife.CellLocation.*
import static gameoflife.World.*
import gameoflife.Rule
import gameoflife.Evolution

/*
 * Responsible for evolving cells in the world. The 
 * evolution is parameterized by two rules, the first 
 * rule deciding whether a live cell  stays alive and the second
 * rule deciding whether a dead cell becomes alive.
 */
describe Evolution{
  
  val livingCell = cell(0,0)
  val worldWithLiveCell = worldWith(list(livingCell))
  
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