package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*
import static org.junit.Assert.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
/**
 * @author Sebastian Benz
 */
describe "Guice" {

	it "should demonstrate the injection of Tests"{
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
	