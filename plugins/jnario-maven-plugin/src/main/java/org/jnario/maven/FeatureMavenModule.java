package org.jnario.maven;

import org.eclipse.xtend.maven.MavenTraceURIConverter;
import org.eclipse.xtext.generator.trace.ITraceURIConverter;
import org.jnario.feature.FeatureRuntimeModule;

public class FeatureMavenModule extends FeatureRuntimeModule{

	public Class<? extends ITraceURIConverter> bindITraceURIConverter() {
		return MavenTraceURIConverter.class;
	}
	
}
