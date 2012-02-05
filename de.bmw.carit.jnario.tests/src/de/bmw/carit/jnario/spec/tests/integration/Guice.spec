package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.tests.util.SpecExecutor.*
import static org.junit.Assert.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe "Guice" {

	"should demonstrate the injection of Tests"{
		val spec = '
			package bootstrap
			
			import static org.junit.Assert.*
			import de.bmw.carit.jnario.runner.InstantiateWith
			import de.bmw.carit.jnario.lib.GuiceBasedTestInstantiator
			import com.google.inject.Inject
			
			@InstantiateWith(typeof(GuiceBasedTestInstantiator))
			describe "GuiceBasedTestInstantiator" {
				
				@Inject String toInject
				
				"should inject fields"{
					assertNotNull(toInject);
				} 
						
			}
		'
		assertThat(execute(spec), successful)
	}
	
}
	