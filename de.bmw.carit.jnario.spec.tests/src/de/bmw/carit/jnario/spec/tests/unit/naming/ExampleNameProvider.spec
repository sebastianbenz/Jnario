package de.bmw.carit.jnario.spec.tests.unit.namin

import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.tests.util.SpecTestInstantiator
import de.bmw.carit.jnario.tests.util.ModelStore

import static de.bmw.carit.jnario.tests.util.Query.*

import static extension de.bmw.carit.jnario.lib.JnarioObjectExtensions.*
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.Before
import de.bmw.carit.jnario.spec.spec.After
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider


@InstantiateWith(typeof(SpecTestInstantiator))
describe ExampleNameProvider{
	 
	ExampleNameProvider subject = new ExampleNameProvider()
 
	context toJavaClassName{ 
		
		it "should remove all white spaces from ExampleGroup's description"{
			firstJavaClassName("describe 'My Example'").should.not.contain(" ")
		}  
		 
		it "should append 'Spec' to class name"{ 
			firstJavaClassName("describe 'My Example'").should.endWith('Spec') 
		}  
		  
		it "should prepend target type name"{
			firstJavaClassName("describe org.junit.Assert 'My Example'").should.startWith("Assert")
		}  
		
		it "should convert description to camel case"{
			each(
				firstJavaClassName("describe 'my example'"),
				firstJavaClassName("describe 'my\nexample'"),
				firstJavaClassName("describe 'my\texample'"),
				firstJavaClassName("describe 'my_example'") 
			).should.be('MyExampleSpec')
		} 
		  
		it "should append the target operation's name and params"{
			secondJavaClassName("describe org.junit.Assert{
										context assertTrue(boolean) 
								 }").should.endWith('AssertTrueBooleanSpec')
		}
		
		it "should prepend the parent ExampleGroup's name"{
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
  		
  		it "should convert method description to camel case starting in lowercase"{
			each(
				firstMethodName("it 'my example'"),
				firstMethodName("it 'my\nexample'"),
				firstMethodName("it 'my\texample'"),
				firstMethodName("it 'my_example'") 
			).should.be('myExample')
		} 
		
		def firstMethodName(String content){
			val contentWithContext = "describe 'Context'{" + content + "}"
			subject.toMethodName(parse(contentWithContext).first(typeof(Example)))
		}
  	}
  	
  	context toMethodName(Before){
  		
  		it "should convert before description to camel case starting in lowercase"{
			each(
				firstMethodName("before 'my example'"),
				firstMethodName("before 'my\nexample'"),
				firstMethodName("before 'my\texample'"),
				firstMethodName("before 'my_example'") 
			).should.be('myExample')
		} 
		
		it "should use before as default name"{
			firstMethodName("before{}").should.be("before")
		}
		
		it "should enumerate befores without description"{
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
  		
  		it "should convert after description to camel case starting in lowercase"{
			each(
				firstMethodName("after 'my example'"),
				firstMethodName("after 'my\nexample'"),
				firstMethodName("after 'my\texample'"),
				firstMethodName("after 'my_example'") 
			).should.be('myExample')
		} 
		
		it "should use after as default name"{
			firstMethodName("after{}").should.be("after")
		}
		
		it "should enumerate afters without description"{
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
		
		it "should use the description"{
			describeFirst("describe 'My Description'").should.be("My Description")
		}
		
		it "should use the target type"{
			describeFirst("describe org.junit.Assert").should.be("Assert")
		}
		
		it "should combine target type and description"{
			describeFirst("describe org.junit.Assert 'and more'").should.be("Assert and more")
		}
		
		it "should use the target operation"{
			describeSecond("describe org.junit.Assert{
										context assertTrue(boolean) 
								 }").should.be("assertTrue[boolean]")
		}
		
		it "should combine target operation and description"{
			describeSecond("describe org.junit.Assert{
										context assertTrue(boolean) 'and more'
								 }").should.be("assertTrue[boolean] and more")
		}
		
		it "should escape quotes"{
			describeSecond('''describe 'Example'{
										describe 'and "more"'
								 }''').should.be('and \\"more\\"')
		}
		
		def describeFirst(String content){
			subject.^describe(parse(content).first(typeof(ExampleGroup)))
		}
		
		def describeSecond(String content){
			subject.^describe(parse(content).second(typeof(ExampleGroup)))
		}
	}  
	
	context ^describe(Example){
		
		it "should use the description"{
			describeFirst("it 'should do stuff'").should.be("should do stuff")
		}
		
		it "should use the exception"{
			describeFirst("it throws IllegalArgumentException").should.be("throws IllegalArgumentException")
		}
		
		it "should combine exception and description"{
			describeFirst("it throws IllegalArgumentException 'should be described'").should.be("throws IllegalArgumentException should be described")
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