package gameoflife

import java.util.Map

import static gameoflife.DeadCell.*

class World {
	
	Map<Position, Cell> cells = newHashMap()
	
	def dispatch void addCell(Position position, AliveCell cell){
		doAdd(position, cell)
		addDeadNeighbours(position)
	}
	
	def private addDeadNeighbours(Position position){
		// .filter[!cells.containsKey(it)]
		position.neighbours.forEach[
			doAdd(it, deadCell)
		]
	}
	
	def dispatch void addCell(Position position, DeadCell cell){
		doAdd(position, cell)
	}
	
	def private doAdd(Position position, Cell cell){
		cells.put(position, cell)
	}
	
	def void visit(WorldVisitor visitor){
		cells.entrySet.forEach[
			visitor.visit(it.value, it.key)
		]
	}
} 