/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.jnario.jnario.test.util.SpecExecutor.*
import static org.junit.Assert.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import org.jnario.spec.spec.ExampleGroup
/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe ExampleGroup {
  
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
	
	it "should be able to declare helper methods"{
		val spec = '
			package bootstrap
									
			package test

			describe "ExampleGroup" {
			
				int i = 0
			
				it "should be able to declare void helper methods"{
					inc()
					i => 1
				}
				
				def void inc(){
					i = i + 1 
				}  
				
				it "should be able to declare helper methods with parameter and return type"{
					inc2(i) => 1 
				}
				
				it "should be able to use helper methods as extensions"{
					i.inc2 => 1 
				}
				  
				def int inc2(int value){
					value + 1 
				}
				
				it "should be able to declare helper methods with inferred return type"{
					// will not compile otherwise
				}
				
				def int inc3(){
					5
				}
				
				- "should automatically rethrow all exceptions"{
					// will not compile otherwise
				}
				  
				def inc4(){
					throw new java.io.IOException()
				}
			
				describe "Nested Examples"{
					
					it "should support extensions methods from parent example group"{
						i.inc2 => 1 
					}
					
					it "should support extension methods from nested example group"{
						i.inc5 => 1 
					}
					
					def inc5(int value){
						value + 1 
					}
				}
			   
			} 
		'
		assertThat(execute(spec), successful)
	}
	
}
	