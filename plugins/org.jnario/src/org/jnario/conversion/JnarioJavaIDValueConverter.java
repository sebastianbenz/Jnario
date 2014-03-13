package org.jnario.conversion;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtend.core.conversion.JavaIDValueConverter;
import org.eclipse.xtext.parser.antlr.Lexer;

public class JnarioJavaIDValueConverter extends JavaIDValueConverter {

	protected TokenSource getTokenSource(String escapedValue) {
		Lexer result = getLexer();
		if (result == null)
			return null;
		result.setCharStream(new ANTLRStringStream(escapedValue));
		return result;
	}

}
