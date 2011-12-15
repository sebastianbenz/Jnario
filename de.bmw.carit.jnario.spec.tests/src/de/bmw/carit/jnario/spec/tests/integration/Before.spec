package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.experimental.results.ResultMatchers.*


import static extension de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*


 
describe "Before" {
 
	it "should be executed before each test"{
		val spec = '
			package bootstrap 
			
			describe "Before"{
				
				static int beforeExecutionCount = 0
				
				before{
					beforeExecutionCount = beforeExecutionCount + 1
				}
				
				it "should be executed before each test (1)"{
					beforeExecutionCount.should.be(1)
				}	
				
				it "should be executed before each test (2)"{
					beforeExecutionCount.should.be(2)
				}	
			}
		'
		spec.execute.should.be(successful)
	}

}