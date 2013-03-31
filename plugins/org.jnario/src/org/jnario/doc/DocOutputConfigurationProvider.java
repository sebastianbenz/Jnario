/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc;

import java.util.Set;

import org.eclipse.xtend.core.compiler.XtendOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class DocOutputConfigurationProvider extends XtendOutputConfigurationProvider{

	public static final String DOC_OUTPUT = "DOC_OUTPUT";
	public static final String ASSET_OUTPUT = "ASSET_OUTPUT";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> configuration = super.getOutputConfigurations();
		OutputConfiguration docOutput = new OutputConfiguration(DOC_OUTPUT);
		docOutput.setDescription("Output folder for generated documentation files");
		docOutput.setOutputDirectory("doc-gen");
		docOutput.setOverrideExistingResources(true);
		docOutput.setCreateOutputDirectory(false);
		docOutput.setCanClearOutputDirectory(false);
		docOutput.setCleanUpDerivedResources(true);
		docOutput.setSetDerivedProperty(true);
		configuration.add(docOutput);
		
		OutputConfiguration assetOutput = new OutputConfiguration(ASSET_OUTPUT);
		assetOutput.setDescription("Output folder for generated css and js files");
		assetOutput.setOutputDirectory("doc-gen");
		assetOutput.setOverrideExistingResources(false);
		assetOutput.setCreateOutputDirectory(false);
		assetOutput.setCanClearOutputDirectory(false);
		assetOutput.setCleanUpDerivedResources(false);
		assetOutput.setSetDerivedProperty(false);
		configuration.add(assetOutput);
		
		return configuration;
	}
	
}
