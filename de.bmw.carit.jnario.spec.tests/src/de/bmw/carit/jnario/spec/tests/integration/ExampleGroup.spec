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
	
	it "should be able to declare helper methods with return type"{
		val spec = '
			package bootstrap
									
			import static org.hamcrest.CoreMatchers.*
			
			describe "ExampleGroup" {
			
				int i = 0
			
				it "should be able to declare void helper methods"{
					inc()
					i.should.be(1)
				}
				
				def void inc(){
					i = i + 1 
				} 
				
				it "should be able to declare helper methods with param and return type"{
					inc2(i).should.be(1) 
				}
				  
				def int inc2(int value){
					value + 1 
				}
				
				it "should be able to declare helper methods with inferred return type"{
					inc3().should.be(5) 
				}
				
				def int inc3(){
					5
				}
				
				it "should automatically rethrow all exceptions"{
					// will not compile otherwise
				}
				  
				def inc4(){
					throw new java.io.IOException()
				}
						   
			} 
		'
		assertThat(execute(spec), successful)
	}
	
}
	