package org.jnario.standalone.tests

import com.google.inject.Inject
import java.io.File
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.spec.compiler.batch.SpecBatchCompiler
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.util.Files.*
import static org.jnario.standalone.tests.TestBatchCompiler.*
import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecInjectorProvider))
class TestBatchCompiler {

	@Inject	SpecBatchCompiler batchCompiler

    static String OUTPUT_DIRECTORY_WITH_SPACES = "./test result"
    static String OUTPUT_DIRECTORY = "./test-result"
    static String XTEND_SRC_DIRECTORY = "./testdata"
    static String TEMP_DIRECTORY = "./test-temp-dir"

	@Before
	def void onSetup () { 
        batchCompiler.sourcePath = XTEND_SRC_DIRECTORY
        batchCompiler.outputPath = OUTPUT_DIRECTORY
        batchCompiler.deleteTempDirectory = true
        new File(OUTPUT_DIRECTORY).mkdir
        cleanFolder(new File(OUTPUT_DIRECTORY), null, true, false)
        new File(OUTPUT_DIRECTORY_WITH_SPACES).mkdir
	}
 
	@After 
	def void onTearDown() {
       cleanFolder(new File(OUTPUT_DIRECTORY), null, true, true)
       cleanFolder(new File(OUTPUT_DIRECTORY_WITH_SPACES), null, true, true)
       if (new File(TEMP_DIRECTORY).exists) {
           cleanFolder(new File(TEMP_DIRECTORY), null, true, true)
       }
	}

	@Test
	def void testCompileTestData() {
		batchCompiler.compile
		assertEquals(2, new File(OUTPUT_DIRECTORY+"/test").list.size)
	}

}