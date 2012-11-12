package org.jnario.jnario.ui.tests.unit.quickfix

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.ui.quickfix.JavaMethodBuilder
import org.jnario.ui.quickfix.MethodBuilderProvider
import org.jnario.ui.quickfix.XtendMethodBuilder

import static org.junit.Assert.*

@CreateWith(typeof(SpecTestCreator))
describe "MethodBuilder" {
	
	@Inject extension ModelStore m
	@Inject MethodBuilderProvider builderProvider 
	
	XtendMethodBuilder builder 
	
	describe XtendMethodBuilder{
		
		fact "creates method with specified name"{
			setContext('''
				describe "Something"{
					fact myMethod()
				}
			''')
			generatedMethod.is('''
				def myMethod(){
				}
			''')
		}
		
		fact "adds method parameters"{
			setContext('''
				describe "Something"{
					fact myMethod(true, 4)
				}
			''')
			generatedMethod.is('''
				def myMethod(boolean b, int i){
				}
			''')
		}
		
		fact "ignores feature call target"{
			setContext('''
				describe "Something"{
					String x
					fact x.myMethod(true, 4)
				}
			''')
			generatedMethod.is('''
				def myMethod(boolean b, int i){
				}
			''')
		}
		
		fact "returns false for boolean"{
			setContext('''
				describe "Something"{
					boolean b = myMethod()
				}
			''')
			generatedMethod.is('''
				def myMethod(){
					return false
				}
			''')
		}
		
		fact "returns default value for numbers"{
			setContext('''
				describe "Something"{
					int i = myMethod()
				}
			''')
			generatedMethod.is('''
				def myMethod(){
					return 0
				}
			''')
		}
		
		fact "returns null for objects"{
			setContext('''
				describe "Something"{
					Object o = myMethod()
				}
			''')
			generatedMethod.is('''
				def myMethod(){
					return null
				}
			''')
		}
		
		fact "uses simple name for parameters"{
			setContext('''
				describe "Something"{
					Object o = myMethod(<String>newArrayList)
				}
			''')
			generatedMethod.is('''
				def myMethod(ArrayList<String> strings){
					return null
				}
			''')
		}
		
		fact "returns nothing if void"{
			setContext('''
				describe "Something"{
					fact myMethod()
				}
			''')
			generatedMethod.is('''
				def myMethod(){
				}
			''')
		}
		
		def setContext(CharSequence s){
			m.parseSpec(s)
			builder = builderProvider.newXtendMethodBuilder("myMethod", m.first(typeof(XAbstractFeatureCall)))
		}
	}
	
	describe JavaMethodBuilder{
		
		fact "creates public void method with specified name"{
			setContext('''
				describe "Something"{
					fact myMethod()
				}
			''')
			generatedMethod.is('''
				public void myMethod(){
				}
			''')
		}
		
		fact "adds method parameters"{
			setContext('''
				describe "Something"{
					fact myMethod(true, 4)
				}
			''')
			generatedMethod.is('''
				public void myMethod(boolean b, int i){
				}
			''')
		}
		
		fact "returns false for boolean"{
			setContext('''
				describe "Something"{
					boolean b = myMethod()
				}
			''')
			generatedMethod.is('''
				public boolean myMethod(){
					return false;
				}
			''')
		}
		
		fact "returns default value for numbers"{
			setContext('''
				describe "Something"{
					int i = myMethod()
				}
			''')
			generatedMethod.is('''
				public int myMethod(){
					return 0;
				}
			''')
		}
		
		fact "returns null for objects"{
			setContext('''
				describe "Something"{
					Object o = myMethod()
				}
			''')
			generatedMethod.is('''
				public Object myMethod(){
					return null;
				}
			''')
		}
		
		fact "returns nothing if void"{
			setContext('''
				describe "Something"{
					fact myMethod()
				}
			''')
			generatedMethod.is('''
				public void myMethod(){
				}
			''')
		}
		
		fact "generated no method body if interface"{
			setContext('''
				describe "Something"{
					fact myMethod()
				}
			''')
			builder.isInterface = true
			generatedMethod.is('''
				public void myMethod();''')
		}
		
		def setContext(CharSequence s){
			m.parseSpec(s)
			builder = builderProvider.newJavaMethodBuilder("myMethod", m.first(typeof(XAbstractFeatureCall)))
		}
	}
	
	
	def is(String actual, CharSequence expected){
		assertEquals(expected.toString, actual)
	}
	
	def generatedMethod(){
		val importManager = new ImportManager(true, ".".charAt(0))
		val content = new StringBuilderBasedAppendable(importManager)
		builder.build(content)
		content.toString
	}	

}