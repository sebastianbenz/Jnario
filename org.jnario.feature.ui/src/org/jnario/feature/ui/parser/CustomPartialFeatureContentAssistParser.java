package org.jnario.feature.ui.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.jnario.feature.parser.FeatureTokenSource;
import org.jnario.feature.ui.contentassist.antlr.PartialFeatureContentAssistParser;

public class CustomPartialFeatureContentAssistParser extends
		PartialFeatureContentAssistParser {
	
//	@Override
//	protected TokenSource createLexer(CharStream stream) {
//		FeatureTokenSource tokenSource = new FeatureTokenSource();
//		tokenSource.setDelegate(super.createLexer(stream));
//		return tokenSource;
//	}

}
