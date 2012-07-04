/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.scoping

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.spec.SpecPackage
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import org.jnario.spec.scoping.SpecScopeProvider
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator

import static org.junit.Assert.*

import static extension org.jnario.jnario.test.util.Query.*

@CreateWith(typeof(SpecTestCreator))
describe SpecScopeProvider {
	
	@Inject extension ModelStore modelStore
	
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
		val exampleGroup = query.second(typeof(ExampleGroup))
		contains(targetOperation(exampleGroup), "assertNotNull(String, Object)") 
		contains(targetOperation(exampleGroup), "assertNotNull") 
	}    
	
	def void contains(IScope scope, String element){
		val result = scope.getSingleElement(QualifiedName::create(element.split("//.")))
		assertNotNull("scope did not contain:" + element, result);
	}
	
	def void containsNot(IScope scope, String element){
		val result = scope.getSingleElement(QualifiedName::create(element.split("//.")))
		assertNull("scope did not contain:" + element, result);
	}
	
	def IScope targetOperation(EObject source){
		return subject.getScope(source, SpecPackage::eINSTANCE.exampleGroup_TargetOperation)
	}
	
		
}