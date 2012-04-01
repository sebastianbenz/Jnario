/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.launching;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;

import com.google.inject.Inject;

import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.naming.JavaNameProvider;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */

public class FeatureJvmTypeProvider {
	
	public JavaNameProvider nameProvider;
	public Factory typeProviderFactory;

	@Inject
	public FeatureJvmTypeProvider(JavaNameProvider nameProvider,
			Factory typeProviderFactory) {
		this.nameProvider = nameProvider;
		this.typeProviderFactory = typeProviderFactory;
	}

	protected JvmType resolveJvmType(FeatureFile featureFile) {
		Feature feature = (Feature) featureFile.getXtendClass();
		return resolveJvmType(feature);
	}

	protected JvmType resolveJvmType(Feature feature) {
		Resource resource = feature.eResource();
		if(resource == null){
			return null;
		}
		ResourceSet resourceSet = resource.getResourceSet();
		if(resourceSet == null){
			return null;
		}
		String javaClassName = getTypeName(feature);
		IJvmTypeProvider typeProvider = typeProviderFactory.createTypeProvider(resourceSet);
		return typeProvider.findTypeByName(javaClassName);
	}

	protected String getTypeName(Feature feature) {
		String typeName = nameProvider.getClassName(feature);
		FeatureFile jnarioFile = getContainerOfType(feature, FeatureFile.class);
		String packageName = jnarioFile.getPackage();
		if(packageName == null)
			return typeName;
		return jnarioFile.getPackage() + "." + typeName;
	}
}