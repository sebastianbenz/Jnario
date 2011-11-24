package de.bmw.carit.jnario.spec.tests

import static org.junit.Assert.*
import static extension de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*
import static org.junit.experimental.results.ResultMatchers.*
import org.junit.experimental.results.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*


describe "Annotations" {
 
	it "should support class annotations for 'describes'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Singleton
			import static org.hamcrest.CoreMatchers.*
			
			@Singleton			
			describe "Annotations" {
			
				it "should support class annotations for describe"{
					val annotation = typeof(AnnotationsSpec).getAnnotation(typeof(Singleton))
					annotation.should.not.be(nullValue)
				} 
						
			}
		'
		spec.execute.should.be(successful)
	} 
	
	it "should support method annotations for 'examples'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Inject
			import static org.hamcrest.CoreMatchers.*
			
			describe "Annotations" {
			
				@Inject			
				it "example"{
					val annotation = typeof(AnnotationsSpec).getMethod("example").getAnnotation(typeof(Inject))
					annotation.should.not.be(nullValue)
				} 
						
			}
		'
		spec.execute.should.be(successful)
	}
	
	it "should support annotations for 'fields'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Inject
			import static org.hamcrest.CoreMatchers.*
			
			describe "Annotations" {
			
				@Inject		
				String myField
					
				it "example"{
					val annotation = typeof(AnnotationsSpec).getDeclaredField("myField").getAnnotation(typeof(Inject))
					annotation.should.not.be(nullValue)
				} 
						
			}
		'
		spec.execute.should.be(successful)
	}

}
	