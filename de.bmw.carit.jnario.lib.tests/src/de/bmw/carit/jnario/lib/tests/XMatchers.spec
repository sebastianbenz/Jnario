package de.bmw.carit.jnario.lib.tests

import java.util.List
import de.bmw.carit.jnario.lib.*
import static org.hamcrest.CoreMatchers.*
import org.hamcrest.Matcher
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1

/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe XMatchers{
	
	describe Object{
		
		context "be"{
			it "passes if two objects are equal"{
				"hello".should.be("hello")
			}
			
			it throws AssertionError "if two objects are *not* equal"{
				"hello".should.be("world")
			}
			
			it "described with 'is \"value\"'"{
				errorMessage["hello".should.be("world")].should.be(
				'\nExpected: is \"world\"\n' +
     			'     got: \"hello\"\n'
				)
			}
		}
		
		context "not"{
			
			it "passes if two objects are *not* equal"{
				"hello".should.not.be("world")
			}
			
			it throws AssertionError "if two objects are equal"{
				"hello".should.not.be("hello")
			}
			
			it "described with 'is not \"value\"'"{
				errorMessage["hello".should.not.be("hello")].should.contain('is not "hello"')
				errorMessage["hello".should.not.not.be("world")].should.contain('is not not "world"')
				errorMessage["world".should.not.not.be.not("world")].should.contain('is not not is not "world"')
			}
			
		}
		
		context "each"{
			
			it "passes if all objects match"{
				each("blue", "black").should.startWith("b")
			}
			
			it throws AssertionError "if one of the objects does *not* match"{
				each("blue", "yellow").should.startWith("b")				
			}
			
		}
	}
	 
	describe Class{
		
		context "be"{
			it "passes if object is instance of the given class"{
				"hello".should.be(typeof(String))
			}
			
			it throws AssertionError "if object is *not* an instance of the given class"{
				true.should.be(typeof(String))
			}
			
			it "described with 'is an instance of type"{
				errorMessage[true.should.be(typeof(String))].should.contain('is an instance of java.lang.String')
			}
		}
		
		context "not"{
			it "passes if an object is *not* an instance of the given type"{
				"hello".should.not.be(typeof(Boolean))
			}
			
			it throws AssertionError "if the object is an instance of the given type"{
				"hello".should.not.be(typeof(String))
			}
			
			it "described with 'is not an instance of type'"{
				errorMessage["".should.not.be(typeof(String))].should.contain('is not an instance of java.lang.String')
			} 
		}
		
	}  
	
	describe Matcher{
		
		context "be"{
			it "passes if given Matcher does match"{
				"hello".should.be(equalTo("hello"))
			}
			
			it  throws AssertionError "if given matcher does not match"{
				"hello".should.be(equalTo("world"))
			}
		}
		
		context "not"{
			it "passes if given Matcher does *not* match"{
				"hello".should.not(equalTo("world"))
			}
			
			it throws AssertionError "if given matcher does match"{
				"hello".should.not(equalTo("hello"))
			}
		}
		
	}
	
	describe Iterable{
		
		List<String> subject = newArrayList("blue", "green", "red")
		
		context "contain"{
			
			it "passes if given iterable contains all elements"{
				subject.should.contain("blue", "green")
			}
			
			it throws AssertionError "if given iterable does not contain all elements"{
				subject.should.contain("blue", "yellow")
			}

			it "passes if iterable's elements match all given matchers"{
				subject.should.contain(equalTo("blue"), equalTo("green"))
			}
		}
	}
	
	describe String{
		
		context "endWith"{
			
			it "should pass if a string ends with the given string"{
				"hello".should.endWith("llo")
			}
			
			it throws AssertionError "if string *not* ends with the given string"{
				"hello".should.endWith("he")
			}
		}
		
		context "startWith"{
		
			it "passes if string starts with the specified string"{
				"hello".should.startWith("hell")
			}
			
			it throws AssertionError "if string starts *not* with the specified string"{
				"hello".should.startWith("lo")
			}
		}
		
		context "contain"{
		
			it "passes if string contains the specified string"{
				"hello".should.contain("ell")
			}
			
			it throws AssertionError "fails if string does *not* contain the specified string"{
				"hello".should.contain("helo")
			}
		}
	}
	
	describe Exception{
		
		context "expect"{
			
			it "passes if exception with expected type is thrown"{
				expect(typeof(IllegalArgumentException))[
					throw new IllegalArgumentException()
				]
			}
			
			it throws AssertionError " if no exception is thrown"{
				expect(typeof(IllegalArgumentException))[
					// do nothing
				]
			}
			
			it throws AssertionError " if exception of wrong type is thrown"{
				expect(typeof(IllegalArgumentException))[
					throw new RuntimeException()
				]
			}
		}
		
	}
	
	describe "Custom Matchers"{
		
		context "matches"{
			
			it "accepts custom matcher definition"{
				"hello".should.match("desc")[String s | "hello" == s]
			}   
			
			it throws AssertionError "if the custom matcher fails"{
				"hello".should.match("desc")[String s | "world" == s]
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