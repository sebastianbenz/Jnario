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
import static org.hamcrest.CoreMatchers.*
import static org.hamcrest.Matchers.*
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
      firstJavaClassName("describe 'My Example'") should not (hasItem(" "))
    }  
      
    it "should append 'Spec' to class name"{ 
      firstJavaClassName("describe 'My Example'") => endsWith('Spec') 
    }  
      
    it "should prepend target type name"{
      firstJavaClassName("describe org.junit.Assert 'My Example'") => startsWith("Assert")
    }  
    
    
    it "should convert description to camel case"{
      newArrayList(
        "describe 'my example'",
        "describe 'my\nexample'",
        "describe 'my\texample'",
        "describe 'my_example'" 
      ).forEach[
        firstJavaClassName(it) => is('MyExampleSpec')
      ] 
    } 
      
    it "should append the target operation's name and params"{
      secondJavaClassName(
        '''
        describe org.junit.Assert{
              context assertTrue(boolean) 
        }
        ''') => endsWith('AssertTrueBooleanSpec')
    }
    
    it "should append the description"{
      secondJavaClassName(
      '''
        describe org.junit.Assert{
          context 'assertTrue' 
        }
      ''') => endsWith('AssertTrueSpec')
    }
    
    it "should prepend the parent ExampleGroup's name"{
      secondJavaClassName(
      '''
      describe org.junit.Assert{
        context assertTrue(boolean) 
      }
      ''') => is('AssertAssertTrueBooleanSpec')
    }
                
    def firstJavaClassName(CharSequence content){
      subject.toJavaClassName(parse(content).first(typeof(ExampleGroup)))
    }
    
    def secondJavaClassName(CharSequence content){
      subject.toJavaClassName(parse(content).second(typeof(ExampleGroup)))
    }
    
  }      
  
    context toJavaClassName(ExampleTable){
      
      it "should combine example and parent name"{
        
        exampleTableClassName('''
        describe 'My Context'{
          def MyExample{
          }
        }
        ''') => is("MyContextSpecMyExample")
      }
      
      it "should convert example name to first upper"{
        exampleTableClassName('''
        describe 'My Context'{
          def myExample{
          } 
        }
        ''') => is("MyContextSpecMyExample")
      }
      
      def exampleTableClassName(CharSequence s){
        val exampleTable = s.parse.first(typeof(ExampleTable))
        subject.toJavaClassName(exampleTable)
      }
    }
  
    context toMethodName(Example){
      
      it "should convert method description to camel case starting in lowercase"{
        newArrayList(
          "'my example'",
          "'my\nexample'",
          "'my\texample'",
          "'my_example'"
        ).forEach[
         firstMethodName(it) => is('myExample')
        ] 
      } 
    
      def firstMethodName(String content){
        val contentWithContext = "describe 'Context'{ it " + content + "}"
        subject.toMethodName(parse(contentWithContext).first(typeof(Example)))
      }
    }
    
    context toMethodName(Before){
      
      it "should convert before description to camel case starting in lowercase"{
        newArrayList(
          "before 'my example'",
          "before 'my\nexample'",
          "before 'my\texample'",
          "before 'my_example'" 
        ).forEach[
          firstMethodName => is('myExample')
        ] 
      } 
      
      it "should use before as default name"{
        firstMethodName("before{}") => is("before")
      }
      
      it "should enumerate befores without description"{
        secondMethodName("before{}
                 before{}") => is("before2")
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
      newArrayList(
        "after 'my example'",
        "after 'my\nexample'",
        "after 'my\texample'",
        "after 'my_example'" 
      ).forEach[
       firstMethodName => is('myExample')
      ] 
      } 
      
      it "should use after as default name"{
        firstMethodName("after{}") => is("after")
      }
      
      it "should enumerate afters without description"{
        secondMethodName("after{}
                 after{}") => is("after2")
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
      subject.toFieldName(exampleTable) => is("myExample")
    }
     
    it "should use 'examples' if no name is given"{
      val exampleTable = '''
        describe 'My Context'{
          def{
          }
        }
      '''.parse.first(typeof(ExampleTable))
      subject.toFieldName(exampleTable) => is("examples")
    }
    
  }
 
  context ^describe(ExampleGroup){
    
    it "should use the description"{
      describeFirst("describe 'My Description'") => is("My Description")
    }
    
    it "should use the target type"{
      describeFirst("describe org.junit.Assert") => is("Assert")
    }
    
    it "should combine target type and description"{
      describeFirst("describe org.junit.Assert 'and more'") => is("Assert and more")
    }
    
    it "should use the target operation"{
      describeSecond("describe org.junit.Assert{
                    context assertTrue(boolean) 
                 }") => is("assertTrue[boolean]")
    }
    
    it "should combine target operation and description"{
      describeSecond("describe org.junit.Assert{
                    context assertTrue(boolean) 'and more'
                 }") => is("assertTrue[boolean] and more")
    }
    
    it "should escape quotes"{
      val text = '''describe 'Example'{
                    describe 'and "more"'
                 }'''.toString
      describeSecond(text) => is('and \\"more\\"')
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
      describeFirst("'should do stuff' {true}") => is("should do stuff")
    }
    
    it "should use the exception"{
      describeFirst("throws IllegalArgumentException {true}") => is("throws IllegalArgumentException true")
    }
    
    it "should combine exception and description"{
      describeFirst("throws IllegalArgumentException 'should be described' {true}") => is("throws IllegalArgumentException should be described")
    }
    
    it "apppends '[PENDING]' to pending example descriptions"{
      describeFirst("'should do stuff'") => is("should do stuff [PENDING]")
      describeFirst("'should do stuff'{}") => is("should do stuff [PENDING]")
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