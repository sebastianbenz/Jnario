/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.launching;


import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.builder.DerivedResourceMarkers;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.jdt.JavaElementFinder;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtend.ide.launching.JavaElementDelegate;

import com.google.inject.Inject;

import org.jnario.spec.spec.SpecFile;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SpecJavaElementDelegate extends JavaElementDelegate {
	
	private static final Logger log = Logger.getLogger(SpecJavaElementDelegate.class);
	
	private DerivedResourceMarkers derivedResourceMarkers;
	private JavaElementFinder javaElementFinder;
	private SpecJvmTypeProvider specJvmTypeProvider;
	private final IResourceSetProvider resourceSetProvider;
	
	@Inject
	public SpecJavaElementDelegate(
			DerivedResourceMarkers derivedResourceMarkers,
			JavaElementFinder javaElementFinder,
			SpecJvmTypeProvider specJvmTypeProvider,
			IResourceSetProvider resourceSetProvider) {
		this.derivedResourceMarkers = derivedResourceMarkers;
		this.javaElementFinder = javaElementFinder;
		this.specJvmTypeProvider = specJvmTypeProvider;
		this.resourceSetProvider = resourceSetProvider;
	}

	protected IJavaElement getJavaElementForResource(IResource resource) {
		try {
			URI sourceUri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			final String sourcePath = sourceUri.toString();
			List<IFile> resources = derivedResourceMarkers.findDerivedResources(resource.getProject(), sourcePath);
			if(resources.size() == 0){
				return null;
			}
			if (resources.size() == 1){
				return JavaCore.create(resources.get(0));
			}
			return resolveRootJavaElement(resource.getProject(), sourceUri);
			
		} catch (CoreException e) {
			if (log.isDebugEnabled()) {
				log.debug(e.getMessage(), e);
			}
		}
		return null;
	}

	protected IJavaElement resolveRootJavaElement(IProject project, URI sourceUri) {
		SpecFile specFile = loadSpec(project, sourceUri);
		if(specFile == null){
			return null;
		}
		JvmType jvmType = specJvmTypeProvider.resolveJvmType(specFile);
		if(jvmType == null){
			return null;
		}
		return javaElementFinder.findElementFor(jvmType);
	}

	protected SpecFile loadSpec(IProject project, URI sourceUri) {
		ResourceSet resourceSet = resourceSetProvider.get(project);
		Resource modelResource = resourceSet.getResource(sourceUri, true);
		if(modelResource == null || modelResource.getContents().isEmpty()){
			return null;
		}
		return (SpecFile) modelResource.getContents().get(0);
	}

}
