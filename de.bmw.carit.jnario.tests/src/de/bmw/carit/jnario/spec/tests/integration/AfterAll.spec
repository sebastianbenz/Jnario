package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*
/**
 * @author Sebastian Benz - Initial contribution and API
 */ 
describe "AfterAll" {
 
	it "should be executed after all tests"{
		val spec = '
			package bootstrap 
			
			describe "AfterAll"{
				
				static int afterExecutionCount = 0
				
				it "should be executed after all tests (1)"{
					afterExecutionCount.should.be(0)
				}	
				
				it "should be executed after all tests (2)"{
					afterExecutionCount.should.be(0)
				}	
				
				after all{
					afterExecutionCount = afterExecutionCount + 1
				}
			}
		'
		spec.execute.should.be(successful)
	}

}