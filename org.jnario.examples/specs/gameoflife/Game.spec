/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife

import org.jnario.runner.InstantiateWith
import org.mockito.Mock

import static gameoflife.AliveCell.*
import static org.mockito.Matchers.*
import static org.mockito.Mockito.*

import static extension org.jnario.lib.Should.*

@InstantiateWith(typeof(MockitoInstantiator))
describe Game{
	
	@Mock Cell cell
	
	it "keeps all alive cells"{
		val newCell = aliveCell()
		when(cell.evolve(any)).thenReturn(newCell)
		subject.evolve(newHashSet(cell)).should.contain(newCell)
	}
	
}