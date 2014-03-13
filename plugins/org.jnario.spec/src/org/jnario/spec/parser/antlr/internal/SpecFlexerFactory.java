package org.jnario.spec.parser.antlr.internal;

import java.io.Reader;

import org.eclipse.xtend.core.parser.InternalFlexer;
import org.eclipse.xtend.core.parser.antlr.internal.FlexTokenSource;
import org.eclipse.xtend.core.parser.antlr.internal.FlexerFactory;

public class SpecFlexerFactory extends FlexerFactory {
	
	public InternalFlexer createFlexer(Reader reader) {
//		return new org.jnario.spec.parser.antlr.internal.InternalSpecFlexer(reader);
		return null;
	}
	public FlexTokenSource createTokenSource(Reader reader) {
		return new FlexTokenSource(createFlexer(reader)){};
	}

}
