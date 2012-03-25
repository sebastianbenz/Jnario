package org.jnario.spec.tests.unit.parsing

import java.util.Collections

describe "Specs Syntax"{
	
	/* fields */
	String exampleField = ""
	static String staticField = ""
	extension Collections
	extension Collections extensionWithName
	
	/* facts */
	fact "no expression"
	fact "block expression"{
		val list = newArrayList()
		list.size => 0
	}
	// single expression without description
	fact "hello" should be "hello"
	
	/* Contexts */
	context "sub-context"{
		fact "context can be nested"	
		
		context "sub-sub-context 1"{  
			fact "context can be nested"			 
		}
		context "sub-sub-context 2 "{ 
			fact "context can be nested"			 
		}		 
	}
	context "Another sub-context"{
		fact "multiple sub contexts per file"
	}
	
	/* assertions */
	fact assert 1 == 1
	fact 1 => 1
	fact 1 should 1
	fact 1 should not 2
	fact 1 should be 1
	fact 1 should not be 2
	fact {1 / 0} throws RuntimeException

	/* Helper Methods */
	def method(String aParam, String anotherParam){
		return ""
	}
	def String methodWithReturnType(String aParam, String anotherParam){
		return ""
	}
	
	/* Setup & Tear Down */
	before exampleField = "new value"
	before {
		exampleField = "a block"
	}
	before all{
		staticField = "new static field value"
	}
	after exampleField = "new value"
	after {
		exampleField = "a block"
	}
	after all{
		staticField = "new static field value"
	}
	
} 