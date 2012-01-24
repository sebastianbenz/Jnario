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
	
	it "should generate prettify.js"{
		val resource = parseSpec('''
			describe 'Example'{
				
			} 
		''')
		
		subject.doGenerate(resource, fsa)
		
		assert fsa.files.get("js/prettify.js") != null
	}
}