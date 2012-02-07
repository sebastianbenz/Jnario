package gameoflife

import static gameoflife.AliveCell.*

class AliveCell extends Cell {
	
	def static AliveCell aliveCell(){
		return new AliveCell()
	}
	
	override evolve(int neighbourCount) {
		if(underPopulated(neighbourCount) || overpopulated(neighbourCount)){
			return DeadCell::deadCell()
		}
		return aliveCell()
	}

	def underPopulated(int neighbourCount){
		return neighbourCount < 2
	}
	
	def overpopulated(int neighbourCount){
		return neighbourCount > 3
	}
	
}