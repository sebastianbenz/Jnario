/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit

import com.google.inject.Inject
import org.jnario.ExampleColumn
import org.jnario.ExampleTable
import org.jnario.runner.InstantiateWith
import org.eclipse.xtext.serializer.ISerializer

import static extension org.jnario.lib.ExampleTableIterators.*
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.jnario.test.util.ModelStore

@InstantiateWith(typeof(SpecTestInstantiator))
describe ExampleColumn{
	
	@Inject extension ModelStore 
	@Inject extension ISerializer 
	
	def {
		| columnIndex | cellIndex | value |
		|      0      |     0     |   "1" |
		|      0      |     1     |   "3" |
		|      1      |     0     |   "2" |
		|      1      |     1     |   "4" |
	}
	
	fact "calculates cells based on table"{
		parseSpec('''
			package bootstrap
			describe "ExampleTable"{
				def{
					| a | b |
					| 1 | 2 |
					| 3 | 4 |
				}
			}
		''')
		
		examples.forEach[
			val columns = query.first(typeof(ExampleTable)).columns
			val column = columns.get(columnIndex)
			val cell = column.cells.get(cellIndex)
			cell.serialize.trim => value
		]
		
	}
	
} 