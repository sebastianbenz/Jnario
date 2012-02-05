package de.bmw.carit.jnario.spec.tests.unit.naming

import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import de.bmw.carit.jnario.tests.util.ModelStore

import static de.bmw.carit.jnario.tests.util.Query.*

import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.Before
import de.bmw.carit.jnario.spec.spec.After
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider


@InstantiateWith(typeof(SpecTestInstantiator))
describe ExampleNameProvider{
	 
	ExampleNameProvider subject = new ExampleNameProvider()
 
	context toJavaClassName{ 
		
		"should remove all white spaces from ExampleGroup's description"{
			firstJavaClassName("describe 'My Example'").should.not.contain(" ")
		}  
		 
		"should append 'Spec' to class name"{ 
			firstJavaClassName("describe 'My Example'").should.endWith('Spec') 
		}  
		  
		"should prepend target type name"{
			firstJavaClassName("describe org.junit.Assert 'My Example'").should.startWith("Assert")
		}  
		
		"should convert description to camel case"{
			each(
				firstJavaClassName("describe 'my example'"),
				firstJavaClassName("describe 'my\nexample'"),
				firstJavaClassName("describe 'my\texample'"),
				firstJavaClassName("describe 'my_example'") 
			).should.be('MyExampleSpec')
		} 
		  
		"should append the target operation's name and params"{
			secondJavaClassName("describe org.junit.Assert{
										context assertTrue(boolean) 
								 }").should.endWith('AssertTrueBooleanSpec')
		}
		
		"should append the description"{
			secondJavaClassName("describe org.junit.Assert{
										context 'assertTrue' 
								 }").should.endWith('AssertTrueSpec')
		}
		
		"should prepend the parent ExampleGroup's name"{
			secondJavaClassName("describe org.junit.Assert{
									context assertTrue(boolean) 
								}").should.be('AssertAssertTrueBooleanSpec')
		}
		            
		def firstJavaClassName(String content){
			subject.toJavaClassName(parse(content).first(typeof(ExampleGroup)))
		}
		
		def secondJavaClassName(String content){
			subject.toJavaClassName(parse(content).second(typeof(ExampleGroup)))
		}
		
	}      
  
  	context toMethodName(Example){
  		
  		"should convert method description to camel case starting in lowercase"{
			each(
				firstMethodName("'my example'"),
				firstMethodName("'my\nexample'"),
				firstMethodName("'my\texample'"),
				firstMethodName("'my_example'") 
			).should.be('myExample')
		} 
		
		def firstMethodName(String content){
			val contentWithContext = "describe 'Context'{" + content + "}"
			subject.toMethodName(parse(contentWithContext).first(typeof(Example)))
		}
  	}
  	
  	context toMethodName(Before){
  		
  		"should convert before description to camel case starting in lowercase"{
			each(
				firstMethodName("before 'my example'"),
				firstMethodName("before 'my\nexample'"),
				firstMethodName("before 'my\texample'"),
				firstMethodName("before 'my_example'") 
			).should.be('myExample')
		} 
		
		"should use before as default name"{
			firstMethodName("before{}").should.be("before")
		}
		
		"should enumerate befores without description"{
			secondMethodName("before{}
							 before{}").should.be("before2")
		}
		
		def firstMethodName(String content){
			val contentWithContext = "describe 'Context'{" + content + "}"
			subject.toMethodName(parse(contentWithContext).first(typeof(Before)))
		}
		
		def secondMethodName(String content){
			val contentWithContext = "describe 'Context'{" + content + "}"
			subject.toMethodName(parse(contentWithContext).second(typeof(Before)))
		}
  	} 
  	
  	context toMethodName(After){
  		
  		"should convert after description to camel case starting in lowercase"{
			each(
				firstMethodName("after 'my example'"),
				firstMethodName("after 'my\nexample'"),
				firstMethodName("after 'my\texample'"),
				firstMethodName("after 'my_example'") 
			).should.be('myExample')
		} 
		
		"should use after as default name"{
			firstMethodName("after{}").should.be("after")
		}
		
		"should enumerate afters without description"{
			secondMethodName("after{}
							 after{}").should.be("after2")
		}
		
		def firstMethodName(String content){
			val contentWithContext = "describe 'Context'{" + content + "}"
			subject.toMethodName(parse(contentWithContext).first(typeof(After)))
		}
		
		def secondMethodName(String content){
			val contentWithContext = "describe 'Context'{" + content + "}"
			subject.toMethodName(parse(contentWithContext).second(typeof(After)))
		}
  	} 

	context ^describe(ExampleGroup){
		
		"should use the description"{
			describeFirst("describe 'My Description'").should.be("My Description")
		}
		
		"should use the target type"{
			describeFirst("describe org.junit.Assert").should.be("Assert")
		}
		
		"should combine target type and description"{
			describeFirst("describe org.junit.Assert 'and more'").should.be("Assert and more")
		}
		
		"should use the target operation"{
			describeSecond("describe org.junit.Assert{
										context assertTrue(boolean) 
								 }").should.be("assertTrue[boolean]")
		}
		
		"should combine target operation and description"{
			describeSecond("describe org.junit.Assert{
										context assertTrue(boolean) 'and more'
								 }").should.be("assertTrue[boolean] and more")
		}
		
		"should escape quotes"{
			val text = '''describe 'Example'{
										describe 'and "more"'
								 }'''.toString
			describeSecond(text).should.be('and \\"more\\"')
		}
		
		def describeFirst(String content){
			subject.^describe(parse(content).first(typeof(ExampleGroup)))
		}
		
		def describeSecond(String content){
			subject.^describe(parse(content).second(typeof(ExampleGroup)))
		}
	}  
	
	context ^describe(Example){
		
		"should use the description"{
			describeFirst("'should do stuff' {true}").should.be("should do stuff")
		}
		
		"should use the exception"{
			describeFirst("throws IllegalArgumentException {true}").should.be("throws IllegalArgumentException")
		}
		
		"should combine exception and description"{
			describeFirst("throws IllegalArgumentException 'should be described' {true}").should.be("throws IllegalArgumentException should be described")
		}
		
		"apppends Ô[PENDING]' to pending example descriptions"{
			describeFirst("'should do stuff'").should.be("should do stuff [PENDING]")
			describeFirst("'should do stuff'{}").should.be("should do stuff [PENDING]")
		}
		
		def describeFirst(String content){
			val contentWithExampleGroup = "describe 'Example'{" + content + "}"
			subject.^describe(parse(contentWithExampleGroup).first(typeof(Example)))
		}
	}
	
  	def parse(String content){
		val contentWithPackage = "package test\n" + content
		val modelStore = ModelStore::create
		modelStore.parseSpec(contentWithPackage)
		return query(modelStore)
	}
}  