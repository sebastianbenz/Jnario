package org.jnario.maven;

import org.eclipse.xtend.maven.MavenTraceURIConverter;
import org.eclipse.xtext.generator.trace.ITraceURIConverter;
import org.jnario.spec.SpecRuntimeModule;

public class SpecMavenModule extends SpecRuntimeModule{

	public Class<? extends ITraceURIConverter> bindITraceURIConverter() {
		return MavenTraceURIConverter.class;
	}
	
}