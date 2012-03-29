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
	
	
	
	def private filePath(XtendClass xtendClass, HtmlFile htmlFile){
		val fileName = "/" + htmlFile.fileName + ".html"
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
		val inputStream = typeof(DocumentationSupport).getResourceAsStream(file)
		return convertStreamToString(inputStream)
	}	
	
}