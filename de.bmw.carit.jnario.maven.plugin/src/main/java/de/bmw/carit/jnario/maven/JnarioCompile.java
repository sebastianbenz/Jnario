package de.bmw.carit.jnario.maven;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import org.eclipse.xtext.xtend2.compiler.batch.Xtend2BatchCompiler;
import org.eclipse.xtext.xtend2.maven.XtendCompile;


/**
 * Goal which compiles Jnario sources.
 * 
 * @author Sebastian Benz
 * @goal compile
 * @phase generate-sources
 * @requiresDependencyResolution compile
 */
public class JnarioCompile extends XtendCompile {

	@Override
	protected Xtend2BatchCompiler createXtend2BatchCompiler() {
		SpecialAction
	}
	
}
