package org.jnario.maven;

import org.eclipse.xtend.maven.MavenTraceURIConverter;
import org.eclipse.xtext.generator.trace.ITraceURIConverter;
import org.jnario.feature.FeatureRuntimeModule;
import org.jnario.spec.SpecRuntimeModule;

import com.google.inject.Binder;

public class FeatureMavenModule extends FeatureRuntimeModule{

	public Class<? extends ITraceURIConverter> bindITraceURIConverter() {
		return MavenTraceURIConverter.class;
	}
	
}
