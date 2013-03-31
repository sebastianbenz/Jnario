package org.jnario

import org.junit.runner.RunWith
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.spec.SpecStandaloneSetup
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.xbase.compiler.GeneratorConfig
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.xtext.common.types.JvmGenericType
import org.jnario.feature.FeatureStandaloneSetup

class Main {
	
	def static void main(String[] args) {
		val setup = new FeatureStandaloneSetup
		val injector = setup.createInjectorAndDoEMFRegistration
		val modelStore = injector.getInstance(typeof(ModelStore))
		val resource = modelStore.parseScenario('''
				package test
				import java.util.*
				Feature: Test
					Scenario: TestScenario 1
						val values = new ArrayList<String>()
						Given a list
							values += "hello"
						
					Scenario: TestScenario 2
						Given a list
						Then it should have contents
							values.size => 1     
		''')
		val generator = injector.getInstance(typeof(JvmModelGenerator))
		resource.contents.filter(typeof(JvmGenericType)).forEach[
			println(generator.generateType(it, new GeneratorConfig));
		]
		
	}
	
	
}