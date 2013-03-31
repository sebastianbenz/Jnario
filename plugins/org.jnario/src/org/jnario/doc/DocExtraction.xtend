/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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