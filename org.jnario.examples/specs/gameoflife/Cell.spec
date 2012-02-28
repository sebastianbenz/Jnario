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

describe Cell {
		
	def {
		| Cell cell | neighborCount  |      newState        |
	
		| aliveCell |       3		 | 	typeof(AliveCell)	|
		| aliveCell |       2		 | 	typeof(AliveCell)	|
		| aliveCell |       4		 | 	typeof(DeadCell)	|
		| aliveCell |       1		 | 	typeof(DeadCell)	|
		
		| deadCell  |       3		 | 	typeof(AliveCell)	|
		| deadCell  |       2		 | 	typeof(DeadCell)	|
		| deadCell  |       4		 | 	typeof(DeadCell)	|
	}

	it "changes its state based on the neighbor count"{
		examples.forEach[
			cell.evolve(neighborCount).should.be(newState)
		]
	} 

}
 
