/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

import static extension org.jnario.util.Strings.*
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtext.generator.IFileSystemAccess
 
import static org.jnario.doc.DocOutputConfigurationProvider.*

class HtmlFileBuilder {
	
	def generate(XtendClass context, IFileSystemAccess fsa, HtmlFile htmlFile){
		val content = htmlFile.toText
		fsa.generateFile(filePath(context, htmlFile), DOC_OUTPUT, content)
	}
	
	def toHtmlFileName(CharSequence nameWithoutExtension){
		var result = nameWithoutExtension.toString
		return result.trim("_".charAt(0)) + ".html"
	}
	
	def private filePath(XtendClass xtendClass, HtmlFile htmlFile){
		val fileName = "/" + htmlFile.name.toHtmlFileName
		if(xtendClass.packageName == null){
			return fileName
		}
		return "/" + xtendClass.packageName.replaceAll("\\.", "/") + fileName
	}
	
}