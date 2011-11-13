package de.bmw.carit.jnario.spec.tests

import static de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*
import static org.junit.Assert.*
import static org.junit.experimental.results.ResultMatchers.*

describe "Spec" {
 
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
			
}
	