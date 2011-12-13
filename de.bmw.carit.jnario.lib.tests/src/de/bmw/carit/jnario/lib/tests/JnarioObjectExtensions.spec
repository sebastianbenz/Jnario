package de.bmw.carit.jnario.lib.tests

import static de.bmw.carit.jnario.lib.JnarioObjectExtensions.*
import de.bmw.carit.jnario.lib.Specification
import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.*
import de.bmw.carit.jnario.lib.JnarioObjectExtensions
import de.bmw.carit.jnario.lib.ISpecification

describe JnarioObjectExtensions{

	context should{
		
		it "should return a specification with the input value that evaluates to true" {
			val spec = should("input")
			assertThat(spec.evaluate(true), is(true))
			assertThat(spec.evaluate(false), is(false))
		}
		 
	}  
	 
	context be{
		
		it "should compare its two inputs"{
			val spec = new Specification(true, newArrayList())
			spec.be(true)
			 
			try{
				spec.be(false)
				fail("no exception")
			}catch(AssertionError e){
				// expected 
			}
		}
		
	} 
	
	context not{
		
		it "should return the negated specification"{
			var ISpecification spec = new Specification(true, newArrayList())
			spec = not(spec)
			assertThat(spec.evaluate(true), is(false))
			assertThat(spec.evaluate(false), is(true))
		}
		
	}
	
	describe "Combining Matchers"{
		
		it "should & be"{
			true.should.be(true)
			
			try{
				true.should.be(false)
				fail("no exception")
			}catch(AssertionError e){
				// expected
			}
		}
		
		it "should, not & be"{
			true.should.not.be(false)
			true.should.not.not.be(true)
			
			try{
				true.should.not.be(true)
				fail("no exception")
			}catch(AssertionError e){
				// expected
			}
		} 
		
	}
	
	//describe "Should by any"{
	//	
	//	it "one of the matcher must be true"{
	//		true.should.be.any(true, false)
	//		
	//		try{
	//			true.should.be.any(false, false)
	//			
	//			true.should.be(true).be(false)
	//			fail("no exception")
	//		}catch(AssertionError e){
	//			// expected
	//		}
	//	}
	//	
	//}

}