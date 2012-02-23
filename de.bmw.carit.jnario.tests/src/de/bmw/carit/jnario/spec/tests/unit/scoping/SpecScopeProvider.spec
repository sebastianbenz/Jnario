/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.tests.unit.scoping

import static org.junit.Assert.*

import com.google.inject.Inject
import de.bmw.carit.jnario.common.test.util.SpecTestInstantiator
import de.bmw.carit.jnario.common.test.util.ModelStore
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.spec.SpecPackage
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import de.bmw.carit.jnario.runner.InstantiateWith
import org.eclipse.emf.ecore.EObject
import de.bmw.carit.jnario.spec.scoping.SpecScopeProvider
import static extension de.bmw.carit.jnario.common.test.util.Query.*

@InstantiateWith(typeof(SpecTestInstantiator))
describe SpecScopeProvider {
	
	@Inject extension ModelStore modelStore
	
	it "should resolve operations from surrounding ExampleGroup's target"{
		parseSpec('
			package bootstrap
			
			import org.junit.Assert

			describe Assert{
				describe assertNotNull(String, Object){
					"assertNotNull(String, Object)"{
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
	
	def IScope throwsDeclaration(EObject source){
		return subject.getScope(source, SpecPackage::eINSTANCE.example_Exception)
	}
			
}