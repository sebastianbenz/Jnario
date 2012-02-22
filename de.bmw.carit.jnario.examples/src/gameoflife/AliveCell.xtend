/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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