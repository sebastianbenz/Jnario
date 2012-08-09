package gameoflife

import java.util.Set
import org.eclipse.xtend.lib.Data

import static gameoflife.CellPosition.*
import static gameoflife.World.*

@Data
class Evolution{
	def static gameOfLife() {
		new Evolution(new EvolveLivingCells, new EvolveDeadCells)
	}
	
	Rule livingCellRule
	Rule deadCellRule
	
	def World evolve(World world) {
		worldWith(
			world.livingCells.filter[livingCellRule.apply(world, it)] +
			world.deadCells.filter[deadCellRule.apply(world, it)]
		)
	} 
	
	def apply(Rule rule, World world, CellPosition cell){
		rule.becomesAlive(world.livingNeighbours(cell))
	}	
}

class EvolveLivingCells implements Rule{
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
	Set<CellPosition> livingCells
	
	def static worldWith(Iterable<CellPosition> cells) {
		new World(cells.toSet)
	} 
	
	def deadCells() {
		livingCells.map[neighbours].flatten.filter[!livingCells.contains(it)].toSet
	}
	
	def livingNeighbours(CellPosition cell){
		cell.neighbours.filter[livingCells.contains(it)].size
	}
}
 
@Data
class CellPosition {
	public static val NEIGHBOUR_OFFSETS = newHashSet(
		cell(1, 0), cell(1, 1), cell(0, 1), cell(-1, -1), cell(-1, 0), cell(-1, 1), cell(0, -1), cell(1, -1)
	)
	
	def static cell(int x, int y){
		new CellPosition(x, y)
	}
	
	int x
	int y
	
	def Set<CellPosition> neighbours(){
		NEIGHBOUR_OFFSETS.map[this.plus(it)].toSet
	}
	
	def plus(CellPosition other){
		cell(x + other.x, y + other.y)
	}
	
	override toString(){
		"[" + x + "," + y + "]"
	}
}