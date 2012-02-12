package de.bmw.carit.jnario.common.tests.unit

import com.google.inject.Inject
import de.bmw.carit.jnario.common.ExampleTable
import de.bmw.carit.jnario.tests.util.ModelStore
import de.bmw.carit.jnario.common.ExampleColumn
import org.eclipse.xtext.serializer.ISerializer
import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator

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
	
	it "calculates cells based on table"{
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
			cell.serialize.trim.should.be(value)
		]
		
	}
	
} 