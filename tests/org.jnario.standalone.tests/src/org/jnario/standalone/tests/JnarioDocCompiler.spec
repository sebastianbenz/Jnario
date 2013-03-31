/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.standalone.tests

import java.io.File
import org.jnario.runner.CreateWith
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import com.google.inject.Inject
import org.hamcrest.Matcher
import org.jnario.compiler.JnarioDocCompiler
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.jnario.test.util.SuiteTestCreator
import org.jnario.jnario.test.util.FeatureTestCreator

import static org.jnario.lib.Should.*

describe "JnarioDocCompiler"{
	
	@Inject @Rule public TemporaryFolder folder
	@Inject JnarioDocCompiler compiler

	before {
		compiler.sourcePath = "./testdata"
        compiler.outputPath = folder.root.toString
        compiler.deleteTempDirectory = true
        compiler.useCurrentClassLoaderAsParent = true
        compiler.compile
	}
	
	@CreateWith(typeof(FeatureTestCreator))
	describe "FeatureDocCompiler"{
		fact "test/ExamplesFeature.html" should be generated 
	}
	
	@CreateWith(typeof(SpecTestCreator))
	describe "SpecDocCompiler"{
		fact "test/SpecExampleSpec.html" should be generated 
	}
	
	@CreateWith(typeof(SuiteTestCreator))
	describe "SuiteDocCompiler"{
		fact "test/ExampleSuite.html" should be generated 
	}
	
	def Matcher<String> generated(){
		matches("generated", [new File(folder.root.toString + "/" + it).exists])
	}
}