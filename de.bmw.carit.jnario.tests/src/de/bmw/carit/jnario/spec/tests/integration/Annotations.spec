package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*


import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*


/**
 * @author Sebastian Benz - Initial contribution and API
 */ 
describe "Annotations" {
 
	"should support class annotations for 'describes'"{
		val spec = '
			package bootstrap
			import static org.hamcrest.CoreMatchers.*			
			import com.google.inject.Singleton

			@Singleton			
			describe "Annotations" {
			
				"should support class annotations for describe"{
					val annotation = typeof(AnnotationsSpec).getAnnotation(typeof(Singleton))
					annotation.should.not.be(nullValue)
				} 
						
			}
		'
		spec.execute.should.be(successful)
	} 
	
	"should support method annotations for 'examples'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Inject
			import static org.hamcrest.CoreMatchers.*

			describe "Annotations" {
			
				@Inject			
				"example"{
					val annotation = typeof(AnnotationsSpec).getMethod("example").getAnnotation(typeof(Inject))
					annotation.should.not.be(nullValue)
				} 
						
			}
		'
		spec.execute.should.be(successful)
	}
	
	"should support annotations for 'fields'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Inject
			import static org.hamcrest.CoreMatchers.*
			
			describe "Annotations" {
			
				@Inject		
				String myField
					
				"example"{
					val annotation = typeof(AnnotationsSpec).getDeclaredField("myField").getAnnotation(typeof(Inject))
					annotation.should.not.be(nullValue)
				} 
						
			}
		'
		spec.execute.should.be(successful)
	}

}
	