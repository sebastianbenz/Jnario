package org.jnario.maven;

import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtend.core.maven.XtendTestCompile;

import com.google.inject.Injector;

import org.jnario.compiler.batch.SpecBatchCompiler;
import org.jnario.spec.SpecStandaloneSetup;

/**
 * Goal which compiles Xtend test sources.
 *
 * @author Sebastian Benz - Initial contribution and API
 * @goal testCompile
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 */
public class JnarioTestCompile extends XtendTestCompile {

	@Override
	protected XtendBatchCompiler createXtendBatchCompiler() {
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SpecBatchCompiler.class);
	}
}
