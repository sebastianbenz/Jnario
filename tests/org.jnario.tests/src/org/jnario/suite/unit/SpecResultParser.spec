package org.jnario.suite.unit

import org.eclipse.xtext.util.StringInputStream
import org.jnario.doc.ParseResultAcceptor
import org.jnario.doc.SpecExecution
import org.jnario.doc.SpecResultParser

import static org.jnario.lib.JnarioCollectionLiterals.*
import static org.mockito.Mockito.*

describe SpecResultParser{

	val ParseResultAcceptor acceptor = mock(typeof(ParseResultAcceptor))
 
	fact "parses successfull specs from xml"{ 
		'''
		<?xml version="1.0" encoding="UTF-8" ?>
		<testsuite failures="0" time="0" errors="0" skipped="0" tests="1" name="demo.CalculatorSuite">
		  <properties>
		    <property name="java.runtime.name" value="Java(TM) SE Runtime Environment"/>
		  </properties>
		  <testcase time="0.01" classname="demo.CalculatorSpec" name="adding values"/>
		</testsuite>
		'''.parse 
		
		verify(acceptor).accept(new SpecExecution("demo.CalculatorSpec", "adding values", 0.01, list))
	}
	
	pending fact "parses specs with failure from xml"{ 
		'''
		<?xml version="1.0" encoding="UTF-8" ?>
			<testsuite failures="1" time="0.017" errors="0" skipped="0" tests="1" name="example.AddingValuesSpec">
			  <testcase time="0.01" classname="demo.CalculatorSpec" name="adding values">
			    <failure message="a message" type="java.lang.AssertionError">the stacktrace</failure>
			  </testcase>
			</testsuite>	
		'''.parse 
		
		verify(acceptor).accept(new SpecExecution("demo.CalculatorSpec", "adding values", 0.01, list))
	}
	
	def parse(CharSequence content){
		subject.parse(new StringInputStream(content.toString), acceptor)
		
	}
}