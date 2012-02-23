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
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.jnario.standalone.tests.TestBatchCompiler.*
import static org.eclipse.xtext.util.Files.*
import static org.junit.Assert.*
import org.jnario.compiler.batch.SpecBatchCompiler

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(org.jnario.standalone.tests.SpecInjectorProvider))
class TestBatchCompiler {

	@Inject 
	SpecBatchCompiler batchCompiler

    static String OUTPUT_DIRECTORY_WITH_SPACES = "./test result"
    static String OUTPUT_DIRECTORY = "./test-result"
    static String XTEND_SRC_DIRECTORY = "./testdata"
    static String TEMP_DIRECTORY = "./test-temp-dir"
    static String TEMP_DIRECTORY_WITH_SPACES = "./test temp dir"
 
	@Before
	def void onSetup () {
        batchCompiler.sourcePath = XTEND_SRC_DIRECTORY
        batchCompiler.outputPath = OUTPUT_DIRECTORY
        batchCompiler.deleteTempDirectory = true
        new File(OUTPUT_DIRECTORY).mkdir
        cleanFolder(new File(OUTPUT_DIRECTORY), null, true, false)
        new File(OUTPUT_DIRECTORY_WITH_SPACES).mkdir
        cleanFolder(new File(OUTPUT_DIRECTORY_WITH_SPACES), null, true, false)
	}

	@After
	def void onTearDown() {
       cleanFolder(new File(OUTPUT_DIRECTORY), null, true, true)
       cleanFolder(new File(OUTPUT_DIRECTORY_WITH_SPACES), null, true, true)
       if (new File(TEMP_DIRECTORY).exists) {
           cleanFolder(new File(TEMP_DIRECTORY), null, true, true)
       }
       if (new File(TEMP_DIRECTORY_WITH_SPACES).exists) {
           cleanFolder(new File(TEMP_DIRECTORY_WITH_SPACES), null, true, true)
       }
	}

	@Test
	def void testCompileTestData() {
		batchCompiler.compile
		assertEquals(2, new File(OUTPUT_DIRECTORY+"/test").list.size)
	}

	@Test
	def void tempDirectory() {
        batchCompiler.deleteTempDirectory = false
        batchCompiler.tempDirectory = TEMP_DIRECTORY
        assertTrue(batchCompiler.compile)
        assertEquals(2, new File(batchCompiler.tempDirectory).list.size)
        assertTrue(batchCompiler.compile)
        assertEquals(4, new File(batchCompiler.tempDirectory).list.size)
	}

	@Test
    def void deleteTempDirectory() {
        batchCompiler.deleteTempDirectory = true
        batchCompiler.tempDirectory = TEMP_DIRECTORY
        assertTrue(batchCompiler.compile)
        assertEquals(0, new File(TEMP_DIRECTORY).list.size)
    }
}