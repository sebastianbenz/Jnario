/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.doc

import org.jnario.spec.doc.DocGenerator
import org.jnario.runner.InstantiateWith
import org.jnario.jnario.test.util.SpecTestInstantiator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

@InstantiateWith(typeof(SpecTestInstantiator))
describe DocGenerator {
	
	@Inject extension ModelStore 
	@Inject InMemoryFileSystemAccess fsa
	
	it "should generate java script helper files"{
		generateEmptyExampleDoc()
		
		assert generatedFile("js/prettify.js") != null
		assert generatedFile("js/lang-jnario.js") != null
	}
	
	it "should generate css helper files"{
		generateEmptyExampleDoc()
		
		assert generatedFile("css/bootstrap-responsive.min.css") != null
		assert generatedFile("css/custom.css") != null
		assert generatedFile("css/prettify.css") != null
	}
	
	it "should generate scenario title and heading"{
		generateEmptyExampleDoc()
		
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc != null && 
				scenarioDoc.contains("<title>Example</title>")
				scenarioDoc.contains("<h1>Example</h1>")
	}
	
	it "should generate scenario documentation"{
		generateDoc('''
			/*
			 * Irrelevant documentation.
			 */
			 
			/*
			 * This is an example.
			 */
			describe 'Example'{
				
			} 
		''')
		
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc.^should.^contain("<p>This is an example.</p>")
		scenarioDoc.^should.^not.^contain("Irrelevant documentation.")
	}
	
	it "should generate example documentation"{
		generateDoc('''
			describe 'Example'{
				/*
				 * Example documentation
				 */
				it "should do stuff"{
					var x = 0
					x = x + 1
				}
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc.^should.^contain('''
		<h4>Should do stuff</h4>
		<p>
		<p>Example documentation</p>
		<pre class="prettyprint lang-jnario">
		var x = 0
		x = x + 1</pre>
		</p>
		'''.toString())
	}
	
	it "should support markdown for documentation"{
		generateDoc('''
			/*
			 * #Example Heading
			 */
			describe 'Example'{
				
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc.^should.^contain("<h1>Example Heading</h1>")
	}
	
	
	it "should generate table for example tables"{
		generateDoc('''
			describe 'Example'{
				def myExample{
					| a | b |
					| 1 | 2 |
				}
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc.^should.^contain("<h4>MyExample</h4>")
		scenarioDoc.^should.^contain("<th>a</th>")
		scenarioDoc.^should.^contain("<th>b</th>")
		scenarioDoc.^should.^contain("<td>1</td>")
		scenarioDoc.^should.^contain("<td>2</td>")
	}
	
	it "should filter code based on regex in filter annotation"{
		generateDoc('''
			describe 'Example'{
				/*
				 * @filter(bbb)
				 */
				it "should do stuff"{
					"aaabbbaaa"
				}
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc.^should.^contain('"aaaaaa"')
	}
	
	def generateEmptyExampleDoc(){
		generateDoc('''
			describe 'Example'{
				
			} 
		''')
	}
	
	def generateDoc(CharSequence input){
		val resource = parseSpec(input)
		subject.doGenerate(resource, fsa)
	}

	def generatedFile(String name){
		return fsa.files.get("DOC_OUTPUT/" + name)?.toString
	}
}