package de.bmw.carit.jnario.spec.tests

import static de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*
import static org.junit.Assert.*
import static org.junit.experimental.results.ResultMatchers.*

describe "Spec" {

 	/*
	it "should resolve target class"{
		val spec = '
			package bootstrap
			
			import static org.junit.Assert.*
			import org.junit.Assert
	
			describe Assert {
			
				it "should resolve target class"{
				} 
						
			}
		'
		assertThat(execute(spec), successful)
	} 
	
	*/
	
	it "should be able to declare helper methods"{
		val spec = '
			package bootstrap
			
			import static org.junit.Assert.*
			import de.bmw.carit.jnario.runner.InstantiateWith
			import de.bmw.carit.jnario.spec.tests.integration.GuiceBasedTestInstantiator
			import com.google.inject.Inject
			
			@InstantiateWith(typeof(GuiceBasedTestInstantiator))
			describe "GuiceBasedTestInstantiator" {
				
				@Inject String toInject
				
				it "should inject fields"{
					assertNotNull(toInject);
				} 
						
			}
		'
		assertThat(execute(spec), successful)
	}
	
}
	