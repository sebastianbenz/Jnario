package org.jnario.jnario.tests.unit.report

import org.eclipse.xtext.util.StringInputStream
import org.jnario.report.Failed
import org.jnario.report.Passed
import org.jnario.report.SpecExecutionAcceptor
import org.jnario.report.SpecFailure
import org.jnario.report.SpecResultParser
import org.jnario.report.Pending

import static org.jnario.jnario.tests.unit.report.SpecResultParserSpec.*
import static org.mockito.Mockito.*

import static extension org.jnario.jnario.test.util.Strings.*
describe SpecResultParser{
	
	static val CLASSNAME = "demo.CalculatorSpec"
	static val NAME = "adding values"
	static val EXECUTION_TIME = 0.01
	static val FAILURE_MESSAGE = '''
									a message
									withnewline'''.platformIndependent
	static val FAILURE_TYPE = "java.lang.AssertionError"
	static val STACKTRACE = 
					'''	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:513)
					'''.platformIndependent

	static val XML_STACKTRACE = FAILURE_MESSAGE + "\n" + STACKTRACE
	
	val SpecExecutionAcceptor acceptor = mock(typeof(SpecExecutionAcceptor))
  
	fact "parses successfull specs from xml"{ 
		'''
		  <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»"/>
		'''.toXml.parse 
		
		verify(acceptor).accept(passingSpec)
	}  
	
	fact "parses specs with failure from xml"{ 
		'''
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»">
		   <failure message="«FAILURE_MESSAGE»" type="«FAILURE_TYPE»">«XML_STACKTRACE»</failure>
		   </testcase>
		'''.toXml.parse 
		
		verify(acceptor).accept(failingSpec)
	}
	
	fact "parses specs with error from xml"{ 
		'''
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»">
		   <error message="«FAILURE_MESSAGE»" type="«FAILURE_TYPE»">«XML_STACKTRACE»</error>
		   </testcase>
		'''.toXml.parse 
		
		verify(acceptor).accept(failingSpec)
	}
	
	fact "parses multiple spec results"{ 
		'''
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»"/>
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»">
		   <error message="«FAILURE_MESSAGE»" type="«FAILURE_TYPE»">«XML_STACKTRACE»</error>
		   </testcase>
		'''.toXml.parse 
		
		verify(acceptor).accept(passingSpec)
		verify(acceptor).accept(failingSpec)
	}
	
	fact "created pending results"{
		'''
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»">
		    <skipped/>
		   </testcase>
		'''.toXml.parse 
		
		verify(acceptor).accept(pendingSpec)
	}
	
	fact "decodes escaped strings"{
		'''
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="When I entered \&quot;50\&quot; and \&quot;70\&quot;"/>
		'''.toXml.parse 
		
		verify(acceptor).accept(new Passed(CLASSNAME, 'When I entered \\\"50\\\" and \\\"70\\\"', EXECUTION_TIME))
	}
	
	def passingSpec(){
		new Passed(CLASSNAME, NAME, EXECUTION_TIME)
	}
	
	def pendingSpec(){
		new Pending(CLASSNAME, NAME, EXECUTION_TIME)
	}
	
	def failingSpec(){
		new Failed(CLASSNAME, NAME, EXECUTION_TIME, newArrayList(new SpecFailure(FAILURE_MESSAGE, "java.lang.AssertionError", STACKTRACE)))
	}
	
	
	def toXml(CharSequence content)'''
		<?xml version="1.0" encoding="UTF-8" ?>
		<testsuite failures="1" time="0.017" errors="0" skipped="0" tests="1" name="example.AddingValuesSpec">
			«content»
		</testsuite>	
	'''
	
	def parse(CharSequence content){
		subject.parse(new StringInputStream(content.toString), acceptor)
	}
}