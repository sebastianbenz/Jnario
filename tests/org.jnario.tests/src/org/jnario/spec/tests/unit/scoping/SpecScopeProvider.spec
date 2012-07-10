/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.scoping

import com.google.inject.Inject
import org.jnario.jnario.test.util.ScopeTestExtension
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.spec.scoping.SpecScopeProvider
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.spec.SpecPackage

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SpecTestCreator))
describe SpecScopeProvider {
	
	@Inject extension ScopeTestExtension 
	
	fact "should resolve operations from surrounding ExampleGroup's target"{
		parseSpec('
			package bootstrap
			
			import org.junit.Assert

			describe Assert{
				context assertNotNull(String, Object){
					fact "assertNotNull(String, Object)"{
					}
				}
			} 

		'    
		)
		targetOperationScope should contain "assertNotNull(String, Object)" 
		targetOperationScope should contain  "assertNotNull" 
	}    
	
	def targetOperationScope(){
		val source = second(typeof(ExampleGroup))
		return scope(source, SpecPackage::eINSTANCE.exampleGroup_TargetOperation)
	}
		
}