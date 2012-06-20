package org.jnario.spec.tests.unit.naming

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.InstantiateWith
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.spec.naming.SpecQualifiedNameProvider

@InstantiateWith(typeof(SpecTestInstantiator))
describe SpecQualifiedNameProvider {

	@Inject extension ModelStore

	fact "uses spec description"{
		parseSpec('''
			describe "My Spec"{}''')
		qualifiedName => "My Spec"
	}
	
	fact "trims spec description whitespace"{
		parseSpec('''
			describe "My Spec  "{}''')
		qualifiedName => "My Spec"
	}
	
	fact "uses referenced type"{
		parseSpec('''
			describe org.junit.Assert{}''')
		qualifiedName => "Assert"
	}
	
	fact "uses referenced type and description"{
		parseSpec('''
			describe org.junit.Assert "My Spec"{}''')
		qualifiedName => "Assert My Spec"
	}
	
	fact "adds spec package"{
		parseSpec('''
			package test
			describe "My Spec"{}''')
		qualifiedName => "test.My Spec"
	}
	
	def qualifiedName(){
		subject.getFullyQualifiedName(firstSpec).toString		
	}
}