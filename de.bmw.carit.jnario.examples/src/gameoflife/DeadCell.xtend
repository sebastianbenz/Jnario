package gameoflife

import static gameoflife.DeadCell.*

class DeadCell extends Cell {
	
	def static DeadCell deadCell(){
		return new DeadCell()
	}
	
	override evolve(int neighbourCount) {
		if(neighbourCount == 3){
			return AliveCell::aliveCell()
		} 
		return deadCell()
	}
} 