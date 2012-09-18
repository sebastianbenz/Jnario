package org.jnario.jnario.tests.integration

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith
import org.jnario.doc.SpecResultProvider
import org.jnario.Specification
import org.jnario.doc.SpecResultParser
import org.jnario.doc.ParseResultAcceptor
import org.jnario.jnario.test.util.SpecTestCreator
import org.eclipse.xtext.util.StringInputStream
import org.junit.Ignore

@Ignore
@CreateWith(typeof(SpecTestCreator))
Feature: Parsing spec results from JUnit XML reports

	Scenario: Matching successfull Spec Runs
		
		@Inject extension ModelStore
		@Inject SpecResultProvider resultProvider
		@Inject SpecResultParser resultParser
		@Inject ParseResultAcceptor acceptor
		Specification specification
		
		Given a specification 
		'''
			package example
			describe "Adding values"{
				fact "4 + 3 is 7"{
					4 + 3 => 7
				}
			}
		'''
			specification = args.first.parseSpec.allContents.filter(typeof(Specification)).first
		And a test result xml file 
		'''
			<?xml version="1.0" encoding="UTF-8" ?>
			<testsuite failures="0" time="0.001" errors="0" skipped="0" tests="1" name="example.AddingValuesSpec">
			  <properties>
			    <property name="java.runtime.name" value="Java(TM) SE Runtime Environment"/>
			  </properties>
			  <testcase time="0.001" classname="example.AddingValuesSpec" name="4 + 3 is 7"/>
			</testsuite>
		'''
			resultParser.parse(new StringInputStream(args.first), acceptor)
		Then the spec execution "passed" 
		 	val shouldPass = args.first == "passed"
			resultProvider.getResult(specification, acceptor.results).hasPassed => shouldPass
			
	Scenario: Matching failed Spec runs
	
		Given a specification 
			'''
			package example
			
			describe "Adding values"{
				fact "4 + 3 is 8"{
					4 + 3 => 8
				}
			}
			'''
		And a test result xml file 
			'''
			<?xml version="1.0" encoding="UTF-8" ?>
			<testsuite failures="1" time="0.017" errors="0" skipped="0" tests="1" name="example.AddingValuesSpec">
			  <properties>
			    <property name="java.runtime.name" value="Java(TM) SE Runtime Environment"/>
			  </properties>
			  <testcase time="0.017" classname="example.AddingValuesSpec" name="4 + 3 is 8">
			    <failure message="
			Expected 4 + 3 =&gt; 8 but
			     4 + 3 is &lt;7&gt;
			" type="java.lang.AssertionError">java.lang.AssertionError: 
			Expected 4 + 3 =&gt; 8 but
			     4 + 3 is &lt;7&gt;
				at org.junit.Assert.fail(Assert.java:93)
				at org.junit.Assert.assertTrue(Assert.java:43)
				at example.AddingValuesSpec.__43Is8(AddingValuesSpec.java:22)
			</failure>
			  </testcase>
			</testsuite>	
			'''
		Then the spec execution "failed"