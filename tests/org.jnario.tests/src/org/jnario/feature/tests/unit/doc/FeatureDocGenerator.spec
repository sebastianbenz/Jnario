/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.doc

import static org.junit.Assert.*
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.feature.doc.FeatureDocGenerator
import org.jnario.feature.feature.FeatureFile
import org.jnario.feature.feature.Feature

@CreateWith(typeof(FeatureTestCreator))
describe FeatureDocGenerator {
	
	@Inject extension ModelStore 
	@Inject InMemoryFileSystemAccess fsa
	
	fact "generates scenario documentation"{
		val actual = 
		"
			package test

			Feature: Example Feature
				
				This is a description.
				
				Scenario: Example Scenario
				
					String input
				
					Given a step with an argument \"something\", another \"argument\" and a multiline string:
					'''
						import java.util.Collections.*;
						
						public class Greeter{
							public static void main(String args[]){
								List<String> list = new ArrayList<String>(); // should escape angle brackets
								Systen.out.println('Hello World');
							}
						}''' 
						input = args.first
						println(args.last)
					When I do something that is pending.
					Then it results in \"something else\"
						input + ' else' => args.first                                    
		".generateDoc
		
		val expected = '''
				<p><p>This is a description.</p></p>
				<h3  id="Scenario_Example_Scenario">Scenario: Example Scenario
				</h3>
				<ul>
				<li><p><strong>Given</strong> a step with an argument <code>"something"</code>, another <code>"argument"</code> and a multiline string:</p><pre>import java.util.Collections.*;
				
				public class Greeter{
				  public static void main(String args[]){
				    List&lt;String&gt; list = new ArrayList&lt;String&gt;(); // should escape angle brackets
				    Systen.out.println('Hello World');
				  }
				}</pre>
				<ul>
				</ul>
				</li>
				<li><p><strong>When</strong> I do something that is pending. [PENDING]</p>
				<ul>
				</ul>
				</li>
				<li><p><strong>Then</strong> it results in <code>"something else"</code></p>
				<ul>
				</ul>
				</li>
				</ul>
			'''.toString
		
		assertEquals(expected, actual)
	}
	
	def generateDoc(CharSequence input){
		val resource = parseScenario(input)
		val featureFile= resource.contents.head as FeatureFile
		return subject.generateContent(featureFile.xtendClasses.head as Feature).toString
	}
}