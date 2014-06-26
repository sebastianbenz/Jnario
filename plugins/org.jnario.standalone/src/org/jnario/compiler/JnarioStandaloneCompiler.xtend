/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler

import com.google.common.base.Joiner
import com.google.inject.Inject
import com.google.inject.Injector
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.core.XtendStandaloneSetup
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.mwe.NameBasedFilter
import org.eclipse.xtext.mwe.PathTraverser
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.resource.FileExtensionProvider
import org.jnario.feature.FeatureStandaloneSetup
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.suite.SuiteStandaloneSetup
import com.google.common.collect.Lists
import org.eclipse.xtext.common.types.descriptions.IStubGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IResourceDescription
import java.util.HashMap
import org.eclipse.xtext.resource.IResourceDescription.Manager
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl
import org.eclipse.xtext.resource.containers.FlatResourceSetBasedAllContainersState

class JnarioStandaloneCompiler extends XtendBatchCompiler {
	
	final static val log = Logger.getLogger(JnarioStandaloneCompiler.getName())
	
	@Inject
	private IEncodingProvider.Runtime encodingProvider;
	@Inject
	private IStubGenerator stubGenerator;
	
	List<Injector> injectors
	
	HashMap<String, Manager> resourceDesciptionManagers
	
    def static JnarioStandaloneCompiler create(){
		val setups = #[new XtendStandaloneSetup(), new FeatureStandaloneSetup(), new SpecStandaloneSetup(), new SuiteStandaloneSetup()]
		return new JnarioStandaloneCompiler(setups)
	}
	
	new(List<? extends ISetup> setups){
		injectors = setups.map[createInjectorAndDoEMFRegistration]
		injectors.head.injectMembers(this)
		resourceDesciptionManagers = newHashMap(injectors.map[
			val fileExtension = getInstance(FileExtensionProvider).primaryFileExtension
			fileExtension -> getInstance(IResourceDescription.Manager)
		])
	}
	
	override protected loadXtendFiles(ResourceSet resourceSet) {
		resourceSet.eAdapters.add(
			new FlatResourceSetBasedAllContainersState(resourceSet) {

				override getContainedURIs(String containerHandle) {
					val uris = Lists.newArrayListWithCapacity(resourceSet.getResources().size());
					for (Resource r : resourceSet.getResources())
						uris.add(r.getURI());
					return uris;
				}
			
		})
		encodingProvider.setDefaultEncoding(getFileEncoding());
		val nameBasedFilter = getNameBasedFilters()
		val pathTraverser = new PathTraverser();
		val sourcePathDirectories = getSourcePathDirectories(); 
		val pathes = pathTraverser.resolvePathes(sourcePathDirectories)[src|
				nameBasedFilter.exists[matches(src)]
		]
		pathes.keySet().forEach[src|
			val baseDir = URI.createFileURI(src+"/");
			val identifier = Joiner.on("_").join(baseDir.segments());
			val platformResourceURI = URI.createPlatformResourceURI(identifier+"/", true);
			resourceSet.getURIConverter().getURIMap().put(platformResourceURI,baseDir);
			for (URI uri :  pathes.get(src)) {
				if (log.isDebugEnabled()) {
					log.debug("load xtend file '" + uri + "'");
				}
				val uriToUse = uri.replacePrefix(baseDir, platformResourceURI);
				resourceSet.getResource(uriToUse, true);
			}
		]
		return resourceSet;
	}
	
	def getNameBasedFilters() {
		injectors.map[
			val filter = new NameBasedFilter
			filter.extension = getInstance(FileExtensionProvider).primaryFileExtension
			filter
		]
	}
	
	override createStubs(ResourceSet resourceSet) {
		val outputDirectory = createTempDir("stubs");
		val fileSystemAccess = javaIoFileSystemAccessProvider.get();
		fileSystemAccess.setOutputPath(outputDirectory.toString());
		Lists.newArrayList(resourceSet.getResources()).forEach[
			val description = findResourceDescriptionManager(it).getResourceDescription(it);
			stubGenerator.doGenerateStubs(fileSystemAccess, description);
		
		]
		return outputDirectory;
	}
	
	def findResourceDescriptionManager(Resource resource) {
  	  resourceDesciptionManagers.get(resource.URI.fileExtension.toLowerCase)
	}
	
}