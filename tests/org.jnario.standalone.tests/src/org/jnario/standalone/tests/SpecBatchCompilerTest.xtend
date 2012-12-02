/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.standalone.tests

import com.google.inject.Inject
import java.io.File
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.jnario.jnario.test.util.ExtendedSpecInjectorProvider
import org.jnario.spec.compiler.SpecBatchCompiler
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.util.Files.*
import static org.jnario.standalone.tests.SpecBatchCompilerTest.*
import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExtendedSpecInjectorProvider))
class SpecBatchCompilerTest {

	@Inject	SpecBatchCompiler batchCompiler

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
		batchCompiler.compile
		assertEquals(3, new File(OUTPUT_DIRECTORY+"/test").list.size)
	}

}