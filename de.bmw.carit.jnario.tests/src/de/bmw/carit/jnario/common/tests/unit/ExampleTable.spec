package de.bmw.carit.jnario.common.tests.unit

import com.google.inject.Inject
import de.bmw.carit.jnario.tests.util.ModelStore
import de.bmw.carit.jnario.common.ExampleTable
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import de.bmw.carit.jnario.runner.InstantiateWith

@InstantiateWith(typeof(SpecTestInstantiator))
describe ExampleTable{

	@Inject extension ModelStore 

	it "is valid if all rows have the same number of columns"{
		parseSpec('''
			package bootstrap
			describe "ExampleTable"{
				def{
					| a | b |
					| 1 | 2 |
					| 1 | 3 |
				}
			}
		''')
		
		query.first(typeof(ExampleTable)).isValid().should.be(true)
	}
	
	it "is invalid if one row has a different number of columns"{
		parseSpec('''
			package bootstrap
			describe "ExampleTable"{
				def{
					| a | b |
					| 1 | 2 |
					| 1 | 
				}
			}
		''')
		
		query.first(typeof(ExampleTable)).isValid().should.be(false)
	}
}