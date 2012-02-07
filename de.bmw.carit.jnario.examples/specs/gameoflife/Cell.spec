package gameoflife

import static gameoflife.AliveCell.*
import static gameoflife.DeadCell.*

import static extension de.bmw.carit.jnario.lib.Should.*

describe Cell {
		
	Cell subject
	
	describe AliveCell{
		
		before{
			 subject = aliveCell()
		}
		
		it "stays alive if it has three living neighbours"{
			evolveWithNeighbours(3).should.be(typeof(AliveCell))
		} 

		it "stays alive with two living neighbours"{
			evolveWithNeighbours(2).should.be(typeof(AliveCell))
		} 
		
		it "dies with more than three neighbours"{
			evolveWithNeighbours(4).should.be(typeof(DeadCell))
		} 
		
		it "dies with less than two neighbours"{
			evolveWithNeighbours(1).should.be(typeof(DeadCell))
		} 
	}
	
	describe DeadCell{
		
		before{
			 subject = deadCell()
		}
		
		it "becomes alive if it has three living neighbours"{
			evolveWithNeighbours(3).should.be(typeof(AliveCell))
		} 
		
		it "stays dead with less than three neighbours"{
			evolveWithNeighbours(2).should.be(typeof(DeadCell))
		} 
		
		it "stays dead with more than three neighbours"{
			evolveWithNeighbours(4).should.be(typeof(DeadCell))
		}
	}
	
	def evolveWithNeighbours(int neighbourCount){
		return subject.evolve(neighbourCount)
	}
}

