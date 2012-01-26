package de.bmw.carit.jnario.maven;

import org.eclipse.xtext.xtend2.compiler.batch.Xtend2BatchCompiler;
import org.eclipse.xtext.xtend2.maven.XtendTestCompile;

import com.google.inject.Injector;

import de.bmw.carit.jnario.compiler.batch.SpecBatchCompiler;
import de.bmw.carit.jnario.spec.SpecStandaloneSetup;

/**
 * Goal which compiles Xtend2 test sources.
 *
 * @author Sebastian Benz
 * @goal testCompile
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 */
public class JnarioTestCompile extends XtendTestCompile {

	@Override
	protected Xtend2BatchCompiler createXtend2BatchCompiler() {
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SpecBatchCompiler.class);
	}
}
