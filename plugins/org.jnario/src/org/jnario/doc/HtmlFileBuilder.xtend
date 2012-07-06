/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtext.generator.IFileSystemAccess
 
import static org.jnario.util.Strings.*

class HtmlFileBuilder {
	
	def generate(XtendClass context, IFileSystemAccess fsa, HtmlFile htmlFile){
		fsa.copy("css", htmlFile.cssFiles)
		fsa.copy("js", htmlFile.jsFiles)
		val content = htmlFile.toText
		fsa.generateFile(filePath(context, htmlFile), DocOutputConfigurationProvider::DOC_OUTPUT, content)
	}
	
	def toHtmlFileName(CharSequence nameWithoutExtension){
		var result = nameWithoutExtension.toString
		if(result.startsWith("_")){
			result = result.substring(1)
		}
		result + ".html"
	}
	
	def private filePath(XtendClass xtendClass, HtmlFile htmlFile){
		val fileName = "/" + htmlFile.name.toHtmlFileName
		if(xtendClass.packageName == null){
			return fileName
		}
		return "/" + xtendClass.packageName.replaceAll("\\.", "/") + fileName
	}
	
	def private copy(IFileSystemAccess fsa, String targetFolder, Iterable<String> files){
		for(file : files){
			fsa.generateFile("/" + targetFolder + "/" + file, DocOutputConfigurationProvider::DOC_OUTPUT, load(file)) 
		}
	}
	
	def private load(String file){
		val inputStream = getClass().getResourceAsStream(file)
		return convertStreamToString(inputStream)
	}	
	
}