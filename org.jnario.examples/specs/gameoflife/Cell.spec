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
		
	def {
		|   cell    | neighborCount  | newState |
		
		| aliveCell |       3		 | 	alive	|
		| aliveCell |       2		 | 	alive	|
		| aliveCell |       4		 | 	dead	|
		| aliveCell |       1		 | 	dead	|
		
		| deadCell  |       3		 | 	alive	|
		| deadCell  |       2		 | 	dead	|
		| deadCell  |       4		 | 	dead	|
	}
	
	it "changes its state based on the neighbor count"{
		examples.forEach[
			cell.evolve(neighborCount).should.be(newState)
		]
	} 
	
	def alive(){
		typeof(AliveCell)
	}	
	
	def dead(){
		typeof(DeadCell)
	}
	
}

