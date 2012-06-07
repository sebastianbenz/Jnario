package org.jnario.standalone.tests

import java.io.File
import org.jnario.feature.compiler.batch.FeatureDocCompiler
import org.jnario.jnario.test.util.FeatureTestInstantiator
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.runner.InstantiateWith
import org.jnario.spec.compiler.batch.SpecDocCompiler
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import com.google.inject.Inject
import static org.jnario.lib.Should.*
import org.hamcrest.Matcher


describe "JnarioDocCompiler"{
	
	@Inject @Rule public TemporaryFolder folder
	@Inject FeatureDocCompiler compiler

	before {
		compiler.sourcePath = "./testdata"
        compiler.outputPath = folder.root.toString
        compiler.deleteTempDirectory = true
        compiler.useCurrentClassLoaderAsParent = true
        compiler.compile
	}
	
	@InstantiateWith(typeof(FeatureTestInstantiator))
	describe FeatureDocCompiler{
		fact "test/ExamplesFeature.html" should be generated 
	}
	
	@InstantiateWith(typeof(SpecTestInstantiator))
	describe SpecDocCompiler{
		fact "test/SpecExampleSpec.html" should be generated 
	}
	
	def Matcher<String> generated(){
		matches("generated", [new File(folder.root.toString + "/" + it).exists])
	}
}