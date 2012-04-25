/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife

import static gameoflife.DeadCell.*
import static gameoflife.AliveCell.*

class DeadCell extends Cell {

	def static DeadCell deadCell(){
		return new DeadCell()
	}
	
	override evolve(int neighbourCount) {
		if(neighbourCount == 3){
			return aliveCell()
		} 
		return deadCell()
	}
} 