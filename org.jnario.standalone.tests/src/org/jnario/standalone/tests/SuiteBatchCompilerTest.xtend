package org.jnario.standalone.tests

import com.google.inject.Inject
import java.io.File
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.suite.SuiteInjectorProvider
import org.jnario.suite.compiler.SuiteBatchCompiler
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.util.Files.*
import static org.jnario.standalone.tests.SuiteBatchCompilerTest.*
import static org.junit.Assert.*
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.emf.common.util.URI
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.feature.FeatureStandaloneSetup
import org.junit.After

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SuiteInjectorProvider))
class SuiteBatchCompilerTest {

	@Inject	SuiteBatchCompiler batchCompiler
	@Inject extension ModelStore modelStore
	
    static String OUTPUT_DIRECTORY = "./test-result"
    static String XTEND_SRC_DIRECTORY = "./testdata"
    static String TEMP_DIRECTORY = "./test-temp-dir"

	@Before
	def void onSetup () { 
        batchCompiler.sourcePath = XTEND_SRC_DIRECTORY
        batchCompiler.outputPath = OUTPUT_DIRECTORY
        batchCompiler.deleteTempDirectory = true
        batchCompiler.useCurrentClassLoaderAsParent = true
        new File(OUTPUT_DIRECTORY).mkdir
        cleanFolder(new File(OUTPUT_DIRECTORY), null, true, false)
        SpecStandaloneSetup::doSetup
        FeatureStandaloneSetup::doSetup
        load(URI::createURI(XTEND_SRC_DIRECTORY + "/test/Example.feature"))
        load(URI::createURI(XTEND_SRC_DIRECTORY + "/test/Example.spec"))
	}
 
	@After 
	def void onTearDown() {
       cleanFolder(new File(OUTPUT_DIRECTORY), null, true, true)
       if (new File(TEMP_DIRECTORY).exists) {
           cleanFolder(new File(TEMP_DIRECTORY), null, true, true)
       }
	}

	@Test
	def void testCompileTestData() {
		batchCompiler.setResourceSet(resourceSet)
		batchCompiler.compile()
		assertEquals(1, new File(OUTPUT_DIRECTORY+"/test").list.size)
	}

}