/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.Assert.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*
import static de.bmw.carit.jnario.tests.util.SpecExecutor.*

describe "Pending"{
	
	it "ignores empty examples during example runs"{
		val spec = '
			package bootstrap

			import org.junit.*

			describe "Pending" {

				it "has no implementation in block expression"{
				} 
				
				it "has no body"
						
			}
		'
		assertThat(execute(spec), ignoreCountIs(2))
	}
	
}