/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.naming

import org.jnario.ExampleTable
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.After
import org.jnario.spec.spec.Before
import org.jnario.spec.spec.Example
import org.jnario.spec.spec.ExampleGroup

import static org.hamcrest.Matchers.*
import static org.jnario.jnario.test.util.Query.*

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SpecTestCreator))
describe ExampleNameProvider {

  context "toJavaClassName(ExampleGroup)"{ 
    
    fact "should remove all white spaces from ExampleGroup's description"{
      firstJavaClassName("describe 'My Example'") should not contain " "
    }  
    fact "should append 'Spec' to class name"{ 
      firstJavaClassName("describe 'My Example'") => endsWith('Spec') 
    }  
    fact "should prepend target type name"{
      firstJavaClassName("describe org.junit.Assert 'My Example'") => startsWith("Assert")
    }  
    
    fact "should prepend unresolved target type name"{
      firstJavaClassName("describe Unresolved")              => startsWith("UnresolvedSpec")
      firstJavaClassName("describe java.Unresolved")         => startsWith("UnresolvedSpec")
      firstJavaClassName("describe Unresolved$SubClass")     => startsWith("SubClassSpec")
      firstJavaClassName("describe java.Unresolved<String>") => startsWith("UnresolvedSpec")
    }  
    
    fact "should convert description to camel case"{
      newArrayList(
        "describe 'my example'",
        "describe 'my\nexample'",
        "describe 'my\texample'",
        "describe 'my_example'" 
      ).forEach[
        firstJavaClassName(it) => 'MyExampleSpec'
      ] 
    } 
    
    fact "should prefix numbers"{
      val name = firstJavaClassName('''
      		describe "2 Facts"{}
      ''')
      name => '_2FactsSpec'
    }
    
     fact "should prefix numbers in nested specs"{
      val name = secondJavaClassName(
        '''
        describe "2 Facts"{
              context "Context"
        }
        ''')
      name => '_2FactsContextSpec'
    }
    
    fact "should append the target operation's name and params"{
      secondJavaClassName(
        '''
        describe org.junit.Assert{
              context assertTrue(boolean) 
        }
        ''') => endsWith('AssertTrueBooleanSpec')
    }
    fact "should append the description"{
      secondJavaClassName(
      '''
        describe org.junit.Assert{
          context 'assertTrue' 
        }
      ''') => endsWith('AssertTrueSpec')
    }
    fact "should prepend the parent ExampleGroup's name"{
      secondJavaClassName(
      '''
      describe org.junit.Assert{
        context assertTrue(boolean) 
      }
      ''') => 'AssertAssertTrueBooleanSpec'
    }
                
    def firstJavaClassName(CharSequence content){
      subject.toJavaClassName(parse(content + "{}").first(typeof(ExampleGroup)))
    }
    
    def secondJavaClassName(CharSequence content){
      subject.toJavaClassName(parse(content + "{}").second(typeof(ExampleGroup)))
    }
  }      
  
    context "toJavaClassName(ExampleTable)"{
      
      fact "should combine example and parent name"{
        exampleTableClassName('''
        describe 'My Context'{
          def MyExample{
          }
        }
        ''') => "MyContextSpecMyExample"
      }
      
      fact "should convert example name to first upper"{
        exampleTableClassName('''
        describe 'My Context'{
          def myExample{
          } 
        }
        ''') => "MyContextSpecMyExample"
      }
      
      def exampleTableClassName(CharSequence s){
        val exampleTable = s.parse.first(typeof(ExampleTable))
        subject.toJavaClassName(exampleTable)
      }
    }
  
    context "toMethodName(Example)"{
      
      fact "converts method description to camel case starting in lowercase"{
        newArrayList(
          "'my example'",
          "'my\nexample'",
          "'my\texample'",
          "'my_example'"
        ).forEach[
         firstMethodName(it) => '_myExample'
        ] 
      } 
      
      fact "shortens method name to 250 chars"{
      	firstMethodName(nameOfLength(251)).length => 250
      }
      
      def nameOfLength(int i){
      	var result = ""
      	for(j : 0..i){
      		result = result + "a"
      	}
      	result
      }
    
      def firstMethodName(String content){
        val contentWithContext = "describe 'Context'{ fact " + content + "}"
        subject.toMethodName(parse(contentWithContext).first(typeof(Example)))
      }
    }
    
    context "toMethodName(Before)"{
      
      fact "should convert before description to camel case starting in lowercase"{
        newArrayList(
          "before 'my example'",
          "before 'my\nexample'",
          "before 'my\texample'",
          "before 'my_example'" 
        ).forEach[
          firstMethodName => '_myExample'
        ] 
      }
       
      fact "should use before as default name"{
        firstMethodName("before{}") => "before"
      }

      fact "should use beforeAll as default name"{
        firstMethodName("before all{}") => "beforeAll"
      }
      
      
      fact "should enumerate before without description"{
        secondMethodName("before{}
                 before{}") => "before2"
      }
      
      fact "should enumerate nested before without description"{
        secondMethodName(
                "before{}
                 context{
                   before{}
                 }") => "before2"
      }
      
      fact "should enumerate nested before all without description"{
        secondMethodName(
                "before all{}
                 context{
                   before all{}
                 }") => "beforeAll2"
      }
      
      fact "should keep default name of nested before and before all"{
        secondMethodName(
                "before{}
                 context{
                   before all{}
                 }") => "beforeAll"
      }
      
      
      fact "should escape invalid names"{
        firstMethodName("before 'null'{}") => "_null"
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
    
    context "toMethodName(After)"{
      
      fact "should convert after description to camel case starting in lowercase"{
      newArrayList(
        "after 'my example'",
        "after 'my\nexample'",
        "after 'my\texample'",
        "after 'my_example'" 
      ).forEach[
       firstMethodName => '_myExample'
      ] 
      } 
      
      fact "should use after as default name"{
        firstMethodName("after{}") => "after"
      }
      
      fact "should use afterAll as default name"{
        firstMethodName("after all{}") => "afterAll"
      }
      
      fact "should enumerate after without description"{
        secondMethodName("after{}
                 after{}") => "after2"
      }
      
      fact "should enumerate nested after without description"{
        secondMethodName(
                "after{}
                 context{
                   after{}
                 }") => "after2"
      }
      
      fact "should enumerate nested after all without description"{
        secondMethodName(
                "after all{}
                 context{
                   after all{}
                 }") => "afterAll2"
      }
      
      fact "nested after and after all keep their default name"{
        secondMethodName(
                "after{}
                 context{
                   after all{}
                 }") => "afterAll"
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
    
    fact "should use the example name"{
      val exampleTable = '''
        describe 'My Context'{
          def myExample{
          }
        }
      '''.parse.first(typeof(ExampleTable))
      subject.toFieldName(exampleTable) => "myExample"
    }
     
    fact "should use 'examples' if no name is given"{
      val exampleTable = '''
        describe 'My Context'{
          def{
          }
        }
      '''.parse.first(typeof(ExampleTable))
      subject.toFieldName(exampleTable) => "examples"
    }
    
  }
 
  context "describe(ExampleGroup)"{
    
    fact "should use the description"{
      describeFirst("describe 'My Description'") => "My Description"
    }
    
    fact "should use the target type"{
      describeFirst("describe org.junit.Assert") => "Assert"
    }
    
    fact "should use the unresolved target type"{
      describeFirst("describe Unresolved") => "Unresolved"
      describeFirst("describe org.Unresolved") => "Unresolved"
    }
    
    fact "should combine target type and description"{
      describeFirst("describe org.junit.Assert 'and more'") => "Assert and more"
    }
    
    fact "should use the target operation"{
      describeSecond("describe org.junit.Assert{
                    context assertTrue(boolean) {}
                 }") => "assertTrue[boolean]"
    }
    
    fact "should combine target operation and description"{
      describeSecond("describe org.junit.Assert{
                    context assertTrue(boolean) 'and more'{}
                 }") => "assertTrue[boolean] and more"
    }
    
    fact "should escape quotes"{
      val text = '''describe 'Example'{
                    describe 'and "more"'{}
                 }'''.toString
      describeSecond(text) => 'and \\"more\\"'
    }
    
     fact "should replace line breaks and leading whitespace with a single space"{
      val text = '''describe "Example\n\t 2"'''.toString
      describeFirst(text) => 'Example 2'
    }
    
    def describeFirst(String content){
      subject.^describe(parse(content + "{}").first(typeof(ExampleGroup)))
    }
    
    def describeSecond(String content){
      subject.^describe(parse(content).second(typeof(ExampleGroup)))
    }
  }  
  
  context "describe(Example)"{
    
    fact "should use the description"{
      describeFirst("'should do stuff' {true}") => "should do stuff"
    }
    
    fact "appends '[PENDING]' to pending example descriptions"{
      describeFirst("'should do stuff'") => "should do stuff [PENDING]"
      describeFirst("'should do stuff'{}") => "should do stuff [PENDING]"
    }
    
    def describeFirst(String content){
      val contentWithExampleGroup = "describe 'Example'{ fact " + content + "}"
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
  