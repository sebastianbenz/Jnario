/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler
import org.eclipse.xtend.lib.Property
import org.eclipse.xtext.mwe.NameBasedFilter
import org.eclipse.xtext.mwe.PathTraverser
import org.eclipse.xtext.resource.XtextResource
import org.jnario.doc.AbstractDocGenerator
import org.jnario.doc.DocOutputConfigurationProvider
import org.jnario.report.Executable2ResultMapping

class JnarioDocCompiler extends XtendBatchCompiler{
	
	@Property ResourceSet resourceSet
	Executable2ResultMapping resultMapping
	@Property String resultFolder
	@Inject AbstractDocGenerator docGenerator
	
	override compile() {
		resourceSet = loadResources()
		generateDocumentation(resourceSet, resultMapping);
		return true
	}
	
	@Inject 
	def setExecutable2ResultMapping(Executable2ResultMapping resultMapping){
		this.resultMapping = resultMapping
	}
	
	def loadResources(){
		if(resourceSet == null){
			resourceSet = resourceSetProvider.get
		}
		resourceSet.getLoadOptions().put(XtextResource::OPTION_ENCODING, getFileEncoding());
		val nameBasedFilter = new NameBasedFilter();
		nameBasedFilter.setExtension(fileExtensionProvider.getPrimaryFileExtension());
		val pathTraverser = new PathTraverser();
		println("source directories: " + getSourcePathDirectories())
		pathTraverser.resolvePathes(getSourcePathDirectories(), [input |
				val matches = nameBasedFilter.matches(input);
				if (matches) {
					println("loading resource: " + input)
					resourceSet.getResource(input, true);
				}
				return matches;
			])
		val classDirectory = createTempDir("classes")
		installJvmTypeProvider(resourceSet, classDirectory)
		EcoreUtil::resolveAll(resourceSet)
		resourceSet
	}
	
	def generateDocumentation(ResourceSet rs, Executable2ResultMapping executable2ResultMapping){
		val javaIoFileSystemAccess = javaIoFileSystemAccessProvider.get()
		javaIoFileSystemAccess.setOutputPath(DocOutputConfigurationProvider::DOC_OUTPUT, outputPath)
		for(r : rs.resources){
			if(fileExtensionProvider.isValid(r.URI.fileExtension)){
				docGenerator.doGenerate(r, javaIoFileSystemAccess, executable2ResultMapping);
			}
		}
	}
	
}