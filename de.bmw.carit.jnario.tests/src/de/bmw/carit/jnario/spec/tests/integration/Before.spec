package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*


import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*


/**
 * @author Sebastian Benz
 */
describe "Before" {
 
	it "should be executed before each test"{
		val spec = '
			package bootstrap
			 
			import de.bmw.carit.jnario.runner.Order
			
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