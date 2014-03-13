package org.jnario.spec.parser;

import java.io.Reader;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtend.core.parser.ReaderCharStream;
import org.eclipse.xtend.core.parser.antlr.internal.FlexerFactory;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.parser.IParseResult;
import org.jnario.spec.parser.antlr.SpecParser;

import com.google.inject.Inject;

public class CustomSpecParser extends SpecParser {


	@Inject
	private FlexerFactory flexerFactory;
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		if (stream instanceof ReaderCharStream) {
			Reader reader = ((ReaderCharStream) stream).getReader();
			return flexerFactory.createTokenSource(reader);
		}
		throw new IllegalArgumentException(stream.getClass().getName());
	}
	
	@Override
	public IParseResult parse(ParserRule rule, Reader reader) {
		IParseResult parseResult = parse(rule.getName(), new ReaderCharStream(reader));
		return parseResult;
	}
	
	@Override
	public IParseResult doParse(Reader reader) {
		return parse(getDefaultRuleName(), new ReaderCharStream(reader));
	}
	
	@Override
	public IParseResult parse(RuleCall ruleCall, Reader reader, int initialLookAhead) {
		NodeModelBuilder builder = createNodeModelBuilder();
		builder.setForcedFirstGrammarElement(ruleCall);
		IParseResult parseResult = doParse(ruleCall.getRule().getName(), new ReaderCharStream(reader), builder, initialLookAhead);
		return parseResult;
	}
	
}
