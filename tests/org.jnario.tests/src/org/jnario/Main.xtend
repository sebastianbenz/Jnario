package org.jnario

import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.xbase.compiler.GeneratorConfig
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.jnario.feature.FeatureStandaloneSetup
import org.jnario.jnario.test.util.ModelStore
import org.jnario.spec.SpecStandaloneSetup

class Main {
	
	def static void main(String[] args) {
		val setup = new SpecStandaloneSetup
		val injector = setup.createInjectorAndDoEMFRegistration
		val modelStore = injector.getInstance(typeof(ModelStore))
		val resource = modelStore.parseSpec('''
				package test
				
								
									describe "Example Tables"{
								    def examplesWithType{      
				    | 			list 			|  
				    | new ArrayList<String>()  	|
				    | new LinkedList<String>() 	| 
				  } 	
				      
«««				  fact "computes the common super type"{
«««				    examplesWithType.forEach[
«««				      assert list != null
«««				    ] 
«««				  } 
						}
		''')
		val generator = injector.getInstance(typeof(JvmModelGenerator))
		resource.contents.filter(typeof(JvmGenericType)).forEach[
			println(generator.generateType(it, new GeneratorConfig));
		]
		
	}
	
	
}