package org.jnario.doc

import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject

class DocumentationProvider {
	
	val IEObjectDocumentationProvider delegate
	
	@Inject new(IEObjectDocumentationProvider delegate){
		this.delegate = delegate
	}
	
	def getDocumentation(EObject eObject){
		val doc = delegate.getDocumentation(eObject)
		if(doc == null){ 
			return null
		}
		doc.replaceAll("\\\\/\\*", "/*")
		   .replaceAll("\\\\\\*/", "*/")
	}
	
}