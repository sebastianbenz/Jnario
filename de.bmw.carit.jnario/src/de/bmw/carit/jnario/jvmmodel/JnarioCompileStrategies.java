
package de.bmw.carit.jnario.jvmmodel;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.Functions;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class JnarioCompileStrategies {

	@Inject
	private Provider<GivenMethodCompileStrategy> givenMethodProvider;

	public Functions.Function1<ImportManager, CharSequence> forGivenMethod(XBlockExpression expression) {
		GivenMethodCompileStrategy strategy = givenMethodProvider.get();
		strategy.initialize(expression);
		return strategy;
	}

}
