package org.jnario.spec;

import org.jnario.spec.parser.antlr.SpecParser;

public class SpecParserWithoutPartialParsing extends SpecParser {
	
	@Override
	protected boolean isReparseSupported() {
		return false;
	}


}
