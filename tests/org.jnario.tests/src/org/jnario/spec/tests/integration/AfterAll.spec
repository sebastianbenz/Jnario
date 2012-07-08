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
import org.jnario.jnario.test.util.BehaviorExecutor
import com.google.inject.Inject
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
/**
 * @author Sebastian Benz - Initial contribution and API
 */ 
@CreateWith(typeof(SpecTestCreator))
describe "AfterAll" {
	@Inject extension BehaviorExecutor
 
	fact "should be executed after all tests"{
		val spec = '
			package bootstrap 
			
			describe "AfterAll"{
				
				static int afterExecutionCount = 0
				
				fact "should be executed after all tests (1)"{
					afterExecutionCount should be 0
				}	
				
				fact "should be executed after all tests (2)"{
					afterExecutionCount should be 0
				}	
				
				after all{
					afterExecutionCount = afterExecutionCount + 1
				}
			}
		'
		spec.executesSuccessfully
	}

}