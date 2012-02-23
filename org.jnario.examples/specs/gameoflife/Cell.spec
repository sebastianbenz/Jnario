/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife

import static gameoflife.AliveCell.*
import static gameoflife.DeadCell.*

import static extension org.jnario.lib.Should.*

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

