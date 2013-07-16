package org.jnario.ui.smap;

import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.builder.smap.DebugSourceInstallingCompilationParticipant;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.jnario.util.FileExtensions;

import com.google.inject.Inject;

public class JnarioDebugSourceInstallingCompilationParticipant extends
		DebugSourceInstallingCompilationParticipant {

	@Inject
	private IResourceServiceProvider.Registry serviceProviderRegistry;
	
	@Override
	protected OutputConfiguration findOutputConfiguration(URI dslSourceFile,
			IFile generatedJavaFile) {
		if(!FileExtensions.isJnarioSpec(dslSourceFile)){
			return super.findOutputConfiguration(dslSourceFile, generatedJavaFile);
		}
		IResourceServiceProvider serviceProvider = serviceProviderRegistry.getResourceServiceProvider(dslSourceFile);
		if (serviceProvider == null)
			return null;
		EclipseOutputConfigurationProvider cfgProvider = serviceProvider.get(EclipseOutputConfigurationProvider.class);
		IProject project = generatedJavaFile.getProject();
		Set<OutputConfiguration> configurations = cfgProvider.getOutputConfigurations(project);
		if (!configurations.isEmpty()) {
			if (configurations.size() == 1)
				return configurations.iterator().next();
			for (OutputConfiguration out : configurations) {
				if(IFileSystemAccess.DEFAULT_OUTPUT.equals(out.getName())){
					return out;
				}
			}
		}
		return null;
	}

}
