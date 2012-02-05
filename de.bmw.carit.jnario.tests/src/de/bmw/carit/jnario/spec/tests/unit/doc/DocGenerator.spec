package de.bmw.carit.jnario.spec.tests.unit.doc

import de.bmw.carit.jnario.spec.doc.DocGenerator
import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import com.google.inject.Inject
import de.bmw.carit.jnario.tests.util.ModelStore
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

@InstantiateWith(typeof(SpecTestInstantiator))
describe DocGenerator {
	
	@Inject extension ModelStore 
	@Inject InMemoryFileSystemAccess fsa
	
	"should generate java script helper files"{
		generateEmptyExampleDoc()
		
		assert generatedFile("js/prettify.js") != null
		assert generatedFile("js/lang-xtend.js") != null
	}
	
	"should generate css helper files"{
		generateEmptyExampleDoc()
		
		assert generatedFile("css/bootstrap.min.css") != null
		assert generatedFile("css/custom.css") != null
		assert generatedFile("css/prettify.css") != null
	}
	
	"should generate scenario title and heading"{
		generateEmptyExampleDoc()
		
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc != null && 
				scenarioDoc.contains("<title>Example</title>")
				scenarioDoc.contains("<h1>Example</h1>")
	}
	
	"should generate scenario documentation"{
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
		scenarioDoc.should.contain("<p>This is an example.</p>")
		scenarioDoc.should.not.contain("Irrelevant documentation.")
	}
	
	"should generate example documentation"{
		generateDoc('''
			describe 'Example'{
				/*
				 * Example documentation
				 */
				"should do stuff"{
					var x = 0
					x = x + 1
				}
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc.should.contain('''
		<h5>should do stuff</h5>
		<p>Example documentation</p>
		<pre class="prettyprint">
		var x = 0
		x = x + 1</pre>
		'''.toString())
	}
	
	"should support markdown for documentation"{
		generateDoc('''
			/*
			 * #Example Heading
			 */
			describe 'Example'{
				
			} 
		''')
		val scenarioDoc = generatedFile("ExampleSpec.html")
		scenarioDoc.should.contain("<h1>Example Heading</h1>")
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