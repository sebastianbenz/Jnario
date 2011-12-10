package de.bmw.carit.jnario.spec.naming

import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.tests.util.SpecTestInstantiator
import de.bmw.carit.jnario.tests.util.ModelStore

import static de.bmw.carit.jnario.tests.util.Query.*

import static extension de.bmw.carit.jnario.lib.JnarioObjectExtensions.*


@InstantiateWith(typeof(SpecTestInstantiator))
describe JavaNameProvider{
	 
	JavaNameProvider subject = new JavaNameProvider()

	context #getJavaClassName(ExampleGroup){
		
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
			all(
				firstJavaClassName("describe 'my example'"),
				firstJavaClassName("describe 'my\nexample'"),
				firstJavaClassName("describe 'my\texample'"),
				firstJavaClassName("describe 'my_example'") 
			).should.be('MyExampleSpec')
		} 
		  
		it "should append the target operation's name and params"{
			secondJavaClassName("describe org.junit.Assert{
										describe #assertTrue(boolean) 
								 }").should.endWith('AssertTrueBooleanSpec')
		}
		
		it "should prepend the parent ExampleGroup's name"{
			secondJavaClassName("describe org.junit.Assert{
									describe #assertTrue(boolean) 
								}").should.be('AssertAssertTrueBooleanSpec')
		}
		            
		def firstJavaClassName(String content){
			subject.getJavaClassName(query(parse(content)).first(typeof(ExampleGroup)))
		}
		
		def secondJavaClassName(String content){
			subject.getJavaClassName(query(parse(content)).second(typeof(ExampleGroup)))
		}
		
		def parse(String content){
			val contentWithPackage = "package test\n" + content
			val modelStore = ModelStore::create
			modelStore.parseSpec(contentWithPackage)
			return modelStore
		}
	}      
  
}  