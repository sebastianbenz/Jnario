package org.jnario.maven;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtend.core.maven.XtendCompile;

import com.google.inject.Injector;

import org.jnario.compiler.batch.SpecBatchCompiler;
import org.jnario.spec.SpecStandaloneSetup;


/**
 * Goal which compiles Jnario sources.
 * 
 * @author Sebastian Benz - Initial contribution and API
 * @goal compile
 * @phase generate-sources
 * @requiresDependencyResolution compile
 */
public class JnarioCompile extends XtendCompile {

	@Override
	protected XtendBatchCompiler createXtendBatchCompiler() {
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SpecBatchCompiler.class);
	}
	
}
