/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
 package org.jnario.spec.tests.integration

import static org.jnario.jnario.test.util.ResultMatchers.*


import static extension org.jnario.jnario.test.util.SpecExecutor.*


/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe "Before" {
 
	it "should be executed before each test"{
		val spec = '
			package bootstrap
			 
			import org.jnario.runner.Order
			
			describe "Before"{
				
				static int beforeExecutionCount = 0
				
				before{
					beforeExecutionCount = beforeExecutionCount + 1
				}

				it "should be executed before each test (1)"{
					beforeExecutionCount.^should.^be(1)
				}	

				it "should be executed before each test (2)"{
					beforeExecutionCount.^should.^be(2)
				}	
			}
		'
		spec.execute.^should.^be(successful)
	}

}