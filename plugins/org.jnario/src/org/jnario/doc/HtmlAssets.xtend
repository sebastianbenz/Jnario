/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

import com.google.inject.Singleton
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.xtend.lib.Data
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension2

import static org.jnario.doc.DocOutputConfigurationProvider.*
import static org.jnario.util.Strings.*

@Data
@Singleton
class HtmlAssets {
	
	val cssFiles = newArrayList(
						"bootstrap.min.css", 
						"bootstrap-responsive.min.css", 
						"custom.css", 
						"prettify.css").map["css/" + it]
	val jsFiles = newArrayList(
						"prettify.js", 
						"lang-jnario.js",
						"jquery.js",
						"bootstrap-tab.js").map["js/" + it]
	
	def generate(IFileSystemAccess fsa){
		fsa.copy(cssFiles)
		fsa.copy(jsFiles)
	}
	
	def private copy(IFileSystemAccess fsa, Iterable<String> files){
		for(file : files.filter[!fsa.exists(it)]){
			fsa.generateFile(file, ASSET_OUTPUT , load(file)) 
		}
	}
	
	def private exists(IFileSystemAccess fsa, String file){
		if(!(fsa instanceof IFileSystemAccessExtension2)){
			return false
		}
		val fsa2 = fsa as IFileSystemAccessExtension2
		val uri = fsa2.getURI(file, ASSET_OUTPUT)
		return URIConverter::INSTANCE.exists(uri, emptyMap)
	}
	
	def private load(String file){
		val inputStream = getClass().getResourceAsStream(file)
		return convertStreamToString(inputStream)
	}	
	
}