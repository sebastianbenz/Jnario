package org.jnario.jnario.tests.unit.doc

import org.jnario.doc.HtmlAssets
import com.google.inject.Inject
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.doc.DocOutputConfigurationProvider

@CreateWith(typeof(SpecTestCreator))
describe HtmlAssets {
	
	@Inject InMemoryFileSystemAccess fsa
	
	before subject.generate(fsa)

	fact "generates java script helper files"{
		assert generatedFile("js/prettify.js") != null
		assert generatedFile("js/lang-jnario.js") != null
	}
	
	fact "generates css helper files"{
		assert generatedFile("css/bootstrap-responsive.min.css") != null
		assert generatedFile("css/custom.css") != null
		assert generatedFile("css/prettify.css") != null
	}
	
	def generatedFile(String name){
		return fsa.files.get(DocOutputConfigurationProvider::ASSET_OUTPUT + name)?.toString
	}
}