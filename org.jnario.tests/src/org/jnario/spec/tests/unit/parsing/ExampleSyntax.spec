package org.jnario.spec.tests.unit.parsing

describe "Specs Syntax"{
	
	describe "Example Syntax - Bullet Point Style"{
		/* semicolon is necessary, because the initialization 
		   expression collides with the begin of the next example */
		int exampleField = 0;
		
		- "no expression"
		- "block expression"{
			val list = newArrayList()
			list.size => 0
		}
		- "single line expression" [assert true]
		- "empty single line expression" [""]
		- throws Exception "single line expression with 'throws'" [throw new Exception]
		- throws Exception "block expression with 'throws'"{
			throw new Exception
		}
		// single line expression that throws an exception
		- throws Exception [throw new Exception]
		// block expression that throws an exception
		- throws Exception {
			throw new RuntimeException
		}
			 
	}
	
	describe "Example Syntax - 'it' Style"{
		
		int exampleField = 0
		
		it "can have no expression"
		it "can have a block expression"{
			val list = newArrayList()
			list.size => 0
		}
		it "can have a single line expression" [assert true]
		it throws Exception "single line expression with 'throws'" [throw new Exception]
		it throws Exception "block expression with 'throws'"{
			throw new Exception
		}
		// single line expression that throws an exception
		it throws Exception [throw new Exception]
		// block expression that throws an exception
		it throws Exception {
			throw new RuntimeException
		}
			 
	}
	
} 