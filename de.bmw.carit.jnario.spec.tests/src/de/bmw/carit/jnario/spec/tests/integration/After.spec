package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*

import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*


/**
 * @author Sebastian Benz
 */
describe "After" {
 
	it "should be executed after each test"{
		val spec = '
			package bootstrap 
			
			describe "After"{
				
				static int afterExecutionCount = 0
				
				it "should be executed after each test (1)"{
					afterExecutionCount.should.be(0)
				}	
				
				it "should be executed after each test (2)"{
					afterExecutionCount.should.be(1)
				}
				
				it "should be executed after each test (3)"{
					afterExecutionCount.should.be(2)
				}	
				
				after{
					afterExecutionCount = afterExecutionCount + 1
				}
			}
		'
		spec.execute.should.be(successful)
	}

}