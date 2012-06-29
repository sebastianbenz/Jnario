/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.jnario

import com.google.inject.Inject
import org.jnario.Should
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator

@CreateWith(typeof(SpecTestCreator))
describe Should{

	@Inject extension ModelStore 

	fact "'isNot' is false if for '1 should be 1"{
		parseSpec('''
			package bootstrap
			describe "Should"{
				fact 1 should be 1
			}
		''')
		
		assert !query.first(typeof(Should)).isNot
	}
	
	fact "'isNot' is true if for '1 should not be 1"{
		parseSpec('''
			package bootstrap
			describe "Should"{
				fact 1 should not be 1
			}
		''')
		
		assert query.first(typeof(Should)).isNot
	}
	
}