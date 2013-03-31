/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.spec.tests.integration

import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor

@CreateWith(typeof(SpecTestCreator))
describe "StaticImports" {
 	@Inject extension BehaviorExecutor
	fact "should resolve static imports"{
		'''
			package bootstrap
			
			import static org.junit.Assert.*
			describe "Example" {
			
				fact "should resolve static imports"{
					assertTrue(true) 
				} 
						
			}
		'''.executesSuccessfully
	} 
			
}
	