/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.junit.Assert.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*
import static org.jnario.jnario.test.util.SpecExecutor.*
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.jnario.test.util.BehaviorExecutor
import com.google.inject.Inject

@CreateWith(typeof(SpecTestCreator))
describe "Pending"{
	@Inject extension BehaviorExecutor
	fact "ignores empty examples during example runs"{
		val spec = '
			package bootstrap

			import org.junit.*

			describe "Pending" {

				fact "has no implementation in block expression"{
				} 
				
				fact "has no body"
						
			}
		'
		assertThat(execute(spec), ignoreCountIs(2))
	}
	
}