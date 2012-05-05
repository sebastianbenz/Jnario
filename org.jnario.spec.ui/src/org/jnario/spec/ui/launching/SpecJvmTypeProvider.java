/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.launching;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecJvmTypeProvider {
	
	public ExampleNameProvider nameProvider;
	public Factory typeProviderFactory;

	@Inject
	public SpecJvmTypeProvider(ExampleNameProvider nameProvider,
			Factory typeProviderFactory) {
		this.nameProvider = nameProvider;
		this.typeProviderFactory = typeProviderFactory;
	}

	protected JvmType resolveJvmType(SpecFile specFile) {
		if(specFile.getXtendClasses().isEmpty()){
			return null;
		}
		ExampleGroup exampleGroup = (ExampleGroup) specFile.getXtendClasses().get(0);
		return resolveJvmType(exampleGroup);
	}

	protected JvmType resolveJvmType(ExampleGroup exampleGroup) {
		Resource resource = exampleGroup.eResource();
		if(resource == null){
			return null;
		}
		ResourceSet resourceSet = resource.getResourceSet();
		if(resourceSet == null){
			return null;
		}
		String javaClassName = getTypeName(exampleGroup);
		IJvmTypeProvider typeProvider = typeProviderFactory.createTypeProvider(resourceSet);
		return typeProvider.findTypeByName(javaClassName);
	}

	protected String getTypeName(ExampleGroup exampleGroup) {
		String typeName = nameProvider.toJavaClassName(exampleGroup);
		SpecFile specFile = getContainerOfType(exampleGroup, SpecFile.class);
		return specFile.getPackage() + "." + typeName;
	}
}