package org.jnario.jnario.tests.unit.report

import org.eclipse.xtext.util.StringInputStream
import org.jnario.report.Failed
import org.jnario.report.Passed
import org.jnario.report.SpecExecutionAcceptor
import org.jnario.report.SpecFailure
import org.jnario.report.SpecResultParser

import static org.jnario.jnario.tests.unit.report.SpecResultParserSpec.*
import static org.mockito.Mockito.*

describe SpecResultParser{
	
	static val CLASSNAME = "demo.CalculatorSpec"
	static val NAME = "adding values"
	static val EXECUTION_TIME = 0.01
	static val FAILURE_MESSAGE = "a message"
	static val FAILURE_TYPE = "java.lang.AssertionError"
	static val STACKTRACE = "the stacktrace"
	
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
		    <failure message="«FAILURE_MESSAGE»" type="«FAILURE_TYPE»">«STACKTRACE»</failure>
		   </testcase>
		'''.toXml.parse 
		
		verify(acceptor).accept(failingSpec)
	}
	
	fact "parses specs with error from xml"{ 
		'''
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»">
		    <error message="«FAILURE_MESSAGE»" type="«FAILURE_TYPE»">«STACKTRACE»</error>
		   </testcase>
		'''.toXml.parse 
		
		verify(acceptor).accept(failingSpec)
	}
	
	fact "parses multiple spec results"{ 
		'''
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»"/>
		   <testcase time="«EXECUTION_TIME»" classname="«CLASSNAME»" name="«NAME»">
		    <error message="«FAILURE_MESSAGE»" type="«FAILURE_TYPE»">«STACKTRACE»</error>
		   </testcase>
		'''.toXml.parse 
		
		verify(acceptor).accept(passingSpec)
		verify(acceptor).accept(failingSpec)
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
	
	def failingSpec(){
		new Failed(CLASSNAME, NAME, EXECUTION_TIME, newArrayList(new SpecFailure("a message", "java.lang.AssertionError", "the stacktrace")))
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