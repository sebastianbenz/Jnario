/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.naming

import org.jnario.runner.InstantiateWith
import org.jnario.spec.spec.ExampleGroup
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.jnario.test.util.ModelStore

import static org.jnario.jnario.test.util.Query.*

import org.jnario.spec.spec.Example
import org.jnario.spec.spec.Before
import org.jnario.spec.spec.After
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.ExampleTable


@InstantiateWith(typeof(SpecTestInstantiator))
describe ExampleNameProvider{
	 
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
		
		it "should append the description"{
			secondJavaClassName("describe org.junit.Assert{
										context 'assertTrue' 
								 }").should.endWith('AssertTrueSpec')
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
  
  	context toJavaClassName(ExampleTable){
  		
  		it "should combine example and parent name"{
  			
	  		val exampleTable = '''
				describe 'My Context'{
					def MyExample{
					}
				}
			'''.parse.first(typeof(ExampleTable))
			
			subject.toJavaClassName(exampleTable).should.be("MyContextSpecMyExample")
  		}
  		
  		it "should convert example name to first upper"{
  			
	  		val exampleTable = '''
				describe 'My Context'{
					def myExample{
					}
				}
			'''.parse.first(typeof(ExampleTable))
			
			subject.toJavaClassName(exampleTable).should.be("MyContextSpecMyExample")
  		}
  	}
  
  	context toMethodName(Example){
  		
  		it "should convert method description to camel case starting in lowercase"{
			each(
				firstMethodName("'my example'"),
				firstMethodName("'my\nexample'"),
				firstMethodName("'my\texample'"),
				firstMethodName("'my_example'") 
			).should.be('myExample')
		} 
		
		def firstMethodName(String content){
			val contentWithContext = "describe 'Context'{ it " + content + "}"
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
  	

	context "toFieldName(ExampleTable)"{
		
		it "should use the example name"{
			val exampleTable = '''
				describe 'My Context'{
					def myExample{
					}
				}
			'''.parse.first(typeof(ExampleTable))
			subject.toFieldName(exampleTable).should.be("myExample")
		}
		 
		it "should use 'examples' if no name is given"{
			val exampleTable = '''
				describe 'My Context'{
					def{
					}
				}
			'''.parse.first(typeof(ExampleTable))
			subject.toFieldName(exampleTable).should.be("examples")
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
		
		it "should use the description"{
			describeFirst("'should do stuff' {true}").should.be("should do stuff")
		}
		
		it "should use the exception"{
			describeFirst("throws IllegalArgumentException {true}").should.be("throws IllegalArgumentException")
		}
		
		it "should combine exception and description"{
			describeFirst("throws IllegalArgumentException 'should be described' {true}").should.be("throws IllegalArgumentException should be described")
		}
		
		it "apppends '[PENDING]' to pending example descriptions"{
			describeFirst("'should do stuff'").should.be("should do stuff [PENDING]")
			describeFirst("'should do stuff'{}").should.be("should do stuff [PENDING]")
		}
		
		def describeFirst(String content){
			val contentWithExampleGroup = "describe 'Example'{ it " + content + "}"
			subject.^describe(parse(contentWithExampleGroup).first(typeof(Example)))
		}
	}
	
  	def parse(CharSequence content){
		val contentWithPackage = "package test\n" + content
		val modelStore = ModelStore::create
		modelStore.parseSpec(contentWithPackage)
		return query(modelStore)
	}
}  