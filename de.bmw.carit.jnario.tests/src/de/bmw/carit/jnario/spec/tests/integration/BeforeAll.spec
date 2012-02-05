package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*


import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*


/**
 * @author Sebastian Benz - Initial contribution and API
 */ 
describe "BeforeAll" {
 
	"should be executed before all tests"{
		val spec = '
			package bootstrap 
			
			describe "BeforeAll"{
				
				static int beforeExecutionCount = 0
				
				before all{
					beforeExecutionCount = beforeExecutionCount + 1
				}
				
				"should be executed before all tests (1)"{
					beforeExecutionCount.should.be(1)
				}	
				
				"should be executed before all tests (2)"{
					beforeExecutionCount.should.be(1)
				}	
			}
		'
		spec.execute.should.be(successful)
	}

}