/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit

import com.google.inject.Inject
import org.jnario.ExampleTable
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.runner.InstantiateWith

import static extension org.jnario.lib.Should.*

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