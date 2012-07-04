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
describe "After" {
 
	fact "should be executed after each test"{
			'''
			package bootstrap 
			
			describe "After"{
				
				static int afterExecutionCount = 0
				
				fact "should be executed after each test (1)"{
					afterExecutionCount should be 0
				}	
				fact "should be executed after each test (2)"{
					afterExecutionCount should be 1
				}
				fact "should be executed after each test (3)"{
					afterExecutionCount should be 2
				}	
				
				after{
					afterExecutionCount = afterExecutionCount + 1
				}
			}
		'''.executesSuccessfully
	}

}