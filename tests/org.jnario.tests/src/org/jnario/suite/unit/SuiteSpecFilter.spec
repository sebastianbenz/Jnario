/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import org.jnario.suite.scoping.SuiteSpecFilter
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.resource.EObjectDescription
import org.jnario.jnario.test.util.Suites
import org.jnario.suite.suite.SuitePackage
import org.jnario.spec.spec.SpecPackage
import org.jnario.feature.feature.FeaturePackage
import org.jnario.jnario.test.util.Specs
import static org.jnario.spec.scoping.SpecResourceDescriptionStrategy.*


describe SuiteSpecFilter {
	
	extension SuitePackage = SuitePackage::eINSTANCE
	extension SpecPackage = SpecPackage::eINSTANCE
	extension FeaturePackage = FeaturePackage::eINSTANCE
	
	fact "Suites pass"{
		subject.apply(desc(suite)) => true
	}
	
	fact "Features pass"{
		subject.apply(desc(feature)) => true
	}
	
	fact "Root Specs pass"{
		subject.apply(rootSpec) => true
	}
	
	fact "Child Specs fail"{
		subject.apply(childSpec) => false
	}
	
	def desc(EClass type){
		EObjectDescription::create("name", Suites::suite("mySuite"))
	}
	
	def rootSpec(){
		spec(TRUE)
	}
	
	def childSpec(){
		spec(FALSE)
	}
	
	def spec(String value){
		val spec = Specs::exampleGroup("name")
		
		EObjectDescription::create("name", spec, map(
			ROOT_SPEC -> value
		))
	}

}