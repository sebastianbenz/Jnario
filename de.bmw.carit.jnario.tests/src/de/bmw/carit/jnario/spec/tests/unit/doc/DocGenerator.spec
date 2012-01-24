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
	
	it "should generate java script helper files"{
		generateEmptyExampleDoc()
		
		assert generatedFile("js/prettify.js") != null
		assert generatedFile("js/lang-xtend.js") != null
	}
	
	it "should generate css helper files"{
		generateEmptyExampleDoc()
		
		assert generatedFile("css/bootstrap.min.css") != null
		assert generatedFile("css/custom.css") != null
		assert generatedFile("css/prettify.css") != null
	}
	
	it "should generate scenario documentation"{
		generateEmptyExampleDoc()
		
		val scenarioDoc = generatedFile("ExampleSpec.html")
		assert scenarioDoc != null && 
				scenarioDoc.contains("<title>Example</title>")
				scenarioDoc.contains("<h1>Example</h1>")
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
		return fsa.files.get("DEFAULT_OUTPUT/" + name)?.toString
	}
}