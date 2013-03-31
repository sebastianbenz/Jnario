/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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