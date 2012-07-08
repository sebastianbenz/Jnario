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
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor


/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(typeof(SpecTestCreator))
describe "After" {
 	@Inject extension BehaviorExecutor
 	
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