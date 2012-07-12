/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.jnario.doc.HtmlAssets
import static org.jnario.doc.DocOutputConfigurationProvider.*

class HtmlAssetsCompiler extends JnarioDocCompiler{
	
	@Inject Provider<JavaIoFileSystemAccess> filesystemAccessProvider
	@Inject HtmlAssets htmlAssets
	
	override compile(){
		val fsa = filesystemAccessProvider.get
		fsa.setOutputPath(ASSET_OUTPUT, outputPath)
		htmlAssets.generate(fsa)	
		return true
	}		
}