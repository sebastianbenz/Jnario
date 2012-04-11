package org.jnario.feature.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.jnario.feature.parser.antlr.FeatureParser;

public class CustomFeatureParser extends FeatureParser {
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		FeatureTokenSource tokenSource = new FeatureTokenSource();
		TokenSource delegate = super.createLexer(stream);
		tokenSource.setDelegate(delegate);
		return tokenSource;
	}


}
