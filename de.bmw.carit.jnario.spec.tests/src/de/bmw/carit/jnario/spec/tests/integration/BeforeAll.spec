package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.experimental.results.ResultMatchers.*


import static extension de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*


 
describe "BeforeAll" {
 
	it "should be executed before all tests"{
		val spec = '
			package bootstrap 
			
			describe "BeforeAll"{
				
				static int beforeExecutionCount = 0
				
				before all{
					beforeExecutionCount = beforeExecutionCount + 1
				}
				
				it "should be executed before all tests (1)"{
					beforeExecutionCount.should.be(1)
				}	
				
				it "should be executed before all tests (2)"{
					beforeExecutionCount.should.be(1)
				}	
			}
		'
		spec.execute.should.be(successful)
	}

}