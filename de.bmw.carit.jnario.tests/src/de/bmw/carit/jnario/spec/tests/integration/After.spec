/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*

import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*


/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe "After" {
 
	it "should be executed after each test"{
		val spec = '
			package bootstrap 
			
			import de.bmw.carit.jnario.runner.Order
			
			describe "After"{
				
				static int afterExecutionCount = 0
				
				it "should be executed after each test (1)"{
					afterExecutionCount.should.be(0)
				}	
				it "should be executed after each test (2)"{
					afterExecutionCount.should.be(1)
				}
				it "should be executed after each test (3)"{
					afterExecutionCount.should.be(2)
				}	
				
				after{
					afterExecutionCount = afterExecutionCount + 1
				}
			}
		'
		spec.execute.should.be(successful)
	}

}