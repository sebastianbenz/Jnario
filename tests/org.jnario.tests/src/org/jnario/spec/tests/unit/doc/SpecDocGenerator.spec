/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.doc

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.jnario.spec.doc.SpecDocGenerator
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator

@CreateWith(typeof(SpecTestCreator))
describe SpecDocGenerator {

	@Inject extension ModelStore 
	@Inject InMemoryFileSystemAccess fsa
	
	fact "generates scenario title and heading"{
		generateEmptyExampleDoc()
		
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc != null && 
				scenarioDoc.contains("<title>Example</title>")
				scenarioDoc.contains("<h1>Example</h1>")
	}
	
	fact "generates scenario documentation"{
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
		assert scenarioDoc.contains("<p>This is an example.</p>")
		assert !scenarioDoc.contains("<p>Irrelevant documentation.</p>")
	}
	
	fact "generates example documentation"{
		generateDoc('''
			describe 'Example'{
				/*
				 * Example documentation
				 */
				fact "should do stuff"{
					var x = 0
					x = x + 1
				}
			}''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc.contains('''
		<p id="should_do_stuff" class="example notrun"><strong>should do stuff</strong></p>
		<p>Example documentation</p>
		<pre class="prettyprint lang-spec linenums">
		var x = 0
		x = x + 1</pre>'''.toString())
	}
	
	fact "supports markdown for documentation"{
		generateDoc('''
			/*
			 * #Example Heading
			 */
			describe 'Example'{
				
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc.contains("<h1>Example Heading</h1>")
	}
	
	
	fact "generates table for example tables"{
		generateDoc('''
			describe 'Example'{
				def myExample{
					| a | b |
					| 1 | 2 |
				}
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc.contains('<p id="myExample"><strong>MyExample</strong></p>')
		assert scenarioDoc.contains("<th>a</th>")
		assert scenarioDoc.contains("<th>b</th>")
		assert scenarioDoc.contains("<td>1</td>")
		assert scenarioDoc.contains("<td>2</td>")
	}
	
	fact "No code block for examples without description"{
		generateDoc('''
			describe 'Example'{
				fact 1 + 1 => 2
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc should not contain '''<pre class="prettyprint lang-spec linenums">
1 + 1 =&gt; 2</pre>'''
	}
	
	fact "filters code based on regex in filter annotation"{
		generateDoc('''
			describe 'Example'{
				/*
				 * @filter(bbb)
				 */
				fact "should do stuff"{
					"aaabbbaaa"
				}
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc.contains('aaaaaa')
	}
	
	fact "includes failing state for examples"{
		generateDoc('''
			describe 'Example'{
				fact "should do stuff"{
					"aaabbbaaa"
				}
			} 
		''')
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