package de.bmw.carit.jnario.spec.tests.unit.naming

import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.tests.util.SpecTestInstantiator
import de.bmw.carit.jnario.tests.util.ModelStore

import static de.bmw.carit.jnario.tests.util.Query.*

import static extension de.bmw.carit.jnario.lib.JnarioObjectExtensions.*
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.naming.JavaNameProvider


@InstantiateWith(typeof(SpecTestInstantiator))
describe JavaNameProvider{
	 
	JavaNameProvider subject = new JavaNameProvider()

	context getJavaClassName(ExampleGroup){
		
		it "should remove all whitespaces from ExampleGroup's description"{
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
			subject.getJavaClassName(parse(content).first(typeof(ExampleGroup)))
		}
		
		def secondJavaClassName(String content){
			subject.getJavaClassName(parse(content).second(typeof(ExampleGroup)))
		}
		
		
	}      
  
  	context getExampleMethodName(Example){
  		
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
			subject.getExampleMethodName(parse(contentWithContext).first(typeof(Example)))
		}
  	}

  	def parse(String content){
		val contentWithPackage = "package test\n" + content
		val modelStore = ModelStore::create
		modelStore.parseSpec(contentWithPackage)
		return query(modelStore)
	}
}  