/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.wizards;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;
import org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class FeatureCreator {
	
	private final Factory typeProviderFactory;
	
	private XtextResourceSetProvider resourceSetProvider;

	@Inject
	public FeatureCreator(JdtTypeProviderFactory typeProviderFactory, XtextResourceSetProvider resourceSetProvider){
		this.typeProviderFactory = typeProviderFactory;
		this.resourceSetProvider = resourceSetProvider;
	}

	public String create(IJavaProject javaProject, String description,
			IPackageFragment packageFragment, IProgressMonitor monitor) {
		StringBuffer sb = new StringBuffer();
		if(packageFragment.getElementName() != null && !packageFragment.getElementName().equals("")){
			sb.append("package ");
			sb.append(packageFragment.getElementName());
			sb.append("\n\n");
		}
		
		sb.append("Feature: " + description + "\n");
		return sb.toString();
	}

	protected IJvmTypeProvider createTypeProvider(IJavaProject javaProject) {
		ResourceSet resourceSet = resourceSetProvider.get(javaProject.getProject());
		return typeProviderFactory.createTypeProvider(resourceSet);
	}

}
