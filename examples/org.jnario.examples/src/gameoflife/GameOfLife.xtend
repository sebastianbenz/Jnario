package gameoflife

import java.util.Set
import org.eclipse.xtend.lib.Data

import static gameoflife.CellLocation.*
import static gameoflife.World.*

@Data
class Evolution{
  def static gameOfLife() {
    new Evolution(new EvolveLiveCells, new EvolveDeadCells)
  }
  
  Rule staysAlive
  Rule becomesAlive
  
  def evolve(World world) {
    worldWith(
      world.livingCells.filter[getStaysAlive.apply(world, it)] +
      world.deadCells.filter[getBecomesAlive.apply(world, it)]
    )
  } 
  def private apply(Rule rule, World world, CellLocation cell){
    rule.becomesAlive(world.livingNeighbours(cell))
  }  
}


class EvolveLiveCells implements Rule{
  override becomesAlive(int neighbourCount) {
    !neighbourCount.underPopulated && !neighbourCount.overPopulated
  }
  def underPopulated(int neighbourCount){
    neighbourCount < 2
  }
  def overPopulated(int neighbourCount){
    neighbourCount > 3
  }
}

class EvolveDeadCells implements Rule{
  override becomesAlive(int neighbourCount) {
    neighbourCount == 3
  }
}

@Data
class World{
  Set<CellLocation> livingCells
  
  def static parseWorld(CharSequence grid){
    val cells = <CellLocation>newArrayList
    grid.toString.split("\r?\n").forEach[line, x | 
      line.toCharArray.forEach[c, y|
        if(c.toString == "X"){
          cells.add(cell(x, y))
        }
      ]
    ]
    worldWith(cells)
  }
  
  def static worldWith(Iterable<CellLocation> cells) {
    new World(cells.toSet)
  } 
  
  def deadCells() {
    livingCells.map[neighbours].flatten.filter[!livingCells.contains(it)].toSet
  }
  
  def livingNeighbours(CellLocation cell){
    cell.neighbours.filter[livingCells.contains(it)].size
  }
}
 
@Data
class CellLocation {
  static val NEIGHBOUR_OFFSETS = newHashSet(
    cell(1, 0), cell(1, 1), cell(0, 1), cell(-1, -1), cell(-1, 0), cell(-1, 1), cell(0, -1), cell(1, -1)
  )
  
  def static cell(int x, int y){
    new CellLocation(x, y)
  }
  
  int x
  int y
  
  def Set<CellLocation> neighbours(){
    NEIGHBOUR_OFFSETS.map[this.plus(it)].toSet
  }
  
  def plus(CellLocation other){
    cell(x + other.x, y + other.y)
  }
}