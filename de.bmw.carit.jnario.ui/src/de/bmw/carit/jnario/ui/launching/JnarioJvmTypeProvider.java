/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.launching;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;

import com.google.inject.Inject;

import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.JnarioFile;
import de.bmw.carit.jnario.naming.JavaNameProvider;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */

public class JnarioJvmTypeProvider {
	
	public JavaNameProvider nameProvider;
	public Factory typeProviderFactory;

	@Inject
	public JnarioJvmTypeProvider(JavaNameProvider nameProvider,
			Factory typeProviderFactory) {
		this.nameProvider = nameProvider;
		this.typeProviderFactory = typeProviderFactory;
	}

	protected JvmType resolveJvmType(JnarioFile jnarioFile) {
		Feature feature = (Feature) jnarioFile.getXtendClass();
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
		String typeName = nameProvider.toFeatureSuiteJavaClassName(feature);
		JnarioFile jnarioFile = getContainerOfType(feature, JnarioFile.class);
		return jnarioFile.getPackage() + "." + typeName;
	}
}