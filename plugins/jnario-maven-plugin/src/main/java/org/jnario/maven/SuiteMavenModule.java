package org.jnario.maven;

import org.eclipse.xtend.maven.MavenTraceURIConverter;
import org.eclipse.xtext.generator.trace.ITraceURIConverter;
import org.jnario.suite.SuiteRuntimeModule;

public class SuiteMavenModule extends SuiteRuntimeModule{

	public Class<? extends ITraceURIConverter> bindITraceURIConverter() {
		return MavenTraceURIConverter.class;
	}
	
}
