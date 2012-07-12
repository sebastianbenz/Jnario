/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.doc

import org.jnario.compiler.HtmlAssetsCompiler
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import java.io.File
import static extension org.eclipse.xtext.util.Files.*

@CreateWith(typeof(SpecTestCreator))
describe HtmlAssetsCompiler {
	
	@Inject @Rule extension TemporaryFolder

	fact "compiles css & js files to specified folder"{
		doCompile
		assert file("js/prettify.js").exists
		assert file("css/prettify.css").exists
	}
	
	fact "does not override existing file"{
		mkdir("js")
		val file = file("js/prettify.js").toString
		file.writeStringIntoFile("Hello World")
		doCompile
		readFileIntoString(file) => "Hello World"
	}
	
	def mkdir(String name){
		file(name).mkdir
	}
	
	def file(String path){
		new File(root.absolutePath + "/" + path)
	}
	
	def doCompile(){
		subject.outputPath = root.absolutePath
		subject.compile
	}

}