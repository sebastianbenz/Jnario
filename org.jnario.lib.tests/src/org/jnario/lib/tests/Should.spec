/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib.tests

import java.util.List
import org.jnario.lib.*
import static org.hamcrest.CoreMatchers.*
import org.hamcrest.Matcher
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1

/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe Should{
	
	describe Object{
		
		context "be"{
			fact "passes if two objects are equal"{
				"hello".^should.^be("hello")
			}
			
			fact "throws AssertionError if two objects are *not* equal"{
				"hello".^should.^be("world") throws AssertionError
			}
			
			fact "described with 'is \"value\"'"{
				errorMessage["hello".^should.^be("world")].^should.^be(
				'\nExpected: is \"world\"\n' +
     			'     got: \"hello\"\n'
				)
			}
		}
		
		context "not"{
			
			fact "passes if two objects are *not* equal"{
				"hello".^should.not.^be("world")
			}
			
			fact "throws AssertionError if two objects are equal"{
				"hello".^should.not.^be("hello") throws AssertionError
			}
			
			fact "described with 'is not \"value\"'"{
				errorMessage["hello".^should.not.^be("hello")].^should.contain('is not "hello"')
				errorMessage["hello".^should.not.not.^be("world")].^should.contain('is not not "world"')
				errorMessage["world".^should.not.not.^be.not("world")].^should.contain('is not not is not "world"')
			}
			
		}
		
		context "each"{
			
			fact "passes if all objects match"{
				each("blue", "black").^should.startWith("b")
			}
			
			fact "throws AssertionError if one of the objects does *not* match"{
				each("blue", "yellow").^should.startWith("b") throws AssertionError		
			}
			
		}
	}
	 
	describe Class{
		
		context "be"{
			fact "passes if object is instance of the given class"{
				"hello".^should.^be(typeof(String))
			}
			
			fact "throws AssertionError if object is *not* an instance of the given class"{
				true.^should.^be(typeof(String)) throws AssertionError
			}
			
			fact "described with 'is an instance of type"{
				errorMessage[true.^should.^be(typeof(String))].^should.contain('is an instance of java.lang.String')
			}
		}
		
		context "not"{
			fact "passes if an object is *not* an instance of the given type"{
				"hello".^should.not.^be(typeof(Boolean))
			}
			
			fact "throws AssertionError if the object is an instance of the given type"{
				"hello".^should.not.^be(typeof(String))  throws AssertionError
			}
			
			fact "described with 'is not an instance of type'"{
				errorMessage["".^should.not.^be(typeof(String))].^should.contain('is not an instance of java.lang.String')
			} 
		}
		
	}  
	
	describe Matcher{
		
		context "be"{
			fact "passes if given Matcher does match"{
				"hello".^should.^be(equalTo("hello"))
			}
			
			fact "throws assertion error if given matcher does not match"{
				"hello".^should.^be(equalTo("world"))  throws AssertionError
			}
		}
		
		context "not"{
			fact "passes if given Matcher does *not* match"{
				"hello".^should.not(equalTo("world"))
			}
			
			fact "throws AssertionError if given matcher does match"{
				"hello".^should.not(equalTo("hello"))  throws AssertionError
			}
		}
		
	}
	
	describe Iterable{
		
		List<String> subject = newArrayList("blue", "green", "red")
		
		context "contain"{
			
			fact "passes if given iterable contains all elements"{
				subject.^should.contain("blue", "green")
			}
			
			fact "throws AssertionError if given iterable does not contain all elements"{
				subject.^should.contain("blue", "yellow") throws AssertionError
			}

			fact "passes if iterable's elements match all given matchers"{
				subject.^should.contain(equalTo("blue"), equalTo("green"))
			}
		}
	}
	
	describe String{
		
		context "endWith"{
			
			fact "should pass if a string ends with the given string"{
				"hello".^should.endWith("llo")
			}
			
			fact "throws AssertionError if string *not* ends with the given string"{
				"hello".^should.endWith("he") throws AssertionError
			}
		}
		
		context "startWith"{
		
			fact "passes if string starts with the specified string"{
				"hello".^should.startWith("hell")
			}
			
			fact "throws AssertionError if string starts *not* with the specified string"{
				"hello".^should.startWith("lo") throws AssertionError
			}
		}
		
		context "contain"{
		
			fact "passes if string contains the specified string"{
				"hello".^should.contain("ell")
			}
			
			fact "throws AssertionError fails if string does *not* contain the specified string"{
				"hello".^should.contain("helo") throws AssertionError
			}
		}
	}
	
	describe Exception{
		
		context "expect"{
			
			fact "passes if exception with expected type is thrown"{
				expect(typeof(IllegalArgumentException))[
					throw new IllegalArgumentException()
				]
			}
			
			fact "throws AssertionError  if no exception is thrown"{
				expect(typeof(IllegalArgumentException))[
					// do nothing
				] 
			}
			
			fact "throws AssertionError  if exception of wrong type is thrown"{
				expect(typeof(IllegalArgumentException))[
					throw new RuntimeException()
				] 
			}
		}
		
	}
	
	describe "Custom Matchers"{
		
		context "matches"{
			
			fact "accepts custom matcher definition"{
				"hello".^should.match("desc")[String s | "hello" == s]
			}   
			
			fact "throws AssertionError if the custom matcher fails"{
				"hello".^should.match("desc")[String s | "world" == s]
			}
		}
		
	}  
	
	def String errorMessage(Procedures$Procedure1<SingleTargetMatcherChain<String>> proc){
		try{
			proc.apply(null)
			throw new AssertionError("expected AssertionError")
		}catch(AssertionError e){
			return e.message
		}
	} 
	
}