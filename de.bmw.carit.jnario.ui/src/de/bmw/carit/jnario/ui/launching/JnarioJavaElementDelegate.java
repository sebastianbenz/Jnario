/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.launching;


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
import org.eclipse.xtext.xtend2.ui.launching.JavaElementDelegate;

import com.google.inject.Inject;

import de.bmw.carit.jnario.jnario.JnarioFile;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
public class JnarioJavaElementDelegate extends JavaElementDelegate {
	
	private static final Logger log = Logger.getLogger(JnarioJavaElementDelegate.class);
	
	private DerivedResourceMarkers derivedResourceMarkers;
	private JavaElementFinder javaElementFinder;
	private JnarioJvmTypeProvider jnarioJvmTypeProvider;
	private final IResourceSetProvider resourceSetProvider;
	
	@Inject
	public JnarioJavaElementDelegate(
			DerivedResourceMarkers derivedResourceMarkers,
			JavaElementFinder javaElementFinder,
			JnarioJvmTypeProvider jnarioJvmTypeProvider,
			IResourceSetProvider resourceSetProvider) {
		this.derivedResourceMarkers = derivedResourceMarkers;
		this.javaElementFinder = javaElementFinder;
		this.jnarioJvmTypeProvider = jnarioJvmTypeProvider;
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
		JnarioFile jnarioFile = loadJnario(project, sourceUri);
		if(jnarioFile == null){
			return null;
		}
		JvmType jvmType = jnarioJvmTypeProvider.resolveJvmType(jnarioFile);
		if(jvmType == null){
			return null;
		}
		return javaElementFinder.findElementFor(jvmType);
	}

	protected JnarioFile loadJnario(IProject project, URI sourceUri) {
		ResourceSet resourceSet = resourceSetProvider.get(project);
		Resource modelResource = resourceSet.getResource(sourceUri, true);
		if(modelResource == null || modelResource.getContents().isEmpty()){
			return null;
		}
		return (JnarioFile) modelResource.getContents().get(0);
	}

}
