/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.standalone.tests

import com.google.common.base.Charsets
import com.google.common.io.Files
import com.google.inject.Inject
import com.google.inject.Injector
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.compiler.JnarioBatchCompiler
import org.jnario.feature.FeatureStandaloneSetup
import org.jnario.jnario.test.util.ExtendedSuiteInjectorProvider
import org.jnario.jnario.test.util.ModelStore
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.suite.SuiteStandaloneSetup
import org.jnario.suite.compiler.SuiteBatchCompiler
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.util.Files.*
import static org.jnario.standalone.tests.SuiteBatchCompilerTest.*
import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExtendedSuiteInjectorProvider))
class SuiteBatchCompilerTest {

	@Inject extension ModelStore modelStore
	
    static String OUTPUT_DIRECTORY = "test-result"
    static String XTEND_SRC_DIRECTORY = "testdata"
    static String TEMP_DIRECTORY = "test-temp-dir"

	@Before
	def void onSetup() { 
    	val dir = new File(OUTPUT_DIRECTORY)
    	if(dir.exists){
          cleanFolder(dir, null, true, false)
    	}
        new File(OUTPUT_DIRECTORY).mkdir
	}
 
	def void compile(XtendBatchCompiler batchCompiler) { 
        batchCompiler.sourcePath = XTEND_SRC_DIRECTORY
        batchCompiler.outputPath = OUTPUT_DIRECTORY
        batchCompiler.deleteTempDirectory = true
        batchCompiler.useCurrentClassLoaderAsParent = true
		batchCompiler.setResourceSetProvider([|resourceSet as ResourceSet])
		batchCompiler.compile()
	}
	
//	@After 
//	def void onTearDown() {
//       cleanFolder(new File(OUTPUT_DIRECTORY), null, true, true)
//       if (new File(TEMP_DIRECTORY).exists) {
//           cleanFolder(new File(TEMP_DIRECTORY), null, true, true)
//       }
//	}
 
	@Test
	def void testCompileTestData() {
		#[new FeatureStandaloneSetup, new SpecStandaloneSetup, new SuiteStandaloneSetup].forEach[
			val compiler = it.createInjectorAndDoEMFRegistration.getInstance(XtendBatchCompiler)
			compile(compiler)
		]

		val outputDir = new File(OUTPUT_DIRECTORY+"/test")
		assertEquals(7, outputDir.list[dir, name | name.endsWith(".java")].size)
		val fileContent = Files.toString(new File(outputDir, "ExampleSuite.java"), Charsets::UTF_8)
		assertTrue("Expected to be to contain others specs, but was: \n\n" + fileContent, fileContent.contains("@Contains"))
	}

}